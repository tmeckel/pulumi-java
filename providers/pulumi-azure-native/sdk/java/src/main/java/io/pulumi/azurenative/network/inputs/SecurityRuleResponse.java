// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationSecurityGroupResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network security rule.
 * 
 */
public final class SecurityRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityRuleResponse Empty = new SecurityRuleResponse();

    /**
     * The network traffic is allowed or denied.
     * 
     */
    @InputImport(name="access", required=true)
      private final String access;

    public String getAccess() {
        return this.access;
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
     */
    @InputImport(name="destinationAddressPrefix")
      private final @Nullable String destinationAddressPrefix;

    public Optional<String> getDestinationAddressPrefix() {
        return this.destinationAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.destinationAddressPrefix);
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @InputImport(name="destinationAddressPrefixes")
      private final @Nullable List<String> destinationAddressPrefixes;

    public List<String> getDestinationAddressPrefixes() {
        return this.destinationAddressPrefixes == null ? List.of() : this.destinationAddressPrefixes;
    }

    /**
     * The application security group specified as destination.
     * 
     */
    @InputImport(name="destinationApplicationSecurityGroups")
      private final @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups;

    public List<ApplicationSecurityGroupResponse> getDestinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups == null ? List.of() : this.destinationApplicationSecurityGroups;
    }

    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @InputImport(name="destinationPortRange")
      private final @Nullable String destinationPortRange;

    public Optional<String> getDestinationPortRange() {
        return this.destinationPortRange == null ? Optional.empty() : Optional.ofNullable(this.destinationPortRange);
    }

    /**
     * The destination port ranges.
     * 
     */
    @InputImport(name="destinationPortRanges")
      private final @Nullable List<String> destinationPortRanges;

    public List<String> getDestinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }

    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @InputImport(name="direction", required=true)
      private final String direction;

    public String getDirection() {
        return this.direction;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the security rule resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    @InputImport(name="sourceAddressPrefix")
      private final @Nullable String sourceAddressPrefix;

    public Optional<String> getSourceAddressPrefix() {
        return this.sourceAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.sourceAddressPrefix);
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @InputImport(name="sourceAddressPrefixes")
      private final @Nullable List<String> sourceAddressPrefixes;

    public List<String> getSourceAddressPrefixes() {
        return this.sourceAddressPrefixes == null ? List.of() : this.sourceAddressPrefixes;
    }

    /**
     * The application security group specified as source.
     * 
     */
    @InputImport(name="sourceApplicationSecurityGroups")
      private final @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups;

    public List<ApplicationSecurityGroupResponse> getSourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups == null ? List.of() : this.sourceApplicationSecurityGroups;
    }

    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @InputImport(name="sourcePortRange")
      private final @Nullable String sourcePortRange;

    public Optional<String> getSourcePortRange() {
        return this.sourcePortRange == null ? Optional.empty() : Optional.ofNullable(this.sourcePortRange);
    }

    /**
     * The source port ranges.
     * 
     */
    @InputImport(name="sourcePortRanges")
      private final @Nullable List<String> sourcePortRanges;

    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    /**
     * The type of the resource.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public SecurityRuleResponse(
        String access,
        @Nullable String description,
        @Nullable String destinationAddressPrefix,
        @Nullable List<String> destinationAddressPrefixes,
        @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups,
        @Nullable String destinationPortRange,
        @Nullable List<String> destinationPortRanges,
        String direction,
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Integer priority,
        String protocol,
        String provisioningState,
        @Nullable String sourceAddressPrefix,
        @Nullable List<String> sourceAddressPrefixes,
        @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups,
        @Nullable String sourcePortRange,
        @Nullable List<String> sourcePortRanges,
        @Nullable String type) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
        this.type = type;
    }

    private SecurityRuleResponse() {
        this.access = null;
        this.description = null;
        this.destinationAddressPrefix = null;
        this.destinationAddressPrefixes = List.of();
        this.destinationApplicationSecurityGroups = List.of();
        this.destinationPortRange = null;
        this.destinationPortRanges = List.of();
        this.direction = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.priority = null;
        this.protocol = null;
        this.provisioningState = null;
        this.sourceAddressPrefix = null;
        this.sourceAddressPrefixes = List.of();
        this.sourceApplicationSecurityGroups = List.of();
        this.sourcePortRange = null;
        this.sourcePortRanges = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String description;
        private @Nullable String destinationAddressPrefix;
        private @Nullable List<String> destinationAddressPrefixes;
        private @Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups;
        private @Nullable String destinationPortRange;
        private @Nullable List<String> destinationPortRanges;
        private String direction;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Integer priority;
        private String protocol;
        private String provisioningState;
        private @Nullable String sourceAddressPrefix;
        private @Nullable List<String> sourceAddressPrefixes;
        private @Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups;
        private @Nullable String sourcePortRange;
        private @Nullable List<String> sourcePortRanges;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroups = defaults.destinationApplicationSecurityGroups;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroups = defaults.sourceApplicationSecurityGroups;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.type = defaults.type;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder destinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        public Builder destinationAddressPrefixes(@Nullable List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }

        public Builder destinationApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
            return this;
        }

        public Builder destinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder destinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }

        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder sourceAddressPrefixes(@Nullable List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }

        public Builder sourceApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupResponse> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
            return this;
        }

        public Builder sourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder sourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public SecurityRuleResponse build() {
            return new SecurityRuleResponse(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroups, destinationPortRange, destinationPortRanges, direction, etag, id, name, priority, protocol, provisioningState, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroups, sourcePortRange, sourcePortRanges, type);
        }
    }
}
