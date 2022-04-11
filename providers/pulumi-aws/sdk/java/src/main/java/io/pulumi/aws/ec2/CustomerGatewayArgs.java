// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayArgs Empty = new CustomerGatewayArgs();

    /**
     * The gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * 
     */
    @Import(name="bgpAsn", required=true)
      private final Output<String> bgpAsn;

    public Output<String> getBgpAsn() {
        return this.bgpAsn;
    }

    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn == null ? Codegen.empty() : this.certificateArn;
    }

    /**
     * A name for the customer gateway device.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * The IP address of the gateway's Internet-routable external interface.
     * 
     */
    @Import(name="ipAddress", required=true)
      private final Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress;
    }

    /**
     * Tags to apply to the gateway. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The type of customer gateway. The only type AWS
     * supports at this time is "ipsec.1".
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public CustomerGatewayArgs(
        Output<String> bgpAsn,
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> deviceName,
        Output<String> ipAddress,
        @Nullable Output<Map<String,String>> tags,
        Output<String> type) {
        this.bgpAsn = Objects.requireNonNull(bgpAsn, "expected parameter 'bgpAsn' to be non-null");
        this.certificateArn = certificateArn;
        this.deviceName = deviceName;
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CustomerGatewayArgs() {
        this.bgpAsn = Codegen.empty();
        this.certificateArn = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.tags = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bgpAsn;
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> deviceName;
        private Output<String> ipAddress;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.deviceName = defaults.deviceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder bgpAsn(Output<String> bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }
        public Builder bgpAsn(String bgpAsn) {
            this.bgpAsn = Output.of(Objects.requireNonNull(bgpAsn));
            return this;
        }
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Codegen.ofNullable(certificateArn);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder ipAddress(Output<String> ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Output.of(Objects.requireNonNull(ipAddress));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CustomerGatewayArgs build() {
            return new CustomerGatewayArgs(bgpAsn, certificateArn, deviceName, ipAddress, tags, type);
        }
    }
}
