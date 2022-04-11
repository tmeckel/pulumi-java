// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dataproc_v1.inputs.RegexValidationArgs;
import io.pulumi.googlenative.dataproc_v1.inputs.ValueValidationArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for parameter validation.
 * 
 */
public final class ParameterValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterValidationArgs Empty = new ParameterValidationArgs();

    /**
     * Validation based on regular expressions.
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<RegexValidationArgs> regex;

    public Output<RegexValidationArgs> getRegex() {
        return this.regex == null ? Codegen.empty() : this.regex;
    }

    /**
     * Validation based on a list of allowed values.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<ValueValidationArgs> values;

    public Output<ValueValidationArgs> getValues() {
        return this.values == null ? Codegen.empty() : this.values;
    }

    public ParameterValidationArgs(
        @Nullable Output<RegexValidationArgs> regex,
        @Nullable Output<ValueValidationArgs> values) {
        this.regex = regex;
        this.values = values;
    }

    private ParameterValidationArgs() {
        this.regex = Codegen.empty();
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegexValidationArgs> regex;
        private @Nullable Output<ValueValidationArgs> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.values = defaults.values;
        }

        public Builder regex(@Nullable Output<RegexValidationArgs> regex) {
            this.regex = regex;
            return this;
        }
        public Builder regex(@Nullable RegexValidationArgs regex) {
            this.regex = Codegen.ofNullable(regex);
            return this;
        }
        public Builder values(@Nullable Output<ValueValidationArgs> values) {
            this.values = values;
            return this;
        }
        public Builder values(@Nullable ValueValidationArgs values) {
            this.values = Codegen.ofNullable(values);
            return this;
        }        public ParameterValidationArgs build() {
            return new ParameterValidationArgs(regex, values);
        }
    }
}
