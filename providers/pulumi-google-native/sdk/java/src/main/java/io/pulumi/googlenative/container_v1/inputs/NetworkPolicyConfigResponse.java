// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
 * 
 */
public final class NetworkPolicyConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkPolicyConfigResponse Empty = new NetworkPolicyConfigResponse();

    /**
     * Whether NetworkPolicy is enabled for this cluster.
     * 
     */
    @InputImport(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    public NetworkPolicyConfigResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private NetworkPolicyConfigResponse() {
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public NetworkPolicyConfigResponse build() {
            return new NetworkPolicyConfigResponse(disabled);
        }
    }
}
