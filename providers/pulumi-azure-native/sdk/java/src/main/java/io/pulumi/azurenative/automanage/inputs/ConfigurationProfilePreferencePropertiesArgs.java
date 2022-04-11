// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.inputs;

import io.pulumi.azurenative.automanage.inputs.ConfigurationProfilePreferenceAntiMalwareArgs;
import io.pulumi.azurenative.automanage.inputs.ConfigurationProfilePreferenceVmBackupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Automanage configuration profile preference properties.
 * 
 */
public final class ConfigurationProfilePreferencePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfilePreferencePropertiesArgs Empty = new ConfigurationProfilePreferencePropertiesArgs();

    /**
     * The custom preferences for Azure Antimalware.
     * 
     */
    @Import(name="antiMalware")
      private final @Nullable Output<ConfigurationProfilePreferenceAntiMalwareArgs> antiMalware;

    public Output<ConfigurationProfilePreferenceAntiMalwareArgs> getAntiMalware() {
        return this.antiMalware == null ? Codegen.empty() : this.antiMalware;
    }

    /**
     * The custom preferences for Azure VM Backup.
     * 
     */
    @Import(name="vmBackup")
      private final @Nullable Output<ConfigurationProfilePreferenceVmBackupArgs> vmBackup;

    public Output<ConfigurationProfilePreferenceVmBackupArgs> getVmBackup() {
        return this.vmBackup == null ? Codegen.empty() : this.vmBackup;
    }

    public ConfigurationProfilePreferencePropertiesArgs(
        @Nullable Output<ConfigurationProfilePreferenceAntiMalwareArgs> antiMalware,
        @Nullable Output<ConfigurationProfilePreferenceVmBackupArgs> vmBackup) {
        this.antiMalware = antiMalware;
        this.vmBackup = vmBackup;
    }

    private ConfigurationProfilePreferencePropertiesArgs() {
        this.antiMalware = Codegen.empty();
        this.vmBackup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferencePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigurationProfilePreferenceAntiMalwareArgs> antiMalware;
        private @Nullable Output<ConfigurationProfilePreferenceVmBackupArgs> vmBackup;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferencePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antiMalware = defaults.antiMalware;
    	      this.vmBackup = defaults.vmBackup;
        }

        public Builder antiMalware(@Nullable Output<ConfigurationProfilePreferenceAntiMalwareArgs> antiMalware) {
            this.antiMalware = antiMalware;
            return this;
        }
        public Builder antiMalware(@Nullable ConfigurationProfilePreferenceAntiMalwareArgs antiMalware) {
            this.antiMalware = Codegen.ofNullable(antiMalware);
            return this;
        }
        public Builder vmBackup(@Nullable Output<ConfigurationProfilePreferenceVmBackupArgs> vmBackup) {
            this.vmBackup = vmBackup;
            return this;
        }
        public Builder vmBackup(@Nullable ConfigurationProfilePreferenceVmBackupArgs vmBackup) {
            this.vmBackup = Codegen.ofNullable(vmBackup);
            return this;
        }        public ConfigurationProfilePreferencePropertiesArgs build() {
            return new ConfigurationProfilePreferencePropertiesArgs(antiMalware, vmBackup);
        }
    }
}
