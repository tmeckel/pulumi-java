// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces;

import io.pulumi.aws.workspaces.inputs.WorkspaceWorkspacePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceArgs Empty = new WorkspaceArgs();

    /**
     * The ID of the bundle for the WorkSpace.
     * 
     */
    @Import(name="bundleId", required=true)
      private final Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId;
    }

    /**
     * The ID of the directory for the WorkSpace.
     * 
     */
    @Import(name="directoryId", required=true)
      private final Output<String> directoryId;

    public Output<String> getDirectoryId() {
        return this.directoryId;
    }

    /**
     * Indicates whether the data stored on the root volume is encrypted.
     * 
     */
    @Import(name="rootVolumeEncryptionEnabled")
      private final @Nullable Output<Boolean> rootVolumeEncryptionEnabled;

    public Output<Boolean> getRootVolumeEncryptionEnabled() {
        return this.rootVolumeEncryptionEnabled == null ? Codegen.empty() : this.rootVolumeEncryptionEnabled;
    }

    /**
     * The tags for the WorkSpace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> getUserName() {
        return this.userName;
    }

    /**
     * Indicates whether the data stored on the user volume is encrypted.
     * 
     */
    @Import(name="userVolumeEncryptionEnabled")
      private final @Nullable Output<Boolean> userVolumeEncryptionEnabled;

    public Output<Boolean> getUserVolumeEncryptionEnabled() {
        return this.userVolumeEncryptionEnabled == null ? Codegen.empty() : this.userVolumeEncryptionEnabled;
    }

    /**
     * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
     * 
     */
    @Import(name="volumeEncryptionKey")
      private final @Nullable Output<String> volumeEncryptionKey;

    public Output<String> getVolumeEncryptionKey() {
        return this.volumeEncryptionKey == null ? Codegen.empty() : this.volumeEncryptionKey;
    }

    /**
     * The WorkSpace properties.
     * 
     */
    @Import(name="workspaceProperties")
      private final @Nullable Output<WorkspaceWorkspacePropertiesArgs> workspaceProperties;

    public Output<WorkspaceWorkspacePropertiesArgs> getWorkspaceProperties() {
        return this.workspaceProperties == null ? Codegen.empty() : this.workspaceProperties;
    }

    public WorkspaceArgs(
        Output<String> bundleId,
        Output<String> directoryId,
        @Nullable Output<Boolean> rootVolumeEncryptionEnabled,
        @Nullable Output<Map<String,String>> tags,
        Output<String> userName,
        @Nullable Output<Boolean> userVolumeEncryptionEnabled,
        @Nullable Output<String> volumeEncryptionKey,
        @Nullable Output<WorkspaceWorkspacePropertiesArgs> workspaceProperties) {
        this.bundleId = Objects.requireNonNull(bundleId, "expected parameter 'bundleId' to be non-null");
        this.directoryId = Objects.requireNonNull(directoryId, "expected parameter 'directoryId' to be non-null");
        this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
        this.tags = tags;
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
        this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
        this.volumeEncryptionKey = volumeEncryptionKey;
        this.workspaceProperties = workspaceProperties;
    }

    private WorkspaceArgs() {
        this.bundleId = Codegen.empty();
        this.directoryId = Codegen.empty();
        this.rootVolumeEncryptionEnabled = Codegen.empty();
        this.tags = Codegen.empty();
        this.userName = Codegen.empty();
        this.userVolumeEncryptionEnabled = Codegen.empty();
        this.volumeEncryptionKey = Codegen.empty();
        this.workspaceProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bundleId;
        private Output<String> directoryId;
        private @Nullable Output<Boolean> rootVolumeEncryptionEnabled;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> userName;
        private @Nullable Output<Boolean> userVolumeEncryptionEnabled;
        private @Nullable Output<String> volumeEncryptionKey;
        private @Nullable Output<WorkspaceWorkspacePropertiesArgs> workspaceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.directoryId = defaults.directoryId;
    	      this.rootVolumeEncryptionEnabled = defaults.rootVolumeEncryptionEnabled;
    	      this.tags = defaults.tags;
    	      this.userName = defaults.userName;
    	      this.userVolumeEncryptionEnabled = defaults.userVolumeEncryptionEnabled;
    	      this.volumeEncryptionKey = defaults.volumeEncryptionKey;
    	      this.workspaceProperties = defaults.workspaceProperties;
        }

        public Builder bundleId(Output<String> bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
            return this;
        }
        public Builder bundleId(String bundleId) {
            this.bundleId = Output.of(Objects.requireNonNull(bundleId));
            return this;
        }
        public Builder directoryId(Output<String> directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        public Builder directoryId(String directoryId) {
            this.directoryId = Output.of(Objects.requireNonNull(directoryId));
            return this;
        }
        public Builder rootVolumeEncryptionEnabled(@Nullable Output<Boolean> rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = rootVolumeEncryptionEnabled;
            return this;
        }
        public Builder rootVolumeEncryptionEnabled(@Nullable Boolean rootVolumeEncryptionEnabled) {
            this.rootVolumeEncryptionEnabled = Codegen.ofNullable(rootVolumeEncryptionEnabled);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }
        public Builder userVolumeEncryptionEnabled(@Nullable Output<Boolean> userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = userVolumeEncryptionEnabled;
            return this;
        }
        public Builder userVolumeEncryptionEnabled(@Nullable Boolean userVolumeEncryptionEnabled) {
            this.userVolumeEncryptionEnabled = Codegen.ofNullable(userVolumeEncryptionEnabled);
            return this;
        }
        public Builder volumeEncryptionKey(@Nullable Output<String> volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public Builder volumeEncryptionKey(@Nullable String volumeEncryptionKey) {
            this.volumeEncryptionKey = Codegen.ofNullable(volumeEncryptionKey);
            return this;
        }
        public Builder workspaceProperties(@Nullable Output<WorkspaceWorkspacePropertiesArgs> workspaceProperties) {
            this.workspaceProperties = workspaceProperties;
            return this;
        }
        public Builder workspaceProperties(@Nullable WorkspaceWorkspacePropertiesArgs workspaceProperties) {
            this.workspaceProperties = Codegen.ofNullable(workspaceProperties);
            return this;
        }        public WorkspaceArgs build() {
            return new WorkspaceArgs(bundleId, directoryId, rootVolumeEncryptionEnabled, tags, userName, userVolumeEncryptionEnabled, volumeEncryptionKey, workspaceProperties);
        }
    }
}
