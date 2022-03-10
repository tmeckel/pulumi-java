// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeEfsVolumeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeEfsVolumeConfigurationGetArgs Empty = new TaskDefinitionVolumeEfsVolumeConfigurationGetArgs();

    /**
     * Configuration block for authorization for the Amazon FSx for Windows File Server file system detailed below.
     * 
     */
    @InputImport(name="authorizationConfig")
      private final @Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs> authorizationConfig;

    public Input<TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs> getAuthorizationConfig() {
        return this.authorizationConfig == null ? Input.empty() : this.authorizationConfig;
    }

    /**
     * The Amazon FSx for Windows File Server file system ID to use.
     * 
     */
    @InputImport(name="fileSystemId", required=true)
      private final Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The directory within the Amazon FSx for Windows File Server file system to mount as the root directory inside the host.
     * 
     */
    @InputImport(name="rootDirectory")
      private final @Nullable Input<String> rootDirectory;

    public Input<String> getRootDirectory() {
        return this.rootDirectory == null ? Input.empty() : this.rootDirectory;
    }

    /**
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host and the Amazon EFS server. Transit encryption must be enabled if Amazon EFS IAM authorization is used. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
     * 
     */
    @InputImport(name="transitEncryption")
      private final @Nullable Input<String> transitEncryption;

    public Input<String> getTransitEncryption() {
        return this.transitEncryption == null ? Input.empty() : this.transitEncryption;
    }

    /**
     * Port to use for transit encryption. If you do not specify a transit encryption port, it will use the port selection strategy that the Amazon EFS mount helper uses.
     * 
     */
    @InputImport(name="transitEncryptionPort")
      private final @Nullable Input<Integer> transitEncryptionPort;

    public Input<Integer> getTransitEncryptionPort() {
        return this.transitEncryptionPort == null ? Input.empty() : this.transitEncryptionPort;
    }

    public TaskDefinitionVolumeEfsVolumeConfigurationGetArgs(
        @Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs> authorizationConfig,
        Input<String> fileSystemId,
        @Nullable Input<String> rootDirectory,
        @Nullable Input<String> transitEncryption,
        @Nullable Input<Integer> transitEncryptionPort) {
        this.authorizationConfig = authorizationConfig;
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.rootDirectory = rootDirectory;
        this.transitEncryption = transitEncryption;
        this.transitEncryptionPort = transitEncryptionPort;
    }

    private TaskDefinitionVolumeEfsVolumeConfigurationGetArgs() {
        this.authorizationConfig = Input.empty();
        this.fileSystemId = Input.empty();
        this.rootDirectory = Input.empty();
        this.transitEncryption = Input.empty();
        this.transitEncryptionPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeEfsVolumeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs> authorizationConfig;
        private Input<String> fileSystemId;
        private @Nullable Input<String> rootDirectory;
        private @Nullable Input<String> transitEncryption;
        private @Nullable Input<Integer> transitEncryptionPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeEfsVolumeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.rootDirectory = defaults.rootDirectory;
    	      this.transitEncryption = defaults.transitEncryption;
    	      this.transitEncryptionPort = defaults.transitEncryptionPort;
        }

        public Builder authorizationConfig(@Nullable Input<TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs> authorizationConfig) {
            this.authorizationConfig = authorizationConfig;
            return this;
        }

        public Builder authorizationConfig(@Nullable TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigGetArgs authorizationConfig) {
            this.authorizationConfig = Input.ofNullable(authorizationConfig);
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

        public Builder rootDirectory(@Nullable Input<String> rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        public Builder rootDirectory(@Nullable String rootDirectory) {
            this.rootDirectory = Input.ofNullable(rootDirectory);
            return this;
        }

        public Builder transitEncryption(@Nullable Input<String> transitEncryption) {
            this.transitEncryption = transitEncryption;
            return this;
        }

        public Builder transitEncryption(@Nullable String transitEncryption) {
            this.transitEncryption = Input.ofNullable(transitEncryption);
            return this;
        }

        public Builder transitEncryptionPort(@Nullable Input<Integer> transitEncryptionPort) {
            this.transitEncryptionPort = transitEncryptionPort;
            return this;
        }

        public Builder transitEncryptionPort(@Nullable Integer transitEncryptionPort) {
            this.transitEncryptionPort = Input.ofNullable(transitEncryptionPort);
            return this;
        }
        public TaskDefinitionVolumeEfsVolumeConfigurationGetArgs build() {
            return new TaskDefinitionVolumeEfsVolumeConfigurationGetArgs(authorizationConfig, fileSystemId, rootDirectory, transitEncryption, transitEncryptionPort);
        }
    }
}
