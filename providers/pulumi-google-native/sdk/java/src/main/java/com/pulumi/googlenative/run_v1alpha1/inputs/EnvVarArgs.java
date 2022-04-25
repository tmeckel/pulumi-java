// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.EnvVarSourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class EnvVarArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvVarArgs Empty = new EnvVarArgs();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the environment variable. Must be a C_IDENTIFIER.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
     * 
     */
    @Import(name="valueFrom")
    private @Nullable Output<EnvVarSourceArgs> valueFrom;

    /**
     * @return (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
     * 
     */
    public Optional<Output<EnvVarSourceArgs>> valueFrom() {
        return Optional.ofNullable(this.valueFrom);
    }

    private EnvVarArgs() {}

    private EnvVarArgs(EnvVarArgs $) {
        this.name = $.name;
        this.value = $.value;
        this.valueFrom = $.valueFrom;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvVarArgs $;

        public Builder() {
            $ = new EnvVarArgs();
        }

        public Builder(EnvVarArgs defaults) {
            $ = new EnvVarArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the environment variable. Must be a C_IDENTIFIER.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the environment variable. Must be a C_IDENTIFIER.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value (Optional) Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to &#34;&#34;.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        /**
         * @param valueFrom (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
         * 
         * @return builder
         * 
         */
        public Builder valueFrom(@Nullable Output<EnvVarSourceArgs> valueFrom) {
            $.valueFrom = valueFrom;
            return this;
        }

        /**
         * @param valueFrom (Optional) Source for the environment variable&#39;s value. Only supports secret_key_ref. Source for the environment variable&#39;s value. Cannot be used if value is not empty.
         * 
         * @return builder
         * 
         */
        public Builder valueFrom(EnvVarSourceArgs valueFrom) {
            return valueFrom(Output.of(valueFrom));
        }

        public EnvVarArgs build() {
            return $;
        }
    }

}
