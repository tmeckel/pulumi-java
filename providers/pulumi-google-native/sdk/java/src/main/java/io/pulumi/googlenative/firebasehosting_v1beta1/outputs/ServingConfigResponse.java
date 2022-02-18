// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.HeaderResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.I18nConfigResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.RedirectResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.RewriteResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ServingConfigResponse {
    /**
     * How to handle well known App Association files.
     * 
     */
    private final String appAssociation;
    /**
     * Defines whether to drop the file extension from uploaded files.
     * 
     */
    private final Boolean cleanUrls;
    /**
     * An array of objects, where each object specifies a URL pattern that, if matched to the request URL path, triggers Hosting to apply the specified custom response headers.
     * 
     */
    private final List<HeaderResponse> headers;
    /**
     * Optional. Defines i18n rewrite behavior.
     * 
     */
    private final I18nConfigResponse i18n;
    /**
     * An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond with a redirect to the specified destination path.
     * 
     */
    private final List<RedirectResponse> redirects;
    /**
     * An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     * 
     */
    private final List<RewriteResponse> rewrites;
    /**
     * Defines how to handle a trailing slash in the URL path.
     * 
     */
    private final String trailingSlashBehavior;

    @OutputCustomType.Constructor({"appAssociation","cleanUrls","headers","i18n","redirects","rewrites","trailingSlashBehavior"})
    private ServingConfigResponse(
        String appAssociation,
        Boolean cleanUrls,
        List<HeaderResponse> headers,
        I18nConfigResponse i18n,
        List<RedirectResponse> redirects,
        List<RewriteResponse> rewrites,
        String trailingSlashBehavior) {
        this.appAssociation = Objects.requireNonNull(appAssociation);
        this.cleanUrls = Objects.requireNonNull(cleanUrls);
        this.headers = Objects.requireNonNull(headers);
        this.i18n = Objects.requireNonNull(i18n);
        this.redirects = Objects.requireNonNull(redirects);
        this.rewrites = Objects.requireNonNull(rewrites);
        this.trailingSlashBehavior = Objects.requireNonNull(trailingSlashBehavior);
    }

    /**
     * How to handle well known App Association files.
     * 
     */
    public String getAppAssociation() {
        return this.appAssociation;
    }
    /**
     * Defines whether to drop the file extension from uploaded files.
     * 
     */
    public Boolean getCleanUrls() {
        return this.cleanUrls;
    }
    /**
     * An array of objects, where each object specifies a URL pattern that, if matched to the request URL path, triggers Hosting to apply the specified custom response headers.
     * 
     */
    public List<HeaderResponse> getHeaders() {
        return this.headers;
    }
    /**
     * Optional. Defines i18n rewrite behavior.
     * 
     */
    public I18nConfigResponse getI18n() {
        return this.i18n;
    }
    /**
     * An array of objects (called redirect rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond with a redirect to the specified destination path.
     * 
     */
    public List<RedirectResponse> getRedirects() {
        return this.redirects;
    }
    /**
     * An array of objects (called rewrite rules), where each rule specifies a URL pattern that, if matched to the request URL path, triggers Hosting to respond as if the service were given the specified destination URL.
     * 
     */
    public List<RewriteResponse> getRewrites() {
        return this.rewrites;
    }
    /**
     * Defines how to handle a trailing slash in the URL path.
     * 
     */
    public String getTrailingSlashBehavior() {
        return this.trailingSlashBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appAssociation;
        private Boolean cleanUrls;
        private List<HeaderResponse> headers;
        private I18nConfigResponse i18n;
        private List<RedirectResponse> redirects;
        private List<RewriteResponse> rewrites;
        private String trailingSlashBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(ServingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appAssociation = defaults.appAssociation;
    	      this.cleanUrls = defaults.cleanUrls;
    	      this.headers = defaults.headers;
    	      this.i18n = defaults.i18n;
    	      this.redirects = defaults.redirects;
    	      this.rewrites = defaults.rewrites;
    	      this.trailingSlashBehavior = defaults.trailingSlashBehavior;
        }

        public Builder setAppAssociation(String appAssociation) {
            this.appAssociation = Objects.requireNonNull(appAssociation);
            return this;
        }

        public Builder setCleanUrls(Boolean cleanUrls) {
            this.cleanUrls = Objects.requireNonNull(cleanUrls);
            return this;
        }

        public Builder setHeaders(List<HeaderResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setI18n(I18nConfigResponse i18n) {
            this.i18n = Objects.requireNonNull(i18n);
            return this;
        }

        public Builder setRedirects(List<RedirectResponse> redirects) {
            this.redirects = Objects.requireNonNull(redirects);
            return this;
        }

        public Builder setRewrites(List<RewriteResponse> rewrites) {
            this.rewrites = Objects.requireNonNull(rewrites);
            return this;
        }

        public Builder setTrailingSlashBehavior(String trailingSlashBehavior) {
            this.trailingSlashBehavior = Objects.requireNonNull(trailingSlashBehavior);
            return this;
        }

        public ServingConfigResponse build() {
            return new ServingConfigResponse(appAssociation, cleanUrls, headers, i18n, redirects, rewrites, trailingSlashBehavior);
        }
    }
}
