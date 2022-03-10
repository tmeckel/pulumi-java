// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci;

import io.pulumi.azurenative.azurestackhci.enums.CreatedByType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionArgs Empty = new ExtensionArgs();

    /**
     * The name of the proxy resource holding details of HCI ArcSetting information.
     * 
     */
    @InputImport(name="arcSettingName", required=true)
      private final Input<String> arcSettingName;

    public Input<String> getArcSettingName() {
        return this.arcSettingName;
    }

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @InputImport(name="autoUpgradeMinorVersion")
      private final @Nullable Input<Boolean> autoUpgradeMinorVersion;

    public Input<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Input.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @InputImport(name="createdAt")
      private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    /**
     * The identity that created the resource.
     * 
     */
    @InputImport(name="createdBy")
      private final @Nullable Input<String> createdBy;

    public Input<String> getCreatedBy() {
        return this.createdBy == null ? Input.empty() : this.createdBy;
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @InputImport(name="createdByType")
      private final @Nullable Input<Either<String,CreatedByType>> createdByType;

    public Input<Either<String,CreatedByType>> getCreatedByType() {
        return this.createdByType == null ? Input.empty() : this.createdByType;
    }

    /**
     * The name of the machine extension.
     * 
     */
    @InputImport(name="extensionName")
      private final @Nullable Input<String> extensionName;

    public Input<String> getExtensionName() {
        return this.extensionName == null ? Input.empty() : this.extensionName;
    }

    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @InputImport(name="forceUpdateTag")
      private final @Nullable Input<String> forceUpdateTag;

    public Input<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Input.empty() : this.forceUpdateTag;
    }

    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @InputImport(name="lastModifiedAt")
      private final @Nullable Input<String> lastModifiedAt;

    public Input<String> getLastModifiedAt() {
        return this.lastModifiedAt == null ? Input.empty() : this.lastModifiedAt;
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @InputImport(name="lastModifiedBy")
      private final @Nullable Input<String> lastModifiedBy;

    public Input<String> getLastModifiedBy() {
        return this.lastModifiedBy == null ? Input.empty() : this.lastModifiedBy;
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @InputImport(name="lastModifiedByType")
      private final @Nullable Input<Either<String,CreatedByType>> lastModifiedByType;

    public Input<Either<String,CreatedByType>> getLastModifiedByType() {
        return this.lastModifiedByType == null ? Input.empty() : this.lastModifiedByType;
    }

    /**
     * Protected settings (may contain secrets).
     * 
     */
    @InputImport(name="protectedSettings")
      private final @Nullable Input<Object> protectedSettings;

    public Input<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Input.empty() : this.protectedSettings;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @InputImport(name="publisher")
      private final @Nullable Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher == null ? Input.empty() : this.publisher;
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
     * Json formatted public settings for the extension.
     * 
     */
    @InputImport(name="settings")
      private final @Nullable Input<Object> settings;

    public Input<Object> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @InputImport(name="typeHandlerVersion")
      private final @Nullable Input<String> typeHandlerVersion;

    public Input<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Input.empty() : this.typeHandlerVersion;
    }

    public ExtensionArgs(
        Input<String> arcSettingName,
        @Nullable Input<Boolean> autoUpgradeMinorVersion,
        Input<String> clusterName,
        @Nullable Input<String> createdAt,
        @Nullable Input<String> createdBy,
        @Nullable Input<Either<String,CreatedByType>> createdByType,
        @Nullable Input<String> extensionName,
        @Nullable Input<String> forceUpdateTag,
        @Nullable Input<String> lastModifiedAt,
        @Nullable Input<String> lastModifiedBy,
        @Nullable Input<Either<String,CreatedByType>> lastModifiedByType,
        @Nullable Input<Object> protectedSettings,
        @Nullable Input<String> publisher,
        Input<String> resourceGroupName,
        @Nullable Input<Object> settings,
        @Nullable Input<String> type,
        @Nullable Input<String> typeHandlerVersion) {
        this.arcSettingName = Objects.requireNonNull(arcSettingName, "expected parameter 'arcSettingName' to be non-null");
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.extensionName = extensionName;
        this.forceUpdateTag = forceUpdateTag;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.protectedSettings = protectedSettings;
        this.publisher = publisher;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private ExtensionArgs() {
        this.arcSettingName = Input.empty();
        this.autoUpgradeMinorVersion = Input.empty();
        this.clusterName = Input.empty();
        this.createdAt = Input.empty();
        this.createdBy = Input.empty();
        this.createdByType = Input.empty();
        this.extensionName = Input.empty();
        this.forceUpdateTag = Input.empty();
        this.lastModifiedAt = Input.empty();
        this.lastModifiedBy = Input.empty();
        this.lastModifiedByType = Input.empty();
        this.protectedSettings = Input.empty();
        this.publisher = Input.empty();
        this.resourceGroupName = Input.empty();
        this.settings = Input.empty();
        this.type = Input.empty();
        this.typeHandlerVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arcSettingName;
        private @Nullable Input<Boolean> autoUpgradeMinorVersion;
        private Input<String> clusterName;
        private @Nullable Input<String> createdAt;
        private @Nullable Input<String> createdBy;
        private @Nullable Input<Either<String,CreatedByType>> createdByType;
        private @Nullable Input<String> extensionName;
        private @Nullable Input<String> forceUpdateTag;
        private @Nullable Input<String> lastModifiedAt;
        private @Nullable Input<String> lastModifiedBy;
        private @Nullable Input<Either<String,CreatedByType>> lastModifiedByType;
        private @Nullable Input<Object> protectedSettings;
        private @Nullable Input<String> publisher;
        private Input<String> resourceGroupName;
        private @Nullable Input<Object> settings;
        private @Nullable Input<String> type;
        private @Nullable Input<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcSettingName = defaults.arcSettingName;
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.extensionName = defaults.extensionName;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.publisher = defaults.publisher;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder arcSettingName(Input<String> arcSettingName) {
            this.arcSettingName = Objects.requireNonNull(arcSettingName);
            return this;
        }

        public Builder arcSettingName(String arcSettingName) {
            this.arcSettingName = Input.of(Objects.requireNonNull(arcSettingName));
            return this;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Input<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Input.ofNullable(autoUpgradeMinorVersion);
            return this;
        }

        public Builder clusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder createdAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder createdBy(@Nullable Input<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(@Nullable String createdBy) {
            this.createdBy = Input.ofNullable(createdBy);
            return this;
        }

        public Builder createdByType(@Nullable Input<Either<String,CreatedByType>> createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder createdByType(@Nullable Either<String,CreatedByType> createdByType) {
            this.createdByType = Input.ofNullable(createdByType);
            return this;
        }

        public Builder extensionName(@Nullable Input<String> extensionName) {
            this.extensionName = extensionName;
            return this;
        }

        public Builder extensionName(@Nullable String extensionName) {
            this.extensionName = Input.ofNullable(extensionName);
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

        public Builder lastModifiedAt(@Nullable Input<String> lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder lastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = Input.ofNullable(lastModifiedAt);
            return this;
        }

        public Builder lastModifiedBy(@Nullable Input<String> lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder lastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = Input.ofNullable(lastModifiedBy);
            return this;
        }

        public Builder lastModifiedByType(@Nullable Input<Either<String,CreatedByType>> lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder lastModifiedByType(@Nullable Either<String,CreatedByType> lastModifiedByType) {
            this.lastModifiedByType = Input.ofNullable(lastModifiedByType);
            return this;
        }

        public Builder protectedSettings(@Nullable Input<Object> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder protectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = Input.ofNullable(protectedSettings);
            return this;
        }

        public Builder publisher(@Nullable Input<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = Input.ofNullable(publisher);
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

        public Builder settings(@Nullable Input<Object> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable Object settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder typeHandlerVersion(@Nullable Input<String> typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = Input.ofNullable(typeHandlerVersion);
            return this;
        }
        public ExtensionArgs build() {
            return new ExtensionArgs(arcSettingName, autoUpgradeMinorVersion, clusterName, createdAt, createdBy, createdByType, extensionName, forceUpdateTag, lastModifiedAt, lastModifiedBy, lastModifiedByType, protectedSettings, publisher, resourceGroupName, settings, type, typeHandlerVersion);
        }
    }
}
