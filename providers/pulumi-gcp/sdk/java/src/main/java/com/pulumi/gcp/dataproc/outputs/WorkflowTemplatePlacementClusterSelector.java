// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementClusterSelector {
    /**
     * @return Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    private final Map<String,String> clusterLabels;
    /**
     * @return Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the &#34;global&#34; region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    private final @Nullable String zone;

    @CustomType.Constructor
    private WorkflowTemplatePlacementClusterSelector(
        @CustomType.Parameter("clusterLabels") Map<String,String> clusterLabels,
        @CustomType.Parameter("zone") @Nullable String zone) {
        this.clusterLabels = clusterLabels;
        this.zone = zone;
    }

    /**
     * @return Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    public Map<String,String> clusterLabels() {
        return this.clusterLabels;
    }
    /**
     * @return Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the &#34;global&#34; region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementClusterSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementClusterSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        public Builder clusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }        public WorkflowTemplatePlacementClusterSelector build() {
            return new WorkflowTemplatePlacementClusterSelector(clusterLabels, zone);
        }
    }
}
