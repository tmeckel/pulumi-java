// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobLoadDestinationTableGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobLoadDestinationTableGetArgs Empty = new JobLoadDestinationTableGetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId")
      private final @Nullable Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId == null ? Codegen.empty() : this.datasetId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId == null ? Codegen.empty() : this.projectId;
    }

    /**
     * The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    @Import(name="tableId", required=true)
      private final Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId;
    }

    public JobLoadDestinationTableGetArgs(
        @Nullable Output<String> datasetId,
        @Nullable Output<String> projectId,
        Output<String> tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private JobLoadDestinationTableGetArgs() {
        this.datasetId = Codegen.empty();
        this.projectId = Codegen.empty();
        this.tableId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadDestinationTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datasetId;
        private @Nullable Output<String> projectId;
        private Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobLoadDestinationTableGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(@Nullable Output<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Codegen.ofNullable(datasetId);
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Codegen.ofNullable(projectId);
            return this;
        }
        public Builder tableId(Output<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public Builder tableId(String tableId) {
            this.tableId = Output.of(Objects.requireNonNull(tableId));
            return this;
        }        public JobLoadDestinationTableGetArgs build() {
            return new JobLoadDestinationTableGetArgs(datasetId, projectId, tableId);
        }
    }
}
