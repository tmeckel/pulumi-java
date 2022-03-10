// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs;

import io.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * A backup_policy object (documented below).
     * 
     */
    @InputImport(name="backupPolicy", required=true)
      private final Input<BackupPolicyBackupPolicyArgs> backupPolicy;

    public Input<BackupPolicyBackupPolicyArgs> getBackupPolicy() {
        return this.backupPolicy;
    }

    /**
     * The ID of the EFS file system.
     * 
     */
    @InputImport(name="fileSystemId", required=true)
      private final Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId;
    }

    public BackupPolicyArgs(
        Input<BackupPolicyBackupPolicyArgs> backupPolicy,
        Input<String> fileSystemId) {
        this.backupPolicy = Objects.requireNonNull(backupPolicy, "expected parameter 'backupPolicy' to be non-null");
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
    }

    private BackupPolicyArgs() {
        this.backupPolicy = Input.empty();
        this.fileSystemId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BackupPolicyBackupPolicyArgs> backupPolicy;
        private Input<String> fileSystemId;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPolicy = defaults.backupPolicy;
    	      this.fileSystemId = defaults.fileSystemId;
        }

        public Builder backupPolicy(Input<BackupPolicyBackupPolicyArgs> backupPolicy) {
            this.backupPolicy = Objects.requireNonNull(backupPolicy);
            return this;
        }

        public Builder backupPolicy(BackupPolicyBackupPolicyArgs backupPolicy) {
            this.backupPolicy = Input.of(Objects.requireNonNull(backupPolicy));
            return this;
        }

        public Builder fileSystemId(Input<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = Input.of(Objects.requireNonNull(fileSystemId));
            return this;
        }
        public BackupPolicyArgs build() {
            return new BackupPolicyArgs(backupPolicy, fileSystemId);
        }
    }
}
