// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureSqlDatabaseSectionResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureSqlDatabaseSectionResponse Empty = new AzureSqlDatabaseSectionResponse();

    /**
     * The authority URL used for authentication.
     * 
     */
    @Import(name="authorityUrl")
    private @Nullable String authorityUrl;

    /**
     * @return The authority URL used for authentication.
     * 
     */
    public Optional<String> authorityUrl() {
        return Optional.ofNullable(this.authorityUrl);
    }

    /**
     * The content of the certificate used for authentication.
     * 
     */
    @Import(name="certificate")
    private @Nullable String certificate;

    /**
     * @return The content of the certificate used for authentication.
     * 
     */
    public Optional<String> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The Client ID/Application ID
     * 
     */
    @Import(name="clientId")
    private @Nullable String clientId;

    /**
     * @return The Client ID/Application ID
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The client secret.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable String clientSecret;

    /**
     * @return The client secret.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * Sql Authentication type.
     * 
     */
    @Import(name="credentialType")
    private @Nullable String credentialType;

    /**
     * @return Sql Authentication type.
     * 
     */
    public Optional<String> credentialType() {
        return Optional.ofNullable(this.credentialType);
    }

    /**
     * The Azure SQL database name.
     * 
     */
    @Import(name="databaseName")
    private @Nullable String databaseName;

    /**
     * @return The Azure SQL database name.
     * 
     */
    public Optional<String> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The server host endpoint.
     * 
     */
    @Import(name="endpoint")
    private @Nullable String endpoint;

    /**
     * @return The server host endpoint.
     * 
     */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     *  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    @Import(name="isCertAuth")
    private @Nullable Boolean isCertAuth;

    /**
     * @return  Is it using certificate to authenticate. If false then use client secret.
     * 
     */
    public Optional<Boolean> isCertAuth() {
        return Optional.ofNullable(this.isCertAuth);
    }

    /**
     * / The Azure SQL port number.
     * 
     */
    @Import(name="portNumber")
    private @Nullable String portNumber;

    /**
     * @return / The Azure SQL port number.
     * 
     */
    public Optional<String> portNumber() {
        return Optional.ofNullable(this.portNumber);
    }

    /**
     * Resource Group.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable String resourceGroup;

    /**
     * @return Resource Group.
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * The resource the service principal/app has access to.
     * 
     */
    @Import(name="resourceUri")
    private @Nullable String resourceUri;

    /**
     * @return The resource the service principal/app has access to.
     * 
     */
    public Optional<String> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    /**
     * The Azure SQL server name.
     * 
     */
    @Import(name="serverName")
    private @Nullable String serverName;

    /**
     * @return The Azure SQL server name.
     * 
     */
    public Optional<String> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    /**
     * Indicates which identity to use to authenticate service data access to customer&#39;s storage.
     * 
     */
    @Import(name="serviceDataAccessAuthIdentity")
    private @Nullable String serviceDataAccessAuthIdentity;

    /**
     * @return Indicates which identity to use to authenticate service data access to customer&#39;s storage.
     * 
     */
    public Optional<String> serviceDataAccessAuthIdentity() {
        return Optional.ofNullable(this.serviceDataAccessAuthIdentity);
    }

    /**
     * Subscription ID.
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    /**
     * @return Subscription ID.
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The ID of the tenant the service principal/app belongs to.
     * 
     */
    @Import(name="tenantId")
    private @Nullable String tenantId;

    /**
     * @return The ID of the tenant the service principal/app belongs to.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    /**
     * The thumbprint of the certificate above.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable String thumbprint;

    /**
     * @return The thumbprint of the certificate above.
     * 
     */
    public Optional<String> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    /**
     * The Azure SQL user id.
     * 
     */
    @Import(name="userId")
    private @Nullable String userId;

    /**
     * @return The Azure SQL user id.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The Azure SQL user password.
     * 
     */
    @Import(name="userPassword")
    private @Nullable String userPassword;

    /**
     * @return The Azure SQL user password.
     * 
     */
    public Optional<String> userPassword() {
        return Optional.ofNullable(this.userPassword);
    }

    private AzureSqlDatabaseSectionResponse() {}

    private AzureSqlDatabaseSectionResponse(AzureSqlDatabaseSectionResponse $) {
        this.authorityUrl = $.authorityUrl;
        this.certificate = $.certificate;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.credentialType = $.credentialType;
        this.databaseName = $.databaseName;
        this.endpoint = $.endpoint;
        this.isCertAuth = $.isCertAuth;
        this.portNumber = $.portNumber;
        this.resourceGroup = $.resourceGroup;
        this.resourceUri = $.resourceUri;
        this.serverName = $.serverName;
        this.serviceDataAccessAuthIdentity = $.serviceDataAccessAuthIdentity;
        this.subscriptionId = $.subscriptionId;
        this.tenantId = $.tenantId;
        this.thumbprint = $.thumbprint;
        this.userId = $.userId;
        this.userPassword = $.userPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureSqlDatabaseSectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureSqlDatabaseSectionResponse $;

        public Builder() {
            $ = new AzureSqlDatabaseSectionResponse();
        }

        public Builder(AzureSqlDatabaseSectionResponse defaults) {
            $ = new AzureSqlDatabaseSectionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorityUrl The authority URL used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder authorityUrl(@Nullable String authorityUrl) {
            $.authorityUrl = authorityUrl;
            return this;
        }

        /**
         * @param certificate The content of the certificate used for authentication.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable String certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param clientId The Client ID/Application ID
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable String clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientSecret The client secret.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable String clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param credentialType Sql Authentication type.
         * 
         * @return builder
         * 
         */
        public Builder credentialType(@Nullable String credentialType) {
            $.credentialType = credentialType;
            return this;
        }

        /**
         * @param databaseName The Azure SQL database name.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(@Nullable String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param endpoint The server host endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable String endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param isCertAuth  Is it using certificate to authenticate. If false then use client secret.
         * 
         * @return builder
         * 
         */
        public Builder isCertAuth(@Nullable Boolean isCertAuth) {
            $.isCertAuth = isCertAuth;
            return this;
        }

        /**
         * @param portNumber / The Azure SQL port number.
         * 
         * @return builder
         * 
         */
        public Builder portNumber(@Nullable String portNumber) {
            $.portNumber = portNumber;
            return this;
        }

        /**
         * @param resourceGroup Resource Group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable String resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceUri The resource the service principal/app has access to.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(@Nullable String resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param serverName The Azure SQL server name.
         * 
         * @return builder
         * 
         */
        public Builder serverName(@Nullable String serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serviceDataAccessAuthIdentity Indicates which identity to use to authenticate service data access to customer&#39;s storage.
         * 
         * @return builder
         * 
         */
        public Builder serviceDataAccessAuthIdentity(@Nullable String serviceDataAccessAuthIdentity) {
            $.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
            return this;
        }

        /**
         * @param subscriptionId Subscription ID.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param tenantId The ID of the tenant the service principal/app belongs to.
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param thumbprint The thumbprint of the certificate above.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable String thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param userId The Azure SQL user id.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable String userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userPassword The Azure SQL user password.
         * 
         * @return builder
         * 
         */
        public Builder userPassword(@Nullable String userPassword) {
            $.userPassword = userPassword;
            return this;
        }

        public AzureSqlDatabaseSectionResponse build() {
            return $;
        }
    }

}
