// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTableArgs Empty = new GetTableArgs();

    @InputImport(name="datasetId", required=true)
    private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="selectedFields")
    private final @Nullable String selectedFields;

    public Optional<String> getSelectedFields() {
        return this.selectedFields == null ? Optional.empty() : Optional.ofNullable(this.selectedFields);
    }

    @InputImport(name="tableId", required=true)
    private final String tableId;

    public String getTableId() {
        return this.tableId;
    }

    public GetTableArgs(
        String datasetId,
        @Nullable String project,
        @Nullable String selectedFields,
        String tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.project = project;
        this.selectedFields = selectedFields;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private GetTableArgs() {
        this.datasetId = null;
        this.project = null;
        this.selectedFields = null;
        this.tableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private @Nullable String project;
        private @Nullable String selectedFields;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.selectedFields = defaults.selectedFields;
    	      this.tableId = defaults.tableId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSelectedFields(@Nullable String selectedFields) {
            this.selectedFields = selectedFields;
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }

        public GetTableArgs build() {
            return new GetTableArgs(datasetId, project, selectedFields, tableId);
        }
    }
}
