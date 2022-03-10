// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSnapshotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="snapshotId", required=true)
      private final String snapshotId;

    public String getSnapshotId() {
        return this.snapshotId;
    }

    public GetSnapshotArgs(
        @Nullable String project,
        String snapshotId) {
        this.project = project;
        this.snapshotId = Objects.requireNonNull(snapshotId, "expected parameter 'snapshotId' to be non-null");
    }

    private GetSnapshotArgs() {
        this.project = null;
        this.snapshotId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String snapshotId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.snapshotId = defaults.snapshotId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        public GetSnapshotArgs build() {
            return new GetSnapshotArgs(project, snapshotId);
        }
    }
}
