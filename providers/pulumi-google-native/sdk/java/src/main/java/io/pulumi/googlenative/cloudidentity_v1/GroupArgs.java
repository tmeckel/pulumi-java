// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudidentity_v1.inputs.DynamicGroupMetadataArgs;
import io.pulumi.googlenative.cloudidentity_v1.inputs.EntityKeyArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * An extended description to help users determine the purpose of a `Group`. Must not be longer than 4,096 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name of the `Group`.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Optional. Dynamic group metadata like queries and status.
     * 
     */
    @Import(name="dynamicGroupMetadata")
      private final @Nullable Output<DynamicGroupMetadataArgs> dynamicGroupMetadata;

    public Output<DynamicGroupMetadataArgs> getDynamicGroupMetadata() {
        return this.dynamicGroupMetadata == null ? Codegen.empty() : this.dynamicGroupMetadata;
    }

    /**
     * The `EntityKey` of the `Group`.
     * 
     */
    @Import(name="groupKey", required=true)
      private final Output<EntityKeyArgs> groupKey;

    public Output<EntityKeyArgs> getGroupKey() {
        return this.groupKey;
    }

    @Import(name="initialGroupConfig")
      private final @Nullable Output<String> initialGroupConfig;

    public Output<String> getInitialGroupConfig() {
        return this.initialGroupConfig == null ? Codegen.empty() : this.initialGroupConfig;
    }

    /**
     * One or more label entries that apply to the Group. Currently supported labels contain a key with an empty value. Google Groups are the default type of group and have a label with a key of `cloudidentity.googleapis.com/groups.discussion_forum` and an empty value. Existing Google Groups can have an additional label with a key of `cloudidentity.googleapis.com/groups.security` and an empty value added to them. **This is an immutable change and the security label cannot be removed once added.** Dynamic groups have a label with a key of `cloudidentity.googleapis.com/groups.dynamic`. Identity-mapped groups for Cloud Search have a label with a key of `system/groups/external` and an empty value.
     * 
     */
    @Import(name="labels", required=true)
      private final Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }

    /**
     * Immutable. The resource name of the entity under which this `Group` resides in the Cloud Identity resource hierarchy. Must be of the form `identitysources/{identity_source}` for external- identity-mapped groups or `customers/{customer}` for Google Groups. The `customer` must begin with "C" (for example, 'C046psxkn').
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    public GroupArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<DynamicGroupMetadataArgs> dynamicGroupMetadata,
        Output<EntityKeyArgs> groupKey,
        @Nullable Output<String> initialGroupConfig,
        Output<Map<String,String>> labels,
        Output<String> parent) {
        this.description = description;
        this.displayName = displayName;
        this.dynamicGroupMetadata = dynamicGroupMetadata;
        this.groupKey = Objects.requireNonNull(groupKey, "expected parameter 'groupKey' to be non-null");
        this.initialGroupConfig = initialGroupConfig;
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
    }

    private GroupArgs() {
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.dynamicGroupMetadata = Codegen.empty();
        this.groupKey = Codegen.empty();
        this.initialGroupConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.parent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<DynamicGroupMetadataArgs> dynamicGroupMetadata;
        private Output<EntityKeyArgs> groupKey;
        private @Nullable Output<String> initialGroupConfig;
        private Output<Map<String,String>> labels;
        private Output<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.dynamicGroupMetadata = defaults.dynamicGroupMetadata;
    	      this.groupKey = defaults.groupKey;
    	      this.initialGroupConfig = defaults.initialGroupConfig;
    	      this.labels = defaults.labels;
    	      this.parent = defaults.parent;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder dynamicGroupMetadata(@Nullable Output<DynamicGroupMetadataArgs> dynamicGroupMetadata) {
            this.dynamicGroupMetadata = dynamicGroupMetadata;
            return this;
        }
        public Builder dynamicGroupMetadata(@Nullable DynamicGroupMetadataArgs dynamicGroupMetadata) {
            this.dynamicGroupMetadata = Codegen.ofNullable(dynamicGroupMetadata);
            return this;
        }
        public Builder groupKey(Output<EntityKeyArgs> groupKey) {
            this.groupKey = Objects.requireNonNull(groupKey);
            return this;
        }
        public Builder groupKey(EntityKeyArgs groupKey) {
            this.groupKey = Output.of(Objects.requireNonNull(groupKey));
            return this;
        }
        public Builder initialGroupConfig(@Nullable Output<String> initialGroupConfig) {
            this.initialGroupConfig = initialGroupConfig;
            return this;
        }
        public Builder initialGroupConfig(@Nullable String initialGroupConfig) {
            this.initialGroupConfig = Codegen.ofNullable(initialGroupConfig);
            return this;
        }
        public Builder labels(Output<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Output.of(Objects.requireNonNull(labels));
            return this;
        }
        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }        public GroupArgs build() {
            return new GroupArgs(description, displayName, dynamicGroupMetadata, groupKey, initialGroupConfig, labels, parent);
        }
    }
}
