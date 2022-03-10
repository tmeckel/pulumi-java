// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.AzureBlobFileSystemConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.AzureFileShareConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.CIFSMountConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.NFSMountConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MountConfigurationResponse {
    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    private final @Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration;
    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    private final @Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration;
    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    private final @Nullable CIFSMountConfigurationResponse cifsMountConfiguration;
    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    private final @Nullable NFSMountConfigurationResponse nfsMountConfiguration;

    @OutputCustomType.Constructor
    private MountConfigurationResponse(
        @OutputCustomType.Parameter("azureBlobFileSystemConfiguration") @Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration,
        @OutputCustomType.Parameter("azureFileShareConfiguration") @Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration,
        @OutputCustomType.Parameter("cifsMountConfiguration") @Nullable CIFSMountConfigurationResponse cifsMountConfiguration,
        @OutputCustomType.Parameter("nfsMountConfiguration") @Nullable NFSMountConfigurationResponse nfsMountConfiguration) {
        this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
        this.azureFileShareConfiguration = azureFileShareConfiguration;
        this.cifsMountConfiguration = cifsMountConfiguration;
        this.nfsMountConfiguration = nfsMountConfiguration;
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
    */
    public Optional<AzureBlobFileSystemConfigurationResponse> getAzureBlobFileSystemConfiguration() {
        return Optional.ofNullable(this.azureBlobFileSystemConfiguration);
    }
    /**
     * This property is mutually exclusive with all other properties.
     * 
    */
    public Optional<AzureFileShareConfigurationResponse> getAzureFileShareConfiguration() {
        return Optional.ofNullable(this.azureFileShareConfiguration);
    }
    /**
     * This property is mutually exclusive with all other properties.
     * 
    */
    public Optional<CIFSMountConfigurationResponse> getCifsMountConfiguration() {
        return Optional.ofNullable(this.cifsMountConfiguration);
    }
    /**
     * This property is mutually exclusive with all other properties.
     * 
    */
    public Optional<NFSMountConfigurationResponse> getNfsMountConfiguration() {
        return Optional.ofNullable(this.nfsMountConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration;
        private @Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration;
        private @Nullable CIFSMountConfigurationResponse cifsMountConfiguration;
        private @Nullable NFSMountConfigurationResponse nfsMountConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(MountConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobFileSystemConfiguration = defaults.azureBlobFileSystemConfiguration;
    	      this.azureFileShareConfiguration = defaults.azureFileShareConfiguration;
    	      this.cifsMountConfiguration = defaults.cifsMountConfiguration;
    	      this.nfsMountConfiguration = defaults.nfsMountConfiguration;
        }

        public Builder azureBlobFileSystemConfiguration(@Nullable AzureBlobFileSystemConfigurationResponse azureBlobFileSystemConfiguration) {
            this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
            return this;
        }

        public Builder azureFileShareConfiguration(@Nullable AzureFileShareConfigurationResponse azureFileShareConfiguration) {
            this.azureFileShareConfiguration = azureFileShareConfiguration;
            return this;
        }

        public Builder cifsMountConfiguration(@Nullable CIFSMountConfigurationResponse cifsMountConfiguration) {
            this.cifsMountConfiguration = cifsMountConfiguration;
            return this;
        }

        public Builder nfsMountConfiguration(@Nullable NFSMountConfigurationResponse nfsMountConfiguration) {
            this.nfsMountConfiguration = nfsMountConfiguration;
            return this;
        }
        public MountConfigurationResponse build() {
            return new MountConfigurationResponse(azureBlobFileSystemConfiguration, azureFileShareConfiguration, cifsMountConfiguration, nfsMountConfiguration);
        }
    }
}
