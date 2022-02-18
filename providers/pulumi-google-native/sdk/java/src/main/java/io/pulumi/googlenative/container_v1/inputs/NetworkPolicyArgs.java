// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.enums.NetworkPolicyProvider;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for the NetworkPolicy feature. https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
 * 
 */
public final class NetworkPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyArgs Empty = new NetworkPolicyArgs();

    /**
     * Whether network policy is enabled on the cluster.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The selected network policy provider.
     * 
     */
    @InputImport(name="provider")
    private final @Nullable Input<NetworkPolicyProvider> provider;

    public Input<NetworkPolicyProvider> getProvider() {
        return this.provider == null ? Input.empty() : this.provider;
    }

    public NetworkPolicyArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<NetworkPolicyProvider> provider) {
        this.enabled = enabled;
        this.provider = provider;
    }

    private NetworkPolicyArgs() {
        this.enabled = Input.empty();
        this.provider = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<NetworkPolicyProvider> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setProvider(@Nullable Input<NetworkPolicyProvider> provider) {
            this.provider = provider;
            return this;
        }

        public Builder setProvider(@Nullable NetworkPolicyProvider provider) {
            this.provider = Input.ofNullable(provider);
            return this;
        }

        public NetworkPolicyArgs build() {
            return new NetworkPolicyArgs(enabled, provider);
        }
    }
}
