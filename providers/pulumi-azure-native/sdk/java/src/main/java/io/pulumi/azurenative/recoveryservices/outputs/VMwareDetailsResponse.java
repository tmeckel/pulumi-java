// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.MasterTargetServerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ProcessServerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RunAsAccountResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VersionDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VMwareDetailsResponse {
    /**
     * The number of source and target servers configured to talk to this CS.
     * 
     */
    private final @Nullable String agentCount;
    /**
     * Agent expiry date.
     * 
     */
    private final @Nullable String agentExpiryDate;
    /**
     * The agent Version.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * The agent version details.
     * 
     */
    private final @Nullable VersionDetailsResponse agentVersionDetails;
    /**
     * The available memory.
     * 
     */
    private final @Nullable Double availableMemoryInBytes;
    /**
     * The available space.
     * 
     */
    private final @Nullable Double availableSpaceInBytes;
    /**
     * The percentage of the CPU load.
     * 
     */
    private final @Nullable String cpuLoad;
    /**
     * The CPU load status.
     * 
     */
    private final @Nullable String cpuLoadStatus;
    /**
     * The CS service status.
     * 
     */
    private final @Nullable String csServiceStatus;
    /**
     * The database server load.
     * 
     */
    private final @Nullable String databaseServerLoad;
    /**
     * The database server load status.
     * 
     */
    private final @Nullable String databaseServerLoadStatus;
    /**
     * The host name.
     * 
     */
    private final @Nullable String hostName;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMware'.
     * 
     */
    private final String instanceType;
    /**
     * The IP address.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The last heartbeat received from CS server.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * The list of Master Target servers associated with the fabric.
     * 
     */
    private final @Nullable List<MasterTargetServerResponse> masterTargetServers;
    /**
     * The memory usage status.
     * 
     */
    private final @Nullable String memoryUsageStatus;
    /**
     * The number of process servers.
     * 
     */
    private final @Nullable String processServerCount;
    /**
     * The list of Process Servers associated with the fabric.
     * 
     */
    private final @Nullable List<ProcessServerResponse> processServers;
    /**
     * The number of protected servers.
     * 
     */
    private final @Nullable String protectedServers;
    /**
     * PS template version.
     * 
     */
    private final @Nullable String psTemplateVersion;
    /**
     * The number of replication pairs configured in this CS.
     * 
     */
    private final @Nullable String replicationPairCount;
    /**
     * The list of run as accounts created on the server.
     * 
     */
    private final @Nullable List<RunAsAccountResponse> runAsAccounts;
    /**
     * The space usage status.
     * 
     */
    private final @Nullable String spaceUsageStatus;
    /**
     * CS SSL cert expiry date.
     * 
     */
    private final @Nullable String sslCertExpiryDate;
    /**
     * CS SSL cert expiry date.
     * 
     */
    private final @Nullable Integer sslCertExpiryRemainingDays;
    /**
     * The percentage of the system load.
     * 
     */
    private final @Nullable String systemLoad;
    /**
     * The system load status.
     * 
     */
    private final @Nullable String systemLoadStatus;
    /**
     * The total memory.
     * 
     */
    private final @Nullable Double totalMemoryInBytes;
    /**
     * The total space.
     * 
     */
    private final @Nullable Double totalSpaceInBytes;
    /**
     * Version status
     * 
     */
    private final @Nullable String versionStatus;
    /**
     * The web load.
     * 
     */
    private final @Nullable String webLoad;
    /**
     * The web load status.
     * 
     */
    private final @Nullable String webLoadStatus;

    @OutputCustomType.Constructor
    private VMwareDetailsResponse(
        @OutputCustomType.Parameter("agentCount") @Nullable String agentCount,
        @OutputCustomType.Parameter("agentExpiryDate") @Nullable String agentExpiryDate,
        @OutputCustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @OutputCustomType.Parameter("agentVersionDetails") @Nullable VersionDetailsResponse agentVersionDetails,
        @OutputCustomType.Parameter("availableMemoryInBytes") @Nullable Double availableMemoryInBytes,
        @OutputCustomType.Parameter("availableSpaceInBytes") @Nullable Double availableSpaceInBytes,
        @OutputCustomType.Parameter("cpuLoad") @Nullable String cpuLoad,
        @OutputCustomType.Parameter("cpuLoadStatus") @Nullable String cpuLoadStatus,
        @OutputCustomType.Parameter("csServiceStatus") @Nullable String csServiceStatus,
        @OutputCustomType.Parameter("databaseServerLoad") @Nullable String databaseServerLoad,
        @OutputCustomType.Parameter("databaseServerLoadStatus") @Nullable String databaseServerLoadStatus,
        @OutputCustomType.Parameter("hostName") @Nullable String hostName,
        @OutputCustomType.Parameter("instanceType") String instanceType,
        @OutputCustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @OutputCustomType.Parameter("lastHeartbeat") @Nullable String lastHeartbeat,
        @OutputCustomType.Parameter("masterTargetServers") @Nullable List<MasterTargetServerResponse> masterTargetServers,
        @OutputCustomType.Parameter("memoryUsageStatus") @Nullable String memoryUsageStatus,
        @OutputCustomType.Parameter("processServerCount") @Nullable String processServerCount,
        @OutputCustomType.Parameter("processServers") @Nullable List<ProcessServerResponse> processServers,
        @OutputCustomType.Parameter("protectedServers") @Nullable String protectedServers,
        @OutputCustomType.Parameter("psTemplateVersion") @Nullable String psTemplateVersion,
        @OutputCustomType.Parameter("replicationPairCount") @Nullable String replicationPairCount,
        @OutputCustomType.Parameter("runAsAccounts") @Nullable List<RunAsAccountResponse> runAsAccounts,
        @OutputCustomType.Parameter("spaceUsageStatus") @Nullable String spaceUsageStatus,
        @OutputCustomType.Parameter("sslCertExpiryDate") @Nullable String sslCertExpiryDate,
        @OutputCustomType.Parameter("sslCertExpiryRemainingDays") @Nullable Integer sslCertExpiryRemainingDays,
        @OutputCustomType.Parameter("systemLoad") @Nullable String systemLoad,
        @OutputCustomType.Parameter("systemLoadStatus") @Nullable String systemLoadStatus,
        @OutputCustomType.Parameter("totalMemoryInBytes") @Nullable Double totalMemoryInBytes,
        @OutputCustomType.Parameter("totalSpaceInBytes") @Nullable Double totalSpaceInBytes,
        @OutputCustomType.Parameter("versionStatus") @Nullable String versionStatus,
        @OutputCustomType.Parameter("webLoad") @Nullable String webLoad,
        @OutputCustomType.Parameter("webLoadStatus") @Nullable String webLoadStatus) {
        this.agentCount = agentCount;
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.cpuLoad = cpuLoad;
        this.cpuLoadStatus = cpuLoadStatus;
        this.csServiceStatus = csServiceStatus;
        this.databaseServerLoad = databaseServerLoad;
        this.databaseServerLoadStatus = databaseServerLoadStatus;
        this.hostName = hostName;
        this.instanceType = instanceType;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.masterTargetServers = masterTargetServers;
        this.memoryUsageStatus = memoryUsageStatus;
        this.processServerCount = processServerCount;
        this.processServers = processServers;
        this.protectedServers = protectedServers;
        this.psTemplateVersion = psTemplateVersion;
        this.replicationPairCount = replicationPairCount;
        this.runAsAccounts = runAsAccounts;
        this.spaceUsageStatus = spaceUsageStatus;
        this.sslCertExpiryDate = sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        this.systemLoad = systemLoad;
        this.systemLoadStatus = systemLoadStatus;
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.versionStatus = versionStatus;
        this.webLoad = webLoad;
        this.webLoadStatus = webLoadStatus;
    }

    /**
     * The number of source and target servers configured to talk to this CS.
     * 
    */
    public Optional<String> getAgentCount() {
        return Optional.ofNullable(this.agentCount);
    }
    /**
     * Agent expiry date.
     * 
    */
    public Optional<String> getAgentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }
    /**
     * The agent Version.
     * 
    */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * The agent version details.
     * 
    */
    public Optional<VersionDetailsResponse> getAgentVersionDetails() {
        return Optional.ofNullable(this.agentVersionDetails);
    }
    /**
     * The available memory.
     * 
    */
    public Optional<Double> getAvailableMemoryInBytes() {
        return Optional.ofNullable(this.availableMemoryInBytes);
    }
    /**
     * The available space.
     * 
    */
    public Optional<Double> getAvailableSpaceInBytes() {
        return Optional.ofNullable(this.availableSpaceInBytes);
    }
    /**
     * The percentage of the CPU load.
     * 
    */
    public Optional<String> getCpuLoad() {
        return Optional.ofNullable(this.cpuLoad);
    }
    /**
     * The CPU load status.
     * 
    */
    public Optional<String> getCpuLoadStatus() {
        return Optional.ofNullable(this.cpuLoadStatus);
    }
    /**
     * The CS service status.
     * 
    */
    public Optional<String> getCsServiceStatus() {
        return Optional.ofNullable(this.csServiceStatus);
    }
    /**
     * The database server load.
     * 
    */
    public Optional<String> getDatabaseServerLoad() {
        return Optional.ofNullable(this.databaseServerLoad);
    }
    /**
     * The database server load status.
     * 
    */
    public Optional<String> getDatabaseServerLoadStatus() {
        return Optional.ofNullable(this.databaseServerLoadStatus);
    }
    /**
     * The host name.
     * 
    */
    public Optional<String> getHostName() {
        return Optional.ofNullable(this.hostName);
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMware'.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The IP address.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The last heartbeat received from CS server.
     * 
    */
    public Optional<String> getLastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * The list of Master Target servers associated with the fabric.
     * 
    */
    public List<MasterTargetServerResponse> getMasterTargetServers() {
        return this.masterTargetServers == null ? List.of() : this.masterTargetServers;
    }
    /**
     * The memory usage status.
     * 
    */
    public Optional<String> getMemoryUsageStatus() {
        return Optional.ofNullable(this.memoryUsageStatus);
    }
    /**
     * The number of process servers.
     * 
    */
    public Optional<String> getProcessServerCount() {
        return Optional.ofNullable(this.processServerCount);
    }
    /**
     * The list of Process Servers associated with the fabric.
     * 
    */
    public List<ProcessServerResponse> getProcessServers() {
        return this.processServers == null ? List.of() : this.processServers;
    }
    /**
     * The number of protected servers.
     * 
    */
    public Optional<String> getProtectedServers() {
        return Optional.ofNullable(this.protectedServers);
    }
    /**
     * PS template version.
     * 
    */
    public Optional<String> getPsTemplateVersion() {
        return Optional.ofNullable(this.psTemplateVersion);
    }
    /**
     * The number of replication pairs configured in this CS.
     * 
    */
    public Optional<String> getReplicationPairCount() {
        return Optional.ofNullable(this.replicationPairCount);
    }
    /**
     * The list of run as accounts created on the server.
     * 
    */
    public List<RunAsAccountResponse> getRunAsAccounts() {
        return this.runAsAccounts == null ? List.of() : this.runAsAccounts;
    }
    /**
     * The space usage status.
     * 
    */
    public Optional<String> getSpaceUsageStatus() {
        return Optional.ofNullable(this.spaceUsageStatus);
    }
    /**
     * CS SSL cert expiry date.
     * 
    */
    public Optional<String> getSslCertExpiryDate() {
        return Optional.ofNullable(this.sslCertExpiryDate);
    }
    /**
     * CS SSL cert expiry date.
     * 
    */
    public Optional<Integer> getSslCertExpiryRemainingDays() {
        return Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }
    /**
     * The percentage of the system load.
     * 
    */
    public Optional<String> getSystemLoad() {
        return Optional.ofNullable(this.systemLoad);
    }
    /**
     * The system load status.
     * 
    */
    public Optional<String> getSystemLoadStatus() {
        return Optional.ofNullable(this.systemLoadStatus);
    }
    /**
     * The total memory.
     * 
    */
    public Optional<Double> getTotalMemoryInBytes() {
        return Optional.ofNullable(this.totalMemoryInBytes);
    }
    /**
     * The total space.
     * 
    */
    public Optional<Double> getTotalSpaceInBytes() {
        return Optional.ofNullable(this.totalSpaceInBytes);
    }
    /**
     * Version status
     * 
    */
    public Optional<String> getVersionStatus() {
        return Optional.ofNullable(this.versionStatus);
    }
    /**
     * The web load.
     * 
    */
    public Optional<String> getWebLoad() {
        return Optional.ofNullable(this.webLoad);
    }
    /**
     * The web load status.
     * 
    */
    public Optional<String> getWebLoadStatus() {
        return Optional.ofNullable(this.webLoadStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentCount;
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable Double availableMemoryInBytes;
        private @Nullable Double availableSpaceInBytes;
        private @Nullable String cpuLoad;
        private @Nullable String cpuLoadStatus;
        private @Nullable String csServiceStatus;
        private @Nullable String databaseServerLoad;
        private @Nullable String databaseServerLoadStatus;
        private @Nullable String hostName;
        private String instanceType;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable List<MasterTargetServerResponse> masterTargetServers;
        private @Nullable String memoryUsageStatus;
        private @Nullable String processServerCount;
        private @Nullable List<ProcessServerResponse> processServers;
        private @Nullable String protectedServers;
        private @Nullable String psTemplateVersion;
        private @Nullable String replicationPairCount;
        private @Nullable List<RunAsAccountResponse> runAsAccounts;
        private @Nullable String spaceUsageStatus;
        private @Nullable String sslCertExpiryDate;
        private @Nullable Integer sslCertExpiryRemainingDays;
        private @Nullable String systemLoad;
        private @Nullable String systemLoadStatus;
        private @Nullable Double totalMemoryInBytes;
        private @Nullable Double totalSpaceInBytes;
        private @Nullable String versionStatus;
        private @Nullable String webLoad;
        private @Nullable String webLoadStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.cpuLoad = defaults.cpuLoad;
    	      this.cpuLoadStatus = defaults.cpuLoadStatus;
    	      this.csServiceStatus = defaults.csServiceStatus;
    	      this.databaseServerLoad = defaults.databaseServerLoad;
    	      this.databaseServerLoadStatus = defaults.databaseServerLoadStatus;
    	      this.hostName = defaults.hostName;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.masterTargetServers = defaults.masterTargetServers;
    	      this.memoryUsageStatus = defaults.memoryUsageStatus;
    	      this.processServerCount = defaults.processServerCount;
    	      this.processServers = defaults.processServers;
    	      this.protectedServers = defaults.protectedServers;
    	      this.psTemplateVersion = defaults.psTemplateVersion;
    	      this.replicationPairCount = defaults.replicationPairCount;
    	      this.runAsAccounts = defaults.runAsAccounts;
    	      this.spaceUsageStatus = defaults.spaceUsageStatus;
    	      this.sslCertExpiryDate = defaults.sslCertExpiryDate;
    	      this.sslCertExpiryRemainingDays = defaults.sslCertExpiryRemainingDays;
    	      this.systemLoad = defaults.systemLoad;
    	      this.systemLoadStatus = defaults.systemLoadStatus;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
    	      this.versionStatus = defaults.versionStatus;
    	      this.webLoad = defaults.webLoad;
    	      this.webLoadStatus = defaults.webLoadStatus;
        }

        public Builder agentCount(@Nullable String agentCount) {
            this.agentCount = agentCount;
            return this;
        }

        public Builder agentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder agentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            this.agentVersionDetails = agentVersionDetails;
            return this;
        }

        public Builder availableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            this.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder availableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder cpuLoad(@Nullable String cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }

        public Builder cpuLoadStatus(@Nullable String cpuLoadStatus) {
            this.cpuLoadStatus = cpuLoadStatus;
            return this;
        }

        public Builder csServiceStatus(@Nullable String csServiceStatus) {
            this.csServiceStatus = csServiceStatus;
            return this;
        }

        public Builder databaseServerLoad(@Nullable String databaseServerLoad) {
            this.databaseServerLoad = databaseServerLoad;
            return this;
        }

        public Builder databaseServerLoadStatus(@Nullable String databaseServerLoadStatus) {
            this.databaseServerLoadStatus = databaseServerLoadStatus;
            return this;
        }

        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder lastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder masterTargetServers(@Nullable List<MasterTargetServerResponse> masterTargetServers) {
            this.masterTargetServers = masterTargetServers;
            return this;
        }

        public Builder memoryUsageStatus(@Nullable String memoryUsageStatus) {
            this.memoryUsageStatus = memoryUsageStatus;
            return this;
        }

        public Builder processServerCount(@Nullable String processServerCount) {
            this.processServerCount = processServerCount;
            return this;
        }

        public Builder processServers(@Nullable List<ProcessServerResponse> processServers) {
            this.processServers = processServers;
            return this;
        }

        public Builder protectedServers(@Nullable String protectedServers) {
            this.protectedServers = protectedServers;
            return this;
        }

        public Builder psTemplateVersion(@Nullable String psTemplateVersion) {
            this.psTemplateVersion = psTemplateVersion;
            return this;
        }

        public Builder replicationPairCount(@Nullable String replicationPairCount) {
            this.replicationPairCount = replicationPairCount;
            return this;
        }

        public Builder runAsAccounts(@Nullable List<RunAsAccountResponse> runAsAccounts) {
            this.runAsAccounts = runAsAccounts;
            return this;
        }

        public Builder spaceUsageStatus(@Nullable String spaceUsageStatus) {
            this.spaceUsageStatus = spaceUsageStatus;
            return this;
        }

        public Builder sslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            this.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }

        public Builder sslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }

        public Builder systemLoad(@Nullable String systemLoad) {
            this.systemLoad = systemLoad;
            return this;
        }

        public Builder systemLoadStatus(@Nullable String systemLoadStatus) {
            this.systemLoadStatus = systemLoadStatus;
            return this;
        }

        public Builder totalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            this.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder totalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            this.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder versionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }

        public Builder webLoad(@Nullable String webLoad) {
            this.webLoad = webLoad;
            return this;
        }

        public Builder webLoadStatus(@Nullable String webLoadStatus) {
            this.webLoadStatus = webLoadStatus;
            return this;
        }
        public VMwareDetailsResponse build() {
            return new VMwareDetailsResponse(agentCount, agentExpiryDate, agentVersion, agentVersionDetails, availableMemoryInBytes, availableSpaceInBytes, cpuLoad, cpuLoadStatus, csServiceStatus, databaseServerLoad, databaseServerLoadStatus, hostName, instanceType, ipAddress, lastHeartbeat, masterTargetServers, memoryUsageStatus, processServerCount, processServers, protectedServers, psTemplateVersion, replicationPairCount, runAsAccounts, spaceUsageStatus, sslCertExpiryDate, sslCertExpiryRemainingDays, systemLoad, systemLoadStatus, totalMemoryInBytes, totalSpaceInBytes, versionStatus, webLoad, webLoadStatus);
        }
    }
}
