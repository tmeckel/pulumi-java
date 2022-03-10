// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoutineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoutineArgs Empty = new GetRoutineArgs();

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

    @InputImport(name="readMask")
      private final @Nullable String readMask;

    public Optional<String> getReadMask() {
        return this.readMask == null ? Optional.empty() : Optional.ofNullable(this.readMask);
    }

    @InputImport(name="routineId", required=true)
      private final String routineId;

    public String getRoutineId() {
        return this.routineId;
    }

    public GetRoutineArgs(
        String datasetId,
        @Nullable String project,
        @Nullable String readMask,
        String routineId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.project = project;
        this.readMask = readMask;
        this.routineId = Objects.requireNonNull(routineId, "expected parameter 'routineId' to be non-null");
    }

    private GetRoutineArgs() {
        this.datasetId = null;
        this.project = null;
        this.readMask = null;
        this.routineId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private @Nullable String project;
        private @Nullable String readMask;
        private String routineId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoutineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.readMask = defaults.readMask;
    	      this.routineId = defaults.routineId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder readMask(@Nullable String readMask) {
            this.readMask = readMask;
            return this;
        }

        public Builder routineId(String routineId) {
            this.routineId = Objects.requireNonNull(routineId);
            return this;
        }
        public GetRoutineArgs build() {
            return new GetRoutineArgs(datasetId, project, readMask, routineId);
        }
    }
}
