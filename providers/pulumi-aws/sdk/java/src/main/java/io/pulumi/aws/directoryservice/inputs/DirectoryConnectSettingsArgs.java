// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DirectoryConnectSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectoryConnectSettingsArgs Empty = new DirectoryConnectSettingsArgs();

    @InputImport(name="availabilityZones")
      private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    /**
     * The IP addresses of the AD Connector servers.
     * 
     */
    @InputImport(name="connectIps")
      private final @Nullable Input<List<String>> connectIps;

    public Input<List<String>> getConnectIps() {
        return this.connectIps == null ? Input.empty() : this.connectIps;
    }

    /**
     * The DNS IP addresses of the domain to connect to.
     * 
     */
    @InputImport(name="customerDnsIps", required=true)
      private final Input<List<String>> customerDnsIps;

    public Input<List<String>> getCustomerDnsIps() {
        return this.customerDnsIps;
    }

    /**
     * The username corresponding to the password provided.
     * 
     */
    @InputImport(name="customerUsername", required=true)
      private final Input<String> customerUsername;

    public Input<String> getCustomerUsername() {
        return this.customerUsername;
    }

    /**
     * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
     * 
     */
    @InputImport(name="subnetIds", required=true)
      private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * The identifier of the VPC that the directory is in.
     * 
     */
    @InputImport(name="vpcId", required=true)
      private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public DirectoryConnectSettingsArgs(
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<List<String>> connectIps,
        Input<List<String>> customerDnsIps,
        Input<String> customerUsername,
        Input<List<String>> subnetIds,
        Input<String> vpcId) {
        this.availabilityZones = availabilityZones;
        this.connectIps = connectIps;
        this.customerDnsIps = Objects.requireNonNull(customerDnsIps, "expected parameter 'customerDnsIps' to be non-null");
        this.customerUsername = Objects.requireNonNull(customerUsername, "expected parameter 'customerUsername' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private DirectoryConnectSettingsArgs() {
        this.availabilityZones = Input.empty();
        this.connectIps = Input.empty();
        this.customerDnsIps = Input.empty();
        this.customerUsername = Input.empty();
        this.subnetIds = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectoryConnectSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<List<String>> connectIps;
        private Input<List<String>> customerDnsIps;
        private Input<String> customerUsername;
        private Input<List<String>> subnetIds;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectoryConnectSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectIps = defaults.connectIps;
    	      this.customerDnsIps = defaults.customerDnsIps;
    	      this.customerUsername = defaults.customerUsername;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder availabilityZones(@Nullable Input<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Input.ofNullable(availabilityZones);
            return this;
        }

        public Builder connectIps(@Nullable Input<List<String>> connectIps) {
            this.connectIps = connectIps;
            return this;
        }

        public Builder connectIps(@Nullable List<String> connectIps) {
            this.connectIps = Input.ofNullable(connectIps);
            return this;
        }

        public Builder customerDnsIps(Input<List<String>> customerDnsIps) {
            this.customerDnsIps = Objects.requireNonNull(customerDnsIps);
            return this;
        }

        public Builder customerDnsIps(List<String> customerDnsIps) {
            this.customerDnsIps = Input.of(Objects.requireNonNull(customerDnsIps));
            return this;
        }

        public Builder customerUsername(Input<String> customerUsername) {
            this.customerUsername = Objects.requireNonNull(customerUsername);
            return this;
        }

        public Builder customerUsername(String customerUsername) {
            this.customerUsername = Input.of(Objects.requireNonNull(customerUsername));
            return this;
        }

        public Builder subnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder vpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public DirectoryConnectSettingsArgs build() {
            return new DirectoryConnectSettingsArgs(availabilityZones, connectIps, customerDnsIps, customerUsername, subnetIds, vpcId);
        }
    }
}
