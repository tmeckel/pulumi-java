// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetADLSGen2FolderDataSetMappingResult {
    private final String dataSetId;
    private final String dataSetMappingStatus;
    private final String fileSystem;
    private final String folderPath;
    private final String id;
    private final String kind;
    private final String name;
    private final String provisioningState;
    private final String resourceGroup;
    private final String storageAccountName;
    private final String subscriptionId;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"dataSetId","dataSetMappingStatus","fileSystem","folderPath","id","kind","name","provisioningState","resourceGroup","storageAccountName","subscriptionId","systemData","type"})
    private GetADLSGen2FolderDataSetMappingResult(
        String dataSetId,
        String dataSetMappingStatus,
        String fileSystem,
        String folderPath,
        String id,
        String kind,
        String name,
        String provisioningState,
        String resourceGroup,
        String storageAccountName,
        String subscriptionId,
        SystemDataResponse systemData,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
        this.fileSystem = Objects.requireNonNull(fileSystem);
        this.folderPath = Objects.requireNonNull(folderPath);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.storageAccountName = Objects.requireNonNull(storageAccountName);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getDataSetId() {
        return this.dataSetId;
    }
    public String getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    public String getFileSystem() {
        return this.fileSystem;
    }
    public String getFolderPath() {
        return this.folderPath;
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetADLSGen2FolderDataSetMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String dataSetMappingStatus;
        private String fileSystem;
        private String folderPath;
        private String id;
        private String kind;
        private String name;
        private String provisioningState;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen2FolderDataSetMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.dataSetMappingStatus = defaults.dataSetMappingStatus;
    	      this.fileSystem = defaults.fileSystem;
    	      this.folderPath = defaults.folderPath;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setDataSetMappingStatus(String dataSetMappingStatus) {
            this.dataSetMappingStatus = Objects.requireNonNull(dataSetMappingStatus);
            return this;
        }

        public Builder setFileSystem(String fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }

        public Builder setFolderPath(String folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetADLSGen2FolderDataSetMappingResult build() {
            return new GetADLSGen2FolderDataSetMappingResult(dataSetId, dataSetMappingStatus, fileSystem, folderPath, id, kind, name, provisioningState, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
