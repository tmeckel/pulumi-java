// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway.inputs;

import io.pulumi.aws.storagegateway.inputs.GatewayGatewayNetworkInterfaceGetArgs;
import io.pulumi.aws.storagegateway.inputs.GatewaySmbActiveDirectorySettingsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayState extends io.pulumi.resources.ResourceArgs {

    public static final GatewayState Empty = new GatewayState();

    /**
     * Gateway activation key during resource creation. Conflicts with `gateway_ip_address`. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @Import(name="activationKey")
      private final @Nullable Output<String> activationKey;

    public Output<String> getActivationKey() {
        return this.activationKey == null ? Codegen.empty() : this.activationKey;
    }

    /**
     * Amazon Resource Name (ARN) of the gateway.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The average download bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @Import(name="averageDownloadRateLimitInBitsPerSec")
      private final @Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec;

    public Output<Integer> getAverageDownloadRateLimitInBitsPerSec() {
        return this.averageDownloadRateLimitInBitsPerSec == null ? Codegen.empty() : this.averageDownloadRateLimitInBitsPerSec;
    }

    /**
     * The average upload bandwidth rate limit in bits per second. This is supported for the `CACHED`, `STORED`, and `VTL` gateway types.
     * 
     */
    @Import(name="averageUploadRateLimitInBitsPerSec")
      private final @Nullable Output<Integer> averageUploadRateLimitInBitsPerSec;

    public Output<Integer> getAverageUploadRateLimitInBitsPerSec() {
        return this.averageUploadRateLimitInBitsPerSec == null ? Codegen.empty() : this.averageUploadRateLimitInBitsPerSec;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group to use to monitor and log events in the gateway.
     * 
     */
    @Import(name="cloudwatchLogGroupArn")
      private final @Nullable Output<String> cloudwatchLogGroupArn;

    public Output<String> getCloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn == null ? Codegen.empty() : this.cloudwatchLogGroupArn;
    }

    /**
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * 
     */
    @Import(name="ec2InstanceId")
      private final @Nullable Output<String> ec2InstanceId;

    public Output<String> getEc2InstanceId() {
        return this.ec2InstanceId == null ? Codegen.empty() : this.ec2InstanceId;
    }

    /**
     * The type of endpoint for your gateway.
     * 
     */
    @Import(name="endpointType")
      private final @Nullable Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType == null ? Codegen.empty() : this.endpointType;
    }

    /**
     * Identifier of the gateway.
     * 
     */
    @Import(name="gatewayId")
      private final @Nullable Output<String> gatewayId;

    public Output<String> getGatewayId() {
        return this.gatewayId == null ? Codegen.empty() : this.gatewayId;
    }

    /**
     * Gateway IP address to retrieve activation key during resource creation. Conflicts with `activation_key`. Gateway must be accessible on port 80 from where this provider is running. Additional information is available in the [Storage Gateway User Guide](https://docs.aws.amazon.com/storagegateway/latest/userguide/get-activation-key.html).
     * 
     */
    @Import(name="gatewayIpAddress")
      private final @Nullable Output<String> gatewayIpAddress;

    public Output<String> getGatewayIpAddress() {
        return this.gatewayIpAddress == null ? Codegen.empty() : this.gatewayIpAddress;
    }

    /**
     * Name of the gateway.
     * 
     */
    @Import(name="gatewayName")
      private final @Nullable Output<String> gatewayName;

    public Output<String> getGatewayName() {
        return this.gatewayName == null ? Codegen.empty() : this.gatewayName;
    }

    /**
     * An array that contains descriptions of the gateway network interfaces. See Gateway Network Interface.
     * 
     */
    @Import(name="gatewayNetworkInterfaces")
      private final @Nullable Output<List<GatewayGatewayNetworkInterfaceGetArgs>> gatewayNetworkInterfaces;

    public Output<List<GatewayGatewayNetworkInterfaceGetArgs>> getGatewayNetworkInterfaces() {
        return this.gatewayNetworkInterfaces == null ? Codegen.empty() : this.gatewayNetworkInterfaces;
    }

    /**
     * Time zone for the gateway. The time zone is of the format "GMT", "GMT-hr:mm", or "GMT+hr:mm". For example, `GMT-4:00` indicates the time is 4 hours behind GMT. The time zone is used, for example, for scheduling snapshots and your gateway's maintenance schedule.
     * 
     */
    @Import(name="gatewayTimezone")
      private final @Nullable Output<String> gatewayTimezone;

    public Output<String> getGatewayTimezone() {
        return this.gatewayTimezone == null ? Codegen.empty() : this.gatewayTimezone;
    }

    /**
     * Type of the gateway. The default value is `STORED`. Valid values: `CACHED`, `FILE_FSX_SMB`, `FILE_S3`, `STORED`, `VTL`.
     * 
     */
    @Import(name="gatewayType")
      private final @Nullable Output<String> gatewayType;

    public Output<String> getGatewayType() {
        return this.gatewayType == null ? Codegen.empty() : this.gatewayType;
    }

    /**
     * VPC endpoint address to be used when activating your gateway. This should be used when your instance is in a private subnet. Requires HTTP access from client computer running this provider. More info on what ports are required by your VPC Endpoint Security group in [Activating a Gateway in a Virtual Private Cloud](https://docs.aws.amazon.com/storagegateway/latest/userguide/gateway-private-link.html).
     * 
     */
    @Import(name="gatewayVpcEndpoint")
      private final @Nullable Output<String> gatewayVpcEndpoint;

    public Output<String> getGatewayVpcEndpoint() {
        return this.gatewayVpcEndpoint == null ? Codegen.empty() : this.gatewayVpcEndpoint;
    }

    /**
     * The type of hypervisor environment used by the host.
     * 
     */
    @Import(name="hostEnvironment")
      private final @Nullable Output<String> hostEnvironment;

    public Output<String> getHostEnvironment() {
        return this.hostEnvironment == null ? Codegen.empty() : this.hostEnvironment;
    }

    /**
     * Type of medium changer to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `STK-L700`, `AWS-Gateway-VTL`, `IBM-03584L32-0402`.
     * 
     */
    @Import(name="mediumChangerType")
      private final @Nullable Output<String> mediumChangerType;

    public Output<String> getMediumChangerType() {
        return this.mediumChangerType == null ? Codegen.empty() : this.mediumChangerType;
    }

    /**
     * Nested argument with Active Directory domain join information for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `ActiveDirectory` authentication SMB file shares. More details below.
     * 
     */
    @Import(name="smbActiveDirectorySettings")
      private final @Nullable Output<GatewaySmbActiveDirectorySettingsGetArgs> smbActiveDirectorySettings;

    public Output<GatewaySmbActiveDirectorySettingsGetArgs> getSmbActiveDirectorySettings() {
        return this.smbActiveDirectorySettings == null ? Codegen.empty() : this.smbActiveDirectorySettings;
    }

    /**
     * Specifies whether the shares on this gateway appear when listing shares.
     * 
     */
    @Import(name="smbFileShareVisibility")
      private final @Nullable Output<Boolean> smbFileShareVisibility;

    public Output<Boolean> getSmbFileShareVisibility() {
        return this.smbFileShareVisibility == null ? Codegen.empty() : this.smbFileShareVisibility;
    }

    /**
     * Guest password for Server Message Block (SMB) file shares. Only valid for `FILE_S3` and `FILE_FSX_SMB` gateway types. Must be set before creating `GuestAccess` authentication SMB file shares. This provider can only detect drift of the existence of a guest password, not its actual value from the gateway. This provider can however update the password with changing the argument.
     * 
     */
    @Import(name="smbGuestPassword")
      private final @Nullable Output<String> smbGuestPassword;

    public Output<String> getSmbGuestPassword() {
        return this.smbGuestPassword == null ? Codegen.empty() : this.smbGuestPassword;
    }

    /**
     * Specifies the type of security strategy. Valid values are: `ClientSpecified`, `MandatorySigning`, and `MandatoryEncryption`. See [Setting a Security Level for Your Gateway](https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-gateway-file.html#security-strategy) for more information.
     * 
     */
    @Import(name="smbSecurityStrategy")
      private final @Nullable Output<String> smbSecurityStrategy;

    public Output<String> getSmbSecurityStrategy() {
        return this.smbSecurityStrategy == null ? Codegen.empty() : this.smbSecurityStrategy;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Type of tape drive to use for tape gateway. This provider cannot detect drift of this argument. Valid values: `IBM-ULT3580-TD5`.
     * 
     */
    @Import(name="tapeDriveType")
      private final @Nullable Output<String> tapeDriveType;

    public Output<String> getTapeDriveType() {
        return this.tapeDriveType == null ? Codegen.empty() : this.tapeDriveType;
    }

    public GatewayState(
        @Nullable Output<String> activationKey,
        @Nullable Output<String> arn,
        @Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec,
        @Nullable Output<Integer> averageUploadRateLimitInBitsPerSec,
        @Nullable Output<String> cloudwatchLogGroupArn,
        @Nullable Output<String> ec2InstanceId,
        @Nullable Output<String> endpointType,
        @Nullable Output<String> gatewayId,
        @Nullable Output<String> gatewayIpAddress,
        @Nullable Output<String> gatewayName,
        @Nullable Output<List<GatewayGatewayNetworkInterfaceGetArgs>> gatewayNetworkInterfaces,
        @Nullable Output<String> gatewayTimezone,
        @Nullable Output<String> gatewayType,
        @Nullable Output<String> gatewayVpcEndpoint,
        @Nullable Output<String> hostEnvironment,
        @Nullable Output<String> mediumChangerType,
        @Nullable Output<GatewaySmbActiveDirectorySettingsGetArgs> smbActiveDirectorySettings,
        @Nullable Output<Boolean> smbFileShareVisibility,
        @Nullable Output<String> smbGuestPassword,
        @Nullable Output<String> smbSecurityStrategy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> tapeDriveType) {
        this.activationKey = activationKey;
        this.arn = arn;
        this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
        this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
        this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
        this.ec2InstanceId = ec2InstanceId;
        this.endpointType = endpointType;
        this.gatewayId = gatewayId;
        this.gatewayIpAddress = gatewayIpAddress;
        this.gatewayName = gatewayName;
        this.gatewayNetworkInterfaces = gatewayNetworkInterfaces;
        this.gatewayTimezone = gatewayTimezone;
        this.gatewayType = gatewayType;
        this.gatewayVpcEndpoint = gatewayVpcEndpoint;
        this.hostEnvironment = hostEnvironment;
        this.mediumChangerType = mediumChangerType;
        this.smbActiveDirectorySettings = smbActiveDirectorySettings;
        this.smbFileShareVisibility = smbFileShareVisibility;
        this.smbGuestPassword = smbGuestPassword;
        this.smbSecurityStrategy = smbSecurityStrategy;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.tapeDriveType = tapeDriveType;
    }

    private GatewayState() {
        this.activationKey = Codegen.empty();
        this.arn = Codegen.empty();
        this.averageDownloadRateLimitInBitsPerSec = Codegen.empty();
        this.averageUploadRateLimitInBitsPerSec = Codegen.empty();
        this.cloudwatchLogGroupArn = Codegen.empty();
        this.ec2InstanceId = Codegen.empty();
        this.endpointType = Codegen.empty();
        this.gatewayId = Codegen.empty();
        this.gatewayIpAddress = Codegen.empty();
        this.gatewayName = Codegen.empty();
        this.gatewayNetworkInterfaces = Codegen.empty();
        this.gatewayTimezone = Codegen.empty();
        this.gatewayType = Codegen.empty();
        this.gatewayVpcEndpoint = Codegen.empty();
        this.hostEnvironment = Codegen.empty();
        this.mediumChangerType = Codegen.empty();
        this.smbActiveDirectorySettings = Codegen.empty();
        this.smbFileShareVisibility = Codegen.empty();
        this.smbGuestPassword = Codegen.empty();
        this.smbSecurityStrategy = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.tapeDriveType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activationKey;
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec;
        private @Nullable Output<Integer> averageUploadRateLimitInBitsPerSec;
        private @Nullable Output<String> cloudwatchLogGroupArn;
        private @Nullable Output<String> ec2InstanceId;
        private @Nullable Output<String> endpointType;
        private @Nullable Output<String> gatewayId;
        private @Nullable Output<String> gatewayIpAddress;
        private @Nullable Output<String> gatewayName;
        private @Nullable Output<List<GatewayGatewayNetworkInterfaceGetArgs>> gatewayNetworkInterfaces;
        private @Nullable Output<String> gatewayTimezone;
        private @Nullable Output<String> gatewayType;
        private @Nullable Output<String> gatewayVpcEndpoint;
        private @Nullable Output<String> hostEnvironment;
        private @Nullable Output<String> mediumChangerType;
        private @Nullable Output<GatewaySmbActiveDirectorySettingsGetArgs> smbActiveDirectorySettings;
        private @Nullable Output<Boolean> smbFileShareVisibility;
        private @Nullable Output<String> smbGuestPassword;
        private @Nullable Output<String> smbSecurityStrategy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> tapeDriveType;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.arn = defaults.arn;
    	      this.averageDownloadRateLimitInBitsPerSec = defaults.averageDownloadRateLimitInBitsPerSec;
    	      this.averageUploadRateLimitInBitsPerSec = defaults.averageUploadRateLimitInBitsPerSec;
    	      this.cloudwatchLogGroupArn = defaults.cloudwatchLogGroupArn;
    	      this.ec2InstanceId = defaults.ec2InstanceId;
    	      this.endpointType = defaults.endpointType;
    	      this.gatewayId = defaults.gatewayId;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.gatewayName = defaults.gatewayName;
    	      this.gatewayNetworkInterfaces = defaults.gatewayNetworkInterfaces;
    	      this.gatewayTimezone = defaults.gatewayTimezone;
    	      this.gatewayType = defaults.gatewayType;
    	      this.gatewayVpcEndpoint = defaults.gatewayVpcEndpoint;
    	      this.hostEnvironment = defaults.hostEnvironment;
    	      this.mediumChangerType = defaults.mediumChangerType;
    	      this.smbActiveDirectorySettings = defaults.smbActiveDirectorySettings;
    	      this.smbFileShareVisibility = defaults.smbFileShareVisibility;
    	      this.smbGuestPassword = defaults.smbGuestPassword;
    	      this.smbSecurityStrategy = defaults.smbSecurityStrategy;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.tapeDriveType = defaults.tapeDriveType;
        }

        public Builder activationKey(@Nullable Output<String> activationKey) {
            this.activationKey = activationKey;
            return this;
        }
        public Builder activationKey(@Nullable String activationKey) {
            this.activationKey = Codegen.ofNullable(activationKey);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder averageDownloadRateLimitInBitsPerSec(@Nullable Output<Integer> averageDownloadRateLimitInBitsPerSec) {
            this.averageDownloadRateLimitInBitsPerSec = averageDownloadRateLimitInBitsPerSec;
            return this;
        }
        public Builder averageDownloadRateLimitInBitsPerSec(@Nullable Integer averageDownloadRateLimitInBitsPerSec) {
            this.averageDownloadRateLimitInBitsPerSec = Codegen.ofNullable(averageDownloadRateLimitInBitsPerSec);
            return this;
        }
        public Builder averageUploadRateLimitInBitsPerSec(@Nullable Output<Integer> averageUploadRateLimitInBitsPerSec) {
            this.averageUploadRateLimitInBitsPerSec = averageUploadRateLimitInBitsPerSec;
            return this;
        }
        public Builder averageUploadRateLimitInBitsPerSec(@Nullable Integer averageUploadRateLimitInBitsPerSec) {
            this.averageUploadRateLimitInBitsPerSec = Codegen.ofNullable(averageUploadRateLimitInBitsPerSec);
            return this;
        }
        public Builder cloudwatchLogGroupArn(@Nullable Output<String> cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }
        public Builder cloudwatchLogGroupArn(@Nullable String cloudwatchLogGroupArn) {
            this.cloudwatchLogGroupArn = Codegen.ofNullable(cloudwatchLogGroupArn);
            return this;
        }
        public Builder ec2InstanceId(@Nullable Output<String> ec2InstanceId) {
            this.ec2InstanceId = ec2InstanceId;
            return this;
        }
        public Builder ec2InstanceId(@Nullable String ec2InstanceId) {
            this.ec2InstanceId = Codegen.ofNullable(ec2InstanceId);
            return this;
        }
        public Builder endpointType(@Nullable Output<String> endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public Builder endpointType(@Nullable String endpointType) {
            this.endpointType = Codegen.ofNullable(endpointType);
            return this;
        }
        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Codegen.ofNullable(gatewayId);
            return this;
        }
        public Builder gatewayIpAddress(@Nullable Output<String> gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }
        public Builder gatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = Codegen.ofNullable(gatewayIpAddress);
            return this;
        }
        public Builder gatewayName(@Nullable Output<String> gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public Builder gatewayName(@Nullable String gatewayName) {
            this.gatewayName = Codegen.ofNullable(gatewayName);
            return this;
        }
        public Builder gatewayNetworkInterfaces(@Nullable Output<List<GatewayGatewayNetworkInterfaceGetArgs>> gatewayNetworkInterfaces) {
            this.gatewayNetworkInterfaces = gatewayNetworkInterfaces;
            return this;
        }
        public Builder gatewayNetworkInterfaces(@Nullable List<GatewayGatewayNetworkInterfaceGetArgs> gatewayNetworkInterfaces) {
            this.gatewayNetworkInterfaces = Codegen.ofNullable(gatewayNetworkInterfaces);
            return this;
        }
        public Builder gatewayNetworkInterfaces(GatewayGatewayNetworkInterfaceGetArgs... gatewayNetworkInterfaces) {
            return gatewayNetworkInterfaces(List.of(gatewayNetworkInterfaces));
        }
        public Builder gatewayTimezone(@Nullable Output<String> gatewayTimezone) {
            this.gatewayTimezone = gatewayTimezone;
            return this;
        }
        public Builder gatewayTimezone(@Nullable String gatewayTimezone) {
            this.gatewayTimezone = Codegen.ofNullable(gatewayTimezone);
            return this;
        }
        public Builder gatewayType(@Nullable Output<String> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public Builder gatewayType(@Nullable String gatewayType) {
            this.gatewayType = Codegen.ofNullable(gatewayType);
            return this;
        }
        public Builder gatewayVpcEndpoint(@Nullable Output<String> gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = gatewayVpcEndpoint;
            return this;
        }
        public Builder gatewayVpcEndpoint(@Nullable String gatewayVpcEndpoint) {
            this.gatewayVpcEndpoint = Codegen.ofNullable(gatewayVpcEndpoint);
            return this;
        }
        public Builder hostEnvironment(@Nullable Output<String> hostEnvironment) {
            this.hostEnvironment = hostEnvironment;
            return this;
        }
        public Builder hostEnvironment(@Nullable String hostEnvironment) {
            this.hostEnvironment = Codegen.ofNullable(hostEnvironment);
            return this;
        }
        public Builder mediumChangerType(@Nullable Output<String> mediumChangerType) {
            this.mediumChangerType = mediumChangerType;
            return this;
        }
        public Builder mediumChangerType(@Nullable String mediumChangerType) {
            this.mediumChangerType = Codegen.ofNullable(mediumChangerType);
            return this;
        }
        public Builder smbActiveDirectorySettings(@Nullable Output<GatewaySmbActiveDirectorySettingsGetArgs> smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = smbActiveDirectorySettings;
            return this;
        }
        public Builder smbActiveDirectorySettings(@Nullable GatewaySmbActiveDirectorySettingsGetArgs smbActiveDirectorySettings) {
            this.smbActiveDirectorySettings = Codegen.ofNullable(smbActiveDirectorySettings);
            return this;
        }
        public Builder smbFileShareVisibility(@Nullable Output<Boolean> smbFileShareVisibility) {
            this.smbFileShareVisibility = smbFileShareVisibility;
            return this;
        }
        public Builder smbFileShareVisibility(@Nullable Boolean smbFileShareVisibility) {
            this.smbFileShareVisibility = Codegen.ofNullable(smbFileShareVisibility);
            return this;
        }
        public Builder smbGuestPassword(@Nullable Output<String> smbGuestPassword) {
            this.smbGuestPassword = smbGuestPassword;
            return this;
        }
        public Builder smbGuestPassword(@Nullable String smbGuestPassword) {
            this.smbGuestPassword = Codegen.ofNullable(smbGuestPassword);
            return this;
        }
        public Builder smbSecurityStrategy(@Nullable Output<String> smbSecurityStrategy) {
            this.smbSecurityStrategy = smbSecurityStrategy;
            return this;
        }
        public Builder smbSecurityStrategy(@Nullable String smbSecurityStrategy) {
            this.smbSecurityStrategy = Codegen.ofNullable(smbSecurityStrategy);
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
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder tapeDriveType(@Nullable Output<String> tapeDriveType) {
            this.tapeDriveType = tapeDriveType;
            return this;
        }
        public Builder tapeDriveType(@Nullable String tapeDriveType) {
            this.tapeDriveType = Codegen.ofNullable(tapeDriveType);
            return this;
        }        public GatewayState build() {
            return new GatewayState(activationKey, arn, averageDownloadRateLimitInBitsPerSec, averageUploadRateLimitInBitsPerSec, cloudwatchLogGroupArn, ec2InstanceId, endpointType, gatewayId, gatewayIpAddress, gatewayName, gatewayNetworkInterfaces, gatewayTimezone, gatewayType, gatewayVpcEndpoint, hostEnvironment, mediumChangerType, smbActiveDirectorySettings, smbFileShareVisibility, smbGuestPassword, smbSecurityStrategy, tags, tagsAll, tapeDriveType);
        }
    }
}
