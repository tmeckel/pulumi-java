// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.MethodMapResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.OptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * CollectionOverride allows resource handling overrides for specific resources within a BaseType
 * 
 */
public final class CollectionOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final CollectionOverrideResponse Empty = new CollectionOverrideResponse();

    /**
     * The collection that identifies this resource within its service.
     * 
     */
    @InputImport(name="collection", required=true)
      private final String collection;

    public String getCollection() {
        return this.collection;
    }

    /**
     * Custom verb method mappings to support unordered list API mappings.
     * 
     */
    @InputImport(name="methodMap", required=true)
      private final MethodMapResponse methodMap;

    public MethodMapResponse getMethodMap() {
        return this.methodMap;
    }

    /**
     * The options to apply to this resource-level override
     * 
     */
    @InputImport(name="options", required=true)
      private final OptionsResponse options;

    public OptionsResponse getOptions() {
        return this.options;
    }

    public CollectionOverrideResponse(
        String collection,
        MethodMapResponse methodMap,
        OptionsResponse options) {
        this.collection = Objects.requireNonNull(collection, "expected parameter 'collection' to be non-null");
        this.methodMap = Objects.requireNonNull(methodMap, "expected parameter 'methodMap' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
    }

    private CollectionOverrideResponse() {
        this.collection = null;
        this.methodMap = null;
        this.options = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CollectionOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String collection;
        private MethodMapResponse methodMap;
        private OptionsResponse options;

        public Builder() {
    	      // Empty
        }

        public Builder(CollectionOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.methodMap = defaults.methodMap;
    	      this.options = defaults.options;
        }

        public Builder collection(String collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }

        public Builder methodMap(MethodMapResponse methodMap) {
            this.methodMap = Objects.requireNonNull(methodMap);
            return this;
        }

        public Builder options(OptionsResponse options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public CollectionOverrideResponse build() {
            return new CollectionOverrideResponse(collection, methodMap, options);
        }
    }
}
