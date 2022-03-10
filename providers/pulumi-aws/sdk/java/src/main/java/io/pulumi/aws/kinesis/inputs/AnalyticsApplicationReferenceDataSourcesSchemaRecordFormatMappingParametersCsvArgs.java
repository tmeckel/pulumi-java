// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs();

    /**
     * The Column Delimiter.
     * 
     */
    @InputImport(name="recordColumnDelimiter", required=true)
      private final Input<String> recordColumnDelimiter;

    public Input<String> getRecordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }

    /**
     * The Row Delimiter.
     * 
     */
    @InputImport(name="recordRowDelimiter", required=true)
      private final Input<String> recordRowDelimiter;

    public Input<String> getRecordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs(
        Input<String> recordColumnDelimiter,
        Input<String> recordRowDelimiter) {
        this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter, "expected parameter 'recordColumnDelimiter' to be non-null");
        this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter, "expected parameter 'recordRowDelimiter' to be non-null");
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs() {
        this.recordColumnDelimiter = Input.empty();
        this.recordRowDelimiter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> recordColumnDelimiter;
        private Input<String> recordRowDelimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumnDelimiter = defaults.recordColumnDelimiter;
    	      this.recordRowDelimiter = defaults.recordRowDelimiter;
        }

        public Builder recordColumnDelimiter(Input<String> recordColumnDelimiter) {
            this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
            return this;
        }

        public Builder recordColumnDelimiter(String recordColumnDelimiter) {
            this.recordColumnDelimiter = Input.of(Objects.requireNonNull(recordColumnDelimiter));
            return this;
        }

        public Builder recordRowDelimiter(Input<String> recordRowDelimiter) {
            this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
            return this;
        }

        public Builder recordRowDelimiter(String recordRowDelimiter) {
            this.recordRowDelimiter = Input.of(Objects.requireNonNull(recordRowDelimiter));
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvArgs(recordColumnDelimiter, recordRowDelimiter);
        }
    }
}
