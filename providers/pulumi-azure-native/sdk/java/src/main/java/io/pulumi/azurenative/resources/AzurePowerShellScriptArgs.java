// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.enums.CleanupOptions;
import io.pulumi.azurenative.resources.inputs.ContainerConfigurationArgs;
import io.pulumi.azurenative.resources.inputs.EnvironmentVariableArgs;
import io.pulumi.azurenative.resources.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.resources.inputs.StorageAccountConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzurePowerShellScriptArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzurePowerShellScriptArgs Empty = new AzurePowerShellScriptArgs();

    /**
     * Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    @InputImport(name="arguments")
      private final @Nullable Input<String> arguments;

    public Input<String> getArguments() {
        return this.arguments == null ? Input.empty() : this.arguments;
    }

    /**
     * Azure PowerShell module version to be used.
     * 
     */
    @InputImport(name="azPowerShellVersion", required=true)
      private final Input<String> azPowerShellVersion;

    public Input<String> getAzPowerShellVersion() {
        return this.azPowerShellVersion;
    }

    /**
     * The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    @InputImport(name="cleanupPreference")
      private final @Nullable Input<Either<String,CleanupOptions>> cleanupPreference;

    public Input<Either<String,CleanupOptions>> getCleanupPreference() {
        return this.cleanupPreference == null ? Input.empty() : this.cleanupPreference;
    }

    /**
     * Container settings.
     * 
     */
    @InputImport(name="containerSettings")
      private final @Nullable Input<ContainerConfigurationArgs> containerSettings;

    public Input<ContainerConfigurationArgs> getContainerSettings() {
        return this.containerSettings == null ? Input.empty() : this.containerSettings;
    }

    /**
     * The environment variables to pass over to the script.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;

    public Input<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    @InputImport(name="forceUpdateTag")
      private final @Nullable Input<String> forceUpdateTag;

    public Input<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Input.empty() : this.forceUpdateTag;
    }

    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Type of the script.
     * Expected value is 'AzurePowerShell'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Uri for the script. This is the entry point for the external script.
     * 
     */
    @InputImport(name="primaryScriptUri")
      private final @Nullable Input<String> primaryScriptUri;

    public Input<String> getPrimaryScriptUri() {
        return this.primaryScriptUri == null ? Input.empty() : this.primaryScriptUri;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    @InputImport(name="retentionInterval", required=true)
      private final Input<String> retentionInterval;

    public Input<String> getRetentionInterval() {
        return this.retentionInterval;
    }

    /**
     * Script body.
     * 
     */
    @InputImport(name="scriptContent")
      private final @Nullable Input<String> scriptContent;

    public Input<String> getScriptContent() {
        return this.scriptContent == null ? Input.empty() : this.scriptContent;
    }

    /**
     * Name of the deployment script.
     * 
     */
    @InputImport(name="scriptName")
      private final @Nullable Input<String> scriptName;

    public Input<String> getScriptName() {
        return this.scriptName == null ? Input.empty() : this.scriptName;
    }

    /**
     * Storage Account settings.
     * 
     */
    @InputImport(name="storageAccountSettings")
      private final @Nullable Input<StorageAccountConfigurationArgs> storageAccountSettings;

    public Input<StorageAccountConfigurationArgs> getStorageAccountSettings() {
        return this.storageAccountSettings == null ? Input.empty() : this.storageAccountSettings;
    }

    /**
     * Supporting files for the external script.
     * 
     */
    @InputImport(name="supportingScriptUris")
      private final @Nullable Input<List<String>> supportingScriptUris;

    public Input<List<String>> getSupportingScriptUris() {
        return this.supportingScriptUris == null ? Input.empty() : this.supportingScriptUris;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    @InputImport(name="timeout")
      private final @Nullable Input<String> timeout;

    public Input<String> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    public AzurePowerShellScriptArgs(
        @Nullable Input<String> arguments,
        Input<String> azPowerShellVersion,
        @Nullable Input<Either<String,CleanupOptions>> cleanupPreference,
        @Nullable Input<ContainerConfigurationArgs> containerSettings,
        @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables,
        @Nullable Input<String> forceUpdateTag,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> primaryScriptUri,
        Input<String> resourceGroupName,
        Input<String> retentionInterval,
        @Nullable Input<String> scriptContent,
        @Nullable Input<String> scriptName,
        @Nullable Input<StorageAccountConfigurationArgs> storageAccountSettings,
        @Nullable Input<List<String>> supportingScriptUris,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> timeout) {
        this.arguments = arguments;
        this.azPowerShellVersion = Objects.requireNonNull(azPowerShellVersion, "expected parameter 'azPowerShellVersion' to be non-null");
        this.cleanupPreference = cleanupPreference == null ? Input.ofLeft("Always") : cleanupPreference;
        this.containerSettings = containerSettings;
        this.environmentVariables = environmentVariables;
        this.forceUpdateTag = forceUpdateTag;
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.primaryScriptUri = primaryScriptUri;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionInterval = Objects.requireNonNull(retentionInterval, "expected parameter 'retentionInterval' to be non-null");
        this.scriptContent = scriptContent;
        this.scriptName = scriptName;
        this.storageAccountSettings = storageAccountSettings;
        this.supportingScriptUris = supportingScriptUris;
        this.tags = tags;
        this.timeout = timeout == null ? Input.ofNullable("P1D") : timeout;
    }

    private AzurePowerShellScriptArgs() {
        this.arguments = Input.empty();
        this.azPowerShellVersion = Input.empty();
        this.cleanupPreference = Input.empty();
        this.containerSettings = Input.empty();
        this.environmentVariables = Input.empty();
        this.forceUpdateTag = Input.empty();
        this.identity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.primaryScriptUri = Input.empty();
        this.resourceGroupName = Input.empty();
        this.retentionInterval = Input.empty();
        this.scriptContent = Input.empty();
        this.scriptName = Input.empty();
        this.storageAccountSettings = Input.empty();
        this.supportingScriptUris = Input.empty();
        this.tags = Input.empty();
        this.timeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzurePowerShellScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arguments;
        private Input<String> azPowerShellVersion;
        private @Nullable Input<Either<String,CleanupOptions>> cleanupPreference;
        private @Nullable Input<ContainerConfigurationArgs> containerSettings;
        private @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;
        private @Nullable Input<String> forceUpdateTag;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> primaryScriptUri;
        private Input<String> resourceGroupName;
        private Input<String> retentionInterval;
        private @Nullable Input<String> scriptContent;
        private @Nullable Input<String> scriptName;
        private @Nullable Input<StorageAccountConfigurationArgs> storageAccountSettings;
        private @Nullable Input<List<String>> supportingScriptUris;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzurePowerShellScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.azPowerShellVersion = defaults.azPowerShellVersion;
    	      this.cleanupPreference = defaults.cleanupPreference;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.primaryScriptUri = defaults.primaryScriptUri;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionInterval = defaults.retentionInterval;
    	      this.scriptContent = defaults.scriptContent;
    	      this.scriptName = defaults.scriptName;
    	      this.storageAccountSettings = defaults.storageAccountSettings;
    	      this.supportingScriptUris = defaults.supportingScriptUris;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder arguments(@Nullable Input<String> arguments) {
            this.arguments = arguments;
            return this;
        }

        public Builder arguments(@Nullable String arguments) {
            this.arguments = Input.ofNullable(arguments);
            return this;
        }

        public Builder azPowerShellVersion(Input<String> azPowerShellVersion) {
            this.azPowerShellVersion = Objects.requireNonNull(azPowerShellVersion);
            return this;
        }

        public Builder azPowerShellVersion(String azPowerShellVersion) {
            this.azPowerShellVersion = Input.of(Objects.requireNonNull(azPowerShellVersion));
            return this;
        }

        public Builder cleanupPreference(@Nullable Input<Either<String,CleanupOptions>> cleanupPreference) {
            this.cleanupPreference = cleanupPreference;
            return this;
        }

        public Builder cleanupPreference(@Nullable Either<String,CleanupOptions> cleanupPreference) {
            this.cleanupPreference = Input.ofNullable(cleanupPreference);
            return this;
        }

        public Builder containerSettings(@Nullable Input<ContainerConfigurationArgs> containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }

        public Builder containerSettings(@Nullable ContainerConfigurationArgs containerSettings) {
            this.containerSettings = Input.ofNullable(containerSettings);
            return this;
        }

        public Builder environmentVariables(@Nullable Input<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder forceUpdateTag(@Nullable Input<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Input.ofNullable(forceUpdateTag);
            return this;
        }

        public Builder identity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder primaryScriptUri(@Nullable Input<String> primaryScriptUri) {
            this.primaryScriptUri = primaryScriptUri;
            return this;
        }

        public Builder primaryScriptUri(@Nullable String primaryScriptUri) {
            this.primaryScriptUri = Input.ofNullable(primaryScriptUri);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder retentionInterval(Input<String> retentionInterval) {
            this.retentionInterval = Objects.requireNonNull(retentionInterval);
            return this;
        }

        public Builder retentionInterval(String retentionInterval) {
            this.retentionInterval = Input.of(Objects.requireNonNull(retentionInterval));
            return this;
        }

        public Builder scriptContent(@Nullable Input<String> scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }

        public Builder scriptContent(@Nullable String scriptContent) {
            this.scriptContent = Input.ofNullable(scriptContent);
            return this;
        }

        public Builder scriptName(@Nullable Input<String> scriptName) {
            this.scriptName = scriptName;
            return this;
        }

        public Builder scriptName(@Nullable String scriptName) {
            this.scriptName = Input.ofNullable(scriptName);
            return this;
        }

        public Builder storageAccountSettings(@Nullable Input<StorageAccountConfigurationArgs> storageAccountSettings) {
            this.storageAccountSettings = storageAccountSettings;
            return this;
        }

        public Builder storageAccountSettings(@Nullable StorageAccountConfigurationArgs storageAccountSettings) {
            this.storageAccountSettings = Input.ofNullable(storageAccountSettings);
            return this;
        }

        public Builder supportingScriptUris(@Nullable Input<List<String>> supportingScriptUris) {
            this.supportingScriptUris = supportingScriptUris;
            return this;
        }

        public Builder supportingScriptUris(@Nullable List<String> supportingScriptUris) {
            this.supportingScriptUris = Input.ofNullable(supportingScriptUris);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder timeout(@Nullable Input<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }
        public AzurePowerShellScriptArgs build() {
            return new AzurePowerShellScriptArgs(arguments, azPowerShellVersion, cleanupPreference, containerSettings, environmentVariables, forceUpdateTag, identity, kind, location, primaryScriptUri, resourceGroupName, retentionInterval, scriptContent, scriptName, storageAccountSettings, supportingScriptUris, tags, timeout);
        }
    }
}
