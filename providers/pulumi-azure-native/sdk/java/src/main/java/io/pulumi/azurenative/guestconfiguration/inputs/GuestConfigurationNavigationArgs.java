// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.azurenative.guestconfiguration.enums.AssignmentType;
import io.pulumi.azurenative.guestconfiguration.enums.Kind;
import io.pulumi.azurenative.guestconfiguration.inputs.ConfigurationParameterArgs;
import io.pulumi.azurenative.guestconfiguration.inputs.ConfigurationSettingArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Guest configuration is an artifact that encapsulates DSC configuration and its dependencies. The artifact is a zip file containing DSC configuration (as MOF) and dependent resources and other dependencies like modules.
 * 
 */
public final class GuestConfigurationNavigationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestConfigurationNavigationArgs Empty = new GuestConfigurationNavigationArgs();

    /**
     * Specifies the assignment type and execution of the configuration. Possible values are Audit, DeployAndAutoCorrect, ApplyAndAutoCorrect and ApplyAndMonitor.
     * 
     */
    @InputImport(name="assignmentType")
      private final @Nullable Input<Either<String,AssignmentType>> assignmentType;

    public Input<Either<String,AssignmentType>> getAssignmentType() {
        return this.assignmentType == null ? Input.empty() : this.assignmentType;
    }

    /**
     * The configuration parameters for the guest configuration.
     * 
     */
    @InputImport(name="configurationParameter")
      private final @Nullable Input<List<ConfigurationParameterArgs>> configurationParameter;

    public Input<List<ConfigurationParameterArgs>> getConfigurationParameter() {
        return this.configurationParameter == null ? Input.empty() : this.configurationParameter;
    }

    /**
     * The protected configuration parameters for the guest configuration.
     * 
     */
    @InputImport(name="configurationProtectedParameter")
      private final @Nullable Input<List<ConfigurationParameterArgs>> configurationProtectedParameter;

    public Input<List<ConfigurationParameterArgs>> getConfigurationProtectedParameter() {
        return this.configurationProtectedParameter == null ? Input.empty() : this.configurationProtectedParameter;
    }

    /**
     * The configuration setting for the guest configuration.
     * 
     */
    @InputImport(name="configurationSetting")
      private final @Nullable Input<ConfigurationSettingArgs> configurationSetting;

    public Input<ConfigurationSettingArgs> getConfigurationSetting() {
        return this.configurationSetting == null ? Input.empty() : this.configurationSetting;
    }

    /**
     * Combined hash of the guest configuration package and configuration parameters.
     * 
     */
    @InputImport(name="contentHash")
      private final @Nullable Input<String> contentHash;

    public Input<String> getContentHash() {
        return this.contentHash == null ? Input.empty() : this.contentHash;
    }

    /**
     * Uri of the storage where guest configuration package is uploaded.
     * 
     */
    @InputImport(name="contentUri")
      private final @Nullable Input<String> contentUri;

    public Input<String> getContentUri() {
        return this.contentUri == null ? Input.empty() : this.contentUri;
    }

    /**
     * Kind of the guest configuration. For example:DSC
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<Either<String,Kind>> kind;

    public Input<Either<String,Kind>> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the guest configuration.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Version of the guest configuration.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public GuestConfigurationNavigationArgs(
        @Nullable Input<Either<String,AssignmentType>> assignmentType,
        @Nullable Input<List<ConfigurationParameterArgs>> configurationParameter,
        @Nullable Input<List<ConfigurationParameterArgs>> configurationProtectedParameter,
        @Nullable Input<ConfigurationSettingArgs> configurationSetting,
        @Nullable Input<String> contentHash,
        @Nullable Input<String> contentUri,
        @Nullable Input<Either<String,Kind>> kind,
        @Nullable Input<String> name,
        @Nullable Input<String> version) {
        this.assignmentType = assignmentType;
        this.configurationParameter = configurationParameter;
        this.configurationProtectedParameter = configurationProtectedParameter;
        this.configurationSetting = configurationSetting;
        this.contentHash = contentHash;
        this.contentUri = contentUri;
        this.kind = kind;
        this.name = name;
        this.version = version;
    }

    private GuestConfigurationNavigationArgs() {
        this.assignmentType = Input.empty();
        this.configurationParameter = Input.empty();
        this.configurationProtectedParameter = Input.empty();
        this.configurationSetting = Input.empty();
        this.contentHash = Input.empty();
        this.contentUri = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationNavigationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AssignmentType>> assignmentType;
        private @Nullable Input<List<ConfigurationParameterArgs>> configurationParameter;
        private @Nullable Input<List<ConfigurationParameterArgs>> configurationProtectedParameter;
        private @Nullable Input<ConfigurationSettingArgs> configurationSetting;
        private @Nullable Input<String> contentHash;
        private @Nullable Input<String> contentUri;
        private @Nullable Input<Either<String,Kind>> kind;
        private @Nullable Input<String> name;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationNavigationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentType = defaults.assignmentType;
    	      this.configurationParameter = defaults.configurationParameter;
    	      this.configurationProtectedParameter = defaults.configurationProtectedParameter;
    	      this.configurationSetting = defaults.configurationSetting;
    	      this.contentHash = defaults.contentHash;
    	      this.contentUri = defaults.contentUri;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder assignmentType(@Nullable Input<Either<String,AssignmentType>> assignmentType) {
            this.assignmentType = assignmentType;
            return this;
        }

        public Builder assignmentType(@Nullable Either<String,AssignmentType> assignmentType) {
            this.assignmentType = Input.ofNullable(assignmentType);
            return this;
        }

        public Builder configurationParameter(@Nullable Input<List<ConfigurationParameterArgs>> configurationParameter) {
            this.configurationParameter = configurationParameter;
            return this;
        }

        public Builder configurationParameter(@Nullable List<ConfigurationParameterArgs> configurationParameter) {
            this.configurationParameter = Input.ofNullable(configurationParameter);
            return this;
        }

        public Builder configurationProtectedParameter(@Nullable Input<List<ConfigurationParameterArgs>> configurationProtectedParameter) {
            this.configurationProtectedParameter = configurationProtectedParameter;
            return this;
        }

        public Builder configurationProtectedParameter(@Nullable List<ConfigurationParameterArgs> configurationProtectedParameter) {
            this.configurationProtectedParameter = Input.ofNullable(configurationProtectedParameter);
            return this;
        }

        public Builder configurationSetting(@Nullable Input<ConfigurationSettingArgs> configurationSetting) {
            this.configurationSetting = configurationSetting;
            return this;
        }

        public Builder configurationSetting(@Nullable ConfigurationSettingArgs configurationSetting) {
            this.configurationSetting = Input.ofNullable(configurationSetting);
            return this;
        }

        public Builder contentHash(@Nullable Input<String> contentHash) {
            this.contentHash = contentHash;
            return this;
        }

        public Builder contentHash(@Nullable String contentHash) {
            this.contentHash = Input.ofNullable(contentHash);
            return this;
        }

        public Builder contentUri(@Nullable Input<String> contentUri) {
            this.contentUri = contentUri;
            return this;
        }

        public Builder contentUri(@Nullable String contentUri) {
            this.contentUri = Input.ofNullable(contentUri);
            return this;
        }

        public Builder kind(@Nullable Input<Either<String,Kind>> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable Either<String,Kind> kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder version(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public GuestConfigurationNavigationArgs build() {
            return new GuestConfigurationNavigationArgs(assignmentType, configurationParameter, configurationProtectedParameter, configurationSetting, contentHash, contentUri, kind, name, version);
        }
    }
}
