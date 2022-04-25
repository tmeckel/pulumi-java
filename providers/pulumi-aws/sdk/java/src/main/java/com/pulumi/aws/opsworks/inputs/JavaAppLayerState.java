// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.aws.opsworks.inputs.JavaAppLayerCloudwatchConfigurationGetArgs;
import com.pulumi.aws.opsworks.inputs.JavaAppLayerEbsVolumeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JavaAppLayerState extends com.pulumi.resources.ResourceArgs {

    public static final JavaAppLayerState Empty = new JavaAppLayerState();

    /**
     * Keyword for the application container to use. Defaults to &#34;tomcat&#34;.
     * 
     */
    @Import(name="appServer")
    private @Nullable Output<String> appServer;

    /**
     * @return Keyword for the application container to use. Defaults to &#34;tomcat&#34;.
     * 
     */
    public Optional<Output<String>> appServer() {
        return Optional.ofNullable(this.appServer);
    }

    /**
     * Version of the selected application container to use. Defaults to &#34;7&#34;.
     * 
     */
    @Import(name="appServerVersion")
    private @Nullable Output<String> appServerVersion;

    /**
     * @return Version of the selected application container to use. Defaults to &#34;7&#34;.
     * 
     */
    public Optional<Output<String>> appServerVersion() {
        return Optional.ofNullable(this.appServerVersion);
    }

    /**
     * The Amazon Resource Name(ARN) of the layer.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name(ARN) of the layer.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Whether to automatically assign an elastic IP address to the layer&#39;s instances.
     * 
     */
    @Import(name="autoAssignElasticIps")
    private @Nullable Output<Boolean> autoAssignElasticIps;

    /**
     * @return Whether to automatically assign an elastic IP address to the layer&#39;s instances.
     * 
     */
    public Optional<Output<Boolean>> autoAssignElasticIps() {
        return Optional.ofNullable(this.autoAssignElasticIps);
    }

    /**
     * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer&#39;s instances.
     * 
     */
    @Import(name="autoAssignPublicIps")
    private @Nullable Output<Boolean> autoAssignPublicIps;

    /**
     * @return For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer&#39;s instances.
     * 
     */
    public Optional<Output<Boolean>> autoAssignPublicIps() {
        return Optional.ofNullable(this.autoAssignPublicIps);
    }

    /**
     * Whether to enable auto-healing for the layer.
     * 
     */
    @Import(name="autoHealing")
    private @Nullable Output<Boolean> autoHealing;

    /**
     * @return Whether to enable auto-healing for the layer.
     * 
     */
    public Optional<Output<Boolean>> autoHealing() {
        return Optional.ofNullable(this.autoHealing);
    }

    @Import(name="cloudwatchConfiguration")
    private @Nullable Output<JavaAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration;

    public Optional<Output<JavaAppLayerCloudwatchConfigurationGetArgs>> cloudwatchConfiguration() {
        return Optional.ofNullable(this.cloudwatchConfiguration);
    }

    @Import(name="customConfigureRecipes")
    private @Nullable Output<List<String>> customConfigureRecipes;

    public Optional<Output<List<String>>> customConfigureRecipes() {
        return Optional.ofNullable(this.customConfigureRecipes);
    }

    @Import(name="customDeployRecipes")
    private @Nullable Output<List<String>> customDeployRecipes;

    public Optional<Output<List<String>>> customDeployRecipes() {
        return Optional.ofNullable(this.customDeployRecipes);
    }

    /**
     * The ARN of an IAM profile that will be used for the layer&#39;s instances.
     * 
     */
    @Import(name="customInstanceProfileArn")
    private @Nullable Output<String> customInstanceProfileArn;

    /**
     * @return The ARN of an IAM profile that will be used for the layer&#39;s instances.
     * 
     */
    public Optional<Output<String>> customInstanceProfileArn() {
        return Optional.ofNullable(this.customInstanceProfileArn);
    }

    /**
     * Custom JSON attributes to apply to the layer.
     * 
     */
    @Import(name="customJson")
    private @Nullable Output<String> customJson;

    /**
     * @return Custom JSON attributes to apply to the layer.
     * 
     */
    public Optional<Output<String>> customJson() {
        return Optional.ofNullable(this.customJson);
    }

    /**
     * Ids for a set of security groups to apply to the layer&#39;s instances.
     * 
     */
    @Import(name="customSecurityGroupIds")
    private @Nullable Output<List<String>> customSecurityGroupIds;

    /**
     * @return Ids for a set of security groups to apply to the layer&#39;s instances.
     * 
     */
    public Optional<Output<List<String>>> customSecurityGroupIds() {
        return Optional.ofNullable(this.customSecurityGroupIds);
    }

    @Import(name="customSetupRecipes")
    private @Nullable Output<List<String>> customSetupRecipes;

    public Optional<Output<List<String>>> customSetupRecipes() {
        return Optional.ofNullable(this.customSetupRecipes);
    }

    @Import(name="customShutdownRecipes")
    private @Nullable Output<List<String>> customShutdownRecipes;

    public Optional<Output<List<String>>> customShutdownRecipes() {
        return Optional.ofNullable(this.customShutdownRecipes);
    }

    @Import(name="customUndeployRecipes")
    private @Nullable Output<List<String>> customUndeployRecipes;

    public Optional<Output<List<String>>> customUndeployRecipes() {
        return Optional.ofNullable(this.customUndeployRecipes);
    }

    /**
     * Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    @Import(name="drainElbOnShutdown")
    private @Nullable Output<Boolean> drainElbOnShutdown;

    /**
     * @return Whether to enable Elastic Load Balancing connection draining.
     * 
     */
    public Optional<Output<Boolean>> drainElbOnShutdown() {
        return Optional.ofNullable(this.drainElbOnShutdown);
    }

    /**
     * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
     * 
     */
    @Import(name="ebsVolumes")
    private @Nullable Output<List<JavaAppLayerEbsVolumeGetArgs>> ebsVolumes;

    /**
     * @return `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
     * 
     */
    public Optional<Output<List<JavaAppLayerEbsVolumeGetArgs>>> ebsVolumes() {
        return Optional.ofNullable(this.ebsVolumes);
    }

    /**
     * Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    @Import(name="elasticLoadBalancer")
    private @Nullable Output<String> elasticLoadBalancer;

    /**
     * @return Name of an Elastic Load Balancer to attach to this layer
     * 
     */
    public Optional<Output<String>> elasticLoadBalancer() {
        return Optional.ofNullable(this.elasticLoadBalancer);
    }

    /**
     * Whether to install OS and package updates on each instance when it boots.
     * 
     */
    @Import(name="installUpdatesOnBoot")
    private @Nullable Output<Boolean> installUpdatesOnBoot;

    /**
     * @return Whether to install OS and package updates on each instance when it boots.
     * 
     */
    public Optional<Output<Boolean>> installUpdatesOnBoot() {
        return Optional.ofNullable(this.installUpdatesOnBoot);
    }

    /**
     * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    @Import(name="instanceShutdownTimeout")
    private @Nullable Output<Integer> instanceShutdownTimeout;

    /**
     * @return The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
     * 
     */
    public Optional<Output<Integer>> instanceShutdownTimeout() {
        return Optional.ofNullable(this.instanceShutdownTimeout);
    }

    /**
     * Options to set for the JVM.
     * 
     */
    @Import(name="jvmOptions")
    private @Nullable Output<String> jvmOptions;

    /**
     * @return Options to set for the JVM.
     * 
     */
    public Optional<Output<String>> jvmOptions() {
        return Optional.ofNullable(this.jvmOptions);
    }

    /**
     * Keyword for the type of JVM to use. Defaults to `openjdk`.
     * 
     */
    @Import(name="jvmType")
    private @Nullable Output<String> jvmType;

    /**
     * @return Keyword for the type of JVM to use. Defaults to `openjdk`.
     * 
     */
    public Optional<Output<String>> jvmType() {
        return Optional.ofNullable(this.jvmType);
    }

    /**
     * Version of JVM to use. Defaults to &#34;7&#34;.
     * 
     */
    @Import(name="jvmVersion")
    private @Nullable Output<String> jvmVersion;

    /**
     * @return Version of JVM to use. Defaults to &#34;7&#34;.
     * 
     */
    public Optional<Output<String>> jvmVersion() {
        return Optional.ofNullable(this.jvmVersion);
    }

    /**
     * A human-readable name for the layer.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-readable name for the layer.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The id of the stack the layer will belong to.
     * 
     */
    @Import(name="stackId")
    private @Nullable Output<String> stackId;

    /**
     * @return The id of the stack the layer will belong to.
     * 
     */
    public Optional<Output<String>> stackId() {
        return Optional.ofNullable(this.stackId);
    }

    /**
     * Names of a set of system packages to install on the layer&#39;s instances.
     * 
     */
    @Import(name="systemPackages")
    private @Nullable Output<List<String>> systemPackages;

    /**
     * @return Names of a set of system packages to install on the layer&#39;s instances.
     * 
     */
    public Optional<Output<List<String>>> systemPackages() {
        return Optional.ofNullable(this.systemPackages);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Whether to use EBS-optimized instances.
     * 
     */
    @Import(name="useEbsOptimizedInstances")
    private @Nullable Output<Boolean> useEbsOptimizedInstances;

    /**
     * @return Whether to use EBS-optimized instances.
     * 
     */
    public Optional<Output<Boolean>> useEbsOptimizedInstances() {
        return Optional.ofNullable(this.useEbsOptimizedInstances);
    }

    private JavaAppLayerState() {}

    private JavaAppLayerState(JavaAppLayerState $) {
        this.appServer = $.appServer;
        this.appServerVersion = $.appServerVersion;
        this.arn = $.arn;
        this.autoAssignElasticIps = $.autoAssignElasticIps;
        this.autoAssignPublicIps = $.autoAssignPublicIps;
        this.autoHealing = $.autoHealing;
        this.cloudwatchConfiguration = $.cloudwatchConfiguration;
        this.customConfigureRecipes = $.customConfigureRecipes;
        this.customDeployRecipes = $.customDeployRecipes;
        this.customInstanceProfileArn = $.customInstanceProfileArn;
        this.customJson = $.customJson;
        this.customSecurityGroupIds = $.customSecurityGroupIds;
        this.customSetupRecipes = $.customSetupRecipes;
        this.customShutdownRecipes = $.customShutdownRecipes;
        this.customUndeployRecipes = $.customUndeployRecipes;
        this.drainElbOnShutdown = $.drainElbOnShutdown;
        this.ebsVolumes = $.ebsVolumes;
        this.elasticLoadBalancer = $.elasticLoadBalancer;
        this.installUpdatesOnBoot = $.installUpdatesOnBoot;
        this.instanceShutdownTimeout = $.instanceShutdownTimeout;
        this.jvmOptions = $.jvmOptions;
        this.jvmType = $.jvmType;
        this.jvmVersion = $.jvmVersion;
        this.name = $.name;
        this.stackId = $.stackId;
        this.systemPackages = $.systemPackages;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.useEbsOptimizedInstances = $.useEbsOptimizedInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JavaAppLayerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JavaAppLayerState $;

        public Builder() {
            $ = new JavaAppLayerState();
        }

        public Builder(JavaAppLayerState defaults) {
            $ = new JavaAppLayerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServer Keyword for the application container to use. Defaults to &#34;tomcat&#34;.
         * 
         * @return builder
         * 
         */
        public Builder appServer(@Nullable Output<String> appServer) {
            $.appServer = appServer;
            return this;
        }

        /**
         * @param appServer Keyword for the application container to use. Defaults to &#34;tomcat&#34;.
         * 
         * @return builder
         * 
         */
        public Builder appServer(String appServer) {
            return appServer(Output.of(appServer));
        }

        /**
         * @param appServerVersion Version of the selected application container to use. Defaults to &#34;7&#34;.
         * 
         * @return builder
         * 
         */
        public Builder appServerVersion(@Nullable Output<String> appServerVersion) {
            $.appServerVersion = appServerVersion;
            return this;
        }

        /**
         * @param appServerVersion Version of the selected application container to use. Defaults to &#34;7&#34;.
         * 
         * @return builder
         * 
         */
        public Builder appServerVersion(String appServerVersion) {
            return appServerVersion(Output.of(appServerVersion));
        }

        /**
         * @param arn The Amazon Resource Name(ARN) of the layer.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name(ARN) of the layer.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param autoAssignElasticIps Whether to automatically assign an elastic IP address to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder autoAssignElasticIps(@Nullable Output<Boolean> autoAssignElasticIps) {
            $.autoAssignElasticIps = autoAssignElasticIps;
            return this;
        }

        /**
         * @param autoAssignElasticIps Whether to automatically assign an elastic IP address to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder autoAssignElasticIps(Boolean autoAssignElasticIps) {
            return autoAssignElasticIps(Output.of(autoAssignElasticIps));
        }

        /**
         * @param autoAssignPublicIps For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder autoAssignPublicIps(@Nullable Output<Boolean> autoAssignPublicIps) {
            $.autoAssignPublicIps = autoAssignPublicIps;
            return this;
        }

        /**
         * @param autoAssignPublicIps For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder autoAssignPublicIps(Boolean autoAssignPublicIps) {
            return autoAssignPublicIps(Output.of(autoAssignPublicIps));
        }

        /**
         * @param autoHealing Whether to enable auto-healing for the layer.
         * 
         * @return builder
         * 
         */
        public Builder autoHealing(@Nullable Output<Boolean> autoHealing) {
            $.autoHealing = autoHealing;
            return this;
        }

        /**
         * @param autoHealing Whether to enable auto-healing for the layer.
         * 
         * @return builder
         * 
         */
        public Builder autoHealing(Boolean autoHealing) {
            return autoHealing(Output.of(autoHealing));
        }

        public Builder cloudwatchConfiguration(@Nullable Output<JavaAppLayerCloudwatchConfigurationGetArgs> cloudwatchConfiguration) {
            $.cloudwatchConfiguration = cloudwatchConfiguration;
            return this;
        }

        public Builder cloudwatchConfiguration(JavaAppLayerCloudwatchConfigurationGetArgs cloudwatchConfiguration) {
            return cloudwatchConfiguration(Output.of(cloudwatchConfiguration));
        }

        public Builder customConfigureRecipes(@Nullable Output<List<String>> customConfigureRecipes) {
            $.customConfigureRecipes = customConfigureRecipes;
            return this;
        }

        public Builder customConfigureRecipes(List<String> customConfigureRecipes) {
            return customConfigureRecipes(Output.of(customConfigureRecipes));
        }

        public Builder customConfigureRecipes(String... customConfigureRecipes) {
            return customConfigureRecipes(List.of(customConfigureRecipes));
        }

        public Builder customDeployRecipes(@Nullable Output<List<String>> customDeployRecipes) {
            $.customDeployRecipes = customDeployRecipes;
            return this;
        }

        public Builder customDeployRecipes(List<String> customDeployRecipes) {
            return customDeployRecipes(Output.of(customDeployRecipes));
        }

        public Builder customDeployRecipes(String... customDeployRecipes) {
            return customDeployRecipes(List.of(customDeployRecipes));
        }

        /**
         * @param customInstanceProfileArn The ARN of an IAM profile that will be used for the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder customInstanceProfileArn(@Nullable Output<String> customInstanceProfileArn) {
            $.customInstanceProfileArn = customInstanceProfileArn;
            return this;
        }

        /**
         * @param customInstanceProfileArn The ARN of an IAM profile that will be used for the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder customInstanceProfileArn(String customInstanceProfileArn) {
            return customInstanceProfileArn(Output.of(customInstanceProfileArn));
        }

        /**
         * @param customJson Custom JSON attributes to apply to the layer.
         * 
         * @return builder
         * 
         */
        public Builder customJson(@Nullable Output<String> customJson) {
            $.customJson = customJson;
            return this;
        }

        /**
         * @param customJson Custom JSON attributes to apply to the layer.
         * 
         * @return builder
         * 
         */
        public Builder customJson(String customJson) {
            return customJson(Output.of(customJson));
        }

        /**
         * @param customSecurityGroupIds Ids for a set of security groups to apply to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder customSecurityGroupIds(@Nullable Output<List<String>> customSecurityGroupIds) {
            $.customSecurityGroupIds = customSecurityGroupIds;
            return this;
        }

        /**
         * @param customSecurityGroupIds Ids for a set of security groups to apply to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder customSecurityGroupIds(List<String> customSecurityGroupIds) {
            return customSecurityGroupIds(Output.of(customSecurityGroupIds));
        }

        /**
         * @param customSecurityGroupIds Ids for a set of security groups to apply to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder customSecurityGroupIds(String... customSecurityGroupIds) {
            return customSecurityGroupIds(List.of(customSecurityGroupIds));
        }

        public Builder customSetupRecipes(@Nullable Output<List<String>> customSetupRecipes) {
            $.customSetupRecipes = customSetupRecipes;
            return this;
        }

        public Builder customSetupRecipes(List<String> customSetupRecipes) {
            return customSetupRecipes(Output.of(customSetupRecipes));
        }

        public Builder customSetupRecipes(String... customSetupRecipes) {
            return customSetupRecipes(List.of(customSetupRecipes));
        }

        public Builder customShutdownRecipes(@Nullable Output<List<String>> customShutdownRecipes) {
            $.customShutdownRecipes = customShutdownRecipes;
            return this;
        }

        public Builder customShutdownRecipes(List<String> customShutdownRecipes) {
            return customShutdownRecipes(Output.of(customShutdownRecipes));
        }

        public Builder customShutdownRecipes(String... customShutdownRecipes) {
            return customShutdownRecipes(List.of(customShutdownRecipes));
        }

        public Builder customUndeployRecipes(@Nullable Output<List<String>> customUndeployRecipes) {
            $.customUndeployRecipes = customUndeployRecipes;
            return this;
        }

        public Builder customUndeployRecipes(List<String> customUndeployRecipes) {
            return customUndeployRecipes(Output.of(customUndeployRecipes));
        }

        public Builder customUndeployRecipes(String... customUndeployRecipes) {
            return customUndeployRecipes(List.of(customUndeployRecipes));
        }

        /**
         * @param drainElbOnShutdown Whether to enable Elastic Load Balancing connection draining.
         * 
         * @return builder
         * 
         */
        public Builder drainElbOnShutdown(@Nullable Output<Boolean> drainElbOnShutdown) {
            $.drainElbOnShutdown = drainElbOnShutdown;
            return this;
        }

        /**
         * @param drainElbOnShutdown Whether to enable Elastic Load Balancing connection draining.
         * 
         * @return builder
         * 
         */
        public Builder drainElbOnShutdown(Boolean drainElbOnShutdown) {
            return drainElbOnShutdown(Output.of(drainElbOnShutdown));
        }

        /**
         * @param ebsVolumes `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumes(@Nullable Output<List<JavaAppLayerEbsVolumeGetArgs>> ebsVolumes) {
            $.ebsVolumes = ebsVolumes;
            return this;
        }

        /**
         * @param ebsVolumes `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumes(List<JavaAppLayerEbsVolumeGetArgs> ebsVolumes) {
            return ebsVolumes(Output.of(ebsVolumes));
        }

        /**
         * @param ebsVolumes `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder ebsVolumes(JavaAppLayerEbsVolumeGetArgs... ebsVolumes) {
            return ebsVolumes(List.of(ebsVolumes));
        }

        /**
         * @param elasticLoadBalancer Name of an Elastic Load Balancer to attach to this layer
         * 
         * @return builder
         * 
         */
        public Builder elasticLoadBalancer(@Nullable Output<String> elasticLoadBalancer) {
            $.elasticLoadBalancer = elasticLoadBalancer;
            return this;
        }

        /**
         * @param elasticLoadBalancer Name of an Elastic Load Balancer to attach to this layer
         * 
         * @return builder
         * 
         */
        public Builder elasticLoadBalancer(String elasticLoadBalancer) {
            return elasticLoadBalancer(Output.of(elasticLoadBalancer));
        }

        /**
         * @param installUpdatesOnBoot Whether to install OS and package updates on each instance when it boots.
         * 
         * @return builder
         * 
         */
        public Builder installUpdatesOnBoot(@Nullable Output<Boolean> installUpdatesOnBoot) {
            $.installUpdatesOnBoot = installUpdatesOnBoot;
            return this;
        }

        /**
         * @param installUpdatesOnBoot Whether to install OS and package updates on each instance when it boots.
         * 
         * @return builder
         * 
         */
        public Builder installUpdatesOnBoot(Boolean installUpdatesOnBoot) {
            return installUpdatesOnBoot(Output.of(installUpdatesOnBoot));
        }

        /**
         * @param instanceShutdownTimeout The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
         * 
         * @return builder
         * 
         */
        public Builder instanceShutdownTimeout(@Nullable Output<Integer> instanceShutdownTimeout) {
            $.instanceShutdownTimeout = instanceShutdownTimeout;
            return this;
        }

        /**
         * @param instanceShutdownTimeout The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
         * 
         * @return builder
         * 
         */
        public Builder instanceShutdownTimeout(Integer instanceShutdownTimeout) {
            return instanceShutdownTimeout(Output.of(instanceShutdownTimeout));
        }

        /**
         * @param jvmOptions Options to set for the JVM.
         * 
         * @return builder
         * 
         */
        public Builder jvmOptions(@Nullable Output<String> jvmOptions) {
            $.jvmOptions = jvmOptions;
            return this;
        }

        /**
         * @param jvmOptions Options to set for the JVM.
         * 
         * @return builder
         * 
         */
        public Builder jvmOptions(String jvmOptions) {
            return jvmOptions(Output.of(jvmOptions));
        }

        /**
         * @param jvmType Keyword for the type of JVM to use. Defaults to `openjdk`.
         * 
         * @return builder
         * 
         */
        public Builder jvmType(@Nullable Output<String> jvmType) {
            $.jvmType = jvmType;
            return this;
        }

        /**
         * @param jvmType Keyword for the type of JVM to use. Defaults to `openjdk`.
         * 
         * @return builder
         * 
         */
        public Builder jvmType(String jvmType) {
            return jvmType(Output.of(jvmType));
        }

        /**
         * @param jvmVersion Version of JVM to use. Defaults to &#34;7&#34;.
         * 
         * @return builder
         * 
         */
        public Builder jvmVersion(@Nullable Output<String> jvmVersion) {
            $.jvmVersion = jvmVersion;
            return this;
        }

        /**
         * @param jvmVersion Version of JVM to use. Defaults to &#34;7&#34;.
         * 
         * @return builder
         * 
         */
        public Builder jvmVersion(String jvmVersion) {
            return jvmVersion(Output.of(jvmVersion));
        }

        /**
         * @param name A human-readable name for the layer.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-readable name for the layer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param stackId The id of the stack the layer will belong to.
         * 
         * @return builder
         * 
         */
        public Builder stackId(@Nullable Output<String> stackId) {
            $.stackId = stackId;
            return this;
        }

        /**
         * @param stackId The id of the stack the layer will belong to.
         * 
         * @return builder
         * 
         */
        public Builder stackId(String stackId) {
            return stackId(Output.of(stackId));
        }

        /**
         * @param systemPackages Names of a set of system packages to install on the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder systemPackages(@Nullable Output<List<String>> systemPackages) {
            $.systemPackages = systemPackages;
            return this;
        }

        /**
         * @param systemPackages Names of a set of system packages to install on the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder systemPackages(List<String> systemPackages) {
            return systemPackages(Output.of(systemPackages));
        }

        /**
         * @param systemPackages Names of a set of system packages to install on the layer&#39;s instances.
         * 
         * @return builder
         * 
         */
        public Builder systemPackages(String... systemPackages) {
            return systemPackages(List.of(systemPackages));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param useEbsOptimizedInstances Whether to use EBS-optimized instances.
         * 
         * @return builder
         * 
         */
        public Builder useEbsOptimizedInstances(@Nullable Output<Boolean> useEbsOptimizedInstances) {
            $.useEbsOptimizedInstances = useEbsOptimizedInstances;
            return this;
        }

        /**
         * @param useEbsOptimizedInstances Whether to use EBS-optimized instances.
         * 
         * @return builder
         * 
         */
        public Builder useEbsOptimizedInstances(Boolean useEbsOptimizedInstances) {
            return useEbsOptimizedInstances(Output.of(useEbsOptimizedInstances));
        }

        public JavaAppLayerState build() {
            return $;
        }
    }

}
