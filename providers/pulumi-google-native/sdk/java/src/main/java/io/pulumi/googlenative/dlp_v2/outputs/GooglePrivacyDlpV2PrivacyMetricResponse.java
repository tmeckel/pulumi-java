// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CategoricalStatsConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2KAnonymityConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2KMapEstimationConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LDiversityConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2NumericalStatsConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2PrivacyMetricResponse {
    /**
     * Categorical stats
     * 
     */
    private final GooglePrivacyDlpV2CategoricalStatsConfigResponse categoricalStatsConfig;
    /**
     * delta-presence
     * 
     */
    private final GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse deltaPresenceEstimationConfig;
    /**
     * K-anonymity
     * 
     */
    private final GooglePrivacyDlpV2KAnonymityConfigResponse kAnonymityConfig;
    /**
     * k-map
     * 
     */
    private final GooglePrivacyDlpV2KMapEstimationConfigResponse kMapEstimationConfig;
    /**
     * l-diversity
     * 
     */
    private final GooglePrivacyDlpV2LDiversityConfigResponse lDiversityConfig;
    /**
     * Numerical stats
     * 
     */
    private final GooglePrivacyDlpV2NumericalStatsConfigResponse numericalStatsConfig;

    @OutputCustomType.Constructor({"categoricalStatsConfig","deltaPresenceEstimationConfig","kAnonymityConfig","kMapEstimationConfig","lDiversityConfig","numericalStatsConfig"})
    private GooglePrivacyDlpV2PrivacyMetricResponse(
        GooglePrivacyDlpV2CategoricalStatsConfigResponse categoricalStatsConfig,
        GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse deltaPresenceEstimationConfig,
        GooglePrivacyDlpV2KAnonymityConfigResponse kAnonymityConfig,
        GooglePrivacyDlpV2KMapEstimationConfigResponse kMapEstimationConfig,
        GooglePrivacyDlpV2LDiversityConfigResponse lDiversityConfig,
        GooglePrivacyDlpV2NumericalStatsConfigResponse numericalStatsConfig) {
        this.categoricalStatsConfig = Objects.requireNonNull(categoricalStatsConfig);
        this.deltaPresenceEstimationConfig = Objects.requireNonNull(deltaPresenceEstimationConfig);
        this.kAnonymityConfig = Objects.requireNonNull(kAnonymityConfig);
        this.kMapEstimationConfig = Objects.requireNonNull(kMapEstimationConfig);
        this.lDiversityConfig = Objects.requireNonNull(lDiversityConfig);
        this.numericalStatsConfig = Objects.requireNonNull(numericalStatsConfig);
    }

    /**
     * Categorical stats
     * 
     */
    public GooglePrivacyDlpV2CategoricalStatsConfigResponse getCategoricalStatsConfig() {
        return this.categoricalStatsConfig;
    }
    /**
     * delta-presence
     * 
     */
    public GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse getDeltaPresenceEstimationConfig() {
        return this.deltaPresenceEstimationConfig;
    }
    /**
     * K-anonymity
     * 
     */
    public GooglePrivacyDlpV2KAnonymityConfigResponse getKAnonymityConfig() {
        return this.kAnonymityConfig;
    }
    /**
     * k-map
     * 
     */
    public GooglePrivacyDlpV2KMapEstimationConfigResponse getKMapEstimationConfig() {
        return this.kMapEstimationConfig;
    }
    /**
     * l-diversity
     * 
     */
    public GooglePrivacyDlpV2LDiversityConfigResponse getLDiversityConfig() {
        return this.lDiversityConfig;
    }
    /**
     * Numerical stats
     * 
     */
    public GooglePrivacyDlpV2NumericalStatsConfigResponse getNumericalStatsConfig() {
        return this.numericalStatsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PrivacyMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CategoricalStatsConfigResponse categoricalStatsConfig;
        private GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse deltaPresenceEstimationConfig;
        private GooglePrivacyDlpV2KAnonymityConfigResponse kAnonymityConfig;
        private GooglePrivacyDlpV2KMapEstimationConfigResponse kMapEstimationConfig;
        private GooglePrivacyDlpV2LDiversityConfigResponse lDiversityConfig;
        private GooglePrivacyDlpV2NumericalStatsConfigResponse numericalStatsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PrivacyMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categoricalStatsConfig = defaults.categoricalStatsConfig;
    	      this.deltaPresenceEstimationConfig = defaults.deltaPresenceEstimationConfig;
    	      this.kAnonymityConfig = defaults.kAnonymityConfig;
    	      this.kMapEstimationConfig = defaults.kMapEstimationConfig;
    	      this.lDiversityConfig = defaults.lDiversityConfig;
    	      this.numericalStatsConfig = defaults.numericalStatsConfig;
        }

        public Builder setCategoricalStatsConfig(GooglePrivacyDlpV2CategoricalStatsConfigResponse categoricalStatsConfig) {
            this.categoricalStatsConfig = Objects.requireNonNull(categoricalStatsConfig);
            return this;
        }

        public Builder setDeltaPresenceEstimationConfig(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse deltaPresenceEstimationConfig) {
            this.deltaPresenceEstimationConfig = Objects.requireNonNull(deltaPresenceEstimationConfig);
            return this;
        }

        public Builder setKAnonymityConfig(GooglePrivacyDlpV2KAnonymityConfigResponse kAnonymityConfig) {
            this.kAnonymityConfig = Objects.requireNonNull(kAnonymityConfig);
            return this;
        }

        public Builder setKMapEstimationConfig(GooglePrivacyDlpV2KMapEstimationConfigResponse kMapEstimationConfig) {
            this.kMapEstimationConfig = Objects.requireNonNull(kMapEstimationConfig);
            return this;
        }

        public Builder setLDiversityConfig(GooglePrivacyDlpV2LDiversityConfigResponse lDiversityConfig) {
            this.lDiversityConfig = Objects.requireNonNull(lDiversityConfig);
            return this;
        }

        public Builder setNumericalStatsConfig(GooglePrivacyDlpV2NumericalStatsConfigResponse numericalStatsConfig) {
            this.numericalStatsConfig = Objects.requireNonNull(numericalStatsConfig);
            return this;
        }

        public GooglePrivacyDlpV2PrivacyMetricResponse build() {
            return new GooglePrivacyDlpV2PrivacyMetricResponse(categoricalStatsConfig, deltaPresenceEstimationConfig, kAnonymityConfig, kMapEstimationConfig, lDiversityConfig, numericalStatsConfig);
        }
    }
}
