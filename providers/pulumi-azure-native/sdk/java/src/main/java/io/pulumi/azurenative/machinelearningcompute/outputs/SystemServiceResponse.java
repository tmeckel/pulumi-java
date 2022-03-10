// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SystemServiceResponse {
    /**
     * The public IP address of the system service
     * 
     */
    private final String publicIpAddress;
    /**
     * The system service type
     * 
     */
    private final String systemServiceType;
    /**
     * The state of the system service
     * 
     */
    private final String version;

    @OutputCustomType.Constructor
    private SystemServiceResponse(
        @OutputCustomType.Parameter("publicIpAddress") String publicIpAddress,
        @OutputCustomType.Parameter("systemServiceType") String systemServiceType,
        @OutputCustomType.Parameter("version") String version) {
        this.publicIpAddress = publicIpAddress;
        this.systemServiceType = systemServiceType;
        this.version = version;
    }

    /**
     * The public IP address of the system service
     * 
    */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * The system service type
     * 
    */
    public String getSystemServiceType() {
        return this.systemServiceType;
    }
    /**
     * The state of the system service
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicIpAddress;
        private String systemServiceType;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.systemServiceType = defaults.systemServiceType;
    	      this.version = defaults.version;
        }

        public Builder publicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }

        public Builder systemServiceType(String systemServiceType) {
            this.systemServiceType = Objects.requireNonNull(systemServiceType);
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SystemServiceResponse build() {
            return new SystemServiceResponse(publicIpAddress, systemServiceType, version);
        }
    }
}
