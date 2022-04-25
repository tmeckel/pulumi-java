// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceExclusionOptionsResponse {
    /**
     * @return Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    private final String scope;

    @CustomType.Constructor
    private MaintenanceExclusionOptionsResponse(@CustomType.Parameter("scope") String scope) {
        this.scope = scope;
    }

    /**
     * @return Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    public String scope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceExclusionOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceExclusionOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public MaintenanceExclusionOptionsResponse build() {
            return new MaintenanceExclusionOptionsResponse(scope);
        }
    }
}
