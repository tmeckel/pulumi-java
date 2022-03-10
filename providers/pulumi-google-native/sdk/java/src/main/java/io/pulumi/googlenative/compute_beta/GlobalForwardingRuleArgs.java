// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.GlobalForwardingRuleIpProtocol;
import io.pulumi.googlenative.compute_beta.enums.GlobalForwardingRuleIpVersion;
import io.pulumi.googlenative.compute_beta.enums.GlobalForwardingRuleLoadBalancingScheme;
import io.pulumi.googlenative.compute_beta.enums.GlobalForwardingRuleNetworkTier;
import io.pulumi.googlenative.compute_beta.enums.GlobalForwardingRulePscConnectionStatus;
import io.pulumi.googlenative.compute_beta.inputs.ForwardingRuleServiceDirectoryRegistrationArgs;
import io.pulumi.googlenative.compute_beta.inputs.MetadataFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalForwardingRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalForwardingRuleArgs Empty = new GlobalForwardingRuleArgs();

    /**
     * This field is used along with the backend_service field for Internal TCP/UDP Load Balancing or Network Load Balancing, or with the target field for internal and external TargetInstance. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. For TCP, UDP and SCTP traffic, packets addressed to any ports will be forwarded to the target or backendService.
     * 
     */
    @InputImport(name="allPorts")
      private final @Nullable Input<Boolean> allPorts;

    public Input<Boolean> getAllPorts() {
        return this.allPorts == null ? Input.empty() : this.allPorts;
    }

    /**
     * This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
     * 
     */
    @InputImport(name="allowGlobalAccess")
      private final @Nullable Input<Boolean> allowGlobalAccess;

    public Input<Boolean> getAllowGlobalAccess() {
        return this.allowGlobalAccess == null ? Input.empty() : this.allowGlobalAccess;
    }

    /**
     * Identifies the backend service to which the forwarding rule sends traffic. Required for Internal TCP/UDP Load Balancing and Network Load Balancing; must be omitted for all other load balancer types.
     * 
     */
    @InputImport(name="backendService")
      private final @Nullable Input<String> backendService;

    public Input<String> getBackendService() {
        return this.backendService == null ? Input.empty() : this.backendService;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * IP address that this forwarding rule serves. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the target that you specify in the forwarding rule. If you don't specify a reserved IP address, an ephemeral IP address is assigned. Methods for specifying an IP address: * IPv4 dotted decimal, as in `100.1.2.3` * Full URL, as in https://www.googleapis.com/compute/v1/projects/project_id/regions/region /addresses/address-name * Partial URL or by name, as in: - projects/project_id/regions/region/addresses/address-name - regions/region/addresses/address-name - global/addresses/address-name - address-name The loadBalancingScheme and the forwarding rule's target determine the type of IP address that you can use. For detailed information, see [IP address specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications). Must be set to `0.0.0.0` when the target is targetGrpcProxy that has validateForProxyless field set to true. For Private Service Connect forwarding rules that forward traffic to Google APIs, IP address must be provided.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for different load balancing products as described in [Load balancing features](https://cloud.google.com/load-balancing/docs/features#protocols_from_the_load_balancer_to_the_backends).
     * 
     */
    @InputImport(name="ipProtocol")
      private final @Nullable Input<GlobalForwardingRuleIpProtocol> ipProtocol;

    public Input<GlobalForwardingRuleIpProtocol> getIpProtocol() {
        return this.ipProtocol == null ? Input.empty() : this.ipProtocol;
    }

    /**
     * The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule.
     * 
     */
    @InputImport(name="ipVersion")
      private final @Nullable Input<GlobalForwardingRuleIpVersion> ipVersion;

    public Input<GlobalForwardingRuleIpVersion> getIpVersion() {
        return this.ipVersion == null ? Input.empty() : this.ipVersion;
    }

    /**
     * Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
     * 
     */
    @InputImport(name="isMirroringCollector")
      private final @Nullable Input<Boolean> isMirroringCollector;

    public Input<Boolean> getIsMirroringCollector() {
        return this.isMirroringCollector == null ? Input.empty() : this.isMirroringCollector;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Specifies the forwarding rule type. For more information about forwarding rules, refer to Forwarding rule concepts.
     * 
     */
    @InputImport(name="loadBalancingScheme")
      private final @Nullable Input<GlobalForwardingRuleLoadBalancingScheme> loadBalancingScheme;

    public Input<GlobalForwardingRuleLoadBalancingScheme> getLoadBalancingScheme() {
        return this.loadBalancingScheme == null ? Input.empty() : this.loadBalancingScheme;
    }

    /**
     * Opaque filter criteria used by load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to load balancer, xDS clients present node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the ForwardingRule are not visible to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here will be applifed before those specified in the UrlMap that this ForwardingRule references. metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="metadataFilters")
      private final @Nullable Input<List<MetadataFilterArgs>> metadataFilters;

    public Input<List<MetadataFilterArgs>> getMetadataFilters() {
        return this.metadataFilters == null ? Input.empty() : this.metadataFilters;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. For Private Service Connect forwarding rules that forward traffic to Google APIs, the forwarding rule name must be a 1-20 characters string with lowercase letters and numbers and must start with a letter.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * This field is not used for external load balancing. For Internal TCP/UDP Load Balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is not specified, the default network will be used. For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must be provided.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
     * 
     */
    @InputImport(name="networkTier")
      private final @Nullable Input<GlobalForwardingRuleNetworkTier> networkTier;

    public Input<GlobalForwardingRuleNetworkTier> getNetworkTier() {
        return this.networkTier == null ? Input.empty() : this.networkTier;
    }

    /**
     * This field can be used only if: - Load balancing scheme is one of EXTERNAL, INTERNAL_SELF_MANAGED or INTERNAL_MANAGED - IPProtocol is one of TCP, UDP, or SCTP. Packets addressed to ports in the specified range will be forwarded to target or backend_service. You can only use one of ports, port_range, or allPorts. The three are mutually exclusive. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. Some types of forwarding target have constraints on the acceptable ports. For more information, see [Port specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications). @pattern: \\d+(?:-\\d+)?
     * 
     */
    @InputImport(name="portRange")
      private final @Nullable Input<String> portRange;

    public Input<String> getPortRange() {
        return this.portRange == null ? Input.empty() : this.portRange;
    }

    /**
     * The ports field is only supported when the forwarding rule references a backend_service directly. Only packets addressed to the [specified list of ports](<(https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications)>) are forwarded to backends. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. You can specify a list of up to five ports, which can be non-contiguous. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. @pattern: \\d+(?:-\\d+)?
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Input<List<String>> ports;

    public Input<List<String>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="pscConnectionStatus")
      private final @Nullable Input<GlobalForwardingRulePscConnectionStatus> pscConnectionStatus;

    public Input<GlobalForwardingRulePscConnectionStatus> getPscConnectionStatus() {
        return this.pscConnectionStatus == null ? Input.empty() : this.pscConnectionStatus;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Service Directory resources to register this forwarding rule with. Currently, only supports a single Service Directory resource.
     * 
     */
    @InputImport(name="serviceDirectoryRegistrations")
      private final @Nullable Input<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations;

    public Input<List<ForwardingRuleServiceDirectoryRegistrationArgs>> getServiceDirectoryRegistrations() {
        return this.serviceDirectoryRegistrations == null ? Input.empty() : this.serviceDirectoryRegistrations;
    }

    /**
     * An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name. The label must be 1-63 characters long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. This field is only used for internal load balancing.
     * 
     */
    @InputImport(name="serviceLabel")
      private final @Nullable Input<String> serviceLabel;

    public Input<String> getServiceLabel() {
        return this.serviceLabel == null ? Input.empty() : this.serviceLabel;
    }

    /**
     * If not empty, this Forwarding Rule will only forward the traffic when the source IP address matches one of the IP addresses or CIDR ranges set here. Note that a Forwarding Rule can only have up to 64 source IP ranges, and this field can only be used with a regional Forwarding Rule whose scheme is EXTERNAL. Each source_ip_range entry should be either an IP address (for example, 1.2.3.4) or a CIDR range (for example, 1.2.3.0/24).
     * 
     */
    @InputImport(name="sourceIpRanges")
      private final @Nullable Input<List<String>> sourceIpRanges;

    public Input<List<String>> getSourceIpRanges() {
        return this.sourceIpRanges == null ? Input.empty() : this.sourceIpRanges;
    }

    /**
     * This field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule, used in internal load balancing and network load balancing with IPv6. If the network specified is in auto subnet mode, this field is optional. However, a subnetwork must be specified if the network is in custom subnet mode or when creating external forwarding rule with IPv6.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    public GlobalForwardingRuleArgs(
        @Nullable Input<Boolean> allPorts,
        @Nullable Input<Boolean> allowGlobalAccess,
        @Nullable Input<String> backendService,
        @Nullable Input<String> description,
        @Nullable Input<String> ipAddress,
        @Nullable Input<GlobalForwardingRuleIpProtocol> ipProtocol,
        @Nullable Input<GlobalForwardingRuleIpVersion> ipVersion,
        @Nullable Input<Boolean> isMirroringCollector,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<GlobalForwardingRuleLoadBalancingScheme> loadBalancingScheme,
        @Nullable Input<List<MetadataFilterArgs>> metadataFilters,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<GlobalForwardingRuleNetworkTier> networkTier,
        @Nullable Input<String> portRange,
        @Nullable Input<List<String>> ports,
        @Nullable Input<String> project,
        @Nullable Input<GlobalForwardingRulePscConnectionStatus> pscConnectionStatus,
        @Nullable Input<String> requestId,
        @Nullable Input<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations,
        @Nullable Input<String> serviceLabel,
        @Nullable Input<List<String>> sourceIpRanges,
        @Nullable Input<String> subnetwork,
        @Nullable Input<String> target) {
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
        this.requestId = requestId;
        this.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
        this.serviceLabel = serviceLabel;
        this.sourceIpRanges = sourceIpRanges;
        this.subnetwork = subnetwork;
        this.target = target;
    }

    private GlobalForwardingRuleArgs() {
        this.allPorts = Input.empty();
        this.allowGlobalAccess = Input.empty();
        this.backendService = Input.empty();
        this.description = Input.empty();
        this.ipAddress = Input.empty();
        this.ipProtocol = Input.empty();
        this.ipVersion = Input.empty();
        this.isMirroringCollector = Input.empty();
        this.labels = Input.empty();
        this.loadBalancingScheme = Input.empty();
        this.metadataFilters = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.networkTier = Input.empty();
        this.portRange = Input.empty();
        this.ports = Input.empty();
        this.project = Input.empty();
        this.pscConnectionStatus = Input.empty();
        this.requestId = Input.empty();
        this.serviceDirectoryRegistrations = Input.empty();
        this.serviceLabel = Input.empty();
        this.sourceIpRanges = Input.empty();
        this.subnetwork = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalForwardingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allPorts;
        private @Nullable Input<Boolean> allowGlobalAccess;
        private @Nullable Input<String> backendService;
        private @Nullable Input<String> description;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<GlobalForwardingRuleIpProtocol> ipProtocol;
        private @Nullable Input<GlobalForwardingRuleIpVersion> ipVersion;
        private @Nullable Input<Boolean> isMirroringCollector;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<GlobalForwardingRuleLoadBalancingScheme> loadBalancingScheme;
        private @Nullable Input<List<MetadataFilterArgs>> metadataFilters;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<GlobalForwardingRuleNetworkTier> networkTier;
        private @Nullable Input<String> portRange;
        private @Nullable Input<List<String>> ports;
        private @Nullable Input<String> project;
        private @Nullable Input<GlobalForwardingRulePscConnectionStatus> pscConnectionStatus;
        private @Nullable Input<String> requestId;
        private @Nullable Input<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations;
        private @Nullable Input<String> serviceLabel;
        private @Nullable Input<List<String>> sourceIpRanges;
        private @Nullable Input<String> subnetwork;
        private @Nullable Input<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalForwardingRuleArgs defaults) {
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
    	      this.requestId = defaults.requestId;
    	      this.serviceDirectoryRegistrations = defaults.serviceDirectoryRegistrations;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.sourceIpRanges = defaults.sourceIpRanges;
    	      this.subnetwork = defaults.subnetwork;
    	      this.target = defaults.target;
        }

        public Builder allPorts(@Nullable Input<Boolean> allPorts) {
            this.allPorts = allPorts;
            return this;
        }

        public Builder allPorts(@Nullable Boolean allPorts) {
            this.allPorts = Input.ofNullable(allPorts);
            return this;
        }

        public Builder allowGlobalAccess(@Nullable Input<Boolean> allowGlobalAccess) {
            this.allowGlobalAccess = allowGlobalAccess;
            return this;
        }

        public Builder allowGlobalAccess(@Nullable Boolean allowGlobalAccess) {
            this.allowGlobalAccess = Input.ofNullable(allowGlobalAccess);
            return this;
        }

        public Builder backendService(@Nullable Input<String> backendService) {
            this.backendService = backendService;
            return this;
        }

        public Builder backendService(@Nullable String backendService) {
            this.backendService = Input.ofNullable(backendService);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder ipAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder ipProtocol(@Nullable Input<GlobalForwardingRuleIpProtocol> ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        public Builder ipProtocol(@Nullable GlobalForwardingRuleIpProtocol ipProtocol) {
            this.ipProtocol = Input.ofNullable(ipProtocol);
            return this;
        }

        public Builder ipVersion(@Nullable Input<GlobalForwardingRuleIpVersion> ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }

        public Builder ipVersion(@Nullable GlobalForwardingRuleIpVersion ipVersion) {
            this.ipVersion = Input.ofNullable(ipVersion);
            return this;
        }

        public Builder isMirroringCollector(@Nullable Input<Boolean> isMirroringCollector) {
            this.isMirroringCollector = isMirroringCollector;
            return this;
        }

        public Builder isMirroringCollector(@Nullable Boolean isMirroringCollector) {
            this.isMirroringCollector = Input.ofNullable(isMirroringCollector);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder loadBalancingScheme(@Nullable Input<GlobalForwardingRuleLoadBalancingScheme> loadBalancingScheme) {
            this.loadBalancingScheme = loadBalancingScheme;
            return this;
        }

        public Builder loadBalancingScheme(@Nullable GlobalForwardingRuleLoadBalancingScheme loadBalancingScheme) {
            this.loadBalancingScheme = Input.ofNullable(loadBalancingScheme);
            return this;
        }

        public Builder metadataFilters(@Nullable Input<List<MetadataFilterArgs>> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }

        public Builder metadataFilters(@Nullable List<MetadataFilterArgs> metadataFilters) {
            this.metadataFilters = Input.ofNullable(metadataFilters);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder network(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder networkTier(@Nullable Input<GlobalForwardingRuleNetworkTier> networkTier) {
            this.networkTier = networkTier;
            return this;
        }

        public Builder networkTier(@Nullable GlobalForwardingRuleNetworkTier networkTier) {
            this.networkTier = Input.ofNullable(networkTier);
            return this;
        }

        public Builder portRange(@Nullable Input<String> portRange) {
            this.portRange = portRange;
            return this;
        }

        public Builder portRange(@Nullable String portRange) {
            this.portRange = Input.ofNullable(portRange);
            return this;
        }

        public Builder ports(@Nullable Input<List<String>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<String> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder pscConnectionStatus(@Nullable Input<GlobalForwardingRulePscConnectionStatus> pscConnectionStatus) {
            this.pscConnectionStatus = pscConnectionStatus;
            return this;
        }

        public Builder pscConnectionStatus(@Nullable GlobalForwardingRulePscConnectionStatus pscConnectionStatus) {
            this.pscConnectionStatus = Input.ofNullable(pscConnectionStatus);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder serviceDirectoryRegistrations(@Nullable Input<List<ForwardingRuleServiceDirectoryRegistrationArgs>> serviceDirectoryRegistrations) {
            this.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
            return this;
        }

        public Builder serviceDirectoryRegistrations(@Nullable List<ForwardingRuleServiceDirectoryRegistrationArgs> serviceDirectoryRegistrations) {
            this.serviceDirectoryRegistrations = Input.ofNullable(serviceDirectoryRegistrations);
            return this;
        }

        public Builder serviceLabel(@Nullable Input<String> serviceLabel) {
            this.serviceLabel = serviceLabel;
            return this;
        }

        public Builder serviceLabel(@Nullable String serviceLabel) {
            this.serviceLabel = Input.ofNullable(serviceLabel);
            return this;
        }

        public Builder sourceIpRanges(@Nullable Input<List<String>> sourceIpRanges) {
            this.sourceIpRanges = sourceIpRanges;
            return this;
        }

        public Builder sourceIpRanges(@Nullable List<String> sourceIpRanges) {
            this.sourceIpRanges = Input.ofNullable(sourceIpRanges);
            return this;
        }

        public Builder subnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }

        public Builder target(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }
        public GlobalForwardingRuleArgs build() {
            return new GlobalForwardingRuleArgs(allPorts, allowGlobalAccess, backendService, description, ipAddress, ipProtocol, ipVersion, isMirroringCollector, labels, loadBalancingScheme, metadataFilters, name, network, networkTier, portRange, ports, project, pscConnectionStatus, requestId, serviceDirectoryRegistrations, serviceLabel, sourceIpRanges, subnetwork, target);
        }
    }
}
