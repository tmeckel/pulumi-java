// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleRouteActionArgs;
import com.pulumi.gcp.compute.inputs.URLMapPathMatcherPathRuleUrlRedirectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherPathRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleArgs Empty = new URLMapPathMatcherPathRuleArgs();

    /**
     * The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    @Import(name="paths", required=true)
    private Output<List<String>> paths;

    /**
     * @return The list of path patterns to match. Each must start with / and the only place a
     * \* is allowed is at the end following a /. The string fed to the path matcher
     * does not include any text after the first ? or #, and those chars are not
     * allowed here.
     * 
     */
    public Output<List<String>> paths() {
        return this.paths;
    }

    /**
     * In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="routeAction")
    private @Nullable Output<URLMapPathMatcherPathRuleRouteActionArgs> routeAction;

    /**
     * @return In response to a matching matchRule, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If  routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleRouteActionArgs>> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }

    /**
     * The backend service or backend bucket link that should be matched by this test.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return The backend service or backend bucket link that should be matched by this test.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRedirect")
    private @Nullable Output<URLMapPathMatcherPathRuleUrlRedirectArgs> urlRedirect;

    /**
     * @return When this rule is matched, the request is redirected to a URL specified by
     * urlRedirect. If urlRedirect is specified, service or routeAction must not be
     * set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapPathMatcherPathRuleUrlRedirectArgs>> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    private URLMapPathMatcherPathRuleArgs() {}

    private URLMapPathMatcherPathRuleArgs(URLMapPathMatcherPathRuleArgs $) {
        this.paths = $.paths;
        this.routeAction = $.routeAction;
        this.service = $.service;
        this.urlRedirect = $.urlRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherPathRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherPathRuleArgs $;

        public Builder() {
            $ = new URLMapPathMatcherPathRuleArgs();
        }

        public Builder(URLMapPathMatcherPathRuleArgs defaults) {
            $ = new URLMapPathMatcherPathRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param paths The list of path patterns to match. Each must start with / and the only place a
         * \* is allowed is at the end following a /. The string fed to the path matcher
         * does not include any text after the first ? or #, and those chars are not
         * allowed here.
         * 
         * @return builder
         * 
         */
        public Builder paths(Output<List<String>> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths The list of path patterns to match. Each must start with / and the only place a
         * \* is allowed is at the end following a /. The string fed to the path matcher
         * does not include any text after the first ? or #, and those chars are not
         * allowed here.
         * 
         * @return builder
         * 
         */
        public Builder paths(List<String> paths) {
            return paths(Output.of(paths));
        }

        /**
         * @param paths The list of path patterns to match. Each must start with / and the only place a
         * \* is allowed is at the end following a /. The string fed to the path matcher
         * does not include any text after the first ? or #, and those chars are not
         * allowed here.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        /**
         * @param routeAction In response to a matching matchRule, the load balancer performs advanced routing
         * actions like URL rewrites, header transformations, etc. prior to forwarding the
         * request to the selected backend. If  routeAction specifies any
         * weightedBackendServices, service must not be set. Conversely if service is set,
         * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
         * or urlRedirect must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeAction(@Nullable Output<URLMapPathMatcherPathRuleRouteActionArgs> routeAction) {
            $.routeAction = routeAction;
            return this;
        }

        /**
         * @param routeAction In response to a matching matchRule, the load balancer performs advanced routing
         * actions like URL rewrites, header transformations, etc. prior to forwarding the
         * request to the selected backend. If  routeAction specifies any
         * weightedBackendServices, service must not be set. Conversely if service is set,
         * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
         * or urlRedirect must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeAction(URLMapPathMatcherPathRuleRouteActionArgs routeAction) {
            return routeAction(Output.of(routeAction));
        }

        /**
         * @param service The backend service or backend bucket link that should be matched by this test.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service The backend service or backend bucket link that should be matched by this test.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param urlRedirect When this rule is matched, the request is redirected to a URL specified by
         * urlRedirect. If urlRedirect is specified, service or routeAction must not be
         * set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirect(@Nullable Output<URLMapPathMatcherPathRuleUrlRedirectArgs> urlRedirect) {
            $.urlRedirect = urlRedirect;
            return this;
        }

        /**
         * @param urlRedirect When this rule is matched, the request is redirected to a URL specified by
         * urlRedirect. If urlRedirect is specified, service or routeAction must not be
         * set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirect(URLMapPathMatcherPathRuleUrlRedirectArgs urlRedirect) {
            return urlRedirect(Output.of(urlRedirect));
        }

        public URLMapPathMatcherPathRuleArgs build() {
            $.paths = Objects.requireNonNull($.paths, "expected parameter 'paths' to be non-null");
            return $;
        }
    }

}
