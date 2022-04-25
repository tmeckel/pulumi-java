// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.outputs;

import com.pulumi.azurenative.healthcareapis.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.healthcareapis.outputs.ServiceAccessPolicyEntryResponse;
import com.pulumi.azurenative.healthcareapis.outputs.ServiceAcrConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.outputs.ServiceAuthenticationConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.outputs.ServiceCorsConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.outputs.ServiceCosmosDbConfigurationInfoResponse;
import com.pulumi.azurenative.healthcareapis.outputs.ServiceExportConfigurationInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicesPropertiesResponse {
    /**
     * @return The access policies of the service instance.
     * 
     */
    private final @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;
    /**
     * @return The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    private final @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;
    /**
     * @return The authentication configuration for the service instance.
     * 
     */
    private final @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;
    /**
     * @return The settings for the CORS configuration of the service instance.
     * 
     */
    private final @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;
    /**
     * @return The settings for the Cosmos DB database backing the service.
     * 
     */
    private final @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;
    /**
     * @return The settings for the export operation of the service instance.
     * 
     */
    private final @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;
    /**
     * @return The list of private endpoint connections that are set up for this resource.
     * 
     */
    private final @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * @return The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    private final @Nullable String publicNetworkAccess;

    @CustomType.Constructor
    private ServicesPropertiesResponse(
        @CustomType.Parameter("accessPolicies") @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies,
        @CustomType.Parameter("acrConfiguration") @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration,
        @CustomType.Parameter("authenticationConfiguration") @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration,
        @CustomType.Parameter("corsConfiguration") @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration,
        @CustomType.Parameter("cosmosDbConfiguration") @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration,
        @CustomType.Parameter("exportConfiguration") @Nullable ServiceExportConfigurationInfoResponse exportConfiguration,
        @CustomType.Parameter("privateEndpointConnections") @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess) {
        this.accessPolicies = accessPolicies;
        this.acrConfiguration = acrConfiguration;
        this.authenticationConfiguration = authenticationConfiguration;
        this.corsConfiguration = corsConfiguration;
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        this.exportConfiguration = exportConfiguration;
        this.privateEndpointConnections = privateEndpointConnections;
        this.provisioningState = provisioningState;
        this.publicNetworkAccess = publicNetworkAccess;
    }

    /**
     * @return The access policies of the service instance.
     * 
     */
    public List<ServiceAccessPolicyEntryResponse> accessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }
    /**
     * @return The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    public Optional<ServiceAcrConfigurationInfoResponse> acrConfiguration() {
        return Optional.ofNullable(this.acrConfiguration);
    }
    /**
     * @return The authentication configuration for the service instance.
     * 
     */
    public Optional<ServiceAuthenticationConfigurationInfoResponse> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }
    /**
     * @return The settings for the CORS configuration of the service instance.
     * 
     */
    public Optional<ServiceCorsConfigurationInfoResponse> corsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }
    /**
     * @return The settings for the Cosmos DB database backing the service.
     * 
     */
    public Optional<ServiceCosmosDbConfigurationInfoResponse> cosmosDbConfiguration() {
        return Optional.ofNullable(this.cosmosDbConfiguration);
    }
    /**
     * @return The settings for the export operation of the service instance.
     * 
     */
    public Optional<ServiceExportConfigurationInfoResponse> exportConfiguration() {
        return Optional.ofNullable(this.exportConfiguration);
    }
    /**
     * @return The list of private endpoint connections that are set up for this resource.
     * 
     */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections == null ? List.of() : this.privateEndpointConnections;
    }
    /**
     * @return The provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies;
        private @Nullable ServiceAcrConfigurationInfoResponse acrConfiguration;
        private @Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration;
        private @Nullable ServiceCorsConfigurationInfoResponse corsConfiguration;
        private @Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration;
        private @Nullable ServiceExportConfigurationInfoResponse exportConfiguration;
        private @Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.acrConfiguration = defaults.acrConfiguration;
    	      this.authenticationConfiguration = defaults.authenticationConfiguration;
    	      this.corsConfiguration = defaults.corsConfiguration;
    	      this.cosmosDbConfiguration = defaults.cosmosDbConfiguration;
    	      this.exportConfiguration = defaults.exportConfiguration;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder accessPolicies(@Nullable List<ServiceAccessPolicyEntryResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public Builder accessPolicies(ServiceAccessPolicyEntryResponse... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }
        public Builder acrConfiguration(@Nullable ServiceAcrConfigurationInfoResponse acrConfiguration) {
            this.acrConfiguration = acrConfiguration;
            return this;
        }
        public Builder authenticationConfiguration(@Nullable ServiceAuthenticationConfigurationInfoResponse authenticationConfiguration) {
            this.authenticationConfiguration = authenticationConfiguration;
            return this;
        }
        public Builder corsConfiguration(@Nullable ServiceCorsConfigurationInfoResponse corsConfiguration) {
            this.corsConfiguration = corsConfiguration;
            return this;
        }
        public Builder cosmosDbConfiguration(@Nullable ServiceCosmosDbConfigurationInfoResponse cosmosDbConfiguration) {
            this.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }
        public Builder exportConfiguration(@Nullable ServiceExportConfigurationInfoResponse exportConfiguration) {
            this.exportConfiguration = exportConfiguration;
            return this;
        }
        public Builder privateEndpointConnections(@Nullable List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = privateEndpointConnections;
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }        public ServicesPropertiesResponse build() {
            return new ServicesPropertiesResponse(accessPolicies, acrConfiguration, authenticationConfiguration, corsConfiguration, cosmosDbConfiguration, exportConfiguration, privateEndpointConnections, provisioningState, publicNetworkAccess);
        }
    }
}
