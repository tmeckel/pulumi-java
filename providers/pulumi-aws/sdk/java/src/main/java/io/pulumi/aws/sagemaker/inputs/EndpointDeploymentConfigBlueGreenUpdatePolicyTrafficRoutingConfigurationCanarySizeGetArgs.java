// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs Empty = new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs();

    /**
     * Specifies the endpoint capacity type. Valid values are: `INSTANCE_COUNT`, or `CAPACITY_PERCENT`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * Defines the capacity size, either as a number of instances or a capacity percentage.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value;
    }

    public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs(
        Input<String> type,
        Input<Integer> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;
        private Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder value(Input<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(Integer value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs build() {
            return new EndpointDeploymentConfigBlueGreenUpdatePolicyTrafficRoutingConfigurationCanarySizeGetArgs(type, value);
        }
    }
}
