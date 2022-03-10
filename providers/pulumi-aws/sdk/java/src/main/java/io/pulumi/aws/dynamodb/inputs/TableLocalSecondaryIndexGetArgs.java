// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableLocalSecondaryIndexGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableLocalSecondaryIndexGetArgs Empty = new TableLocalSecondaryIndexGetArgs();

    /**
     * The name of the index
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Only required with `INCLUDE` as a
     * projection type; a list of attributes to project into the index. These
     * do not need to be defined as attributes on the table.
     * 
     */
    @InputImport(name="nonKeyAttributes")
      private final @Nullable Input<List<String>> nonKeyAttributes;

    public Input<List<String>> getNonKeyAttributes() {
        return this.nonKeyAttributes == null ? Input.empty() : this.nonKeyAttributes;
    }

    /**
     * One of `ALL`, `INCLUDE` or `KEYS_ONLY`
     * where `ALL` projects every attribute into the index, `KEYS_ONLY`
     * projects just the hash and range key into the index, and `INCLUDE`
     * projects only the keys specified in the _non_key_attributes_
     * parameter.
     * 
     */
    @InputImport(name="projectionType", required=true)
      private final Input<String> projectionType;

    public Input<String> getProjectionType() {
        return this.projectionType;
    }

    /**
     * The name of the range key; must be defined
     * 
     */
    @InputImport(name="rangeKey", required=true)
      private final Input<String> rangeKey;

    public Input<String> getRangeKey() {
        return this.rangeKey;
    }

    public TableLocalSecondaryIndexGetArgs(
        Input<String> name,
        @Nullable Input<List<String>> nonKeyAttributes,
        Input<String> projectionType,
        Input<String> rangeKey) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nonKeyAttributes = nonKeyAttributes;
        this.projectionType = Objects.requireNonNull(projectionType, "expected parameter 'projectionType' to be non-null");
        this.rangeKey = Objects.requireNonNull(rangeKey, "expected parameter 'rangeKey' to be non-null");
    }

    private TableLocalSecondaryIndexGetArgs() {
        this.name = Input.empty();
        this.nonKeyAttributes = Input.empty();
        this.projectionType = Input.empty();
        this.rangeKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableLocalSecondaryIndexGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<List<String>> nonKeyAttributes;
        private Input<String> projectionType;
        private Input<String> rangeKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TableLocalSecondaryIndexGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder nonKeyAttributes(@Nullable Input<List<String>> nonKeyAttributes) {
            this.nonKeyAttributes = nonKeyAttributes;
            return this;
        }

        public Builder nonKeyAttributes(@Nullable List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Input.ofNullable(nonKeyAttributes);
            return this;
        }

        public Builder projectionType(Input<String> projectionType) {
            this.projectionType = Objects.requireNonNull(projectionType);
            return this;
        }

        public Builder projectionType(String projectionType) {
            this.projectionType = Input.of(Objects.requireNonNull(projectionType));
            return this;
        }

        public Builder rangeKey(Input<String> rangeKey) {
            this.rangeKey = Objects.requireNonNull(rangeKey);
            return this;
        }

        public Builder rangeKey(String rangeKey) {
            this.rangeKey = Input.of(Objects.requireNonNull(rangeKey));
            return this;
        }
        public TableLocalSecondaryIndexGetArgs build() {
            return new TableLocalSecondaryIndexGetArgs(name, nonKeyAttributes, projectionType, rangeKey);
        }
    }
}
