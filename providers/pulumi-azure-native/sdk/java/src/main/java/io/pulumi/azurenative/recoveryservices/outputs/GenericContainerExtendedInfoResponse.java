// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.ContainerIdentityInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GenericContainerExtendedInfoResponse {
    /**
     * Container identity information
     * 
     */
    private final @Nullable ContainerIdentityInfoResponse containerIdentityInfo;
    /**
     * Public key of container cert
     * 
     */
    private final @Nullable String rawCertData;
    /**
     * Azure Backup Service Endpoints for the container
     * 
     */
    private final @Nullable Map<String,String> serviceEndpoints;

    @OutputCustomType.Constructor
    private GenericContainerExtendedInfoResponse(
        @OutputCustomType.Parameter("containerIdentityInfo") @Nullable ContainerIdentityInfoResponse containerIdentityInfo,
        @OutputCustomType.Parameter("rawCertData") @Nullable String rawCertData,
        @OutputCustomType.Parameter("serviceEndpoints") @Nullable Map<String,String> serviceEndpoints) {
        this.containerIdentityInfo = containerIdentityInfo;
        this.rawCertData = rawCertData;
        this.serviceEndpoints = serviceEndpoints;
    }

    /**
     * Container identity information
     * 
    */
    public Optional<ContainerIdentityInfoResponse> getContainerIdentityInfo() {
        return Optional.ofNullable(this.containerIdentityInfo);
    }
    /**
     * Public key of container cert
     * 
    */
    public Optional<String> getRawCertData() {
        return Optional.ofNullable(this.rawCertData);
    }
    /**
     * Azure Backup Service Endpoints for the container
     * 
    */
    public Map<String,String> getServiceEndpoints() {
        return this.serviceEndpoints == null ? Map.of() : this.serviceEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericContainerExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerIdentityInfoResponse containerIdentityInfo;
        private @Nullable String rawCertData;
        private @Nullable Map<String,String> serviceEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericContainerExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerIdentityInfo = defaults.containerIdentityInfo;
    	      this.rawCertData = defaults.rawCertData;
    	      this.serviceEndpoints = defaults.serviceEndpoints;
        }

        public Builder containerIdentityInfo(@Nullable ContainerIdentityInfoResponse containerIdentityInfo) {
            this.containerIdentityInfo = containerIdentityInfo;
            return this;
        }

        public Builder rawCertData(@Nullable String rawCertData) {
            this.rawCertData = rawCertData;
            return this;
        }

        public Builder serviceEndpoints(@Nullable Map<String,String> serviceEndpoints) {
            this.serviceEndpoints = serviceEndpoints;
            return this;
        }
        public GenericContainerExtendedInfoResponse build() {
            return new GenericContainerExtendedInfoResponse(containerIdentityInfo, rawCertData, serviceEndpoints);
        }
    }
}
