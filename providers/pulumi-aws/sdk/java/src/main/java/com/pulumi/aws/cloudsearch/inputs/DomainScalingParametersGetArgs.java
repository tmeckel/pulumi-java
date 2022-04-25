// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainScalingParametersGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainScalingParametersGetArgs Empty = new DomainScalingParametersGetArgs();

    /**
     * The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    @Import(name="desiredInstanceType")
    private @Nullable Output<String> desiredInstanceType;

    /**
     * @return The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
     * 
     */
    public Optional<Output<String>> desiredInstanceType() {
        return Optional.ofNullable(this.desiredInstanceType);
    }

    /**
     * The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    @Import(name="desiredPartitionCount")
    private @Nullable Output<Integer> desiredPartitionCount;

    /**
     * @return The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
     * 
     */
    public Optional<Output<Integer>> desiredPartitionCount() {
        return Optional.ofNullable(this.desiredPartitionCount);
    }

    /**
     * The number of replicas you want to preconfigure for each index partition.
     * 
     */
    @Import(name="desiredReplicationCount")
    private @Nullable Output<Integer> desiredReplicationCount;

    /**
     * @return The number of replicas you want to preconfigure for each index partition.
     * 
     */
    public Optional<Output<Integer>> desiredReplicationCount() {
        return Optional.ofNullable(this.desiredReplicationCount);
    }

    private DomainScalingParametersGetArgs() {}

    private DomainScalingParametersGetArgs(DomainScalingParametersGetArgs $) {
        this.desiredInstanceType = $.desiredInstanceType;
        this.desiredPartitionCount = $.desiredPartitionCount;
        this.desiredReplicationCount = $.desiredReplicationCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainScalingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainScalingParametersGetArgs $;

        public Builder() {
            $ = new DomainScalingParametersGetArgs();
        }

        public Builder(DomainScalingParametersGetArgs defaults) {
            $ = new DomainScalingParametersGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desiredInstanceType The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder desiredInstanceType(@Nullable Output<String> desiredInstanceType) {
            $.desiredInstanceType = desiredInstanceType;
            return this;
        }

        /**
         * @param desiredInstanceType The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
         * 
         * @return builder
         * 
         */
        public Builder desiredInstanceType(String desiredInstanceType) {
            return desiredInstanceType(Output.of(desiredInstanceType));
        }

        /**
         * @param desiredPartitionCount The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
         * 
         * @return builder
         * 
         */
        public Builder desiredPartitionCount(@Nullable Output<Integer> desiredPartitionCount) {
            $.desiredPartitionCount = desiredPartitionCount;
            return this;
        }

        /**
         * @param desiredPartitionCount The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
         * 
         * @return builder
         * 
         */
        public Builder desiredPartitionCount(Integer desiredPartitionCount) {
            return desiredPartitionCount(Output.of(desiredPartitionCount));
        }

        /**
         * @param desiredReplicationCount The number of replicas you want to preconfigure for each index partition.
         * 
         * @return builder
         * 
         */
        public Builder desiredReplicationCount(@Nullable Output<Integer> desiredReplicationCount) {
            $.desiredReplicationCount = desiredReplicationCount;
            return this;
        }

        /**
         * @param desiredReplicationCount The number of replicas you want to preconfigure for each index partition.
         * 
         * @return builder
         * 
         */
        public Builder desiredReplicationCount(Integer desiredReplicationCount) {
            return desiredReplicationCount(Output.of(desiredReplicationCount));
        }

        public DomainScalingParametersGetArgs build() {
            return $;
        }
    }

}
