// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionCloudSqlCredentialGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionCloudSqlCredentialGetArgs Empty = new ConnectionCloudSqlCredentialGetArgs();

    /**
     * Password for database.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password for database.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Username for database.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for database.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ConnectionCloudSqlCredentialGetArgs() {}

    private ConnectionCloudSqlCredentialGetArgs(ConnectionCloudSqlCredentialGetArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionCloudSqlCredentialGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionCloudSqlCredentialGetArgs $;

        public Builder() {
            $ = new ConnectionCloudSqlCredentialGetArgs();
        }

        public Builder(ConnectionCloudSqlCredentialGetArgs defaults) {
            $ = new ConnectionCloudSqlCredentialGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Password for database.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for database.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username Username for database.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for database.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ConnectionCloudSqlCredentialGetArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
