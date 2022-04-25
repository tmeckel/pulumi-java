// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs Empty = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs();

    /**
     * Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     * 
     */
    @Import(name="value", required=true)
    private Output<Integer> value;

    /**
     * @return Defines the capacity size, either as a number of instances or a capacity percentage.
     * 
     */
    public Output<Integer> value() {
        return this.value;
    }

    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs() {}

    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs $;

        public Builder() {
            $ = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs();
        }

        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs defaults) {
            $ = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Defines the capacity size, either as a number of instances or a capacity percentage.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Defines the capacity size, either as a number of instances or a capacity percentage.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
