// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ServiceRegistryInstanceResponse {
    /**
     * @return Name of the Service Registry instance
     * 
     */
    private final String name;
    /**
     * @return Status of the Service Registry instance
     * 
     */
    private final String status;

    @CustomType.Constructor
    private ServiceRegistryInstanceResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("status") String status) {
        this.name = name;
        this.status = status;
    }

    /**
     * @return Name of the Service Registry instance
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Status of the Service Registry instance
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ServiceRegistryInstanceResponse build() {
            return new ServiceRegistryInstanceResponse(name, status);
        }
    }
}
