// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The environment variable to pass to the script in the container instance.
 * 
 */
public final class EnvironmentVariableArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableArgs Empty = new EnvironmentVariableArgs();

    /**
     * The name of the environment variable.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The value of the secure environment variable.
     * 
     */
    @InputImport(name="secureValue")
      private final @Nullable Input<String> secureValue;

    public Input<String> getSecureValue() {
        return this.secureValue == null ? Input.empty() : this.secureValue;
    }

    /**
     * The value of the environment variable.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public EnvironmentVariableArgs(
        Input<String> name,
        @Nullable Input<String> secureValue,
        @Nullable Input<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secureValue = secureValue;
        this.value = value;
    }

    private EnvironmentVariableArgs() {
        this.name = Input.empty();
        this.secureValue = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> secureValue;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVariableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secureValue = defaults.secureValue;
    	      this.value = defaults.value;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder secureValue(@Nullable Input<String> secureValue) {
            this.secureValue = secureValue;
            return this;
        }

        public Builder secureValue(@Nullable String secureValue) {
            this.secureValue = Input.ofNullable(secureValue);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public EnvironmentVariableArgs build() {
            return new EnvironmentVariableArgs(name, secureValue, value);
        }
    }
}
