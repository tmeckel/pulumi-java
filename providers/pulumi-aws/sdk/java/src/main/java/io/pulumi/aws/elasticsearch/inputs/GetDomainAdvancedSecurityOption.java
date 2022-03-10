// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetDomainAdvancedSecurityOption extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainAdvancedSecurityOption Empty = new GetDomainAdvancedSecurityOption();

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Whether the internal user database is enabled.
     * 
     */
    @InputImport(name="internalUserDatabaseEnabled", required=true)
      private final Boolean internalUserDatabaseEnabled;

    public Boolean getInternalUserDatabaseEnabled() {
        return this.internalUserDatabaseEnabled;
    }

    public GetDomainAdvancedSecurityOption(
        Boolean enabled,
        Boolean internalUserDatabaseEnabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.internalUserDatabaseEnabled = Objects.requireNonNull(internalUserDatabaseEnabled, "expected parameter 'internalUserDatabaseEnabled' to be non-null");
    }

    private GetDomainAdvancedSecurityOption() {
        this.enabled = null;
        this.internalUserDatabaseEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainAdvancedSecurityOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Boolean internalUserDatabaseEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainAdvancedSecurityOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.internalUserDatabaseEnabled = defaults.internalUserDatabaseEnabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder internalUserDatabaseEnabled(Boolean internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = Objects.requireNonNull(internalUserDatabaseEnabled);
            return this;
        }
        public GetDomainAdvancedSecurityOption build() {
            return new GetDomainAdvancedSecurityOption(enabled, internalUserDatabaseEnabled);
        }
    }
}
