// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction;
import com.pulumi.gcp.networkservices.outputs.EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheServiceRoutingPathMatcherRouteRule {
    /**
     * @return A human-readable description of the resource.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The header actions, including adding &amp; removing headers, for requests that match this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction;
    /**
     * @return The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates
     * within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * Structure is documented below.
     * 
     */
    private final List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules;
    /**
     * @return The Origin resource that requests to this route should fetch from when a matching response is not in cache. Origins can be defined as short names (&#34;my-origin&#34;) or fully-qualified resource URLs - e.g. &#34;networkservices.googleapis.com/projects/my-project/global/edgecacheorigins/my-origin&#34;
     * Only one of origin or urlRedirect can be set.
     * 
     */
    private final @Nullable String origin;
    /**
     * @return The priority of this route rule, where 1 is the highest priority.
     * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 1 and 999 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers
     * to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    private final String priority;
    /**
     * @return In response to a matching path, the routeAction performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected origin.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction;
    /**
     * @return The URL redirect configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    private final @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect;

    @CustomType.Constructor
    private EdgeCacheServiceRoutingPathMatcherRouteRule(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("headerAction") @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction,
        @CustomType.Parameter("matchRules") List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules,
        @CustomType.Parameter("origin") @Nullable String origin,
        @CustomType.Parameter("priority") String priority,
        @CustomType.Parameter("routeAction") @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction,
        @CustomType.Parameter("urlRedirect") @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect) {
        this.description = description;
        this.headerAction = headerAction;
        this.matchRules = matchRules;
        this.origin = origin;
        this.priority = priority;
        this.routeAction = routeAction;
        this.urlRedirect = urlRedirect;
    }

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The header actions, including adding &amp; removing headers, for requests that match this route.
     * Structure is documented below.
     * 
     */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }
    /**
     * @return The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates
     * within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
     * Structure is documented below.
     * 
     */
    public List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules() {
        return this.matchRules;
    }
    /**
     * @return The Origin resource that requests to this route should fetch from when a matching response is not in cache. Origins can be defined as short names (&#34;my-origin&#34;) or fully-qualified resource URLs - e.g. &#34;networkservices.googleapis.com/projects/my-project/global/edgecacheorigins/my-origin&#34;
     * Only one of origin or urlRedirect can be set.
     * 
     */
    public Optional<String> origin() {
        return Optional.ofNullable(this.origin);
    }
    /**
     * @return The priority of this route rule, where 1 is the highest priority.
     * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 1 and 999 inclusive.
     * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers
     * to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return In response to a matching path, the routeAction performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the selected origin.
     * Structure is documented below.
     * 
     */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction> routeAction() {
        return Optional.ofNullable(this.routeAction);
    }
    /**
     * @return The URL redirect configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    public Optional<EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect> urlRedirect() {
        return Optional.ofNullable(this.urlRedirect);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction;
        private List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules;
        private @Nullable String origin;
        private String priority;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction;
        private @Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.headerAction = defaults.headerAction;
    	      this.matchRules = defaults.matchRules;
    	      this.origin = defaults.origin;
    	      this.priority = defaults.priority;
    	      this.routeAction = defaults.routeAction;
    	      this.urlRedirect = defaults.urlRedirect;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder headerAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderAction headerAction) {
            this.headerAction = headerAction;
            return this;
        }
        public Builder matchRules(List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule> matchRules) {
            this.matchRules = Objects.requireNonNull(matchRules);
            return this;
        }
        public Builder matchRules(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRule... matchRules) {
            return matchRules(List.of(matchRules));
        }
        public Builder origin(@Nullable String origin) {
            this.origin = origin;
            return this;
        }
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeAction(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteAction routeAction) {
            this.routeAction = routeAction;
            return this;
        }
        public Builder urlRedirect(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleUrlRedirect urlRedirect) {
            this.urlRedirect = urlRedirect;
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRule build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRule(description, headerAction, matchRules, origin, priority, routeAction, urlRedirect);
        }
    }
}
