// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an Azure resource group in a blueprint definition.
 * 
 */
public final class ResourceGroupDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceGroupDefinitionResponse Empty = new ResourceGroupDefinitionResponse();

    /**
     * Artifacts which need to be deployed before this resource group.
     * 
     */
    @InputImport(name="dependsOn")
      private final @Nullable List<String> dependsOn;

    public List<String> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Description of this parameter/resourceGroup.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * DisplayName of this parameter/resourceGroup.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Location of this resourceGroup. Leave empty if the resource group location will be specified during the blueprint assignment.
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Name of this resourceGroup. Leave empty if the resource group name will be specified during the blueprint assignment.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * StrongType for UI to render rich experience during blueprint assignment. Supported strong types are resourceType, principalId and location.
     * 
     */
    @InputImport(name="strongType")
      private final @Nullable String strongType;

    public Optional<String> getStrongType() {
        return this.strongType == null ? Optional.empty() : Optional.ofNullable(this.strongType);
    }

    /**
     * Tags to be assigned to this resource group.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public ResourceGroupDefinitionResponse(
        @Nullable List<String> dependsOn,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String location,
        @Nullable String name,
        @Nullable String strongType,
        @Nullable Map<String,String> tags) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.displayName = displayName;
        this.location = location;
        this.name = name;
        this.strongType = strongType;
        this.tags = tags;
    }

    private ResourceGroupDefinitionResponse() {
        this.dependsOn = List.of();
        this.description = null;
        this.displayName = null;
        this.location = null;
        this.name = null;
        this.strongType = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGroupDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dependsOn;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String location;
        private @Nullable String name;
        private @Nullable String strongType;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGroupDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.strongType = defaults.strongType;
    	      this.tags = defaults.tags;
        }

        public Builder dependsOn(@Nullable List<String> dependsOn) {
            this.dependsOn = dependsOn;
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

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder strongType(@Nullable String strongType) {
            this.strongType = strongType;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public ResourceGroupDefinitionResponse build() {
            return new ResourceGroupDefinitionResponse(dependsOn, description, displayName, location, name, strongType, tags);
        }
    }
}
