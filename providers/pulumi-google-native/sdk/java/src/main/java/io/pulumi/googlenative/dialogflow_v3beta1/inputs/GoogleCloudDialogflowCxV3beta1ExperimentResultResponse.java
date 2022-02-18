// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The inference result which includes an objective metric to optimize and the confidence interval.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ExperimentResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ExperimentResultResponse Empty = new GoogleCloudDialogflowCxV3beta1ExperimentResultResponse();

    /**
     * The last time the experiment's stats data was updated. Will have default value if stats have never been computed for this experiment.
     * 
     */
    @InputImport(name="lastUpdateTime", required=true)
    private final String lastUpdateTime;

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Version variants and metrics.
     * 
     */
    @InputImport(name="versionMetrics", required=true)
    private final List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics;

    public List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> getVersionMetrics() {
        return this.versionMetrics;
    }

    public GoogleCloudDialogflowCxV3beta1ExperimentResultResponse(
        String lastUpdateTime,
        List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics) {
        this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime, "expected parameter 'lastUpdateTime' to be non-null");
        this.versionMetrics = Objects.requireNonNull(versionMetrics, "expected parameter 'versionMetrics' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ExperimentResultResponse() {
        this.lastUpdateTime = null;
        this.versionMetrics = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ExperimentResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdateTime;
        private List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ExperimentResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.versionMetrics = defaults.versionMetrics;
        }

        public Builder setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }

        public Builder setVersionMetrics(List<GoogleCloudDialogflowCxV3beta1ExperimentResultVersionMetricsResponse> versionMetrics) {
            this.versionMetrics = Objects.requireNonNull(versionMetrics);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ExperimentResultResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ExperimentResultResponse(lastUpdateTime, versionMetrics);
        }
    }
}
