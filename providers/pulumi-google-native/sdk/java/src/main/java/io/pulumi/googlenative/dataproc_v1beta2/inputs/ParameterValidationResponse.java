// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.RegexValidationResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.ValueValidationResponse;
import java.util.Objects;


/**
 * Configuration for parameter validation.
 * 
 */
public final class ParameterValidationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParameterValidationResponse Empty = new ParameterValidationResponse();

    /**
     * Validation based on regular expressions.
     * 
     */
    @InputImport(name="regex", required=true)
    private final RegexValidationResponse regex;

    public RegexValidationResponse getRegex() {
        return this.regex;
    }

    /**
     * Validation based on a list of allowed values.
     * 
     */
    @InputImport(name="values", required=true)
    private final ValueValidationResponse values;

    public ValueValidationResponse getValues() {
        return this.values;
    }

    public ParameterValidationResponse(
        RegexValidationResponse regex,
        ValueValidationResponse values) {
        this.regex = Objects.requireNonNull(regex, "expected parameter 'regex' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ParameterValidationResponse() {
        this.regex = null;
        this.values = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexValidationResponse regex;
        private ValueValidationResponse values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder setRegex(RegexValidationResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }

        public Builder setValues(ValueValidationResponse values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public ParameterValidationResponse build() {
            return new ParameterValidationResponse(regex, values);
        }
    }
}
