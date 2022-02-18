// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the Maintenance exclusion option.
 * 
 */
public final class MaintenanceExclusionOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaintenanceExclusionOptionsResponse Empty = new MaintenanceExclusionOptionsResponse();

    /**
     * Scope specifies the upgrade scope which upgrades are blocked by the exclusion.
     * 
     */
    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    public MaintenanceExclusionOptionsResponse(String scope) {
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private MaintenanceExclusionOptionsResponse() {
        this.scope = null;
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

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public MaintenanceExclusionOptionsResponse build() {
            return new MaintenanceExclusionOptionsResponse(scope);
        }
    }
}
