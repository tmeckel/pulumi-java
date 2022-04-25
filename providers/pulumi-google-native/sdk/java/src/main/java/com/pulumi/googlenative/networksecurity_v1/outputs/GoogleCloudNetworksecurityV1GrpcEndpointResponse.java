// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudNetworksecurityV1GrpcEndpointResponse {
    /**
     * @return The target URI of the gRPC endpoint. Only UDS path is supported, and should start with “unix:”.
     * 
     */
    private final String targetUri;

    @CustomType.Constructor
    private GoogleCloudNetworksecurityV1GrpcEndpointResponse(@CustomType.Parameter("targetUri") String targetUri) {
        this.targetUri = targetUri;
    }

    /**
     * @return The target URI of the gRPC endpoint. Only UDS path is supported, and should start with “unix:”.
     * 
     */
    public String targetUri() {
        return this.targetUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudNetworksecurityV1GrpcEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudNetworksecurityV1GrpcEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetUri = defaults.targetUri;
        }

        public Builder targetUri(String targetUri) {
            this.targetUri = Objects.requireNonNull(targetUri);
            return this;
        }        public GoogleCloudNetworksecurityV1GrpcEndpointResponse build() {
            return new GoogleCloudNetworksecurityV1GrpcEndpointResponse(targetUri);
        }
    }
}
