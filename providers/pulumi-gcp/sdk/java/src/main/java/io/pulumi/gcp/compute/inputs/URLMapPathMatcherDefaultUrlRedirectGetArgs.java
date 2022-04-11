// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultUrlRedirectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultUrlRedirectGetArgs Empty = new URLMapPathMatcherDefaultUrlRedirectGetArgs();

    /**
     * The host that will be used in the redirect response instead of the one that was
     * supplied in the request. The value must be between 1 and 255 characters.
     * 
     */
    @Import(name="hostRedirect")
      private final @Nullable Output<String> hostRedirect;

    public Output<String> getHostRedirect() {
        return this.hostRedirect == null ? Codegen.empty() : this.hostRedirect;
    }

    /**
     * If set to true, the URL scheme in the redirected request is set to https. If set to
     * false, the URL scheme of the redirected request will remain the same as that of the
     * request. This must only be set for UrlMaps used in TargetHttpProxys. Setting this
     * true for TargetHttpsProxy is not permitted. The default is set to false.
     * 
     */
    @Import(name="httpsRedirect")
      private final @Nullable Output<Boolean> httpsRedirect;

    public Output<Boolean> getHttpsRedirect() {
        return this.httpsRedirect == null ? Codegen.empty() : this.httpsRedirect;
    }

    /**
     * The path that will be used in the redirect response instead of the one that was
     * supplied in the request. pathRedirect cannot be supplied together with
     * prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the
     * original request will be used for the redirect. The value must be between 1 and 1024
     * characters.
     * 
     */
    @Import(name="pathRedirect")
      private final @Nullable Output<String> pathRedirect;

    public Output<String> getPathRedirect() {
        return this.pathRedirect == null ? Codegen.empty() : this.pathRedirect;
    }

    /**
     * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch,
     * retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or
     * neither. If neither is supplied, the path of the original request will be used for
     * the redirect. The value must be between 1 and 1024 characters.
     * 
     */
    @Import(name="prefixRedirect")
      private final @Nullable Output<String> prefixRedirect;

    public Output<String> getPrefixRedirect() {
        return this.prefixRedirect == null ? Codegen.empty() : this.prefixRedirect;
    }

    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are:
     * * MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.
     * * FOUND, which corresponds to 302.
     * * SEE_OTHER which corresponds to 303.
     * * TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method
     *   will be retained.
     * * PERMANENT_REDIRECT, which corresponds to 308. In this case,
     *   the request method will be retained.
     * 
     */
    @Import(name="redirectResponseCode")
      private final @Nullable Output<String> redirectResponseCode;

    public Output<String> getRedirectResponseCode() {
        return this.redirectResponseCode == null ? Codegen.empty() : this.redirectResponseCode;
    }

    /**
     * If set to true, any accompanying query portion of the original URL is removed prior
     * to redirecting the request. If set to false, the query portion of the original URL is
     * retained. The default is set to false.
     * This field is required to ensure an empty block is not set. The normal default value is false.
     * 
     */
    @Import(name="stripQuery", required=true)
      private final Output<Boolean> stripQuery;

    public Output<Boolean> getStripQuery() {
        return this.stripQuery;
    }

    public URLMapPathMatcherDefaultUrlRedirectGetArgs(
        @Nullable Output<String> hostRedirect,
        @Nullable Output<Boolean> httpsRedirect,
        @Nullable Output<String> pathRedirect,
        @Nullable Output<String> prefixRedirect,
        @Nullable Output<String> redirectResponseCode,
        Output<Boolean> stripQuery) {
        this.hostRedirect = hostRedirect;
        this.httpsRedirect = httpsRedirect;
        this.pathRedirect = pathRedirect;
        this.prefixRedirect = prefixRedirect;
        this.redirectResponseCode = redirectResponseCode;
        this.stripQuery = Objects.requireNonNull(stripQuery, "expected parameter 'stripQuery' to be non-null");
    }

    private URLMapPathMatcherDefaultUrlRedirectGetArgs() {
        this.hostRedirect = Codegen.empty();
        this.httpsRedirect = Codegen.empty();
        this.pathRedirect = Codegen.empty();
        this.prefixRedirect = Codegen.empty();
        this.redirectResponseCode = Codegen.empty();
        this.stripQuery = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultUrlRedirectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostRedirect;
        private @Nullable Output<Boolean> httpsRedirect;
        private @Nullable Output<String> pathRedirect;
        private @Nullable Output<String> prefixRedirect;
        private @Nullable Output<String> redirectResponseCode;
        private Output<Boolean> stripQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultUrlRedirectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.prefixRedirect = defaults.prefixRedirect;
    	      this.redirectResponseCode = defaults.redirectResponseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        public Builder hostRedirect(@Nullable Output<String> hostRedirect) {
            this.hostRedirect = hostRedirect;
            return this;
        }
        public Builder hostRedirect(@Nullable String hostRedirect) {
            this.hostRedirect = Codegen.ofNullable(hostRedirect);
            return this;
        }
        public Builder httpsRedirect(@Nullable Output<Boolean> httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }
        public Builder httpsRedirect(@Nullable Boolean httpsRedirect) {
            this.httpsRedirect = Codegen.ofNullable(httpsRedirect);
            return this;
        }
        public Builder pathRedirect(@Nullable Output<String> pathRedirect) {
            this.pathRedirect = pathRedirect;
            return this;
        }
        public Builder pathRedirect(@Nullable String pathRedirect) {
            this.pathRedirect = Codegen.ofNullable(pathRedirect);
            return this;
        }
        public Builder prefixRedirect(@Nullable Output<String> prefixRedirect) {
            this.prefixRedirect = prefixRedirect;
            return this;
        }
        public Builder prefixRedirect(@Nullable String prefixRedirect) {
            this.prefixRedirect = Codegen.ofNullable(prefixRedirect);
            return this;
        }
        public Builder redirectResponseCode(@Nullable Output<String> redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            return this;
        }
        public Builder redirectResponseCode(@Nullable String redirectResponseCode) {
            this.redirectResponseCode = Codegen.ofNullable(redirectResponseCode);
            return this;
        }
        public Builder stripQuery(Output<Boolean> stripQuery) {
            this.stripQuery = Objects.requireNonNull(stripQuery);
            return this;
        }
        public Builder stripQuery(Boolean stripQuery) {
            this.stripQuery = Output.of(Objects.requireNonNull(stripQuery));
            return this;
        }        public URLMapPathMatcherDefaultUrlRedirectGetArgs build() {
            return new URLMapPathMatcherDefaultUrlRedirectGetArgs(hostRedirect, httpsRedirect, pathRedirect, prefixRedirect, redirectResponseCode, stripQuery);
        }
    }
}
