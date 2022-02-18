// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.gkehub_v1alpha.outputs.ServiceMeshAnalysisMessageResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServiceMeshFeatureStateResponse {
    /**
     * Results of running Service Mesh analyzers.
     * 
     */
    private final List<ServiceMeshAnalysisMessageResponse> analysisMessages;

    @OutputCustomType.Constructor({"analysisMessages"})
    private ServiceMeshFeatureStateResponse(List<ServiceMeshAnalysisMessageResponse> analysisMessages) {
        this.analysisMessages = Objects.requireNonNull(analysisMessages);
    }

    /**
     * Results of running Service Mesh analyzers.
     * 
     */
    public List<ServiceMeshAnalysisMessageResponse> getAnalysisMessages() {
        return this.analysisMessages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshFeatureStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ServiceMeshAnalysisMessageResponse> analysisMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMeshFeatureStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisMessages = defaults.analysisMessages;
        }

        public Builder setAnalysisMessages(List<ServiceMeshAnalysisMessageResponse> analysisMessages) {
            this.analysisMessages = Objects.requireNonNull(analysisMessages);
            return this;
        }

        public ServiceMeshFeatureStateResponse build() {
            return new ServiceMeshFeatureStateResponse(analysisMessages);
        }
    }
}
