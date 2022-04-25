// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectInterconnectType;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectLinkType;
import com.pulumi.googlenative.compute_alpha.inputs.InterconnectMacsecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectArgs Empty = new InterconnectArgs();

    /**
     * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    @Import(name="adminEnabled")
    private @Nullable Output<Boolean> adminEnabled;

    /**
     * @return Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    public Optional<Output<Boolean>> adminEnabled() {
        return Optional.ofNullable(this.adminEnabled);
    }

    /**
     * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    @Import(name="customerName")
    private @Nullable Output<String> customerName;

    /**
     * @return Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    public Optional<Output<String>> customerName() {
        return Optional.ofNullable(this.customerName);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @Import(name="interconnectType")
    private @Nullable Output<InterconnectInterconnectType> interconnectType;

    /**
     * @return Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    public Optional<Output<InterconnectInterconnectType>> interconnectType() {
        return Optional.ofNullable(this.interconnectType);
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @Import(name="linkType")
    private @Nullable Output<InterconnectLinkType> linkType;

    /**
     * @return Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    public Optional<Output<InterconnectLinkType>> linkType() {
        return Optional.ofNullable(this.linkType);
    }

    /**
     * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Configuration to enable Media Access Control security (MACsec) on the Interconnect between Google and your on-premises router.
     * 
     */
    @Import(name="macsec")
    private @Nullable Output<InterconnectMacsecArgs> macsec;

    /**
     * @return Configuration to enable Media Access Control security (MACsec) on the Interconnect between Google and your on-premises router.
     * 
     */
    public Optional<Output<InterconnectMacsecArgs>> macsec() {
        return Optional.ofNullable(this.macsec);
    }

    /**
     * Enable or disable MACsec on this Interconnect. MACsec enablement will fail if the macsec object is not specified.
     * 
     */
    @Import(name="macsecEnabled")
    private @Nullable Output<Boolean> macsecEnabled;

    /**
     * @return Enable or disable MACsec on this Interconnect. MACsec enablement will fail if the macsec object is not specified.
     * 
     */
    public Optional<Output<Boolean>> macsecEnabled() {
        return Optional.ofNullable(this.macsecEnabled);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    @Import(name="nocContactEmail")
    private @Nullable Output<String> nocContactEmail;

    /**
     * @return Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    public Optional<Output<String>> nocContactEmail() {
        return Optional.ofNullable(this.nocContactEmail);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    @Import(name="requestedLinkCount")
    private @Nullable Output<Integer> requestedLinkCount;

    /**
     * @return Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    public Optional<Output<Integer>> requestedLinkCount() {
        return Optional.ofNullable(this.requestedLinkCount);
    }

    private InterconnectArgs() {}

    private InterconnectArgs(InterconnectArgs $) {
        this.adminEnabled = $.adminEnabled;
        this.customerName = $.customerName;
        this.description = $.description;
        this.interconnectType = $.interconnectType;
        this.labels = $.labels;
        this.linkType = $.linkType;
        this.location = $.location;
        this.macsec = $.macsec;
        this.macsecEnabled = $.macsecEnabled;
        this.name = $.name;
        this.nocContactEmail = $.nocContactEmail;
        this.project = $.project;
        this.requestId = $.requestId;
        this.requestedLinkCount = $.requestedLinkCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectArgs $;

        public Builder() {
            $ = new InterconnectArgs();
        }

        public Builder(InterconnectArgs defaults) {
            $ = new InterconnectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminEnabled Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
         * 
         * @return builder
         * 
         */
        public Builder adminEnabled(@Nullable Output<Boolean> adminEnabled) {
            $.adminEnabled = adminEnabled;
            return this;
        }

        /**
         * @param adminEnabled Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
         * 
         * @return builder
         * 
         */
        public Builder adminEnabled(Boolean adminEnabled) {
            return adminEnabled(Output.of(adminEnabled));
        }

        /**
         * @param customerName Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
         * 
         * @return builder
         * 
         */
        public Builder customerName(@Nullable Output<String> customerName) {
            $.customerName = customerName;
            return this;
        }

        /**
         * @param customerName Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
         * 
         * @return builder
         * 
         */
        public Builder customerName(String customerName) {
            return customerName(Output.of(customerName));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param interconnectType Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
         * 
         * @return builder
         * 
         */
        public Builder interconnectType(@Nullable Output<InterconnectInterconnectType> interconnectType) {
            $.interconnectType = interconnectType;
            return this;
        }

        /**
         * @param interconnectType Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
         * 
         * @return builder
         * 
         */
        public Builder interconnectType(InterconnectInterconnectType interconnectType) {
            return interconnectType(Output.of(interconnectType));
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param linkType Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
         * 
         * @return builder
         * 
         */
        public Builder linkType(@Nullable Output<InterconnectLinkType> linkType) {
            $.linkType = linkType;
            return this;
        }

        /**
         * @param linkType Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
         * 
         * @return builder
         * 
         */
        public Builder linkType(InterconnectLinkType linkType) {
            return linkType(Output.of(linkType));
        }

        /**
         * @param location URL of the InterconnectLocation object that represents where this connection is to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location URL of the InterconnectLocation object that represents where this connection is to be provisioned.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param macsec Configuration to enable Media Access Control security (MACsec) on the Interconnect between Google and your on-premises router.
         * 
         * @return builder
         * 
         */
        public Builder macsec(@Nullable Output<InterconnectMacsecArgs> macsec) {
            $.macsec = macsec;
            return this;
        }

        /**
         * @param macsec Configuration to enable Media Access Control security (MACsec) on the Interconnect between Google and your on-premises router.
         * 
         * @return builder
         * 
         */
        public Builder macsec(InterconnectMacsecArgs macsec) {
            return macsec(Output.of(macsec));
        }

        /**
         * @param macsecEnabled Enable or disable MACsec on this Interconnect. MACsec enablement will fail if the macsec object is not specified.
         * 
         * @return builder
         * 
         */
        public Builder macsecEnabled(@Nullable Output<Boolean> macsecEnabled) {
            $.macsecEnabled = macsecEnabled;
            return this;
        }

        /**
         * @param macsecEnabled Enable or disable MACsec on this Interconnect. MACsec enablement will fail if the macsec object is not specified.
         * 
         * @return builder
         * 
         */
        public Builder macsecEnabled(Boolean macsecEnabled) {
            return macsecEnabled(Output.of(macsecEnabled));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nocContactEmail Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
         * 
         * @return builder
         * 
         */
        public Builder nocContactEmail(@Nullable Output<String> nocContactEmail) {
            $.nocContactEmail = nocContactEmail;
            return this;
        }

        /**
         * @param nocContactEmail Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
         * 
         * @return builder
         * 
         */
        public Builder nocContactEmail(String nocContactEmail) {
            return nocContactEmail(Output.of(nocContactEmail));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param requestedLinkCount Target number of physical links in the link bundle, as requested by the customer.
         * 
         * @return builder
         * 
         */
        public Builder requestedLinkCount(@Nullable Output<Integer> requestedLinkCount) {
            $.requestedLinkCount = requestedLinkCount;
            return this;
        }

        /**
         * @param requestedLinkCount Target number of physical links in the link bundle, as requested by the customer.
         * 
         * @return builder
         * 
         */
        public Builder requestedLinkCount(Integer requestedLinkCount) {
            return requestedLinkCount(Output.of(requestedLinkCount));
        }

        public InterconnectArgs build() {
            return $;
        }
    }

}
