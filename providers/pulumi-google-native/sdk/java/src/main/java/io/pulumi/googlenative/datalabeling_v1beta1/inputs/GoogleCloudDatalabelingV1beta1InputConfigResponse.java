// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1BigQuerySourceResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1GcsSourceResponse;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1TextMetadataResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration of input data, including data type, location, etc.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1InputConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1InputConfigResponse Empty = new GoogleCloudDatalabelingV1beta1InputConfigResponse();

    /**
     * Optional. The type of annotation to be performed on this data. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @InputImport(name="annotationType", required=true)
    private final String annotationType;

    public String getAnnotationType() {
        return this.annotationType;
    }

    /**
     * Source located in BigQuery. You must specify this field if you are using this InputConfig in an EvaluationJob.
     * 
     */
    @InputImport(name="bigquerySource", required=true)
    private final GoogleCloudDatalabelingV1beta1BigQuerySourceResponse bigquerySource;

    public GoogleCloudDatalabelingV1beta1BigQuerySourceResponse getBigquerySource() {
        return this.bigquerySource;
    }

    /**
     * Optional. Metadata about annotations for the input. You must specify this field if you are using this InputConfig in an EvaluationJob for a model version that performs classification.
     * 
     */
    @InputImport(name="classificationMetadata", required=true)
    private final GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse classificationMetadata;

    public GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse getClassificationMetadata() {
        return this.classificationMetadata;
    }

    /**
     * Data type must be specifed when user tries to import data.
     * 
     */
    @InputImport(name="dataType", required=true)
    private final String dataType;

    public String getDataType() {
        return this.dataType;
    }

    /**
     * Source located in Cloud Storage.
     * 
     */
    @InputImport(name="gcsSource", required=true)
    private final GoogleCloudDatalabelingV1beta1GcsSourceResponse gcsSource;

    public GoogleCloudDatalabelingV1beta1GcsSourceResponse getGcsSource() {
        return this.gcsSource;
    }

    /**
     * Required for text import, as language code must be specified.
     * 
     */
    @InputImport(name="textMetadata", required=true)
    private final GoogleCloudDatalabelingV1beta1TextMetadataResponse textMetadata;

    public GoogleCloudDatalabelingV1beta1TextMetadataResponse getTextMetadata() {
        return this.textMetadata;
    }

    public GoogleCloudDatalabelingV1beta1InputConfigResponse(
        String annotationType,
        GoogleCloudDatalabelingV1beta1BigQuerySourceResponse bigquerySource,
        GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse classificationMetadata,
        String dataType,
        GoogleCloudDatalabelingV1beta1GcsSourceResponse gcsSource,
        GoogleCloudDatalabelingV1beta1TextMetadataResponse textMetadata) {
        this.annotationType = Objects.requireNonNull(annotationType, "expected parameter 'annotationType' to be non-null");
        this.bigquerySource = Objects.requireNonNull(bigquerySource, "expected parameter 'bigquerySource' to be non-null");
        this.classificationMetadata = Objects.requireNonNull(classificationMetadata, "expected parameter 'classificationMetadata' to be non-null");
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.gcsSource = Objects.requireNonNull(gcsSource, "expected parameter 'gcsSource' to be non-null");
        this.textMetadata = Objects.requireNonNull(textMetadata, "expected parameter 'textMetadata' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1InputConfigResponse() {
        this.annotationType = null;
        this.bigquerySource = null;
        this.classificationMetadata = null;
        this.dataType = null;
        this.gcsSource = null;
        this.textMetadata = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1InputConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotationType;
        private GoogleCloudDatalabelingV1beta1BigQuerySourceResponse bigquerySource;
        private GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse classificationMetadata;
        private String dataType;
        private GoogleCloudDatalabelingV1beta1GcsSourceResponse gcsSource;
        private GoogleCloudDatalabelingV1beta1TextMetadataResponse textMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1InputConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationType = defaults.annotationType;
    	      this.bigquerySource = defaults.bigquerySource;
    	      this.classificationMetadata = defaults.classificationMetadata;
    	      this.dataType = defaults.dataType;
    	      this.gcsSource = defaults.gcsSource;
    	      this.textMetadata = defaults.textMetadata;
        }

        public Builder setAnnotationType(String annotationType) {
            this.annotationType = Objects.requireNonNull(annotationType);
            return this;
        }

        public Builder setBigquerySource(GoogleCloudDatalabelingV1beta1BigQuerySourceResponse bigquerySource) {
            this.bigquerySource = Objects.requireNonNull(bigquerySource);
            return this;
        }

        public Builder setClassificationMetadata(GoogleCloudDatalabelingV1beta1ClassificationMetadataResponse classificationMetadata) {
            this.classificationMetadata = Objects.requireNonNull(classificationMetadata);
            return this;
        }

        public Builder setDataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setGcsSource(GoogleCloudDatalabelingV1beta1GcsSourceResponse gcsSource) {
            this.gcsSource = Objects.requireNonNull(gcsSource);
            return this;
        }

        public Builder setTextMetadata(GoogleCloudDatalabelingV1beta1TextMetadataResponse textMetadata) {
            this.textMetadata = Objects.requireNonNull(textMetadata);
            return this;
        }

        public GoogleCloudDatalabelingV1beta1InputConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1InputConfigResponse(annotationType, bigquerySource, classificationMetadata, dataType, gcsSource, textMetadata);
        }
    }
}
