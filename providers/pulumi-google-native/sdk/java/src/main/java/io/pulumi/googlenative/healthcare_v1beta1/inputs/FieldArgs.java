// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A (sub) field of a type.
 * 
 */
public final class FieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The maximum number of times this field can be repeated. 0 or -1 means unbounded.
     * 
     */
    @InputImport(name="maxOccurs")
      private final @Nullable Input<Integer> maxOccurs;

    public Input<Integer> getMaxOccurs() {
        return this.maxOccurs == null ? Input.empty() : this.maxOccurs;
    }

    /**
     * The minimum number of times this field must be present/repeated.
     * 
     */
    @InputImport(name="minOccurs")
      private final @Nullable Input<Integer> minOccurs;

    public Input<Integer> getMinOccurs() {
        return this.minOccurs == null ? Input.empty() : this.minOccurs;
    }

    /**
     * The name of the field. For example, "PID-1" or just "1".
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The HL7v2 table this field refers to. For example, PID-15 (Patient's Primary Language) usually refers to table "0296".
     * 
     */
    @InputImport(name="table")
      private final @Nullable Input<String> table;

    public Input<String> getTable() {
        return this.table == null ? Input.empty() : this.table;
    }

    /**
     * The type of this field. A Type with this name must be defined in an Hl7TypesConfig.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public FieldArgs(
        @Nullable Input<Integer> maxOccurs,
        @Nullable Input<Integer> minOccurs,
        @Nullable Input<String> name,
        @Nullable Input<String> table,
        @Nullable Input<String> type) {
        this.maxOccurs = maxOccurs;
        this.minOccurs = minOccurs;
        this.name = name;
        this.table = table;
        this.type = type;
    }

    private FieldArgs() {
        this.maxOccurs = Input.empty();
        this.minOccurs = Input.empty();
        this.name = Input.empty();
        this.table = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxOccurs;
        private @Nullable Input<Integer> minOccurs;
        private @Nullable Input<String> name;
        private @Nullable Input<String> table;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxOccurs = defaults.maxOccurs;
    	      this.minOccurs = defaults.minOccurs;
    	      this.name = defaults.name;
    	      this.table = defaults.table;
    	      this.type = defaults.type;
        }

        public Builder maxOccurs(@Nullable Input<Integer> maxOccurs) {
            this.maxOccurs = maxOccurs;
            return this;
        }

        public Builder maxOccurs(@Nullable Integer maxOccurs) {
            this.maxOccurs = Input.ofNullable(maxOccurs);
            return this;
        }

        public Builder minOccurs(@Nullable Input<Integer> minOccurs) {
            this.minOccurs = minOccurs;
            return this;
        }

        public Builder minOccurs(@Nullable Integer minOccurs) {
            this.minOccurs = Input.ofNullable(minOccurs);
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

        public Builder table(@Nullable Input<String> table) {
            this.table = table;
            return this;
        }

        public Builder table(@Nullable String table) {
            this.table = Input.ofNullable(table);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public FieldArgs build() {
            return new FieldArgs(maxOccurs, minOccurs, name, table, type);
        }
    }
}
