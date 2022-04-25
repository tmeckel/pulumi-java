// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class FunctionEventTriggerFailurePolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEventTriggerFailurePolicyGetArgs Empty = new FunctionEventTriggerFailurePolicyGetArgs();

    /**
     * Whether the function should be retried on failure. Defaults to `false`.
     * 
     */
    @Import(name="retry", required=true)
    private Output<Boolean> retry;

    /**
     * @return Whether the function should be retried on failure. Defaults to `false`.
     * 
     */
    public Output<Boolean> retry() {
        return this.retry;
    }

    private FunctionEventTriggerFailurePolicyGetArgs() {}

    private FunctionEventTriggerFailurePolicyGetArgs(FunctionEventTriggerFailurePolicyGetArgs $) {
        this.retry = $.retry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEventTriggerFailurePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEventTriggerFailurePolicyGetArgs $;

        public Builder() {
            $ = new FunctionEventTriggerFailurePolicyGetArgs();
        }

        public Builder(FunctionEventTriggerFailurePolicyGetArgs defaults) {
            $ = new FunctionEventTriggerFailurePolicyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param retry Whether the function should be retried on failure. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder retry(Output<Boolean> retry) {
            $.retry = retry;
            return this;
        }

        /**
         * @param retry Whether the function should be retried on failure. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder retry(Boolean retry) {
            return retry(Output.of(retry));
        }

        public FunctionEventTriggerFailurePolicyGetArgs build() {
            $.retry = Objects.requireNonNull($.retry, "expected parameter 'retry' to be non-null");
            return $;
        }
    }

}
