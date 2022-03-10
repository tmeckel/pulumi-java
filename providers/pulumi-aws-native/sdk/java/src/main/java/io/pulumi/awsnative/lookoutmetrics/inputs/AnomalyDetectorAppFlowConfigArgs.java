// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AnomalyDetectorAppFlowConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorAppFlowConfigArgs Empty = new AnomalyDetectorAppFlowConfigArgs();

    @InputImport(name="flowName", required=true)
      private final Input<String> flowName;

    public Input<String> getFlowName() {
        return this.flowName;
    }

    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public AnomalyDetectorAppFlowConfigArgs(
        Input<String> flowName,
        Input<String> roleArn) {
        this.flowName = Objects.requireNonNull(flowName, "expected parameter 'flowName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private AnomalyDetectorAppFlowConfigArgs() {
        this.flowName = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorAppFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> flowName;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorAppFlowConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowName = defaults.flowName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder flowName(Input<String> flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }

        public Builder flowName(String flowName) {
            this.flowName = Input.of(Objects.requireNonNull(flowName));
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public AnomalyDetectorAppFlowConfigArgs build() {
            return new AnomalyDetectorAppFlowConfigArgs(flowName, roleArn);
        }
    }
}
