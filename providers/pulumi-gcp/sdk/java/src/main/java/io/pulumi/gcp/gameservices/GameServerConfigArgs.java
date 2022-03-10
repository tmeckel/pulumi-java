// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigFleetConfigArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigScalingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigArgs Empty = new GameServerConfigArgs();

    /**
     * A unique id for the deployment config.
     * 
     */
    @InputImport(name="configId", required=true)
      private final Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId;
    }

    /**
     * A unique id for the deployment.
     * 
     */
    @InputImport(name="deploymentId", required=true)
      private final Input<String> deploymentId;

    public Input<String> getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * The description of the game server config.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The fleet config contains list of fleet specs. In the Single Cloud, there
     * will be only one.
     * Structure is documented below.
     * 
     */
    @InputImport(name="fleetConfigs", required=true)
      private final Input<List<GameServerConfigFleetConfigArgs>> fleetConfigs;

    public Input<List<GameServerConfigFleetConfigArgs>> getFleetConfigs() {
        return this.fleetConfigs;
    }

    /**
     * Set of labels to group by.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Location of the Deployment.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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

    /**
     * Optional. This contains the autoscaling settings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="scalingConfigs")
      private final @Nullable Input<List<GameServerConfigScalingConfigArgs>> scalingConfigs;

    public Input<List<GameServerConfigScalingConfigArgs>> getScalingConfigs() {
        return this.scalingConfigs == null ? Input.empty() : this.scalingConfigs;
    }

    public GameServerConfigArgs(
        Input<String> configId,
        Input<String> deploymentId,
        @Nullable Input<String> description,
        Input<List<GameServerConfigFleetConfigArgs>> fleetConfigs,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<List<GameServerConfigScalingConfigArgs>> scalingConfigs) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.deploymentId = Objects.requireNonNull(deploymentId, "expected parameter 'deploymentId' to be non-null");
        this.description = description;
        this.fleetConfigs = Objects.requireNonNull(fleetConfigs, "expected parameter 'fleetConfigs' to be non-null");
        this.labels = labels;
        this.location = location;
        this.project = project;
        this.scalingConfigs = scalingConfigs;
    }

    private GameServerConfigArgs() {
        this.configId = Input.empty();
        this.deploymentId = Input.empty();
        this.description = Input.empty();
        this.fleetConfigs = Input.empty();
        this.labels = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.scalingConfigs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configId;
        private Input<String> deploymentId;
        private @Nullable Input<String> description;
        private Input<List<GameServerConfigFleetConfigArgs>> fleetConfigs;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<List<GameServerConfigScalingConfigArgs>> scalingConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.fleetConfigs = defaults.fleetConfigs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.scalingConfigs = defaults.scalingConfigs;
        }

        public Builder configId(Input<String> configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder configId(String configId) {
            this.configId = Input.of(Objects.requireNonNull(configId));
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

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder fleetConfigs(Input<List<GameServerConfigFleetConfigArgs>> fleetConfigs) {
            this.fleetConfigs = Objects.requireNonNull(fleetConfigs);
            return this;
        }

        public Builder fleetConfigs(List<GameServerConfigFleetConfigArgs> fleetConfigs) {
            this.fleetConfigs = Input.of(Objects.requireNonNull(fleetConfigs));
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder scalingConfigs(@Nullable Input<List<GameServerConfigScalingConfigArgs>> scalingConfigs) {
            this.scalingConfigs = scalingConfigs;
            return this;
        }

        public Builder scalingConfigs(@Nullable List<GameServerConfigScalingConfigArgs> scalingConfigs) {
            this.scalingConfigs = Input.ofNullable(scalingConfigs);
            return this;
        }
        public GameServerConfigArgs build() {
            return new GameServerConfigArgs(configId, deploymentId, description, fleetConfigs, labels, location, project, scalingConfigs);
        }
    }
}
