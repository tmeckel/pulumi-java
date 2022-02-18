// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkconnectivity_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RoutingVPCResponse {
    /**
     * If true, indicates that this VPC network is currently associated with spokes that use the data transfer feature (spokes where the site_to_site_data_transfer field is set to true). If you create new spokes that use data transfer, they must be associated with this VPC network. At most, one VPC network will have this field set to true.
     * 
     */
    private final Boolean requiredForNewSiteToSiteDataTransferSpokes;
    /**
     * The URI of the VPC network.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"requiredForNewSiteToSiteDataTransferSpokes","uri"})
    private RoutingVPCResponse(
        Boolean requiredForNewSiteToSiteDataTransferSpokes,
        String uri) {
        this.requiredForNewSiteToSiteDataTransferSpokes = Objects.requireNonNull(requiredForNewSiteToSiteDataTransferSpokes);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * If true, indicates that this VPC network is currently associated with spokes that use the data transfer feature (spokes where the site_to_site_data_transfer field is set to true). If you create new spokes that use data transfer, they must be associated with this VPC network. At most, one VPC network will have this field set to true.
     * 
     */
    public Boolean getRequiredForNewSiteToSiteDataTransferSpokes() {
        return this.requiredForNewSiteToSiteDataTransferSpokes;
    }
    /**
     * The URI of the VPC network.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingVPCResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean requiredForNewSiteToSiteDataTransferSpokes;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingVPCResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requiredForNewSiteToSiteDataTransferSpokes = defaults.requiredForNewSiteToSiteDataTransferSpokes;
    	      this.uri = defaults.uri;
        }

        public Builder setRequiredForNewSiteToSiteDataTransferSpokes(Boolean requiredForNewSiteToSiteDataTransferSpokes) {
            this.requiredForNewSiteToSiteDataTransferSpokes = Objects.requireNonNull(requiredForNewSiteToSiteDataTransferSpokes);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public RoutingVPCResponse build() {
            return new RoutingVPCResponse(requiredForNewSiteToSiteDataTransferSpokes, uri);
        }
    }
}
