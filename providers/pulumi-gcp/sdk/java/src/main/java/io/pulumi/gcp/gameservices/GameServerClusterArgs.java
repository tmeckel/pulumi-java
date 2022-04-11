// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.gameservices.inputs.GameServerClusterConnectionInfoArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterArgs Empty = new GameServerClusterArgs();

    /**
     * Required. The resource name of the game server cluster
     * 
     */
    @Import(name="clusterId", required=true)
      private final Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId;
    }

    /**
     * Game server cluster connection information. This information is used to
     * manage game server clusters.
     * Structure is documented below.
     * 
     */
    @Import(name="connectionInfo", required=true)
      private final Output<GameServerClusterConnectionInfoArgs> connectionInfo;

    public Output<GameServerClusterConnectionInfoArgs> getConnectionInfo() {
        return this.connectionInfo;
    }

    /**
     * Human readable description of the cluster.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The labels associated with this game server cluster. Each label is a
     * key-value pair.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Location of the Cluster.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The realm id of the game server realm.
     * 
     */
    @Import(name="realmId", required=true)
      private final Output<String> realmId;

    public Output<String> getRealmId() {
        return this.realmId;
    }

    public GameServerClusterArgs(
        Output<String> clusterId,
        Output<GameServerClusterConnectionInfoArgs> connectionInfo,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        Output<String> realmId) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.connectionInfo = Objects.requireNonNull(connectionInfo, "expected parameter 'connectionInfo' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
    }

    private GameServerClusterArgs() {
        this.clusterId = Codegen.empty();
        this.connectionInfo = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.realmId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterId;
        private Output<GameServerClusterConnectionInfoArgs> connectionInfo;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private Output<String> realmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
        }

        public Builder clusterId(Output<String> clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Output.of(Objects.requireNonNull(clusterId));
            return this;
        }
        public Builder connectionInfo(Output<GameServerClusterConnectionInfoArgs> connectionInfo) {
            this.connectionInfo = Objects.requireNonNull(connectionInfo);
            return this;
        }
        public Builder connectionInfo(GameServerClusterConnectionInfoArgs connectionInfo) {
            this.connectionInfo = Output.of(Objects.requireNonNull(connectionInfo));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder realmId(Output<String> realmId) {
            this.realmId = Objects.requireNonNull(realmId);
            return this;
        }
        public Builder realmId(String realmId) {
            this.realmId = Output.of(Objects.requireNonNull(realmId));
            return this;
        }        public GameServerClusterArgs build() {
            return new GameServerClusterArgs(clusterId, connectionInfo, description, labels, location, project, realmId);
        }
    }
}
