// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    @Import(name="backupId", required=true)
      private final Output<String> backupId;

    public Output<String> getBackupId() {
        return this.backupId;
    }

    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    @Import(name="sourceFileShare")
      private final @Nullable Output<String> sourceFileShare;

    public Output<String> getSourceFileShare() {
        return this.sourceFileShare == null ? Codegen.empty() : this.sourceFileShare;
    }

    /**
     * The resource name of the source Cloud Filestore instance, in the format `projects/{project_number}/locations/{location_id}/instances/{instance_id}`, used to create this backup.
     * 
     */
    @Import(name="sourceInstance")
      private final @Nullable Output<String> sourceInstance;

    public Output<String> getSourceInstance() {
        return this.sourceInstance == null ? Codegen.empty() : this.sourceInstance;
    }

    public BackupArgs(
        Output<String> backupId,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> sourceFileShare,
        @Nullable Output<String> sourceInstance) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.sourceFileShare = sourceFileShare;
        this.sourceInstance = sourceInstance;
    }

    private BackupArgs() {
        this.backupId = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.sourceFileShare = Codegen.empty();
        this.sourceInstance = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupId;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> sourceFileShare;
        private @Nullable Output<String> sourceInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.sourceFileShare = defaults.sourceFileShare;
    	      this.sourceInstance = defaults.sourceInstance;
        }

        public Builder backupId(Output<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder backupId(String backupId) {
            this.backupId = Output.of(Objects.requireNonNull(backupId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder sourceFileShare(@Nullable Output<String> sourceFileShare) {
            this.sourceFileShare = sourceFileShare;
            return this;
        }
        public Builder sourceFileShare(@Nullable String sourceFileShare) {
            this.sourceFileShare = Codegen.ofNullable(sourceFileShare);
            return this;
        }
        public Builder sourceInstance(@Nullable Output<String> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }
        public Builder sourceInstance(@Nullable String sourceInstance) {
            this.sourceInstance = Codegen.ofNullable(sourceInstance);
            return this;
        }        public BackupArgs build() {
            return new BackupArgs(backupId, description, labels, location, project, sourceFileShare, sourceInstance);
        }
    }
}
