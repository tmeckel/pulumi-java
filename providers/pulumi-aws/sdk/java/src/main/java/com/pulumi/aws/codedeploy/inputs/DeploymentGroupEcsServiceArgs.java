// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentGroupEcsServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupEcsServiceArgs Empty = new DeploymentGroupEcsServiceArgs();

    /**
     * The name of the ECS cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the ECS cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the ECS service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the ECS service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private DeploymentGroupEcsServiceArgs() {}

    private DeploymentGroupEcsServiceArgs(DeploymentGroupEcsServiceArgs $) {
        this.clusterName = $.clusterName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentGroupEcsServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentGroupEcsServiceArgs $;

        public Builder() {
            $ = new DeploymentGroupEcsServiceArgs();
        }

        public Builder(DeploymentGroupEcsServiceArgs defaults) {
            $ = new DeploymentGroupEcsServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the ECS cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the ECS cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param serviceName The name of the ECS service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the ECS service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public DeploymentGroupEcsServiceArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
