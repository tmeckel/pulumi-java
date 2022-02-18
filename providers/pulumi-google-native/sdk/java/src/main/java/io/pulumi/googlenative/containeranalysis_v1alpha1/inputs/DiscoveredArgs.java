// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveredAnalysisStatus;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveredContinuousAnalysis;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.StatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Provides information about the scan status of a discovered resource.
 * 
 */
public final class DiscoveredArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiscoveredArgs Empty = new DiscoveredArgs();

    /**
     * The status of discovery for the resource.
     * 
     */
    @InputImport(name="analysisStatus")
    private final @Nullable Input<DiscoveredAnalysisStatus> analysisStatus;

    public Input<DiscoveredAnalysisStatus> getAnalysisStatus() {
        return this.analysisStatus == null ? Input.empty() : this.analysisStatus;
    }

    /**
     * When an error is encountered this will contain a LocalizedMessage under details to show to the user. The LocalizedMessage output only and populated by the API.
     * 
     */
    @InputImport(name="analysisStatusError")
    private final @Nullable Input<StatusArgs> analysisStatusError;

    public Input<StatusArgs> getAnalysisStatusError() {
        return this.analysisStatusError == null ? Input.empty() : this.analysisStatusError;
    }

    /**
     * Whether the resource is continuously analyzed.
     * 
     */
    @InputImport(name="continuousAnalysis")
    private final @Nullable Input<DiscoveredContinuousAnalysis> continuousAnalysis;

    public Input<DiscoveredContinuousAnalysis> getContinuousAnalysis() {
        return this.continuousAnalysis == null ? Input.empty() : this.continuousAnalysis;
    }

    /**
     * The CPE of the resource being scanned.
     * 
     */
    @InputImport(name="cpe")
    private final @Nullable Input<String> cpe;

    public Input<String> getCpe() {
        return this.cpe == null ? Input.empty() : this.cpe;
    }

    public DiscoveredArgs(
        @Nullable Input<DiscoveredAnalysisStatus> analysisStatus,
        @Nullable Input<StatusArgs> analysisStatusError,
        @Nullable Input<DiscoveredContinuousAnalysis> continuousAnalysis,
        @Nullable Input<String> cpe) {
        this.analysisStatus = analysisStatus;
        this.analysisStatusError = analysisStatusError;
        this.continuousAnalysis = continuousAnalysis;
        this.cpe = cpe;
    }

    private DiscoveredArgs() {
        this.analysisStatus = Input.empty();
        this.analysisStatusError = Input.empty();
        this.continuousAnalysis = Input.empty();
        this.cpe = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveredArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DiscoveredAnalysisStatus> analysisStatus;
        private @Nullable Input<StatusArgs> analysisStatusError;
        private @Nullable Input<DiscoveredContinuousAnalysis> continuousAnalysis;
        private @Nullable Input<String> cpe;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveredArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisStatus = defaults.analysisStatus;
    	      this.analysisStatusError = defaults.analysisStatusError;
    	      this.continuousAnalysis = defaults.continuousAnalysis;
    	      this.cpe = defaults.cpe;
        }

        public Builder setAnalysisStatus(@Nullable Input<DiscoveredAnalysisStatus> analysisStatus) {
            this.analysisStatus = analysisStatus;
            return this;
        }

        public Builder setAnalysisStatus(@Nullable DiscoveredAnalysisStatus analysisStatus) {
            this.analysisStatus = Input.ofNullable(analysisStatus);
            return this;
        }

        public Builder setAnalysisStatusError(@Nullable Input<StatusArgs> analysisStatusError) {
            this.analysisStatusError = analysisStatusError;
            return this;
        }

        public Builder setAnalysisStatusError(@Nullable StatusArgs analysisStatusError) {
            this.analysisStatusError = Input.ofNullable(analysisStatusError);
            return this;
        }

        public Builder setContinuousAnalysis(@Nullable Input<DiscoveredContinuousAnalysis> continuousAnalysis) {
            this.continuousAnalysis = continuousAnalysis;
            return this;
        }

        public Builder setContinuousAnalysis(@Nullable DiscoveredContinuousAnalysis continuousAnalysis) {
            this.continuousAnalysis = Input.ofNullable(continuousAnalysis);
            return this;
        }

        public Builder setCpe(@Nullable Input<String> cpe) {
            this.cpe = cpe;
            return this;
        }

        public Builder setCpe(@Nullable String cpe) {
            this.cpe = Input.ofNullable(cpe);
            return this;
        }

        public DiscoveredArgs build() {
            return new DiscoveredArgs(analysisStatus, analysisStatusError, continuousAnalysis, cpe);
        }
    }
}
