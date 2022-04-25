// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AcceleratorConfig defines the accelerator cards to attach to the VM.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs();

    /**
     * The number of guest accelerator cards exposed to each VM.
     * 
     */
    @Import(name="acceleratorCount")
    private @Nullable Output<String> acceleratorCount;

    /**
     * @return The number of guest accelerator cards exposed to each VM.
     * 
     */
    public Optional<Output<String>> acceleratorCount() {
        return Optional.ofNullable(this.acceleratorCount);
    }

    /**
     * The type of accelerator to attach to each VM, e.g. &#34;nvidia-tesla-k80&#34; for nVidia Tesla K80.
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<String> acceleratorType;

    /**
     * @return The type of accelerator to attach to each VM, e.g. &#34;nvidia-tesla-k80&#34; for nVidia Tesla K80.
     * 
     */
    public Optional<Output<String>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs() {}

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs $;

        public Builder() {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs();
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs defaults) {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorCount The number of guest accelerator cards exposed to each VM.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(@Nullable Output<String> acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        /**
         * @param acceleratorCount The number of guest accelerator cards exposed to each VM.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(String acceleratorCount) {
            return acceleratorCount(Output.of(acceleratorCount));
        }

        /**
         * @param acceleratorType The type of accelerator to attach to each VM, e.g. &#34;nvidia-tesla-k80&#34; for nVidia Tesla K80.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType The type of accelerator to attach to each VM, e.g. &#34;nvidia-tesla-k80&#34; for nVidia Tesla K80.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfigArgs build() {
            return $;
        }
    }

}
