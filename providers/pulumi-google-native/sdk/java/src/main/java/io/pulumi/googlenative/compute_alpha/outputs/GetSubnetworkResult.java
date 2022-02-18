// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.SubnetworkLogConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SubnetworkSecondaryRangeResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetSubnetworkResult {
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Sets the aggregation interval for collecting flow logs. Increasing the interval time reduces the amount of generated flow logs for long-lasting connections. Default is an interval of 5 seconds per connection. Valid values: INTERVAL_5_SEC, INTERVAL_30_SEC, INTERVAL_1_MIN, INTERVAL_5_MIN, INTERVAL_10_MIN, INTERVAL_15_MIN.
     * 
     */
    private final String aggregationInterval;
    /**
     * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
     */
    private final Boolean allowSubnetCidrRoutesOverlap;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    private final String description;
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    private final Boolean enableFlowLogs;
    /**
     * Enables Layer2 communication on the subnetwork.
     * 
     */
    private final Boolean enableL2;
    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    private final String externalIpv6Prefix;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     * 
     */
    private final String fingerprint;
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    private final Double flowSampling;
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    private final String gatewayAddress;
    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    private final String ipCidrRange;
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    private final String ipv6AccessType;
    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork. Note this will be for private google access only eventually.
     * 
     */
    private final String ipv6CidrRange;
    /**
     * Type of the resource. Always compute#subnetwork for Subnetwork resources.
     * 
     */
    private final String kind;
    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    private final SubnetworkLogConfigResponse logConfig;
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Configures whether metadata fields should be added to the reported VPC flow logs. Options are INCLUDE_ALL_METADATA, EXCLUDE_ALL_METADATA, and CUSTOM_METADATA. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    private final String metadata;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    private final String network;
    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    private final Boolean privateIpGoogleAccess;
    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    private final String privateIpv6GoogleAccess;
    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    private final String purpose;
    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    private final String region;
    /**
     * The URL of the reserved internal range.
     * 
     */
    private final String reservedInternalRange;
    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    private final String role;
    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    private final List<SubnetworkSecondaryRangeResponse> secondaryIpRanges;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    private final String stackType;
    /**
     * The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     * 
     */
    private final String state;
    /**
     * A repeated field indicating the VLAN IDs supported on this subnetwork. During Subnet creation, specifying vlan is valid only if enable_l2 is true. During Subnet Update, specifying vlan is allowed only for l2 enabled subnets. Restricted to only one VLAN.
     * 
     */
    private final List<Integer> vlans;

    @OutputCustomType.Constructor({"aggregationInterval","allowSubnetCidrRoutesOverlap","creationTimestamp","description","enableFlowLogs","enableL2","externalIpv6Prefix","fingerprint","flowSampling","gatewayAddress","ipCidrRange","ipv6AccessType","ipv6CidrRange","kind","logConfig","metadata","name","network","privateIpGoogleAccess","privateIpv6GoogleAccess","purpose","region","reservedInternalRange","role","secondaryIpRanges","selfLink","selfLinkWithId","stackType","state","vlans"})
    private GetSubnetworkResult(
        String aggregationInterval,
        Boolean allowSubnetCidrRoutesOverlap,
        String creationTimestamp,
        String description,
        Boolean enableFlowLogs,
        Boolean enableL2,
        String externalIpv6Prefix,
        String fingerprint,
        Double flowSampling,
        String gatewayAddress,
        String ipCidrRange,
        String ipv6AccessType,
        String ipv6CidrRange,
        String kind,
        SubnetworkLogConfigResponse logConfig,
        String metadata,
        String name,
        String network,
        Boolean privateIpGoogleAccess,
        String privateIpv6GoogleAccess,
        String purpose,
        String region,
        String reservedInternalRange,
        String role,
        List<SubnetworkSecondaryRangeResponse> secondaryIpRanges,
        String selfLink,
        String selfLinkWithId,
        String stackType,
        String state,
        List<Integer> vlans) {
        this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
        this.allowSubnetCidrRoutesOverlap = Objects.requireNonNull(allowSubnetCidrRoutesOverlap);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.enableFlowLogs = Objects.requireNonNull(enableFlowLogs);
        this.enableL2 = Objects.requireNonNull(enableL2);
        this.externalIpv6Prefix = Objects.requireNonNull(externalIpv6Prefix);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.flowSampling = Objects.requireNonNull(flowSampling);
        this.gatewayAddress = Objects.requireNonNull(gatewayAddress);
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
        this.ipv6CidrRange = Objects.requireNonNull(ipv6CidrRange);
        this.kind = Objects.requireNonNull(kind);
        this.logConfig = Objects.requireNonNull(logConfig);
        this.metadata = Objects.requireNonNull(metadata);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.privateIpGoogleAccess = Objects.requireNonNull(privateIpGoogleAccess);
        this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
        this.purpose = Objects.requireNonNull(purpose);
        this.region = Objects.requireNonNull(region);
        this.reservedInternalRange = Objects.requireNonNull(reservedInternalRange);
        this.role = Objects.requireNonNull(role);
        this.secondaryIpRanges = Objects.requireNonNull(secondaryIpRanges);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.stackType = Objects.requireNonNull(stackType);
        this.state = Objects.requireNonNull(state);
        this.vlans = Objects.requireNonNull(vlans);
    }

    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Sets the aggregation interval for collecting flow logs. Increasing the interval time reduces the amount of generated flow logs for long-lasting connections. Default is an interval of 5 seconds per connection. Valid values: INTERVAL_5_SEC, INTERVAL_30_SEC, INTERVAL_1_MIN, INTERVAL_5_MIN, INTERVAL_10_MIN, INTERVAL_15_MIN.
     * 
     */
    public String getAggregationInterval() {
        return this.aggregationInterval;
    }
    /**
     * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
     */
    public Boolean getAllowSubnetCidrRoutesOverlap() {
        return this.allowSubnetCidrRoutesOverlap;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    public Boolean getEnableFlowLogs() {
        return this.enableFlowLogs;
    }
    /**
     * Enables Layer2 communication on the subnetwork.
     * 
     */
    public Boolean getEnableL2() {
        return this.enableL2;
    }
    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    public String getExternalIpv6Prefix() {
        return this.externalIpv6Prefix;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     * 
     */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. The value of the field must be in [0, 1]. Set the sampling rate of VPC flow logs within the subnetwork where 1.0 means all collected logs are reported and 0.0 means no logs are reported. Default is 0.5 unless otherwise specified by the org policy, which means half of all collected logs are reported.
     * 
     */
    public Double getFlowSampling() {
        return this.flowSampling;
    }
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    public String getGatewayAddress() {
        return this.gatewayAddress;
    }
    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    public String getIpv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork. Note this will be for private google access only eventually.
     * 
     */
    public String getIpv6CidrRange() {
        return this.ipv6CidrRange;
    }
    /**
     * Type of the resource. Always compute#subnetwork for Subnetwork resources.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    public SubnetworkLogConfigResponse getLogConfig() {
        return this.logConfig;
    }
    /**
     * Can only be specified if VPC flow logging for this subnetwork is enabled. Configures whether metadata fields should be added to the reported VPC flow logs. Options are INCLUDE_ALL_METADATA, EXCLUDE_ALL_METADATA, and CUSTOM_METADATA. Default is EXCLUDE_ALL_METADATA.
     * 
     */
    public String getMetadata() {
        return this.metadata;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    public String getNetwork() {
        return this.network;
    }
    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    public Boolean getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess;
    }
    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    public String getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    public String getPurpose() {
        return this.purpose;
    }
    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    public String getRegion() {
        return this.region;
    }
    /**
     * The URL of the reserved internal range.
     * 
     */
    public String getReservedInternalRange() {
        return this.reservedInternalRange;
    }
    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    public String getRole() {
        return this.role;
    }
    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    public List<SubnetworkSecondaryRangeResponse> getSecondaryIpRanges() {
        return this.secondaryIpRanges;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    public String getStackType() {
        return this.stackType;
    }
    /**
     * The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * A repeated field indicating the VLAN IDs supported on this subnetwork. During Subnet creation, specifying vlan is valid only if enable_l2 is true. During Subnet Update, specifying vlan is allowed only for l2 enabled subnets. Restricted to only one VLAN.
     * 
     */
    public List<Integer> getVlans() {
        return this.vlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregationInterval;
        private Boolean allowSubnetCidrRoutesOverlap;
        private String creationTimestamp;
        private String description;
        private Boolean enableFlowLogs;
        private Boolean enableL2;
        private String externalIpv6Prefix;
        private String fingerprint;
        private Double flowSampling;
        private String gatewayAddress;
        private String ipCidrRange;
        private String ipv6AccessType;
        private String ipv6CidrRange;
        private String kind;
        private SubnetworkLogConfigResponse logConfig;
        private String metadata;
        private String name;
        private String network;
        private Boolean privateIpGoogleAccess;
        private String privateIpv6GoogleAccess;
        private String purpose;
        private String region;
        private String reservedInternalRange;
        private String role;
        private List<SubnetworkSecondaryRangeResponse> secondaryIpRanges;
        private String selfLink;
        private String selfLinkWithId;
        private String stackType;
        private String state;
        private List<Integer> vlans;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationInterval = defaults.aggregationInterval;
    	      this.allowSubnetCidrRoutesOverlap = defaults.allowSubnetCidrRoutesOverlap;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.enableFlowLogs = defaults.enableFlowLogs;
    	      this.enableL2 = defaults.enableL2;
    	      this.externalIpv6Prefix = defaults.externalIpv6Prefix;
    	      this.fingerprint = defaults.fingerprint;
    	      this.flowSampling = defaults.flowSampling;
    	      this.gatewayAddress = defaults.gatewayAddress;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6CidrRange = defaults.ipv6CidrRange;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.reservedInternalRange = defaults.reservedInternalRange;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.stackType = defaults.stackType;
    	      this.state = defaults.state;
    	      this.vlans = defaults.vlans;
        }

        public Builder setAggregationInterval(String aggregationInterval) {
            this.aggregationInterval = Objects.requireNonNull(aggregationInterval);
            return this;
        }

        public Builder setAllowSubnetCidrRoutesOverlap(Boolean allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = Objects.requireNonNull(allowSubnetCidrRoutesOverlap);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEnableFlowLogs(Boolean enableFlowLogs) {
            this.enableFlowLogs = Objects.requireNonNull(enableFlowLogs);
            return this;
        }

        public Builder setEnableL2(Boolean enableL2) {
            this.enableL2 = Objects.requireNonNull(enableL2);
            return this;
        }

        public Builder setExternalIpv6Prefix(String externalIpv6Prefix) {
            this.externalIpv6Prefix = Objects.requireNonNull(externalIpv6Prefix);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setFlowSampling(Double flowSampling) {
            this.flowSampling = Objects.requireNonNull(flowSampling);
            return this;
        }

        public Builder setGatewayAddress(String gatewayAddress) {
            this.gatewayAddress = Objects.requireNonNull(gatewayAddress);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setIpv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }

        public Builder setIpv6CidrRange(String ipv6CidrRange) {
            this.ipv6CidrRange = Objects.requireNonNull(ipv6CidrRange);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLogConfig(SubnetworkLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }

        public Builder setMetadata(String metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setPrivateIpGoogleAccess(Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Objects.requireNonNull(privateIpGoogleAccess);
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }

        public Builder setPurpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setReservedInternalRange(String reservedInternalRange) {
            this.reservedInternalRange = Objects.requireNonNull(reservedInternalRange);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setSecondaryIpRanges(List<SubnetworkSecondaryRangeResponse> secondaryIpRanges) {
            this.secondaryIpRanges = Objects.requireNonNull(secondaryIpRanges);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setStackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setVlans(List<Integer> vlans) {
            this.vlans = Objects.requireNonNull(vlans);
            return this;
        }

        public GetSubnetworkResult build() {
            return new GetSubnetworkResult(aggregationInterval, allowSubnetCidrRoutesOverlap, creationTimestamp, description, enableFlowLogs, enableL2, externalIpv6Prefix, fingerprint, flowSampling, gatewayAddress, ipCidrRange, ipv6AccessType, ipv6CidrRange, kind, logConfig, metadata, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, purpose, region, reservedInternalRange, role, secondaryIpRanges, selfLink, selfLinkWithId, stackType, state, vlans);
        }
    }
}
