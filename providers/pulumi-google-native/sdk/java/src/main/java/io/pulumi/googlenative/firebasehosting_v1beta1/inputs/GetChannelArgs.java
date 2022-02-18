// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChannelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetChannelArgs Empty = new GetChannelArgs();

    @InputImport(name="channelId", required=true)
    private final String channelId;

    public String getChannelId() {
        return this.channelId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="siteId", required=true)
    private final String siteId;

    public String getSiteId() {
        return this.siteId;
    }

    public GetChannelArgs(
        String channelId,
        @Nullable String project,
        String siteId) {
        this.channelId = Objects.requireNonNull(channelId, "expected parameter 'channelId' to be non-null");
        this.project = project;
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
    }

    private GetChannelArgs() {
        this.channelId = null;
        this.project = null;
        this.siteId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelId;
        private @Nullable String project;
        private String siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.project = defaults.project;
    	      this.siteId = defaults.siteId;
        }

        public Builder setChannelId(String channelId) {
            this.channelId = Objects.requireNonNull(channelId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public GetChannelArgs build() {
            return new GetChannelArgs(channelId, project, siteId);
        }
    }
}
