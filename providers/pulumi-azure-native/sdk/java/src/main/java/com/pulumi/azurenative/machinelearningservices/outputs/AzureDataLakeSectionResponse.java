// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureDataLakeSectionResponse {
    /**
     * @return The authority URL used for authentication.
     * 
     */
    private final @Nullable String authorityUrl;
    /**
     * @return The content of the certificate used for authentication.
     * 
     */
    private final @Nullable String certificate;
    /**
     * @return The Client ID/Application ID
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return The client secret.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return The Azure Data Lake credential type.
     * 
     */
    private final @Nullable String credentialType;
    /**
     * @return  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    private final @Nullable Boolean isCertAuth;
    /**
     * @return Resource Group.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * @return The resource the service principal/app has access to.
     * 
     */
    private final @Nullable String resourceUri;
    /**
     * @return Indicates which identity to use to authenticate service data access to customer&#39;s storage.
     * 
     */
    private final @Nullable String serviceDataAccessAuthIdentity;
    /**
     * @return The Azure Data Lake store name.
     * 
     */
    private final @Nullable String storeName;
    /**
     * @return Subscription ID.
     * 
     */
    private final @Nullable String subscriptionId;
    /**
     * @return The ID of the tenant the service principal/app belongs to.
     * 
     */
    private final @Nullable String tenantId;
    /**
     * @return The thumbprint of the certificate above.
     * 
     */
    private final @Nullable String thumbprint;

    @CustomType.Constructor
    private AzureDataLakeSectionResponse(
        @CustomType.Parameter("authorityUrl") @Nullable String authorityUrl,
        @CustomType.Parameter("certificate") @Nullable String certificate,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("credentialType") @Nullable String credentialType,
        @CustomType.Parameter("isCertAuth") @Nullable Boolean isCertAuth,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("resourceUri") @Nullable String resourceUri,
        @CustomType.Parameter("serviceDataAccessAuthIdentity") @Nullable String serviceDataAccessAuthIdentity,
        @CustomType.Parameter("storeName") @Nullable String storeName,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("thumbprint") @Nullable String thumbprint) {
        this.authorityUrl = authorityUrl;
        this.certificate = certificate;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.credentialType = credentialType;
        this.isCertAuth = isCertAuth;
        this.resourceGroup = resourceGroup;
        this.resourceUri = resourceUri;
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        this.storeName = storeName;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.thumbprint = thumbprint;
    }

    /**
     * @return The authority URL used for authentication.
     * 
     */
    public Optional<String> authorityUrl() {
        return Optional.ofNullable(this.authorityUrl);
    }
    /**
     * @return The content of the certificate used for authentication.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return The Client ID/Application ID
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The client secret.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The Azure Data Lake credential type.
     * 
     */
    public Optional<String> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }
    /**
     * @return  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    public Optional<Boolean> isCertAuth() {
        return Optional.ofNullable(this.isCertAuth);
    }
    /**
     * @return Resource Group.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * @return The resource the service principal/app has access to.
     * 
     */
    public Optional<String> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }
    /**
     * @return Indicates which identity to use to authenticate service data access to customer&#39;s storage.
     * 
     */
    public Optional<String> serviceDataAccessAuthIdentity() {
        return Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }
    /**
     * @return The Azure Data Lake store name.
     * 
     */
    public Optional<String> storeName() {
        return Optional.ofNullable(this.storeName);
    }
    /**
     * @return Subscription ID.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    /**
     * @return The ID of the tenant the service principal/app belongs to.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The thumbprint of the certificate above.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorityUrl;
        private @Nullable String certificate;
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable String credentialType;
        private @Nullable Boolean isCertAuth;
        private @Nullable String resourceGroup;
        private @Nullable String resourceUri;
        private @Nullable String serviceDataAccessAuthIdentity;
        private @Nullable String storeName;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;
        private @Nullable String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeSectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorityUrl = defaults.authorityUrl;
    	      this.certificate = defaults.certificate;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.credentialType = defaults.credentialType;
    	      this.isCertAuth = defaults.isCertAuth;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serviceDataAccessAuthIdentity = defaults.serviceDataAccessAuthIdentity;
    	      this.storeName = defaults.storeName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder authorityUrl(@Nullable String authorityUrl) {
            this.authorityUrl = authorityUrl;
            return this;
        }
        public Builder certificate(@Nullable String certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder credentialType(@Nullable String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Builder isCertAuth(@Nullable Boolean isCertAuth) {
            this.isCertAuth = isCertAuth;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder serviceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }
        public Builder storeName(@Nullable String storeName) {
            this.storeName = storeName;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }        public AzureDataLakeSectionResponse build() {
            return new AzureDataLakeSectionResponse(authorityUrl, certificate, clientId, clientSecret, credentialType, isCertAuth, resourceGroup, resourceUri, serviceDataAccessAuthIdentity, storeName, subscriptionId, tenantId, thumbprint);
        }
    }
}
