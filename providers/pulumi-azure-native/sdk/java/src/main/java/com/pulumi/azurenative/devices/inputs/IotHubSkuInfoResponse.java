// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the SKU of the IoT hub.
 * 
 */
public final class IotHubSkuInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final IotHubSkuInfoResponse Empty = new IotHubSkuInfoResponse();

    /**
     * The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     * 
     */
    @Import(name="capacity")
    private @Nullable Double capacity;

    /**
     * @return The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     * 
     */
    public Optional<Double> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the SKU.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The billing tier for the IoT hub.
     * 
     */
    @Import(name="tier", required=true)
    private String tier;

    /**
     * @return The billing tier for the IoT hub.
     * 
     */
    public String tier() {
        return this.tier;
    }

    private IotHubSkuInfoResponse() {}

    private IotHubSkuInfoResponse(IotHubSkuInfoResponse $) {
        this.capacity = $.capacity;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubSkuInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubSkuInfoResponse $;

        public Builder() {
            $ = new IotHubSkuInfoResponse();
        }

        public Builder(IotHubSkuInfoResponse defaults) {
            $ = new IotHubSkuInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Double capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param name The name of the SKU.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tier The billing tier for the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            $.tier = tier;
            return this;
        }

        public IotHubSkuInfoResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
