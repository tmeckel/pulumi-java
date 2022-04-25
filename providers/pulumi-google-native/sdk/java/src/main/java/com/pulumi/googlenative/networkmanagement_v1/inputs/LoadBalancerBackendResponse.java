// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a specific load balancer backend.
 * 
 */
public final class LoadBalancerBackendResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancerBackendResponse Empty = new LoadBalancerBackendResponse();

    /**
     * Name of a Compute Engine instance or network endpoint.
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return Name of a Compute Engine instance or network endpoint.
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * A list of firewall rule URIs allowing probes from health check IP ranges.
     * 
     */
    @Import(name="healthCheckAllowingFirewallRules", required=true)
    private List<String> healthCheckAllowingFirewallRules;

    /**
     * @return A list of firewall rule URIs allowing probes from health check IP ranges.
     * 
     */
    public List<String> healthCheckAllowingFirewallRules() {
        return this.healthCheckAllowingFirewallRules;
    }

    /**
     * A list of firewall rule URIs blocking probes from health check IP ranges.
     * 
     */
    @Import(name="healthCheckBlockingFirewallRules", required=true)
    private List<String> healthCheckBlockingFirewallRules;

    /**
     * @return A list of firewall rule URIs blocking probes from health check IP ranges.
     * 
     */
    public List<String> healthCheckBlockingFirewallRules() {
        return this.healthCheckBlockingFirewallRules;
    }

    /**
     * State of the health check firewall configuration.
     * 
     */
    @Import(name="healthCheckFirewallState", required=true)
    private String healthCheckFirewallState;

    /**
     * @return State of the health check firewall configuration.
     * 
     */
    public String healthCheckFirewallState() {
        return this.healthCheckFirewallState;
    }

    /**
     * URI of a Compute Engine instance or network endpoint.
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return URI of a Compute Engine instance or network endpoint.
     * 
     */
    public String uri() {
        return this.uri;
    }

    private LoadBalancerBackendResponse() {}

    private LoadBalancerBackendResponse(LoadBalancerBackendResponse $) {
        this.displayName = $.displayName;
        this.healthCheckAllowingFirewallRules = $.healthCheckAllowingFirewallRules;
        this.healthCheckBlockingFirewallRules = $.healthCheckBlockingFirewallRules;
        this.healthCheckFirewallState = $.healthCheckFirewallState;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerBackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerBackendResponse $;

        public Builder() {
            $ = new LoadBalancerBackendResponse();
        }

        public Builder(LoadBalancerBackendResponse defaults) {
            $ = new LoadBalancerBackendResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Name of a Compute Engine instance or network endpoint.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param healthCheckAllowingFirewallRules A list of firewall rule URIs allowing probes from health check IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckAllowingFirewallRules(List<String> healthCheckAllowingFirewallRules) {
            $.healthCheckAllowingFirewallRules = healthCheckAllowingFirewallRules;
            return this;
        }

        /**
         * @param healthCheckAllowingFirewallRules A list of firewall rule URIs allowing probes from health check IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckAllowingFirewallRules(String... healthCheckAllowingFirewallRules) {
            return healthCheckAllowingFirewallRules(List.of(healthCheckAllowingFirewallRules));
        }

        /**
         * @param healthCheckBlockingFirewallRules A list of firewall rule URIs blocking probes from health check IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckBlockingFirewallRules(List<String> healthCheckBlockingFirewallRules) {
            $.healthCheckBlockingFirewallRules = healthCheckBlockingFirewallRules;
            return this;
        }

        /**
         * @param healthCheckBlockingFirewallRules A list of firewall rule URIs blocking probes from health check IP ranges.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckBlockingFirewallRules(String... healthCheckBlockingFirewallRules) {
            return healthCheckBlockingFirewallRules(List.of(healthCheckBlockingFirewallRules));
        }

        /**
         * @param healthCheckFirewallState State of the health check firewall configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckFirewallState(String healthCheckFirewallState) {
            $.healthCheckFirewallState = healthCheckFirewallState;
            return this;
        }

        /**
         * @param uri URI of a Compute Engine instance or network endpoint.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        public LoadBalancerBackendResponse build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.healthCheckAllowingFirewallRules = Objects.requireNonNull($.healthCheckAllowingFirewallRules, "expected parameter 'healthCheckAllowingFirewallRules' to be non-null");
            $.healthCheckBlockingFirewallRules = Objects.requireNonNull($.healthCheckBlockingFirewallRules, "expected parameter 'healthCheckBlockingFirewallRules' to be non-null");
            $.healthCheckFirewallState = Objects.requireNonNull($.healthCheckFirewallState, "expected parameter 'healthCheckFirewallState' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
