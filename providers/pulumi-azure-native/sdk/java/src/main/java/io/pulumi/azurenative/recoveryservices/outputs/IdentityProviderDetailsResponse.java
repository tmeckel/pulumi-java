// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityProviderDetailsResponse {
    /**
     * The base authority for Azure Active Directory authentication.
     * 
     */
    private final @Nullable String aadAuthority;
    /**
     * The application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String applicationId;
    /**
     * The intended Audience of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String audience;
    /**
     * The object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String objectId;
    /**
     * The tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
     */
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor
    private IdentityProviderDetailsResponse(
        @OutputCustomType.Parameter("aadAuthority") @Nullable String aadAuthority,
        @OutputCustomType.Parameter("applicationId") @Nullable String applicationId,
        @OutputCustomType.Parameter("audience") @Nullable String audience,
        @OutputCustomType.Parameter("objectId") @Nullable String objectId,
        @OutputCustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.aadAuthority = aadAuthority;
        this.applicationId = applicationId;
        this.audience = audience;
        this.objectId = objectId;
        this.tenantId = tenantId;
    }

    /**
     * The base authority for Azure Active Directory authentication.
     * 
    */
    public Optional<String> getAadAuthority() {
        return Optional.ofNullable(this.aadAuthority);
    }
    /**
     * The application/client Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> getApplicationId() {
        return Optional.ofNullable(this.applicationId);
    }
    /**
     * The intended Audience of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> getAudience() {
        return Optional.ofNullable(this.audience);
    }
    /**
     * The object Id of the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> getObjectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * The tenant Id for the service principal with which the on-premise management/data plane components would communicate with our Azure services.
     * 
    */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadAuthority;
        private @Nullable String applicationId;
        private @Nullable String audience;
        private @Nullable String objectId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthority = defaults.aadAuthority;
    	      this.applicationId = defaults.applicationId;
    	      this.audience = defaults.audience;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder aadAuthority(@Nullable String aadAuthority) {
            this.aadAuthority = aadAuthority;
            return this;
        }

        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = audience;
            return this;
        }

        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public IdentityProviderDetailsResponse build() {
            return new IdentityProviderDetailsResponse(aadAuthority, applicationId, audience, objectId, tenantId);
        }
    }
}
