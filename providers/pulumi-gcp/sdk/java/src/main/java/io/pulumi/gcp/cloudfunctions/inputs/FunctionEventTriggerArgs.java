// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerFailurePolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionEventTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEventTriggerArgs Empty = new FunctionEventTriggerArgs();

    /**
     * The type of event to observe. For example: `"google.storage.object.finalize"`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
     * full reference of accepted triggers.
     * 
     */
    @InputImport(name="eventType", required=true)
      private final Input<String> eventType;

    public Input<String> getEventType() {
        return this.eventType;
    }

    /**
     * Specifies policy for failed executions. Structure is documented below.
     * 
     */
    @InputImport(name="failurePolicy")
      private final @Nullable Input<FunctionEventTriggerFailurePolicyArgs> failurePolicy;

    public Input<FunctionEventTriggerFailurePolicyArgs> getFailurePolicy() {
        return this.failurePolicy == null ? Input.empty() : this.failurePolicy;
    }

    /**
     * Required. The name or partial URI of the resource from
     * which to observe events. For example, `"myBucket"` or `"projects/my-project/topics/my-topic"`
     * 
     */
    @InputImport(name="resource", required=true)
      private final Input<String> resource;

    public Input<String> getResource() {
        return this.resource;
    }

    public FunctionEventTriggerArgs(
        Input<String> eventType,
        @Nullable Input<FunctionEventTriggerFailurePolicyArgs> failurePolicy,
        Input<String> resource) {
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.failurePolicy = failurePolicy;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private FunctionEventTriggerArgs() {
        this.eventType = Input.empty();
        this.failurePolicy = Input.empty();
        this.resource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> eventType;
        private @Nullable Input<FunctionEventTriggerFailurePolicyArgs> failurePolicy;
        private Input<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.resource = defaults.resource;
        }

        public Builder eventType(Input<String> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder eventType(String eventType) {
            this.eventType = Input.of(Objects.requireNonNull(eventType));
            return this;
        }

        public Builder failurePolicy(@Nullable Input<FunctionEventTriggerFailurePolicyArgs> failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        public Builder failurePolicy(@Nullable FunctionEventTriggerFailurePolicyArgs failurePolicy) {
            this.failurePolicy = Input.ofNullable(failurePolicy);
            return this;
        }

        public Builder resource(Input<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder resource(String resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }
        public FunctionEventTriggerArgs build() {
            return new FunctionEventTriggerArgs(eventType, failurePolicy, resource);
        }
    }
}
