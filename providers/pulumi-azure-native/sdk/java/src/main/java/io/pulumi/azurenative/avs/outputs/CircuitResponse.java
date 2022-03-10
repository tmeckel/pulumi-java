// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CircuitResponse {
    /**
     * Identifier of the ExpressRoute Circuit (Microsoft Colo only)
     * 
     */
    private final String expressRouteID;
    /**
     * ExpressRoute Circuit private peering identifier
     * 
     */
    private final String expressRoutePrivatePeeringID;
    /**
     * CIDR of primary subnet
     * 
     */
    private final String primarySubnet;
    /**
     * CIDR of secondary subnet
     * 
     */
    private final String secondarySubnet;

    @OutputCustomType.Constructor
    private CircuitResponse(
        @OutputCustomType.Parameter("expressRouteID") String expressRouteID,
        @OutputCustomType.Parameter("expressRoutePrivatePeeringID") String expressRoutePrivatePeeringID,
        @OutputCustomType.Parameter("primarySubnet") String primarySubnet,
        @OutputCustomType.Parameter("secondarySubnet") String secondarySubnet) {
        this.expressRouteID = expressRouteID;
        this.expressRoutePrivatePeeringID = expressRoutePrivatePeeringID;
        this.primarySubnet = primarySubnet;
        this.secondarySubnet = secondarySubnet;
    }

    /**
     * Identifier of the ExpressRoute Circuit (Microsoft Colo only)
     * 
    */
    public String getExpressRouteID() {
        return this.expressRouteID;
    }
    /**
     * ExpressRoute Circuit private peering identifier
     * 
    */
    public String getExpressRoutePrivatePeeringID() {
        return this.expressRoutePrivatePeeringID;
    }
    /**
     * CIDR of primary subnet
     * 
    */
    public String getPrimarySubnet() {
        return this.primarySubnet;
    }
    /**
     * CIDR of secondary subnet
     * 
    */
    public String getSecondarySubnet() {
        return this.secondarySubnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expressRouteID;
        private String expressRoutePrivatePeeringID;
        private String primarySubnet;
        private String secondarySubnet;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expressRouteID = defaults.expressRouteID;
    	      this.expressRoutePrivatePeeringID = defaults.expressRoutePrivatePeeringID;
    	      this.primarySubnet = defaults.primarySubnet;
    	      this.secondarySubnet = defaults.secondarySubnet;
        }

        public Builder expressRouteID(String expressRouteID) {
            this.expressRouteID = Objects.requireNonNull(expressRouteID);
            return this;
        }

        public Builder expressRoutePrivatePeeringID(String expressRoutePrivatePeeringID) {
            this.expressRoutePrivatePeeringID = Objects.requireNonNull(expressRoutePrivatePeeringID);
            return this;
        }

        public Builder primarySubnet(String primarySubnet) {
            this.primarySubnet = Objects.requireNonNull(primarySubnet);
            return this;
        }

        public Builder secondarySubnet(String secondarySubnet) {
            this.secondarySubnet = Objects.requireNonNull(secondarySubnet);
            return this;
        }
        public CircuitResponse build() {
            return new CircuitResponse(expressRouteID, expressRoutePrivatePeeringID, primarySubnet, secondarySubnet);
        }
    }
}
