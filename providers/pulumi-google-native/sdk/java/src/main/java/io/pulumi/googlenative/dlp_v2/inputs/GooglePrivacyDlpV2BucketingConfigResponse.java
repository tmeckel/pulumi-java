// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BucketResponse;
import java.util.List;
import java.util.Objects;


/**
 * Generalization function that buckets values based on ranges. The ranges and replacement values are dynamically provided by the user for custom behavior, such as 1-30 -> LOW 31-65 -> MEDIUM 66-100 -> HIGH This can be used on data of type: number, long, string, timestamp. If the bound `Value` type differs from the type of data being transformed, we will first attempt converting the type of the data to be transformed to match the type of the bound before comparing. See https://cloud.google.com/dlp/docs/concepts-bucketing to learn more.
 * 
 */
public final class GooglePrivacyDlpV2BucketingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2BucketingConfigResponse Empty = new GooglePrivacyDlpV2BucketingConfigResponse();

    /**
     * Set of buckets. Ranges must be non-overlapping.
     * 
     */
    @InputImport(name="buckets", required=true)
      private final List<GooglePrivacyDlpV2BucketResponse> buckets;

    public List<GooglePrivacyDlpV2BucketResponse> getBuckets() {
        return this.buckets;
    }

    public GooglePrivacyDlpV2BucketingConfigResponse(List<GooglePrivacyDlpV2BucketResponse> buckets) {
        this.buckets = Objects.requireNonNull(buckets, "expected parameter 'buckets' to be non-null");
    }

    private GooglePrivacyDlpV2BucketingConfigResponse() {
        this.buckets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BucketingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2BucketResponse> buckets;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BucketingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buckets = defaults.buckets;
        }

        public Builder buckets(List<GooglePrivacyDlpV2BucketResponse> buckets) {
            this.buckets = Objects.requireNonNull(buckets);
            return this;
        }
        public GooglePrivacyDlpV2BucketingConfigResponse build() {
            return new GooglePrivacyDlpV2BucketingConfigResponse(buckets);
        }
    }
}
