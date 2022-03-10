// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionEndpointsApiServiceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionEndpointsApiServiceGetArgs Empty = new FlexibleAppVersionEndpointsApiServiceGetArgs();

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".
     * By default, the rollout strategy for Endpoints is "FIXED". This means that Endpoints starts up with a particular configuration ID.
     * When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
     * and is required in this case.
     * Endpoints also has a rollout strategy called "MANAGED". When using this, Endpoints fetches the latest configuration and does not need
     * the configuration ID. In this case, configId must be omitted.
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
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
     * Default value is `FIXED`.
     * Possible values are `FIXED` and `MANAGED`.
     * 
     */
    @InputImport(name="rolloutStrategy")
      private final @Nullable Input<String> rolloutStrategy;

    public Input<String> getRolloutStrategy() {
        return this.rolloutStrategy == null ? Input.empty() : this.rolloutStrategy;
    }

    public FlexibleAppVersionEndpointsApiServiceGetArgs(
        @Nullable Input<String> configId,
        @Nullable Input<Boolean> disableTraceSampling,
        Input<String> name,
        @Nullable Input<String> rolloutStrategy) {
        this.configId = configId;
        this.disableTraceSampling = disableTraceSampling;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.rolloutStrategy = rolloutStrategy;
    }

    private FlexibleAppVersionEndpointsApiServiceGetArgs() {
        this.configId = Input.empty();
        this.disableTraceSampling = Input.empty();
        this.name = Input.empty();
        this.rolloutStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionEndpointsApiServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configId;
        private @Nullable Input<Boolean> disableTraceSampling;
        private Input<String> name;
        private @Nullable Input<String> rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionEndpointsApiServiceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder configId(@Nullable Input<String> configId) {
            this.configId = configId;
            return this;
        }

        public Builder configId(@Nullable String configId) {
            this.configId = Input.ofNullable(configId);
            return this;
        }

        public Builder disableTraceSampling(@Nullable Input<Boolean> disableTraceSampling) {
            this.disableTraceSampling = disableTraceSampling;
            return this;
        }

        public Builder disableTraceSampling(@Nullable Boolean disableTraceSampling) {
            this.disableTraceSampling = Input.ofNullable(disableTraceSampling);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder rolloutStrategy(@Nullable Input<String> rolloutStrategy) {
            this.rolloutStrategy = rolloutStrategy;
            return this;
        }

        public Builder rolloutStrategy(@Nullable String rolloutStrategy) {
            this.rolloutStrategy = Input.ofNullable(rolloutStrategy);
            return this;
        }
        public FlexibleAppVersionEndpointsApiServiceGetArgs build() {
            return new FlexibleAppVersionEndpointsApiServiceGetArgs(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
