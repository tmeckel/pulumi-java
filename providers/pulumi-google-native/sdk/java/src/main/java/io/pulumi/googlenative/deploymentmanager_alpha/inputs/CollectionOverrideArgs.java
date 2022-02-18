// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.MethodMapArgs;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.OptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CollectionOverride allows resource handling overrides for specific resources within a BaseType
 * 
 */
public final class CollectionOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final CollectionOverrideArgs Empty = new CollectionOverrideArgs();

    /**
     * The collection that identifies this resource within its service.
     * 
     */
    @InputImport(name="collection")
    private final @Nullable Input<String> collection;

    public Input<String> getCollection() {
        return this.collection == null ? Input.empty() : this.collection;
    }

    /**
     * Custom verb method mappings to support unordered list API mappings.
     * 
     */
    @InputImport(name="methodMap")
    private final @Nullable Input<MethodMapArgs> methodMap;

    public Input<MethodMapArgs> getMethodMap() {
        return this.methodMap == null ? Input.empty() : this.methodMap;
    }

    /**
     * The options to apply to this resource-level override
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<OptionsArgs> options;

    public Input<OptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    public CollectionOverrideArgs(
        @Nullable Input<String> collection,
        @Nullable Input<MethodMapArgs> methodMap,
        @Nullable Input<OptionsArgs> options) {
        this.collection = collection;
        this.methodMap = methodMap;
        this.options = options;
    }

    private CollectionOverrideArgs() {
        this.collection = Input.empty();
        this.methodMap = Input.empty();
        this.options = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectionOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> collection;
        private @Nullable Input<MethodMapArgs> methodMap;
        private @Nullable Input<OptionsArgs> options;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectionOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.methodMap = defaults.methodMap;
    	      this.options = defaults.options;
        }

        public Builder setCollection(@Nullable Input<String> collection) {
            this.collection = collection;
            return this;
        }

        public Builder setCollection(@Nullable String collection) {
            this.collection = Input.ofNullable(collection);
            return this;
        }

        public Builder setMethodMap(@Nullable Input<MethodMapArgs> methodMap) {
            this.methodMap = methodMap;
            return this;
        }

        public Builder setMethodMap(@Nullable MethodMapArgs methodMap) {
            this.methodMap = Input.ofNullable(methodMap);
            return this;
        }

        public Builder setOptions(@Nullable Input<OptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable OptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public CollectionOverrideArgs build() {
            return new CollectionOverrideArgs(collection, methodMap, options);
        }
    }
}
