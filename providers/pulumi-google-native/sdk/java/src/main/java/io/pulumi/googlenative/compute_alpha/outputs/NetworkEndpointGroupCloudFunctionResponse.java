// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkEndpointGroupCloudFunctionResponse {
    /**
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * 
     */
    private final String function;
    /**
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    private final String urlMask;

    @OutputCustomType.Constructor({"function","urlMask"})
    private NetworkEndpointGroupCloudFunctionResponse(
        String function,
        String urlMask) {
        this.function = Objects.requireNonNull(function);
        this.urlMask = Objects.requireNonNull(urlMask);
    }

    /**
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * 
     */
    public String getFunction() {
        return this.function;
    }
    /**
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    public String getUrlMask() {
        return this.urlMask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupCloudFunctionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupCloudFunctionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder setFunction(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setUrlMask(String urlMask) {
            this.urlMask = Objects.requireNonNull(urlMask);
            return this;
        }

        public NetworkEndpointGroupCloudFunctionResponse build() {
            return new NetworkEndpointGroupCloudFunctionResponse(function, urlMask);
        }
    }
}
