// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.PhpAppLayerCloudwatchConfigurationGetArgs;
import io.pulumi.aws.opsworks.inputs.PhpAppLayerEbsVolumeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PhpAppLayerState extends io.pulumi.resources.ResourceArgs {

    public static final PhpAppLayerState Empty = new PhpAppLayerState();

    /**
     * The Amazon Resource Name(ARN) of the layer.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Whether to automatically assign an elastic IP address to the layer's instances.
     * 
     */
    @InputImport(name="autoAssignElasticIps")
      private final @Nullable Input<Boolean> autoAssignElasticIps;

    public Input<Boolean> getAutoAssignElasticIps() {
        return this.autoAssignElasticIps == null ? Input.empty() : this.autoAssignElasticIps;
    }

    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
     * 
     */
    @InputImport(name="autoAssignPublicIps")
      private final @Nullable Input<Boolean> autoAssignPublicIps;

    public Input<Boolean> getAutoAssignPublicIps() {
        return this.autoAssignPublicIps == null ? Input.empty() : this.autoAssignPublicIps;
    }

    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @InputImport(name="autoHealing")
      private final @Nullable Input<Boolean> autoHealing;

    public Input<Boolean> getAutoHealing() {
        return this.autoHealing == null ? Input.empty() : this.autoHealing;
    }

    @InputImport(name="cloudwatchConfiguration")
      private final @Nullable Input<PhpAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;

    public Input<PhpAppLayerCloudwatchConfigurationGetArgs> getCloudwatchConfiguration() {
        return this.cloudwatchConfiguration == null ? Input.empty() : this.cloudwatchConfiguration;
    }

    @InputImport(name="customConfigureRecipes")
      private final @Nullable Input<List<String>> customConfigureRecipes;

    public Input<List<String>> getCustomConfigureRecipes() {
        return this.customConfigureRecipes == null ? Input.empty() : this.customConfigureRecipes;
    }

    @InputImport(name="customDeployRecipes")
      private final @Nullable Input<List<String>> customDeployRecipes;

    public Input<List<String>> getCustomDeployRecipes() {
        return this.customDeployRecipes == null ? Input.empty() : this.customDeployRecipes;
    }

    /**
     * The ARN of an IAM profile that will be used for the layer's instances.
     * 
     */
    @InputImport(name="customInstanceProfileArn")
      private final @Nullable Input<String> customInstanceProfileArn;

    public Input<String> getCustomInstanceProfileArn() {
        return this.customInstanceProfileArn == null ? Input.empty() : this.customInstanceProfileArn;
    }

    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @InputImport(name="customJson")
      private final @Nullable Input<String> customJson;

    public Input<String> getCustomJson() {
        return this.customJson == null ? Input.empty() : this.customJson;
    }

    /**
     * Ids for a set of security groups to apply to the layer's instances.
     * 
     */
    @InputImport(name="customSecurityGroupIds")
      private final @Nullable Input<List<String>> customSecurityGroupIds;

    public Input<List<String>> getCustomSecurityGroupIds() {
        return this.customSecurityGroupIds == null ? Input.empty() : this.customSecurityGroupIds;
    }

    @InputImport(name="customSetupRecipes")
      private final @Nullable Input<List<String>> customSetupRecipes;

    public Input<List<String>> getCustomSetupRecipes() {
        return this.customSetupRecipes == null ? Input.empty() : this.customSetupRecipes;
    }

    @InputImport(name="customShutdownRecipes")
      private final @Nullable Input<List<String>> customShutdownRecipes;

    public Input<List<String>> getCustomShutdownRecipes() {
        return this.customShutdownRecipes == null ? Input.empty() : this.customShutdownRecipes;
    }

    @InputImport(name="customUndeployRecipes")
      private final @Nullable Input<List<String>> customUndeployRecipes;

    public Input<List<String>> getCustomUndeployRecipes() {
        return this.customUndeployRecipes == null ? Input.empty() : this.customUndeployRecipes;
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @InputImport(name="drainElbOnShutdown")
      private final @Nullable Input<Boolean> drainElbOnShutdown;

    public Input<Boolean> getDrainElbOnShutdown() {
        return this.drainElbOnShutdown == null ? Input.empty() : this.drainElbOnShutdown;
    }

    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
     * 
     */
    @InputImport(name="ebsVolumes")
      private final @Nullable Input<List<PhpAppLayerEbsVolumeGetArgs>> ebsVolumes;

    public Input<List<PhpAppLayerEbsVolumeGetArgs>> getEbsVolumes() {
        return this.ebsVolumes == null ? Input.empty() : this.ebsVolumes;
    }

    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @InputImport(name="elasticLoadBalancer")
      private final @Nullable Input<String> elasticLoadBalancer;

    public Input<String> getElasticLoadBalancer() {
        return this.elasticLoadBalancer == null ? Input.empty() : this.elasticLoadBalancer;
    }

    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @InputImport(name="installUpdatesOnBoot")
      private final @Nullable Input<Boolean> installUpdatesOnBoot;

    public Input<Boolean> getInstallUpdatesOnBoot() {
        return this.installUpdatesOnBoot == null ? Input.empty() : this.installUpdatesOnBoot;
    }

    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @InputImport(name="instanceShutdownTimeout")
      private final @Nullable Input<Integer> instanceShutdownTimeout;

    public Input<Integer> getInstanceShutdownTimeout() {
        return this.instanceShutdownTimeout == null ? Input.empty() : this.instanceShutdownTimeout;
    }

    /**
     * A human-readable name for the layer.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @InputImport(name="stackId")
      private final @Nullable Input<String> stackId;

    public Input<String> getStackId() {
        return this.stackId == null ? Input.empty() : this.stackId;
    }

    /**
     * Names of a set of system packages to install on the layer's instances.
     * 
     */
    @InputImport(name="systemPackages")
      private final @Nullable Input<List<String>> systemPackages;

    public Input<List<String>> getSystemPackages() {
        return this.systemPackages == null ? Input.empty() : this.systemPackages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @InputImport(name="useEbsOptimizedInstances")
      private final @Nullable Input<Boolean> useEbsOptimizedInstances;

    public Input<Boolean> getUseEbsOptimizedInstances() {
        return this.useEbsOptimizedInstances == null ? Input.empty() : this.useEbsOptimizedInstances;
    }

    public PhpAppLayerState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoAssignElasticIps,
        @Nullable Input<Boolean> autoAssignPublicIps,
        @Nullable Input<Boolean> autoHealing,
        @Nullable Input<PhpAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration,
        @Nullable Input<List<String>> customConfigureRecipes,
        @Nullable Input<List<String>> customDeployRecipes,
        @Nullable Input<String> customInstanceProfileArn,
        @Nullable Input<String> customJson,
        @Nullable Input<List<String>> customSecurityGroupIds,
        @Nullable Input<List<String>> customSetupRecipes,
        @Nullable Input<List<String>> customShutdownRecipes,
        @Nullable Input<List<String>> customUndeployRecipes,
        @Nullable Input<Boolean> drainElbOnShutdown,
        @Nullable Input<List<PhpAppLayerEbsVolumeGetArgs>> ebsVolumes,
        @Nullable Input<String> elasticLoadBalancer,
        @Nullable Input<Boolean> installUpdatesOnBoot,
        @Nullable Input<Integer> instanceShutdownTimeout,
        @Nullable Input<String> name,
        @Nullable Input<String> stackId,
        @Nullable Input<List<String>> systemPackages,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Boolean> useEbsOptimizedInstances) {
        this.arn = arn;
        this.autoAssignElasticIps = autoAssignElasticIps;
        this.autoAssignPublicIps = autoAssignPublicIps;
        this.autoHealing = autoHealing;
        this.cloudwatchConfiguration = cloudwatchConfiguration;
        this.customConfigureRecipes = customConfigureRecipes;
        this.customDeployRecipes = customDeployRecipes;
        this.customInstanceProfileArn = customInstanceProfileArn;
        this.customJson = customJson;
        this.customSecurityGroupIds = customSecurityGroupIds;
        this.customSetupRecipes = customSetupRecipes;
        this.customShutdownRecipes = customShutdownRecipes;
        this.customUndeployRecipes = customUndeployRecipes;
        this.drainElbOnShutdown = drainElbOnShutdown;
        this.ebsVolumes = ebsVolumes;
        this.elasticLoadBalancer = elasticLoadBalancer;
        this.installUpdatesOnBoot = installUpdatesOnBoot;
        this.instanceShutdownTimeout = instanceShutdownTimeout;
        this.name = name;
        this.stackId = stackId;
        this.systemPackages = systemPackages;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    private PhpAppLayerState() {
        this.arn = Input.empty();
        this.autoAssignElasticIps = Input.empty();
        this.autoAssignPublicIps = Input.empty();
        this.autoHealing = Input.empty();
        this.cloudwatchConfiguration = Input.empty();
        this.customConfigureRecipes = Input.empty();
        this.customDeployRecipes = Input.empty();
        this.customInstanceProfileArn = Input.empty();
        this.customJson = Input.empty();
        this.customSecurityGroupIds = Input.empty();
        this.customSetupRecipes = Input.empty();
        this.customShutdownRecipes = Input.empty();
        this.customUndeployRecipes = Input.empty();
        this.drainElbOnShutdown = Input.empty();
        this.ebsVolumes = Input.empty();
        this.elasticLoadBalancer = Input.empty();
        this.installUpdatesOnBoot = Input.empty();
        this.instanceShutdownTimeout = Input.empty();
        this.name = Input.empty();
        this.stackId = Input.empty();
        this.systemPackages = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.useEbsOptimizedInstances = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhpAppLayerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoAssignElasticIps;
        private @Nullable Input<Boolean> autoAssignPublicIps;
        private @Nullable Input<Boolean> autoHealing;
        private @Nullable Input<PhpAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;
        private @Nullable Input<List<String>> customConfigureRecipes;
        private @Nullable Input<List<String>> customDeployRecipes;
        private @Nullable Input<String> customInstanceProfileArn;
        private @Nullable Input<String> customJson;
        private @Nullable Input<List<String>> customSecurityGroupIds;
        private @Nullable Input<List<String>> customSetupRecipes;
        private @Nullable Input<List<String>> customShutdownRecipes;
        private @Nullable Input<List<String>> customUndeployRecipes;
        private @Nullable Input<Boolean> drainElbOnShutdown;
        private @Nullable Input<List<PhpAppLayerEbsVolumeGetArgs>> ebsVolumes;
        private @Nullable Input<String> elasticLoadBalancer;
        private @Nullable Input<Boolean> installUpdatesOnBoot;
        private @Nullable Input<Integer> instanceShutdownTimeout;
        private @Nullable Input<String> name;
        private @Nullable Input<String> stackId;
        private @Nullable Input<List<String>> systemPackages;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Boolean> useEbsOptimizedInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(PhpAppLayerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoAssignElasticIps = defaults.autoAssignElasticIps;
    	      this.autoAssignPublicIps = defaults.autoAssignPublicIps;
    	      this.autoHealing = defaults.autoHealing;
    	      this.cloudwatchConfiguration = defaults.cloudwatchConfiguration;
    	      this.customConfigureRecipes = defaults.customConfigureRecipes;
    	      this.customDeployRecipes = defaults.customDeployRecipes;
    	      this.customInstanceProfileArn = defaults.customInstanceProfileArn;
    	      this.customJson = defaults.customJson;
    	      this.customSecurityGroupIds = defaults.customSecurityGroupIds;
    	      this.customSetupRecipes = defaults.customSetupRecipes;
    	      this.customShutdownRecipes = defaults.customShutdownRecipes;
    	      this.customUndeployRecipes = defaults.customUndeployRecipes;
    	      this.drainElbOnShutdown = defaults.drainElbOnShutdown;
    	      this.ebsVolumes = defaults.ebsVolumes;
    	      this.elasticLoadBalancer = defaults.elasticLoadBalancer;
    	      this.installUpdatesOnBoot = defaults.installUpdatesOnBoot;
    	      this.instanceShutdownTimeout = defaults.instanceShutdownTimeout;
    	      this.name = defaults.name;
    	      this.stackId = defaults.stackId;
    	      this.systemPackages = defaults.systemPackages;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.useEbsOptimizedInstances = defaults.useEbsOptimizedInstances;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder autoAssignElasticIps(@Nullable Input<Boolean> autoAssignElasticIps) {
            this.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        public Builder autoAssignElasticIps(@Nullable Boolean autoAssignElasticIps) {
            this.autoAssignElasticIps = Input.ofNullable(autoAssignElasticIps);
            return this;
        }

        public Builder autoAssignPublicIps(@Nullable Input<Boolean> autoAssignPublicIps) {
            this.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        public Builder autoAssignPublicIps(@Nullable Boolean autoAssignPublicIps) {
            this.autoAssignPublicIps = Input.ofNullable(autoAssignPublicIps);
            return this;
        }

        public Builder autoHealing(@Nullable Input<Boolean> autoHealing) {
            this.autoHealing = autoHealing;
            return this;
        }

        public Builder autoHealing(@Nullable Boolean autoHealing) {
            this.autoHealing = Input.ofNullable(autoHealing);
            return this;
        }

        public Builder cloudwatchConfiguration(@Nullable Input<PhpAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration) {
            this.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }

        public Builder cloudwatchConfiguration(@Nullable PhpAppLayerCloudwatchConfigurationGetArgs cloudwatchConfiguration) {
            this.cloudwatchConfiguration = Input.ofNullable(cloudwatchConfiguration);
            return this;
        }

        public Builder customConfigureRecipes(@Nullable Input<List<String>> customConfigureRecipes) {
            this.customConfigureRecipes = customConfigureRecipes;
            return this;
        }

        public Builder customConfigureRecipes(@Nullable List<String> customConfigureRecipes) {
            this.customConfigureRecipes = Input.ofNullable(customConfigureRecipes);
            return this;
        }

        public Builder customDeployRecipes(@Nullable Input<List<String>> customDeployRecipes) {
            this.customDeployRecipes = customDeployRecipes;
            return this;
        }

        public Builder customDeployRecipes(@Nullable List<String> customDeployRecipes) {
            this.customDeployRecipes = Input.ofNullable(customDeployRecipes);
            return this;
        }

        public Builder customInstanceProfileArn(@Nullable Input<String> customInstanceProfileArn) {
            this.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }

        public Builder customInstanceProfileArn(@Nullable String customInstanceProfileArn) {
            this.customInstanceProfileArn = Input.ofNullable(customInstanceProfileArn);
            return this;
        }

        public Builder customJson(@Nullable Input<String> customJson) {
            this.customJson = customJson;
            return this;
        }

        public Builder customJson(@Nullable String customJson) {
            this.customJson = Input.ofNullable(customJson);
            return this;
        }

        public Builder customSecurityGroupIds(@Nullable Input<List<String>> customSecurityGroupIds) {
            this.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }

        public Builder customSecurityGroupIds(@Nullable List<String> customSecurityGroupIds) {
            this.customSecurityGroupIds = Input.ofNullable(customSecurityGroupIds);
            return this;
        }

        public Builder customSetupRecipes(@Nullable Input<List<String>> customSetupRecipes) {
            this.customSetupRecipes = customSetupRecipes;
            return this;
        }

        public Builder customSetupRecipes(@Nullable List<String> customSetupRecipes) {
            this.customSetupRecipes = Input.ofNullable(customSetupRecipes);
            return this;
        }

        public Builder customShutdownRecipes(@Nullable Input<List<String>> customShutdownRecipes) {
            this.customShutdownRecipes = customShutdownRecipes;
            return this;
        }

        public Builder customShutdownRecipes(@Nullable List<String> customShutdownRecipes) {
            this.customShutdownRecipes = Input.ofNullable(customShutdownRecipes);
            return this;
        }

        public Builder customUndeployRecipes(@Nullable Input<List<String>> customUndeployRecipes) {
            this.customUndeployRecipes = customUndeployRecipes;
            return this;
        }

        public Builder customUndeployRecipes(@Nullable List<String> customUndeployRecipes) {
            this.customUndeployRecipes = Input.ofNullable(customUndeployRecipes);
            return this;
        }

        public Builder drainElbOnShutdown(@Nullable Input<Boolean> drainElbOnShutdown) {
            this.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        public Builder drainElbOnShutdown(@Nullable Boolean drainElbOnShutdown) {
            this.drainElbOnShutdown = Input.ofNullable(drainElbOnShutdown);
            return this;
        }

        public Builder ebsVolumes(@Nullable Input<List<PhpAppLayerEbsVolumeGetArgs>> ebsVolumes) {
            this.ebsVolumes = ebsVolumes;
            return this;
        }

        public Builder ebsVolumes(@Nullable List<PhpAppLayerEbsVolumeGetArgs> ebsVolumes) {
            this.ebsVolumes = Input.ofNullable(ebsVolumes);
            return this;
        }

        public Builder elasticLoadBalancer(@Nullable Input<String> elasticLoadBalancer) {
            this.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }

        public Builder elasticLoadBalancer(@Nullable String elasticLoadBalancer) {
            this.elasticLoadBalancer = Input.ofNullable(elasticLoadBalancer);
            return this;
        }

        public Builder installUpdatesOnBoot(@Nullable Input<Boolean> installUpdatesOnBoot) {
            this.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        public Builder installUpdatesOnBoot(@Nullable Boolean installUpdatesOnBoot) {
            this.installUpdatesOnBoot = Input.ofNullable(installUpdatesOnBoot);
            return this;
        }

        public Builder instanceShutdownTimeout(@Nullable Input<Integer> instanceShutdownTimeout) {
            this.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }

        public Builder instanceShutdownTimeout(@Nullable Integer instanceShutdownTimeout) {
            this.instanceShutdownTimeout = Input.ofNullable(instanceShutdownTimeout);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder stackId(@Nullable Input<String> stackId) {
            this.stackId = stackId;
            return this;
        }

        public Builder stackId(@Nullable String stackId) {
            this.stackId = Input.ofNullable(stackId);
            return this;
        }

        public Builder systemPackages(@Nullable Input<List<String>> systemPackages) {
            this.systemPackages = systemPackages;
            return this;
        }

        public Builder systemPackages(@Nullable List<String> systemPackages) {
            this.systemPackages = Input.ofNullable(systemPackages);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder useEbsOptimizedInstances(@Nullable Input<Boolean> useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        public Builder useEbsOptimizedInstances(@Nullable Boolean useEbsOptimizedInstances) {
            this.useEbsOptimizedInstances = Input.ofNullable(useEbsOptimizedInstances);
            return this;
        }
        public PhpAppLayerState build() {
            return new PhpAppLayerState(arn, autoAssignElasticIps, autoAssignPublicIps, autoHealing, cloudwatchConfiguration, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolumes, elasticLoadBalancer, installUpdatesOnBoot, instanceShutdownTimeout, name, stackId, systemPackages, tags, tagsAll, useEbsOptimizedInstances);
        }
    }
}
