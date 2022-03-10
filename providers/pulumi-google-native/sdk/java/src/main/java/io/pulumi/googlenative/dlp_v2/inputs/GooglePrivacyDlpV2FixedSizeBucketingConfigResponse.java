// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.Double;
import java.util.Objects;


/**
 * Buckets values based on fixed size ranges. The Bucketing transformation can provide all of this functionality, but requires more configuration. This message is provided as a convenience to the user for simple bucketing strategies. The transformed value will be a hyphenated string of {lower_bound}-{upper_bound}. For example, if lower_bound = 10 and upper_bound = 20, all values that are within this bucket will be replaced with "10-20". This can be used on data of type: double, long. If the bound Value type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing. See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
 * 
 */
public final class GooglePrivacyDlpV2FixedSizeBucketingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2FixedSizeBucketingConfigResponse Empty = new GooglePrivacyDlpV2FixedSizeBucketingConfigResponse();

    /**
     * Size of each bucket (except for minimum and maximum buckets). So if `lower_bound` = 10, `upper_bound` = 89, and `bucket_size` = 10, then the following buckets would be used: -10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-89, 89+. Precision up to 2 decimals works.
     * 
     */
    @InputImport(name="bucketSize", required=true)
      private final Double bucketSize;

    public Double getBucketSize() {
        return this.bucketSize;
    }

    /**
     * Lower bound value of buckets. All values less than `lower_bound` are grouped together into a single bucket; for example if `lower_bound` = 10, then all values less than 10 are replaced with the value "-10".
     * 
     */
    @InputImport(name="lowerBound", required=true)
      private final GooglePrivacyDlpV2ValueResponse lowerBound;

    public GooglePrivacyDlpV2ValueResponse getLowerBound() {
        return this.lowerBound;
    }

    /**
     * Upper bound value of buckets. All values greater than upper_bound are grouped together into a single bucket; for example if `upper_bound` = 89, then all values greater than 89 are replaced with the value "89+".
     * 
     */
    @InputImport(name="upperBound", required=true)
      private final GooglePrivacyDlpV2ValueResponse upperBound;

    public GooglePrivacyDlpV2ValueResponse getUpperBound() {
        return this.upperBound;
    }

    public GooglePrivacyDlpV2FixedSizeBucketingConfigResponse(
        Double bucketSize,
        GooglePrivacyDlpV2ValueResponse lowerBound,
        GooglePrivacyDlpV2ValueResponse upperBound) {
        this.bucketSize = Objects.requireNonNull(bucketSize, "expected parameter 'bucketSize' to be non-null");
        this.lowerBound = Objects.requireNonNull(lowerBound, "expected parameter 'lowerBound' to be non-null");
        this.upperBound = Objects.requireNonNull(upperBound, "expected parameter 'upperBound' to be non-null");
    }

    private GooglePrivacyDlpV2FixedSizeBucketingConfigResponse() {
        this.bucketSize = null;
        this.lowerBound = null;
        this.upperBound = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FixedSizeBucketingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double bucketSize;
        private GooglePrivacyDlpV2ValueResponse lowerBound;
        private GooglePrivacyDlpV2ValueResponse upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FixedSizeBucketingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.lowerBound = defaults.lowerBound;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder bucketSize(Double bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder lowerBound(GooglePrivacyDlpV2ValueResponse lowerBound) {
            this.lowerBound = Objects.requireNonNull(lowerBound);
            return this;
        }

        public Builder upperBound(GooglePrivacyDlpV2ValueResponse upperBound) {
            this.upperBound = Objects.requireNonNull(upperBound);
            return this;
        }
        public GooglePrivacyDlpV2FixedSizeBucketingConfigResponse build() {
            return new GooglePrivacyDlpV2FixedSizeBucketingConfigResponse(bucketSize, lowerBound, upperBound);
        }
    }
}
