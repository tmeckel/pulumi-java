// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle database profile.
 * 
 */
public final class OracleProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleProfileArgs Empty = new OracleProfileArgs();

    /**
     * Connection string attributes
     * 
     */
    @InputImport(name="connectionAttributes")
    private final @Nullable Input<Map<String,String>> connectionAttributes;

    public Input<Map<String,String>> getConnectionAttributes() {
        return this.connectionAttributes == null ? Input.empty() : this.connectionAttributes;
    }

    /**
     * Database for the Oracle connection.
     * 
     */
    @InputImport(name="databaseService", required=true)
    private final Input<String> databaseService;

    public Input<String> getDatabaseService() {
        return this.databaseService;
    }

    /**
     * Hostname for the Oracle connection.
     * 
     */
    @InputImport(name="hostname", required=true)
    private final Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname;
    }

    /**
     * Password for the Oracle connection.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * Port for the Oracle connection, default value is 1521.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Username for the Oracle connection.
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public OracleProfileArgs(
        @Nullable Input<Map<String,String>> connectionAttributes,
        Input<String> databaseService,
        Input<String> hostname,
        Input<String> password,
        @Nullable Input<Integer> port,
        Input<String> username) {
        this.connectionAttributes = connectionAttributes;
        this.databaseService = Objects.requireNonNull(databaseService, "expected parameter 'databaseService' to be non-null");
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.port = port;
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private OracleProfileArgs() {
        this.connectionAttributes = Input.empty();
        this.databaseService = Input.empty();
        this.hostname = Input.empty();
        this.password = Input.empty();
        this.port = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> connectionAttributes;
        private Input<String> databaseService;
        private Input<String> hostname;
        private Input<String> password;
        private @Nullable Input<Integer> port;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionAttributes = defaults.connectionAttributes;
    	      this.databaseService = defaults.databaseService;
    	      this.hostname = defaults.hostname;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.username = defaults.username;
        }

        public Builder setConnectionAttributes(@Nullable Input<Map<String,String>> connectionAttributes) {
            this.connectionAttributes = connectionAttributes;
            return this;
        }

        public Builder setConnectionAttributes(@Nullable Map<String,String> connectionAttributes) {
            this.connectionAttributes = Input.ofNullable(connectionAttributes);
            return this;
        }

        public Builder setDatabaseService(Input<String> databaseService) {
            this.databaseService = Objects.requireNonNull(databaseService);
            return this;
        }

        public Builder setDatabaseService(String databaseService) {
            this.databaseService = Input.of(Objects.requireNonNull(databaseService));
            return this;
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

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public OracleProfileArgs build() {
            return new OracleProfileArgs(connectionAttributes, databaseService, hostname, password, port, username);
        }
    }
}
