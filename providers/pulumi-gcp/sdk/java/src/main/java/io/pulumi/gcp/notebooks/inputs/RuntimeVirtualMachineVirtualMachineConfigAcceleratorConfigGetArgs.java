// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @InputImport(name="coreCount")
      private final @Nullable Input<Integer> coreCount;

    public Input<Integer> getCoreCount() {
        return this.coreCount == null ? Input.empty() : this.coreCount;
    }

    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs(
        @Nullable Input<Integer> coreCount,
        @Nullable Input<String> type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    private RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs() {
        this.coreCount = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> coreCount;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(@Nullable Input<Integer> coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        public Builder coreCount(@Nullable Integer coreCount) {
            this.coreCount = Input.ofNullable(coreCount);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs(coreCount, type);
        }
    }
}
