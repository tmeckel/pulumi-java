// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message defining the location of a BigQuery table. A table is uniquely identified by its project_id, dataset_id, and table_name. Within a query a table is often referenced with a string in the format of: `:.` or `..`.
 * 
 */
public final class GooglePrivacyDlpV2BigQueryTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2BigQueryTableArgs Empty = new GooglePrivacyDlpV2BigQueryTableArgs();

    /**
     * Dataset ID of the table.
     * 
     */
    @InputImport(name="datasetId")
    private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table. If omitted, project ID is inferred from the API call.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Name of the table.
     * 
     */
    @InputImport(name="tableId")
    private final @Nullable Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId == null ? Input.empty() : this.tableId;
    }

    public GooglePrivacyDlpV2BigQueryTableArgs(
        @Nullable Input<String> datasetId,
        @Nullable Input<String> project,
        @Nullable Input<String> tableId) {
        this.datasetId = datasetId;
        this.project = project;
        this.tableId = tableId;
    }

    private GooglePrivacyDlpV2BigQueryTableArgs() {
        this.datasetId = Input.empty();
        this.project = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BigQueryTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetId;
        private @Nullable Input<String> project;
        private @Nullable Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BigQueryTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder setDatasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder setDatasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTableId(@Nullable Input<String> tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder setTableId(@Nullable String tableId) {
            this.tableId = Input.ofNullable(tableId);
            return this;
        }

        public GooglePrivacyDlpV2BigQueryTableArgs build() {
            return new GooglePrivacyDlpV2BigQueryTableArgs(datasetId, project, tableId);
        }
    }
}
