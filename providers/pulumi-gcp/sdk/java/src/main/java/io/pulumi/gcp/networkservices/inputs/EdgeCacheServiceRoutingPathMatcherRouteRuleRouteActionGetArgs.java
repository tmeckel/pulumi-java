// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs();

    /**
     * The policy to use for defining caching and signed request behaviour for requests that match this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cdnPolicy")
      private final @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy;

    public Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Input.empty() : this.cdnPolicy;
    }

    /**
     * CORSPolicy defines Cross-Origin-Resource-Sharing configuration, including which CORS response headers will be set.
     * Structure is documented below.
     * 
     */
    @InputImport(name="corsPolicy")
      private final @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;

    public Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Input.empty() : this.corsPolicy;
    }

    /**
     * The URL rewrite configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    @InputImport(name="urlRewrite")
      private final @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;

    public Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Input.empty() : this.urlRewrite;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs(
        @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy,
        @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy,
        @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
        this.cdnPolicy = cdnPolicy;
        this.corsPolicy = corsPolicy;
        this.urlRewrite = urlRewrite;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs() {
        this.cdnPolicy = Input.empty();
        this.corsPolicy = Input.empty();
        this.urlRewrite = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy;
        private @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy;
        private @Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.urlRewrite = defaults.urlRewrite;
        }

        public Builder cdnPolicy(@Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }

        public Builder cdnPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyGetArgs cdnPolicy) {
            this.cdnPolicy = Input.ofNullable(cdnPolicy);
            return this;
        }

        public Builder corsPolicy(@Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyGetArgs corsPolicy) {
            this.corsPolicy = Input.ofNullable(corsPolicy);
            return this;
        }

        public Builder urlRewrite(@Nullable Input<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteGetArgs urlRewrite) {
            this.urlRewrite = Input.ofNullable(urlRewrite);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionGetArgs(cdnPolicy, corsPolicy, urlRewrite);
        }
    }
}
