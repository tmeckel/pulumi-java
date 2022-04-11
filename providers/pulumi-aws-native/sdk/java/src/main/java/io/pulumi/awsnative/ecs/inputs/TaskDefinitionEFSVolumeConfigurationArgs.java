// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.TaskDefinitionEFSVolumeConfigurationTransitEncryption;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionAuthorizationConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionEFSVolumeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionEFSVolumeConfigurationArgs Empty = new TaskDefinitionEFSVolumeConfigurationArgs();

    @Import(name="authorizationConfig")
      private final @Nullable Output<TaskDefinitionAuthorizationConfigArgs> authorizationConfig;

    public Output<TaskDefinitionAuthorizationConfigArgs> getAuthorizationConfig() {
        return this.authorizationConfig == null ? Codegen.empty() : this.authorizationConfig;
    }

    @Import(name="filesystemId", required=true)
      private final Output<String> filesystemId;

    public Output<String> getFilesystemId() {
        return this.filesystemId;
    }

    @Import(name="rootDirectory")
      private final @Nullable Output<String> rootDirectory;

    public Output<String> getRootDirectory() {
        return this.rootDirectory == null ? Codegen.empty() : this.rootDirectory;
    }

    @Import(name="transitEncryption")
      private final @Nullable Output<TaskDefinitionEFSVolumeConfigurationTransitEncryption> transitEncryption;

    public Output<TaskDefinitionEFSVolumeConfigurationTransitEncryption> getTransitEncryption() {
        return this.transitEncryption == null ? Codegen.empty() : this.transitEncryption;
    }

    @Import(name="transitEncryptionPort")
      private final @Nullable Output<Integer> transitEncryptionPort;

    public Output<Integer> getTransitEncryptionPort() {
        return this.transitEncryptionPort == null ? Codegen.empty() : this.transitEncryptionPort;
    }

    public TaskDefinitionEFSVolumeConfigurationArgs(
        @Nullable Output<TaskDefinitionAuthorizationConfigArgs> authorizationConfig,
        Output<String> filesystemId,
        @Nullable Output<String> rootDirectory,
        @Nullable Output<TaskDefinitionEFSVolumeConfigurationTransitEncryption> transitEncryption,
        @Nullable Output<Integer> transitEncryptionPort) {
        this.authorizationConfig = authorizationConfig;
        this.filesystemId = Objects.requireNonNull(filesystemId, "expected parameter 'filesystemId' to be non-null");
        this.rootDirectory = rootDirectory;
        this.transitEncryption = transitEncryption;
        this.transitEncryptionPort = transitEncryptionPort;
    }

    private TaskDefinitionEFSVolumeConfigurationArgs() {
        this.authorizationConfig = Codegen.empty();
        this.filesystemId = Codegen.empty();
        this.rootDirectory = Codegen.empty();
        this.transitEncryption = Codegen.empty();
        this.transitEncryptionPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionEFSVolumeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaskDefinitionAuthorizationConfigArgs> authorizationConfig;
        private Output<String> filesystemId;
        private @Nullable Output<String> rootDirectory;
        private @Nullable Output<TaskDefinitionEFSVolumeConfigurationTransitEncryption> transitEncryption;
        private @Nullable Output<Integer> transitEncryptionPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionEFSVolumeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationConfig = defaults.authorizationConfig;
    	      this.filesystemId = defaults.filesystemId;
    	      this.rootDirectory = defaults.rootDirectory;
    	      this.transitEncryption = defaults.transitEncryption;
    	      this.transitEncryptionPort = defaults.transitEncryptionPort;
        }

        public Builder authorizationConfig(@Nullable Output<TaskDefinitionAuthorizationConfigArgs> authorizationConfig) {
            this.authorizationConfig = authorizationConfig;
            return this;
        }
        public Builder authorizationConfig(@Nullable TaskDefinitionAuthorizationConfigArgs authorizationConfig) {
            this.authorizationConfig = Codegen.ofNullable(authorizationConfig);
            return this;
        }
        public Builder filesystemId(Output<String> filesystemId) {
            this.filesystemId = Objects.requireNonNull(filesystemId);
            return this;
        }
        public Builder filesystemId(String filesystemId) {
            this.filesystemId = Output.of(Objects.requireNonNull(filesystemId));
            return this;
        }
        public Builder rootDirectory(@Nullable Output<String> rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }
        public Builder rootDirectory(@Nullable String rootDirectory) {
            this.rootDirectory = Codegen.ofNullable(rootDirectory);
            return this;
        }
        public Builder transitEncryption(@Nullable Output<TaskDefinitionEFSVolumeConfigurationTransitEncryption> transitEncryption) {
            this.transitEncryption = transitEncryption;
            return this;
        }
        public Builder transitEncryption(@Nullable TaskDefinitionEFSVolumeConfigurationTransitEncryption transitEncryption) {
            this.transitEncryption = Codegen.ofNullable(transitEncryption);
            return this;
        }
        public Builder transitEncryptionPort(@Nullable Output<Integer> transitEncryptionPort) {
            this.transitEncryptionPort = transitEncryptionPort;
            return this;
        }
        public Builder transitEncryptionPort(@Nullable Integer transitEncryptionPort) {
            this.transitEncryptionPort = Codegen.ofNullable(transitEncryptionPort);
            return this;
        }        public TaskDefinitionEFSVolumeConfigurationArgs build() {
            return new TaskDefinitionEFSVolumeConfigurationArgs(authorizationConfig, filesystemId, rootDirectory, transitEncryption, transitEncryptionPort);
        }
    }
}
