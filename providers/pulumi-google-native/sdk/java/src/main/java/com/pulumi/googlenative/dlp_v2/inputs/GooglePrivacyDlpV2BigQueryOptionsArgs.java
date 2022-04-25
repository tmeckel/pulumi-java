// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2BigQueryOptionsSampleMethod;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Options defining BigQuery table and row identifiers.
 * 
 */
public final class GooglePrivacyDlpV2BigQueryOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2BigQueryOptionsArgs Empty = new GooglePrivacyDlpV2BigQueryOptionsArgs();

    /**
     * References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
     * 
     */
    @Import(name="excludedFields")
    private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> excludedFields;

    /**
     * @return References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2FieldIdArgs>>> excludedFields() {
        return Optional.ofNullable(this.excludedFields);
    }

    /**
     * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
     * 
     */
    @Import(name="identifyingFields")
    private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields;

    /**
     * @return Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2FieldIdArgs>>> identifyingFields() {
        return Optional.ofNullable(this.identifyingFields);
    }

    /**
     * Limit scanning only to these fields.
     * 
     */
    @Import(name="includedFields")
    private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> includedFields;

    /**
     * @return Limit scanning only to these fields.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2FieldIdArgs>>> includedFields() {
        return Optional.ofNullable(this.includedFields);
    }

    /**
     * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    @Import(name="rowsLimit")
    private @Nullable Output<String> rowsLimit;

    /**
     * @return Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    public Optional<Output<String>> rowsLimit() {
        return Optional.ofNullable(this.rowsLimit);
    }

    /**
     * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    @Import(name="rowsLimitPercent")
    private @Nullable Output<Integer> rowsLimitPercent;

    /**
     * @return Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    public Optional<Output<Integer>> rowsLimitPercent() {
        return Optional.ofNullable(this.rowsLimitPercent);
    }

    @Import(name="sampleMethod")
    private @Nullable Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> sampleMethod;

    public Optional<Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod>> sampleMethod() {
        return Optional.ofNullable(this.sampleMethod);
    }

    /**
     * Complete BigQuery table reference.
     * 
     */
    @Import(name="tableReference")
    private @Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> tableReference;

    /**
     * @return Complete BigQuery table reference.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2BigQueryTableArgs>> tableReference() {
        return Optional.ofNullable(this.tableReference);
    }

    private GooglePrivacyDlpV2BigQueryOptionsArgs() {}

    private GooglePrivacyDlpV2BigQueryOptionsArgs(GooglePrivacyDlpV2BigQueryOptionsArgs $) {
        this.excludedFields = $.excludedFields;
        this.identifyingFields = $.identifyingFields;
        this.includedFields = $.includedFields;
        this.rowsLimit = $.rowsLimit;
        this.rowsLimitPercent = $.rowsLimitPercent;
        this.sampleMethod = $.sampleMethod;
        this.tableReference = $.tableReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2BigQueryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BigQueryOptionsArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2BigQueryOptionsArgs();
        }

        public Builder(GooglePrivacyDlpV2BigQueryOptionsArgs defaults) {
            $ = new GooglePrivacyDlpV2BigQueryOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludedFields References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
         * 
         * @return builder
         * 
         */
        public Builder excludedFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> excludedFields) {
            $.excludedFields = excludedFields;
            return this;
        }

        /**
         * @param excludedFields References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
         * 
         * @return builder
         * 
         */
        public Builder excludedFields(List<GooglePrivacyDlpV2FieldIdArgs> excludedFields) {
            return excludedFields(Output.of(excludedFields));
        }

        /**
         * @param excludedFields References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
         * 
         * @return builder
         * 
         */
        public Builder excludedFields(GooglePrivacyDlpV2FieldIdArgs... excludedFields) {
            return excludedFields(List.of(excludedFields));
        }

        /**
         * @param identifyingFields Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
         * 
         * @return builder
         * 
         */
        public Builder identifyingFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields) {
            $.identifyingFields = identifyingFields;
            return this;
        }

        /**
         * @param identifyingFields Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
         * 
         * @return builder
         * 
         */
        public Builder identifyingFields(List<GooglePrivacyDlpV2FieldIdArgs> identifyingFields) {
            return identifyingFields(Output.of(identifyingFields));
        }

        /**
         * @param identifyingFields Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
         * 
         * @return builder
         * 
         */
        public Builder identifyingFields(GooglePrivacyDlpV2FieldIdArgs... identifyingFields) {
            return identifyingFields(List.of(identifyingFields));
        }

        /**
         * @param includedFields Limit scanning only to these fields.
         * 
         * @return builder
         * 
         */
        public Builder includedFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> includedFields) {
            $.includedFields = includedFields;
            return this;
        }

        /**
         * @param includedFields Limit scanning only to these fields.
         * 
         * @return builder
         * 
         */
        public Builder includedFields(List<GooglePrivacyDlpV2FieldIdArgs> includedFields) {
            return includedFields(Output.of(includedFields));
        }

        /**
         * @param includedFields Limit scanning only to these fields.
         * 
         * @return builder
         * 
         */
        public Builder includedFields(GooglePrivacyDlpV2FieldIdArgs... includedFields) {
            return includedFields(List.of(includedFields));
        }

        /**
         * @param rowsLimit Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
         * 
         * @return builder
         * 
         */
        public Builder rowsLimit(@Nullable Output<String> rowsLimit) {
            $.rowsLimit = rowsLimit;
            return this;
        }

        /**
         * @param rowsLimit Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
         * 
         * @return builder
         * 
         */
        public Builder rowsLimit(String rowsLimit) {
            return rowsLimit(Output.of(rowsLimit));
        }

        /**
         * @param rowsLimitPercent Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
         * 
         * @return builder
         * 
         */
        public Builder rowsLimitPercent(@Nullable Output<Integer> rowsLimitPercent) {
            $.rowsLimitPercent = rowsLimitPercent;
            return this;
        }

        /**
         * @param rowsLimitPercent Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
         * 
         * @return builder
         * 
         */
        public Builder rowsLimitPercent(Integer rowsLimitPercent) {
            return rowsLimitPercent(Output.of(rowsLimitPercent));
        }

        public Builder sampleMethod(@Nullable Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> sampleMethod) {
            $.sampleMethod = sampleMethod;
            return this;
        }

        public Builder sampleMethod(GooglePrivacyDlpV2BigQueryOptionsSampleMethod sampleMethod) {
            return sampleMethod(Output.of(sampleMethod));
        }

        /**
         * @param tableReference Complete BigQuery table reference.
         * 
         * @return builder
         * 
         */
        public Builder tableReference(@Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> tableReference) {
            $.tableReference = tableReference;
            return this;
        }

        /**
         * @param tableReference Complete BigQuery table reference.
         * 
         * @return builder
         * 
         */
        public Builder tableReference(GooglePrivacyDlpV2BigQueryTableArgs tableReference) {
            return tableReference(Output.of(tableReference));
        }

        public GooglePrivacyDlpV2BigQueryOptionsArgs build() {
            return $;
        }
    }

}
