// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloneJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloneJobArgs Empty = new CloneJobArgs();

    @InputImport(name="cloneJobId", required=true)
      private final Input<String> cloneJobId;

    public Input<String> getCloneJobId() {
        return this.cloneJobId;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="migratingVmId", required=true)
      private final Input<String> migratingVmId;

    public Input<String> getMigratingVmId() {
        return this.migratingVmId;
    }

    /**
     * The name of the clone.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="sourceId", required=true)
      private final Input<String> sourceId;

    public Input<String> getSourceId() {
        return this.sourceId;
    }

    public CloneJobArgs(
        Input<String> cloneJobId,
        @Nullable Input<String> location,
        Input<String> migratingVmId,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        Input<String> sourceId) {
        this.cloneJobId = Objects.requireNonNull(cloneJobId, "expected parameter 'cloneJobId' to be non-null");
        this.location = location;
        this.migratingVmId = Objects.requireNonNull(migratingVmId, "expected parameter 'migratingVmId' to be non-null");
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
    }

    private CloneJobArgs() {
        this.cloneJobId = Input.empty();
        this.location = Input.empty();
        this.migratingVmId = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.sourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloneJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cloneJobId;
        private @Nullable Input<String> location;
        private Input<String> migratingVmId;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private Input<String> sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CloneJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloneJobId = defaults.cloneJobId;
    	      this.location = defaults.location;
    	      this.migratingVmId = defaults.migratingVmId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder cloneJobId(Input<String> cloneJobId) {
            this.cloneJobId = Objects.requireNonNull(cloneJobId);
            return this;
        }

        public Builder cloneJobId(String cloneJobId) {
            this.cloneJobId = Input.of(Objects.requireNonNull(cloneJobId));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder migratingVmId(Input<String> migratingVmId) {
            this.migratingVmId = Objects.requireNonNull(migratingVmId);
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            this.migratingVmId = Input.of(Objects.requireNonNull(migratingVmId));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder sourceId(Input<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }

        public Builder sourceId(String sourceId) {
            this.sourceId = Input.of(Objects.requireNonNull(sourceId));
            return this;
        }
        public CloneJobArgs build() {
            return new CloneJobArgs(cloneJobId, location, migratingVmId, name, project, requestId, sourceId);
        }
    }
}
