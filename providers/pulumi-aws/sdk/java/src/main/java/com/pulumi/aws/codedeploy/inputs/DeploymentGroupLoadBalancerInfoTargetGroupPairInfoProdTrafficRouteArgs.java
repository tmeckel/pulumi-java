// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs Empty = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs();

    /**
     * List of Amazon Resource Names (ARNs) of the load balancer listeners.
     * 
     */
    @Import(name="listenerArns", required=true)
    private Output<List<String>> listenerArns;

    /**
     * @return List of Amazon Resource Names (ARNs) of the load balancer listeners.
     * 
     */
    public Output<List<String>> listenerArns() {
        return this.listenerArns;
    }

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs() {}

    private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs $) {
        this.listenerArns = $.listenerArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs $;

        public Builder() {
            $ = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs();
        }

        public Builder(DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs defaults) {
            $ = new DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listenerArns List of Amazon Resource Names (ARNs) of the load balancer listeners.
         * 
         * @return builder
         * 
         */
        public Builder listenerArns(Output<List<String>> listenerArns) {
            $.listenerArns = listenerArns;
            return this;
        }

        /**
         * @param listenerArns List of Amazon Resource Names (ARNs) of the load balancer listeners.
         * 
         * @return builder
         * 
         */
        public Builder listenerArns(List<String> listenerArns) {
            return listenerArns(Output.of(listenerArns));
        }

        /**
         * @param listenerArns List of Amazon Resource Names (ARNs) of the load balancer listeners.
         * 
         * @return builder
         * 
         */
        public Builder listenerArns(String... listenerArns) {
            return listenerArns(List.of(listenerArns));
        }

        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs build() {
            $.listenerArns = Objects.requireNonNull($.listenerArns, "expected parameter 'listenerArns' to be non-null");
            return $;
        }
    }

}
