// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.aws.emr.inputs.ManagedScalingPolicyComputeLimitGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedScalingPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedScalingPolicyState Empty = new ManagedScalingPolicyState();

    /**
     * The id of the EMR cluster
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The id of the EMR cluster
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Configuration block with compute limit settings. Described below.
     * 
     */
    @Import(name="computeLimits")
    private @Nullable Output<List<ManagedScalingPolicyComputeLimitGetArgs>> computeLimits;

    /**
     * @return Configuration block with compute limit settings. Described below.
     * 
     */
    public Optional<Output<List<ManagedScalingPolicyComputeLimitGetArgs>>> computeLimits() {
        return Optional.ofNullable(this.computeLimits);
    }

    private ManagedScalingPolicyState() {}

    private ManagedScalingPolicyState(ManagedScalingPolicyState $) {
        this.clusterId = $.clusterId;
        this.computeLimits = $.computeLimits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedScalingPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedScalingPolicyState $;

        public Builder() {
            $ = new ManagedScalingPolicyState();
        }

        public Builder(ManagedScalingPolicyState defaults) {
            $ = new ManagedScalingPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The id of the EMR cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The id of the EMR cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param computeLimits Configuration block with compute limit settings. Described below.
         * 
         * @return builder
         * 
         */
        public Builder computeLimits(@Nullable Output<List<ManagedScalingPolicyComputeLimitGetArgs>> computeLimits) {
            $.computeLimits = computeLimits;
            return this;
        }

        /**
         * @param computeLimits Configuration block with compute limit settings. Described below.
         * 
         * @return builder
         * 
         */
        public Builder computeLimits(List<ManagedScalingPolicyComputeLimitGetArgs> computeLimits) {
            return computeLimits(Output.of(computeLimits));
        }

        /**
         * @param computeLimits Configuration block with compute limit settings. Described below.
         * 
         * @return builder
         * 
         */
        public Builder computeLimits(ManagedScalingPolicyComputeLimitGetArgs... computeLimits) {
            return computeLimits(List.of(computeLimits));
        }

        public ManagedScalingPolicyState build() {
            return $;
        }
    }

}
