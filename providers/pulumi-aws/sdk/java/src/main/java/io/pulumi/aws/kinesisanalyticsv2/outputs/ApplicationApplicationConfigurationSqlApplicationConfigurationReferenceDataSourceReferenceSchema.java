// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema {
    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
     */
    private final List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn> recordColumns;
    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
     */
    private final @Nullable String recordEncoding;
    /**
     * Specifies the format of the records on the streaming source.
     * 
     */
    private final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat recordFormat;

    @OutputCustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema(
        @OutputCustomType.Parameter("recordColumns") List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn> recordColumns,
        @OutputCustomType.Parameter("recordEncoding") @Nullable String recordEncoding,
        @OutputCustomType.Parameter("recordFormat") ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat recordFormat) {
        this.recordColumns = recordColumns;
        this.recordEncoding = recordEncoding;
        this.recordFormat = recordFormat;
    }

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
    */
    public List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn> getRecordColumns() {
        return this.recordColumns;
    }
    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
    */
    public Optional<String> getRecordEncoding() {
        return Optional.ofNullable(this.recordEncoding);
    }
    /**
     * Specifies the format of the records on the streaming source.
     * 
    */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat getRecordFormat() {
        return this.recordFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn> recordColumns;
        private @Nullable String recordEncoding;
        private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat recordFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumns = defaults.recordColumns;
    	      this.recordEncoding = defaults.recordEncoding;
    	      this.recordFormat = defaults.recordFormat;
        }

        public Builder recordColumns(List<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordColumn> recordColumns) {
            this.recordColumns = Objects.requireNonNull(recordColumns);
            return this;
        }

        public Builder recordEncoding(@Nullable String recordEncoding) {
            this.recordEncoding = recordEncoding;
            return this;
        }

        public Builder recordFormat(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormat recordFormat) {
            this.recordFormat = Objects.requireNonNull(recordFormat);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchema(recordColumns, recordEncoding, recordFormat);
        }
    }
}
