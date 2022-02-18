// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration of the timespan of the items to include in scanning. Currently only supported when inspecting Google Cloud Storage and BigQuery.
 * 
 */
public final class GooglePrivacyDlpV2TimespanConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TimespanConfigResponse Empty = new GooglePrivacyDlpV2TimespanConfigResponse();

    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    @InputImport(name="enableAutoPopulationOfTimespanConfig", required=true)
    private final Boolean enableAutoPopulationOfTimespanConfig;

    public Boolean getEnableAutoPopulationOfTimespanConfig() {
        return this.enableAutoPopulationOfTimespanConfig;
    }

    /**
     * Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
     * 
     */
    @InputImport(name="endTime", required=true)
    private final String endTime;

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
     * 
     */
    @InputImport(name="startTime", required=true)
    private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
     * 
     */
    @InputImport(name="timestampField", required=true)
    private final GooglePrivacyDlpV2FieldIdResponse timestampField;

    public GooglePrivacyDlpV2FieldIdResponse getTimestampField() {
        return this.timestampField;
    }

    public GooglePrivacyDlpV2TimespanConfigResponse(
        Boolean enableAutoPopulationOfTimespanConfig,
        String endTime,
        String startTime,
        GooglePrivacyDlpV2FieldIdResponse timestampField) {
        this.enableAutoPopulationOfTimespanConfig = Objects.requireNonNull(enableAutoPopulationOfTimespanConfig, "expected parameter 'enableAutoPopulationOfTimespanConfig' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.timestampField = Objects.requireNonNull(timestampField, "expected parameter 'timestampField' to be non-null");
    }

    private GooglePrivacyDlpV2TimespanConfigResponse() {
        this.enableAutoPopulationOfTimespanConfig = null;
        this.endTime = null;
        this.startTime = null;
        this.timestampField = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimespanConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableAutoPopulationOfTimespanConfig;
        private String endTime;
        private String startTime;
        private GooglePrivacyDlpV2FieldIdResponse timestampField;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TimespanConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoPopulationOfTimespanConfig = defaults.enableAutoPopulationOfTimespanConfig;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timestampField = defaults.timestampField;
        }

        public Builder setEnableAutoPopulationOfTimespanConfig(Boolean enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = Objects.requireNonNull(enableAutoPopulationOfTimespanConfig);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setTimestampField(GooglePrivacyDlpV2FieldIdResponse timestampField) {
            this.timestampField = Objects.requireNonNull(timestampField);
            return this;
        }

        public GooglePrivacyDlpV2TimespanConfigResponse build() {
            return new GooglePrivacyDlpV2TimespanConfigResponse(enableAutoPopulationOfTimespanConfig, endTime, startTime, timestampField);
        }
    }
}
