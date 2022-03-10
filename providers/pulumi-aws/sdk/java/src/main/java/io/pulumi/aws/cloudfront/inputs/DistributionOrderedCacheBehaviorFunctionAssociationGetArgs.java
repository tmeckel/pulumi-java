// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionOrderedCacheBehaviorFunctionAssociationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorFunctionAssociationGetArgs Empty = new DistributionOrderedCacheBehaviorFunctionAssociationGetArgs();

    /**
     * The specific event to trigger this function.
     * Valid values: `viewer-request` or `viewer-response`
     * 
     */
    @InputImport(name="eventType", required=true)
      private final Input<String> eventType;

    public Input<String> getEventType() {
        return this.eventType;
    }

    /**
     * ARN of the Cloudfront function.
     * 
     */
    @InputImport(name="functionArn", required=true)
      private final Input<String> functionArn;

    public Input<String> getFunctionArn() {
        return this.functionArn;
    }

    public DistributionOrderedCacheBehaviorFunctionAssociationGetArgs(
        Input<String> eventType,
        Input<String> functionArn) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
    }

    private DistributionOrderedCacheBehaviorFunctionAssociationGetArgs() {
        this.eventType = Input.empty();
        this.functionArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorFunctionAssociationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> eventType;
        private Input<String> functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorFunctionAssociationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.functionArn = defaults.functionArn;
        }

        public Builder eventType(Input<String> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder eventType(String eventType) {
            this.eventType = Input.of(Objects.requireNonNull(eventType));
            return this;
        }

        public Builder functionArn(Input<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder functionArn(String functionArn) {
            this.functionArn = Input.of(Objects.requireNonNull(functionArn));
            return this;
        }
        public DistributionOrderedCacheBehaviorFunctionAssociationGetArgs build() {
            return new DistributionOrderedCacheBehaviorFunctionAssociationGetArgs(eventType, functionArn);
        }
    }
}
