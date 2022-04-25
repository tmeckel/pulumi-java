// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.inputs.HttpHeaderActionArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpRedirectActionArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpRouteActionArgs;
import com.pulumi.googlenative.compute_v1.inputs.HttpRouteRuleArgs;
import com.pulumi.googlenative.compute_v1.inputs.PathRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A matcher for the path portion of the URL. The BackendService from the longest-matched rule will serve the URL. If no rule was matched, the default service is used.
 * 
 */
public final class PathMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final PathMatcherArgs Empty = new PathMatcherArgs();

    /**
     * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher&#39;s defaultRouteAction.
     * 
     */
    @Import(name="defaultRouteAction")
    private @Nullable Output<HttpRouteActionArgs> defaultRouteAction;

    /**
     * @return defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher&#39;s defaultRouteAction.
     * 
     */
    public Optional<Output<HttpRouteActionArgs>> defaultRouteAction() {
        return Optional.ofNullable(this.defaultRouteAction);
    }

    /**
     * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    @Import(name="defaultService")
    private @Nullable Output<String> defaultService;

    /**
     * @return The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
     * 
     */
    public Optional<Output<String>> defaultService() {
        return Optional.ofNullable(this.defaultService);
    }

    /**
     * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="defaultUrlRedirect")
    private @Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect;

    /**
     * @return When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public Optional<Output<HttpRedirectActionArgs>> defaultUrlRedirect() {
        return Optional.ofNullable(this.defaultUrlRedirect);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<HttpHeaderActionArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Optional<Output<HttpHeaderActionArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name to which this PathMatcher is referred by the HostRule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that&#39;s required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    @Import(name="pathRules")
    private @Nullable Output<List<PathRuleArgs>> pathRules;

    /**
     * @return The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that&#39;s required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
     * 
     */
    public Optional<Output<List<PathRuleArgs>>> pathRules() {
        return Optional.ofNullable(this.pathRules);
    }

    /**
     * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    @Import(name="routeRules")
    private @Nullable Output<List<HttpRouteRuleArgs>> routeRules;

    /**
     * @return The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
     * 
     */
    public Optional<Output<List<HttpRouteRuleArgs>>> routeRules() {
        return Optional.ofNullable(this.routeRules);
    }

    private PathMatcherArgs() {}

    private PathMatcherArgs(PathMatcherArgs $) {
        this.defaultRouteAction = $.defaultRouteAction;
        this.defaultService = $.defaultService;
        this.defaultUrlRedirect = $.defaultUrlRedirect;
        this.description = $.description;
        this.headerAction = $.headerAction;
        this.name = $.name;
        this.pathRules = $.pathRules;
        this.routeRules = $.routeRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PathMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PathMatcherArgs $;

        public Builder() {
            $ = new PathMatcherArgs();
        }

        public Builder(PathMatcherArgs defaults) {
            $ = new PathMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultRouteAction defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher&#39;s defaultRouteAction.
         * 
         * @return builder
         * 
         */
        public Builder defaultRouteAction(@Nullable Output<HttpRouteActionArgs> defaultRouteAction) {
            $.defaultRouteAction = defaultRouteAction;
            return this;
        }

        /**
         * @param defaultRouteAction defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher&#39;s defaultRouteAction.
         * 
         * @return builder
         * 
         */
        public Builder defaultRouteAction(HttpRouteActionArgs defaultRouteAction) {
            return defaultRouteAction(Output.of(defaultRouteAction));
        }

        /**
         * @param defaultService The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
         * 
         * @return builder
         * 
         */
        public Builder defaultService(@Nullable Output<String> defaultService) {
            $.defaultService = defaultService;
            return this;
        }

        /**
         * @param defaultService The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
         * 
         * @return builder
         * 
         */
        public Builder defaultService(String defaultService) {
            return defaultService(Output.of(defaultService));
        }

        /**
         * @param defaultUrlRedirect When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
         * 
         * @return builder
         * 
         */
        public Builder defaultUrlRedirect(@Nullable Output<HttpRedirectActionArgs> defaultUrlRedirect) {
            $.defaultUrlRedirect = defaultUrlRedirect;
            return this;
        }

        /**
         * @param defaultUrlRedirect When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
         * 
         * @return builder
         * 
         */
        public Builder defaultUrlRedirect(HttpRedirectActionArgs defaultUrlRedirect) {
            return defaultUrlRedirect(Output.of(defaultUrlRedirect));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<HttpHeaderActionArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(HttpHeaderActionArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param name The name to which this PathMatcher is referred by the HostRule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name to which this PathMatcher is referred by the HostRule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pathRules The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that&#39;s required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
         * 
         * @return builder
         * 
         */
        public Builder pathRules(@Nullable Output<List<PathRuleArgs>> pathRules) {
            $.pathRules = pathRules;
            return this;
        }

        /**
         * @param pathRules The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that&#39;s required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
         * 
         * @return builder
         * 
         */
        public Builder pathRules(List<PathRuleArgs> pathRules) {
            return pathRules(Output.of(pathRules));
        }

        /**
         * @param pathRules The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that&#39;s required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/* will match before /a/b/* irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
         * 
         * @return builder
         * 
         */
        public Builder pathRules(PathRuleArgs... pathRules) {
            return pathRules(List.of(pathRules));
        }

        /**
         * @param routeRules The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
         * 
         * @return builder
         * 
         */
        public Builder routeRules(@Nullable Output<List<HttpRouteRuleArgs>> routeRules) {
            $.routeRules = routeRules;
            return this;
        }

        /**
         * @param routeRules The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
         * 
         * @return builder
         * 
         */
        public Builder routeRules(List<HttpRouteRuleArgs> routeRules) {
            return routeRules(Output.of(routeRules));
        }

        /**
         * @param routeRules The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
         * 
         * @return builder
         * 
         */
        public Builder routeRules(HttpRouteRuleArgs... routeRules) {
            return routeRules(List.of(routeRules));
        }

        public PathMatcherArgs build() {
            return $;
        }
    }

}
