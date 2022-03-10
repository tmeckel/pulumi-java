// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotAliasCloudWatchLogGroupLogDestination;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Amazon CloudWatch Logs destination log group for conversation text logs.
 * 
 */
public final class BotAliasTextLogDestination extends io.pulumi.resources.InvokeArgs {

    public static final BotAliasTextLogDestination Empty = new BotAliasTextLogDestination();

    @InputImport(name="cloudWatch")
      private final @Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch;

    public Optional<BotAliasCloudWatchLogGroupLogDestination> getCloudWatch() {
        return this.cloudWatch == null ? Optional.empty() : Optional.ofNullable(this.cloudWatch);
    }

    public BotAliasTextLogDestination(@Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch) {
        this.cloudWatch = cloudWatch;
    }

    private BotAliasTextLogDestination() {
        this.cloudWatch = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasTextLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasTextLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatch = defaults.cloudWatch;
        }

        public Builder cloudWatch(@Nullable BotAliasCloudWatchLogGroupLogDestination cloudWatch) {
            this.cloudWatch = cloudWatch;
            return this;
        }
        public BotAliasTextLogDestination build() {
            return new BotAliasTextLogDestination(cloudWatch);
        }
    }
}
