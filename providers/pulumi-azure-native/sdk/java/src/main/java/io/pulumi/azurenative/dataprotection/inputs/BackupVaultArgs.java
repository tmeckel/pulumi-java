// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.StorageSettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;


/**
 * Backup Vault
 * 
 */
public final class BackupVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupVaultArgs Empty = new BackupVaultArgs();

    /**
     * Storage Settings
     * 
     */
    @Import(name="storageSettings", required=true)
      private final Output<List<StorageSettingArgs>> storageSettings;

    public Output<List<StorageSettingArgs>> getStorageSettings() {
        return this.storageSettings;
    }

    public BackupVaultArgs(Output<List<StorageSettingArgs>> storageSettings) {
        this.storageSettings = Objects.requireNonNull(storageSettings, "expected parameter 'storageSettings' to be non-null");
    }

    private BackupVaultArgs() {
        this.storageSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<StorageSettingArgs>> storageSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageSettings = defaults.storageSettings;
        }

        public Builder storageSettings(Output<List<StorageSettingArgs>> storageSettings) {
            this.storageSettings = Objects.requireNonNull(storageSettings);
            return this;
        }
        public Builder storageSettings(List<StorageSettingArgs> storageSettings) {
            this.storageSettings = Output.of(Objects.requireNonNull(storageSettings));
            return this;
        }
        public Builder storageSettings(StorageSettingArgs... storageSettings) {
            return storageSettings(List.of(storageSettings));
        }        public BackupVaultArgs build() {
            return new BackupVaultArgs(storageSettings);
        }
    }
}
