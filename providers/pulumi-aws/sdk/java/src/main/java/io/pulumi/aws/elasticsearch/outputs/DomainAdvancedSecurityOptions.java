// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.DomainAdvancedSecurityOptionsMasterUserOptions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainAdvancedSecurityOptions {
    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
     */
    private final Boolean enabled;
    /**
     * Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
     * 
     */
    private final @Nullable Boolean internalUserDatabaseEnabled;
    /**
     * Configuration block for the main user. Detailed below.
     * 
     */
    private final @Nullable DomainAdvancedSecurityOptionsMasterUserOptions masterUserOptions;

    @OutputCustomType.Constructor
    private DomainAdvancedSecurityOptions(
        @OutputCustomType.Parameter("enabled") Boolean enabled,
        @OutputCustomType.Parameter("internalUserDatabaseEnabled") @Nullable Boolean internalUserDatabaseEnabled,
        @OutputCustomType.Parameter("masterUserOptions") @Nullable DomainAdvancedSecurityOptionsMasterUserOptions masterUserOptions) {
        this.enabled = enabled;
        this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
        this.masterUserOptions = masterUserOptions;
    }

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
     * 
    */
    public Optional<Boolean> getInternalUserDatabaseEnabled() {
        return Optional.ofNullable(this.internalUserDatabaseEnabled);
    }
    /**
     * Configuration block for the main user. Detailed below.
     * 
    */
    public Optional<DomainAdvancedSecurityOptionsMasterUserOptions> getMasterUserOptions() {
        return Optional.ofNullable(this.masterUserOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAdvancedSecurityOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable Boolean internalUserDatabaseEnabled;
        private @Nullable DomainAdvancedSecurityOptionsMasterUserOptions masterUserOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAdvancedSecurityOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.internalUserDatabaseEnabled = defaults.internalUserDatabaseEnabled;
    	      this.masterUserOptions = defaults.masterUserOptions;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder internalUserDatabaseEnabled(@Nullable Boolean internalUserDatabaseEnabled) {
            this.internalUserDatabaseEnabled = internalUserDatabaseEnabled;
            return this;
        }

        public Builder masterUserOptions(@Nullable DomainAdvancedSecurityOptionsMasterUserOptions masterUserOptions) {
            this.masterUserOptions = masterUserOptions;
            return this;
        }
        public DomainAdvancedSecurityOptions build() {
            return new DomainAdvancedSecurityOptions(enabled, internalUserDatabaseEnabled, masterUserOptions);
        }
    }
}
