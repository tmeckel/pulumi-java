// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceDeviceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceDeviceGetArgs Empty = new DeviceDeviceGetArgs();

    /**
     * A description for the device.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the device.
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Amazon Web Services Internet of Things (IoT) object name.
     * 
     */
    @InputImport(name="iotThingName")
      private final @Nullable Input<String> iotThingName;

    public Input<String> getIotThingName() {
        return this.iotThingName == null ? Input.empty() : this.iotThingName;
    }

    public DeviceDeviceGetArgs(
        @Nullable Input<String> description,
        Input<String> deviceName,
        @Nullable Input<String> iotThingName) {
        this.description = description;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.iotThingName = iotThingName;
    }

    private DeviceDeviceGetArgs() {
        this.description = Input.empty();
        this.deviceName = Input.empty();
        this.iotThingName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceDeviceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> deviceName;
        private @Nullable Input<String> iotThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceDeviceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.iotThingName = defaults.iotThingName;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder deviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder iotThingName(@Nullable Input<String> iotThingName) {
            this.iotThingName = iotThingName;
            return this;
        }

        public Builder iotThingName(@Nullable String iotThingName) {
            this.iotThingName = Input.ofNullable(iotThingName);
            return this;
        }
        public DeviceDeviceGetArgs build() {
            return new DeviceDeviceGetArgs(description, deviceName, iotThingName);
        }
    }
}
