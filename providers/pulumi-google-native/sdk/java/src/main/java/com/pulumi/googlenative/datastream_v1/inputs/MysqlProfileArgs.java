// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1.inputs.MysqlSslConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MySQL database profile.
 * 
 */
public final class MysqlProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlProfileArgs Empty = new MysqlProfileArgs();

    /**
     * Hostname for the MySQL connection.
     * 
     */
    @Import(name="hostname", required=true)
    private Output<String> hostname;

    /**
     * @return Hostname for the MySQL connection.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }

    /**
     * Input only. Password for the MySQL connection.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Input only. Password for the MySQL connection.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Port for the MySQL connection, default value is 3306.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return Port for the MySQL connection, default value is 3306.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * SSL configuration for the MySQL connection.
     * 
     */
    @Import(name="sslConfig")
    private @Nullable Output<MysqlSslConfigArgs> sslConfig;

    /**
     * @return SSL configuration for the MySQL connection.
     * 
     */
    public Optional<Output<MysqlSslConfigArgs>> sslConfig() {
        return Optional.ofNullable(this.sslConfig);
    }

    /**
     * Username for the MySQL connection.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for the MySQL connection.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private MysqlProfileArgs() {}

    private MysqlProfileArgs(MysqlProfileArgs $) {
        this.hostname = $.hostname;
        this.password = $.password;
        this.port = $.port;
        this.sslConfig = $.sslConfig;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlProfileArgs $;

        public Builder() {
            $ = new MysqlProfileArgs();
        }

        public Builder(MysqlProfileArgs defaults) {
            $ = new MysqlProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname Hostname for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder hostname(Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param password Input only. Password for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Input only. Password for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param port Port for the MySQL connection, default value is 3306.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port for the MySQL connection, default value is 3306.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param sslConfig SSL configuration for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder sslConfig(@Nullable Output<MysqlSslConfigArgs> sslConfig) {
            $.sslConfig = sslConfig;
            return this;
        }

        /**
         * @param sslConfig SSL configuration for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder sslConfig(MysqlSslConfigArgs sslConfig) {
            return sslConfig(Output.of(sslConfig));
        }

        /**
         * @param username Username for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the MySQL connection.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public MysqlProfileArgs build() {
            $.hostname = Objects.requireNonNull($.hostname, "expected parameter 'hostname' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
