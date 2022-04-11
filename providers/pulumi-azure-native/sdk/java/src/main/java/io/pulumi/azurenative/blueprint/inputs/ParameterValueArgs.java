// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.azurenative.blueprint.inputs.SecretValueReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Value for the specified parameter. Can be either 'value' or 'reference' but not both.
 * 
 */
public final class ParameterValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterValueArgs Empty = new ParameterValueArgs();

    /**
     * Parameter value as reference type.
     * 
     */
    @Import(name="reference")
      private final @Nullable Output<SecretValueReferenceArgs> reference;

    public Output<SecretValueReferenceArgs> getReference() {
        return this.reference == null ? Codegen.empty() : this.reference;
    }

    /**
     * Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Object> value;

    public Output<Object> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ParameterValueArgs(
        @Nullable Output<SecretValueReferenceArgs> reference,
        @Nullable Output<Object> value) {
        this.reference = reference;
        this.value = value;
    }

    private ParameterValueArgs() {
        this.reference = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecretValueReferenceArgs> reference;
        private @Nullable Output<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reference = defaults.reference;
    	      this.value = defaults.value;
        }

        public Builder reference(@Nullable Output<SecretValueReferenceArgs> reference) {
            this.reference = reference;
            return this;
        }
        public Builder reference(@Nullable SecretValueReferenceArgs reference) {
            this.reference = Codegen.ofNullable(reference);
            return this;
        }
        public Builder value(@Nullable Output<Object> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Object value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ParameterValueArgs build() {
            return new ParameterValueArgs(reference, value);
        }
    }
}
