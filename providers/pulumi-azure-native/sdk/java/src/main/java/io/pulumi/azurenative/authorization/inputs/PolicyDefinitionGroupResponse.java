// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policy definition group.
 * 
 */
public final class PolicyDefinitionGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final PolicyDefinitionGroupResponse Empty = new PolicyDefinitionGroupResponse();

    /**
     * A resource ID of a resource that contains additional metadata about the group.
     * 
     */
    @InputImport(name="additionalMetadataId")
      private final @Nullable String additionalMetadataId;

    public Optional<String> getAdditionalMetadataId() {
        return this.additionalMetadataId == null ? Optional.empty() : Optional.ofNullable(this.additionalMetadataId);
    }

    /**
     * The group's category.
     * 
     */
    @InputImport(name="category")
      private final @Nullable String category;

    public Optional<String> getCategory() {
        return this.category == null ? Optional.empty() : Optional.ofNullable(this.category);
    }

    /**
     * The group's description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The group's display name.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the group.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public PolicyDefinitionGroupResponse(
        @Nullable String additionalMetadataId,
        @Nullable String category,
        @Nullable String description,
        @Nullable String displayName,
        String name) {
        this.additionalMetadataId = additionalMetadataId;
        this.category = category;
        this.description = description;
        this.displayName = displayName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PolicyDefinitionGroupResponse() {
        this.additionalMetadataId = null;
        this.category = null;
        this.description = null;
        this.displayName = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyDefinitionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String additionalMetadataId;
        private @Nullable String category;
        private @Nullable String description;
        private @Nullable String displayName;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyDefinitionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMetadataId = defaults.additionalMetadataId;
    	      this.category = defaults.category;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder additionalMetadataId(@Nullable String additionalMetadataId) {
            this.additionalMetadataId = additionalMetadataId;
            return this;
        }

        public Builder category(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PolicyDefinitionGroupResponse build() {
            return new PolicyDefinitionGroupResponse(additionalMetadataId, category, description, displayName, name);
        }
    }
}
