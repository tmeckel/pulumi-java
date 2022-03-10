// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.inputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.BinaryReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.DelimitedTextReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.FtpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.HttpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.JsonReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.SftpReadSettingsResponse;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import io.pulumi.azurenative.datafactory.inputs.XmlReadSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Activity to get metadata of dataset
 * 
 */
public final class GetMetadataActivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetMetadataActivityResponse Empty = new GetMetadataActivityResponse();

    /**
     * GetMetadata activity dataset reference.
     * 
     */
    @InputImport(name="dataset", required=true)
      private final DatasetReferenceResponse dataset;

    public DatasetReferenceResponse getDataset() {
        return this.dataset;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Fields of metadata to get from dataset.
     * 
     */
    @InputImport(name="fieldList")
      private final @Nullable List<Object> fieldList;

    public List<Object> getFieldList() {
        return this.fieldList == null ? List.of() : this.fieldList;
    }

    /**
     * GetMetadata activity format settings.
     * 
     */
    @InputImport(name="formatSettings")
      private final @Nullable Object formatSettings;

    public Object getFormatSettings() {
        return this.formatSettings == null ? null : this.formatSettings;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse linkedServiceName;

    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return this.linkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @InputImport(name="policy")
      private final @Nullable ActivityPolicyResponse policy;

    public Optional<ActivityPolicyResponse> getPolicy() {
        return this.policy == null ? Optional.empty() : Optional.ofNullable(this.policy);
    }

    /**
     * GetMetadata activity store settings.
     * 
     */
    @InputImport(name="storeSettings")
      private final @Nullable Object storeSettings;

    public Object getStoreSettings() {
        return this.storeSettings == null ? null : this.storeSettings;
    }

    /**
     * Type of activity.
     * Expected value is 'GetMetadata'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @InputImport(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public GetMetadataActivityResponse(
        DatasetReferenceResponse dataset,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable List<Object> fieldList,
        @Nullable Object formatSettings,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        String name,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Object storeSettings,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.dependsOn = dependsOn;
        this.description = description;
        this.fieldList = fieldList;
        this.formatSettings = formatSettings;
        this.linkedServiceName = linkedServiceName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = policy;
        this.storeSettings = storeSettings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userProperties = userProperties;
    }

    private GetMetadataActivityResponse() {
        this.dataset = null;
        this.dependsOn = List.of();
        this.description = null;
        this.fieldList = List.of();
        this.formatSettings = null;
        this.linkedServiceName = null;
        this.name = null;
        this.policy = null;
        this.storeSettings = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetReferenceResponse dataset;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable List<Object> fieldList;
        private @Nullable Object formatSettings;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private String name;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Object storeSettings;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.fieldList = defaults.fieldList;
    	      this.formatSettings = defaults.formatSettings;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.storeSettings = defaults.storeSettings;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder fieldList(@Nullable List<Object> fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        public Builder formatSettings(@Nullable Object formatSettings) {
            this.formatSettings = formatSettings;
            return this;
        }

        public Builder linkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder policy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder storeSettings(@Nullable Object storeSettings) {
            this.storeSettings = storeSettings;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public GetMetadataActivityResponse build() {
            return new GetMetadataActivityResponse(dataset, dependsOn, description, fieldList, formatSettings, linkedServiceName, name, policy, storeSettings, type, userProperties);
        }
    }
}
