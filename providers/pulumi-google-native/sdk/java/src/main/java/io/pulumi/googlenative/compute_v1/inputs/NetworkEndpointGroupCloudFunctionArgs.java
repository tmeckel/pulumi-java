// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a Cloud Function network endpoint group (NEG). The function must be provided explicitly or in the URL mask. Note: Cloud Function must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupCloudFunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupCloudFunctionArgs Empty = new NetworkEndpointGroupCloudFunctionArgs();

    /**
     * A user-defined name of the Cloud Function. The function name is case-sensitive and must be 1-63 characters long. Example value: "func1".
     * 
     */
    @InputImport(name="function")
      private final @Nullable Input<String> function;

    public Input<String> getFunction() {
        return this.function == null ? Input.empty() : this.function;
    }

    /**
     * A template to parse function field from a request URL. URL mask allows for routing to multiple Cloud Functions without having to create multiple Network Endpoint Groups and backend services. For example, request URLs " mydomain.com/function1" and "mydomain.com/function2" can be backed by the same Serverless NEG with URL mask "/". The URL mask will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    @InputImport(name="urlMask")
      private final @Nullable Input<String> urlMask;

    public Input<String> getUrlMask() {
        return this.urlMask == null ? Input.empty() : this.urlMask;
    }

    public NetworkEndpointGroupCloudFunctionArgs(
        @Nullable Input<String> function,
        @Nullable Input<String> urlMask) {
        this.function = function;
        this.urlMask = urlMask;
    }

    private NetworkEndpointGroupCloudFunctionArgs() {
        this.function = Input.empty();
        this.urlMask = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupCloudFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> function;
        private @Nullable Input<String> urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupCloudFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder function(@Nullable Input<String> function) {
            this.function = function;
            return this;
        }

        public Builder function(@Nullable String function) {
            this.function = Input.ofNullable(function);
            return this;
        }

        public Builder urlMask(@Nullable Input<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }

        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = Input.ofNullable(urlMask);
            return this;
        }
        public NetworkEndpointGroupCloudFunctionArgs build() {
            return new NetworkEndpointGroupCloudFunctionArgs(function, urlMask);
        }
    }
}
