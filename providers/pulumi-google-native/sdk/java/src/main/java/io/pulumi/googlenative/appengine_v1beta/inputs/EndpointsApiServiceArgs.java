// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1beta.enums.EndpointsApiServiceRolloutStrategy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The Endpoints API Service provides tooling for serving Open API and gRPC endpoints via an NGINX proxy. Only valid for App Engine Flexible environment deployments.The fields here refer to the name and configuration ID of a "service" resource in the Service Management API (https://cloud.google.com/service-management/overview).
 * 
 */
public final class EndpointsApiServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointsApiServiceArgs Empty = new EndpointsApiServiceArgs();

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
     * 
     */
    @InputImport(name="configId")
    private final @Nullable Input<String> configId;

    public Input<String> getConfigId() {
        return this.configId == null ? Input.empty() : this.configId;
    }

    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    @InputImport(name="disableTraceSampling")
    private final @Nullable Input<Boolean> disableTraceSampling;

    public Input<Boolean> getDisableTraceSampling() {
        return this.disableTraceSampling == null ? Input.empty() : this.disableTraceSampling;
    }

    /**
     * Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog"
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    @InputImport(name="rolloutStrategy")
    private final @Nullable Input<EndpointsApiServiceRolloutStrategy> rolloutStrategy;

    public Input<EndpointsApiServiceRolloutStrategy> getRolloutStrategy() {
        return this.rolloutStrategy == null ? Input.empty() : this.rolloutStrategy;
    }

    public EndpointsApiServiceArgs(
        @Nullable Input<String> configId,
        @Nullable Input<Boolean> disableTraceSampling,
        @Nullable Input<String> name,
        @Nullable Input<EndpointsApiServiceRolloutStrategy> rolloutStrategy) {
        this.configId = configId;
        this.disableTraceSampling = disableTraceSampling;
        this.name = name;
        this.rolloutStrategy = rolloutStrategy;
    }

    private EndpointsApiServiceArgs() {
        this.configId = Input.empty();
        this.disableTraceSampling = Input.empty();
        this.name = Input.empty();
        this.rolloutStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsApiServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configId;
        private @Nullable Input<Boolean> disableTraceSampling;
        private @Nullable Input<String> name;
        private @Nullable Input<EndpointsApiServiceRolloutStrategy> rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsApiServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder setConfigId(@Nullable Input<String> configId) {
            this.configId = configId;
            return this;
        }

        public Builder setConfigId(@Nullable String configId) {
            this.configId = Input.ofNullable(configId);
            return this;
        }

        public Builder setDisableTraceSampling(@Nullable Input<Boolean> disableTraceSampling) {
            this.disableTraceSampling = disableTraceSampling;
            return this;
        }

        public Builder setDisableTraceSampling(@Nullable Boolean disableTraceSampling) {
            this.disableTraceSampling = Input.ofNullable(disableTraceSampling);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRolloutStrategy(@Nullable Input<EndpointsApiServiceRolloutStrategy> rolloutStrategy) {
            this.rolloutStrategy = rolloutStrategy;
            return this;
        }

        public Builder setRolloutStrategy(@Nullable EndpointsApiServiceRolloutStrategy rolloutStrategy) {
            this.rolloutStrategy = Input.ofNullable(rolloutStrategy);
            return this;
        }

        public EndpointsApiServiceArgs build() {
            return new EndpointsApiServiceArgs(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
