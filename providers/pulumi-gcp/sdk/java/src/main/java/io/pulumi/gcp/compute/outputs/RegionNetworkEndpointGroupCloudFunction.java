// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionNetworkEndpointGroupCloudFunction {
    /**
     * A user-defined name of the Cloud Function.
     * The function name is case-sensitive and must be 1-63 characters long.
     * Example value: "func1".
     * 
     */
    private final @Nullable String function;
    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    private final @Nullable String urlMask;

    @OutputCustomType.Constructor
    private RegionNetworkEndpointGroupCloudFunction(
        @OutputCustomType.Parameter("function") @Nullable String function,
        @OutputCustomType.Parameter("urlMask") @Nullable String urlMask) {
        this.function = function;
        this.urlMask = urlMask;
    }

    /**
     * A user-defined name of the Cloud Function.
     * The function name is case-sensitive and must be 1-63 characters long.
     * Example value: "func1".
     * 
    */
    public Optional<String> getFunction() {
        return Optional.ofNullable(this.function);
    }
    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
    */
    public Optional<String> getUrlMask() {
        return Optional.ofNullable(this.urlMask);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupCloudFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String function;
        private @Nullable String urlMask;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupCloudFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.urlMask = defaults.urlMask;
        }

        public Builder function(@Nullable String function) {
            this.function = function;
            return this;
        }

        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = urlMask;
            return this;
        }
        public RegionNetworkEndpointGroupCloudFunction build() {
            return new RegionNetworkEndpointGroupCloudFunction(function, urlMask);
        }
    }
}
