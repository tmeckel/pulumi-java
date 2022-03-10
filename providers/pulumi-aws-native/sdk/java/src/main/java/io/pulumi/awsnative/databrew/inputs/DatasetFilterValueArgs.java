// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate expression variable names with their values
 * 
 */
public final class DatasetFilterValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetFilterValueArgs Empty = new DatasetFilterValueArgs();

    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    /**
     * Variable name
     * 
     */
    @InputImport(name="valueReference", required=true)
      private final Input<String> valueReference;

    public Input<String> getValueReference() {
        return this.valueReference;
    }

    public DatasetFilterValueArgs(
        Input<String> value,
        Input<String> valueReference) {
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
        this.valueReference = Objects.requireNonNull(valueReference, "expected parameter 'valueReference' to be non-null");
    }

    private DatasetFilterValueArgs() {
        this.value = Input.empty();
        this.valueReference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetFilterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> value;
        private Input<String> valueReference;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetFilterValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueReference = defaults.valueReference;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public Builder valueReference(Input<String> valueReference) {
            this.valueReference = Objects.requireNonNull(valueReference);
            return this;
        }

        public Builder valueReference(String valueReference) {
            this.valueReference = Input.of(Objects.requireNonNull(valueReference));
            return this;
        }
        public DatasetFilterValueArgs build() {
            return new DatasetFilterValueArgs(value, valueReference);
        }
    }
}
