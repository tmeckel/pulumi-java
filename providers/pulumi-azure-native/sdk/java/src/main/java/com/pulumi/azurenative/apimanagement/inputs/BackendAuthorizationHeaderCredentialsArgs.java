// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Authorization header information.
 * 
 */
public final class BackendAuthorizationHeaderCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendAuthorizationHeaderCredentialsArgs Empty = new BackendAuthorizationHeaderCredentialsArgs();

    /**
     * Authentication Parameter value.
     * 
     */
    @Import(name="parameter", required=true)
    private Output<String> parameter;

    /**
     * @return Authentication Parameter value.
     * 
     */
    public Output<String> parameter() {
        return this.parameter;
    }

    /**
     * Authentication Scheme name.
     * 
     */
    @Import(name="scheme", required=true)
    private Output<String> scheme;

    /**
     * @return Authentication Scheme name.
     * 
     */
    public Output<String> scheme() {
        return this.scheme;
    }

    private BackendAuthorizationHeaderCredentialsArgs() {}

    private BackendAuthorizationHeaderCredentialsArgs(BackendAuthorizationHeaderCredentialsArgs $) {
        this.parameter = $.parameter;
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendAuthorizationHeaderCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendAuthorizationHeaderCredentialsArgs $;

        public Builder() {
            $ = new BackendAuthorizationHeaderCredentialsArgs();
        }

        public Builder(BackendAuthorizationHeaderCredentialsArgs defaults) {
            $ = new BackendAuthorizationHeaderCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameter Authentication Parameter value.
         * 
         * @return builder
         * 
         */
        public Builder parameter(Output<String> parameter) {
            $.parameter = parameter;
            return this;
        }

        /**
         * @param parameter Authentication Parameter value.
         * 
         * @return builder
         * 
         */
        public Builder parameter(String parameter) {
            return parameter(Output.of(parameter));
        }

        /**
         * @param scheme Authentication Scheme name.
         * 
         * @return builder
         * 
         */
        public Builder scheme(Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Authentication Scheme name.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public BackendAuthorizationHeaderCredentialsArgs build() {
            $.parameter = Objects.requireNonNull($.parameter, "expected parameter 'parameter' to be non-null");
            $.scheme = Objects.requireNonNull($.scheme, "expected parameter 'scheme' to be non-null");
            return $;
        }
    }

}
