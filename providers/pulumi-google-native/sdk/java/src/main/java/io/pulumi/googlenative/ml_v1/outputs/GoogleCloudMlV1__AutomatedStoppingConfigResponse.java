// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__AutomatedStoppingConfigResponse {
    private final GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig;
    private final GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig;

    @OutputCustomType.Constructor
    private GoogleCloudMlV1__AutomatedStoppingConfigResponse(
        @OutputCustomType.Parameter("decayCurveStoppingConfig") GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig,
        @OutputCustomType.Parameter("medianAutomatedStoppingConfig") GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig) {
        this.decayCurveStoppingConfig = decayCurveStoppingConfig;
        this.medianAutomatedStoppingConfig = medianAutomatedStoppingConfig;
    }

    public GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse getDecayCurveStoppingConfig() {
        return this.decayCurveStoppingConfig;
    }
    public GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse getMedianAutomatedStoppingConfig() {
        return this.medianAutomatedStoppingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AutomatedStoppingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig;
        private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AutomatedStoppingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decayCurveStoppingConfig = defaults.decayCurveStoppingConfig;
    	      this.medianAutomatedStoppingConfig = defaults.medianAutomatedStoppingConfig;
        }

        public Builder decayCurveStoppingConfig(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig) {
            this.decayCurveStoppingConfig = Objects.requireNonNull(decayCurveStoppingConfig);
            return this;
        }

        public Builder medianAutomatedStoppingConfig(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig) {
            this.medianAutomatedStoppingConfig = Objects.requireNonNull(medianAutomatedStoppingConfig);
            return this;
        }
        public GoogleCloudMlV1__AutomatedStoppingConfigResponse build() {
            return new GoogleCloudMlV1__AutomatedStoppingConfigResponse(decayCurveStoppingConfig, medianAutomatedStoppingConfig);
        }
    }
}
