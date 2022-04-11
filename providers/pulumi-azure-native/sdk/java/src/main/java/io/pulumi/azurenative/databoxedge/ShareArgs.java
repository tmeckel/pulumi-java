// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.DataPolicy;
import io.pulumi.azurenative.databoxedge.enums.MonitoringStatus;
import io.pulumi.azurenative.databoxedge.enums.ShareAccessProtocol;
import io.pulumi.azurenative.databoxedge.enums.ShareStatus;
import io.pulumi.azurenative.databoxedge.inputs.AzureContainerInfoArgs;
import io.pulumi.azurenative.databoxedge.inputs.ClientAccessRightArgs;
import io.pulumi.azurenative.databoxedge.inputs.RefreshDetailsArgs;
import io.pulumi.azurenative.databoxedge.inputs.UserAccessRightArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ShareArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShareArgs Empty = new ShareArgs();

    /**
     * Access protocol to be used by the share.
     * 
     */
    @Import(name="accessProtocol", required=true)
      private final Output<Either<String,ShareAccessProtocol>> accessProtocol;

    public Output<Either<String,ShareAccessProtocol>> getAccessProtocol() {
        return this.accessProtocol;
    }

    /**
     * Azure container mapping for the share.
     * 
     */
    @Import(name="azureContainerInfo")
      private final @Nullable Output<AzureContainerInfoArgs> azureContainerInfo;

    public Output<AzureContainerInfoArgs> getAzureContainerInfo() {
        return this.azureContainerInfo == null ? Codegen.empty() : this.azureContainerInfo;
    }

    /**
     * List of IP addresses and corresponding access rights on the share(required for NFS protocol).
     * 
     */
    @Import(name="clientAccessRights")
      private final @Nullable Output<List<ClientAccessRightArgs>> clientAccessRights;

    public Output<List<ClientAccessRightArgs>> getClientAccessRights() {
        return this.clientAccessRights == null ? Codegen.empty() : this.clientAccessRights;
    }

    /**
     * Data policy of the share.
     * 
     */
    @Import(name="dataPolicy")
      private final @Nullable Output<Either<String,DataPolicy>> dataPolicy;

    public Output<Either<String,DataPolicy>> getDataPolicy() {
        return this.dataPolicy == null ? Codegen.empty() : this.dataPolicy;
    }

    /**
     * Description for the share.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Current monitoring status of the share.
     * 
     */
    @Import(name="monitoringStatus", required=true)
      private final Output<Either<String,MonitoringStatus>> monitoringStatus;

    public Output<Either<String,MonitoringStatus>> getMonitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * The share name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Details of the refresh job on this share.
     * 
     */
    @Import(name="refreshDetails")
      private final @Nullable Output<RefreshDetailsArgs> refreshDetails;

    public Output<RefreshDetailsArgs> getRefreshDetails() {
        return this.refreshDetails == null ? Codegen.empty() : this.refreshDetails;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Current status of the share.
     * 
     */
    @Import(name="shareStatus", required=true)
      private final Output<Either<String,ShareStatus>> shareStatus;

    public Output<Either<String,ShareStatus>> getShareStatus() {
        return this.shareStatus;
    }

    /**
     * Mapping of users and corresponding access rights on the share (required for SMB protocol).
     * 
     */
    @Import(name="userAccessRights")
      private final @Nullable Output<List<UserAccessRightArgs>> userAccessRights;

    public Output<List<UserAccessRightArgs>> getUserAccessRights() {
        return this.userAccessRights == null ? Codegen.empty() : this.userAccessRights;
    }

    public ShareArgs(
        Output<Either<String,ShareAccessProtocol>> accessProtocol,
        @Nullable Output<AzureContainerInfoArgs> azureContainerInfo,
        @Nullable Output<List<ClientAccessRightArgs>> clientAccessRights,
        @Nullable Output<Either<String,DataPolicy>> dataPolicy,
        @Nullable Output<String> description,
        Output<String> deviceName,
        Output<Either<String,MonitoringStatus>> monitoringStatus,
        @Nullable Output<String> name,
        @Nullable Output<RefreshDetailsArgs> refreshDetails,
        Output<String> resourceGroupName,
        Output<Either<String,ShareStatus>> shareStatus,
        @Nullable Output<List<UserAccessRightArgs>> userAccessRights) {
        this.accessProtocol = Objects.requireNonNull(accessProtocol, "expected parameter 'accessProtocol' to be non-null");
        this.azureContainerInfo = azureContainerInfo;
        this.clientAccessRights = clientAccessRights;
        this.dataPolicy = dataPolicy;
        this.description = description;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.monitoringStatus = Objects.requireNonNull(monitoringStatus, "expected parameter 'monitoringStatus' to be non-null");
        this.name = name;
        this.refreshDetails = refreshDetails;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareStatus = Objects.requireNonNull(shareStatus, "expected parameter 'shareStatus' to be non-null");
        this.userAccessRights = userAccessRights;
    }

    private ShareArgs() {
        this.accessProtocol = Codegen.empty();
        this.azureContainerInfo = Codegen.empty();
        this.clientAccessRights = Codegen.empty();
        this.dataPolicy = Codegen.empty();
        this.description = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.monitoringStatus = Codegen.empty();
        this.name = Codegen.empty();
        this.refreshDetails = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.shareStatus = Codegen.empty();
        this.userAccessRights = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ShareAccessProtocol>> accessProtocol;
        private @Nullable Output<AzureContainerInfoArgs> azureContainerInfo;
        private @Nullable Output<List<ClientAccessRightArgs>> clientAccessRights;
        private @Nullable Output<Either<String,DataPolicy>> dataPolicy;
        private @Nullable Output<String> description;
        private Output<String> deviceName;
        private Output<Either<String,MonitoringStatus>> monitoringStatus;
        private @Nullable Output<String> name;
        private @Nullable Output<RefreshDetailsArgs> refreshDetails;
        private Output<String> resourceGroupName;
        private Output<Either<String,ShareStatus>> shareStatus;
        private @Nullable Output<List<UserAccessRightArgs>> userAccessRights;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessProtocol = defaults.accessProtocol;
    	      this.azureContainerInfo = defaults.azureContainerInfo;
    	      this.clientAccessRights = defaults.clientAccessRights;
    	      this.dataPolicy = defaults.dataPolicy;
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.name = defaults.name;
    	      this.refreshDetails = defaults.refreshDetails;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareStatus = defaults.shareStatus;
    	      this.userAccessRights = defaults.userAccessRights;
        }

        public Builder accessProtocol(Output<Either<String,ShareAccessProtocol>> accessProtocol) {
            this.accessProtocol = Objects.requireNonNull(accessProtocol);
            return this;
        }
        public Builder accessProtocol(Either<String,ShareAccessProtocol> accessProtocol) {
            this.accessProtocol = Output.of(Objects.requireNonNull(accessProtocol));
            return this;
        }
        public Builder azureContainerInfo(@Nullable Output<AzureContainerInfoArgs> azureContainerInfo) {
            this.azureContainerInfo = azureContainerInfo;
            return this;
        }
        public Builder azureContainerInfo(@Nullable AzureContainerInfoArgs azureContainerInfo) {
            this.azureContainerInfo = Codegen.ofNullable(azureContainerInfo);
            return this;
        }
        public Builder clientAccessRights(@Nullable Output<List<ClientAccessRightArgs>> clientAccessRights) {
            this.clientAccessRights = clientAccessRights;
            return this;
        }
        public Builder clientAccessRights(@Nullable List<ClientAccessRightArgs> clientAccessRights) {
            this.clientAccessRights = Codegen.ofNullable(clientAccessRights);
            return this;
        }
        public Builder clientAccessRights(ClientAccessRightArgs... clientAccessRights) {
            return clientAccessRights(List.of(clientAccessRights));
        }
        public Builder dataPolicy(@Nullable Output<Either<String,DataPolicy>> dataPolicy) {
            this.dataPolicy = dataPolicy;
            return this;
        }
        public Builder dataPolicy(@Nullable Either<String,DataPolicy> dataPolicy) {
            this.dataPolicy = Codegen.ofNullable(dataPolicy);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder monitoringStatus(Output<Either<String,MonitoringStatus>> monitoringStatus) {
            this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
            return this;
        }
        public Builder monitoringStatus(Either<String,MonitoringStatus> monitoringStatus) {
            this.monitoringStatus = Output.of(Objects.requireNonNull(monitoringStatus));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder refreshDetails(@Nullable Output<RefreshDetailsArgs> refreshDetails) {
            this.refreshDetails = refreshDetails;
            return this;
        }
        public Builder refreshDetails(@Nullable RefreshDetailsArgs refreshDetails) {
            this.refreshDetails = Codegen.ofNullable(refreshDetails);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder shareStatus(Output<Either<String,ShareStatus>> shareStatus) {
            this.shareStatus = Objects.requireNonNull(shareStatus);
            return this;
        }
        public Builder shareStatus(Either<String,ShareStatus> shareStatus) {
            this.shareStatus = Output.of(Objects.requireNonNull(shareStatus));
            return this;
        }
        public Builder userAccessRights(@Nullable Output<List<UserAccessRightArgs>> userAccessRights) {
            this.userAccessRights = userAccessRights;
            return this;
        }
        public Builder userAccessRights(@Nullable List<UserAccessRightArgs> userAccessRights) {
            this.userAccessRights = Codegen.ofNullable(userAccessRights);
            return this;
        }
        public Builder userAccessRights(UserAccessRightArgs... userAccessRights) {
            return userAccessRights(List.of(userAccessRights));
        }        public ShareArgs build() {
            return new ShareArgs(accessProtocol, azureContainerInfo, clientAccessRights, dataPolicy, description, deviceName, monitoringStatus, name, refreshDetails, resourceGroupName, shareStatus, userAccessRights);
        }
    }
}
