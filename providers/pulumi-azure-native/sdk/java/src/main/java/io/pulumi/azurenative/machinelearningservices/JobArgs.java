// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.inputs.CommandJobArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.SweepJobArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The name and identifier for the Job.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<Either<CommandJobArgs,SweepJobArgs>> properties;

    public Output<Either<CommandJobArgs,SweepJobArgs>> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public JobArgs(
        @Nullable Output<String> id,
        Output<Either<CommandJobArgs,SweepJobArgs>> properties,
        Output<String> resourceGroupName,
        Output<String> workspaceName) {
        this.id = id;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private JobArgs() {
        this.id = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private Output<Either<CommandJobArgs,SweepJobArgs>> properties;
        private Output<String> resourceGroupName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder properties(Output<Either<CommandJobArgs,SweepJobArgs>> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(Either<CommandJobArgs,SweepJobArgs> properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public JobArgs build() {
            return new JobArgs(id, properties, resourceGroupName, workspaceName);
        }
    }
}
