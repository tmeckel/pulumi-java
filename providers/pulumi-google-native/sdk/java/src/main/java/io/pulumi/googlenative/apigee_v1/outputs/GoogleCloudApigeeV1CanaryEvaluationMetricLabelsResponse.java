// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse {
    /**
     * The environment ID associated with the metrics.
     * 
     */
    private final String env;
    /**
     * The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
     * 
     */
    private final String instanceId;
    /**
     * The location associated with the metrics.
     * 
     */
    private final String location;

    @OutputCustomType.Constructor
    private GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse(
        @OutputCustomType.Parameter("env") String env,
        @OutputCustomType.Parameter("instanceId") String instanceId,
        @OutputCustomType.Parameter("location") String location) {
        this.env = env;
        this.instanceId = instanceId;
        this.location = location;
    }

    /**
     * The environment ID associated with the metrics.
     * 
    */
    public String getEnv() {
        return this.env;
    }
    /**
     * The instance ID associated with the metrics. In Apigee Hybrid, the value is configured during installation.
     * 
    */
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * The location associated with the metrics.
     * 
    */
    public String getLocation() {
        return this.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String env;
        private String instanceId;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.instanceId = defaults.instanceId;
    	      this.location = defaults.location;
        }

        public Builder env(String env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse build() {
            return new GoogleCloudApigeeV1CanaryEvaluationMetricLabelsResponse(env, instanceId, location);
        }
    }
}
