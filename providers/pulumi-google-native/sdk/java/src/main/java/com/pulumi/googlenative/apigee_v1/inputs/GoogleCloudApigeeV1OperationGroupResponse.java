// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1OperationConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * List of operation configuration details associated with Apigee API proxies or remote services. Remote services are non-Apigee proxies, such as Istio-Envoy.
 * 
 */
public final class GoogleCloudApigeeV1OperationGroupResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1OperationGroupResponse Empty = new GoogleCloudApigeeV1OperationGroupResponse();

    /**
     * Flag that specifes whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
     * 
     */
    @Import(name="operationConfigType", required=true)
    private String operationConfigType;

    /**
     * @return Flag that specifes whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
     * 
     */
    public String operationConfigType() {
        return this.operationConfigType;
    }

    /**
     * List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * 
     */
    @Import(name="operationConfigs", required=true)
    private List<GoogleCloudApigeeV1OperationConfigResponse> operationConfigs;

    /**
     * @return List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * 
     */
    public List<GoogleCloudApigeeV1OperationConfigResponse> operationConfigs() {
        return this.operationConfigs;
    }

    private GoogleCloudApigeeV1OperationGroupResponse() {}

    private GoogleCloudApigeeV1OperationGroupResponse(GoogleCloudApigeeV1OperationGroupResponse $) {
        this.operationConfigType = $.operationConfigType;
        this.operationConfigs = $.operationConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1OperationGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1OperationGroupResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1OperationGroupResponse();
        }

        public Builder(GoogleCloudApigeeV1OperationGroupResponse defaults) {
            $ = new GoogleCloudApigeeV1OperationGroupResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param operationConfigType Flag that specifes whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
         * 
         * @return builder
         * 
         */
        public Builder operationConfigType(String operationConfigType) {
            $.operationConfigType = operationConfigType;
            return this;
        }

        /**
         * @param operationConfigs List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
         * 
         * @return builder
         * 
         */
        public Builder operationConfigs(List<GoogleCloudApigeeV1OperationConfigResponse> operationConfigs) {
            $.operationConfigs = operationConfigs;
            return this;
        }

        /**
         * @param operationConfigs List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
         * 
         * @return builder
         * 
         */
        public Builder operationConfigs(GoogleCloudApigeeV1OperationConfigResponse... operationConfigs) {
            return operationConfigs(List.of(operationConfigs));
        }

        public GoogleCloudApigeeV1OperationGroupResponse build() {
            $.operationConfigType = Objects.requireNonNull($.operationConfigType, "expected parameter 'operationConfigType' to be non-null");
            $.operationConfigs = Objects.requireNonNull($.operationConfigs, "expected parameter 'operationConfigs' to be non-null");
            return $;
        }
    }

}
