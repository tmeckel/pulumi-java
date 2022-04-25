// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActivityPolicyResponse {
    /**
     * @return Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    private final @Nullable Object retry;
    /**
     * @return Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
     */
    private final @Nullable Integer retryIntervalInSeconds;
    /**
     * @return When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    private final @Nullable Boolean secureInput;
    /**
     * @return When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    private final @Nullable Boolean secureOutput;
    /**
     * @return Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object timeout;

    @CustomType.Constructor
    private ActivityPolicyResponse(
        @CustomType.Parameter("retry") @Nullable Object retry,
        @CustomType.Parameter("retryIntervalInSeconds") @Nullable Integer retryIntervalInSeconds,
        @CustomType.Parameter("secureInput") @Nullable Boolean secureInput,
        @CustomType.Parameter("secureOutput") @Nullable Boolean secureOutput,
        @CustomType.Parameter("timeout") @Nullable Object timeout) {
        this.retry = retry;
        this.retryIntervalInSeconds = retryIntervalInSeconds;
        this.secureInput = secureInput;
        this.secureOutput = secureOutput;
        this.timeout = timeout;
    }

    /**
     * @return Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Object> retry() {
        return Optional.ofNullable(this.retry);
    }
    /**
     * @return Interval between each retry attempt (in seconds). The default is 30 sec.
     * 
     */
    public Optional<Integer> retryIntervalInSeconds() {
        return Optional.ofNullable(this.retryIntervalInSeconds);
    }
    /**
     * @return When set to true, Input from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    public Optional<Boolean> secureInput() {
        return Optional.ofNullable(this.secureInput);
    }
    /**
     * @return When set to true, Output from activity is considered as secure and will not be logged to monitoring.
     * 
     */
    public Optional<Boolean> secureOutput() {
        return Optional.ofNullable(this.secureOutput);
    }
    /**
     * @return Specifies the timeout for the activity to run. The default timeout is 7 days. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object retry;
        private @Nullable Integer retryIntervalInSeconds;
        private @Nullable Boolean secureInput;
        private @Nullable Boolean secureOutput;
        private @Nullable Object timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
    	      this.retryIntervalInSeconds = defaults.retryIntervalInSeconds;
    	      this.secureInput = defaults.secureInput;
    	      this.secureOutput = defaults.secureOutput;
    	      this.timeout = defaults.timeout;
        }

        public Builder retry(@Nullable Object retry) {
            this.retry = retry;
            return this;
        }
        public Builder retryIntervalInSeconds(@Nullable Integer retryIntervalInSeconds) {
            this.retryIntervalInSeconds = retryIntervalInSeconds;
            return this;
        }
        public Builder secureInput(@Nullable Boolean secureInput) {
            this.secureInput = secureInput;
            return this;
        }
        public Builder secureOutput(@Nullable Boolean secureOutput) {
            this.secureOutput = secureOutput;
            return this;
        }
        public Builder timeout(@Nullable Object timeout) {
            this.timeout = timeout;
            return this;
        }        public ActivityPolicyResponse build() {
            return new ActivityPolicyResponse(retry, retryIntervalInSeconds, secureInput, secureOutput, timeout);
        }
    }
}
