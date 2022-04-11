// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionArgs Empty = new FlowDefinitionArgs();

    /**
     * The name of your flow definition.
     * 
     */
    @Import(name="flowDefinitionName", required=true)
      private final Output<String> flowDefinitionName;

    public Output<String> getFlowDefinitionName() {
        return this.flowDefinitionName;
    }

    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    @Import(name="humanLoopActivationConfig")
      private final @Nullable Output<FlowDefinitionHumanLoopActivationConfigArgs> humanLoopActivationConfig;

    public Output<FlowDefinitionHumanLoopActivationConfigArgs> getHumanLoopActivationConfig() {
        return this.humanLoopActivationConfig == null ? Codegen.empty() : this.humanLoopActivationConfig;
    }

    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    @Import(name="humanLoopConfig", required=true)
      private final Output<FlowDefinitionHumanLoopConfigArgs> humanLoopConfig;

    public Output<FlowDefinitionHumanLoopConfigArgs> getHumanLoopConfig() {
        return this.humanLoopConfig;
    }

    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    @Import(name="humanLoopRequestSource")
      private final @Nullable Output<FlowDefinitionHumanLoopRequestSourceArgs> humanLoopRequestSource;

    public Output<FlowDefinitionHumanLoopRequestSourceArgs> getHumanLoopRequestSource() {
        return this.humanLoopRequestSource == null ? Codegen.empty() : this.humanLoopRequestSource;
    }

    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    @Import(name="outputConfig", required=true)
      private final Output<FlowDefinitionOutputConfigArgs> outputConfig;

    public Output<FlowDefinitionOutputConfigArgs> getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public FlowDefinitionArgs(
        Output<String> flowDefinitionName,
        @Nullable Output<FlowDefinitionHumanLoopActivationConfigArgs> humanLoopActivationConfig,
        Output<FlowDefinitionHumanLoopConfigArgs> humanLoopConfig,
        @Nullable Output<FlowDefinitionHumanLoopRequestSourceArgs> humanLoopRequestSource,
        Output<FlowDefinitionOutputConfigArgs> outputConfig,
        Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags) {
        this.flowDefinitionName = Objects.requireNonNull(flowDefinitionName, "expected parameter 'flowDefinitionName' to be non-null");
        this.humanLoopActivationConfig = humanLoopActivationConfig;
        this.humanLoopConfig = Objects.requireNonNull(humanLoopConfig, "expected parameter 'humanLoopConfig' to be non-null");
        this.humanLoopRequestSource = humanLoopRequestSource;
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private FlowDefinitionArgs() {
        this.flowDefinitionName = Codegen.empty();
        this.humanLoopActivationConfig = Codegen.empty();
        this.humanLoopConfig = Codegen.empty();
        this.humanLoopRequestSource = Codegen.empty();
        this.outputConfig = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> flowDefinitionName;
        private @Nullable Output<FlowDefinitionHumanLoopActivationConfigArgs> humanLoopActivationConfig;
        private Output<FlowDefinitionHumanLoopConfigArgs> humanLoopConfig;
        private @Nullable Output<FlowDefinitionHumanLoopRequestSourceArgs> humanLoopRequestSource;
        private Output<FlowDefinitionOutputConfigArgs> outputConfig;
        private Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flowDefinitionName = defaults.flowDefinitionName;
    	      this.humanLoopActivationConfig = defaults.humanLoopActivationConfig;
    	      this.humanLoopConfig = defaults.humanLoopConfig;
    	      this.humanLoopRequestSource = defaults.humanLoopRequestSource;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder flowDefinitionName(Output<String> flowDefinitionName) {
            this.flowDefinitionName = Objects.requireNonNull(flowDefinitionName);
            return this;
        }
        public Builder flowDefinitionName(String flowDefinitionName) {
            this.flowDefinitionName = Output.of(Objects.requireNonNull(flowDefinitionName));
            return this;
        }
        public Builder humanLoopActivationConfig(@Nullable Output<FlowDefinitionHumanLoopActivationConfigArgs> humanLoopActivationConfig) {
            this.humanLoopActivationConfig = humanLoopActivationConfig;
            return this;
        }
        public Builder humanLoopActivationConfig(@Nullable FlowDefinitionHumanLoopActivationConfigArgs humanLoopActivationConfig) {
            this.humanLoopActivationConfig = Codegen.ofNullable(humanLoopActivationConfig);
            return this;
        }
        public Builder humanLoopConfig(Output<FlowDefinitionHumanLoopConfigArgs> humanLoopConfig) {
            this.humanLoopConfig = Objects.requireNonNull(humanLoopConfig);
            return this;
        }
        public Builder humanLoopConfig(FlowDefinitionHumanLoopConfigArgs humanLoopConfig) {
            this.humanLoopConfig = Output.of(Objects.requireNonNull(humanLoopConfig));
            return this;
        }
        public Builder humanLoopRequestSource(@Nullable Output<FlowDefinitionHumanLoopRequestSourceArgs> humanLoopRequestSource) {
            this.humanLoopRequestSource = humanLoopRequestSource;
            return this;
        }
        public Builder humanLoopRequestSource(@Nullable FlowDefinitionHumanLoopRequestSourceArgs humanLoopRequestSource) {
            this.humanLoopRequestSource = Codegen.ofNullable(humanLoopRequestSource);
            return this;
        }
        public Builder outputConfig(Output<FlowDefinitionOutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }
        public Builder outputConfig(FlowDefinitionOutputConfigArgs outputConfig) {
            this.outputConfig = Output.of(Objects.requireNonNull(outputConfig));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public FlowDefinitionArgs build() {
            return new FlowDefinitionArgs(flowDefinitionName, humanLoopActivationConfig, humanLoopConfig, humanLoopRequestSource, outputConfig, roleArn, tags);
        }
    }
}
