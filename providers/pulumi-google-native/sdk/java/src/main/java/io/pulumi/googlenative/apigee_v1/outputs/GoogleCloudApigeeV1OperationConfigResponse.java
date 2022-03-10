// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1OperationResponse;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1QuotaResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudApigeeV1OperationConfigResponse {
    /**
     * Name of the API proxy or remote service with which the resources, methods, and quota are associated.
     * 
     */
    private final String apiSource;
    /**
     * Custom attributes associated with the operation.
     * 
     */
    private final List<GoogleCloudApigeeV1AttributeResponse> attributes;
    /**
     * List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
     * 
     */
    private final List<GoogleCloudApigeeV1OperationResponse> operations;
    /**
     * Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * 
     */
    private final GoogleCloudApigeeV1QuotaResponse quota;

    @OutputCustomType.Constructor
    private GoogleCloudApigeeV1OperationConfigResponse(
        @OutputCustomType.Parameter("apiSource") String apiSource,
        @OutputCustomType.Parameter("attributes") List<GoogleCloudApigeeV1AttributeResponse> attributes,
        @OutputCustomType.Parameter("operations") List<GoogleCloudApigeeV1OperationResponse> operations,
        @OutputCustomType.Parameter("quota") GoogleCloudApigeeV1QuotaResponse quota) {
        this.apiSource = apiSource;
        this.attributes = attributes;
        this.operations = operations;
        this.quota = quota;
    }

    /**
     * Name of the API proxy or remote service with which the resources, methods, and quota are associated.
     * 
    */
    public String getApiSource() {
        return this.apiSource;
    }
    /**
     * Custom attributes associated with the operation.
     * 
    */
    public List<GoogleCloudApigeeV1AttributeResponse> getAttributes() {
        return this.attributes;
    }
    /**
     * List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
     * 
    */
    public List<GoogleCloudApigeeV1OperationResponse> getOperations() {
        return this.operations;
    }
    /**
     * Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * 
    */
    public GoogleCloudApigeeV1QuotaResponse getQuota() {
        return this.quota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1OperationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiSource;
        private List<GoogleCloudApigeeV1AttributeResponse> attributes;
        private List<GoogleCloudApigeeV1OperationResponse> operations;
        private GoogleCloudApigeeV1QuotaResponse quota;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1OperationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiSource = defaults.apiSource;
    	      this.attributes = defaults.attributes;
    	      this.operations = defaults.operations;
    	      this.quota = defaults.quota;
        }

        public Builder apiSource(String apiSource) {
            this.apiSource = Objects.requireNonNull(apiSource);
            return this;
        }

        public Builder attributes(List<GoogleCloudApigeeV1AttributeResponse> attributes) {
            this.attributes = Objects.requireNonNull(attributes);
            return this;
        }

        public Builder operations(List<GoogleCloudApigeeV1OperationResponse> operations) {
            this.operations = Objects.requireNonNull(operations);
            return this;
        }

        public Builder quota(GoogleCloudApigeeV1QuotaResponse quota) {
            this.quota = Objects.requireNonNull(quota);
            return this;
        }
        public GoogleCloudApigeeV1OperationConfigResponse build() {
            return new GoogleCloudApigeeV1OperationConfigResponse(apiSource, attributes, operations, quota);
        }
    }
}
