// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FrontDoorProtocol;
import com.pulumi.azurenative.network.enums.RoutingRuleEnabledState;
import com.pulumi.azurenative.network.inputs.ForwardingConfigurationArgs;
import com.pulumi.azurenative.network.inputs.RedirectConfigurationArgs;
import com.pulumi.azurenative.network.inputs.RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A routing rule represents a specification for traffic to treat and where to send it, along with health probe information.
 * 
 */
public final class RoutingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingRuleArgs Empty = new RoutingRuleArgs();

    /**
     * Protocol schemes to match for this rule
     * 
     */
    @Import(name="acceptedProtocols")
    private @Nullable Output<List<Either<String,FrontDoorProtocol>>> acceptedProtocols;

    /**
     * @return Protocol schemes to match for this rule
     * 
     */
    public Optional<Output<List<Either<String,FrontDoorProtocol>>>> acceptedProtocols() {
        return Optional.ofNullable(this.acceptedProtocols);
    }

    /**
     * Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Import(name="enabledState")
    private @Nullable Output<Either<String,RoutingRuleEnabledState>> enabledState;

    /**
     * @return Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<Output<Either<String,RoutingRuleEnabledState>>> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }

    /**
     * Frontend endpoints associated with this rule
     * 
     */
    @Import(name="frontendEndpoints")
    private @Nullable Output<List<SubResourceArgs>> frontendEndpoints;

    /**
     * @return Frontend endpoints associated with this rule
     * 
     */
    public Optional<Output<List<SubResourceArgs>>> frontendEndpoints() {
        return Optional.ofNullable(this.frontendEndpoints);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The route patterns of the rule.
     * 
     */
    @Import(name="patternsToMatch")
    private @Nullable Output<List<String>> patternsToMatch;

    /**
     * @return The route patterns of the rule.
     * 
     */
    public Optional<Output<List<String>>> patternsToMatch() {
        return Optional.ofNullable(this.patternsToMatch);
    }

    /**
     * A reference to the routing configuration.
     * 
     */
    @Import(name="routeConfiguration")
    private @Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfiguration;

    /**
     * @return A reference to the routing configuration.
     * 
     */
    public Optional<Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>>> routeConfiguration() {
        return Optional.ofNullable(this.routeConfiguration);
    }

    /**
     * A reference to a specific Rules Engine Configuration to apply to this route.
     * 
     */
    @Import(name="rulesEngine")
    private @Nullable Output<SubResourceArgs> rulesEngine;

    /**
     * @return A reference to a specific Rules Engine Configuration to apply to this route.
     * 
     */
    public Optional<Output<SubResourceArgs>> rulesEngine() {
        return Optional.ofNullable(this.rulesEngine);
    }

    /**
     * Defines the Web Application Firewall policy for each routing rule (if applicable)
     * 
     */
    @Import(name="webApplicationFirewallPolicyLink")
    private @Nullable Output<RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs> webApplicationFirewallPolicyLink;

    /**
     * @return Defines the Web Application Firewall policy for each routing rule (if applicable)
     * 
     */
    public Optional<Output<RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs>> webApplicationFirewallPolicyLink() {
        return Optional.ofNullable(this.webApplicationFirewallPolicyLink);
    }

    private RoutingRuleArgs() {}

    private RoutingRuleArgs(RoutingRuleArgs $) {
        this.acceptedProtocols = $.acceptedProtocols;
        this.enabledState = $.enabledState;
        this.frontendEndpoints = $.frontendEndpoints;
        this.id = $.id;
        this.name = $.name;
        this.patternsToMatch = $.patternsToMatch;
        this.routeConfiguration = $.routeConfiguration;
        this.rulesEngine = $.rulesEngine;
        this.webApplicationFirewallPolicyLink = $.webApplicationFirewallPolicyLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingRuleArgs $;

        public Builder() {
            $ = new RoutingRuleArgs();
        }

        public Builder(RoutingRuleArgs defaults) {
            $ = new RoutingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptedProtocols Protocol schemes to match for this rule
         * 
         * @return builder
         * 
         */
        public Builder acceptedProtocols(@Nullable Output<List<Either<String,FrontDoorProtocol>>> acceptedProtocols) {
            $.acceptedProtocols = acceptedProtocols;
            return this;
        }

        /**
         * @param acceptedProtocols Protocol schemes to match for this rule
         * 
         * @return builder
         * 
         */
        public Builder acceptedProtocols(List<Either<String,FrontDoorProtocol>> acceptedProtocols) {
            return acceptedProtocols(Output.of(acceptedProtocols));
        }

        /**
         * @param acceptedProtocols Protocol schemes to match for this rule
         * 
         * @return builder
         * 
         */
        public Builder acceptedProtocols(Either<String,FrontDoorProtocol>... acceptedProtocols) {
            return acceptedProtocols(List.of(acceptedProtocols));
        }

        /**
         * @param enabledState Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(@Nullable Output<Either<String,RoutingRuleEnabledState>> enabledState) {
            $.enabledState = enabledState;
            return this;
        }

        /**
         * @param enabledState Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(Either<String,RoutingRuleEnabledState> enabledState) {
            return enabledState(Output.of(enabledState));
        }

        /**
         * @param enabledState Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(String enabledState) {
            return enabledState(Either.ofLeft(enabledState));
        }

        /**
         * @param enabledState Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
         * 
         * @return builder
         * 
         */
        public Builder enabledState(RoutingRuleEnabledState enabledState) {
            return enabledState(Either.ofRight(enabledState));
        }

        /**
         * @param frontendEndpoints Frontend endpoints associated with this rule
         * 
         * @return builder
         * 
         */
        public Builder frontendEndpoints(@Nullable Output<List<SubResourceArgs>> frontendEndpoints) {
            $.frontendEndpoints = frontendEndpoints;
            return this;
        }

        /**
         * @param frontendEndpoints Frontend endpoints associated with this rule
         * 
         * @return builder
         * 
         */
        public Builder frontendEndpoints(List<SubResourceArgs> frontendEndpoints) {
            return frontendEndpoints(Output.of(frontendEndpoints));
        }

        /**
         * @param frontendEndpoints Frontend endpoints associated with this rule
         * 
         * @return builder
         * 
         */
        public Builder frontendEndpoints(SubResourceArgs... frontendEndpoints) {
            return frontendEndpoints(List.of(frontendEndpoints));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param patternsToMatch The route patterns of the rule.
         * 
         * @return builder
         * 
         */
        public Builder patternsToMatch(@Nullable Output<List<String>> patternsToMatch) {
            $.patternsToMatch = patternsToMatch;
            return this;
        }

        /**
         * @param patternsToMatch The route patterns of the rule.
         * 
         * @return builder
         * 
         */
        public Builder patternsToMatch(List<String> patternsToMatch) {
            return patternsToMatch(Output.of(patternsToMatch));
        }

        /**
         * @param patternsToMatch The route patterns of the rule.
         * 
         * @return builder
         * 
         */
        public Builder patternsToMatch(String... patternsToMatch) {
            return patternsToMatch(List.of(patternsToMatch));
        }

        /**
         * @param routeConfiguration A reference to the routing configuration.
         * 
         * @return builder
         * 
         */
        public Builder routeConfiguration(@Nullable Output<Either<ForwardingConfigurationArgs,RedirectConfigurationArgs>> routeConfiguration) {
            $.routeConfiguration = routeConfiguration;
            return this;
        }

        /**
         * @param routeConfiguration A reference to the routing configuration.
         * 
         * @return builder
         * 
         */
        public Builder routeConfiguration(Either<ForwardingConfigurationArgs,RedirectConfigurationArgs> routeConfiguration) {
            return routeConfiguration(Output.of(routeConfiguration));
        }

        /**
         * @param routeConfiguration A reference to the routing configuration.
         * 
         * @return builder
         * 
         */
        public Builder routeConfiguration(ForwardingConfigurationArgs routeConfiguration) {
            return routeConfiguration(Either.ofLeft(routeConfiguration));
        }

        /**
         * @param routeConfiguration A reference to the routing configuration.
         * 
         * @return builder
         * 
         */
        public Builder routeConfiguration(RedirectConfigurationArgs routeConfiguration) {
            return routeConfiguration(Either.ofRight(routeConfiguration));
        }

        /**
         * @param rulesEngine A reference to a specific Rules Engine Configuration to apply to this route.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngine(@Nullable Output<SubResourceArgs> rulesEngine) {
            $.rulesEngine = rulesEngine;
            return this;
        }

        /**
         * @param rulesEngine A reference to a specific Rules Engine Configuration to apply to this route.
         * 
         * @return builder
         * 
         */
        public Builder rulesEngine(SubResourceArgs rulesEngine) {
            return rulesEngine(Output.of(rulesEngine));
        }

        /**
         * @param webApplicationFirewallPolicyLink Defines the Web Application Firewall policy for each routing rule (if applicable)
         * 
         * @return builder
         * 
         */
        public Builder webApplicationFirewallPolicyLink(@Nullable Output<RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs> webApplicationFirewallPolicyLink) {
            $.webApplicationFirewallPolicyLink = webApplicationFirewallPolicyLink;
            return this;
        }

        /**
         * @param webApplicationFirewallPolicyLink Defines the Web Application Firewall policy for each routing rule (if applicable)
         * 
         * @return builder
         * 
         */
        public Builder webApplicationFirewallPolicyLink(RoutingRuleUpdateParametersWebApplicationFirewallPolicyLinkArgs webApplicationFirewallPolicyLink) {
            return webApplicationFirewallPolicyLink(Output.of(webApplicationFirewallPolicyLink));
        }

        public RoutingRuleArgs build() {
            return $;
        }
    }

}
