// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.inputs;

import io.pulumi.azurenative.portal.enums.OsType;
import io.pulumi.azurenative.portal.enums.ShellType;
import io.pulumi.azurenative.portal.inputs.StorageProfileArgs;
import io.pulumi.azurenative.portal.inputs.TerminalSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The cloud shell user settings properties.
 * 
 */
public final class UserPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPropertiesArgs Empty = new UserPropertiesArgs();

    /**
     * The preferred location of the cloud shell.
     * 
     */
    @Import(name="preferredLocation", required=true)
      private final Output<String> preferredLocation;

    public Output<String> getPreferredLocation() {
        return this.preferredLocation;
    }

    /**
     * The operating system type of the cloud shell. Deprecated, use preferredShellType.
     * 
     */
    @Import(name="preferredOsType", required=true)
      private final Output<Either<String,OsType>> preferredOsType;

    public Output<Either<String,OsType>> getPreferredOsType() {
        return this.preferredOsType;
    }

    /**
     * The shell type of the cloud shell.
     * 
     */
    @Import(name="preferredShellType", required=true)
      private final Output<Either<String,ShellType>> preferredShellType;

    public Output<Either<String,ShellType>> getPreferredShellType() {
        return this.preferredShellType;
    }

    /**
     * The storage profile of the user settings.
     * 
     */
    @Import(name="storageProfile", required=true)
      private final Output<StorageProfileArgs> storageProfile;

    public Output<StorageProfileArgs> getStorageProfile() {
        return this.storageProfile;
    }

    /**
     * Settings for terminal appearance.
     * 
     */
    @Import(name="terminalSettings", required=true)
      private final Output<TerminalSettingsArgs> terminalSettings;

    public Output<TerminalSettingsArgs> getTerminalSettings() {
        return this.terminalSettings;
    }

    public UserPropertiesArgs(
        Output<String> preferredLocation,
        Output<Either<String,OsType>> preferredOsType,
        Output<Either<String,ShellType>> preferredShellType,
        Output<StorageProfileArgs> storageProfile,
        Output<TerminalSettingsArgs> terminalSettings) {
        this.preferredLocation = Objects.requireNonNull(preferredLocation, "expected parameter 'preferredLocation' to be non-null");
        this.preferredOsType = Objects.requireNonNull(preferredOsType, "expected parameter 'preferredOsType' to be non-null");
        this.preferredShellType = Objects.requireNonNull(preferredShellType, "expected parameter 'preferredShellType' to be non-null");
        this.storageProfile = Objects.requireNonNull(storageProfile, "expected parameter 'storageProfile' to be non-null");
        this.terminalSettings = Objects.requireNonNull(terminalSettings, "expected parameter 'terminalSettings' to be non-null");
    }

    private UserPropertiesArgs() {
        this.preferredLocation = Codegen.empty();
        this.preferredOsType = Codegen.empty();
        this.preferredShellType = Codegen.empty();
        this.storageProfile = Codegen.empty();
        this.terminalSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> preferredLocation;
        private Output<Either<String,OsType>> preferredOsType;
        private Output<Either<String,ShellType>> preferredShellType;
        private Output<StorageProfileArgs> storageProfile;
        private Output<TerminalSettingsArgs> terminalSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredLocation = defaults.preferredLocation;
    	      this.preferredOsType = defaults.preferredOsType;
    	      this.preferredShellType = defaults.preferredShellType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.terminalSettings = defaults.terminalSettings;
        }

        public Builder preferredLocation(Output<String> preferredLocation) {
            this.preferredLocation = Objects.requireNonNull(preferredLocation);
            return this;
        }
        public Builder preferredLocation(String preferredLocation) {
            this.preferredLocation = Output.of(Objects.requireNonNull(preferredLocation));
            return this;
        }
        public Builder preferredOsType(Output<Either<String,OsType>> preferredOsType) {
            this.preferredOsType = Objects.requireNonNull(preferredOsType);
            return this;
        }
        public Builder preferredOsType(Either<String,OsType> preferredOsType) {
            this.preferredOsType = Output.of(Objects.requireNonNull(preferredOsType));
            return this;
        }
        public Builder preferredShellType(Output<Either<String,ShellType>> preferredShellType) {
            this.preferredShellType = Objects.requireNonNull(preferredShellType);
            return this;
        }
        public Builder preferredShellType(Either<String,ShellType> preferredShellType) {
            this.preferredShellType = Output.of(Objects.requireNonNull(preferredShellType));
            return this;
        }
        public Builder storageProfile(Output<StorageProfileArgs> storageProfile) {
            this.storageProfile = Objects.requireNonNull(storageProfile);
            return this;
        }
        public Builder storageProfile(StorageProfileArgs storageProfile) {
            this.storageProfile = Output.of(Objects.requireNonNull(storageProfile));
            return this;
        }
        public Builder terminalSettings(Output<TerminalSettingsArgs> terminalSettings) {
            this.terminalSettings = Objects.requireNonNull(terminalSettings);
            return this;
        }
        public Builder terminalSettings(TerminalSettingsArgs terminalSettings) {
            this.terminalSettings = Output.of(Objects.requireNonNull(terminalSettings));
            return this;
        }        public UserPropertiesArgs build() {
            return new UserPropertiesArgs(preferredLocation, preferredOsType, preferredShellType, storageProfile, terminalSettings);
        }
    }
}
