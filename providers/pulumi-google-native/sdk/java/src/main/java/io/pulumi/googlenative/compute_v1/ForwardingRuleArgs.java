// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.ForwardingRuleIpProtocol;
import io.pulumi.googlenative.compute_v1.enums.ForwardingRuleIpVersion;
import io.pulumi.googlenative.compute_v1.enums.ForwardingRuleLoadBalancingScheme;
import io.pulumi.googlenative.compute_v1.enums.ForwardingRuleNetworkTier;
import io.pulumi.googlenative.compute_v1.enums.ForwardingRulePscConnectionStatus;
import io.pulumi.googlenative.compute_v1.inputs.ForwardingRuleServiceDirectoryRegistrationArgs;
import io.pulumi.googlenative.compute_v1.inputs.MetadataFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ForwardingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ForwardingRuleArgs Empty = new ForwardingRuleArgs();

    /**
     * This field is used along with the backend_service field for Internal TCP/UDP Load Balancing or Network Load Balancing, or with the target field for internal and external TargetInstance. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. For TCP, UDP and SCTP traffic, packets addressed to any ports will be forwarded to the target or backendService.
     * 
     */
    @Import(name="allPorts")
      private final @Nullable Output<Boolean> allPorts;

    public Output<Boolean> getAllPorts() {
        return this.allPorts == null ? Codegen.empty() : this.allPorts;
    }

    /**
     * This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
     * 
     */
    @Import(name="allowGlobalAccess")
      private final @Nullable Output<Boolean> allowGlobalAccess;

    public Output<Boolean> getAllowGlobalAccess() {
        return this.allowGlobalAccess == null ? Codegen.empty() : this.allowGlobalAccess;
    }

    /**
     * Identifies the backend service to which the forwarding rule sends traffic. Required for Internal TCP/UDP Load Balancing and Network Load Balancing; must be omitted for all other load balancer types.
     * 
     */
    @Import(name="backendService")
      private final @Nullable Output<String> backendService;

    public Output<String> getBackendService() {
        return this.backendService == null ? Codegen.empty() : this.backendService;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * IP address that this forwarding rule serves. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the target that you specify in the forwarding rule. If you don't specify a reserved IP address, an ephemeral IP address is assigned. Methods for specifying an IP address: * IPv4 dotted decimal, as in `100.1.2.3` * Full URL, as in https://www.googleapis.com/compute/v1/projects/project_id/regions/region /addresses/address-name * Partial URL or by name, as in: - projects/project_id/regions/region/addresses/address-name - regions/region/addresses/address-name - global/addresses/address-name - address-name The loadBalancingScheme and the forwarding rule's target determine the type of IP address that you can use. For detailed information, see [IP address specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications). Must be set to `0.0.0.0` when the target is targetGrpcProxy that has validateForProxyless field set to true. For Private Service Connect forwarding rules that forward traffic to Google APIs, IP address must be provided.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for different load balancing products as described in [Load balancing features](https://cloud.google.com/load-balancing/docs/features#protocols_from_the_load_balancer_to_the_backends).
     * 
     */
    @Import(name="ipProtocol")
      private final @Nullable Output<ForwardingRuleIpProtocol> ipProtocol;

    public Output<ForwardingRuleIpProtocol> getIpProtocol() {
        return this.ipProtocol == null ? Codegen.empty() : this.ipProtocol;
    }

    /**
     * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule.
     * 
     */
    @Import(name="ipVersion")
      private final @Nullable Output<ForwardingRuleIpVersion> ipVersion;

    public Output<ForwardingRuleIpVersion> getIpVersion() {
        return this.ipVersion == null ? Codegen.empty() : this.ipVersion;
    }

    /**
     * Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
     * 
     */
    @Import(name="isMirroringCollector")
      private final @Nullable Output<Boolean> isMirroringCollector;

    public Output<Boolean> getIsMirroringCollector() {
        return this.isMirroringCollector == null ? Codegen.empty() : this.isMirroringCollector;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Specifies the forwarding rule type. For more information about forwarding rules, refer to Forwarding rule concepts.
     * 
     */
    @Import(name="loadBalancingScheme")
      private final @Nullable Output<ForwardingRuleLoadBalancingScheme> loadBalancingScheme;

    public Output<ForwardingRuleLoadBalancingScheme> getLoadBalancingScheme() {
        return this.loadBalancingScheme == null ? Codegen.empty() : this.loadBalancingScheme;
    }

    /**
     * Opaque filter criteria used by load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to load balancer, xDS clients present node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the ForwardingRule are not visible to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here will be applifed before those specified in the UrlMap that this ForwardingRule references. metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="metadataFilters")
      private final @Nullable Output<List<MetadataFilterArgs>> metadataFilters;

    public Output<List<MetadataFilterArgs>> getMetadataFilters() {
        return this.metadataFilters == null ? Codegen.empty() : this.metadataFilters;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. For Private Service Connect forwarding rules that forward traffic to Google APIs, the forwarding rule name must be a 1-20 characters string with lowercase letters and numbers and must start with a letter.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * This field is not used for external load balancing. For Internal TCP/UDP Load Balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is not specified, the default network will be used. For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must be provided.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
     * 
     */
    @Import(name="networkTier")
      private final @Nullable Output<ForwardingRuleNetworkTier> networkTier;

    public Output<ForwardingRuleNetworkTier> getNetworkTier() {
        return this.networkTier == null ? Codegen.empty() : this.networkTier;
    }

    /**
     * This field can be used only if: - Load balancing scheme is one of EXTERNAL, INTERNAL_SELF_MANAGED or INTERNAL_MANAGED - IPProtocol is one of TCP, UDP, or SCTP. Packets addressed to ports in the specified range will be forwarded to target or backend_service. You can only use one of ports, port_range, or allPorts. The three are mutually exclusive. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. Some types of forwarding target have constraints on the acceptable ports. For more information, see [Port specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications). @pattern: \\d+(?:-\\d+)?
     * 
     */
    @Import(name="portRange")
      private final @Nullable Output<String> portRange;

    public Output<String> getPortRange() {
        return this.portRange == null ? Codegen.empty() : this.portRange;
    }

    /**
     * The ports field is only supported when the forwarding rule references a backend_service directly. Only packets addressed to the [specified list of ports](<(https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications)>) are forwarded to backends. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. You can specify a list of up to five ports, which can be non-contiguous. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. @pattern: \\d+(?:-\\d+)?
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<String>> ports;

    public Output<List<String>> getPorts() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="pscConnectionStatus")
      private final @Nullable Output<ForwardingRulePscConnectionStatus> pscConnectionStatus;

    public Output<ForwardingRulePscConnectionStatus> getPscConnectionStatus() {
        return this.pscConnectionStatus == null ? Codegen.empty() : this.pscConnectionStatus;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Service Directory resources to register this forwarding rule with. Currently, only supports a single Service Directory resource.
     * 
     */
    @Import(name="serviceDirectoryRegistrations")
      private final @Nullable Output<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations;

    public Output<List<ForwardingRuleServiceDirectoryRegistrationArgs>> getServiceDirectoryRegistrations() {
        return this.serviceDirectoryRegistrations == null ? Codegen.empty() : this.serviceDirectoryRegistrations;
    }

    /**
     * An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name. The label must be 1-63 characters long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. This field is only used for internal load balancing.
     * 
     */
    @Import(name="serviceLabel")
      private final @Nullable Output<String> serviceLabel;

    public Output<String> getServiceLabel() {
        return this.serviceLabel == null ? Codegen.empty() : this.serviceLabel;
    }

    /**
     * This field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule, used in internal load balancing and network load balancing with IPv6. If the network specified is in auto subnet mode, this field is optional. However, a subnetwork must be specified if the network is in custom subnet mode or when creating external forwarding rule with IPv6.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    public ForwardingRuleArgs(
        @Nullable Output<Boolean> allPorts,
        @Nullable Output<Boolean> allowGlobalAccess,
        @Nullable Output<String> backendService,
        @Nullable Output<String> description,
        @Nullable Output<String> ipAddress,
        @Nullable Output<ForwardingRuleIpProtocol> ipProtocol,
        @Nullable Output<ForwardingRuleIpVersion> ipVersion,
        @Nullable Output<Boolean> isMirroringCollector,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<ForwardingRuleLoadBalancingScheme> loadBalancingScheme,
        @Nullable Output<List<MetadataFilterArgs>> metadataFilters,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<ForwardingRuleNetworkTier> networkTier,
        @Nullable Output<String> portRange,
        @Nullable Output<List<String>> ports,
        @Nullable Output<String> project,
        @Nullable Output<ForwardingRulePscConnectionStatus> pscConnectionStatus,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations,
        @Nullable Output<String> serviceLabel,
        @Nullable Output<String> subnetwork,
        @Nullable Output<String> target) {
        this.allPorts = allPorts;
        this.allowGlobalAccess = allowGlobalAccess;
        this.backendService = backendService;
        this.description = description;
        this.ipAddress = ipAddress;
        this.ipProtocol = ipProtocol;
        this.ipVersion = ipVersion;
        this.isMirroringCollector = isMirroringCollector;
        this.labels = labels;
        this.loadBalancingScheme = loadBalancingScheme;
        this.metadataFilters = metadataFilters;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.portRange = portRange;
        this.ports = ports;
        this.project = project;
        this.pscConnectionStatus = pscConnectionStatus;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
        this.serviceLabel = serviceLabel;
        this.subnetwork = subnetwork;
        this.target = target;
    }

    private ForwardingRuleArgs() {
        this.allPorts = Codegen.empty();
        this.allowGlobalAccess = Codegen.empty();
        this.backendService = Codegen.empty();
        this.description = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.ipProtocol = Codegen.empty();
        this.ipVersion = Codegen.empty();
        this.isMirroringCollector = Codegen.empty();
        this.labels = Codegen.empty();
        this.loadBalancingScheme = Codegen.empty();
        this.metadataFilters = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.networkTier = Codegen.empty();
        this.portRange = Codegen.empty();
        this.ports = Codegen.empty();
        this.project = Codegen.empty();
        this.pscConnectionStatus = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serviceDirectoryRegistrations = Codegen.empty();
        this.serviceLabel = Codegen.empty();
        this.subnetwork = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allPorts;
        private @Nullable Output<Boolean> allowGlobalAccess;
        private @Nullable Output<String> backendService;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<ForwardingRuleIpProtocol> ipProtocol;
        private @Nullable Output<ForwardingRuleIpVersion> ipVersion;
        private @Nullable Output<Boolean> isMirroringCollector;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<ForwardingRuleLoadBalancingScheme> loadBalancingScheme;
        private @Nullable Output<List<MetadataFilterArgs>> metadataFilters;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<ForwardingRuleNetworkTier> networkTier;
        private @Nullable Output<String> portRange;
        private @Nullable Output<List<String>> ports;
        private @Nullable Output<String> project;
        private @Nullable Output<ForwardingRulePscConnectionStatus> pscConnectionStatus;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations;
        private @Nullable Output<String> serviceLabel;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allPorts = defaults.allPorts;
    	      this.allowGlobalAccess = defaults.allowGlobalAccess;
    	      this.backendService = defaults.backendService;
    	      this.description = defaults.description;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipVersion = defaults.ipVersion;
    	      this.isMirroringCollector = defaults.isMirroringCollector;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.portRange = defaults.portRange;
    	      this.ports = defaults.ports;
    	      this.project = defaults.project;
    	      this.pscConnectionStatus = defaults.pscConnectionStatus;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.serviceDirectoryRegistrations = defaults.serviceDirectoryRegistrations;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.subnetwork = defaults.subnetwork;
    	      this.target = defaults.target;
        }

        public Builder allPorts(@Nullable Output<Boolean> allPorts) {
            this.allPorts = allPorts;
            return this;
        }
        public Builder allPorts(@Nullable Boolean allPorts) {
            this.allPorts = Codegen.ofNullable(allPorts);
            return this;
        }
        public Builder allowGlobalAccess(@Nullable Output<Boolean> allowGlobalAccess) {
            this.allowGlobalAccess = allowGlobalAccess;
            return this;
        }
        public Builder allowGlobalAccess(@Nullable Boolean allowGlobalAccess) {
            this.allowGlobalAccess = Codegen.ofNullable(allowGlobalAccess);
            return this;
        }
        public Builder backendService(@Nullable Output<String> backendService) {
            this.backendService = backendService;
            return this;
        }
        public Builder backendService(@Nullable String backendService) {
            this.backendService = Codegen.ofNullable(backendService);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder ipProtocol(@Nullable Output<ForwardingRuleIpProtocol> ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public Builder ipProtocol(@Nullable ForwardingRuleIpProtocol ipProtocol) {
            this.ipProtocol = Codegen.ofNullable(ipProtocol);
            return this;
        }
        public Builder ipVersion(@Nullable Output<ForwardingRuleIpVersion> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Builder ipVersion(@Nullable ForwardingRuleIpVersion ipVersion) {
            this.ipVersion = Codegen.ofNullable(ipVersion);
            return this;
        }
        public Builder isMirroringCollector(@Nullable Output<Boolean> isMirroringCollector) {
            this.isMirroringCollector = isMirroringCollector;
            return this;
        }
        public Builder isMirroringCollector(@Nullable Boolean isMirroringCollector) {
            this.isMirroringCollector = Codegen.ofNullable(isMirroringCollector);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder loadBalancingScheme(@Nullable Output<ForwardingRuleLoadBalancingScheme> loadBalancingScheme) {
            this.loadBalancingScheme = loadBalancingScheme;
            return this;
        }
        public Builder loadBalancingScheme(@Nullable ForwardingRuleLoadBalancingScheme loadBalancingScheme) {
            this.loadBalancingScheme = Codegen.ofNullable(loadBalancingScheme);
            return this;
        }
        public Builder metadataFilters(@Nullable Output<List<MetadataFilterArgs>> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }
        public Builder metadataFilters(@Nullable List<MetadataFilterArgs> metadataFilters) {
            this.metadataFilters = Codegen.ofNullable(metadataFilters);
            return this;
        }
        public Builder metadataFilters(MetadataFilterArgs... metadataFilters) {
            return metadataFilters(List.of(metadataFilters));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder networkTier(@Nullable Output<ForwardingRuleNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }
        public Builder networkTier(@Nullable ForwardingRuleNetworkTier networkTier) {
            this.networkTier = Codegen.ofNullable(networkTier);
            return this;
        }
        public Builder portRange(@Nullable Output<String> portRange) {
            this.portRange = portRange;
            return this;
        }
        public Builder portRange(@Nullable String portRange) {
            this.portRange = Codegen.ofNullable(portRange);
            return this;
        }
        public Builder ports(@Nullable Output<List<String>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<String> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder pscConnectionStatus(@Nullable Output<ForwardingRulePscConnectionStatus> pscConnectionStatus) {
            this.pscConnectionStatus = pscConnectionStatus;
            return this;
        }
        public Builder pscConnectionStatus(@Nullable ForwardingRulePscConnectionStatus pscConnectionStatus) {
            this.pscConnectionStatus = Codegen.ofNullable(pscConnectionStatus);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serviceDirectoryRegistrations(@Nullable Output<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations) {
            this.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
            return this;
        }
        public Builder serviceDirectoryRegistrations(@Nullable List<ForwardingRuleServiceDirectoryRegistrationArgs> serviceDirectoryRegistrations) {
            this.serviceDirectoryRegistrations = Codegen.ofNullable(serviceDirectoryRegistrations);
            return this;
        }
        public Builder serviceDirectoryRegistrations(ForwardingRuleServiceDirectoryRegistrationArgs... serviceDirectoryRegistrations) {
            return serviceDirectoryRegistrations(List.of(serviceDirectoryRegistrations));
        }
        public Builder serviceLabel(@Nullable Output<String> serviceLabel) {
            this.serviceLabel = serviceLabel;
            return this;
        }
        public Builder serviceLabel(@Nullable String serviceLabel) {
            this.serviceLabel = Codegen.ofNullable(serviceLabel);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }        public ForwardingRuleArgs build() {
            return new ForwardingRuleArgs(allPorts, allowGlobalAccess, backendService, description, ipAddress, ipProtocol, ipVersion, isMirroringCollector, labels, loadBalancingScheme, metadataFilters, name, network, networkTier, portRange, ports, project, pscConnectionStatus, region, requestId, serviceDirectoryRegistrations, serviceLabel, subnetwork, target);
        }
    }
}
