// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CategoricalStatsResultResponse {
    /**
     * Histogram of value frequencies in the column.
     * 
     */
    private final List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets;

    @OutputCustomType.Constructor({"valueFrequencyHistogramBuckets"})
    private GooglePrivacyDlpV2CategoricalStatsResultResponse(List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets) {
        this.valueFrequencyHistogramBuckets = Objects.requireNonNull(valueFrequencyHistogramBuckets);
    }

    /**
     * Histogram of value frequencies in the column.
     * 
     */
    public List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> getValueFrequencyHistogramBuckets() {
        return this.valueFrequencyHistogramBuckets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CategoricalStatsResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CategoricalStatsResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.valueFrequencyHistogramBuckets = defaults.valueFrequencyHistogramBuckets;
        }

        public Builder setValueFrequencyHistogramBuckets(List<GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse> valueFrequencyHistogramBuckets) {
            this.valueFrequencyHistogramBuckets = Objects.requireNonNull(valueFrequencyHistogramBuckets);
            return this;
        }

        public GooglePrivacyDlpV2CategoricalStatsResultResponse build() {
            return new GooglePrivacyDlpV2CategoricalStatsResultResponse(valueFrequencyHistogramBuckets);
        }
    }
}
