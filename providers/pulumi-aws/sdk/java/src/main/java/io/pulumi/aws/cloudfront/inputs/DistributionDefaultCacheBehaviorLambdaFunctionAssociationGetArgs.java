// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs Empty = new DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs();

    /**
     * The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    @Import(name="eventType", required=true)
      private final Output<String> eventType;

    public Output<String> getEventType() {
        return this.eventType;
    }

    /**
     * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
     * 
     */
    @Import(name="includeBody")
      private final @Nullable Output<Boolean> includeBody;

    public Output<Boolean> getIncludeBody() {
        return this.includeBody == null ? Codegen.empty() : this.includeBody;
    }

    /**
     * ARN of the Lambda function.
     * 
     */
    @Import(name="lambdaArn", required=true)
      private final Output<String> lambdaArn;

    public Output<String> getLambdaArn() {
        return this.lambdaArn;
    }

    public DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs(
        Output<String> eventType,
        @Nullable Output<Boolean> includeBody,
        Output<String> lambdaArn) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.includeBody = includeBody;
        this.lambdaArn = Objects.requireNonNull(lambdaArn, "expected parameter 'lambdaArn' to be non-null");
    }

    private DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs() {
        this.eventType = Codegen.empty();
        this.includeBody = Codegen.empty();
        this.lambdaArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> eventType;
        private @Nullable Output<Boolean> includeBody;
        private Output<String> lambdaArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.includeBody = defaults.includeBody;
    	      this.lambdaArn = defaults.lambdaArn;
        }

        public Builder eventType(Output<String> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public Builder eventType(String eventType) {
            this.eventType = Output.of(Objects.requireNonNull(eventType));
            return this;
        }
        public Builder includeBody(@Nullable Output<Boolean> includeBody) {
            this.includeBody = includeBody;
            return this;
        }
        public Builder includeBody(@Nullable Boolean includeBody) {
            this.includeBody = Codegen.ofNullable(includeBody);
            return this;
        }
        public Builder lambdaArn(Output<String> lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }
        public Builder lambdaArn(String lambdaArn) {
            this.lambdaArn = Output.of(Objects.requireNonNull(lambdaArn));
            return this;
        }        public DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs build() {
            return new DistributionDefaultCacheBehaviorLambdaFunctionAssociationGetArgs(eventType, includeBody, lambdaArn);
        }
    }
}
