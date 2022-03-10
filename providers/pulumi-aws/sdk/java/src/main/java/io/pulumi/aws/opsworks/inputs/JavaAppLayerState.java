// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.JavaAppLayerCloudwatchConfigurationGetArgs;
import io.pulumi.aws.opsworks.inputs.JavaAppLayerEbsVolumeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JavaAppLayerState extends io.pulumi.resources.ResourceArgs {

    public static final JavaAppLayerState Empty = new JavaAppLayerState();

    /**
     * Keyword for the application container to use. Defaults to "tomcat".
     * 
     */
    @InputImport(name="appServer")
      private final @Nullable Input<String> appServer;

    public Input<String> getAppServer() {
        return this.appServer == null ? Input.empty() : this.appServer;
    }

    /**
     * Version of the selected application container to use. Defaults to "7".
     * 
     */
    @InputImport(name="appServerVersion")
      private final @Nullable Input<String> appServerVersion;

    public Input<String> getAppServerVersion() {
        return this.appServerVersion == null ? Input.empty() : this.appServerVersion;
    }

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
      private final @Nullable Input<JavaAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;

    public Input<JavaAppLayerCloudwatchConfigurationGetArgs> getCloudwatchConfiguration() {
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
      private final @Nullable Input<List<JavaAppLayerEbsVolumeGetArgs>> ebsVolumes;

    public Input<List<JavaAppLayerEbsVolumeGetArgs>> getEbsVolumes() {
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
     * Options to set for the JVM.
     * 
     */
    @InputImport(name="jvmOptions")
      private final @Nullable Input<String> jvmOptions;

    public Input<String> getJvmOptions() {
        return this.jvmOptions == null ? Input.empty() : this.jvmOptions;
    }

    /**
     * Keyword for the type of JVM to use. Defaults to `openjdk`.
     * 
     */
    @InputImport(name="jvmType")
      private final @Nullable Input<String> jvmType;

    public Input<String> getJvmType() {
        return this.jvmType == null ? Input.empty() : this.jvmType;
    }

    /**
     * Version of JVM to use. Defaults to "7".
     * 
     */
    @InputImport(name="jvmVersion")
      private final @Nullable Input<String> jvmVersion;

    public Input<String> getJvmVersion() {
        return this.jvmVersion == null ? Input.empty() : this.jvmVersion;
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

    public JavaAppLayerState(
        @Nullable Input<String> appServer,
        @Nullable Input<String> appServerVersion,
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> autoAssignElasticIps,
        @Nullable Input<Boolean> autoAssignPublicIps,
        @Nullable Input<Boolean> autoHealing,
        @Nullable Input<JavaAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration,
        @Nullable Input<List<String>> customConfigureRecipes,
        @Nullable Input<List<String>> customDeployRecipes,
        @Nullable Input<String> customInstanceProfileArn,
        @Nullable Input<String> customJson,
        @Nullable Input<List<String>> customSecurityGroupIds,
        @Nullable Input<List<String>> customSetupRecipes,
        @Nullable Input<List<String>> customShutdownRecipes,
        @Nullable Input<List<String>> customUndeployRecipes,
        @Nullable Input<Boolean> drainElbOnShutdown,
        @Nullable Input<List<JavaAppLayerEbsVolumeGetArgs>> ebsVolumes,
        @Nullable Input<String> elasticLoadBalancer,
        @Nullable Input<Boolean> installUpdatesOnBoot,
        @Nullable Input<Integer> instanceShutdownTimeout,
        @Nullable Input<String> jvmOptions,
        @Nullable Input<String> jvmType,
        @Nullable Input<String> jvmVersion,
        @Nullable Input<String> name,
        @Nullable Input<String> stackId,
        @Nullable Input<List<String>> systemPackages,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<Boolean> useEbsOptimizedInstances) {
        this.appServer = appServer;
        this.appServerVersion = appServerVersion;
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
        this.jvmOptions = jvmOptions;
        this.jvmType = jvmType;
        this.jvmVersion = jvmVersion;
        this.name = name;
        this.stackId = stackId;
        this.systemPackages = systemPackages;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.useEbsOptimizedInstances = useEbsOptimizedInstances;
    }

    private JavaAppLayerState() {
        this.appServer = Input.empty();
        this.appServerVersion = Input.empty();
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
        this.jvmOptions = Input.empty();
        this.jvmType = Input.empty();
        this.jvmVersion = Input.empty();
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

    public static Builder builder(JavaAppLayerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appServer;
        private @Nullable Input<String> appServerVersion;
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> autoAssignElasticIps;
        private @Nullable Input<Boolean> autoAssignPublicIps;
        private @Nullable Input<Boolean> autoHealing;
        private @Nullable Input<JavaAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;
        private @Nullable Input<List<String>> customConfigureRecipes;
        private @Nullable Input<List<String>> customDeployRecipes;
        private @Nullable Input<String> customInstanceProfileArn;
        private @Nullable Input<String> customJson;
        private @Nullable Input<List<String>> customSecurityGroupIds;
        private @Nullable Input<List<String>> customSetupRecipes;
        private @Nullable Input<List<String>> customShutdownRecipes;
        private @Nullable Input<List<String>> customUndeployRecipes;
        private @Nullable Input<Boolean> drainElbOnShutdown;
        private @Nullable Input<List<JavaAppLayerEbsVolumeGetArgs>> ebsVolumes;
        private @Nullable Input<String> elasticLoadBalancer;
        private @Nullable Input<Boolean> installUpdatesOnBoot;
        private @Nullable Input<Integer> instanceShutdownTimeout;
        private @Nullable Input<String> jvmOptions;
        private @Nullable Input<String> jvmType;
        private @Nullable Input<String> jvmVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<String> stackId;
        private @Nullable Input<List<String>> systemPackages;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<Boolean> useEbsOptimizedInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(JavaAppLayerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appServer = defaults.appServer;
    	      this.appServerVersion = defaults.appServerVersion;
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
    	      this.jvmOptions = defaults.jvmOptions;
    	      this.jvmType = defaults.jvmType;
    	      this.jvmVersion = defaults.jvmVersion;
    	      this.name = defaults.name;
    	      this.stackId = defaults.stackId;
    	      this.systemPackages = defaults.systemPackages;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.useEbsOptimizedInstances = defaults.useEbsOptimizedInstances;
        }

        public Builder appServer(@Nullable Input<String> appServer) {
            this.appServer = appServer;
            return this;
        }

        public Builder appServer(@Nullable String appServer) {
            this.appServer = Input.ofNullable(appServer);
            return this;
        }

        public Builder appServerVersion(@Nullable Input<String> appServerVersion) {
            this.appServerVersion = appServerVersion;
            return this;
        }

        public Builder appServerVersion(@Nullable String appServerVersion) {
            this.appServerVersion = Input.ofNullable(appServerVersion);
            return this;
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

        public Builder cloudwatchConfiguration(@Nullable Input<JavaAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration) {
            this.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }

        public Builder cloudwatchConfiguration(@Nullable JavaAppLayerCloudwatchConfigurationGetArgs cloudwatchConfiguration) {
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

        public Builder ebsVolumes(@Nullable Input<List<JavaAppLayerEbsVolumeGetArgs>> ebsVolumes) {
            this.ebsVolumes = ebsVolumes;
            return this;
        }

        public Builder ebsVolumes(@Nullable List<JavaAppLayerEbsVolumeGetArgs> ebsVolumes) {
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

        public Builder jvmOptions(@Nullable Input<String> jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }

        public Builder jvmOptions(@Nullable String jvmOptions) {
            this.jvmOptions = Input.ofNullable(jvmOptions);
            return this;
        }

        public Builder jvmType(@Nullable Input<String> jvmType) {
            this.jvmType = jvmType;
            return this;
        }

        public Builder jvmType(@Nullable String jvmType) {
            this.jvmType = Input.ofNullable(jvmType);
            return this;
        }

        public Builder jvmVersion(@Nullable Input<String> jvmVersion) {
            this.jvmVersion = jvmVersion;
            return this;
        }

        public Builder jvmVersion(@Nullable String jvmVersion) {
            this.jvmVersion = Input.ofNullable(jvmVersion);
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
        public JavaAppLayerState build() {
            return new JavaAppLayerState(appServer, appServerVersion, arn, autoAssignElasticIps, autoAssignPublicIps, autoHealing, cloudwatchConfiguration, customConfigureRecipes, customDeployRecipes, customInstanceProfileArn, customJson, customSecurityGroupIds, customSetupRecipes, customShutdownRecipes, customUndeployRecipes, drainElbOnShutdown, ebsVolumes, elasticLoadBalancer, installUpdatesOnBoot, instanceShutdownTimeout, jvmOptions, jvmType, jvmVersion, name, stackId, systemPackages, tags, tagsAll, useEbsOptimizedInstances);
        }
    }
}
