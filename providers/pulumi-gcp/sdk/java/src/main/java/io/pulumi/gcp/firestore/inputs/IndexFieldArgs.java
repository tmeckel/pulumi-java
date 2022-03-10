// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firestore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexFieldArgs Empty = new IndexFieldArgs();

    /**
     * Indicates that this field supports operations on arrayValues. Only one of `order` and `arrayConfig` can
     * be specified.
     * Possible values are `CONTAINS`.
     * 
     */
    @InputImport(name="arrayConfig")
      private final @Nullable Input<String> arrayConfig;

    public Input<String> getArrayConfig() {
        return this.arrayConfig == null ? Input.empty() : this.arrayConfig;
    }

    /**
     * Name of the field.
     * 
     */
    @InputImport(name="fieldPath")
      private final @Nullable Input<String> fieldPath;

    public Input<String> getFieldPath() {
        return this.fieldPath == null ? Input.empty() : this.fieldPath;
    }

    /**
     * Indicates that this field supports ordering by the specified order or comparing using =, <, <=, >, >=.
     * Only one of `order` and `arrayConfig` can be specified.
     * Possible values are `ASCENDING` and `DESCENDING`.
     * 
     */
    @InputImport(name="order")
      private final @Nullable Input<String> order;

    public Input<String> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    public IndexFieldArgs(
        @Nullable Input<String> arrayConfig,
        @Nullable Input<String> fieldPath,
        @Nullable Input<String> order) {
        this.arrayConfig = arrayConfig;
        this.fieldPath = fieldPath;
        this.order = order;
    }

    private IndexFieldArgs() {
        this.arrayConfig = Input.empty();
        this.fieldPath = Input.empty();
        this.order = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arrayConfig;
        private @Nullable Input<String> fieldPath;
        private @Nullable Input<String> order;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayConfig = defaults.arrayConfig;
    	      this.fieldPath = defaults.fieldPath;
    	      this.order = defaults.order;
        }

        public Builder arrayConfig(@Nullable Input<String> arrayConfig) {
            this.arrayConfig = arrayConfig;
            return this;
        }

        public Builder arrayConfig(@Nullable String arrayConfig) {
            this.arrayConfig = Input.ofNullable(arrayConfig);
            return this;
        }

        public Builder fieldPath(@Nullable Input<String> fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        public Builder fieldPath(@Nullable String fieldPath) {
            this.fieldPath = Input.ofNullable(fieldPath);
            return this;
        }

        public Builder order(@Nullable Input<String> order) {
            this.order = order;
            return this;
        }

        public Builder order(@Nullable String order) {
            this.order = Input.ofNullable(order);
            return this;
        }
        public IndexFieldArgs build() {
            return new IndexFieldArgs(arrayConfig, fieldPath, order);
        }
    }
}
