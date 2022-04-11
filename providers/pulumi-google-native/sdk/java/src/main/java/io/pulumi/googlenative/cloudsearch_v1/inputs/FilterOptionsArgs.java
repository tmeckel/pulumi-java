// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudsearch_v1.inputs.FilterArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Filter options to be applied on query.
 * 
 */
public final class FilterOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterOptionsArgs Empty = new FilterOptionsArgs();

    /**
     * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<FilterArgs> filter;

    public Output<FilterArgs> getFilter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * If object_type is set, only objects of that type are returned. This should correspond to the name of the object that was registered within the definition of schema. The maximum length is 256 characters.
     * 
     */
    @Import(name="objectType")
      private final @Nullable Output<String> objectType;

    public Output<String> getObjectType() {
        return this.objectType == null ? Codegen.empty() : this.objectType;
    }

    public FilterOptionsArgs(
        @Nullable Output<FilterArgs> filter,
        @Nullable Output<String> objectType) {
        this.filter = filter;
        this.objectType = objectType;
    }

    private FilterOptionsArgs() {
        this.filter = Codegen.empty();
        this.objectType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FilterArgs> filter;
        private @Nullable Output<String> objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.objectType = defaults.objectType;
        }

        public Builder filter(@Nullable Output<FilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable FilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder objectType(@Nullable Output<String> objectType) {
            this.objectType = objectType;
            return this;
        }
        public Builder objectType(@Nullable String objectType) {
            this.objectType = Codegen.ofNullable(objectType);
            return this;
        }        public FilterOptionsArgs build() {
            return new FilterOptionsArgs(filter, objectType);
        }
    }
}
