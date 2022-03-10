// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail;

import io.pulumi.awsnative.lightsail.inputs.LoadBalancerTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * The names of the instances attached to the load balancer.
     * 
     */
    @InputImport(name="attachedInstances")
      private final @Nullable Input<List<String>> attachedInstances;

    public Input<List<String>> getAttachedInstances() {
        return this.attachedInstances == null ? Input.empty() : this.attachedInstances;
    }

    /**
     * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/").
     * 
     */
    @InputImport(name="healthCheckPath")
      private final @Nullable Input<String> healthCheckPath;

    public Input<String> getHealthCheckPath() {
        return this.healthCheckPath == null ? Input.empty() : this.healthCheckPath;
    }

    /**
     * The instance port where you're creating your load balancer.
     * 
     */
    @InputImport(name="instancePort", required=true)
      private final Input<Integer> instancePort;

    public Input<Integer> getInstancePort() {
        return this.instancePort;
    }

    /**
     * The IP address type for the load balancer. The possible values are ipv4 for IPv4 only, and dualstack for IPv4 and IPv6. The default value is dualstack.
     * 
     */
    @InputImport(name="ipAddressType")
      private final @Nullable Input<String> ipAddressType;

    public Input<String> getIpAddressType() {
        return this.ipAddressType == null ? Input.empty() : this.ipAddressType;
    }

    /**
     * The name of your load balancer.
     * 
     */
    @InputImport(name="loadBalancerName")
      private final @Nullable Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName == null ? Input.empty() : this.loadBalancerName;
    }

    /**
     * Configuration option to enable session stickiness.
     * 
     */
    @InputImport(name="sessionStickinessEnabled")
      private final @Nullable Input<Boolean> sessionStickinessEnabled;

    public Input<Boolean> getSessionStickinessEnabled() {
        return this.sessionStickinessEnabled == null ? Input.empty() : this.sessionStickinessEnabled;
    }

    /**
     * Configuration option to adjust session stickiness cookie duration parameter.
     * 
     */
    @InputImport(name="sessionStickinessLBCookieDurationSeconds")
      private final @Nullable Input<String> sessionStickinessLBCookieDurationSeconds;

    public Input<String> getSessionStickinessLBCookieDurationSeconds() {
        return this.sessionStickinessLBCookieDurationSeconds == null ? Input.empty() : this.sessionStickinessLBCookieDurationSeconds;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<LoadBalancerTagArgs>> tags;

    public Input<List<LoadBalancerTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LoadBalancerArgs(
        @Nullable Input<List<String>> attachedInstances,
        @Nullable Input<String> healthCheckPath,
        Input<Integer> instancePort,
        @Nullable Input<String> ipAddressType,
        @Nullable Input<String> loadBalancerName,
        @Nullable Input<Boolean> sessionStickinessEnabled,
        @Nullable Input<String> sessionStickinessLBCookieDurationSeconds,
        @Nullable Input<List<LoadBalancerTagArgs>> tags) {
        this.attachedInstances = attachedInstances;
        this.healthCheckPath = healthCheckPath;
        this.instancePort = Objects.requireNonNull(instancePort, "expected parameter 'instancePort' to be non-null");
        this.ipAddressType = ipAddressType;
        this.loadBalancerName = loadBalancerName;
        this.sessionStickinessEnabled = sessionStickinessEnabled;
        this.sessionStickinessLBCookieDurationSeconds = sessionStickinessLBCookieDurationSeconds;
        this.tags = tags;
    }

    private LoadBalancerArgs() {
        this.attachedInstances = Input.empty();
        this.healthCheckPath = Input.empty();
        this.instancePort = Input.empty();
        this.ipAddressType = Input.empty();
        this.loadBalancerName = Input.empty();
        this.sessionStickinessEnabled = Input.empty();
        this.sessionStickinessLBCookieDurationSeconds = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> attachedInstances;
        private @Nullable Input<String> healthCheckPath;
        private Input<Integer> instancePort;
        private @Nullable Input<String> ipAddressType;
        private @Nullable Input<String> loadBalancerName;
        private @Nullable Input<Boolean> sessionStickinessEnabled;
        private @Nullable Input<String> sessionStickinessLBCookieDurationSeconds;
        private @Nullable Input<List<LoadBalancerTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedInstances = defaults.attachedInstances;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.instancePort = defaults.instancePort;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.sessionStickinessEnabled = defaults.sessionStickinessEnabled;
    	      this.sessionStickinessLBCookieDurationSeconds = defaults.sessionStickinessLBCookieDurationSeconds;
    	      this.tags = defaults.tags;
        }

        public Builder attachedInstances(@Nullable Input<List<String>> attachedInstances) {
            this.attachedInstances = attachedInstances;
            return this;
        }

        public Builder attachedInstances(@Nullable List<String> attachedInstances) {
            this.attachedInstances = Input.ofNullable(attachedInstances);
            return this;
        }

        public Builder healthCheckPath(@Nullable Input<String> healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder healthCheckPath(@Nullable String healthCheckPath) {
            this.healthCheckPath = Input.ofNullable(healthCheckPath);
            return this;
        }

        public Builder instancePort(Input<Integer> instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }

        public Builder instancePort(Integer instancePort) {
            this.instancePort = Input.of(Objects.requireNonNull(instancePort));
            return this;
        }

        public Builder ipAddressType(@Nullable Input<String> ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }

        public Builder ipAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = Input.ofNullable(ipAddressType);
            return this;
        }

        public Builder loadBalancerName(@Nullable Input<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Input.ofNullable(loadBalancerName);
            return this;
        }

        public Builder sessionStickinessEnabled(@Nullable Input<Boolean> sessionStickinessEnabled) {
            this.sessionStickinessEnabled = sessionStickinessEnabled;
            return this;
        }

        public Builder sessionStickinessEnabled(@Nullable Boolean sessionStickinessEnabled) {
            this.sessionStickinessEnabled = Input.ofNullable(sessionStickinessEnabled);
            return this;
        }

        public Builder sessionStickinessLBCookieDurationSeconds(@Nullable Input<String> sessionStickinessLBCookieDurationSeconds) {
            this.sessionStickinessLBCookieDurationSeconds = sessionStickinessLBCookieDurationSeconds;
            return this;
        }

        public Builder sessionStickinessLBCookieDurationSeconds(@Nullable String sessionStickinessLBCookieDurationSeconds) {
            this.sessionStickinessLBCookieDurationSeconds = Input.ofNullable(sessionStickinessLBCookieDurationSeconds);
            return this;
        }

        public Builder tags(@Nullable Input<List<LoadBalancerTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LoadBalancerTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LoadBalancerArgs build() {
            return new LoadBalancerArgs(attachedInstances, healthCheckPath, instancePort, ipAddressType, loadBalancerName, sessionStickinessEnabled, sessionStickinessLBCookieDurationSeconds, tags);
        }
    }
}
