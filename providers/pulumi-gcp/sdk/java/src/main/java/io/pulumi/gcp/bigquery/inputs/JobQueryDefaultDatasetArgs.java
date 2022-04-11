// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryDefaultDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryDefaultDatasetArgs Empty = new JobQueryDefaultDatasetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
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

    public JobQueryDefaultDatasetArgs(
        Output<String> datasetId,
        @Nullable Output<String> projectId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = projectId;
    }

    private JobQueryDefaultDatasetArgs() {
        this.datasetId = Codegen.empty();
        this.projectId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryDefaultDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private @Nullable Output<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryDefaultDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Codegen.ofNullable(projectId);
            return this;
        }        public JobQueryDefaultDatasetArgs build() {
            return new JobQueryDefaultDatasetArgs(datasetId, projectId);
        }
    }
}
