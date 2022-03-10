// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotResponseSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information for updating the user on the progress of fulfilling an intent.
 * 
 */
public final class BotPostFulfillmentStatusSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotPostFulfillmentStatusSpecificationArgs Empty = new BotPostFulfillmentStatusSpecificationArgs();

    @InputImport(name="failureResponse")
      private final @Nullable Input<BotResponseSpecificationArgs> failureResponse;

    public Input<BotResponseSpecificationArgs> getFailureResponse() {
        return this.failureResponse == null ? Input.empty() : this.failureResponse;
    }

    @InputImport(name="successResponse")
      private final @Nullable Input<BotResponseSpecificationArgs> successResponse;

    public Input<BotResponseSpecificationArgs> getSuccessResponse() {
        return this.successResponse == null ? Input.empty() : this.successResponse;
    }

    @InputImport(name="timeoutResponse")
      private final @Nullable Input<BotResponseSpecificationArgs> timeoutResponse;

    public Input<BotResponseSpecificationArgs> getTimeoutResponse() {
        return this.timeoutResponse == null ? Input.empty() : this.timeoutResponse;
    }

    public BotPostFulfillmentStatusSpecificationArgs(
        @Nullable Input<BotResponseSpecificationArgs> failureResponse,
        @Nullable Input<BotResponseSpecificationArgs> successResponse,
        @Nullable Input<BotResponseSpecificationArgs> timeoutResponse) {
        this.failureResponse = failureResponse;
        this.successResponse = successResponse;
        this.timeoutResponse = timeoutResponse;
    }

    private BotPostFulfillmentStatusSpecificationArgs() {
        this.failureResponse = Input.empty();
        this.successResponse = Input.empty();
        this.timeoutResponse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPostFulfillmentStatusSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotResponseSpecificationArgs> failureResponse;
        private @Nullable Input<BotResponseSpecificationArgs> successResponse;
        private @Nullable Input<BotResponseSpecificationArgs> timeoutResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPostFulfillmentStatusSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureResponse = defaults.failureResponse;
    	      this.successResponse = defaults.successResponse;
    	      this.timeoutResponse = defaults.timeoutResponse;
        }

        public Builder failureResponse(@Nullable Input<BotResponseSpecificationArgs> failureResponse) {
            this.failureResponse = failureResponse;
            return this;
        }

        public Builder failureResponse(@Nullable BotResponseSpecificationArgs failureResponse) {
            this.failureResponse = Input.ofNullable(failureResponse);
            return this;
        }

        public Builder successResponse(@Nullable Input<BotResponseSpecificationArgs> successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public Builder successResponse(@Nullable BotResponseSpecificationArgs successResponse) {
            this.successResponse = Input.ofNullable(successResponse);
            return this;
        }

        public Builder timeoutResponse(@Nullable Input<BotResponseSpecificationArgs> timeoutResponse) {
            this.timeoutResponse = timeoutResponse;
            return this;
        }

        public Builder timeoutResponse(@Nullable BotResponseSpecificationArgs timeoutResponse) {
            this.timeoutResponse = Input.ofNullable(timeoutResponse);
            return this;
        }
        public BotPostFulfillmentStatusSpecificationArgs build() {
            return new BotPostFulfillmentStatusSpecificationArgs(failureResponse, successResponse, timeoutResponse);
        }
    }
}
