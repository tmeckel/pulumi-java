// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse {
    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    private final String headerName;

    @OutputCustomType.Constructor({"headerName"})
    private BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse(String headerName) {
        this.headerName = Objects.requireNonNull(headerName);
    }

    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    public String getHeaderName() {
        return this.headerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse build() {
            return new BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse(headerName);
        }
    }
}
