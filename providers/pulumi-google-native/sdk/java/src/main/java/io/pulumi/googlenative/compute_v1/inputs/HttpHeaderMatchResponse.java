// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.Int64RangeMatchResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * matchRule criteria for request header matches.
 * 
 */
public final class HttpHeaderMatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpHeaderMatchResponse Empty = new HttpHeaderMatchResponse();

    /**
     * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="exactMatch", required=true)
    private final String exactMatch;

    public String getExactMatch() {
        return this.exactMatch;
    }

    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method". When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    @InputImport(name="headerName", required=true)
    private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    @InputImport(name="invertMatch", required=true)
    private final Boolean invertMatch;

    public Boolean getInvertMatch() {
        return this.invertMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="prefixMatch", required=true)
    private final String prefixMatch;

    public String getPrefixMatch() {
        return this.prefixMatch;
    }

    /**
     * A header with the contents of headerName must exist. The match takes place whether or not the request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="presentMatch", required=true)
    private final Boolean presentMatch;

    public Boolean getPresentMatch() {
        return this.presentMatch;
    }

    /**
     * The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    @InputImport(name="rangeMatch", required=true)
    private final Int64RangeMatchResponse rangeMatch;

    public Int64RangeMatchResponse getRangeMatch() {
        return this.rangeMatch;
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="regexMatch", required=true)
    private final String regexMatch;

    public String getRegexMatch() {
        return this.regexMatch;
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="suffixMatch", required=true)
    private final String suffixMatch;

    public String getSuffixMatch() {
        return this.suffixMatch;
    }

    public HttpHeaderMatchResponse(
        String exactMatch,
        String headerName,
        Boolean invertMatch,
        String prefixMatch,
        Boolean presentMatch,
        Int64RangeMatchResponse rangeMatch,
        String regexMatch,
        String suffixMatch) {
        this.exactMatch = Objects.requireNonNull(exactMatch, "expected parameter 'exactMatch' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.invertMatch = Objects.requireNonNull(invertMatch, "expected parameter 'invertMatch' to be non-null");
        this.prefixMatch = Objects.requireNonNull(prefixMatch, "expected parameter 'prefixMatch' to be non-null");
        this.presentMatch = Objects.requireNonNull(presentMatch, "expected parameter 'presentMatch' to be non-null");
        this.rangeMatch = Objects.requireNonNull(rangeMatch, "expected parameter 'rangeMatch' to be non-null");
        this.regexMatch = Objects.requireNonNull(regexMatch, "expected parameter 'regexMatch' to be non-null");
        this.suffixMatch = Objects.requireNonNull(suffixMatch, "expected parameter 'suffixMatch' to be non-null");
    }

    private HttpHeaderMatchResponse() {
        this.exactMatch = null;
        this.headerName = null;
        this.invertMatch = null;
        this.prefixMatch = null;
        this.presentMatch = null;
        this.rangeMatch = null;
        this.regexMatch = null;
        this.suffixMatch = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactMatch;
        private String headerName;
        private Boolean invertMatch;
        private String prefixMatch;
        private Boolean presentMatch;
        private Int64RangeMatchResponse rangeMatch;
        private String regexMatch;
        private String suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.rangeMatch = defaults.rangeMatch;
    	      this.regexMatch = defaults.regexMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder setExactMatch(String exactMatch) {
            this.exactMatch = Objects.requireNonNull(exactMatch);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setInvertMatch(Boolean invertMatch) {
            this.invertMatch = Objects.requireNonNull(invertMatch);
            return this;
        }

        public Builder setPrefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }

        public Builder setPresentMatch(Boolean presentMatch) {
            this.presentMatch = Objects.requireNonNull(presentMatch);
            return this;
        }

        public Builder setRangeMatch(Int64RangeMatchResponse rangeMatch) {
            this.rangeMatch = Objects.requireNonNull(rangeMatch);
            return this;
        }

        public Builder setRegexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }

        public Builder setSuffixMatch(String suffixMatch) {
            this.suffixMatch = Objects.requireNonNull(suffixMatch);
            return this;
        }

        public HttpHeaderMatchResponse build() {
            return new HttpHeaderMatchResponse(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
