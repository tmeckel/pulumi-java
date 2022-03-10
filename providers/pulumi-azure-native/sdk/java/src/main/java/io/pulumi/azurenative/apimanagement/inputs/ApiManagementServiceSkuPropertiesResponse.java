// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * API Management service resource SKU properties.
 * 
 */
public final class ApiManagementServiceSkuPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiManagementServiceSkuPropertiesResponse Empty = new ApiManagementServiceSkuPropertiesResponse();

    /**
     * Capacity of the SKU (number of deployed units of the SKU). For Consumption SKU capacity must be specified as 0.
     * 
     */
    @InputImport(name="capacity", required=true)
      private final Integer capacity;

    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * Name of the Sku.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ApiManagementServiceSkuPropertiesResponse(
        Integer capacity,
        String name) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ApiManagementServiceSkuPropertiesResponse() {
        this.capacity = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiManagementServiceSkuPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiManagementServiceSkuPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ApiManagementServiceSkuPropertiesResponse build() {
            return new ApiManagementServiceSkuPropertiesResponse(capacity, name);
        }
    }
}
