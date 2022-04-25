// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigMasterConfigAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigMasterConfigAcceleratorArgs Empty = new ClusterClusterConfigMasterConfigAcceleratorArgs();

    /**
     * The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
     * 
     */
    @Import(name="acceleratorCount", required=true)
    private Output<Integer> acceleratorCount;

    /**
     * @return The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
     * 
     */
    public Output<Integer> acceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
     * 
     */
    @Import(name="acceleratorType", required=true)
    private Output<String> acceleratorType;

    /**
     * @return The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
     * 
     */
    public Output<String> acceleratorType() {
        return this.acceleratorType;
    }

    private ClusterClusterConfigMasterConfigAcceleratorArgs() {}

    private ClusterClusterConfigMasterConfigAcceleratorArgs(ClusterClusterConfigMasterConfigAcceleratorArgs $) {
        this.acceleratorCount = $.acceleratorCount;
        this.acceleratorType = $.acceleratorType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigMasterConfigAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigMasterConfigAcceleratorArgs $;

        public Builder() {
            $ = new ClusterClusterConfigMasterConfigAcceleratorArgs();
        }

        public Builder(ClusterClusterConfigMasterConfigAcceleratorArgs defaults) {
            $ = new ClusterClusterConfigMasterConfigAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorCount The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(Output<Integer> acceleratorCount) {
            $.acceleratorCount = acceleratorCount;
            return this;
        }

        /**
         * @param acceleratorCount The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorCount(Integer acceleratorCount) {
            return acceleratorCount(Output.of(acceleratorCount));
        }

        /**
         * @param acceleratorType The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        /**
         * @param acceleratorType The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public ClusterClusterConfigMasterConfigAcceleratorArgs build() {
            $.acceleratorCount = Objects.requireNonNull($.acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
            $.acceleratorType = Objects.requireNonNull($.acceleratorType, "expected parameter 'acceleratorType' to be non-null");
            return $;
        }
    }

}
