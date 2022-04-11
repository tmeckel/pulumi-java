// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionInferenceAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionInferenceAcceleratorArgs Empty = new TaskDefinitionInferenceAcceleratorArgs();

    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    @Import(name="deviceType")
      private final @Nullable Output<String> deviceType;

    public Output<String> getDeviceType() {
        return this.deviceType == null ? Codegen.empty() : this.deviceType;
    }

    public TaskDefinitionInferenceAcceleratorArgs(
        @Nullable Output<String> deviceName,
        @Nullable Output<String> deviceType) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
    }

    private TaskDefinitionInferenceAcceleratorArgs() {
        this.deviceName = Codegen.empty();
        this.deviceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionInferenceAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> deviceType;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionInferenceAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.deviceType = defaults.deviceType;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder deviceType(@Nullable Output<String> deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Builder deviceType(@Nullable String deviceType) {
            this.deviceType = Codegen.ofNullable(deviceType);
            return this;
        }        public TaskDefinitionInferenceAcceleratorArgs build() {
            return new TaskDefinitionInferenceAcceleratorArgs(deviceName, deviceType);
        }
    }
}
