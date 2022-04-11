// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.autoscaling.inputs;

import io.pulumi.awsnative.autoscaling.inputs.LaunchConfigurationBlockDeviceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * BlockDeviceMapping is a property of AWS::AutoScaling::LaunchConfiguration that describes a block device mapping for an Auto Scaling group.
 * 
 */
public final class LaunchConfigurationBlockDeviceMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationBlockDeviceMappingArgs Empty = new LaunchConfigurationBlockDeviceMappingArgs();

    /**
     * The device name exposed to the EC2 instance (for example, /dev/sdh or xvdh).
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Parameters used to automatically set up EBS volumes when an instance is launched.
     * 
     */
    @Import(name="ebs")
      private final @Nullable Output<LaunchConfigurationBlockDeviceArgs> ebs;

    public Output<LaunchConfigurationBlockDeviceArgs> getEbs() {
        return this.ebs == null ? Codegen.empty() : this.ebs;
    }

    /**
     * Setting this value to true suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    @Import(name="noDevice")
      private final @Nullable Output<Boolean> noDevice;

    public Output<Boolean> getNoDevice() {
        return this.noDevice == null ? Codegen.empty() : this.noDevice;
    }

    /**
     * The name of the virtual device.
     * 
     */
    @Import(name="virtualName")
      private final @Nullable Output<String> virtualName;

    public Output<String> getVirtualName() {
        return this.virtualName == null ? Codegen.empty() : this.virtualName;
    }

    public LaunchConfigurationBlockDeviceMappingArgs(
        Output<String> deviceName,
        @Nullable Output<LaunchConfigurationBlockDeviceArgs> ebs,
        @Nullable Output<Boolean> noDevice,
        @Nullable Output<String> virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    private LaunchConfigurationBlockDeviceMappingArgs() {
        this.deviceName = Codegen.empty();
        this.ebs = Codegen.empty();
        this.noDevice = Codegen.empty();
        this.virtualName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationBlockDeviceMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private @Nullable Output<LaunchConfigurationBlockDeviceArgs> ebs;
        private @Nullable Output<Boolean> noDevice;
        private @Nullable Output<String> virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationBlockDeviceMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder ebs(@Nullable Output<LaunchConfigurationBlockDeviceArgs> ebs) {
            this.ebs = ebs;
            return this;
        }
        public Builder ebs(@Nullable LaunchConfigurationBlockDeviceArgs ebs) {
            this.ebs = Codegen.ofNullable(ebs);
            return this;
        }
        public Builder noDevice(@Nullable Output<Boolean> noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder noDevice(@Nullable Boolean noDevice) {
            this.noDevice = Codegen.ofNullable(noDevice);
            return this;
        }
        public Builder virtualName(@Nullable Output<String> virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = Codegen.ofNullable(virtualName);
            return this;
        }        public LaunchConfigurationBlockDeviceMappingArgs build() {
            return new LaunchConfigurationBlockDeviceMappingArgs(deviceName, ebs, noDevice, virtualName);
        }
    }
}
