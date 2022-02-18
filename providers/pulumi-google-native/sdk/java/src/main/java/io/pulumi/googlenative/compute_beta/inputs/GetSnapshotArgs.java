// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

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

    @InputImport(name="snapshot", required=true)
    private final String snapshot;

    public String getSnapshot() {
        return this.snapshot;
    }

    public GetSnapshotArgs(
        @Nullable String project,
        String snapshot) {
        this.project = project;
        this.snapshot = Objects.requireNonNull(snapshot, "expected parameter 'snapshot' to be non-null");
    }

    private GetSnapshotArgs() {
        this.project = null;
        this.snapshot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String snapshot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.snapshot = defaults.snapshot;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSnapshot(String snapshot) {
            this.snapshot = Objects.requireNonNull(snapshot);
            return this;
        }

        public GetSnapshotArgs build() {
            return new GetSnapshotArgs(project, snapshot);
        }
    }
}
