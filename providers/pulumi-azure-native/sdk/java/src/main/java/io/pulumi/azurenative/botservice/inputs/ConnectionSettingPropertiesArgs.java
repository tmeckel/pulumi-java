// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.ConnectionSettingParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for a Connection Setting Item
 * 
 */
public final class ConnectionSettingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionSettingPropertiesArgs Empty = new ConnectionSettingPropertiesArgs();

    /**
     * Client Id associated with the Connection Setting.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * Client Secret associated with the Connection Setting
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * Id associated with the Connection Setting.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name associated with the Connection Setting.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Service Provider Parameters associated with the Connection Setting
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<List<ConnectionSettingParameterArgs>> parameters;

    public Input<List<ConnectionSettingParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * Scopes associated with the Connection Setting
     * 
     */
    @InputImport(name="scopes")
      private final @Nullable Input<String> scopes;

    public Input<String> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    /**
     * Service Provider Display Name associated with the Connection Setting
     * 
     */
    @InputImport(name="serviceProviderDisplayName")
      private final @Nullable Input<String> serviceProviderDisplayName;

    public Input<String> getServiceProviderDisplayName() {
        return this.serviceProviderDisplayName == null ? Input.empty() : this.serviceProviderDisplayName;
    }

    /**
     * Service Provider Id associated with the Connection Setting
     * 
     */
    @InputImport(name="serviceProviderId")
      private final @Nullable Input<String> serviceProviderId;

    public Input<String> getServiceProviderId() {
        return this.serviceProviderId == null ? Input.empty() : this.serviceProviderId;
    }

    public ConnectionSettingPropertiesArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<ConnectionSettingParameterArgs>> parameters,
        @Nullable Input<String> provisioningState,
        @Nullable Input<String> scopes,
        @Nullable Input<String> serviceProviderDisplayName,
        @Nullable Input<String> serviceProviderId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.scopes = scopes;
        this.serviceProviderDisplayName = serviceProviderDisplayName;
        this.serviceProviderId = serviceProviderId;
    }

    private ConnectionSettingPropertiesArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.parameters = Input.empty();
        this.provisioningState = Input.empty();
        this.scopes = Input.empty();
        this.serviceProviderDisplayName = Input.empty();
        this.serviceProviderId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSettingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ConnectionSettingParameterArgs>> parameters;
        private @Nullable Input<String> provisioningState;
        private @Nullable Input<String> scopes;
        private @Nullable Input<String> serviceProviderDisplayName;
        private @Nullable Input<String> serviceProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionSettingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scopes = defaults.scopes;
    	      this.serviceProviderDisplayName = defaults.serviceProviderDisplayName;
    	      this.serviceProviderId = defaults.serviceProviderId;
        }

        public Builder clientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder clientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder parameters(@Nullable Input<List<ConnectionSettingParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ConnectionSettingParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder provisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder scopes(@Nullable Input<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder scopes(@Nullable String scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }

        public Builder serviceProviderDisplayName(@Nullable Input<String> serviceProviderDisplayName) {
            this.serviceProviderDisplayName = serviceProviderDisplayName;
            return this;
        }

        public Builder serviceProviderDisplayName(@Nullable String serviceProviderDisplayName) {
            this.serviceProviderDisplayName = Input.ofNullable(serviceProviderDisplayName);
            return this;
        }

        public Builder serviceProviderId(@Nullable Input<String> serviceProviderId) {
            this.serviceProviderId = serviceProviderId;
            return this;
        }

        public Builder serviceProviderId(@Nullable String serviceProviderId) {
            this.serviceProviderId = Input.ofNullable(serviceProviderId);
            return this;
        }
        public ConnectionSettingPropertiesArgs build() {
            return new ConnectionSettingPropertiesArgs(clientId, clientSecret, id, name, parameters, provisioningState, scopes, serviceProviderDisplayName, serviceProviderId);
        }
    }
}
