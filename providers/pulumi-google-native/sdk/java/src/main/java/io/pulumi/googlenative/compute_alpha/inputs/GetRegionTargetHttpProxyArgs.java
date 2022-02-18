// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionTargetHttpProxyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionTargetHttpProxyArgs Empty = new GetRegionTargetHttpProxyArgs();

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="region", required=true)
    private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="targetHttpProxy", required=true)
    private final String targetHttpProxy;

    public String getTargetHttpProxy() {
        return this.targetHttpProxy;
    }

    public GetRegionTargetHttpProxyArgs(
        @Nullable String project,
        String region,
        String targetHttpProxy) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.targetHttpProxy = Objects.requireNonNull(targetHttpProxy, "expected parameter 'targetHttpProxy' to be non-null");
    }

    private GetRegionTargetHttpProxyArgs() {
        this.project = null;
        this.region = null;
        this.targetHttpProxy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionTargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String targetHttpProxy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionTargetHttpProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.targetHttpProxy = defaults.targetHttpProxy;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setTargetHttpProxy(String targetHttpProxy) {
            this.targetHttpProxy = Objects.requireNonNull(targetHttpProxy);
            return this;
        }

        public GetRegionTargetHttpProxyArgs build() {
            return new GetRegionTargetHttpProxyArgs(project, region, targetHttpProxy);
        }
    }
}
