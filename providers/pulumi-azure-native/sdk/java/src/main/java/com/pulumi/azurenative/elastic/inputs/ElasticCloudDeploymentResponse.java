// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.elastic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the user&#39;s elastic deployment associated with the monitor resource.
 * 
 */
public final class ElasticCloudDeploymentResponse extends com.pulumi.resources.InvokeArgs {

    public static final ElasticCloudDeploymentResponse Empty = new ElasticCloudDeploymentResponse();

    /**
     * Associated Azure subscription Id for the elastic deployment.
     * 
     */
    @Import(name="azureSubscriptionId", required=true)
    private String azureSubscriptionId;

    /**
     * @return Associated Azure subscription Id for the elastic deployment.
     * 
     */
    public String azureSubscriptionId() {
        return this.azureSubscriptionId;
    }

    /**
     * Elastic deployment Id
     * 
     */
    @Import(name="deploymentId", required=true)
    private String deploymentId;

    /**
     * @return Elastic deployment Id
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * Region where Deployment at Elastic side took place.
     * 
     */
    @Import(name="elasticsearchRegion", required=true)
    private String elasticsearchRegion;

    /**
     * @return Region where Deployment at Elastic side took place.
     * 
     */
    public String elasticsearchRegion() {
        return this.elasticsearchRegion;
    }

    /**
     * Elasticsearch ingestion endpoint of the Elastic deployment.
     * 
     */
    @Import(name="elasticsearchServiceUrl", required=true)
    private String elasticsearchServiceUrl;

    /**
     * @return Elasticsearch ingestion endpoint of the Elastic deployment.
     * 
     */
    public String elasticsearchServiceUrl() {
        return this.elasticsearchServiceUrl;
    }

    /**
     * Kibana endpoint of the Elastic deployment.
     * 
     */
    @Import(name="kibanaServiceUrl", required=true)
    private String kibanaServiceUrl;

    /**
     * @return Kibana endpoint of the Elastic deployment.
     * 
     */
    public String kibanaServiceUrl() {
        return this.kibanaServiceUrl;
    }

    /**
     * Kibana dashboard sso URL of the Elastic deployment.
     * 
     */
    @Import(name="kibanaSsoUrl", required=true)
    private String kibanaSsoUrl;

    /**
     * @return Kibana dashboard sso URL of the Elastic deployment.
     * 
     */
    public String kibanaSsoUrl() {
        return this.kibanaSsoUrl;
    }

    /**
     * Elastic deployment name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Elastic deployment name
     * 
     */
    public String name() {
        return this.name;
    }

    private ElasticCloudDeploymentResponse() {}

    private ElasticCloudDeploymentResponse(ElasticCloudDeploymentResponse $) {
        this.azureSubscriptionId = $.azureSubscriptionId;
        this.deploymentId = $.deploymentId;
        this.elasticsearchRegion = $.elasticsearchRegion;
        this.elasticsearchServiceUrl = $.elasticsearchServiceUrl;
        this.kibanaServiceUrl = $.kibanaServiceUrl;
        this.kibanaSsoUrl = $.kibanaSsoUrl;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ElasticCloudDeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ElasticCloudDeploymentResponse $;

        public Builder() {
            $ = new ElasticCloudDeploymentResponse();
        }

        public Builder(ElasticCloudDeploymentResponse defaults) {
            $ = new ElasticCloudDeploymentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureSubscriptionId Associated Azure subscription Id for the elastic deployment.
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            $.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        /**
         * @param deploymentId Elastic deployment Id
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param elasticsearchRegion Region where Deployment at Elastic side took place.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchRegion(String elasticsearchRegion) {
            $.elasticsearchRegion = elasticsearchRegion;
            return this;
        }

        /**
         * @param elasticsearchServiceUrl Elasticsearch ingestion endpoint of the Elastic deployment.
         * 
         * @return builder
         * 
         */
        public Builder elasticsearchServiceUrl(String elasticsearchServiceUrl) {
            $.elasticsearchServiceUrl = elasticsearchServiceUrl;
            return this;
        }

        /**
         * @param kibanaServiceUrl Kibana endpoint of the Elastic deployment.
         * 
         * @return builder
         * 
         */
        public Builder kibanaServiceUrl(String kibanaServiceUrl) {
            $.kibanaServiceUrl = kibanaServiceUrl;
            return this;
        }

        /**
         * @param kibanaSsoUrl Kibana dashboard sso URL of the Elastic deployment.
         * 
         * @return builder
         * 
         */
        public Builder kibanaSsoUrl(String kibanaSsoUrl) {
            $.kibanaSsoUrl = kibanaSsoUrl;
            return this;
        }

        /**
         * @param name Elastic deployment name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public ElasticCloudDeploymentResponse build() {
            $.azureSubscriptionId = Objects.requireNonNull($.azureSubscriptionId, "expected parameter 'azureSubscriptionId' to be non-null");
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            $.elasticsearchRegion = Objects.requireNonNull($.elasticsearchRegion, "expected parameter 'elasticsearchRegion' to be non-null");
            $.elasticsearchServiceUrl = Objects.requireNonNull($.elasticsearchServiceUrl, "expected parameter 'elasticsearchServiceUrl' to be non-null");
            $.kibanaServiceUrl = Objects.requireNonNull($.kibanaServiceUrl, "expected parameter 'kibanaServiceUrl' to be non-null");
            $.kibanaSsoUrl = Objects.requireNonNull($.kibanaSsoUrl, "expected parameter 'kibanaSsoUrl' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
