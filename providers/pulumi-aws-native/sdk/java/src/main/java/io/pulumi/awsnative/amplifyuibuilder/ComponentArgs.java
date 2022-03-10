// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentBindingPropertiesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentChildArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentCollectionPropertiesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentOverridesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentPropertiesArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentTagsArgs;
import io.pulumi.awsnative.amplifyuibuilder.inputs.ComponentVariantArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentArgs Empty = new ComponentArgs();

    @InputImport(name="bindingProperties")
      private final @Nullable Input<ComponentBindingPropertiesArgs> bindingProperties;

    public Input<ComponentBindingPropertiesArgs> getBindingProperties() {
        return this.bindingProperties == null ? Input.empty() : this.bindingProperties;
    }

    @InputImport(name="children")
      private final @Nullable Input<List<ComponentChildArgs>> children;

    public Input<List<ComponentChildArgs>> getChildren() {
        return this.children == null ? Input.empty() : this.children;
    }

    @InputImport(name="collectionProperties")
      private final @Nullable Input<ComponentCollectionPropertiesArgs> collectionProperties;

    public Input<ComponentCollectionPropertiesArgs> getCollectionProperties() {
        return this.collectionProperties == null ? Input.empty() : this.collectionProperties;
    }

    @InputImport(name="componentType")
      private final @Nullable Input<String> componentType;

    public Input<String> getComponentType() {
        return this.componentType == null ? Input.empty() : this.componentType;
    }

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="overrides")
      private final @Nullable Input<ComponentOverridesArgs> overrides;

    public Input<ComponentOverridesArgs> getOverrides() {
        return this.overrides == null ? Input.empty() : this.overrides;
    }

    @InputImport(name="properties")
      private final @Nullable Input<ComponentPropertiesArgs> properties;

    public Input<ComponentPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    @InputImport(name="sourceId")
      private final @Nullable Input<String> sourceId;

    public Input<String> getSourceId() {
        return this.sourceId == null ? Input.empty() : this.sourceId;
    }

    @InputImport(name="tags")
      private final @Nullable Input<ComponentTagsArgs> tags;

    public Input<ComponentTagsArgs> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="variants")
      private final @Nullable Input<List<ComponentVariantArgs>> variants;

    public Input<List<ComponentVariantArgs>> getVariants() {
        return this.variants == null ? Input.empty() : this.variants;
    }

    public ComponentArgs(
        @Nullable Input<ComponentBindingPropertiesArgs> bindingProperties,
        @Nullable Input<List<ComponentChildArgs>> children,
        @Nullable Input<ComponentCollectionPropertiesArgs> collectionProperties,
        @Nullable Input<String> componentType,
        @Nullable Input<String> name,
        @Nullable Input<ComponentOverridesArgs> overrides,
        @Nullable Input<ComponentPropertiesArgs> properties,
        @Nullable Input<String> sourceId,
        @Nullable Input<ComponentTagsArgs> tags,
        @Nullable Input<List<ComponentVariantArgs>> variants) {
        this.bindingProperties = bindingProperties;
        this.children = children;
        this.collectionProperties = collectionProperties;
        this.componentType = componentType;
        this.name = name;
        this.overrides = overrides;
        this.properties = properties;
        this.sourceId = sourceId;
        this.tags = tags;
        this.variants = variants;
    }

    private ComponentArgs() {
        this.bindingProperties = Input.empty();
        this.children = Input.empty();
        this.collectionProperties = Input.empty();
        this.componentType = Input.empty();
        this.name = Input.empty();
        this.overrides = Input.empty();
        this.properties = Input.empty();
        this.sourceId = Input.empty();
        this.tags = Input.empty();
        this.variants = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ComponentBindingPropertiesArgs> bindingProperties;
        private @Nullable Input<List<ComponentChildArgs>> children;
        private @Nullable Input<ComponentCollectionPropertiesArgs> collectionProperties;
        private @Nullable Input<String> componentType;
        private @Nullable Input<String> name;
        private @Nullable Input<ComponentOverridesArgs> overrides;
        private @Nullable Input<ComponentPropertiesArgs> properties;
        private @Nullable Input<String> sourceId;
        private @Nullable Input<ComponentTagsArgs> tags;
        private @Nullable Input<List<ComponentVariantArgs>> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingProperties = defaults.bindingProperties;
    	      this.children = defaults.children;
    	      this.collectionProperties = defaults.collectionProperties;
    	      this.componentType = defaults.componentType;
    	      this.name = defaults.name;
    	      this.overrides = defaults.overrides;
    	      this.properties = defaults.properties;
    	      this.sourceId = defaults.sourceId;
    	      this.tags = defaults.tags;
    	      this.variants = defaults.variants;
        }

        public Builder bindingProperties(@Nullable Input<ComponentBindingPropertiesArgs> bindingProperties) {
            this.bindingProperties = bindingProperties;
            return this;
        }

        public Builder bindingProperties(@Nullable ComponentBindingPropertiesArgs bindingProperties) {
            this.bindingProperties = Input.ofNullable(bindingProperties);
            return this;
        }

        public Builder children(@Nullable Input<List<ComponentChildArgs>> children) {
            this.children = children;
            return this;
        }

        public Builder children(@Nullable List<ComponentChildArgs> children) {
            this.children = Input.ofNullable(children);
            return this;
        }

        public Builder collectionProperties(@Nullable Input<ComponentCollectionPropertiesArgs> collectionProperties) {
            this.collectionProperties = collectionProperties;
            return this;
        }

        public Builder collectionProperties(@Nullable ComponentCollectionPropertiesArgs collectionProperties) {
            this.collectionProperties = Input.ofNullable(collectionProperties);
            return this;
        }

        public Builder componentType(@Nullable Input<String> componentType) {
            this.componentType = componentType;
            return this;
        }

        public Builder componentType(@Nullable String componentType) {
            this.componentType = Input.ofNullable(componentType);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder overrides(@Nullable Input<ComponentOverridesArgs> overrides) {
            this.overrides = overrides;
            return this;
        }

        public Builder overrides(@Nullable ComponentOverridesArgs overrides) {
            this.overrides = Input.ofNullable(overrides);
            return this;
        }

        public Builder properties(@Nullable Input<ComponentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable ComponentPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder sourceId(@Nullable Input<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(@Nullable String sourceId) {
            this.sourceId = Input.ofNullable(sourceId);
            return this;
        }

        public Builder tags(@Nullable Input<ComponentTagsArgs> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable ComponentTagsArgs tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder variants(@Nullable Input<List<ComponentVariantArgs>> variants) {
            this.variants = variants;
            return this;
        }

        public Builder variants(@Nullable List<ComponentVariantArgs> variants) {
            this.variants = Input.ofNullable(variants);
            return this;
        }
        public ComponentArgs build() {
            return new ComponentArgs(bindingProperties, children, collectionProperties, componentType, name, overrides, properties, sourceId, tags, variants);
        }
    }
}
