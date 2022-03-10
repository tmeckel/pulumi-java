// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobExtractSourceTableGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExtractSourceTableGetArgs Empty = new JobExtractSourceTableGetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @InputImport(name="datasetId")
      private final @Nullable Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId == null ? Input.empty() : this.datasetId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @InputImport(name="projectId")
      private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    /**
     * The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    @InputImport(name="tableId", required=true)
      private final Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId;
    }

    public JobExtractSourceTableGetArgs(
        @Nullable Input<String> datasetId,
        @Nullable Input<String> projectId,
        Input<String> tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private JobExtractSourceTableGetArgs() {
        this.datasetId = Input.empty();
        this.projectId = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractSourceTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetId;
        private @Nullable Input<String> projectId;
        private Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractSourceTableGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(@Nullable Input<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Input.ofNullable(datasetId);
            return this;
        }

        public Builder projectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder projectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }

        public Builder tableId(Input<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }

        public Builder tableId(String tableId) {
            this.tableId = Input.of(Objects.requireNonNull(tableId));
            return this;
        }
        public JobExtractSourceTableGetArgs build() {
            return new JobExtractSourceTableGetArgs(datasetId, projectId, tableId);
        }
    }
}
