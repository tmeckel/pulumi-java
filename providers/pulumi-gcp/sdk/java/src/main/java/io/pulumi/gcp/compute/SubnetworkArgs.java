// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SubnetworkLogConfigArgs;
import io.pulumi.gcp.compute.inputs.SubnetworkSecondaryIpRangeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkArgs Empty = new SubnetworkArgs();

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource. This field can be set only at resource
     * creation time.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The range of IP addresses belonging to this subnetwork secondary
     * range. Provide this property when you create the subnetwork.
     * Ranges must be unique and non-overlapping with all primary and
     * secondary IP ranges within a network. Only IPv4 is supported.
     * 
     */
    @InputImport(name="ipCidrRange", required=true)
      private final Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation
     * or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet
     * cannot enable direct path.
     * Possible values are `EXTERNAL`.
     * 
     */
    @InputImport(name="ipv6AccessType")
      private final @Nullable Input<String> ipv6AccessType;

    public Input<String> getIpv6AccessType() {
        return this.ipv6AccessType == null ? Input.empty() : this.ipv6AccessType;
    }

    /**
     * Denotes the logging options for the subnetwork flow logs. If logging is enabled
     * logs will be exported to Stackdriver. This field cannot be set if the `purpose` of this
     * subnetwork is `INTERNAL_HTTPS_LOAD_BALANCER`
     * Structure is documented below.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<SubnetworkLogConfigArgs> logConfig;

    public Input<SubnetworkLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * The name of the resource, provided by the client when initially
     * creating the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?` which
     * means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network this subnet belongs to.
     * Only networks that are in the distributed mode can have subnetworks.
     * 
     */
    @InputImport(name="network", required=true)
      private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    /**
     * When enabled, VMs in this subnetwork without external IP addresses can
     * access Google APIs and services by using Private Google Access.
     * 
     */
    @InputImport(name="privateIpGoogleAccess")
      private final @Nullable Input<Boolean> privateIpGoogleAccess;

    public Input<Boolean> getPrivateIpGoogleAccess() {
        return this.privateIpGoogleAccess == null ? Input.empty() : this.privateIpGoogleAccess;
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet.
     * 
     */
    @InputImport(name="privateIpv6GoogleAccess")
      private final @Nullable Input<String> privateIpv6GoogleAccess;

    public Input<String> getPrivateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Input.empty() : this.privateIpv6GoogleAccess;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The purpose of the resource. A subnetwork with purpose set to
     * INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is
     * reserved for Internal HTTP(S) Load Balancing.
     * If set to INTERNAL_HTTPS_LOAD_BALANCER you must also set the `role` field.
     * 
     */
    @InputImport(name="purpose")
      private final @Nullable Input<String> purpose;

    public Input<String> getPurpose() {
        return this.purpose == null ? Input.empty() : this.purpose;
    }

    /**
     * The GCP region for this subnetwork.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role of subnetwork. Currently, this field is only used when
     * purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE
     * or BACKUP. An ACTIVE subnetwork is one that is currently being used
     * for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that
     * is ready to be promoted to ACTIVE or is currently draining.
     * Possible values are `ACTIVE` and `BACKUP`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances
     * contained in this subnetwork. The primary IP of such VM must belong
     * to the primary ipCidrRange of the subnetwork. The alias IPs may belong
     * to either primary or secondary ranges.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secondaryIpRanges")
      private final @Nullable Input<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges;

    public Input<List<SubnetworkSecondaryIpRangeArgs>> getSecondaryIpRanges() {
        return this.secondaryIpRanges == null ? Input.empty() : this.secondaryIpRanges;
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not.
     * If not specified IPV4_ONLY will be used.
     * Possible values are `IPV4_ONLY` and `IPV4_IPV6`.
     * 
     */
    @InputImport(name="stackType")
      private final @Nullable Input<String> stackType;

    public Input<String> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    public SubnetworkArgs(
        @Nullable Input<String> description,
        Input<String> ipCidrRange,
        @Nullable Input<String> ipv6AccessType,
        @Nullable Input<SubnetworkLogConfigArgs> logConfig,
        @Nullable Input<String> name,
        Input<String> network,
        @Nullable Input<Boolean> privateIpGoogleAccess,
        @Nullable Input<String> privateIpv6GoogleAccess,
        @Nullable Input<String> project,
        @Nullable Input<String> purpose,
        @Nullable Input<String> region,
        @Nullable Input<String> role,
        @Nullable Input<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges,
        @Nullable Input<String> stackType) {
        this.description = description;
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.ipv6AccessType = ipv6AccessType;
        this.logConfig = logConfig;
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.purpose = purpose;
        this.region = region;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.stackType = stackType;
    }

    private SubnetworkArgs() {
        this.description = Input.empty();
        this.ipCidrRange = Input.empty();
        this.ipv6AccessType = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.privateIpGoogleAccess = Input.empty();
        this.privateIpv6GoogleAccess = Input.empty();
        this.project = Input.empty();
        this.purpose = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
        this.secondaryIpRanges = Input.empty();
        this.stackType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> ipCidrRange;
        private @Nullable Input<String> ipv6AccessType;
        private @Nullable Input<SubnetworkLogConfigArgs> logConfig;
        private @Nullable Input<String> name;
        private Input<String> network;
        private @Nullable Input<Boolean> privateIpGoogleAccess;
        private @Nullable Input<String> privateIpv6GoogleAccess;
        private @Nullable Input<String> project;
        private @Nullable Input<String> purpose;
        private @Nullable Input<String> region;
        private @Nullable Input<String> role;
        private @Nullable Input<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges;
        private @Nullable Input<String> stackType;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.stackType = defaults.stackType;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder ipCidrRange(Input<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Input.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }

        public Builder ipv6AccessType(@Nullable Input<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder ipv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Input.ofNullable(ipv6AccessType);
            return this;
        }

        public Builder logConfig(@Nullable Input<SubnetworkLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(@Nullable SubnetworkLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
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

        public Builder network(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder network(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder privateIpGoogleAccess(@Nullable Input<Boolean> privateIpGoogleAccess) {
            this.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }

        public Builder privateIpGoogleAccess(@Nullable Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Input.ofNullable(privateIpGoogleAccess);
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable Input<String> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(@Nullable String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Input.ofNullable(privateIpv6GoogleAccess);
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

        public Builder purpose(@Nullable Input<String> purpose) {
            this.purpose = purpose;
            return this;
        }

        public Builder purpose(@Nullable String purpose) {
            this.purpose = Input.ofNullable(purpose);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder role(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder secondaryIpRanges(@Nullable Input<List<SubnetworkSecondaryIpRangeArgs>> secondaryIpRanges) {
            this.secondaryIpRanges = secondaryIpRanges;
            return this;
        }

        public Builder secondaryIpRanges(@Nullable List<SubnetworkSecondaryIpRangeArgs> secondaryIpRanges) {
            this.secondaryIpRanges = Input.ofNullable(secondaryIpRanges);
            return this;
        }

        public Builder stackType(@Nullable Input<String> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder stackType(@Nullable String stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }
        public SubnetworkArgs build() {
            return new SubnetworkArgs(description, ipCidrRange, ipv6AccessType, logConfig, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, project, purpose, region, role, secondaryIpRanges, stackType);
        }
    }
}
