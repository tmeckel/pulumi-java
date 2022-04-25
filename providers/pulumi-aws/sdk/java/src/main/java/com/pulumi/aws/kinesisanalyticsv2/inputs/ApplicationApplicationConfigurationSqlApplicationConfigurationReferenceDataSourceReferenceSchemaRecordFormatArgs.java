// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs();

    /**
     * Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
     * 
     */
    @Import(name="mappingParameters", required=true)
    private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs> mappingParameters;

    /**
     * @return Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
     * 
     */
    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs> mappingParameters() {
        return this.mappingParameters;
    }

    /**
     * The type of record format. Valid values: `CSV`, `JSON`.
     * 
     */
    @Import(name="recordFormatType", required=true)
    private Output<String> recordFormatType;

    /**
     * @return The type of record format. Valid values: `CSV`, `JSON`.
     * 
     */
    public Output<String> recordFormatType() {
        return this.recordFormatType;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs $) {
        this.mappingParameters = $.mappingParameters;
        this.recordFormatType = $.recordFormatType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mappingParameters Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
         * 
         * @return builder
         * 
         */
        public Builder mappingParameters(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs> mappingParameters) {
            $.mappingParameters = mappingParameters;
            return this;
        }

        /**
         * @param mappingParameters Provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
         * 
         * @return builder
         * 
         */
        public Builder mappingParameters(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersArgs mappingParameters) {
            return mappingParameters(Output.of(mappingParameters));
        }

        /**
         * @param recordFormatType The type of record format. Valid values: `CSV`, `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder recordFormatType(Output<String> recordFormatType) {
            $.recordFormatType = recordFormatType;
            return this;
        }

        /**
         * @param recordFormatType The type of record format. Valid values: `CSV`, `JSON`.
         * 
         * @return builder
         * 
         */
        public Builder recordFormatType(String recordFormatType) {
            return recordFormatType(Output.of(recordFormatType));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatArgs build() {
            $.mappingParameters = Objects.requireNonNull($.mappingParameters, "expected parameter 'mappingParameters' to be non-null");
            $.recordFormatType = Objects.requireNonNull($.recordFormatType, "expected parameter 'recordFormatType' to be non-null");
            return $;
        }
    }

}
