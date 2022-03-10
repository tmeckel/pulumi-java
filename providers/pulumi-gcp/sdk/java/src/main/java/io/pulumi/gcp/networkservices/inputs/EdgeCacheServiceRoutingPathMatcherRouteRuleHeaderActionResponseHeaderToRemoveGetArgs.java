// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs();

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs(Input<String> headerName) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs() {
        this.headerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder headerName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionResponseHeaderToRemoveGetArgs(headerName);
        }
    }
}
