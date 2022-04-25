// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupEbsConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupEbsConfigGetArgs Empty = new InstanceGroupEbsConfigGetArgs();

    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    @Import(name="iops")
    private @Nullable Output<Integer> iops;

    /**
     * @return The number of I/O operations per second (IOPS) that the volume supports.
     * 
     */
    public Optional<Output<Integer>> iops() {
        return Optional.ofNullable(this.iops);
    }

    /**
     * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    /**
     * @return The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }

    /**
     * The volume type. Valid options are &#39;gp2&#39;, &#39;io1&#39; and &#39;standard&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The volume type. Valid options are &#39;gp2&#39;, &#39;io1&#39; and &#39;standard&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The number of EBS Volumes to attach per instance.
     * 
     */
    @Import(name="volumesPerInstance")
    private @Nullable Output<Integer> volumesPerInstance;

    /**
     * @return The number of EBS Volumes to attach per instance.
     * 
     */
    public Optional<Output<Integer>> volumesPerInstance() {
        return Optional.ofNullable(this.volumesPerInstance);
    }

    private InstanceGroupEbsConfigGetArgs() {}

    private InstanceGroupEbsConfigGetArgs(InstanceGroupEbsConfigGetArgs $) {
        this.iops = $.iops;
        this.size = $.size;
        this.type = $.type;
        this.volumesPerInstance = $.volumesPerInstance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupEbsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupEbsConfigGetArgs $;

        public Builder() {
            $ = new InstanceGroupEbsConfigGetArgs();
        }

        public Builder(InstanceGroupEbsConfigGetArgs defaults) {
            $ = new InstanceGroupEbsConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iops The number of I/O operations per second (IOPS) that the volume supports.
         * 
         * @return builder
         * 
         */
        public Builder iops(@Nullable Output<Integer> iops) {
            $.iops = iops;
            return this;
        }

        /**
         * @param iops The number of I/O operations per second (IOPS) that the volume supports.
         * 
         * @return builder
         * 
         */
        public Builder iops(Integer iops) {
            return iops(Output.of(iops));
        }

        /**
         * @param size The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
         * 
         * @return builder
         * 
         */
        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param type The volume type. Valid options are &#39;gp2&#39;, &#39;io1&#39; and &#39;standard&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The volume type. Valid options are &#39;gp2&#39;, &#39;io1&#39; and &#39;standard&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param volumesPerInstance The number of EBS Volumes to attach per instance.
         * 
         * @return builder
         * 
         */
        public Builder volumesPerInstance(@Nullable Output<Integer> volumesPerInstance) {
            $.volumesPerInstance = volumesPerInstance;
            return this;
        }

        /**
         * @param volumesPerInstance The number of EBS Volumes to attach per instance.
         * 
         * @return builder
         * 
         */
        public Builder volumesPerInstance(Integer volumesPerInstance) {
            return volumesPerInstance(Output.of(volumesPerInstance));
        }

        public InstanceGroupEbsConfigGetArgs build() {
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
