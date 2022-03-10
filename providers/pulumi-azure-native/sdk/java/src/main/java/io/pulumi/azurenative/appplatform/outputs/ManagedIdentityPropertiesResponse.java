// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedIdentityPropertiesResponse {
    /**
     * Principal Id
     * 
     */
    private final @Nullable String principalId;
    /**
     * Tenant Id
     * 
     */
    private final @Nullable String tenantId;
    /**
     * Type of the managed identity
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private ManagedIdentityPropertiesResponse(
        @OutputCustomType.Parameter("principalId") @Nullable String principalId,
        @OutputCustomType.Parameter("tenantId") @Nullable String tenantId,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * Principal Id
     * 
    */
    public Optional<String> getPrincipalId() {
        return Optional.ofNullable(this.principalId);
    }
    /**
     * Tenant Id
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * Type of the managed identity
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String principalId;
        private @Nullable String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ManagedIdentityPropertiesResponse build() {
            return new ManagedIdentityPropertiesResponse(principalId, tenantId, type);
        }
    }
}
