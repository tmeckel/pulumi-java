// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupArgs Empty = new BackupArgs();

    @InputImport(name="backupId", required=true)
    private final Input<String> backupId;

    public Input<String> getBackupId() {
        return this.backupId;
    }

    /**
     * The description of the backup.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
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

    @InputImport(name="serviceId", required=true)
    private final Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId;
    }

    public BackupArgs(
        Input<String> backupId,
        @Nullable Input<String> description,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        Input<String> serviceId) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.description = description;
        this.location = location;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private BackupArgs() {
        this.backupId = Input.empty();
        this.description = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.serviceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private Input<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder setBackupId(Input<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }

        public Builder setBackupId(String backupId) {
            this.backupId = Input.of(Objects.requireNonNull(backupId));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setServiceId(Input<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Input.of(Objects.requireNonNull(serviceId));
            return this;
        }

        public BackupArgs build() {
            return new BackupArgs(backupId, description, location, name, project, requestId, serviceId);
        }
    }
}
