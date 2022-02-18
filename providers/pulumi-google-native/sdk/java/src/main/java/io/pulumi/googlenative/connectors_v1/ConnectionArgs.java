// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.connectors_v1.inputs.AuthConfigArgs;
import io.pulumi.googlenative.connectors_v1.inputs.ConfigVariableArgs;
import io.pulumi.googlenative.connectors_v1.inputs.LockConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Optional. Configuration for establishing the connection's authentication with an external system.
     * 
     */
    @InputImport(name="authConfig")
    private final @Nullable Input<AuthConfigArgs> authConfig;

    public Input<AuthConfigArgs> getAuthConfig() {
        return this.authConfig == null ? Input.empty() : this.authConfig;
    }

    /**
     * Optional. Configuration for configuring the connection with an external system.
     * 
     */
    @InputImport(name="configVariables")
    private final @Nullable Input<List<ConfigVariableArgs>> configVariables;

    public Input<List<ConfigVariableArgs>> getConfigVariables() {
        return this.configVariables == null ? Input.empty() : this.configVariables;
    }

    @InputImport(name="connectionId", required=true)
    private final Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId;
    }

    /**
     * Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
     * 
     */
    @InputImport(name="connectorVersion", required=true)
    private final Input<String> connectorVersion;

    public Input<String> getConnectorVersion() {
        return this.connectorVersion;
    }

    /**
     * Optional. Description of the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional. Configuration that indicates whether or not the Connection can be edited.
     * 
     */
    @InputImport(name="lockConfig")
    private final @Nullable Input<LockConfigArgs> lockConfig;

    public Input<LockConfigArgs> getLockConfig() {
        return this.lockConfig == null ? Input.empty() : this.lockConfig;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Optional. Service account needed for runtime plane to access GCP resources.
     * 
     */
    @InputImport(name="serviceAccount")
    private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Optional. Suspended indicates if a user has suspended a connection or not.
     * 
     */
    @InputImport(name="suspended")
    private final @Nullable Input<Boolean> suspended;

    public Input<Boolean> getSuspended() {
        return this.suspended == null ? Input.empty() : this.suspended;
    }

    public ConnectionArgs(
        @Nullable Input<AuthConfigArgs> authConfig,
        @Nullable Input<List<ConfigVariableArgs>> configVariables,
        Input<String> connectionId,
        Input<String> connectorVersion,
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<LockConfigArgs> lockConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<Boolean> suspended) {
        this.authConfig = authConfig;
        this.configVariables = configVariables;
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.connectorVersion = Objects.requireNonNull(connectorVersion, "expected parameter 'connectorVersion' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.lockConfig = lockConfig;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.suspended = suspended;
    }

    private ConnectionArgs() {
        this.authConfig = Input.empty();
        this.configVariables = Input.empty();
        this.connectionId = Input.empty();
        this.connectorVersion = Input.empty();
        this.description = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.lockConfig = Input.empty();
        this.project = Input.empty();
        this.serviceAccount = Input.empty();
        this.suspended = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AuthConfigArgs> authConfig;
        private @Nullable Input<List<ConfigVariableArgs>> configVariables;
        private Input<String> connectionId;
        private Input<String> connectorVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<LockConfigArgs> lockConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<Boolean> suspended;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authConfig = defaults.authConfig;
    	      this.configVariables = defaults.configVariables;
    	      this.connectionId = defaults.connectionId;
    	      this.connectorVersion = defaults.connectorVersion;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.lockConfig = defaults.lockConfig;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.suspended = defaults.suspended;
        }

        public Builder setAuthConfig(@Nullable Input<AuthConfigArgs> authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        public Builder setAuthConfig(@Nullable AuthConfigArgs authConfig) {
            this.authConfig = Input.ofNullable(authConfig);
            return this;
        }

        public Builder setConfigVariables(@Nullable Input<List<ConfigVariableArgs>> configVariables) {
            this.configVariables = configVariables;
            return this;
        }

        public Builder setConfigVariables(@Nullable List<ConfigVariableArgs> configVariables) {
            this.configVariables = Input.ofNullable(configVariables);
            return this;
        }

        public Builder setConnectionId(Input<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }

        public Builder setConnectionId(String connectionId) {
            this.connectionId = Input.of(Objects.requireNonNull(connectionId));
            return this;
        }

        public Builder setConnectorVersion(Input<String> connectorVersion) {
            this.connectorVersion = Objects.requireNonNull(connectorVersion);
            return this;
        }

        public Builder setConnectorVersion(String connectorVersion) {
            this.connectorVersion = Input.of(Objects.requireNonNull(connectorVersion));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setLockConfig(@Nullable Input<LockConfigArgs> lockConfig) {
            this.lockConfig = lockConfig;
            return this;
        }

        public Builder setLockConfig(@Nullable LockConfigArgs lockConfig) {
            this.lockConfig = Input.ofNullable(lockConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setSuspended(@Nullable Input<Boolean> suspended) {
            this.suspended = suspended;
            return this;
        }

        public Builder setSuspended(@Nullable Boolean suspended) {
            this.suspended = Input.ofNullable(suspended);
            return this;
        }

        public ConnectionArgs build() {
            return new ConnectionArgs(authConfig, configVariables, connectionId, connectorVersion, description, labels, location, lockConfig, project, serviceAccount, suspended);
        }
    }
}
