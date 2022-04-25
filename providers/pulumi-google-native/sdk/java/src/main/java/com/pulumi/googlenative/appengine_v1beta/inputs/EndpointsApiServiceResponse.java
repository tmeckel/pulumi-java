// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The Endpoints API Service provides tooling for serving Open API and gRPC endpoints via an NGINX proxy. Only valid for App Engine Flexible environment deployments.The fields here refer to the name and configuration ID of a &#34;service&#34; resource in the Service Management API (https://cloud.google.com/service-management/overview).
 * 
 */
public final class EndpointsApiServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EndpointsApiServiceResponse Empty = new EndpointsApiServiceResponse();

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example &#34;2016-09-19r1&#34;.By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
     * 
     */
    @Import(name="configId", required=true)
    private String configId;

    /**
     * @return Endpoints service configuration ID as specified by the Service Management API. For example &#34;2016-09-19r1&#34;.By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
     * 
     */
    public String configId() {
        return this.configId;
    }

    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    @Import(name="disableTraceSampling", required=true)
    private Boolean disableTraceSampling;

    /**
     * @return Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    public Boolean disableTraceSampling() {
        return this.disableTraceSampling;
    }

    /**
     * Endpoints service name which is the name of the &#34;service&#34; resource in the Service Management API. For example &#34;myapi.endpoints.myproject.cloud.goog&#34;
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Endpoints service name which is the name of the &#34;service&#34; resource in the Service Management API. For example &#34;myapi.endpoints.myproject.cloud.goog&#34;
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    @Import(name="rolloutStrategy", required=true)
    private String rolloutStrategy;

    /**
     * @return Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    public String rolloutStrategy() {
        return this.rolloutStrategy;
    }

    private EndpointsApiServiceResponse() {}

    private EndpointsApiServiceResponse(EndpointsApiServiceResponse $) {
        this.configId = $.configId;
        this.disableTraceSampling = $.disableTraceSampling;
        this.name = $.name;
        this.rolloutStrategy = $.rolloutStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointsApiServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointsApiServiceResponse $;

        public Builder() {
            $ = new EndpointsApiServiceResponse();
        }

        public Builder(EndpointsApiServiceResponse defaults) {
            $ = new EndpointsApiServiceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Endpoints service configuration ID as specified by the Service Management API. For example &#34;2016-09-19r1&#34;.By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
         * 
         * @return builder
         * 
         */
        public Builder configId(String configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param disableTraceSampling Enable or disable trace sampling. By default, this is set to false for enabled.
         * 
         * @return builder
         * 
         */
        public Builder disableTraceSampling(Boolean disableTraceSampling) {
            $.disableTraceSampling = disableTraceSampling;
            return this;
        }

        /**
         * @param name Endpoints service name which is the name of the &#34;service&#34; resource in the Service Management API. For example &#34;myapi.endpoints.myproject.cloud.goog&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param rolloutStrategy Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
         * 
         * @return builder
         * 
         */
        public Builder rolloutStrategy(String rolloutStrategy) {
            $.rolloutStrategy = rolloutStrategy;
            return this;
        }

        public EndpointsApiServiceResponse build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.disableTraceSampling = Objects.requireNonNull($.disableTraceSampling, "expected parameter 'disableTraceSampling' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.rolloutStrategy = Objects.requireNonNull($.rolloutStrategy, "expected parameter 'rolloutStrategy' to be non-null");
            return $;
        }
    }

}
