// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EndpointsApiServiceResponse {
    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
     * 
     */
    private final String configId;
    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    private final Boolean disableTraceSampling;
    /**
     * Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog"
     * 
     */
    private final String name;
    /**
     * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    private final String rolloutStrategy;

    @OutputCustomType.Constructor({"configId","disableTraceSampling","name","rolloutStrategy"})
    private EndpointsApiServiceResponse(
        String configId,
        Boolean disableTraceSampling,
        String name,
        String rolloutStrategy) {
        this.configId = Objects.requireNonNull(configId);
        this.disableTraceSampling = Objects.requireNonNull(disableTraceSampling);
        this.name = Objects.requireNonNull(name);
        this.rolloutStrategy = Objects.requireNonNull(rolloutStrategy);
    }

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
     * 
     */
    public String getConfigId() {
        return this.configId;
    }
    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    public Boolean getDisableTraceSampling() {
        return this.disableTraceSampling;
    }
    /**
     * Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog"
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    public String getRolloutStrategy() {
        return this.rolloutStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsApiServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configId;
        private Boolean disableTraceSampling;
        private String name;
        private String rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsApiServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder setConfigId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder setDisableTraceSampling(Boolean disableTraceSampling) {
            this.disableTraceSampling = Objects.requireNonNull(disableTraceSampling);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRolloutStrategy(String rolloutStrategy) {
            this.rolloutStrategy = Objects.requireNonNull(rolloutStrategy);
            return this;
        }

        public EndpointsApiServiceResponse build() {
            return new EndpointsApiServiceResponse(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
