// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ClusterStepHadoopJarStepGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterStepGetArgs Empty = new ClusterStepGetArgs();

    /**
     * Action to take if the step fails. Valid values: `TERMINATE_JOB_FLOW`, `TERMINATE_CLUSTER`, `CANCEL_AND_WAIT`, and `CONTINUE`
     * 
     */
    @Import(name="actionOnFailure", required=true)
      private final Output<String> actionOnFailure;

    public Output<String> getActionOnFailure() {
        return this.actionOnFailure;
    }

    /**
     * JAR file used for the step. See below.
     * 
     */
    @Import(name="hadoopJarStep", required=true)
      private final Output<ClusterStepHadoopJarStepGetArgs> hadoopJarStep;

    public Output<ClusterStepHadoopJarStepGetArgs> getHadoopJarStep() {
        return this.hadoopJarStep;
    }

    /**
     * Name of the step.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ClusterStepGetArgs(
        Output<String> actionOnFailure,
        Output<ClusterStepHadoopJarStepGetArgs> hadoopJarStep,
        Output<String> name) {
        this.actionOnFailure = Objects.requireNonNull(actionOnFailure, "expected parameter 'actionOnFailure' to be non-null");
        this.hadoopJarStep = Objects.requireNonNull(hadoopJarStep, "expected parameter 'hadoopJarStep' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ClusterStepGetArgs() {
        this.actionOnFailure = Codegen.empty();
        this.hadoopJarStep = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> actionOnFailure;
        private Output<ClusterStepHadoopJarStepGetArgs> hadoopJarStep;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionOnFailure = defaults.actionOnFailure;
    	      this.hadoopJarStep = defaults.hadoopJarStep;
    	      this.name = defaults.name;
        }

        public Builder actionOnFailure(Output<String> actionOnFailure) {
            this.actionOnFailure = Objects.requireNonNull(actionOnFailure);
            return this;
        }
        public Builder actionOnFailure(String actionOnFailure) {
            this.actionOnFailure = Output.of(Objects.requireNonNull(actionOnFailure));
            return this;
        }
        public Builder hadoopJarStep(Output<ClusterStepHadoopJarStepGetArgs> hadoopJarStep) {
            this.hadoopJarStep = Objects.requireNonNull(hadoopJarStep);
            return this;
        }
        public Builder hadoopJarStep(ClusterStepHadoopJarStepGetArgs hadoopJarStep) {
            this.hadoopJarStep = Output.of(Objects.requireNonNull(hadoopJarStep));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ClusterStepGetArgs build() {
            return new ClusterStepGetArgs(actionOnFailure, hadoopJarStep, name);
        }
    }
}
