// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyCloudArmorConfigResponse {
    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
     */
    private final Boolean enableMl;

    @OutputCustomType.Constructor
    private SecurityPolicyCloudArmorConfigResponse(@OutputCustomType.Parameter("enableMl") Boolean enableMl) {
        this.enableMl = enableMl;
    }

    /**
     * If set to true, enables Cloud Armor Machine Learning.
     * 
    */
    public Boolean getEnableMl() {
        return this.enableMl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyCloudArmorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableMl;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyCloudArmorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableMl = defaults.enableMl;
        }

        public Builder enableMl(Boolean enableMl) {
            this.enableMl = Objects.requireNonNull(enableMl);
            return this;
        }
        public SecurityPolicyCloudArmorConfigResponse build() {
            return new SecurityPolicyCloudArmorConfigResponse(enableMl);
        }
    }
}
