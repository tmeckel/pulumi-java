// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoElbInfoGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs;
import com.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoGetArgs Empty = new DeploymentGroupLoadBalancerInfoGetArgs();

    /**
     * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    @Import(name="elbInfos")
    private @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> elbInfos;

    /**
     * @return The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    public Optional<Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>>> elbInfos() {
        return Optional.ofNullable(this.elbInfos);
    }

    /**
     * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    @Import(name="targetGroupInfos")
    private @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> targetGroupInfos;

    /**
     * @return The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    public Optional<Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>>> targetGroupInfos() {
        return Optional.ofNullable(this.targetGroupInfos);
    }

    /**
     * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    @Import(name="targetGroupPairInfo")
    private @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> targetGroupPairInfo;

    /**
     * @return The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    public Optional<Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs>> targetGroupPairInfo() {
        return Optional.ofNullable(this.targetGroupPairInfo);
    }

    private DeploymentGroupLoadBalancerInfoGetArgs() {}

    private DeploymentGroupLoadBalancerInfoGetArgs(DeploymentGroupLoadBalancerInfoGetArgs $) {
        this.elbInfos = $.elbInfos;
        this.targetGroupInfos = $.targetGroupInfos;
        this.targetGroupPairInfo = $.targetGroupPairInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupLoadBalancerInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupLoadBalancerInfoGetArgs $;

        public Builder() {
            $ = new DeploymentGroupLoadBalancerInfoGetArgs();
        }

        public Builder(DeploymentGroupLoadBalancerInfoGetArgs defaults) {
            $ = new DeploymentGroupLoadBalancerInfoGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param elbInfos The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
         * 
         * @return builder
         * 
         */
        public Builder elbInfos(@Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> elbInfos) {
            $.elbInfos = elbInfos;
            return this;
        }

        /**
         * @param elbInfos The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
         * 
         * @return builder
         * 
         */
        public Builder elbInfos(List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs> elbInfos) {
            return elbInfos(Output.of(elbInfos));
        }

        /**
         * @param elbInfos The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
         * 
         * @return builder
         * 
         */
        public Builder elbInfos(DeploymentGroupLoadBalancerInfoElbInfoGetArgs... elbInfos) {
            return elbInfos(List.of(elbInfos));
        }

        /**
         * @param targetGroupInfos The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupInfos(@Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> targetGroupInfos) {
            $.targetGroupInfos = targetGroupInfos;
            return this;
        }

        /**
         * @param targetGroupInfos The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupInfos(List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs> targetGroupInfos) {
            return targetGroupInfos(Output.of(targetGroupInfos));
        }

        /**
         * @param targetGroupInfos The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupInfos(DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs... targetGroupInfos) {
            return targetGroupInfos(List.of(targetGroupInfos));
        }

        /**
         * @param targetGroupPairInfo The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupPairInfo(@Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> targetGroupPairInfo) {
            $.targetGroupPairInfo = targetGroupPairInfo;
            return this;
        }

        /**
         * @param targetGroupPairInfo The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
         * 
         * @return builder
         * 
         */
        public Builder targetGroupPairInfo(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs targetGroupPairInfo) {
            return targetGroupPairInfo(Output.of(targetGroupPairInfo));
        }

        public DeploymentGroupLoadBalancerInfoGetArgs build() {
            return $;
        }
    }

}
