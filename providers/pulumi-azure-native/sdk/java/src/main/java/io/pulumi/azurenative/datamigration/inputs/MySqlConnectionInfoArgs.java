// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information for connecting to MySQL server
 * 
 */
public final class MySqlConnectionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final MySqlConnectionInfoArgs Empty = new MySqlConnectionInfoArgs();

    /**
     * Password credential.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Port for Server
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    /**
     * Name of the server
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * Type of connection info
     * Expected value is 'MySqlConnectionInfo'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public MySqlConnectionInfoArgs(
        @Nullable Output<String> password,
        Output<Integer> port,
        Output<String> serverName,
        Output<String> type,
        @Nullable Output<String> userName) {
        this.password = password;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private MySqlConnectionInfoArgs() {
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.serverName = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> password;
        private Output<Integer> port;
        private Output<String> serverName;
        private Output<String> type;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public MySqlConnectionInfoArgs build() {
            return new MySqlConnectionInfoArgs(password, port, serverName, type, userName);
        }
    }
}
