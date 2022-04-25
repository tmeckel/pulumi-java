// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.softwareplan.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHybridUseBenefitArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridUseBenefitArgs Empty = new GetHybridUseBenefitArgs();

    /**
     * This is a unique identifier for a plan. Should be a guid.
     * 
     */
    @Import(name="planId", required=true)
    private String planId;

    /**
     * @return This is a unique identifier for a plan. Should be a guid.
     * 
     */
    public String planId() {
        return this.planId;
    }

    /**
     * The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
     * 
     */
    public String scope() {
        return this.scope;
    }

    private GetHybridUseBenefitArgs() {}

    private GetHybridUseBenefitArgs(GetHybridUseBenefitArgs $) {
        this.planId = $.planId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridUseBenefitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridUseBenefitArgs $;

        public Builder() {
            $ = new GetHybridUseBenefitArgs();
        }

        public Builder(GetHybridUseBenefitArgs defaults) {
            $ = new GetHybridUseBenefitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planId This is a unique identifier for a plan. Should be a guid.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param scope The scope at which the operation is performed. This is limited to Microsoft.Compute/virtualMachines and Microsoft.Compute/hostGroups/hosts for now
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetHybridUseBenefitArgs build() {
            $.planId = Objects.requireNonNull($.planId, "expected parameter 'planId' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
