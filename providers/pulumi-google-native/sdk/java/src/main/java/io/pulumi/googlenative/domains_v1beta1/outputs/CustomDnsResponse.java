// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1beta1.outputs.DsRecordResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CustomDnsResponse {
    /**
     * The list of DS records for this domain, which are used to enable DNSSEC. The domain's DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled.
     * 
     */
    private final List<DsRecordResponse> dsRecords;
    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format.
     * 
     */
    private final List<String> nameServers;

    @OutputCustomType.Constructor
    private CustomDnsResponse(
        @OutputCustomType.Parameter("dsRecords") List<DsRecordResponse> dsRecords,
        @OutputCustomType.Parameter("nameServers") List<String> nameServers) {
        this.dsRecords = dsRecords;
        this.nameServers = nameServers;
    }

    /**
     * The list of DS records for this domain, which are used to enable DNSSEC. The domain's DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled.
     * 
    */
    public List<DsRecordResponse> getDsRecords() {
        return this.dsRecords;
    }
    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format.
     * 
    */
    public List<String> getNameServers() {
        return this.nameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDnsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DsRecordResponse> dsRecords;
        private List<String> nameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDnsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dsRecords = defaults.dsRecords;
    	      this.nameServers = defaults.nameServers;
        }

        public Builder dsRecords(List<DsRecordResponse> dsRecords) {
            this.dsRecords = Objects.requireNonNull(dsRecords);
            return this;
        }

        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public CustomDnsResponse build() {
            return new CustomDnsResponse(dsRecords, nameServers);
        }
    }
}
