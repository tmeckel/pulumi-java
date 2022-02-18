// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.RouterNatLogConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterNatRuleResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RouterNatSubnetworkToNatResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouterNatResponse {
    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
     * 
     */
    private final List<String> drainNatIps;
    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
     */
    private final Boolean enableDynamicPortAllocation;
    private final Boolean enableEndpointIndependentMapping;
    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    private final Integer icmpIdleTimeoutSec;
    /**
     * Configure logging on this NAT.
     * 
     */
    private final RouterNatLogConfigResponse logConfig;
    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
     */
    private final Integer maxPortsPerVm;
    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
     */
    private final Integer minPortsPerVm;
    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    private final String name;
    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    private final String natIpAllocateOption;
    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
     */
    private final List<String> natIps;
    /**
     * A list of rules associated with this NAT.
     * 
     */
    private final List<RouterNatRuleResponse> rules;
    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    private final String sourceSubnetworkIpRangesToNat;
    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
     */
    private final List<RouterNatSubnetworkToNatResponse> subnetworks;
    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
     */
    private final Integer tcpEstablishedIdleTimeoutSec;
    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
     */
    private final Integer tcpTimeWaitTimeoutSec;
    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
     */
    private final Integer tcpTransitoryIdleTimeoutSec;
    /**
     * Indicates whether this NAT is used for public or private IP translation. If unspecified, it defaults to PUBLIC.
     * 
     */
    private final String type;
    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    private final Integer udpIdleTimeoutSec;

    @OutputCustomType.Constructor({"drainNatIps","enableDynamicPortAllocation","enableEndpointIndependentMapping","icmpIdleTimeoutSec","logConfig","maxPortsPerVm","minPortsPerVm","name","natIpAllocateOption","natIps","rules","sourceSubnetworkIpRangesToNat","subnetworks","tcpEstablishedIdleTimeoutSec","tcpTimeWaitTimeoutSec","tcpTransitoryIdleTimeoutSec","type","udpIdleTimeoutSec"})
    private RouterNatResponse(
        List<String> drainNatIps,
        Boolean enableDynamicPortAllocation,
        Boolean enableEndpointIndependentMapping,
        Integer icmpIdleTimeoutSec,
        RouterNatLogConfigResponse logConfig,
        Integer maxPortsPerVm,
        Integer minPortsPerVm,
        String name,
        String natIpAllocateOption,
        List<String> natIps,
        List<RouterNatRuleResponse> rules,
        String sourceSubnetworkIpRangesToNat,
        List<RouterNatSubnetworkToNatResponse> subnetworks,
        Integer tcpEstablishedIdleTimeoutSec,
        Integer tcpTimeWaitTimeoutSec,
        Integer tcpTransitoryIdleTimeoutSec,
        String type,
        Integer udpIdleTimeoutSec) {
        this.drainNatIps = Objects.requireNonNull(drainNatIps);
        this.enableDynamicPortAllocation = Objects.requireNonNull(enableDynamicPortAllocation);
        this.enableEndpointIndependentMapping = Objects.requireNonNull(enableEndpointIndependentMapping);
        this.icmpIdleTimeoutSec = Objects.requireNonNull(icmpIdleTimeoutSec);
        this.logConfig = Objects.requireNonNull(logConfig);
        this.maxPortsPerVm = Objects.requireNonNull(maxPortsPerVm);
        this.minPortsPerVm = Objects.requireNonNull(minPortsPerVm);
        this.name = Objects.requireNonNull(name);
        this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption);
        this.natIps = Objects.requireNonNull(natIps);
        this.rules = Objects.requireNonNull(rules);
        this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat);
        this.subnetworks = Objects.requireNonNull(subnetworks);
        this.tcpEstablishedIdleTimeoutSec = Objects.requireNonNull(tcpEstablishedIdleTimeoutSec);
        this.tcpTimeWaitTimeoutSec = Objects.requireNonNull(tcpTimeWaitTimeoutSec);
        this.tcpTransitoryIdleTimeoutSec = Objects.requireNonNull(tcpTransitoryIdleTimeoutSec);
        this.type = Objects.requireNonNull(type);
        this.udpIdleTimeoutSec = Objects.requireNonNull(udpIdleTimeoutSec);
    }

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
     * 
     */
    public List<String> getDrainNatIps() {
        return this.drainNatIps;
    }
    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
     */
    public Boolean getEnableDynamicPortAllocation() {
        return this.enableDynamicPortAllocation;
    }
    public Boolean getEnableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping;
    }
    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    public Integer getIcmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec;
    }
    /**
     * Configure logging on this NAT.
     * 
     */
    public RouterNatLogConfigResponse getLogConfig() {
        return this.logConfig;
    }
    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
     */
    public Integer getMaxPortsPerVm() {
        return this.maxPortsPerVm;
    }
    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
     */
    public Integer getMinPortsPerVm() {
        return this.minPortsPerVm;
    }
    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    public String getNatIpAllocateOption() {
        return this.natIpAllocateOption;
    }
    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
     */
    public List<String> getNatIps() {
        return this.natIps;
    }
    /**
     * A list of rules associated with this NAT.
     * 
     */
    public List<RouterNatRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    public String getSourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat;
    }
    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
     */
    public List<RouterNatSubnetworkToNatResponse> getSubnetworks() {
        return this.subnetworks;
    }
    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
     */
    public Integer getTcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec;
    }
    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
     */
    public Integer getTcpTimeWaitTimeoutSec() {
        return this.tcpTimeWaitTimeoutSec;
    }
    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
     */
    public Integer getTcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec;
    }
    /**
     * Indicates whether this NAT is used for public or private IP translation. If unspecified, it defaults to PUBLIC.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    public Integer getUdpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> drainNatIps;
        private Boolean enableDynamicPortAllocation;
        private Boolean enableEndpointIndependentMapping;
        private Integer icmpIdleTimeoutSec;
        private RouterNatLogConfigResponse logConfig;
        private Integer maxPortsPerVm;
        private Integer minPortsPerVm;
        private String name;
        private String natIpAllocateOption;
        private List<String> natIps;
        private List<RouterNatRuleResponse> rules;
        private String sourceSubnetworkIpRangesToNat;
        private List<RouterNatSubnetworkToNatResponse> subnetworks;
        private Integer tcpEstablishedIdleTimeoutSec;
        private Integer tcpTimeWaitTimeoutSec;
        private Integer tcpTransitoryIdleTimeoutSec;
        private String type;
        private Integer udpIdleTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainNatIps = defaults.drainNatIps;
    	      this.enableDynamicPortAllocation = defaults.enableDynamicPortAllocation;
    	      this.enableEndpointIndependentMapping = defaults.enableEndpointIndependentMapping;
    	      this.icmpIdleTimeoutSec = defaults.icmpIdleTimeoutSec;
    	      this.logConfig = defaults.logConfig;
    	      this.maxPortsPerVm = defaults.maxPortsPerVm;
    	      this.minPortsPerVm = defaults.minPortsPerVm;
    	      this.name = defaults.name;
    	      this.natIpAllocateOption = defaults.natIpAllocateOption;
    	      this.natIps = defaults.natIps;
    	      this.rules = defaults.rules;
    	      this.sourceSubnetworkIpRangesToNat = defaults.sourceSubnetworkIpRangesToNat;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tcpEstablishedIdleTimeoutSec = defaults.tcpEstablishedIdleTimeoutSec;
    	      this.tcpTimeWaitTimeoutSec = defaults.tcpTimeWaitTimeoutSec;
    	      this.tcpTransitoryIdleTimeoutSec = defaults.tcpTransitoryIdleTimeoutSec;
    	      this.type = defaults.type;
    	      this.udpIdleTimeoutSec = defaults.udpIdleTimeoutSec;
        }

        public Builder setDrainNatIps(List<String> drainNatIps) {
            this.drainNatIps = Objects.requireNonNull(drainNatIps);
            return this;
        }

        public Builder setEnableDynamicPortAllocation(Boolean enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = Objects.requireNonNull(enableDynamicPortAllocation);
            return this;
        }

        public Builder setEnableEndpointIndependentMapping(Boolean enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = Objects.requireNonNull(enableEndpointIndependentMapping);
            return this;
        }

        public Builder setIcmpIdleTimeoutSec(Integer icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = Objects.requireNonNull(icmpIdleTimeoutSec);
            return this;
        }

        public Builder setLogConfig(RouterNatLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }

        public Builder setMaxPortsPerVm(Integer maxPortsPerVm) {
            this.maxPortsPerVm = Objects.requireNonNull(maxPortsPerVm);
            return this;
        }

        public Builder setMinPortsPerVm(Integer minPortsPerVm) {
            this.minPortsPerVm = Objects.requireNonNull(minPortsPerVm);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNatIpAllocateOption(String natIpAllocateOption) {
            this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption);
            return this;
        }

        public Builder setNatIps(List<String> natIps) {
            this.natIps = Objects.requireNonNull(natIps);
            return this;
        }

        public Builder setRules(List<RouterNatRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setSourceSubnetworkIpRangesToNat(String sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat);
            return this;
        }

        public Builder setSubnetworks(List<RouterNatSubnetworkToNatResponse> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }

        public Builder setTcpEstablishedIdleTimeoutSec(Integer tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = Objects.requireNonNull(tcpEstablishedIdleTimeoutSec);
            return this;
        }

        public Builder setTcpTimeWaitTimeoutSec(Integer tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = Objects.requireNonNull(tcpTimeWaitTimeoutSec);
            return this;
        }

        public Builder setTcpTransitoryIdleTimeoutSec(Integer tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = Objects.requireNonNull(tcpTransitoryIdleTimeoutSec);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUdpIdleTimeoutSec(Integer udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = Objects.requireNonNull(udpIdleTimeoutSec);
            return this;
        }

        public RouterNatResponse build() {
            return new RouterNatResponse(drainNatIps, enableDynamicPortAllocation, enableEndpointIndependentMapping, icmpIdleTimeoutSec, logConfig, maxPortsPerVm, minPortsPerVm, name, natIpAllocateOption, natIps, rules, sourceSubnetworkIpRangesToNat, subnetworks, tcpEstablishedIdleTimeoutSec, tcpTimeWaitTimeoutSec, tcpTransitoryIdleTimeoutSec, type, udpIdleTimeoutSec);
        }
    }
}
