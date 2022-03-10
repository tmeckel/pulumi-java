// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.NetworkACLResponse;
import io.pulumi.azurenative.webpubsub.outputs.PrivateEndpointACLResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebPubSubNetworkACLsResponse {
    /**
     * Default action when no other rule matches
     * 
     */
    private final @Nullable String defaultAction;
    /**
     * ACLs for requests from private endpoints
     * 
     */
    private final @Nullable List<PrivateEndpointACLResponse> privateEndpoints;
    /**
     * ACL for requests from public network
     * 
     */
    private final @Nullable NetworkACLResponse publicNetwork;

    @OutputCustomType.Constructor
    private WebPubSubNetworkACLsResponse(
        @OutputCustomType.Parameter("defaultAction") @Nullable String defaultAction,
        @OutputCustomType.Parameter("privateEndpoints") @Nullable List<PrivateEndpointACLResponse> privateEndpoints,
        @OutputCustomType.Parameter("publicNetwork") @Nullable NetworkACLResponse publicNetwork) {
        this.defaultAction = defaultAction;
        this.privateEndpoints = privateEndpoints;
        this.publicNetwork = publicNetwork;
    }

    /**
     * Default action when no other rule matches
     * 
    */
    public Optional<String> getDefaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }
    /**
     * ACLs for requests from private endpoints
     * 
    */
    public List<PrivateEndpointACLResponse> getPrivateEndpoints() {
        return this.privateEndpoints == null ? List.of() : this.privateEndpoints;
    }
    /**
     * ACL for requests from public network
     * 
    */
    public Optional<NetworkACLResponse> getPublicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubNetworkACLsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultAction;
        private @Nullable List<PrivateEndpointACLResponse> privateEndpoints;
        private @Nullable NetworkACLResponse publicNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubNetworkACLsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultAction = defaults.defaultAction;
    	      this.privateEndpoints = defaults.privateEndpoints;
    	      this.publicNetwork = defaults.publicNetwork;
        }

        public Builder defaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }

        public Builder privateEndpoints(@Nullable List<PrivateEndpointACLResponse> privateEndpoints) {
            this.privateEndpoints = privateEndpoints;
            return this;
        }

        public Builder publicNetwork(@Nullable NetworkACLResponse publicNetwork) {
            this.publicNetwork = publicNetwork;
            return this;
        }
        public WebPubSubNetworkACLsResponse build() {
            return new WebPubSubNetworkACLsResponse(defaultAction, privateEndpoints, publicNetwork);
        }
    }
}
