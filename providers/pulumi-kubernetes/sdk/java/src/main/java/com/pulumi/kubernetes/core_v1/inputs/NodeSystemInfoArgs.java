// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * NodeSystemInfo is a set of ids/uuids to uniquely identify the node.
 * 
 */
public final class NodeSystemInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeSystemInfoArgs Empty = new NodeSystemInfoArgs();

    /**
     * The Architecture reported by the node
     * 
     */
    @Import(name="architecture", required=true)
    private Output<String> architecture;

    /**
     * @return The Architecture reported by the node
     * 
     */
    public Output<String> architecture() {
        return this.architecture;
    }

    /**
     * Boot ID reported by the node.
     * 
     */
    @Import(name="bootID", required=true)
    private Output<String> bootID;

    /**
     * @return Boot ID reported by the node.
     * 
     */
    public Output<String> bootID() {
        return this.bootID;
    }

    /**
     * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
     * 
     */
    @Import(name="containerRuntimeVersion", required=true)
    private Output<String> containerRuntimeVersion;

    /**
     * @return ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
     * 
     */
    public Output<String> containerRuntimeVersion() {
        return this.containerRuntimeVersion;
    }

    /**
     * Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
     * 
     */
    @Import(name="kernelVersion", required=true)
    private Output<String> kernelVersion;

    /**
     * @return Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
     * 
     */
    public Output<String> kernelVersion() {
        return this.kernelVersion;
    }

    /**
     * KubeProxy Version reported by the node.
     * 
     */
    @Import(name="kubeProxyVersion", required=true)
    private Output<String> kubeProxyVersion;

    /**
     * @return KubeProxy Version reported by the node.
     * 
     */
    public Output<String> kubeProxyVersion() {
        return this.kubeProxyVersion;
    }

    /**
     * Kubelet Version reported by the node.
     * 
     */
    @Import(name="kubeletVersion", required=true)
    private Output<String> kubeletVersion;

    /**
     * @return Kubelet Version reported by the node.
     * 
     */
    public Output<String> kubeletVersion() {
        return this.kubeletVersion;
    }

    /**
     * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
     * 
     */
    @Import(name="machineID", required=true)
    private Output<String> machineID;

    /**
     * @return MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
     * 
     */
    public Output<String> machineID() {
        return this.machineID;
    }

    /**
     * The Operating System reported by the node
     * 
     */
    @Import(name="operatingSystem", required=true)
    private Output<String> operatingSystem;

    /**
     * @return The Operating System reported by the node
     * 
     */
    public Output<String> operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
     * 
     */
    @Import(name="osImage", required=true)
    private Output<String> osImage;

    /**
     * @return OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
     * 
     */
    public Output<String> osImage() {
        return this.osImage;
    }

    /**
     * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
     * 
     */
    @Import(name="systemUUID", required=true)
    private Output<String> systemUUID;

    /**
     * @return SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
     * 
     */
    public Output<String> systemUUID() {
        return this.systemUUID;
    }

    private NodeSystemInfoArgs() {}

    private NodeSystemInfoArgs(NodeSystemInfoArgs $) {
        this.architecture = $.architecture;
        this.bootID = $.bootID;
        this.containerRuntimeVersion = $.containerRuntimeVersion;
        this.kernelVersion = $.kernelVersion;
        this.kubeProxyVersion = $.kubeProxyVersion;
        this.kubeletVersion = $.kubeletVersion;
        this.machineID = $.machineID;
        this.operatingSystem = $.operatingSystem;
        this.osImage = $.osImage;
        this.systemUUID = $.systemUUID;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeSystemInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeSystemInfoArgs $;

        public Builder() {
            $ = new NodeSystemInfoArgs();
        }

        public Builder(NodeSystemInfoArgs defaults) {
            $ = new NodeSystemInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture The Architecture reported by the node
         * 
         * @return builder
         * 
         */
        public Builder architecture(Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The Architecture reported by the node
         * 
         * @return builder
         * 
         */
        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param bootID Boot ID reported by the node.
         * 
         * @return builder
         * 
         */
        public Builder bootID(Output<String> bootID) {
            $.bootID = bootID;
            return this;
        }

        /**
         * @param bootID Boot ID reported by the node.
         * 
         * @return builder
         * 
         */
        public Builder bootID(String bootID) {
            return bootID(Output.of(bootID));
        }

        /**
         * @param containerRuntimeVersion ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
         * 
         * @return builder
         * 
         */
        public Builder containerRuntimeVersion(Output<String> containerRuntimeVersion) {
            $.containerRuntimeVersion = containerRuntimeVersion;
            return this;
        }

        /**
         * @param containerRuntimeVersion ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
         * 
         * @return builder
         * 
         */
        public Builder containerRuntimeVersion(String containerRuntimeVersion) {
            return containerRuntimeVersion(Output.of(containerRuntimeVersion));
        }

        /**
         * @param kernelVersion Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
         * 
         * @return builder
         * 
         */
        public Builder kernelVersion(Output<String> kernelVersion) {
            $.kernelVersion = kernelVersion;
            return this;
        }

        /**
         * @param kernelVersion Kernel Version reported by the node from &#39;uname -r&#39; (e.g. 3.16.0-0.bpo.4-amd64).
         * 
         * @return builder
         * 
         */
        public Builder kernelVersion(String kernelVersion) {
            return kernelVersion(Output.of(kernelVersion));
        }

        /**
         * @param kubeProxyVersion KubeProxy Version reported by the node.
         * 
         * @return builder
         * 
         */
        public Builder kubeProxyVersion(Output<String> kubeProxyVersion) {
            $.kubeProxyVersion = kubeProxyVersion;
            return this;
        }

        /**
         * @param kubeProxyVersion KubeProxy Version reported by the node.
         * 
         * @return builder
         * 
         */
        public Builder kubeProxyVersion(String kubeProxyVersion) {
            return kubeProxyVersion(Output.of(kubeProxyVersion));
        }

        /**
         * @param kubeletVersion Kubelet Version reported by the node.
         * 
         * @return builder
         * 
         */
        public Builder kubeletVersion(Output<String> kubeletVersion) {
            $.kubeletVersion = kubeletVersion;
            return this;
        }

        /**
         * @param kubeletVersion Kubelet Version reported by the node.
         * 
         * @return builder
         * 
         */
        public Builder kubeletVersion(String kubeletVersion) {
            return kubeletVersion(Output.of(kubeletVersion));
        }

        /**
         * @param machineID MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
         * 
         * @return builder
         * 
         */
        public Builder machineID(Output<String> machineID) {
            $.machineID = machineID;
            return this;
        }

        /**
         * @param machineID MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
         * 
         * @return builder
         * 
         */
        public Builder machineID(String machineID) {
            return machineID(Output.of(machineID));
        }

        /**
         * @param operatingSystem The Operating System reported by the node
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(Output<String> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem The Operating System reported by the node
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(String operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param osImage OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
         * 
         * @return builder
         * 
         */
        public Builder osImage(Output<String> osImage) {
            $.osImage = osImage;
            return this;
        }

        /**
         * @param osImage OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
         * 
         * @return builder
         * 
         */
        public Builder osImage(String osImage) {
            return osImage(Output.of(osImage));
        }

        /**
         * @param systemUUID SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
         * 
         * @return builder
         * 
         */
        public Builder systemUUID(Output<String> systemUUID) {
            $.systemUUID = systemUUID;
            return this;
        }

        /**
         * @param systemUUID SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
         * 
         * @return builder
         * 
         */
        public Builder systemUUID(String systemUUID) {
            return systemUUID(Output.of(systemUUID));
        }

        public NodeSystemInfoArgs build() {
            $.architecture = Objects.requireNonNull($.architecture, "expected parameter 'architecture' to be non-null");
            $.bootID = Objects.requireNonNull($.bootID, "expected parameter 'bootID' to be non-null");
            $.containerRuntimeVersion = Objects.requireNonNull($.containerRuntimeVersion, "expected parameter 'containerRuntimeVersion' to be non-null");
            $.kernelVersion = Objects.requireNonNull($.kernelVersion, "expected parameter 'kernelVersion' to be non-null");
            $.kubeProxyVersion = Objects.requireNonNull($.kubeProxyVersion, "expected parameter 'kubeProxyVersion' to be non-null");
            $.kubeletVersion = Objects.requireNonNull($.kubeletVersion, "expected parameter 'kubeletVersion' to be non-null");
            $.machineID = Objects.requireNonNull($.machineID, "expected parameter 'machineID' to be non-null");
            $.operatingSystem = Objects.requireNonNull($.operatingSystem, "expected parameter 'operatingSystem' to be non-null");
            $.osImage = Objects.requireNonNull($.osImage, "expected parameter 'osImage' to be non-null");
            $.systemUUID = Objects.requireNonNull($.systemUUID, "expected parameter 'systemUUID' to be non-null");
            return $;
        }
    }

}
