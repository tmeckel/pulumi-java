// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ShieldedInstanceIntegrityPolicyResponse {
    /**
     * @return Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
     * 
     */
    private final Boolean updateAutoLearnPolicy;

    @CustomType.Constructor
    private ShieldedInstanceIntegrityPolicyResponse(@CustomType.Parameter("updateAutoLearnPolicy") Boolean updateAutoLearnPolicy) {
        this.updateAutoLearnPolicy = updateAutoLearnPolicy;
    }

    /**
     * @return Updates the integrity policy baseline using the measurements from the VM instance&#39;s most recent boot.
     * 
     */
    public Boolean updateAutoLearnPolicy() {
        return this.updateAutoLearnPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShieldedInstanceIntegrityPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean updateAutoLearnPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ShieldedInstanceIntegrityPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateAutoLearnPolicy = defaults.updateAutoLearnPolicy;
        }

        public Builder updateAutoLearnPolicy(Boolean updateAutoLearnPolicy) {
            this.updateAutoLearnPolicy = Objects.requireNonNull(updateAutoLearnPolicy);
            return this;
        }        public ShieldedInstanceIntegrityPolicyResponse build() {
            return new ShieldedInstanceIntegrityPolicyResponse(updateAutoLearnPolicy);
        }
    }
}
