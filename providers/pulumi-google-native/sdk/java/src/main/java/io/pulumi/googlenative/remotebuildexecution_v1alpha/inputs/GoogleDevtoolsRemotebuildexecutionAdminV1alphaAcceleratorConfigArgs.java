// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AcceleratorConfig defines the accelerator cards to attach to the VM.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs();

    /**
     * The number of guest accelerator cards exposed to each VM.
     * 
     */
    @InputImport(name="acceleratorCount")
    private final @Nullable Input<String> acceleratorCount;

    public Input<String> getAcceleratorCount() {
        return this.acceleratorCount == null ? Input.empty() : this.acceleratorCount;
    }

    /**
     * The type of accelerator to attach to each VM, e.g. "nvidia-tesla-k80" for nVidia Tesla K80.
     * 
     */
    @InputImport(name="acceleratorType")
    private final @Nullable Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType == null ? Input.empty() : this.acceleratorType;
    }

    public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs(
        @Nullable Input<String> acceleratorCount,
        @Nullable Input<String> acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs() {
        this.acceleratorCount = Input.empty();
        this.acceleratorType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceleratorCount;
        private @Nullable Input<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(@Nullable Input<String> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder setAcceleratorCount(@Nullable String acceleratorCount) {
            this.acceleratorCount = Input.ofNullable(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(@Nullable Input<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public Builder setAcceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Input.ofNullable(acceleratorType);
            return this;
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs build() {
            return new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs(acceleratorCount, acceleratorType);
        }
    }
}
