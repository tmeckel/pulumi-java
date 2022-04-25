// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Source of the Cloud Storage file to be imported.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1GcsSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1GcsSourceArgs Empty = new GoogleCloudDatalabelingV1beta1GcsSourceArgs();

    /**
     * The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
     */
    @Import(name="inputUri", required=true)
    private Output<String> inputUri;

    /**
     * @return The input URI of source file. This must be a Cloud Storage path (`gs://...`).
     * 
     */
    public Output<String> inputUri() {
        return this.inputUri;
    }

    /**
     * The format of the source file. Only &#34;text/csv&#34; is supported.
     * 
     */
    @Import(name="mimeType", required=true)
    private Output<String> mimeType;

    /**
     * @return The format of the source file. Only &#34;text/csv&#34; is supported.
     * 
     */
    public Output<String> mimeType() {
        return this.mimeType;
    }

    private GoogleCloudDatalabelingV1beta1GcsSourceArgs() {}

    private GoogleCloudDatalabelingV1beta1GcsSourceArgs(GoogleCloudDatalabelingV1beta1GcsSourceArgs $) {
        this.inputUri = $.inputUri;
        this.mimeType = $.mimeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatalabelingV1beta1GcsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatalabelingV1beta1GcsSourceArgs $;

        public Builder() {
            $ = new GoogleCloudDatalabelingV1beta1GcsSourceArgs();
        }

        public Builder(GoogleCloudDatalabelingV1beta1GcsSourceArgs defaults) {
            $ = new GoogleCloudDatalabelingV1beta1GcsSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputUri The input URI of source file. This must be a Cloud Storage path (`gs://...`).
         * 
         * @return builder
         * 
         */
        public Builder inputUri(Output<String> inputUri) {
            $.inputUri = inputUri;
            return this;
        }

        /**
         * @param inputUri The input URI of source file. This must be a Cloud Storage path (`gs://...`).
         * 
         * @return builder
         * 
         */
        public Builder inputUri(String inputUri) {
            return inputUri(Output.of(inputUri));
        }

        /**
         * @param mimeType The format of the source file. Only &#34;text/csv&#34; is supported.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(Output<String> mimeType) {
            $.mimeType = mimeType;
            return this;
        }

        /**
         * @param mimeType The format of the source file. Only &#34;text/csv&#34; is supported.
         * 
         * @return builder
         * 
         */
        public Builder mimeType(String mimeType) {
            return mimeType(Output.of(mimeType));
        }

        public GoogleCloudDatalabelingV1beta1GcsSourceArgs build() {
            $.inputUri = Objects.requireNonNull($.inputUri, "expected parameter 'inputUri' to be non-null");
            $.mimeType = Objects.requireNonNull($.mimeType, "expected parameter 'mimeType' to be non-null");
            return $;
        }
    }

}
