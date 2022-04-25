// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleGetArgs();

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * The rules for determining a match.
     * Structure is documented below.
     * 
     */
    @Import(name="matchRules")
    private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules;

    /**
     * @return The rules for determining a match.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>>> matchRules() {
        return Optional.ofNullable(this.matchRules);
    }

    /**
     * For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return For routeRules within a given pathMatcher, priority determines the order
     * in which load balancer will interpret routeRules. RouteRules are evaluated
     * in order of priority, from the lowest to highest number. The priority of
     * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
     * that matches the request is applied.
     * You cannot configure two or more routeRules with the same priority.
     * Priority for each rule must be set to a number between 0 and
     * 2147483647 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules
     * in the future without affecting the rest of the rules. For example,
     * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
     * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
     * future without any impact on existing rules.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    @Import(name="routeAction")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> routeAction;

    /**
     * @return In response to a matching path, the load balancer performs advanced routing
     * actions like URL rewrites, header transformations, etc. prior to forwarding the
     * request to the selected backend. If routeAction specifies any
     * weightedBackendServices, service must not be set. Conversely if service is set,
     * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
     * or urlRedirect must be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs>> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }

    /**
     * A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return A reference to expected RegionBackendService resource the given URL should be mapped to.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRedirect")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect;

    /**
     * @return When a path pattern is matched, the request is redirected to a URL specified
     * by urlRedirect. If urlRedirect is specified, service or routeAction must not
     * be set.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs>> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    private RegionUrlMapPathMatcherRouteRuleGetArgs() {}

    private RegionUrlMapPathMatcherRouteRuleGetArgs(RegionUrlMapPathMatcherRouteRuleGetArgs $) {
        this.headerAction = $.headerAction;
        this.matchRules = $.matchRules;
        this.priority = $.priority;
        this.routeAction = $.routeAction;
        this.service = $.service;
        this.urlRedirect = $.urlRedirect;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleGetArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleGetArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleGetArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService. headerAction specified here take effect before
         * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService. headerAction specified here take effect before
         * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(RegionUrlMapPathMatcherRouteRuleHeaderActionGetArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param matchRules The rules for determining a match.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs>> matchRules) {
            $.matchRules = matchRules;
            return this;
        }

        /**
         * @param matchRules The rules for determining a match.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(List<RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs> matchRules) {
            return matchRules(Output.of(matchRules));
        }

        /**
         * @param matchRules The rules for determining a match.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder matchRules(RegionUrlMapPathMatcherRouteRuleMatchRuleGetArgs... matchRules) {
            return matchRules(List.of(matchRules));
        }

        /**
         * @param priority For routeRules within a given pathMatcher, priority determines the order
         * in which load balancer will interpret routeRules. RouteRules are evaluated
         * in order of priority, from the lowest to highest number. The priority of
         * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
         * that matches the request is applied.
         * You cannot configure two or more routeRules with the same priority.
         * Priority for each rule must be set to a number between 0 and
         * 2147483647 inclusive.
         * Priority numbers can have gaps, which enable you to add or remove rules
         * in the future without affecting the rest of the rules. For example,
         * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
         * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
         * future without any impact on existing rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority For routeRules within a given pathMatcher, priority determines the order
         * in which load balancer will interpret routeRules. RouteRules are evaluated
         * in order of priority, from the lowest to highest number. The priority of
         * a rule decreases as its number increases (1, 2, 3, N+1). The first rule
         * that matches the request is applied.
         * You cannot configure two or more routeRules with the same priority.
         * Priority for each rule must be set to a number between 0 and
         * 2147483647 inclusive.
         * Priority numbers can have gaps, which enable you to add or remove rules
         * in the future without affecting the rest of the rules. For example,
         * 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which
         * you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the
         * future without any impact on existing rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param routeAction In response to a matching path, the load balancer performs advanced routing
         * actions like URL rewrites, header transformations, etc. prior to forwarding the
         * request to the selected backend. If routeAction specifies any
         * weightedBackendServices, service must not be set. Conversely if service is set,
         * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
         * or urlRedirect must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeAction(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs> routeAction) {
            $.routeAction = routeAction;
            return this;
        }

        /**
         * @param routeAction In response to a matching path, the load balancer performs advanced routing
         * actions like URL rewrites, header transformations, etc. prior to forwarding the
         * request to the selected backend. If routeAction specifies any
         * weightedBackendServices, service must not be set. Conversely if service is set,
         * routeAction cannot contain any  weightedBackendServices. Only one of routeAction
         * or urlRedirect must be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder routeAction(RegionUrlMapPathMatcherRouteRuleRouteActionGetArgs routeAction) {
            return routeAction(Output.of(routeAction));
        }

        /**
         * @param service A reference to expected RegionBackendService resource the given URL should be mapped to.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service A reference to expected RegionBackendService resource the given URL should be mapped to.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param urlRedirect When a path pattern is matched, the request is redirected to a URL specified
         * by urlRedirect. If urlRedirect is specified, service or routeAction must not
         * be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirect(@Nullable Output<RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs> urlRedirect) {
            $.urlRedirect = urlRedirect;
            return this;
        }

        /**
         * @param urlRedirect When a path pattern is matched, the request is redirected to a URL specified
         * by urlRedirect. If urlRedirect is specified, service or routeAction must not
         * be set.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder urlRedirect(RegionUrlMapPathMatcherRouteRuleUrlRedirectGetArgs urlRedirect) {
            return urlRedirect(Output.of(urlRedirect));
        }

        public RegionUrlMapPathMatcherRouteRuleGetArgs build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            return $;
        }
    }

}
