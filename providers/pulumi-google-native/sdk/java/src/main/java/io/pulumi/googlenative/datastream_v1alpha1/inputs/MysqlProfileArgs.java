// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlSslConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MySQL database profile.
 * 
 */
public final class MysqlProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final MysqlProfileArgs Empty = new MysqlProfileArgs();

    /**
     * Hostname for the MySQL connection.
     * 
     */
    @InputImport(name="hostname", required=true)
    private final Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname;
    }

    /**
     * Input only. Password for the MySQL connection.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * Port for the MySQL connection, default value is 3306.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * SSL configuration for the MySQL connection.
     * 
     */
    @InputImport(name="sslConfig")
    private final @Nullable Input<MysqlSslConfigArgs> sslConfig;

    public Input<MysqlSslConfigArgs> getSslConfig() {
        return this.sslConfig == null ? Input.empty() : this.sslConfig;
    }

    /**
     * Username for the MySQL connection.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public MysqlProfileArgs(
        Input<String> hostname,
        Input<String> password,
        @Nullable Input<Integer> port,
        @Nullable Input<MysqlSslConfigArgs> sslConfig,
        Input<String> username) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = port;
        this.sslConfig = sslConfig;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MysqlProfileArgs() {
        this.hostname = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.sslConfig = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostname;
        private Input<String> password;
        private @Nullable Input<Integer> port;
        private @Nullable Input<MysqlSslConfigArgs> sslConfig;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.sslConfig = defaults.sslConfig;
    	      this.username = defaults.username;
        }

        public Builder setHostname(Input<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder setHostname(String hostname) {
            this.hostname = Input.of(Objects.requireNonNull(hostname));
            return this;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setSslConfig(@Nullable Input<MysqlSslConfigArgs> sslConfig) {
            this.sslConfig = sslConfig;
            return this;
        }

        public Builder setSslConfig(@Nullable MysqlSslConfigArgs sslConfig) {
            this.sslConfig = Input.ofNullable(sslConfig);
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public MysqlProfileArgs build() {
            return new MysqlProfileArgs(hostname, password, port, sslConfig, username);
        }
    }
}
