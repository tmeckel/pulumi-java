// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs();

    /**
     * Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
     */
    @Import(name="recordColumns", required=true)
    private Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs>> recordColumns;

    /**
     * @return Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
     * 
     */
    public Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs>> recordColumns() {
        return this.recordColumns;
    }

    /**
     * Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
     */
    @Import(name="recordEncoding")
    private @Nullable Output<String> recordEncoding;

    /**
     * @return Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
     * 
     */
    public Optional<Output<String>> recordEncoding() {
        return Optional.ofNullable(this.recordEncoding);
    }

    /**
     * Specifies the format of the records on the streaming source.
     * 
     */
    @Import(name="recordFormat", required=true)
    private Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs> recordFormat;

    /**
     * @return Specifies the format of the records on the streaming source.
     * 
     */
    public Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs> recordFormat() {
        return this.recordFormat;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs() {}

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs $) {
        this.recordColumns = $.recordColumns;
        this.recordEncoding = $.recordEncoding;
        this.recordFormat = $.recordFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs();
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs defaults) {
            $ = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recordColumns Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder recordColumns(Output<List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs>> recordColumns) {
            $.recordColumns = recordColumns;
            return this;
        }

        /**
         * @param recordColumns Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder recordColumns(List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs> recordColumns) {
            return recordColumns(Output.of(recordColumns));
        }

        /**
         * @param recordColumns Describes the mapping of each data element in the streaming source to the corresponding column in the in-application stream.
         * 
         * @return builder
         * 
         */
        public Builder recordColumns(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordColumnArgs... recordColumns) {
            return recordColumns(List.of(recordColumns));
        }

        /**
         * @param recordEncoding Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
         * 
         * @return builder
         * 
         */
        public Builder recordEncoding(@Nullable Output<String> recordEncoding) {
            $.recordEncoding = recordEncoding;
            return this;
        }

        /**
         * @param recordEncoding Specifies the encoding of the records in the streaming source. For example, `UTF-8`.
         * 
         * @return builder
         * 
         */
        public Builder recordEncoding(String recordEncoding) {
            return recordEncoding(Output.of(recordEncoding));
        }

        /**
         * @param recordFormat Specifies the format of the records on the streaming source.
         * 
         * @return builder
         * 
         */
        public Builder recordFormat(Output<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs> recordFormat) {
            $.recordFormat = recordFormat;
            return this;
        }

        /**
         * @param recordFormat Specifies the format of the records on the streaming source.
         * 
         * @return builder
         * 
         */
        public Builder recordFormat(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaRecordFormatArgs recordFormat) {
            return recordFormat(Output.of(recordFormat));
        }

        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchemaArgs build() {
            $.recordColumns = Objects.requireNonNull($.recordColumns, "expected parameter 'recordColumns' to be non-null");
            $.recordFormat = Objects.requireNonNull($.recordFormat, "expected parameter 'recordFormat' to be non-null");
            return $;
        }
    }

}
