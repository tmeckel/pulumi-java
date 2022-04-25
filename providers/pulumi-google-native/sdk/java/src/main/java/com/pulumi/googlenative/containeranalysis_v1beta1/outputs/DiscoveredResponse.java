// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1beta1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DiscoveredResponse {
    /**
     * @return The status of discovery for the resource.
     * 
     */
    private final String analysisStatus;
    /**
     * @return When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
     * 
     */
    private final StatusResponse analysisStatusError;
    /**
     * @return Whether the resource is continuously analyzed.
     * 
     */
    private final String continuousAnalysis;

    @CustomType.Constructor
    private DiscoveredResponse(
        @CustomType.Parameter("analysisStatus") String analysisStatus,
        @CustomType.Parameter("analysisStatusError") StatusResponse analysisStatusError,
        @CustomType.Parameter("continuousAnalysis") String continuousAnalysis) {
        this.analysisStatus = analysisStatus;
        this.analysisStatusError = analysisStatusError;
        this.continuousAnalysis = continuousAnalysis;
    }

    /**
     * @return The status of discovery for the resource.
     * 
     */
    public String analysisStatus() {
        return this.analysisStatus;
    }
    /**
     * @return When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage is output only and populated by the API.
     * 
     */
    public StatusResponse analysisStatusError() {
        return this.analysisStatusError;
    }
    /**
     * @return Whether the resource is continuously analyzed.
     * 
     */
    public String continuousAnalysis() {
        return this.continuousAnalysis;
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

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveredResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
        }

        public Builder analysisStatus(String analysisStatus) {
            this.analysisStatus = Objects.requireNonNull(analysisStatus);
            return this;
        }
        public Builder analysisStatusError(StatusResponse analysisStatusError) {
            this.analysisStatusError = Objects.requireNonNull(analysisStatusError);
            return this;
        }
        public Builder continuousAnalysis(String continuousAnalysis) {
            this.continuousAnalysis = Objects.requireNonNull(continuousAnalysis);
            return this;
        }        public DiscoveredResponse build() {
            return new DiscoveredResponse(analysisStatus, analysisStatusError, continuousAnalysis);
        }
    }
}
