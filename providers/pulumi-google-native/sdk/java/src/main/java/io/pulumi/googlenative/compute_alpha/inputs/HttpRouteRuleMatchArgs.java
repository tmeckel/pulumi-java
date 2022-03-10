// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.HttpHeaderMatchArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HttpQueryParameterMatchArgs;
import io.pulumi.googlenative.compute_alpha.inputs.MetadataFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HttpRouteRuleMatch specifies a set of criteria for matching requests to an HttpRouteRule. All specified criteria must be satisfied for a match to occur.
 * 
 */
public final class HttpRouteRuleMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteRuleMatchArgs Empty = new HttpRouteRuleMatchArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL. fullPathMatch must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    @InputImport(name="fullPathMatch")
      private final @Nullable Input<String> fullPathMatch;

    public Input<String> getFullPathMatch() {
        return this.fullPathMatch == null ? Input.empty() : this.fullPathMatch;
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * 
     */
    @InputImport(name="headerMatches")
      private final @Nullable Input<List<HttpHeaderMatchArgs>> headerMatches;

    public Input<List<HttpHeaderMatchArgs>> getHeaderMatches() {
        return this.headerMatches == null ? Input.empty() : this.headerMatches;
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive. The default value is false. ignoreCase must not be used with regexMatch. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="ignoreCase")
      private final @Nullable Input<Boolean> ignoreCase;

    public Input<Boolean> getIgnoreCase() {
        return this.ignoreCase == null ? Input.empty() : this.ignoreCase;
    }

    /**
     * Opaque filter criteria used by the load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to the load balancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadata filters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here is applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to. metadataFilters only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="metadataFilters")
      private final @Nullable Input<List<MetadataFilterArgs>> metadataFilters;

    public Input<List<MetadataFilterArgs>> getMetadataFilters() {
        return this.metadataFilters == null ? Input.empty() : this.metadataFilters;
    }

    /**
     * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /. The value must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    @InputImport(name="prefixMatch")
      private final @Nullable Input<String> prefixMatch;

    public Input<String> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @InputImport(name="queryParameterMatches")
      private final @Nullable Input<List<HttpQueryParameterMatchArgs>> queryParameterMatches;

    public Input<List<HttpQueryParameterMatchArgs>> getQueryParameterMatches() {
        return this.queryParameterMatches == null ? Input.empty() : this.queryParameterMatches;
    }

    /**
     * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For more information about regular expression syntax, see Syntax. Only one of prefixMatch, fullPathMatch or regexMatch must be specified. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="regexMatch")
      private final @Nullable Input<String> regexMatch;

    public Input<String> getRegexMatch() {
        return this.regexMatch == null ? Input.empty() : this.regexMatch;
    }

    public HttpRouteRuleMatchArgs(
        @Nullable Input<String> fullPathMatch,
        @Nullable Input<List<HttpHeaderMatchArgs>> headerMatches,
        @Nullable Input<Boolean> ignoreCase,
        @Nullable Input<List<MetadataFilterArgs>> metadataFilters,
        @Nullable Input<String> prefixMatch,
        @Nullable Input<List<HttpQueryParameterMatchArgs>> queryParameterMatches,
        @Nullable Input<String> regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.metadataFilters = metadataFilters;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
        this.regexMatch = regexMatch;
    }

    private HttpRouteRuleMatchArgs() {
        this.fullPathMatch = Input.empty();
        this.headerMatches = Input.empty();
        this.ignoreCase = Input.empty();
        this.metadataFilters = Input.empty();
        this.prefixMatch = Input.empty();
        this.queryParameterMatches = Input.empty();
        this.regexMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fullPathMatch;
        private @Nullable Input<List<HttpHeaderMatchArgs>> headerMatches;
        private @Nullable Input<Boolean> ignoreCase;
        private @Nullable Input<List<MetadataFilterArgs>> metadataFilters;
        private @Nullable Input<String> prefixMatch;
        private @Nullable Input<List<HttpQueryParameterMatchArgs>> queryParameterMatches;
        private @Nullable Input<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder fullPathMatch(@Nullable Input<String> fullPathMatch) {
            this.fullPathMatch = fullPathMatch;
            return this;
        }

        public Builder fullPathMatch(@Nullable String fullPathMatch) {
            this.fullPathMatch = Input.ofNullable(fullPathMatch);
            return this;
        }

        public Builder headerMatches(@Nullable Input<List<HttpHeaderMatchArgs>> headerMatches) {
            this.headerMatches = headerMatches;
            return this;
        }

        public Builder headerMatches(@Nullable List<HttpHeaderMatchArgs> headerMatches) {
            this.headerMatches = Input.ofNullable(headerMatches);
            return this;
        }

        public Builder ignoreCase(@Nullable Input<Boolean> ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder ignoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = Input.ofNullable(ignoreCase);
            return this;
        }

        public Builder metadataFilters(@Nullable Input<List<MetadataFilterArgs>> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }

        public Builder metadataFilters(@Nullable List<MetadataFilterArgs> metadataFilters) {
            this.metadataFilters = Input.ofNullable(metadataFilters);
            return this;
        }

        public Builder prefixMatch(@Nullable Input<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public Builder queryParameterMatches(@Nullable Input<List<HttpQueryParameterMatchArgs>> queryParameterMatches) {
            this.queryParameterMatches = queryParameterMatches;
            return this;
        }

        public Builder queryParameterMatches(@Nullable List<HttpQueryParameterMatchArgs> queryParameterMatches) {
            this.queryParameterMatches = Input.ofNullable(queryParameterMatches);
            return this;
        }

        public Builder regexMatch(@Nullable Input<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder regexMatch(@Nullable String regexMatch) {
            this.regexMatch = Input.ofNullable(regexMatch);
            return this;
        }
        public HttpRouteRuleMatchArgs build() {
            return new HttpRouteRuleMatchArgs(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
