// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGlobalReachConnectionResult {
    /**
     * @return The network used for global reach carved out from the original network block provided for the private cloud
     * 
     */
    private final String addressPrefix;
    /**
     * @return Authorization key from the peer express route used for the global reach connection
     * 
     */
    private final @Nullable String authorizationKey;
    /**
     * @return The connection status of the global reach connection
     * 
     */
    private final String circuitConnectionStatus;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Identifier of the ExpressRoute Circuit to peer with in the global reach connection
     * 
     */
    private final @Nullable String peerExpressRouteCircuit;
    /**
     * @return The state of the  ExpressRoute Circuit Authorization provisioning
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetGlobalReachConnectionResult(
        @CustomType.Parameter("addressPrefix") String addressPrefix,
        @CustomType.Parameter("authorizationKey") @Nullable String authorizationKey,
        @CustomType.Parameter("circuitConnectionStatus") String circuitConnectionStatus,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peerExpressRouteCircuit") @Nullable String peerExpressRouteCircuit,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.addressPrefix = addressPrefix;
        this.authorizationKey = authorizationKey;
        this.circuitConnectionStatus = circuitConnectionStatus;
        this.id = id;
        this.name = name;
        this.peerExpressRouteCircuit = peerExpressRouteCircuit;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return The network used for global reach carved out from the original network block provided for the private cloud
     * 
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }
    /**
     * @return Authorization key from the peer express route used for the global reach connection
     * 
     */
    public Optional<String> authorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }
    /**
     * @return The connection status of the global reach connection
     * 
     */
    public String circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Identifier of the ExpressRoute Circuit to peer with in the global reach connection
     * 
     */
    public Optional<String> peerExpressRouteCircuit() {
        return Optional.ofNullable(this.peerExpressRouteCircuit);
    }
    /**
     * @return The state of the  ExpressRoute Circuit Authorization provisioning
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalReachConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressPrefix;
        private @Nullable String authorizationKey;
        private String circuitConnectionStatus;
        private String id;
        private String name;
        private @Nullable String peerExpressRouteCircuit;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalReachConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.circuitConnectionStatus = defaults.circuitConnectionStatus;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerExpressRouteCircuit = defaults.peerExpressRouteCircuit;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder addressPrefix(String addressPrefix) {
            this.addressPrefix = Objects.requireNonNull(addressPrefix);
            return this;
        }
        public Builder authorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }
        public Builder circuitConnectionStatus(String circuitConnectionStatus) {
            this.circuitConnectionStatus = Objects.requireNonNull(circuitConnectionStatus);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peerExpressRouteCircuit(@Nullable String peerExpressRouteCircuit) {
            this.peerExpressRouteCircuit = peerExpressRouteCircuit;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetGlobalReachConnectionResult build() {
            return new GetGlobalReachConnectionResult(addressPrefix, authorizationKey, circuitConnectionStatus, id, name, peerExpressRouteCircuit, provisioningState, type);
        }
    }
}
