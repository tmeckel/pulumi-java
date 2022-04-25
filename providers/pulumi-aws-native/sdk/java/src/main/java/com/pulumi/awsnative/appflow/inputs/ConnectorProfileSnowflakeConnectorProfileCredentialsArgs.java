// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileSnowflakeConnectorProfileCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSnowflakeConnectorProfileCredentialsArgs Empty = new ConnectorProfileSnowflakeConnectorProfileCredentialsArgs();

    /**
     * The password that corresponds to the username.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return The password that corresponds to the username.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The name of the user.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ConnectorProfileSnowflakeConnectorProfileCredentialsArgs() {}

    private ConnectorProfileSnowflakeConnectorProfileCredentialsArgs(ConnectorProfileSnowflakeConnectorProfileCredentialsArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileSnowflakeConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileSnowflakeConnectorProfileCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileSnowflakeConnectorProfileCredentialsArgs();
        }

        public Builder(ConnectorProfileSnowflakeConnectorProfileCredentialsArgs defaults) {
            $ = new ConnectorProfileSnowflakeConnectorProfileCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password that corresponds to the username.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password that corresponds to the username.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ConnectorProfileSnowflakeConnectorProfileCredentialsArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
