// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
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
     * Required for the CreateBackup operation. Name of the database from which this backup was created. This needs to be in the same instance as the backup. Values are of the form `projects//instances//databases/`.
     * 
     */
    @Import(name="database")
      private final @Nullable Output<String> database;

    public Output<String> getDatabase() {
        return this.database == null ? Codegen.empty() : this.database;
    }

    @Import(name="encryptionConfigEncryptionType", required=true)
      private final Output<String> encryptionConfigEncryptionType;

    public Output<String> getEncryptionConfigEncryptionType() {
        return this.encryptionConfigEncryptionType;
    }

    @Import(name="encryptionConfigKmsKeyName")
      private final @Nullable Output<String> encryptionConfigKmsKeyName;

    public Output<String> getEncryptionConfigKmsKeyName() {
        return this.encryptionConfigKmsKeyName == null ? Codegen.empty() : this.encryptionConfigKmsKeyName;
    }

    /**
     * Required for the CreateBackup operation. The expiration time of the backup, with microseconds granularity that must be at least 6 hours and at most 366 days from the time the CreateBackup request is processed. Once the `expire_time` has passed, the backup is eligible to be automatically deleted by Cloud Spanner to free the resources used by the backup.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> getExpireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Output only for the CreateBackup operation. Required for the UpdateBackup operation. A globally unique identifier for the backup which cannot be changed. Values are of the form `projects//instances//backups/a-z*[a-z0-9]` The final segment of the name must be between 2 and 60 characters in length. The backup is stored in the location(s) specified in the instance configuration of the instance containing the backup, identified by the prefix of the backup name of the form `projects//instances/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The backup will contain an externally consistent copy of the database at the timestamp specified by `version_time`. If `version_time` is not specified, the system will set `version_time` to the `create_time` of the backup.
     * 
     */
    @Import(name="versionTime")
      private final @Nullable Output<String> versionTime;

    public Output<String> getVersionTime() {
        return this.versionTime == null ? Codegen.empty() : this.versionTime;
    }

    public BackupArgs(
        Output<String> backupId,
        @Nullable Output<String> database,
        Output<String> encryptionConfigEncryptionType,
        @Nullable Output<String> encryptionConfigKmsKeyName,
        @Nullable Output<String> expireTime,
        Output<String> instanceId,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> versionTime) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.database = database;
        this.encryptionConfigEncryptionType = Objects.requireNonNull(encryptionConfigEncryptionType, "expected parameter 'encryptionConfigEncryptionType' to be non-null");
        this.encryptionConfigKmsKeyName = encryptionConfigKmsKeyName;
        this.expireTime = expireTime;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.project = project;
        this.versionTime = versionTime;
    }

    private BackupArgs() {
        this.backupId = Codegen.empty();
        this.database = Codegen.empty();
        this.encryptionConfigEncryptionType = Codegen.empty();
        this.encryptionConfigKmsKeyName = Codegen.empty();
        this.expireTime = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.versionTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> backupId;
        private @Nullable Output<String> database;
        private Output<String> encryptionConfigEncryptionType;
        private @Nullable Output<String> encryptionConfigKmsKeyName;
        private @Nullable Output<String> expireTime;
        private Output<String> instanceId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> versionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.database = defaults.database;
    	      this.encryptionConfigEncryptionType = defaults.encryptionConfigEncryptionType;
    	      this.encryptionConfigKmsKeyName = defaults.encryptionConfigKmsKeyName;
    	      this.expireTime = defaults.expireTime;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.versionTime = defaults.versionTime;
        }

        public Builder backupId(Output<String> backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder backupId(String backupId) {
            this.backupId = Output.of(Objects.requireNonNull(backupId));
            return this;
        }
        public Builder database(@Nullable Output<String> database) {
            this.database = database;
            return this;
        }
        public Builder database(@Nullable String database) {
            this.database = Codegen.ofNullable(database);
            return this;
        }
        public Builder encryptionConfigEncryptionType(Output<String> encryptionConfigEncryptionType) {
            this.encryptionConfigEncryptionType = Objects.requireNonNull(encryptionConfigEncryptionType);
            return this;
        }
        public Builder encryptionConfigEncryptionType(String encryptionConfigEncryptionType) {
            this.encryptionConfigEncryptionType = Output.of(Objects.requireNonNull(encryptionConfigEncryptionType));
            return this;
        }
        public Builder encryptionConfigKmsKeyName(@Nullable Output<String> encryptionConfigKmsKeyName) {
            this.encryptionConfigKmsKeyName = encryptionConfigKmsKeyName;
            return this;
        }
        public Builder encryptionConfigKmsKeyName(@Nullable String encryptionConfigKmsKeyName) {
            this.encryptionConfigKmsKeyName = Codegen.ofNullable(encryptionConfigKmsKeyName);
            return this;
        }
        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder versionTime(@Nullable Output<String> versionTime) {
            this.versionTime = versionTime;
            return this;
        }
        public Builder versionTime(@Nullable String versionTime) {
            this.versionTime = Codegen.ofNullable(versionTime);
            return this;
        }        public BackupArgs build() {
            return new BackupArgs(backupId, database, encryptionConfigEncryptionType, encryptionConfigKmsKeyName, expireTime, instanceId, name, project, versionTime);
        }
    }
}
