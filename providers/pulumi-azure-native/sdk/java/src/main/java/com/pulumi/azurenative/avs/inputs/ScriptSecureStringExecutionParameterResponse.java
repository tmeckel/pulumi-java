// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * a plain text value execution parameter
 * 
 */
public final class ScriptSecureStringExecutionParameterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScriptSecureStringExecutionParameterResponse Empty = new ScriptSecureStringExecutionParameterResponse();

    /**
     * The parameter name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The parameter name
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * A secure value for the passed parameter, not to be stored in logs
     * 
     */
    @Import(name="secureValue")
    private @Nullable String secureValue;

    /**
     * @return A secure value for the passed parameter, not to be stored in logs
     * 
     */
    public Optional<String> secureValue() {
        return Optional.ofNullable(this.secureValue);
    }

    /**
     * The type of execution parameter
     * Expected value is &#39;SecureValue&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of execution parameter
     * Expected value is &#39;SecureValue&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    private ScriptSecureStringExecutionParameterResponse() {}

    private ScriptSecureStringExecutionParameterResponse(ScriptSecureStringExecutionParameterResponse $) {
        this.name = $.name;
        this.secureValue = $.secureValue;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptSecureStringExecutionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptSecureStringExecutionParameterResponse $;

        public Builder() {
            $ = new ScriptSecureStringExecutionParameterResponse();
        }

        public Builder(ScriptSecureStringExecutionParameterResponse defaults) {
            $ = new ScriptSecureStringExecutionParameterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The parameter name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param secureValue A secure value for the passed parameter, not to be stored in logs
         * 
         * @return builder
         * 
         */
        public Builder secureValue(@Nullable String secureValue) {
            $.secureValue = secureValue;
            return this;
        }

        /**
         * @param type The type of execution parameter
         * Expected value is &#39;SecureValue&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ScriptSecureStringExecutionParameterResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
