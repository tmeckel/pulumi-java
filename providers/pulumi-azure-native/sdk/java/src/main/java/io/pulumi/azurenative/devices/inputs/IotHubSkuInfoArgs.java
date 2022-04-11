// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.IotHubSku;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the SKU of the IoT hub.
 * 
 */
public final class IotHubSkuInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotHubSkuInfoArgs Empty = new IotHubSkuInfoArgs();

    /**
     * The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Double> capacity;

    public Output<Double> getCapacity() {
        return this.capacity == null ? Codegen.empty() : this.capacity;
    }

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,IotHubSku>> name;

    public Output<Either<String,IotHubSku>> getName() {
        return this.name;
    }

    public IotHubSkuInfoArgs(
        @Nullable Output<Double> capacity,
        Output<Either<String,IotHubSku>> name) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private IotHubSkuInfoArgs() {
        this.capacity = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubSkuInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> capacity;
        private Output<Either<String,IotHubSku>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubSkuInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Output<Double> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Double capacity) {
            this.capacity = Codegen.ofNullable(capacity);
            return this;
        }
        public Builder name(Output<Either<String,IotHubSku>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,IotHubSku> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public IotHubSkuInfoArgs build() {
            return new IotHubSkuInfoArgs(capacity, name);
        }
    }
}
