// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.sagemaker.inputs.FeatureGroupFeatureDefinitionArgs;
import io.pulumi.awsnative.sagemaker.inputs.FeatureGroupTagArgs;
import io.pulumi.awsnative.sagemaker.inputs.OfflineStoreConfigPropertiesArgs;
import io.pulumi.awsnative.sagemaker.inputs.OnlineStoreConfigPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureGroupArgs Empty = new FeatureGroupArgs();

    /**
     * Description about the FeatureGroup.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Event Time Feature Name.
     * 
     */
    @InputImport(name="eventTimeFeatureName", required=true)
      private final Input<String> eventTimeFeatureName;

    public Input<String> getEventTimeFeatureName() {
        return this.eventTimeFeatureName;
    }

    /**
     * An Array of Feature Definition
     * 
     */
    @InputImport(name="featureDefinitions", required=true)
      private final Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;

    public Input<List<FeatureGroupFeatureDefinitionArgs>> getFeatureDefinitions() {
        return this.featureDefinitions;
    }

    /**
     * The Name of the FeatureGroup.
     * 
     */
    @InputImport(name="featureGroupName")
      private final @Nullable Input<String> featureGroupName;

    public Input<String> getFeatureGroupName() {
        return this.featureGroupName == null ? Input.empty() : this.featureGroupName;
    }

    @InputImport(name="offlineStoreConfig")
      private final @Nullable Input<OfflineStoreConfigPropertiesArgs> offlineStoreConfig;

    public Input<OfflineStoreConfigPropertiesArgs> getOfflineStoreConfig() {
        return this.offlineStoreConfig == null ? Input.empty() : this.offlineStoreConfig;
    }

    @InputImport(name="onlineStoreConfig")
      private final @Nullable Input<OnlineStoreConfigPropertiesArgs> onlineStoreConfig;

    public Input<OnlineStoreConfigPropertiesArgs> getOnlineStoreConfig() {
        return this.onlineStoreConfig == null ? Input.empty() : this.onlineStoreConfig;
    }

    /**
     * The Record Identifier Feature Name.
     * 
     */
    @InputImport(name="recordIdentifierFeatureName", required=true)
      private final Input<String> recordIdentifierFeatureName;

    public Input<String> getRecordIdentifierFeatureName() {
        return this.recordIdentifierFeatureName;
    }

    /**
     * Role Arn
     * 
     */
    @InputImport(name="roleArn")
      private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * An array of key-value pair to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<FeatureGroupTagArgs>> tags;

    public Input<List<FeatureGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FeatureGroupArgs(
        @Nullable Input<String> description,
        Input<String> eventTimeFeatureName,
        Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions,
        @Nullable Input<String> featureGroupName,
        @Nullable Input<OfflineStoreConfigPropertiesArgs> offlineStoreConfig,
        @Nullable Input<OnlineStoreConfigPropertiesArgs> onlineStoreConfig,
        Input<String> recordIdentifierFeatureName,
        @Nullable Input<String> roleArn,
        @Nullable Input<List<FeatureGroupTagArgs>> tags) {
        this.description = description;
        this.eventTimeFeatureName = Objects.requireNonNull(eventTimeFeatureName, "expected parameter 'eventTimeFeatureName' to be non-null");
        this.featureDefinitions = Objects.requireNonNull(featureDefinitions, "expected parameter 'featureDefinitions' to be non-null");
        this.featureGroupName = featureGroupName;
        this.offlineStoreConfig = offlineStoreConfig;
        this.onlineStoreConfig = onlineStoreConfig;
        this.recordIdentifierFeatureName = Objects.requireNonNull(recordIdentifierFeatureName, "expected parameter 'recordIdentifierFeatureName' to be non-null");
        this.roleArn = roleArn;
        this.tags = tags;
    }

    private FeatureGroupArgs() {
        this.description = Input.empty();
        this.eventTimeFeatureName = Input.empty();
        this.featureDefinitions = Input.empty();
        this.featureGroupName = Input.empty();
        this.offlineStoreConfig = Input.empty();
        this.onlineStoreConfig = Input.empty();
        this.recordIdentifierFeatureName = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> eventTimeFeatureName;
        private Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions;
        private @Nullable Input<String> featureGroupName;
        private @Nullable Input<OfflineStoreConfigPropertiesArgs> offlineStoreConfig;
        private @Nullable Input<OnlineStoreConfigPropertiesArgs> onlineStoreConfig;
        private Input<String> recordIdentifierFeatureName;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<List<FeatureGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.eventTimeFeatureName = defaults.eventTimeFeatureName;
    	      this.featureDefinitions = defaults.featureDefinitions;
    	      this.featureGroupName = defaults.featureGroupName;
    	      this.offlineStoreConfig = defaults.offlineStoreConfig;
    	      this.onlineStoreConfig = defaults.onlineStoreConfig;
    	      this.recordIdentifierFeatureName = defaults.recordIdentifierFeatureName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder eventTimeFeatureName(Input<String> eventTimeFeatureName) {
            this.eventTimeFeatureName = Objects.requireNonNull(eventTimeFeatureName);
            return this;
        }

        public Builder eventTimeFeatureName(String eventTimeFeatureName) {
            this.eventTimeFeatureName = Input.of(Objects.requireNonNull(eventTimeFeatureName));
            return this;
        }

        public Builder featureDefinitions(Input<List<FeatureGroupFeatureDefinitionArgs>> featureDefinitions) {
            this.featureDefinitions = Objects.requireNonNull(featureDefinitions);
            return this;
        }

        public Builder featureDefinitions(List<FeatureGroupFeatureDefinitionArgs> featureDefinitions) {
            this.featureDefinitions = Input.of(Objects.requireNonNull(featureDefinitions));
            return this;
        }

        public Builder featureGroupName(@Nullable Input<String> featureGroupName) {
            this.featureGroupName = featureGroupName;
            return this;
        }

        public Builder featureGroupName(@Nullable String featureGroupName) {
            this.featureGroupName = Input.ofNullable(featureGroupName);
            return this;
        }

        public Builder offlineStoreConfig(@Nullable Input<OfflineStoreConfigPropertiesArgs> offlineStoreConfig) {
            this.offlineStoreConfig = offlineStoreConfig;
            return this;
        }

        public Builder offlineStoreConfig(@Nullable OfflineStoreConfigPropertiesArgs offlineStoreConfig) {
            this.offlineStoreConfig = Input.ofNullable(offlineStoreConfig);
            return this;
        }

        public Builder onlineStoreConfig(@Nullable Input<OnlineStoreConfigPropertiesArgs> onlineStoreConfig) {
            this.onlineStoreConfig = onlineStoreConfig;
            return this;
        }

        public Builder onlineStoreConfig(@Nullable OnlineStoreConfigPropertiesArgs onlineStoreConfig) {
            this.onlineStoreConfig = Input.ofNullable(onlineStoreConfig);
            return this;
        }

        public Builder recordIdentifierFeatureName(Input<String> recordIdentifierFeatureName) {
            this.recordIdentifierFeatureName = Objects.requireNonNull(recordIdentifierFeatureName);
            return this;
        }

        public Builder recordIdentifierFeatureName(String recordIdentifierFeatureName) {
            this.recordIdentifierFeatureName = Input.of(Objects.requireNonNull(recordIdentifierFeatureName));
            return this;
        }

        public Builder roleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder tags(@Nullable Input<List<FeatureGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<FeatureGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public FeatureGroupArgs build() {
            return new FeatureGroupArgs(description, eventTimeFeatureName, featureDefinitions, featureGroupName, offlineStoreConfig, onlineStoreConfig, recordIdentifierFeatureName, roleArn, tags);
        }
    }
}
