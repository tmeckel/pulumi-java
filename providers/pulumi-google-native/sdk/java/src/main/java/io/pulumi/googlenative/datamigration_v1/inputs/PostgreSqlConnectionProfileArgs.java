// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.inputs.SslConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies connection parameters required specifically for PostgreSQL databases.
 * 
 */
public final class PostgreSqlConnectionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final PostgreSqlConnectionProfileArgs Empty = new PostgreSqlConnectionProfileArgs();

    /**
     * If the source is a Cloud SQL database, use this field to provide the Cloud SQL instance ID of the source.
     * 
     */
    @InputImport(name="cloudSqlId")
      private final @Nullable Input<String> cloudSqlId;

    public Input<String> getCloudSqlId() {
        return this.cloudSqlId == null ? Input.empty() : this.cloudSqlId;
    }

    /**
     * The IP or hostname of the source PostgreSQL database.
     * 
     */
    @InputImport(name="host", required=true)
      private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    /**
     * Input only. The password for the user that Database Migration Service will be using to connect to the database. This field is not returned on request, and the value is encrypted when stored in Database Migration Service.
     * 
     */
    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * The network port of the source PostgreSQL database.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    /**
     * SSL configuration for the destination to connect to the source database.
     * 
     */
    @InputImport(name="ssl")
      private final @Nullable Input<SslConfigArgs> ssl;

    public Input<SslConfigArgs> getSsl() {
        return this.ssl == null ? Input.empty() : this.ssl;
    }

    /**
     * The username that Database Migration Service will use to connect to the database. The value is encrypted when stored in Database Migration Service.
     * 
     */
    @InputImport(name="username", required=true)
      private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public PostgreSqlConnectionProfileArgs(
        @Nullable Input<String> cloudSqlId,
        Input<String> host,
        Input<String> password,
        Input<Integer> port,
        @Nullable Input<SslConfigArgs> ssl,
        Input<String> username) {
        this.cloudSqlId = cloudSqlId;
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.ssl = ssl;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private PostgreSqlConnectionProfileArgs() {
        this.cloudSqlId = Input.empty();
        this.host = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.ssl = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgreSqlConnectionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudSqlId;
        private Input<String> host;
        private Input<String> password;
        private Input<Integer> port;
        private @Nullable Input<SslConfigArgs> ssl;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgreSqlConnectionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlId = defaults.cloudSqlId;
    	      this.host = defaults.host;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.ssl = defaults.ssl;
    	      this.username = defaults.username;
        }

        public Builder cloudSqlId(@Nullable Input<String> cloudSqlId) {
            this.cloudSqlId = cloudSqlId;
            return this;
        }

        public Builder cloudSqlId(@Nullable String cloudSqlId) {
            this.cloudSqlId = Input.ofNullable(cloudSqlId);
            return this;
        }

        public Builder host(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder password(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder port(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }

        public Builder ssl(@Nullable Input<SslConfigArgs> ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder ssl(@Nullable SslConfigArgs ssl) {
            this.ssl = Input.ofNullable(ssl);
            return this;
        }

        public Builder username(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder username(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public PostgreSqlConnectionProfileArgs build() {
            return new PostgreSqlConnectionProfileArgs(cloudSqlId, host, password, port, ssl, username);
        }
    }
}
