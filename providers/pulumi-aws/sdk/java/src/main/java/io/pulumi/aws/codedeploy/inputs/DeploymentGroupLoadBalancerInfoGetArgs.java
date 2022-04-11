// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoElbInfoGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupLoadBalancerInfoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoGetArgs Empty = new DeploymentGroupLoadBalancerInfoGetArgs();

    /**
     * The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    @Import(name="elbInfos")
      private final @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> elbInfos;

    public Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> getElbInfos() {
        return this.elbInfos == null ? Codegen.empty() : this.elbInfos;
    }

    /**
     * The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    @Import(name="targetGroupInfos")
      private final @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> targetGroupInfos;

    public Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> getTargetGroupInfos() {
        return this.targetGroupInfos == null ? Codegen.empty() : this.targetGroupInfos;
    }

    /**
     * The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    @Import(name="targetGroupPairInfo")
      private final @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> targetGroupPairInfo;

    public Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> getTargetGroupPairInfo() {
        return this.targetGroupPairInfo == null ? Codegen.empty() : this.targetGroupPairInfo;
    }

    public DeploymentGroupLoadBalancerInfoGetArgs(
        @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> elbInfos,
        @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> targetGroupInfos,
        @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> targetGroupPairInfo) {
        this.elbInfos = elbInfos;
        this.targetGroupInfos = targetGroupInfos;
        this.targetGroupPairInfo = targetGroupPairInfo;
    }

    private DeploymentGroupLoadBalancerInfoGetArgs() {
        this.elbInfos = Codegen.empty();
        this.targetGroupInfos = Codegen.empty();
        this.targetGroupPairInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> elbInfos;
        private @Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> targetGroupInfos;
        private @Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> targetGroupPairInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupLoadBalancerInfoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elbInfos = defaults.elbInfos;
    	      this.targetGroupInfos = defaults.targetGroupInfos;
    	      this.targetGroupPairInfo = defaults.targetGroupPairInfo;
        }

        public Builder elbInfos(@Nullable Output<List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs>> elbInfos) {
            this.elbInfos = elbInfos;
            return this;
        }
        public Builder elbInfos(@Nullable List<DeploymentGroupLoadBalancerInfoElbInfoGetArgs> elbInfos) {
            this.elbInfos = Codegen.ofNullable(elbInfos);
            return this;
        }
        public Builder elbInfos(DeploymentGroupLoadBalancerInfoElbInfoGetArgs... elbInfos) {
            return elbInfos(List.of(elbInfos));
        }
        public Builder targetGroupInfos(@Nullable Output<List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs>> targetGroupInfos) {
            this.targetGroupInfos = targetGroupInfos;
            return this;
        }
        public Builder targetGroupInfos(@Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs> targetGroupInfos) {
            this.targetGroupInfos = Codegen.ofNullable(targetGroupInfos);
            return this;
        }
        public Builder targetGroupInfos(DeploymentGroupLoadBalancerInfoTargetGroupInfoGetArgs... targetGroupInfos) {
            return targetGroupInfos(List.of(targetGroupInfos));
        }
        public Builder targetGroupPairInfo(@Nullable Output<DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs> targetGroupPairInfo) {
            this.targetGroupPairInfo = targetGroupPairInfo;
            return this;
        }
        public Builder targetGroupPairInfo(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfoGetArgs targetGroupPairInfo) {
            this.targetGroupPairInfo = Codegen.ofNullable(targetGroupPairInfo);
            return this;
        }        public DeploymentGroupLoadBalancerInfoGetArgs build() {
            return new DeploymentGroupLoadBalancerInfoGetArgs(elbInfos, targetGroupInfos, targetGroupPairInfo);
        }
    }
}
