// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on a list of allowed values.
 * 
 */
public final class ValueValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValueValidationArgs Empty = new ValueValidationArgs();

    /**
     * List of allowed values for the parameter.
     * 
     */
    @InputImport(name="values", required=true)
      private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public ValueValidationArgs(Input<List<String>> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ValueValidationArgs() {
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public ValueValidationArgs build() {
            return new ValueValidationArgs(values);
        }
    }
}
