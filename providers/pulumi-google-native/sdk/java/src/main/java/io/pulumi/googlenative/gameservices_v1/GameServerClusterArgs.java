// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.gameservices_v1.inputs.GameServerClusterConnectionInfoArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerClusterArgs Empty = new GameServerClusterArgs();

    /**
     * The game server cluster connection information. This information is used to manage game server clusters.
     * 
     */
    @Import(name="connectionInfo")
      private final @Nullable Output<GameServerClusterConnectionInfoArgs> connectionInfo;

    public Output<GameServerClusterConnectionInfoArgs> getConnectionInfo() {
        return this.connectionInfo == null ? Codegen.empty() : this.connectionInfo;
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
     * ETag of the resource.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="gameServerClusterId", required=true)
      private final Output<String> gameServerClusterId;

    public Output<String> getGameServerClusterId() {
        return this.gameServerClusterId;
    }

    /**
     * The labels associated with this game server cluster. Each label is a key-value pair.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the game server cluster, in the following form: `projects/{project}/locations/{location}/realms/{realm}/gameServerClusters/{cluster}`. For example, `projects/my-project/locations/{location}/realms/zanzibar/gameServerClusters/my-onprem-cluster`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="realmId", required=true)
      private final Output<String> realmId;

    public Output<String> getRealmId() {
        return this.realmId;
    }

    public GameServerClusterArgs(
        @Nullable Output<GameServerClusterConnectionInfoArgs> connectionInfo,
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        Output<String> gameServerClusterId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> realmId) {
        this.connectionInfo = connectionInfo;
        this.description = description;
        this.etag = etag;
        this.gameServerClusterId = Objects.requireNonNull(gameServerClusterId, "expected parameter 'gameServerClusterId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
    }

    private GameServerClusterArgs() {
        this.connectionInfo = Codegen.empty();
        this.description = Codegen.empty();
        this.etag = Codegen.empty();
        this.gameServerClusterId = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
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
        private @Nullable Output<GameServerClusterConnectionInfoArgs> connectionInfo;
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private Output<String> gameServerClusterId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> realmId;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionInfo = defaults.connectionInfo;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.gameServerClusterId = defaults.gameServerClusterId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
        }

        public Builder connectionInfo(@Nullable Output<GameServerClusterConnectionInfoArgs> connectionInfo) {
            this.connectionInfo = connectionInfo;
            return this;
        }
        public Builder connectionInfo(@Nullable GameServerClusterConnectionInfoArgs connectionInfo) {
            this.connectionInfo = Codegen.ofNullable(connectionInfo);
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
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder gameServerClusterId(Output<String> gameServerClusterId) {
            this.gameServerClusterId = Objects.requireNonNull(gameServerClusterId);
            return this;
        }
        public Builder gameServerClusterId(String gameServerClusterId) {
            this.gameServerClusterId = Output.of(Objects.requireNonNull(gameServerClusterId));
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
            return new GameServerClusterArgs(connectionInfo, description, etag, gameServerClusterId, labels, location, name, project, realmId);
        }
    }
}
