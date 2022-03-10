// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentArgs Empty = new ComputeEnvironmentArgs();

    /**
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
     * 
     */
    @InputImport(name="computeEnvironmentName")
      private final @Nullable Input<String> computeEnvironmentName;

    public Input<String> getComputeEnvironmentName() {
        return this.computeEnvironmentName == null ? Input.empty() : this.computeEnvironmentName;
    }

    /**
     * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `compute_environment_name`.
     * 
     */
    @InputImport(name="computeEnvironmentNamePrefix")
      private final @Nullable Input<String> computeEnvironmentNamePrefix;

    public Input<String> getComputeEnvironmentNamePrefix() {
        return this.computeEnvironmentNamePrefix == null ? Input.empty() : this.computeEnvironmentNamePrefix;
    }

    /**
     * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * 
     */
    @InputImport(name="computeResources")
      private final @Nullable Input<ComputeEnvironmentComputeResourcesArgs> computeResources;

    public Input<ComputeEnvironmentComputeResourcesArgs> getComputeResources() {
        return this.computeResources == null ? Input.empty() : this.computeResources;
    }

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
     * 
     */
    @InputImport(name="serviceRole")
      private final @Nullable Input<String> serviceRole;

    public Input<String> getServiceRole() {
        return this.serviceRole == null ? Input.empty() : this.serviceRole;
    }

    /**
     * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ComputeEnvironmentArgs(
        @Nullable Input<String> computeEnvironmentName,
        @Nullable Input<String> computeEnvironmentNamePrefix,
        @Nullable Input<ComputeEnvironmentComputeResourcesArgs> computeResources,
        @Nullable Input<String> serviceRole,
        @Nullable Input<String> state,
        @Nullable Input<Map<String,String>> tags,
        Input<String> type) {
        this.computeEnvironmentName = computeEnvironmentName;
        this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
        this.computeResources = computeResources;
        this.serviceRole = serviceRole;
        this.state = state;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ComputeEnvironmentArgs() {
        this.computeEnvironmentName = Input.empty();
        this.computeEnvironmentNamePrefix = Input.empty();
        this.computeResources = Input.empty();
        this.serviceRole = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> computeEnvironmentName;
        private @Nullable Input<String> computeEnvironmentNamePrefix;
        private @Nullable Input<ComputeEnvironmentComputeResourcesArgs> computeResources;
        private @Nullable Input<String> serviceRole;
        private @Nullable Input<String> state;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnvironmentName = defaults.computeEnvironmentName;
    	      this.computeEnvironmentNamePrefix = defaults.computeEnvironmentNamePrefix;
    	      this.computeResources = defaults.computeResources;
    	      this.serviceRole = defaults.serviceRole;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder computeEnvironmentName(@Nullable Input<String> computeEnvironmentName) {
            this.computeEnvironmentName = computeEnvironmentName;
            return this;
        }

        public Builder computeEnvironmentName(@Nullable String computeEnvironmentName) {
            this.computeEnvironmentName = Input.ofNullable(computeEnvironmentName);
            return this;
        }

        public Builder computeEnvironmentNamePrefix(@Nullable Input<String> computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
            return this;
        }

        public Builder computeEnvironmentNamePrefix(@Nullable String computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = Input.ofNullable(computeEnvironmentNamePrefix);
            return this;
        }

        public Builder computeResources(@Nullable Input<ComputeEnvironmentComputeResourcesArgs> computeResources) {
            this.computeResources = computeResources;
            return this;
        }

        public Builder computeResources(@Nullable ComputeEnvironmentComputeResourcesArgs computeResources) {
            this.computeResources = Input.ofNullable(computeResources);
            return this;
        }

        public Builder serviceRole(@Nullable Input<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder serviceRole(@Nullable String serviceRole) {
            this.serviceRole = Input.ofNullable(serviceRole);
            return this;
        }

        public Builder state(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ComputeEnvironmentArgs build() {
            return new ComputeEnvironmentArgs(computeEnvironmentName, computeEnvironmentNamePrefix, computeResources, serviceRole, state, tags, type);
        }
    }
}
