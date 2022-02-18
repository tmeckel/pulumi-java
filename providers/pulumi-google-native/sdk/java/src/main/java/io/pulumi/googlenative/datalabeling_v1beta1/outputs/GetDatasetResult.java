// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datalabeling_v1beta1.outputs.GoogleCloudDatalabelingV1beta1InputConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDatasetResult {
    /**
     * The names of any related resources that are blocking changes to the dataset.
     * 
     */
    private final List<String> blockingResources;
    /**
     * Time the dataset is created.
     * 
     */
    private final String createTime;
    /**
     * The number of data items in the dataset.
     * 
     */
    private final String dataItemCount;
    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long.
     * 
     */
    private final String description;
    /**
     * The display name of the dataset. Maximum of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * This is populated with the original input configs where ImportData is called. It is available only after the clients import data to this dataset.
     * 
     */
    private final List<GoogleCloudDatalabelingV1beta1InputConfigResponse> inputConfigs;
    /**
     * Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated.
     * 
     */
    private final String lastMigrateTime;
    /**
     * Dataset resource name, format is: projects/{project_id}/datasets/{dataset_id}
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"blockingResources","createTime","dataItemCount","description","displayName","inputConfigs","lastMigrateTime","name"})
    private GetDatasetResult(
        List<String> blockingResources,
        String createTime,
        String dataItemCount,
        String description,
        String displayName,
        List<GoogleCloudDatalabelingV1beta1InputConfigResponse> inputConfigs,
        String lastMigrateTime,
        String name) {
        this.blockingResources = Objects.requireNonNull(blockingResources);
        this.createTime = Objects.requireNonNull(createTime);
        this.dataItemCount = Objects.requireNonNull(dataItemCount);
        this.description = Objects.requireNonNull(description);
        this.displayName = Objects.requireNonNull(displayName);
        this.inputConfigs = Objects.requireNonNull(inputConfigs);
        this.lastMigrateTime = Objects.requireNonNull(lastMigrateTime);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The names of any related resources that are blocking changes to the dataset.
     * 
     */
    public List<String> getBlockingResources() {
        return this.blockingResources;
    }
    /**
     * Time the dataset is created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The number of data items in the dataset.
     * 
     */
    public String getDataItemCount() {
        return this.dataItemCount;
    }
    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10000 characters long.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * The display name of the dataset. Maximum of 64 characters.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * This is populated with the original input configs where ImportData is called. It is available only after the clients import data to this dataset.
     * 
     */
    public List<GoogleCloudDatalabelingV1beta1InputConfigResponse> getInputConfigs() {
        return this.inputConfigs;
    }
    /**
     * Last time that the Dataset is migrated to AI Platform V2. If any of the AnnotatedDataset is migrated, the last_migration_time in Dataset is also updated.
     * 
     */
    public String getLastMigrateTime() {
        return this.lastMigrateTime;
    }
    /**
     * Dataset resource name, format is: projects/{project_id}/datasets/{dataset_id}
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> blockingResources;
        private String createTime;
        private String dataItemCount;
        private String description;
        private String displayName;
        private List<GoogleCloudDatalabelingV1beta1InputConfigResponse> inputConfigs;
        private String lastMigrateTime;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockingResources = defaults.blockingResources;
    	      this.createTime = defaults.createTime;
    	      this.dataItemCount = defaults.dataItemCount;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.inputConfigs = defaults.inputConfigs;
    	      this.lastMigrateTime = defaults.lastMigrateTime;
    	      this.name = defaults.name;
        }

        public Builder setBlockingResources(List<String> blockingResources) {
            this.blockingResources = Objects.requireNonNull(blockingResources);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDataItemCount(String dataItemCount) {
            this.dataItemCount = Objects.requireNonNull(dataItemCount);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setInputConfigs(List<GoogleCloudDatalabelingV1beta1InputConfigResponse> inputConfigs) {
            this.inputConfigs = Objects.requireNonNull(inputConfigs);
            return this;
        }

        public Builder setLastMigrateTime(String lastMigrateTime) {
            this.lastMigrateTime = Objects.requireNonNull(lastMigrateTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GetDatasetResult build() {
            return new GetDatasetResult(blockingResources, createTime, dataItemCount, description, displayName, inputConfigs, lastMigrateTime, name);
        }
    }
}
