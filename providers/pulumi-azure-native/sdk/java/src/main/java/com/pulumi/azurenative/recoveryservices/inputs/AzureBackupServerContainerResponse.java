// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.DPMContainerExtendedInfoResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureBackupServer (DPMVenus) workload-specific protection container.
 * 
 */
public final class AzureBackupServerContainerResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureBackupServerContainerResponse Empty = new AzureBackupServerContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable String backupManagementType;

    /**
     * @return Type of backup management for the container.
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    @Import(name="canReRegister")
    private @Nullable Boolean canReRegister;

    /**
     * @return Specifies whether the container is re-registrable.
     * 
     */
    public Optional<Boolean> canReRegister() {
        return Optional.ofNullable(this.canReRegister);
    }

    /**
     * ID of container.
     * 
     */
    @Import(name="containerId")
    private @Nullable String containerId;

    /**
     * @return ID of container.
     * 
     */
    public Optional<String> containerId() {
        return Optional.ofNullable(this.containerId);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;AzureBackupServerContainer&#39;.
     * 
     */
    @Import(name="containerType", required=true)
    private String containerType;

    /**
     * @return Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;AzureBackupServerContainer&#39;.
     * 
     */
    public String containerType() {
        return this.containerType;
    }

    /**
     * Backup engine Agent version
     * 
     */
    @Import(name="dpmAgentVersion")
    private @Nullable String dpmAgentVersion;

    /**
     * @return Backup engine Agent version
     * 
     */
    public Optional<String> dpmAgentVersion() {
        return Optional.ofNullable(this.dpmAgentVersion);
    }

    /**
     * List of BackupEngines protecting the container
     * 
     */
    @Import(name="dpmServers")
    private @Nullable List<String> dpmServers;

    /**
     * @return List of BackupEngines protecting the container
     * 
     */
    public Optional<List<String>> dpmServers() {
        return Optional.ofNullable(this.dpmServers);
    }

    /**
     * Extended Info of the container.
     * 
     */
    @Import(name="extendedInfo")
    private @Nullable DPMContainerExtendedInfoResponse extendedInfo;

    /**
     * @return Extended Info of the container.
     * 
     */
    public Optional<DPMContainerExtendedInfoResponse> extendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return Friendly name of the container.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
    private @Nullable String healthStatus;

    /**
     * @return Status of health of the container.
     * 
     */
    public Optional<String> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }

    /**
     * Number of protected items in the BackupEngine
     * 
     */
    @Import(name="protectedItemCount")
    private @Nullable Double protectedItemCount;

    /**
     * @return Number of protected items in the BackupEngine
     * 
     */
    public Optional<Double> protectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }

    /**
     * Protection status of the container.
     * 
     */
    @Import(name="protectionStatus")
    private @Nullable String protectionStatus;

    /**
     * @return Protection status of the container.
     * 
     */
    public Optional<String> protectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
    private @Nullable String registrationStatus;

    /**
     * @return Status of registration of the container with the Recovery Services Vault.
     * 
     */
    public Optional<String> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    /**
     * To check if upgrade available
     * 
     */
    @Import(name="upgradeAvailable")
    private @Nullable Boolean upgradeAvailable;

    /**
     * @return To check if upgrade available
     * 
     */
    public Optional<Boolean> upgradeAvailable() {
        return Optional.ofNullable(this.upgradeAvailable);
    }

    private AzureBackupServerContainerResponse() {}

    private AzureBackupServerContainerResponse(AzureBackupServerContainerResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.canReRegister = $.canReRegister;
        this.containerId = $.containerId;
        this.containerType = $.containerType;
        this.dpmAgentVersion = $.dpmAgentVersion;
        this.dpmServers = $.dpmServers;
        this.extendedInfo = $.extendedInfo;
        this.friendlyName = $.friendlyName;
        this.healthStatus = $.healthStatus;
        this.protectedItemCount = $.protectedItemCount;
        this.protectionStatus = $.protectionStatus;
        this.registrationStatus = $.registrationStatus;
        this.upgradeAvailable = $.upgradeAvailable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBackupServerContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBackupServerContainerResponse $;

        public Builder() {
            $ = new AzureBackupServerContainerResponse();
        }

        public Builder(AzureBackupServerContainerResponse defaults) {
            $ = new AzureBackupServerContainerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param canReRegister Specifies whether the container is re-registrable.
         * 
         * @return builder
         * 
         */
        public Builder canReRegister(@Nullable Boolean canReRegister) {
            $.canReRegister = canReRegister;
            return this;
        }

        /**
         * @param containerId ID of container.
         * 
         * @return builder
         * 
         */
        public Builder containerId(@Nullable String containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerType Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
         * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
         * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
         * Backup is VMAppContainer
         * Expected value is &#39;AzureBackupServerContainer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder containerType(String containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param dpmAgentVersion Backup engine Agent version
         * 
         * @return builder
         * 
         */
        public Builder dpmAgentVersion(@Nullable String dpmAgentVersion) {
            $.dpmAgentVersion = dpmAgentVersion;
            return this;
        }

        /**
         * @param dpmServers List of BackupEngines protecting the container
         * 
         * @return builder
         * 
         */
        public Builder dpmServers(@Nullable List<String> dpmServers) {
            $.dpmServers = dpmServers;
            return this;
        }

        /**
         * @param dpmServers List of BackupEngines protecting the container
         * 
         * @return builder
         * 
         */
        public Builder dpmServers(String... dpmServers) {
            return dpmServers(List.of(dpmServers));
        }

        /**
         * @param extendedInfo Extended Info of the container.
         * 
         * @return builder
         * 
         */
        public Builder extendedInfo(@Nullable DPMContainerExtendedInfoResponse extendedInfo) {
            $.extendedInfo = extendedInfo;
            return this;
        }

        /**
         * @param friendlyName Friendly name of the container.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param healthStatus Status of health of the container.
         * 
         * @return builder
         * 
         */
        public Builder healthStatus(@Nullable String healthStatus) {
            $.healthStatus = healthStatus;
            return this;
        }

        /**
         * @param protectedItemCount Number of protected items in the BackupEngine
         * 
         * @return builder
         * 
         */
        public Builder protectedItemCount(@Nullable Double protectedItemCount) {
            $.protectedItemCount = protectedItemCount;
            return this;
        }

        /**
         * @param protectionStatus Protection status of the container.
         * 
         * @return builder
         * 
         */
        public Builder protectionStatus(@Nullable String protectionStatus) {
            $.protectionStatus = protectionStatus;
            return this;
        }

        /**
         * @param registrationStatus Status of registration of the container with the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder registrationStatus(@Nullable String registrationStatus) {
            $.registrationStatus = registrationStatus;
            return this;
        }

        /**
         * @param upgradeAvailable To check if upgrade available
         * 
         * @return builder
         * 
         */
        public Builder upgradeAvailable(@Nullable Boolean upgradeAvailable) {
            $.upgradeAvailable = upgradeAvailable;
            return this;
        }

        public AzureBackupServerContainerResponse build() {
            $.containerType = Codegen.stringProp("containerType").arg($.containerType).require();
            return $;
        }
    }

}
