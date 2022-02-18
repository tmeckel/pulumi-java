// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1GraphQLOperationConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * List of graphQL operation configuration details associated with Apigee API proxies or remote services. Remote services are non-Apigee proxies, such as Istio-Envoy.
 * 
 */
public final class GoogleCloudApigeeV1GraphQLOperationGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1GraphQLOperationGroupResponse Empty = new GoogleCloudApigeeV1GraphQLOperationGroupResponse();

    /**
     * Flag that specifies whether the configuration is for Apigee API proxy or a remote service. Valid values include `proxy` or `remoteservice`. Defaults to `proxy`. Set to `proxy` when Apigee API proxies are associated with the API product. Set to `remoteservice` when non-Apigee proxies like Istio-Envoy are associated with the API product.
     * 
     */
    @InputImport(name="operationConfigType", required=true)
    private final String operationConfigType;

    public String getOperationConfigType() {
        return this.operationConfigType;
    }

    /**
     * List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     * 
     */
    @InputImport(name="operationConfigs", required=true)
    private final List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs;

    public List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> getOperationConfigs() {
        return this.operationConfigs;
    }

    public GoogleCloudApigeeV1GraphQLOperationGroupResponse(
        String operationConfigType,
        List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs) {
        this.operationConfigType = Objects.requireNonNull(operationConfigType, "expected parameter 'operationConfigType' to be non-null");
        this.operationConfigs = Objects.requireNonNull(operationConfigs, "expected parameter 'operationConfigs' to be non-null");
    }

    private GoogleCloudApigeeV1GraphQLOperationGroupResponse() {
        this.operationConfigType = null;
        this.operationConfigs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1GraphQLOperationGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operationConfigType;
        private List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1GraphQLOperationGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operationConfigType = defaults.operationConfigType;
    	      this.operationConfigs = defaults.operationConfigs;
        }

        public Builder setOperationConfigType(String operationConfigType) {
            this.operationConfigType = Objects.requireNonNull(operationConfigType);
            return this;
        }

        public Builder setOperationConfigs(List<GoogleCloudApigeeV1GraphQLOperationConfigResponse> operationConfigs) {
            this.operationConfigs = Objects.requireNonNull(operationConfigs);
            return this;
        }

        public GoogleCloudApigeeV1GraphQLOperationGroupResponse build() {
            return new GoogleCloudApigeeV1GraphQLOperationGroupResponse(operationConfigType, operationConfigs);
        }
    }
}
