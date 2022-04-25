// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerPort {
    /**
     * @return Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
     * 
     */
    private final Integer containerPort;
    /**
     * @return What host IP to bind the external port to.
     * 
     */
    private final @Nullable String hostIP;
    /**
     * @return Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     * 
     */
    private final @Nullable Integer hostPort;
    /**
     * @return If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Protocol for port. Must be UDP, TCP, or SCTP. Defaults to &#34;TCP&#34;.
     * 
     * Possible enum values:
     *  - `&#34;SCTP&#34;` is the SCTP protocol.
     *  - `&#34;TCP&#34;` is the TCP protocol.
     *  - `&#34;UDP&#34;` is the UDP protocol.
     * 
     */
    private final @Nullable String protocol;

    @CustomType.Constructor
    private ContainerPort(
        @CustomType.Parameter("containerPort") Integer containerPort,
        @CustomType.Parameter("hostIP") @Nullable String hostIP,
        @CustomType.Parameter("hostPort") @Nullable Integer hostPort,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("protocol") @Nullable String protocol) {
        this.containerPort = containerPort;
        this.hostIP = hostIP;
        this.hostPort = hostPort;
        this.name = name;
        this.protocol = protocol;
    }

    /**
     * @return Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
     * 
     */
    public Integer containerPort() {
        return this.containerPort;
    }
    /**
     * @return What host IP to bind the external port to.
     * 
     */
    public Optional<String> hostIP() {
        return Optional.ofNullable(this.hostIP);
    }
    /**
     * @return Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
     * 
     */
    public Optional<Integer> hostPort() {
        return Optional.ofNullable(this.hostPort);
    }
    /**
     * @return If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Protocol for port. Must be UDP, TCP, or SCTP. Defaults to &#34;TCP&#34;.
     * 
     * Possible enum values:
     *  - `&#34;SCTP&#34;` is the SCTP protocol.
     *  - `&#34;TCP&#34;` is the TCP protocol.
     *  - `&#34;UDP&#34;` is the UDP protocol.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer containerPort;
        private @Nullable String hostIP;
        private @Nullable Integer hostPort;
        private @Nullable String name;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostIP = defaults.hostIP;
    	      this.hostPort = defaults.hostPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }
        public Builder hostIP(@Nullable String hostIP) {
            this.hostIP = hostIP;
            return this;
        }
        public Builder hostPort(@Nullable Integer hostPort) {
            this.hostPort = hostPort;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }        public ContainerPort build() {
            return new ContainerPort(containerPort, hostIP, hostPort, name, protocol);
        }
    }
}
