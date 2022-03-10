// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gameservices.inputs.GameServerDeploymentRolloutGameServerConfigOverrideArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerDeploymentRolloutArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerDeploymentRolloutArgs Empty = new GameServerDeploymentRolloutArgs();

    /**
     * This field points to the game server config that is
     * applied by default to all realms and clusters. For example,
     * `projects/my-project/locations/global/gameServerDeployments/my-game/configs/my-config`.
     * 
     */
    @InputImport(name="defaultGameServerConfig", required=true)
      private final Input<String> defaultGameServerConfig;

    public Input<String> getDefaultGameServerConfig() {
        return this.defaultGameServerConfig;
    }

    /**
     * The deployment to rollout the new config to. Only 1 rollout must be associated with each deployment.
     * 
     */
    @InputImport(name="deploymentId", required=true)
      private final Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * The game_server_config_overrides contains the per game server config
     * overrides. The overrides are processed in the order they are listed. As
     * soon as a match is found for a cluster, the rest of the list is not
     * processed.
     * Structure is documented below.
     * 
     */
    @InputImport(name="gameServerConfigOverrides")
      private final @Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides;

    public Input<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> getGameServerConfigOverrides() {
        return this.gameServerConfigOverrides == null ? Input.empty() : this.gameServerConfigOverrides;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public GameServerDeploymentRolloutArgs(
        Input<String> defaultGameServerConfig,
        Input<String> deploymentId,
        @Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides,
        @Nullable Input<String> project) {
        this.defaultGameServerConfig = Objects.requireNonNull(defaultGameServerConfig, "expected parameter 'defaultGameServerConfig' to be non-null");
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.gameServerConfigOverrides = gameServerConfigOverrides;
        this.project = project;
    }

    private GameServerDeploymentRolloutArgs() {
        this.defaultGameServerConfig = Input.empty();
        this.deploymentId = Input.empty();
        this.gameServerConfigOverrides = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> defaultGameServerConfig;
        private Input<String> deploymentId;
        private @Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultGameServerConfig = defaults.defaultGameServerConfig;
    	      this.deploymentId = defaults.deploymentId;
    	      this.gameServerConfigOverrides = defaults.gameServerConfigOverrides;
    	      this.project = defaults.project;
        }

        public Builder defaultGameServerConfig(Input<String> defaultGameServerConfig) {
            this.defaultGameServerConfig = Objects.requireNonNull(defaultGameServerConfig);
            return this;
        }

        public Builder defaultGameServerConfig(String defaultGameServerConfig) {
            this.defaultGameServerConfig = Input.of(Objects.requireNonNull(defaultGameServerConfig));
            return this;
        }

        public Builder deploymentId(Input<String> deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Input.of(Objects.requireNonNull(deploymentId));
            return this;
        }

        public Builder gameServerConfigOverrides(@Nullable Input<List<GameServerDeploymentRolloutGameServerConfigOverrideArgs>> gameServerConfigOverrides) {
            this.gameServerConfigOverrides = gameServerConfigOverrides;
            return this;
        }

        public Builder gameServerConfigOverrides(@Nullable List<GameServerDeploymentRolloutGameServerConfigOverrideArgs> gameServerConfigOverrides) {
            this.gameServerConfigOverrides = Input.ofNullable(gameServerConfigOverrides);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public GameServerDeploymentRolloutArgs build() {
            return new GameServerDeploymentRolloutArgs(defaultGameServerConfig, deploymentId, gameServerConfigOverrides, project);
        }
    }
}
