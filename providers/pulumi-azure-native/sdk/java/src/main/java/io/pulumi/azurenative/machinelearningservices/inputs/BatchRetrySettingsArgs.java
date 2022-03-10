// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Retry settings for a batch inference operation.
 * 
 */
public final class BatchRetrySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchRetrySettingsArgs Empty = new BatchRetrySettingsArgs();

    /**
     * Maximum retry count for a mini-batch
     * 
     */
    @InputImport(name="maxRetries")
      private final @Nullable Input<Integer> maxRetries;

    public Input<Integer> getMaxRetries() {
        return this.maxRetries == null ? Input.empty() : this.maxRetries;
    }

    /**
     * Invocation timeout for a mini-batch, in ISO 8601 format.
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public BatchRetrySettingsArgs(
        @Nullable Input<Integer> maxRetries,
        @Nullable Input<String> timeout) {
        this.maxRetries = maxRetries;
        this.timeout = timeout;
    }

    private BatchRetrySettingsArgs() {
        this.maxRetries = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchRetrySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxRetries;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchRetrySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRetries = defaults.maxRetries;
    	      this.timeout = defaults.timeout;
        }

        public Builder maxRetries(@Nullable Input<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Input.ofNullable(maxRetries);
            return this;
        }

        public Builder timeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public BatchRetrySettingsArgs build() {
            return new BatchRetrySettingsArgs(maxRetries, timeout);
        }
    }
}
