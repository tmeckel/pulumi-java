// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1GcsSourceResponse {
    /**
     * @return The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
     */
    private final String inputUri;
    /**
     * @return The format of the source file. Only &#34;text/csv&#34; is supported.
     * 
     */
    private final String mimeType;

    @CustomType.Constructor
    private GoogleCloudDatalabelingV1beta1GcsSourceResponse(
        @CustomType.Parameter("inputUri") String inputUri,
        @CustomType.Parameter("mimeType") String mimeType) {
        this.inputUri = inputUri;
        this.mimeType = mimeType;
    }

    /**
     * @return The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
     */
    public String inputUri() {
        return this.inputUri;
    }
    /**
     * @return The format of the source file. Only &#34;text/csv&#34; is supported.
     * 
     */
    public String mimeType() {
        return this.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1GcsSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String inputUri;
        private String mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1GcsSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder inputUri(String inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }        public GoogleCloudDatalabelingV1beta1GcsSourceResponse build() {
            return new GoogleCloudDatalabelingV1beta1GcsSourceResponse(inputUri, mimeType);
        }
    }
}
