// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datamigration_v1.inputs.SqlAclEntryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP Management configuration.
 * 
 */
public final class SqlIpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlIpConfigArgs Empty = new SqlIpConfigArgs();

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g. `192.168.100.0/24`).
     * 
     */
    @InputImport(name="authorizedNetworks")
    private final @Nullable Input<List<SqlAclEntryArgs>> authorizedNetworks;

    public Input<List<SqlAclEntryArgs>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Input.empty() : this.authorizedNetworks;
    }

    /**
     * Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    @InputImport(name="enableIpv4")
    private final @Nullable Input<Boolean> enableIpv4;

    public Input<Boolean> getEnableIpv4() {
        return this.enableIpv4 == null ? Input.empty() : this.enableIpv4;
    }

    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @InputImport(name="privateNetwork")
    private final @Nullable Input<String> privateNetwork;

    public Input<String> getPrivateNetwork() {
        return this.privateNetwork == null ? Input.empty() : this.privateNetwork;
    }

    /**
     * Whether SSL connections over IP should be enforced or not.
     * 
     */
    @InputImport(name="requireSsl")
    private final @Nullable Input<Boolean> requireSsl;

    public Input<Boolean> getRequireSsl() {
        return this.requireSsl == null ? Input.empty() : this.requireSsl;
    }

    public SqlIpConfigArgs(
        @Nullable Input<List<SqlAclEntryArgs>> authorizedNetworks,
        @Nullable Input<Boolean> enableIpv4,
        @Nullable Input<String> privateNetwork,
        @Nullable Input<Boolean> requireSsl) {
        this.authorizedNetworks = authorizedNetworks;
        this.enableIpv4 = enableIpv4;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    private SqlIpConfigArgs() {
        this.authorizedNetworks = Input.empty();
        this.enableIpv4 = Input.empty();
        this.privateNetwork = Input.empty();
        this.requireSsl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SqlAclEntryArgs>> authorizedNetworks;
        private @Nullable Input<Boolean> enableIpv4;
        private @Nullable Input<String> privateNetwork;
        private @Nullable Input<Boolean> requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlIpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enableIpv4 = defaults.enableIpv4;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder setAuthorizedNetworks(@Nullable Input<List<SqlAclEntryArgs>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable List<SqlAclEntryArgs> authorizedNetworks) {
            this.authorizedNetworks = Input.ofNullable(authorizedNetworks);
            return this;
        }

        public Builder setEnableIpv4(@Nullable Input<Boolean> enableIpv4) {
            this.enableIpv4 = enableIpv4;
            return this;
        }

        public Builder setEnableIpv4(@Nullable Boolean enableIpv4) {
            this.enableIpv4 = Input.ofNullable(enableIpv4);
            return this;
        }

        public Builder setPrivateNetwork(@Nullable Input<String> privateNetwork) {
            this.privateNetwork = privateNetwork;
            return this;
        }

        public Builder setPrivateNetwork(@Nullable String privateNetwork) {
            this.privateNetwork = Input.ofNullable(privateNetwork);
            return this;
        }

        public Builder setRequireSsl(@Nullable Input<Boolean> requireSsl) {
            this.requireSsl = requireSsl;
            return this;
        }

        public Builder setRequireSsl(@Nullable Boolean requireSsl) {
            this.requireSsl = Input.ofNullable(requireSsl);
            return this;
        }

        public SqlIpConfigArgs build() {
            return new SqlIpConfigArgs(authorizedNetworks, enableIpv4, privateNetwork, requireSsl);
        }
    }
}
