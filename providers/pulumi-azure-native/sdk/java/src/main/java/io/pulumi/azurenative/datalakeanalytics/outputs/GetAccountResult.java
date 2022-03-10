// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.outputs;

import io.pulumi.azurenative.datalakeanalytics.outputs.ComputePolicyResponse;
import io.pulumi.azurenative.datalakeanalytics.outputs.DataLakeStoreAccountInformationResponse;
import io.pulumi.azurenative.datalakeanalytics.outputs.FirewallRuleResponse;
import io.pulumi.azurenative.datalakeanalytics.outputs.HiveMetastoreResponse;
import io.pulumi.azurenative.datalakeanalytics.outputs.StorageAccountInformationResponse;
import io.pulumi.azurenative.datalakeanalytics.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountResult {
    /**
     * The unique identifier associated with this Data Lake Analytics account.
     * 
     */
    private final String accountId;
    /**
     * The list of compute policies associated with this account.
     * 
     */
    private final List<ComputePolicyResponse> computePolicies;
    /**
     * The account creation time.
     * 
     */
    private final String creationTime;
    /**
     * The commitment tier in use for the current month.
     * 
     */
    private final String currentTier;
    /**
     * The list of Data Lake Store accounts associated with this account.
     * 
     */
    private final List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts;
    /**
     * The current state of the DebugDataAccessLevel for this account.
     * 
     */
    private final String debugDataAccessLevel;
    /**
     * The default Data Lake Store account associated with this account.
     * 
     */
    private final String defaultDataLakeStoreAccount;
    /**
     * The full CName endpoint for this account.
     * 
     */
    private final String endpoint;
    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    private final @Nullable String firewallAllowAzureIps;
    /**
     * The list of firewall rules associated with this account.
     * 
     */
    private final List<FirewallRuleResponse> firewallRules;
    /**
     * The current state of the IP address firewall for this account.
     * 
     */
    private final @Nullable String firewallState;
    /**
     * The list of hiveMetastores associated with this account.
     * 
     */
    private final List<HiveMetastoreResponse> hiveMetastores;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The account last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The resource location.
     * 
     */
    private final String location;
    /**
     * The maximum supported active jobs under the account at the same time.
     * 
     */
    private final Integer maxActiveJobCountPerUser;
    /**
     * The maximum supported degree of parallelism for this account.
     * 
     */
    private final @Nullable Integer maxDegreeOfParallelism;
    /**
     * The maximum supported degree of parallelism per job for this account.
     * 
     */
    private final @Nullable Integer maxDegreeOfParallelismPerJob;
    /**
     * The maximum supported jobs running under the account at the same time.
     * 
     */
    private final @Nullable Integer maxJobCount;
    /**
     * The maximum supported active jobs under the account at the same time.
     * 
     */
    private final Integer maxJobRunningTimeInMin;
    /**
     * The maximum supported jobs queued under the account at the same time.
     * 
     */
    private final Integer maxQueuedJobCountPerUser;
    /**
     * The minimum supported priority per job for this account.
     * 
     */
    private final Integer minPriorityPerJob;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The commitment tier for the next month.
     * 
     */
    private final @Nullable String newTier;
    /**
     * The provisioning status of the Data Lake Analytics account.
     * 
     */
    private final String provisioningState;
    /**
     * The list of Data Lake Store accounts associated with this account.
     * 
     */
    private final @Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts;
    /**
     * The number of days that job metadata is retained.
     * 
     */
    private final @Nullable Integer queryStoreRetention;
    /**
     * The state of the Data Lake Analytics account.
     * 
     */
    private final String state;
    /**
     * The list of Azure Blob Storage accounts associated with this account.
     * 
     */
    private final List<StorageAccountInformationResponse> storageAccounts;
    /**
     * The system defined maximum supported degree of parallelism for this account, which restricts the maximum value of parallelism the user can set for the account.
     * 
     */
    private final Integer systemMaxDegreeOfParallelism;
    /**
     * The system defined maximum supported jobs running under the account at the same time, which restricts the maximum number of running jobs the user can set for the account.
     * 
     */
    private final Integer systemMaxJobCount;
    /**
     * The resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The list of virtualNetwork rules associated with this account.
     * 
     */
    private final List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @OutputCustomType.Constructor
    private GetAccountResult(
        @OutputCustomType.Parameter("accountId") String accountId,
        @OutputCustomType.Parameter("computePolicies") List<ComputePolicyResponse> computePolicies,
        @OutputCustomType.Parameter("creationTime") String creationTime,
        @OutputCustomType.Parameter("currentTier") String currentTier,
        @OutputCustomType.Parameter("dataLakeStoreAccounts") List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts,
        @OutputCustomType.Parameter("debugDataAccessLevel") String debugDataAccessLevel,
        @OutputCustomType.Parameter("defaultDataLakeStoreAccount") String defaultDataLakeStoreAccount,
        @OutputCustomType.Parameter("endpoint") String endpoint,
        @OutputCustomType.Parameter("firewallAllowAzureIps") @Nullable String firewallAllowAzureIps,
        @OutputCustomType.Parameter("firewallRules") List<FirewallRuleResponse> firewallRules,
        @OutputCustomType.Parameter("firewallState") @Nullable String firewallState,
        @OutputCustomType.Parameter("hiveMetastores") List<HiveMetastoreResponse> hiveMetastores,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("maxActiveJobCountPerUser") Integer maxActiveJobCountPerUser,
        @OutputCustomType.Parameter("maxDegreeOfParallelism") @Nullable Integer maxDegreeOfParallelism,
        @OutputCustomType.Parameter("maxDegreeOfParallelismPerJob") @Nullable Integer maxDegreeOfParallelismPerJob,
        @OutputCustomType.Parameter("maxJobCount") @Nullable Integer maxJobCount,
        @OutputCustomType.Parameter("maxJobRunningTimeInMin") Integer maxJobRunningTimeInMin,
        @OutputCustomType.Parameter("maxQueuedJobCountPerUser") Integer maxQueuedJobCountPerUser,
        @OutputCustomType.Parameter("minPriorityPerJob") Integer minPriorityPerJob,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("newTier") @Nullable String newTier,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("publicDataLakeStoreAccounts") @Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts,
        @OutputCustomType.Parameter("queryStoreRetention") @Nullable Integer queryStoreRetention,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("storageAccounts") List<StorageAccountInformationResponse> storageAccounts,
        @OutputCustomType.Parameter("systemMaxDegreeOfParallelism") Integer systemMaxDegreeOfParallelism,
        @OutputCustomType.Parameter("systemMaxJobCount") Integer systemMaxJobCount,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualNetworkRules") List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.accountId = accountId;
        this.computePolicies = computePolicies;
        this.creationTime = creationTime;
        this.currentTier = currentTier;
        this.dataLakeStoreAccounts = dataLakeStoreAccounts;
        this.debugDataAccessLevel = debugDataAccessLevel;
        this.defaultDataLakeStoreAccount = defaultDataLakeStoreAccount;
        this.endpoint = endpoint;
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        this.firewallRules = firewallRules;
        this.firewallState = firewallState;
        this.hiveMetastores = hiveMetastores;
        this.id = id;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.maxActiveJobCountPerUser = maxActiveJobCountPerUser;
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        this.maxJobCount = maxJobCount;
        this.maxJobRunningTimeInMin = maxJobRunningTimeInMin;
        this.maxQueuedJobCountPerUser = maxQueuedJobCountPerUser;
        this.minPriorityPerJob = minPriorityPerJob;
        this.name = name;
        this.newTier = newTier;
        this.provisioningState = provisioningState;
        this.publicDataLakeStoreAccounts = publicDataLakeStoreAccounts;
        this.queryStoreRetention = queryStoreRetention;
        this.state = state;
        this.storageAccounts = storageAccounts;
        this.systemMaxDegreeOfParallelism = systemMaxDegreeOfParallelism;
        this.systemMaxJobCount = systemMaxJobCount;
        this.tags = tags;
        this.type = type;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * The unique identifier associated with this Data Lake Analytics account.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * The list of compute policies associated with this account.
     * 
    */
    public List<ComputePolicyResponse> getComputePolicies() {
        return this.computePolicies;
    }
    /**
     * The account creation time.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The commitment tier in use for the current month.
     * 
    */
    public String getCurrentTier() {
        return this.currentTier;
    }
    /**
     * The list of Data Lake Store accounts associated with this account.
     * 
    */
    public List<DataLakeStoreAccountInformationResponse> getDataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }
    /**
     * The current state of the DebugDataAccessLevel for this account.
     * 
    */
    public String getDebugDataAccessLevel() {
        return this.debugDataAccessLevel;
    }
    /**
     * The default Data Lake Store account associated with this account.
     * 
    */
    public String getDefaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }
    /**
     * The full CName endpoint for this account.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
    */
    public Optional<String> getFirewallAllowAzureIps() {
        return Optional.ofNullable(this.firewallAllowAzureIps);
    }
    /**
     * The list of firewall rules associated with this account.
     * 
    */
    public List<FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules;
    }
    /**
     * The current state of the IP address firewall for this account.
     * 
    */
    public Optional<String> getFirewallState() {
        return Optional.ofNullable(this.firewallState);
    }
    /**
     * The list of hiveMetastores associated with this account.
     * 
    */
    public List<HiveMetastoreResponse> getHiveMetastores() {
        return this.hiveMetastores;
    }
    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The account last modified time.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The maximum supported active jobs under the account at the same time.
     * 
    */
    public Integer getMaxActiveJobCountPerUser() {
        return this.maxActiveJobCountPerUser;
    }
    /**
     * The maximum supported degree of parallelism for this account.
     * 
    */
    public Optional<Integer> getMaxDegreeOfParallelism() {
        return Optional.ofNullable(this.maxDegreeOfParallelism);
    }
    /**
     * The maximum supported degree of parallelism per job for this account.
     * 
    */
    public Optional<Integer> getMaxDegreeOfParallelismPerJob() {
        return Optional.ofNullable(this.maxDegreeOfParallelismPerJob);
    }
    /**
     * The maximum supported jobs running under the account at the same time.
     * 
    */
    public Optional<Integer> getMaxJobCount() {
        return Optional.ofNullable(this.maxJobCount);
    }
    /**
     * The maximum supported active jobs under the account at the same time.
     * 
    */
    public Integer getMaxJobRunningTimeInMin() {
        return this.maxJobRunningTimeInMin;
    }
    /**
     * The maximum supported jobs queued under the account at the same time.
     * 
    */
    public Integer getMaxQueuedJobCountPerUser() {
        return this.maxQueuedJobCountPerUser;
    }
    /**
     * The minimum supported priority per job for this account.
     * 
    */
    public Integer getMinPriorityPerJob() {
        return this.minPriorityPerJob;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The commitment tier for the next month.
     * 
    */
    public Optional<String> getNewTier() {
        return Optional.ofNullable(this.newTier);
    }
    /**
     * The provisioning status of the Data Lake Analytics account.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of Data Lake Store accounts associated with this account.
     * 
    */
    public List<DataLakeStoreAccountInformationResponse> getPublicDataLakeStoreAccounts() {
        return this.publicDataLakeStoreAccounts == null ? List.of() : this.publicDataLakeStoreAccounts;
    }
    /**
     * The number of days that job metadata is retained.
     * 
    */
    public Optional<Integer> getQueryStoreRetention() {
        return Optional.ofNullable(this.queryStoreRetention);
    }
    /**
     * The state of the Data Lake Analytics account.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The list of Azure Blob Storage accounts associated with this account.
     * 
    */
    public List<StorageAccountInformationResponse> getStorageAccounts() {
        return this.storageAccounts;
    }
    /**
     * The system defined maximum supported degree of parallelism for this account, which restricts the maximum value of parallelism the user can set for the account.
     * 
    */
    public Integer getSystemMaxDegreeOfParallelism() {
        return this.systemMaxDegreeOfParallelism;
    }
    /**
     * The system defined maximum supported jobs running under the account at the same time, which restricts the maximum number of running jobs the user can set for the account.
     * 
    */
    public Integer getSystemMaxJobCount() {
        return this.systemMaxJobCount;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The list of virtualNetwork rules associated with this account.
     * 
    */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private List<ComputePolicyResponse> computePolicies;
        private String creationTime;
        private String currentTier;
        private List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts;
        private String debugDataAccessLevel;
        private String defaultDataLakeStoreAccount;
        private String endpoint;
        private @Nullable String firewallAllowAzureIps;
        private List<FirewallRuleResponse> firewallRules;
        private @Nullable String firewallState;
        private List<HiveMetastoreResponse> hiveMetastores;
        private String id;
        private String lastModifiedTime;
        private String location;
        private Integer maxActiveJobCountPerUser;
        private @Nullable Integer maxDegreeOfParallelism;
        private @Nullable Integer maxDegreeOfParallelismPerJob;
        private @Nullable Integer maxJobCount;
        private Integer maxJobRunningTimeInMin;
        private Integer maxQueuedJobCountPerUser;
        private Integer minPriorityPerJob;
        private String name;
        private @Nullable String newTier;
        private String provisioningState;
        private @Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts;
        private @Nullable Integer queryStoreRetention;
        private String state;
        private List<StorageAccountInformationResponse> storageAccounts;
        private Integer systemMaxDegreeOfParallelism;
        private Integer systemMaxJobCount;
        private Map<String,String> tags;
        private String type;
        private List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.computePolicies = defaults.computePolicies;
    	      this.creationTime = defaults.creationTime;
    	      this.currentTier = defaults.currentTier;
    	      this.dataLakeStoreAccounts = defaults.dataLakeStoreAccounts;
    	      this.debugDataAccessLevel = defaults.debugDataAccessLevel;
    	      this.defaultDataLakeStoreAccount = defaults.defaultDataLakeStoreAccount;
    	      this.endpoint = defaults.endpoint;
    	      this.firewallAllowAzureIps = defaults.firewallAllowAzureIps;
    	      this.firewallRules = defaults.firewallRules;
    	      this.firewallState = defaults.firewallState;
    	      this.hiveMetastores = defaults.hiveMetastores;
    	      this.id = defaults.id;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.maxActiveJobCountPerUser = defaults.maxActiveJobCountPerUser;
    	      this.maxDegreeOfParallelism = defaults.maxDegreeOfParallelism;
    	      this.maxDegreeOfParallelismPerJob = defaults.maxDegreeOfParallelismPerJob;
    	      this.maxJobCount = defaults.maxJobCount;
    	      this.maxJobRunningTimeInMin = defaults.maxJobRunningTimeInMin;
    	      this.maxQueuedJobCountPerUser = defaults.maxQueuedJobCountPerUser;
    	      this.minPriorityPerJob = defaults.minPriorityPerJob;
    	      this.name = defaults.name;
    	      this.newTier = defaults.newTier;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicDataLakeStoreAccounts = defaults.publicDataLakeStoreAccounts;
    	      this.queryStoreRetention = defaults.queryStoreRetention;
    	      this.state = defaults.state;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.systemMaxDegreeOfParallelism = defaults.systemMaxDegreeOfParallelism;
    	      this.systemMaxJobCount = defaults.systemMaxJobCount;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder computePolicies(List<ComputePolicyResponse> computePolicies) {
            this.computePolicies = Objects.requireNonNull(computePolicies);
            return this;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder currentTier(String currentTier) {
            this.currentTier = Objects.requireNonNull(currentTier);
            return this;
        }

        public Builder dataLakeStoreAccounts(List<DataLakeStoreAccountInformationResponse> dataLakeStoreAccounts) {
            this.dataLakeStoreAccounts = Objects.requireNonNull(dataLakeStoreAccounts);
            return this;
        }

        public Builder debugDataAccessLevel(String debugDataAccessLevel) {
            this.debugDataAccessLevel = Objects.requireNonNull(debugDataAccessLevel);
            return this;
        }

        public Builder defaultDataLakeStoreAccount(String defaultDataLakeStoreAccount) {
            this.defaultDataLakeStoreAccount = Objects.requireNonNull(defaultDataLakeStoreAccount);
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder firewallAllowAzureIps(@Nullable String firewallAllowAzureIps) {
            this.firewallAllowAzureIps = firewallAllowAzureIps;
            return this;
        }

        public Builder firewallRules(List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = Objects.requireNonNull(firewallRules);
            return this;
        }

        public Builder firewallState(@Nullable String firewallState) {
            this.firewallState = firewallState;
            return this;
        }

        public Builder hiveMetastores(List<HiveMetastoreResponse> hiveMetastores) {
            this.hiveMetastores = Objects.requireNonNull(hiveMetastores);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder maxActiveJobCountPerUser(Integer maxActiveJobCountPerUser) {
            this.maxActiveJobCountPerUser = Objects.requireNonNull(maxActiveJobCountPerUser);
            return this;
        }

        public Builder maxDegreeOfParallelism(@Nullable Integer maxDegreeOfParallelism) {
            this.maxDegreeOfParallelism = maxDegreeOfParallelism;
            return this;
        }

        public Builder maxDegreeOfParallelismPerJob(@Nullable Integer maxDegreeOfParallelismPerJob) {
            this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
            return this;
        }

        public Builder maxJobCount(@Nullable Integer maxJobCount) {
            this.maxJobCount = maxJobCount;
            return this;
        }

        public Builder maxJobRunningTimeInMin(Integer maxJobRunningTimeInMin) {
            this.maxJobRunningTimeInMin = Objects.requireNonNull(maxJobRunningTimeInMin);
            return this;
        }

        public Builder maxQueuedJobCountPerUser(Integer maxQueuedJobCountPerUser) {
            this.maxQueuedJobCountPerUser = Objects.requireNonNull(maxQueuedJobCountPerUser);
            return this;
        }

        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            this.minPriorityPerJob = Objects.requireNonNull(minPriorityPerJob);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder newTier(@Nullable String newTier) {
            this.newTier = newTier;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publicDataLakeStoreAccounts(@Nullable List<DataLakeStoreAccountInformationResponse> publicDataLakeStoreAccounts) {
            this.publicDataLakeStoreAccounts = publicDataLakeStoreAccounts;
            return this;
        }

        public Builder queryStoreRetention(@Nullable Integer queryStoreRetention) {
            this.queryStoreRetention = queryStoreRetention;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder storageAccounts(List<StorageAccountInformationResponse> storageAccounts) {
            this.storageAccounts = Objects.requireNonNull(storageAccounts);
            return this;
        }

        public Builder systemMaxDegreeOfParallelism(Integer systemMaxDegreeOfParallelism) {
            this.systemMaxDegreeOfParallelism = Objects.requireNonNull(systemMaxDegreeOfParallelism);
            return this;
        }

        public Builder systemMaxJobCount(Integer systemMaxJobCount) {
            this.systemMaxJobCount = Objects.requireNonNull(systemMaxJobCount);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualNetworkRules(List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = Objects.requireNonNull(virtualNetworkRules);
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(accountId, computePolicies, creationTime, currentTier, dataLakeStoreAccounts, debugDataAccessLevel, defaultDataLakeStoreAccount, endpoint, firewallAllowAzureIps, firewallRules, firewallState, hiveMetastores, id, lastModifiedTime, location, maxActiveJobCountPerUser, maxDegreeOfParallelism, maxDegreeOfParallelismPerJob, maxJobCount, maxJobRunningTimeInMin, maxQueuedJobCountPerUser, minPriorityPerJob, name, newTier, provisioningState, publicDataLakeStoreAccounts, queryStoreRetention, state, storageAccounts, systemMaxDegreeOfParallelism, systemMaxJobCount, tags, type, virtualNetworkRules);
        }
    }
}
