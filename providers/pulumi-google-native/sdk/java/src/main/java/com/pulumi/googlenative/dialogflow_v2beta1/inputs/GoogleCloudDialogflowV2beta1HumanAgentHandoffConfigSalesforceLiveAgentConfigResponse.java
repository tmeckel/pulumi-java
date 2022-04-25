// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration specific to Salesforce Live Agent.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse();

    /**
     * Live Agent chat button ID.
     * 
     */
    @Import(name="buttonId", required=true)
    private String buttonId;

    /**
     * @return Live Agent chat button ID.
     * 
     */
    public String buttonId() {
        return this.buttonId;
    }

    /**
     * Live Agent deployment ID.
     * 
     */
    @Import(name="deploymentId", required=true)
    private String deploymentId;

    /**
     * @return Live Agent deployment ID.
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    /**
     * Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
     */
    @Import(name="endpointDomain", required=true)
    private String endpointDomain;

    /**
     * @return Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
     * 
     */
    public String endpointDomain() {
        return this.endpointDomain;
    }

    /**
     * The organization ID of the Salesforce account.
     * 
     */
    @Import(name="organizationId", required=true)
    private String organizationId;

    /**
     * @return The organization ID of the Salesforce account.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse() {}

    private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse $) {
        this.buttonId = $.buttonId;
        this.deploymentId = $.deploymentId;
        this.endpointDomain = $.endpointDomain;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param buttonId Live Agent chat button ID.
         * 
         * @return builder
         * 
         */
        public Builder buttonId(String buttonId) {
            $.buttonId = buttonId;
            return this;
        }

        /**
         * @param deploymentId Live Agent deployment ID.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        /**
         * @param endpointDomain Domain of the Live Agent endpoint for this agent. You can find the endpoint URL in the `Live Agent settings` page. For example if URL has the form https://d.la4-c2-phx.salesforceliveagent.com/..., you should fill in d.la4-c2-phx.salesforceliveagent.com.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(String endpointDomain) {
            $.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * @param organizationId The organization ID of the Salesforce account.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigSalesforceLiveAgentConfigResponse build() {
            $.buttonId = Objects.requireNonNull($.buttonId, "expected parameter 'buttonId' to be non-null");
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            $.endpointDomain = Objects.requireNonNull($.endpointDomain, "expected parameter 'endpointDomain' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
