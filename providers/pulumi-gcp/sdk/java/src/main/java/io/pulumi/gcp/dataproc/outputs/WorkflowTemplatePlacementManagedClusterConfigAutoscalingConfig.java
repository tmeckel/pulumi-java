// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig {
    /**
     * Optional. The autoscaling policy used by the cluster. Only resource names including projectid and location (region) are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` Note that the policy must be in the same project and Dataproc region.
     * 
     */
    private final @Nullable String policy;

    @OutputCustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig(@OutputCustomType.Parameter("policy") @Nullable String policy) {
        this.policy = policy;
    }

    /**
     * Optional. The autoscaling policy used by the cluster. Only resource names including projectid and location (region) are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` Note that the policy must be in the same project and Dataproc region.
     * 
    */
    public Optional<String> getPolicy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String policy;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigAutoscalingConfig(policy);
        }
    }
}
