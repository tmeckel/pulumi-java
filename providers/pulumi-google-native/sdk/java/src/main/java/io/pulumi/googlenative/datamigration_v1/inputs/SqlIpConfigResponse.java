// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.inputs.SqlAclEntryResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * IP Management configuration.
 * 
 */
public final class SqlIpConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlIpConfigResponse Empty = new SqlIpConfigResponse();

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g. `192.168.100.0/24`).
     * 
     */
    @InputImport(name="authorizedNetworks", required=true)
    private final List<SqlAclEntryResponse> authorizedNetworks;

    public List<SqlAclEntryResponse> getAuthorizedNetworks() {
        return this.authorizedNetworks;
    }

    /**
     * Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    @InputImport(name="enableIpv4", required=true)
    private final Boolean enableIpv4;

    public Boolean getEnableIpv4() {
        return this.enableIpv4;
    }

    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @InputImport(name="privateNetwork", required=true)
    private final String privateNetwork;

    public String getPrivateNetwork() {
        return this.privateNetwork;
    }

    /**
     * Whether SSL connections over IP should be enforced or not.
     * 
     */
    @InputImport(name="requireSsl", required=true)
    private final Boolean requireSsl;

    public Boolean getRequireSsl() {
        return this.requireSsl;
    }

    public SqlIpConfigResponse(
        List<SqlAclEntryResponse> authorizedNetworks,
        Boolean enableIpv4,
        String privateNetwork,
        Boolean requireSsl) {
        this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks, "expected parameter 'authorizedNetworks' to be non-null");
        this.enableIpv4 = Objects.requireNonNull(enableIpv4, "expected parameter 'enableIpv4' to be non-null");
        this.privateNetwork = Objects.requireNonNull(privateNetwork, "expected parameter 'privateNetwork' to be non-null");
        this.requireSsl = Objects.requireNonNull(requireSsl, "expected parameter 'requireSsl' to be non-null");
    }

    private SqlIpConfigResponse() {
        this.authorizedNetworks = List.of();
        this.enableIpv4 = null;
        this.privateNetwork = null;
        this.requireSsl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlIpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SqlAclEntryResponse> authorizedNetworks;
        private Boolean enableIpv4;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlIpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enableIpv4 = defaults.enableIpv4;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder setAuthorizedNetworks(List<SqlAclEntryResponse> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }

        public Builder setEnableIpv4(Boolean enableIpv4) {
            this.enableIpv4 = Objects.requireNonNull(enableIpv4);
            return this;
        }

        public Builder setPrivateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }

        public Builder setRequireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }

        public SqlIpConfigResponse build() {
            return new SqlIpConfigResponse(authorizedNetworks, enableIpv4, privateNetwork, requireSsl);
        }
    }
}
