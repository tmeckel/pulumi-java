// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RouterInterfaceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RouterInterfaceResponse Empty = new RouterInterfaceResponse();

    /**
     * IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
     * 
     */
    @Import(name="ipRange", required=true)
    private String ipRange;

    /**
     * @return IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
     * 
     */
    public String ipRange() {
        return this.ipRange;
    }

    /**
     * URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    @Import(name="linkedInterconnectAttachment", required=true)
    private String linkedInterconnectAttachment;

    /**
     * @return URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    public String linkedInterconnectAttachment() {
        return this.linkedInterconnectAttachment;
    }

    /**
     * URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    @Import(name="linkedVpnTunnel", required=true)
    private String linkedVpnTunnel;

    /**
     * @return URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
     * 
     */
    public String linkedVpnTunnel() {
        return this.linkedVpnTunnel;
    }

    /**
     * The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    @Import(name="managementType", required=true)
    private String managementType;

    /**
     * @return The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
     * 
     */
    public String managementType() {
        return this.managementType;
    }

    /**
     * Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
     * 
     */
    @Import(name="privateIpAddress", required=true)
    private String privateIpAddress;

    /**
     * @return The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
     * 
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="redundantInterface", required=true)
    private String redundantInterface;

    /**
     * @return Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public String redundantInterface() {
        return this.redundantInterface;
    }

    /**
     * The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
     * 
     */
    @Import(name="subnetwork", required=true)
    private String subnetwork;

    /**
     * @return The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }

    private RouterInterfaceResponse() {}

    private RouterInterfaceResponse(RouterInterfaceResponse $) {
        this.ipRange = $.ipRange;
        this.linkedInterconnectAttachment = $.linkedInterconnectAttachment;
        this.linkedVpnTunnel = $.linkedVpnTunnel;
        this.managementType = $.managementType;
        this.name = $.name;
        this.privateIpAddress = $.privateIpAddress;
        this.redundantInterface = $.redundantInterface;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterInterfaceResponse $;

        public Builder() {
            $ = new RouterInterfaceResponse();
        }

        public Builder(RouterInterfaceResponse defaults) {
            $ = new RouterInterfaceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipRange IP address and range of the interface. The IP range must be in the RFC3927 link-local IP address space. The value must be a CIDR-formatted string, for example: 169.254.0.1/30. NOTE: Do not truncate the address as it represents the IP address of the interface.
         * 
         * @return builder
         * 
         */
        public Builder ipRange(String ipRange) {
            $.ipRange = ipRange;
            return this;
        }

        /**
         * @param linkedInterconnectAttachment URI of the linked Interconnect attachment. It must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
         * 
         * @return builder
         * 
         */
        public Builder linkedInterconnectAttachment(String linkedInterconnectAttachment) {
            $.linkedInterconnectAttachment = linkedInterconnectAttachment;
            return this;
        }

        /**
         * @param linkedVpnTunnel URI of the linked VPN tunnel, which must be in the same region as the router. Each interface can have one linked resource, which can be a VPN tunnel, an Interconnect attachment, or a virtual machine instance.
         * 
         * @return builder
         * 
         */
        public Builder linkedVpnTunnel(String linkedVpnTunnel) {
            $.linkedVpnTunnel = linkedVpnTunnel;
            return this;
        }

        /**
         * @param managementType The resource that configures and manages this interface. - MANAGED_BY_USER is the default value and can be managed directly by users. - MANAGED_BY_ATTACHMENT is an interface that is configured and managed by Cloud Interconnect, specifically, by an InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes this type of interface when the PARTNER InterconnectAttachment is created, updated, or deleted.
         * 
         * @return builder
         * 
         */
        public Builder managementType(String managementType) {
            $.managementType = managementType;
            return this;
        }

        /**
         * @param name Name of this interface entry. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param privateIpAddress The regional private internal IP address that is used to establish BGP sessions to a VM instance acting as a third-party Router Appliance, such as a Next Gen Firewall, a Virtual Router, or an SD-WAN VM.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param redundantInterface Name of the interface that will be redundant with the current interface you are creating. The redundantInterface must belong to the same Cloud Router as the interface here. To establish the BGP session to a Router Appliance VM, you must create two BGP peers. The two BGP peers must be attached to two separate interfaces that are redundant with each other. The redundant_interface must be 1-63 characters long, and comply with RFC1035. Specifically, the redundant_interface must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder redundantInterface(String redundantInterface) {
            $.redundantInterface = redundantInterface;
            return this;
        }

        /**
         * @param subnetwork The URI of the subnetwork resource that this interface belongs to, which must be in the same region as the Cloud Router. When you establish a BGP session to a VM instance using this interface, the VM instance must belong to the same subnetwork as the subnetwork specified here.
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        public RouterInterfaceResponse build() {
            $.ipRange = Objects.requireNonNull($.ipRange, "expected parameter 'ipRange' to be non-null");
            $.linkedInterconnectAttachment = Objects.requireNonNull($.linkedInterconnectAttachment, "expected parameter 'linkedInterconnectAttachment' to be non-null");
            $.linkedVpnTunnel = Objects.requireNonNull($.linkedVpnTunnel, "expected parameter 'linkedVpnTunnel' to be non-null");
            $.managementType = Objects.requireNonNull($.managementType, "expected parameter 'managementType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.privateIpAddress = Objects.requireNonNull($.privateIpAddress, "expected parameter 'privateIpAddress' to be non-null");
            $.redundantInterface = Objects.requireNonNull($.redundantInterface, "expected parameter 'redundantInterface' to be non-null");
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            return $;
        }
    }

}
