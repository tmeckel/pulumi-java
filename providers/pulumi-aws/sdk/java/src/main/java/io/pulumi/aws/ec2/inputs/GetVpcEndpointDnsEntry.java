// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVpcEndpointDnsEntry extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointDnsEntry Empty = new GetVpcEndpointDnsEntry();

    /**
     * The DNS name.
     * 
     */
    @InputImport(name="dnsName", required=true)
      private final String dnsName;

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * The ID of the private hosted zone.
     * 
     */
    @InputImport(name="hostedZoneId", required=true)
      private final String hostedZoneId;

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    public GetVpcEndpointDnsEntry(
        String dnsName,
        String hostedZoneId) {
        this.dnsName = Objects.requireNonNull(dnsName, "expected parameter 'dnsName' to be non-null");
        this.hostedZoneId = Objects.requireNonNull(hostedZoneId, "expected parameter 'hostedZoneId' to be non-null");
    }

    private GetVpcEndpointDnsEntry() {
        this.dnsName = null;
        this.hostedZoneId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointDnsEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dnsName;
        private String hostedZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointDnsEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.hostedZoneId = defaults.hostedZoneId;
        }

        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }

        public Builder hostedZoneId(String hostedZoneId) {
            this.hostedZoneId = Objects.requireNonNull(hostedZoneId);
            return this;
        }
        public GetVpcEndpointDnsEntry build() {
            return new GetVpcEndpointDnsEntry(dnsName, hostedZoneId);
        }
    }
}
