// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair passed as an environment variable to the test.
 * 
 */
public final class EnvironmentVariableResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentVariableResponse Empty = new EnvironmentVariableResponse();

    /**
     * Key for the environment variable.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Key for the environment variable.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Value for the environment variable.
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return Value for the environment variable.
     * 
     */
    public String value() {
        return this.value;
    }

    private EnvironmentVariableResponse() {}

    private EnvironmentVariableResponse(EnvironmentVariableResponse $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVariableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVariableResponse $;

        public Builder() {
            $ = new EnvironmentVariableResponse();
        }

        public Builder(EnvironmentVariableResponse defaults) {
            $ = new EnvironmentVariableResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Key for the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param value Value for the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public EnvironmentVariableResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
