// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryEventNotificationConfigItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryEventNotificationConfigItemArgs Empty = new RegistryEventNotificationConfigItemArgs();

    /**
     * PubSub topic name to publish device events.
     * 
     */
    @Import(name="pubsubTopicName", required=true)
      private final Output<String> pubsubTopicName;

    public Output<String> getPubsubTopicName() {
        return this.pubsubTopicName;
    }

    /**
     * If the subfolder name matches this string exactly, this
     * configuration will be used. The string must not include the
     * leading '/' character. If empty, all strings are matched. Empty
     * value can only be used for the last `event_notification_configs`
     * item.
     * 
     */
    @Import(name="subfolderMatches")
      private final @Nullable Output<String> subfolderMatches;

    public Output<String> getSubfolderMatches() {
        return this.subfolderMatches == null ? Codegen.empty() : this.subfolderMatches;
    }

    public RegistryEventNotificationConfigItemArgs(
        Output<String> pubsubTopicName,
        @Nullable Output<String> subfolderMatches) {
        this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName, "expected parameter 'pubsubTopicName' to be non-null");
        this.subfolderMatches = subfolderMatches;
    }

    private RegistryEventNotificationConfigItemArgs() {
        this.pubsubTopicName = Codegen.empty();
        this.subfolderMatches = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryEventNotificationConfigItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> pubsubTopicName;
        private @Nullable Output<String> subfolderMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryEventNotificationConfigItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsubTopicName = defaults.pubsubTopicName;
    	      this.subfolderMatches = defaults.subfolderMatches;
        }

        public Builder pubsubTopicName(Output<String> pubsubTopicName) {
            this.pubsubTopicName = Objects.requireNonNull(pubsubTopicName);
            return this;
        }
        public Builder pubsubTopicName(String pubsubTopicName) {
            this.pubsubTopicName = Output.of(Objects.requireNonNull(pubsubTopicName));
            return this;
        }
        public Builder subfolderMatches(@Nullable Output<String> subfolderMatches) {
            this.subfolderMatches = subfolderMatches;
            return this;
        }
        public Builder subfolderMatches(@Nullable String subfolderMatches) {
            this.subfolderMatches = Codegen.ofNullable(subfolderMatches);
            return this;
        }        public RegistryEventNotificationConfigItemArgs build() {
            return new RegistryEventNotificationConfigItemArgs(pubsubTopicName, subfolderMatches);
        }
    }
}
