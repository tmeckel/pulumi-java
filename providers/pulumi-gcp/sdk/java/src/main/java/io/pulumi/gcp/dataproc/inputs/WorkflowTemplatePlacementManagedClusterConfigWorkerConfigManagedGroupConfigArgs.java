// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs();

    @InputImport(name="instanceGroupManagerName")
      private final @Nullable Input<String> instanceGroupManagerName;

    public Input<String> getInstanceGroupManagerName() {
        return this.instanceGroupManagerName == null ? Input.empty() : this.instanceGroupManagerName;
    }

    @InputImport(name="instanceTemplateName")
      private final @Nullable Input<String> instanceTemplateName;

    public Input<String> getInstanceTemplateName() {
        return this.instanceTemplateName == null ? Input.empty() : this.instanceTemplateName;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs(
        @Nullable Input<String> instanceGroupManagerName,
        @Nullable Input<String> instanceTemplateName) {
        this.instanceGroupManagerName = instanceGroupManagerName;
        this.instanceTemplateName = instanceTemplateName;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs() {
        this.instanceGroupManagerName = Input.empty();
        this.instanceTemplateName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceGroupManagerName;
        private @Nullable Input<String> instanceTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        public Builder instanceGroupManagerName(@Nullable Input<String> instanceGroupManagerName) {
            this.instanceGroupManagerName = instanceGroupManagerName;
            return this;
        }

        public Builder instanceGroupManagerName(@Nullable String instanceGroupManagerName) {
            this.instanceGroupManagerName = Input.ofNullable(instanceGroupManagerName);
            return this;
        }

        public Builder instanceTemplateName(@Nullable Input<String> instanceTemplateName) {
            this.instanceTemplateName = instanceTemplateName;
            return this;
        }

        public Builder instanceTemplateName(@Nullable String instanceTemplateName) {
            this.instanceTemplateName = Input.ofNullable(instanceTemplateName);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs(instanceGroupManagerName, instanceTemplateName);
        }
    }
}
