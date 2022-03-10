// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ShieldedInstanceIntegrityPolicyResponse {
    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
     */
    private final Boolean updateAutoLearnPolicy;

    @OutputCustomType.Constructor
    private ShieldedInstanceIntegrityPolicyResponse(@OutputCustomType.Parameter("updateAutoLearnPolicy") Boolean updateAutoLearnPolicy) {
        this.updateAutoLearnPolicy = updateAutoLearnPolicy;
    }

    /**
     * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
     * 
    */
    public Boolean getUpdateAutoLearnPolicy() {
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
        }
        public ShieldedInstanceIntegrityPolicyResponse build() {
            return new ShieldedInstanceIntegrityPolicyResponse(updateAutoLearnPolicy);
        }
    }
}
