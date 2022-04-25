// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.aws.ecs.inputs.ClusterConfigurationGetArgs;
import com.pulumi.aws.ecs.inputs.ClusterDefaultCapacityProviderStrategyGetArgs;
import com.pulumi.aws.ecs.inputs.ClusterSettingGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * ARN that identifies the cluster.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN that identifies the cluster.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    @Import(name="capacityProviders")
    private @Nullable Output<List<String>> capacityProviders;

    /**
     * @return List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
     * 
     */
    public Optional<Output<List<String>>> capacityProviders() {
        return Optional.ofNullable(this.capacityProviders);
    }

    /**
     * The execute command configuration for the cluster. Detailed below.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<ClusterConfigurationGetArgs> configuration;

    /**
     * @return The execute command configuration for the cluster. Detailed below.
     * 
     */
    public Optional<Output<ClusterConfigurationGetArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
     * 
     */
    @Import(name="defaultCapacityProviderStrategies")
    private @Nullable Output<List<ClusterDefaultCapacityProviderStrategyGetArgs>> defaultCapacityProviderStrategies;

    /**
     * @return Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
     * 
     */
    public Optional<Output<List<ClusterDefaultCapacityProviderStrategyGetArgs>>> defaultCapacityProviderStrategies() {
        return Optional.ofNullable(this.defaultCapacityProviderStrategies);
    }

    /**
     * Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the setting to manage. Valid values: `containerInsights`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<List<ClusterSettingGetArgs>> settings;

    /**
     * @return Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
     * 
     */
    public Optional<Output<List<ClusterSettingGetArgs>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.arn = $.arn;
        this.capacityProviders = $.capacityProviders;
        this.configuration = $.configuration;
        this.defaultCapacityProviderStrategies = $.defaultCapacityProviderStrategies;
        this.name = $.name;
        this.settings = $.settings;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN that identifies the cluster.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN that identifies the cluster.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param capacityProviders List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
         * 
         * @return builder
         * 
         */
        public Builder capacityProviders(@Nullable Output<List<String>> capacityProviders) {
            $.capacityProviders = capacityProviders;
            return this;
        }

        /**
         * @param capacityProviders List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
         * 
         * @return builder
         * 
         */
        public Builder capacityProviders(List<String> capacityProviders) {
            return capacityProviders(Output.of(capacityProviders));
        }

        /**
         * @param capacityProviders List of short names of one or more capacity providers to associate with the cluster. Valid values also include `FARGATE` and `FARGATE_SPOT`.
         * 
         * @return builder
         * 
         */
        public Builder capacityProviders(String... capacityProviders) {
            return capacityProviders(List.of(capacityProviders));
        }

        /**
         * @param configuration The execute command configuration for the cluster. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<ClusterConfigurationGetArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration The execute command configuration for the cluster. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(ClusterConfigurationGetArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param defaultCapacityProviderStrategies Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultCapacityProviderStrategies(@Nullable Output<List<ClusterDefaultCapacityProviderStrategyGetArgs>> defaultCapacityProviderStrategies) {
            $.defaultCapacityProviderStrategies = defaultCapacityProviderStrategies;
            return this;
        }

        /**
         * @param defaultCapacityProviderStrategies Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultCapacityProviderStrategies(List<ClusterDefaultCapacityProviderStrategyGetArgs> defaultCapacityProviderStrategies) {
            return defaultCapacityProviderStrategies(Output.of(defaultCapacityProviderStrategies));
        }

        /**
         * @param defaultCapacityProviderStrategies Configuration block for capacity provider strategy to use by default for the cluster. Can be one or more. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder defaultCapacityProviderStrategies(ClusterDefaultCapacityProviderStrategyGetArgs... defaultCapacityProviderStrategies) {
            return defaultCapacityProviderStrategies(List.of(defaultCapacityProviderStrategies));
        }

        /**
         * @param name Name of the setting to manage. Valid values: `containerInsights`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the setting to manage. Valid values: `containerInsights`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<List<ClusterSettingGetArgs>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder settings(List<ClusterSettingGetArgs> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param settings Configuration block(s) with cluster settings. For example, this can be used to enable CloudWatch Container Insights for a cluster. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder settings(ClusterSettingGetArgs... settings) {
            return settings(List.of(settings));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ClusterState build() {
            return $;
        }
    }

}
