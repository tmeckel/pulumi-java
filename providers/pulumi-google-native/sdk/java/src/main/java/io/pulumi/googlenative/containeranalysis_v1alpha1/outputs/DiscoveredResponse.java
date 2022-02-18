// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DiscoveredResponse {
    /**
     * The status of discovery for the resource.
     * 
     */
    private final String analysisStatus;
    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    private final StatusResponse analysisStatusError;
    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    private final String continuousAnalysis;
    /**
     * The CPE of the resource being scanned.
     * 
     */
    private final String cpe;

    @OutputCustomType.Constructor({"analysisStatus","analysisStatusError","continuousAnalysis","cpe"})
    private DiscoveredResponse(
        String analysisStatus,
        StatusResponse analysisStatusError,
        String continuousAnalysis,
        String cpe) {
        this.analysisStatus = Objects.requireNonNull(analysisStatus);
        this.analysisStatusError = Objects.requireNonNull(analysisStatusError);
        this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis);
        this.cpe = Objects.requireNonNull(cpe);
    }

    /**
     * The status of discovery for the resource.
     * 
     */
    public String getAnalysisStatus() {
        return this.analysisStatus;
    }
    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    public StatusResponse getAnalysisStatusError() {
        return this.analysisStatusError;
    }
    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    public String getContinuousAnalysis() {
        return this.continuousAnalysis;
    }
    /**
     * The CPE of the resource being scanned.
     * 
     */
    public String getCpe() {
        return this.cpe;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveredResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String analysisStatus;
        private StatusResponse analysisStatusError;
        private String continuousAnalysis;
        private String cpe;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveredResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
        }

        public Builder setAnalysisStatus(String analysisStatus) {
            this.analysisStatus = Objects.requireNonNull(analysisStatus);
            return this;
        }

        public Builder setAnalysisStatusError(StatusResponse analysisStatusError) {
            this.analysisStatusError = Objects.requireNonNull(analysisStatusError);
            return this;
        }

        public Builder setContinuousAnalysis(String continuousAnalysis) {
            this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis);
            return this;
        }

        public Builder setCpe(String cpe) {
            this.cpe = Objects.requireNonNull(cpe);
            return this;
        }

        public DiscoveredResponse build() {
            return new DiscoveredResponse(analysisStatus, analysisStatusError, continuousAnalysis, cpe);
        }
    }
}
