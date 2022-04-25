// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterIdentityResponseUserAssignedIdentities {
    /**
     * @return The client id of user assigned identity.
     * 
     */
    private final String clientId;
    /**
     * @return The principal id of user assigned identity.
     * 
     */
    private final String principalId;
    /**
     * @return The tenant id of user assigned identity.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private ClusterIdentityResponseUserAssignedIdentities(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.clientId = clientId;
        this.principalId = principalId;
        this.tenantId = tenantId;
    }

    /**
     * @return The client id of user assigned identity.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The principal id of user assigned identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The tenant id of user assigned identity.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public ClusterIdentityResponseUserAssignedIdentities build() {
            return new ClusterIdentityResponseUserAssignedIdentities(clientId, principalId, tenantId);
        }
    }
}
