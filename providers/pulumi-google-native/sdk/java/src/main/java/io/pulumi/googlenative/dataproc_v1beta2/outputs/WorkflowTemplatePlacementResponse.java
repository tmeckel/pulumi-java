// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.ClusterSelectorResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.ManagedClusterResponse;
import java.util.Objects;

@OutputCustomType
public final class WorkflowTemplatePlacementResponse {
    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is evaluated at the time each job is submitted.
     * 
     */
    private final ClusterSelectorResponse clusterSelector;
    /**
     * Optional. A cluster that is managed by the workflow.
     * 
     */
    private final ManagedClusterResponse managedCluster;

    @OutputCustomType.Constructor({"clusterSelector","managedCluster"})
    private WorkflowTemplatePlacementResponse(
        ClusterSelectorResponse clusterSelector,
        ManagedClusterResponse managedCluster) {
        this.clusterSelector = Objects.requireNonNull(clusterSelector);
        this.managedCluster = Objects.requireNonNull(managedCluster);
    }

    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is evaluated at the time each job is submitted.
     * 
     */
    public ClusterSelectorResponse getClusterSelector() {
        return this.clusterSelector;
    }
    /**
     * Optional. A cluster that is managed by the workflow.
     * 
     */
    public ManagedClusterResponse getManagedCluster() {
        return this.managedCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSelectorResponse clusterSelector;
        private ManagedClusterResponse managedCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSelector = defaults.clusterSelector;
    	      this.managedCluster = defaults.managedCluster;
        }

        public Builder setClusterSelector(ClusterSelectorResponse clusterSelector) {
            this.clusterSelector = Objects.requireNonNull(clusterSelector);
            return this;
        }

        public Builder setManagedCluster(ManagedClusterResponse managedCluster) {
            this.managedCluster = Objects.requireNonNull(managedCluster);
            return this;
        }

        public WorkflowTemplatePlacementResponse build() {
            return new WorkflowTemplatePlacementResponse(clusterSelector, managedCluster);
        }
    }
}
