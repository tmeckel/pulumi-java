// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigFleetConfigGetArgs;
import io.pulumi.gcp.gameservices.inputs.GameServerConfigScalingConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GameServerConfigState extends io.pulumi.resources.ResourceArgs {

    public static final GameServerConfigState Empty = new GameServerConfigState();

    /**
     * A unique id for the deployment config.
     * 
     */
    @Import(name="configId")
      private final @Nullable Output<String> configId;

    public Output<String> getConfigId() {
        return this.configId == null ? Codegen.empty() : this.configId;
    }

    /**
     * A unique id for the deployment.
     * 
     */
    @Import(name="deploymentId")
      private final @Nullable Output<String> deploymentId;

    public Output<String> getDeploymentId() {
        return this.deploymentId == null ? Codegen.empty() : this.deploymentId;
    }

    /**
     * The description of the game server config.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The fleet config contains list of fleet specs. In the Single Cloud, there
     * will be only one.
     * Structure is documented below.
     * 
     */
    @Import(name="fleetConfigs")
      private final @Nullable Output<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs;

    public Output<List<GameServerConfigFleetConfigGetArgs>> getFleetConfigs() {
        return this.fleetConfigs == null ? Codegen.empty() : this.fleetConfigs;
    }

    /**
     * Set of labels to group by.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Location of the Deployment.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the ScalingConfig
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
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
     * Optional. This contains the autoscaling settings.
     * Structure is documented below.
     * 
     */
    @Import(name="scalingConfigs")
      private final @Nullable Output<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs;

    public Output<List<GameServerConfigScalingConfigGetArgs>> getScalingConfigs() {
        return this.scalingConfigs == null ? Codegen.empty() : this.scalingConfigs;
    }

    public GameServerConfigState(
        @Nullable Output<String> configId,
        @Nullable Output<String> deploymentId,
        @Nullable Output<String> description,
        @Nullable Output<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs) {
        this.configId = configId;
        this.deploymentId = deploymentId;
        this.description = description;
        this.fleetConfigs = fleetConfigs;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.scalingConfigs = scalingConfigs;
    }

    private GameServerConfigState() {
        this.configId = Codegen.empty();
        this.deploymentId = Codegen.empty();
        this.description = Codegen.empty();
        this.fleetConfigs = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.scalingConfigs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configId;
        private @Nullable Output<String> deploymentId;
        private @Nullable Output<String> description;
        private @Nullable Output<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.fleetConfigs = defaults.fleetConfigs;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.scalingConfigs = defaults.scalingConfigs;
        }

        public Builder configId(@Nullable Output<String> configId) {
            this.configId = configId;
            return this;
        }
        public Builder configId(@Nullable String configId) {
            this.configId = Codegen.ofNullable(configId);
            return this;
        }
        public Builder deploymentId(@Nullable Output<String> deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public Builder deploymentId(@Nullable String deploymentId) {
            this.deploymentId = Codegen.ofNullable(deploymentId);
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
        public Builder fleetConfigs(@Nullable Output<List<GameServerConfigFleetConfigGetArgs>> fleetConfigs) {
            this.fleetConfigs = fleetConfigs;
            return this;
        }
        public Builder fleetConfigs(@Nullable List<GameServerConfigFleetConfigGetArgs> fleetConfigs) {
            this.fleetConfigs = Codegen.ofNullable(fleetConfigs);
            return this;
        }
        public Builder fleetConfigs(GameServerConfigFleetConfigGetArgs... fleetConfigs) {
            return fleetConfigs(List.of(fleetConfigs));
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
        public Builder scalingConfigs(@Nullable Output<List<GameServerConfigScalingConfigGetArgs>> scalingConfigs) {
            this.scalingConfigs = scalingConfigs;
            return this;
        }
        public Builder scalingConfigs(@Nullable List<GameServerConfigScalingConfigGetArgs> scalingConfigs) {
            this.scalingConfigs = Codegen.ofNullable(scalingConfigs);
            return this;
        }
        public Builder scalingConfigs(GameServerConfigScalingConfigGetArgs... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }        public GameServerConfigState build() {
            return new GameServerConfigState(configId, deploymentId, description, fleetConfigs, labels, location, name, project, scalingConfigs);
        }
    }
}
