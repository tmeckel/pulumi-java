// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container environment variable.
 * 
 */
public final class EnvironmentVarArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentVarArgs Empty = new EnvironmentVarArgs();

    /**
     * Environment variable name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Name of the Container App secret from which to pull the environment variable value.
     * 
     */
    @Import(name="secretRef")
      private final @Nullable Output<String> secretRef;

    public Output<String> getSecretRef() {
        return this.secretRef == null ? Codegen.empty() : this.secretRef;
    }

    /**
     * Non-secret environment variable value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public EnvironmentVarArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> secretRef,
        @Nullable Output<String> value) {
        this.name = name;
        this.secretRef = secretRef;
        this.value = value;
    }

    private EnvironmentVarArgs() {
        this.name = Codegen.empty();
        this.secretRef = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> secretRef;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secretRef = defaults.secretRef;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder secretRef(@Nullable Output<String> secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public Builder secretRef(@Nullable String secretRef) {
            this.secretRef = Codegen.ofNullable(secretRef);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public EnvironmentVarArgs build() {
            return new EnvironmentVarArgs(name, secretRef, value);
        }
    }
}
