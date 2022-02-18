// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ModelReferenceResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class JobConfigurationExtractResponse {
    /**
     * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    private final String compression;
    /**
     * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    private final String destinationFormat;
    /**
     * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    private final String destinationUri;
    /**
     * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    private final List<String> destinationUris;
    /**
     * [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.
     * 
     */
    private final String fieldDelimiter;
    /**
     * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    private final Boolean printHeader;
    /**
     * A reference to the model being exported.
     * 
     */
    private final ModelReferenceResponse sourceModel;
    /**
     * A reference to the table being exported.
     * 
     */
    private final TableReferenceResponse sourceTable;
    /**
     * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    private final Boolean useAvroLogicalTypes;

    @OutputCustomType.Constructor({"compression","destinationFormat","destinationUri","destinationUris","fieldDelimiter","printHeader","sourceModel","sourceTable","useAvroLogicalTypes"})
    private JobConfigurationExtractResponse(
        String compression,
        String destinationFormat,
        String destinationUri,
        List<String> destinationUris,
        String fieldDelimiter,
        Boolean printHeader,
        ModelReferenceResponse sourceModel,
        TableReferenceResponse sourceTable,
        Boolean useAvroLogicalTypes) {
        this.compression = Objects.requireNonNull(compression);
        this.destinationFormat = Objects.requireNonNull(destinationFormat);
        this.destinationUri = Objects.requireNonNull(destinationUri);
        this.destinationUris = Objects.requireNonNull(destinationUris);
        this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
        this.printHeader = Objects.requireNonNull(printHeader);
        this.sourceModel = Objects.requireNonNull(sourceModel);
        this.sourceTable = Objects.requireNonNull(sourceTable);
        this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
    }

    /**
     * [Optional] The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE. The default value is NONE. DEFLATE and SNAPPY are only supported for Avro. Not applicable when extracting models.
     * 
     */
    public String getCompression() {
        return this.compression;
    }
    /**
     * [Optional] The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON, PARQUET or AVRO for tables and ML_TF_SAVED_MODEL or ML_XGBOOST_BOOSTER for models. The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV. The default value for models is ML_TF_SAVED_MODEL.
     * 
     */
    public String getDestinationFormat() {
        return this.destinationFormat;
    }
    /**
     * [Pick one] DEPRECATED: Use destinationUris instead, passing only one URI as necessary. The fully-qualified Google Cloud Storage URI where the extracted table should be written.
     * 
     */
    public String getDestinationUri() {
        return this.destinationUri;
    }
    /**
     * [Pick one] A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    public List<String> getDestinationUris() {
        return this.destinationUris;
    }
    /**
     * [Optional] Delimiter to use between fields in the exported data. Default is ','. Not applicable when extracting models.
     * 
     */
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }
    /**
     * [Optional] Whether to print out a header row in the results. Default is true. Not applicable when extracting models.
     * 
     */
    public Boolean getPrintHeader() {
        return this.printHeader;
    }
    /**
     * A reference to the model being exported.
     * 
     */
    public ModelReferenceResponse getSourceModel() {
        return this.sourceModel;
    }
    /**
     * A reference to the table being exported.
     * 
     */
    public TableReferenceResponse getSourceTable() {
        return this.sourceTable;
    }
    /**
     * [Optional] If destinationFormat is set to "AVRO", this flag indicates whether to enable extracting applicable column types (such as TIMESTAMP) to their corresponding AVRO logical types (timestamp-micros), instead of only using their raw types (avro-long). Not applicable when extracting models.
     * 
     */
    public Boolean getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigurationExtractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compression;
        private String destinationFormat;
        private String destinationUri;
        private List<String> destinationUris;
        private String fieldDelimiter;
        private Boolean printHeader;
        private ModelReferenceResponse sourceModel;
        private TableReferenceResponse sourceTable;
        private Boolean useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobConfigurationExtractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.destinationFormat = defaults.destinationFormat;
    	      this.destinationUri = defaults.destinationUri;
    	      this.destinationUris = defaults.destinationUris;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.printHeader = defaults.printHeader;
    	      this.sourceModel = defaults.sourceModel;
    	      this.sourceTable = defaults.sourceTable;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder setCompression(String compression) {
            this.compression = Objects.requireNonNull(compression);
            return this;
        }

        public Builder setDestinationFormat(String destinationFormat) {
            this.destinationFormat = Objects.requireNonNull(destinationFormat);
            return this;
        }

        public Builder setDestinationUri(String destinationUri) {
            this.destinationUri = Objects.requireNonNull(destinationUri);
            return this;
        }

        public Builder setDestinationUris(List<String> destinationUris) {
            this.destinationUris = Objects.requireNonNull(destinationUris);
            return this;
        }

        public Builder setFieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = Objects.requireNonNull(fieldDelimiter);
            return this;
        }

        public Builder setPrintHeader(Boolean printHeader) {
            this.printHeader = Objects.requireNonNull(printHeader);
            return this;
        }

        public Builder setSourceModel(ModelReferenceResponse sourceModel) {
            this.sourceModel = Objects.requireNonNull(sourceModel);
            return this;
        }

        public Builder setSourceTable(TableReferenceResponse sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public Builder setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
            return this;
        }

        public JobConfigurationExtractResponse build() {
            return new JobConfigurationExtractResponse(compression, destinationFormat, destinationUri, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
