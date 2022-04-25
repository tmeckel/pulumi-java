// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1.enums.ManagedZoneVisibility;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZoneCloudLoggingConfigArgs;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZoneDnsSecConfigArgs;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZoneForwardingConfigArgs;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZonePeeringConfigArgs;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZonePrivateVisibilityConfigArgs;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZoneReverseLookupConfigArgs;
import com.pulumi.googlenative.dns_v1.inputs.ManagedZoneServiceDirectoryConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneArgs Empty = new ManagedZoneArgs();

    @Import(name="clientOperationId")
    private @Nullable Output<String> clientOperationId;

    public Optional<Output<String>> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    @Import(name="cloudLoggingConfig")
    private @Nullable Output<ManagedZoneCloudLoggingConfigArgs> cloudLoggingConfig;

    public Optional<Output<ManagedZoneCloudLoggingConfigArgs>> cloudLoggingConfig() {
        return Optional.ofNullable(this.cloudLoggingConfig);
    }

    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    @Import(name="creationTime")
    private @Nullable Output<String> creationTime;

    /**
     * @return The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    public Optional<Output<String>> creationTime() {
        return Optional.ofNullable(this.creationTime);
    }

    /**
     * A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the managed zone&#39;s function.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the managed zone&#39;s function.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The DNS name of this managed zone, for instance &#34;example.com.&#34;.
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    /**
     * @return The DNS name of this managed zone, for instance &#34;example.com.&#34;.
     * 
     */
    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * DNSSEC configuration.
     * 
     */
    @Import(name="dnssecConfig")
    private @Nullable Output<ManagedZoneDnsSecConfigArgs> dnssecConfig;

    /**
     * @return DNSSEC configuration.
     * 
     */
    public Optional<Output<ManagedZoneDnsSecConfigArgs>> dnssecConfig() {
        return Optional.ofNullable(this.dnssecConfig);
    }

    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    @Import(name="forwardingConfig")
    private @Nullable Output<ManagedZoneForwardingConfigArgs> forwardingConfig;

    /**
     * @return The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    public Optional<Output<ManagedZoneForwardingConfigArgs>> forwardingConfig() {
        return Optional.ofNullable(this.forwardingConfig);
    }

    /**
     * Unique identifier for the resource; defined by the server (output only)
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier for the resource; defined by the server (output only)
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * User labels.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User labels.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    @Import(name="nameServerSet")
    private @Nullable Output<String> nameServerSet;

    /**
     * @return Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    public Optional<Output<String>> nameServerSet() {
        return Optional.ofNullable(this.nameServerSet);
    }

    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    @Import(name="nameServers")
    private @Nullable Output<List<String>> nameServers;

    /**
     * @return Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    public Optional<Output<List<String>>> nameServers() {
        return Optional.ofNullable(this.nameServers);
    }

    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    @Import(name="peeringConfig")
    private @Nullable Output<ManagedZonePeeringConfigArgs> peeringConfig;

    /**
     * @return The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    public Optional<Output<ManagedZonePeeringConfigArgs>> peeringConfig() {
        return Optional.ofNullable(this.peeringConfig);
    }

    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    @Import(name="privateVisibilityConfig")
    private @Nullable Output<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig;

    /**
     * @return For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    public Optional<Output<ManagedZonePrivateVisibilityConfigArgs>> privateVisibilityConfig() {
        return Optional.ofNullable(this.privateVisibilityConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    @Import(name="reverseLookupConfig")
    private @Nullable Output<ManagedZoneReverseLookupConfigArgs> reverseLookupConfig;

    /**
     * @return The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    public Optional<Output<ManagedZoneReverseLookupConfigArgs>> reverseLookupConfig() {
        return Optional.ofNullable(this.reverseLookupConfig);
    }

    /**
     * This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    @Import(name="serviceDirectoryConfig")
    private @Nullable Output<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig;

    /**
     * @return This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    public Optional<Output<ManagedZoneServiceDirectoryConfigArgs>> serviceDirectoryConfig() {
        return Optional.ofNullable(this.serviceDirectoryConfig);
    }

    /**
     * The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    @Import(name="visibility")
    private @Nullable Output<ManagedZoneVisibility> visibility;

    /**
     * @return The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    public Optional<Output<ManagedZoneVisibility>> visibility() {
        return Optional.ofNullable(this.visibility);
    }

    private ManagedZoneArgs() {}

    private ManagedZoneArgs(ManagedZoneArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.cloudLoggingConfig = $.cloudLoggingConfig;
        this.creationTime = $.creationTime;
        this.description = $.description;
        this.dnsName = $.dnsName;
        this.dnssecConfig = $.dnssecConfig;
        this.forwardingConfig = $.forwardingConfig;
        this.id = $.id;
        this.kind = $.kind;
        this.labels = $.labels;
        this.name = $.name;
        this.nameServerSet = $.nameServerSet;
        this.nameServers = $.nameServers;
        this.peeringConfig = $.peeringConfig;
        this.privateVisibilityConfig = $.privateVisibilityConfig;
        this.project = $.project;
        this.reverseLookupConfig = $.reverseLookupConfig;
        this.serviceDirectoryConfig = $.serviceDirectoryConfig;
        this.visibility = $.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneArgs $;

        public Builder() {
            $ = new ManagedZoneArgs();
        }

        public Builder(ManagedZoneArgs defaults) {
            $ = new ManagedZoneArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder clientOperationId(String clientOperationId) {
            return clientOperationId(Output.of(clientOperationId));
        }

        public Builder cloudLoggingConfig(@Nullable Output<ManagedZoneCloudLoggingConfigArgs> cloudLoggingConfig) {
            $.cloudLoggingConfig = cloudLoggingConfig;
            return this;
        }

        public Builder cloudLoggingConfig(ManagedZoneCloudLoggingConfigArgs cloudLoggingConfig) {
            return cloudLoggingConfig(Output.of(cloudLoggingConfig));
        }

        /**
         * @param creationTime The time that this resource was created on the server. This is in RFC3339 text format. Output only.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(@Nullable Output<String> creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        /**
         * @param creationTime The time that this resource was created on the server. This is in RFC3339 text format. Output only.
         * 
         * @return builder
         * 
         */
        public Builder creationTime(String creationTime) {
            return creationTime(Output.of(creationTime));
        }

        /**
         * @param description A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the managed zone&#39;s function.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A mutable string of at most 1024 characters associated with this resource for the user&#39;s convenience. Has no effect on the managed zone&#39;s function.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dnsName The DNS name of this managed zone, for instance &#34;example.com.&#34;.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        /**
         * @param dnsName The DNS name of this managed zone, for instance &#34;example.com.&#34;.
         * 
         * @return builder
         * 
         */
        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        /**
         * @param dnssecConfig DNSSEC configuration.
         * 
         * @return builder
         * 
         */
        public Builder dnssecConfig(@Nullable Output<ManagedZoneDnsSecConfigArgs> dnssecConfig) {
            $.dnssecConfig = dnssecConfig;
            return this;
        }

        /**
         * @param dnssecConfig DNSSEC configuration.
         * 
         * @return builder
         * 
         */
        public Builder dnssecConfig(ManagedZoneDnsSecConfigArgs dnssecConfig) {
            return dnssecConfig(Output.of(dnssecConfig));
        }

        /**
         * @param forwardingConfig The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
         * 
         * @return builder
         * 
         */
        public Builder forwardingConfig(@Nullable Output<ManagedZoneForwardingConfigArgs> forwardingConfig) {
            $.forwardingConfig = forwardingConfig;
            return this;
        }

        /**
         * @param forwardingConfig The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
         * 
         * @return builder
         * 
         */
        public Builder forwardingConfig(ManagedZoneForwardingConfigArgs forwardingConfig) {
            return forwardingConfig(Output.of(forwardingConfig));
        }

        /**
         * @param id Unique identifier for the resource; defined by the server (output only)
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier for the resource; defined by the server (output only)
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param labels User labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User labels.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nameServerSet Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
         * 
         * @return builder
         * 
         */
        public Builder nameServerSet(@Nullable Output<String> nameServerSet) {
            $.nameServerSet = nameServerSet;
            return this;
        }

        /**
         * @param nameServerSet Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
         * 
         * @return builder
         * 
         */
        public Builder nameServerSet(String nameServerSet) {
            return nameServerSet(Output.of(nameServerSet));
        }

        /**
         * @param nameServers Delegate your managed_zone to these virtual name servers; defined by the server (output only)
         * 
         * @return builder
         * 
         */
        public Builder nameServers(@Nullable Output<List<String>> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        /**
         * @param nameServers Delegate your managed_zone to these virtual name servers; defined by the server (output only)
         * 
         * @return builder
         * 
         */
        public Builder nameServers(List<String> nameServers) {
            return nameServers(Output.of(nameServers));
        }

        /**
         * @param nameServers Delegate your managed_zone to these virtual name servers; defined by the server (output only)
         * 
         * @return builder
         * 
         */
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }

        /**
         * @param peeringConfig The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
         * 
         * @return builder
         * 
         */
        public Builder peeringConfig(@Nullable Output<ManagedZonePeeringConfigArgs> peeringConfig) {
            $.peeringConfig = peeringConfig;
            return this;
        }

        /**
         * @param peeringConfig The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
         * 
         * @return builder
         * 
         */
        public Builder peeringConfig(ManagedZonePeeringConfigArgs peeringConfig) {
            return peeringConfig(Output.of(peeringConfig));
        }

        /**
         * @param privateVisibilityConfig For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
         * 
         * @return builder
         * 
         */
        public Builder privateVisibilityConfig(@Nullable Output<ManagedZonePrivateVisibilityConfigArgs> privateVisibilityConfig) {
            $.privateVisibilityConfig = privateVisibilityConfig;
            return this;
        }

        /**
         * @param privateVisibilityConfig For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
         * 
         * @return builder
         * 
         */
        public Builder privateVisibilityConfig(ManagedZonePrivateVisibilityConfigArgs privateVisibilityConfig) {
            return privateVisibilityConfig(Output.of(privateVisibilityConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param reverseLookupConfig The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
         * 
         * @return builder
         * 
         */
        public Builder reverseLookupConfig(@Nullable Output<ManagedZoneReverseLookupConfigArgs> reverseLookupConfig) {
            $.reverseLookupConfig = reverseLookupConfig;
            return this;
        }

        /**
         * @param reverseLookupConfig The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
         * 
         * @return builder
         * 
         */
        public Builder reverseLookupConfig(ManagedZoneReverseLookupConfigArgs reverseLookupConfig) {
            return reverseLookupConfig(Output.of(reverseLookupConfig));
        }

        /**
         * @param serviceDirectoryConfig This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
         * 
         * @return builder
         * 
         */
        public Builder serviceDirectoryConfig(@Nullable Output<ManagedZoneServiceDirectoryConfigArgs> serviceDirectoryConfig) {
            $.serviceDirectoryConfig = serviceDirectoryConfig;
            return this;
        }

        /**
         * @param serviceDirectoryConfig This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
         * 
         * @return builder
         * 
         */
        public Builder serviceDirectoryConfig(ManagedZoneServiceDirectoryConfigArgs serviceDirectoryConfig) {
            return serviceDirectoryConfig(Output.of(serviceDirectoryConfig));
        }

        /**
         * @param visibility The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
         * 
         * @return builder
         * 
         */
        public Builder visibility(@Nullable Output<ManagedZoneVisibility> visibility) {
            $.visibility = visibility;
            return this;
        }

        /**
         * @param visibility The zone&#39;s visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
         * 
         * @return builder
         * 
         */
        public Builder visibility(ManagedZoneVisibility visibility) {
            return visibility(Output.of(visibility));
        }

        public ManagedZoneArgs build() {
            return $;
        }
    }

}
