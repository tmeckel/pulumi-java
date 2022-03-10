// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Notification medium for users to get alerted for events that occur in application profile. We support SNS topic as a notification channel.
 * 
 */
public final class ProfilingGroupChannel extends io.pulumi.resources.InvokeArgs {

    public static final ProfilingGroupChannel Empty = new ProfilingGroupChannel();

    @InputImport(name="channelId")
      private final @Nullable String channelId;

    public Optional<String> getChannelId() {
        return this.channelId == null ? Optional.empty() : Optional.ofNullable(this.channelId);
    }

    @InputImport(name="channelUri", required=true)
      private final String channelUri;

    public String getChannelUri() {
        return this.channelUri;
    }

    public ProfilingGroupChannel(
        @Nullable String channelId,
        String channelUri) {
        this.channelId = channelId;
        this.channelUri = Objects.requireNonNull(channelUri, "expected parameter 'channelUri' to be non-null");
    }

    private ProfilingGroupChannel() {
        this.channelId = null;
        this.channelUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfilingGroupChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelId;
        private String channelUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfilingGroupChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.channelUri = defaults.channelUri;
        }

        public Builder channelId(@Nullable String channelId) {
            this.channelId = channelId;
            return this;
        }

        public Builder channelUri(String channelUri) {
            this.channelUri = Objects.requireNonNull(channelUri);
            return this;
        }
        public ProfilingGroupChannel build() {
            return new ProfilingGroupChannel(channelId, channelUri);
        }
    }
}
