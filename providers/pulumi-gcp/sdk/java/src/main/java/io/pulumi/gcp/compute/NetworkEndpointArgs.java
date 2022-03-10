// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointArgs Empty = new NetworkEndpointArgs();

    /**
     * The name for a specific VM instance that the IP address belongs to.
     * This is required for network endpoints of type GCE_VM_IP_PORT.
     * The instance must be in the same zone of network endpoint group.
     * 
     */
    @InputImport(name="instance", required=true)
      private final Input<String> instance;

    public Input<String> getInstance() {
        return this.instance;
    }

    /**
     * IPv4 address of network endpoint. The IP address must belong
     * to a VM in GCE (either the primary IP or as part of an aliased IP
     * range).
     * 
     */
    @InputImport(name="ipAddress", required=true)
      private final Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress;
    }

    /**
     * The network endpoint group this endpoint is part of.
     * 
     */
    @InputImport(name="networkEndpointGroup", required=true)
      private final Input<String> networkEndpointGroup;

    public Input<String> getNetworkEndpointGroup() {
        return this.networkEndpointGroup;
    }

    /**
     * Port number of network endpoint.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
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
     * Zone where the containing network endpoint group is located.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public NetworkEndpointArgs(
        Input<String> instance,
        Input<String> ipAddress,
        Input<String> networkEndpointGroup,
        Input<Integer> port,
        @Nullable Input<String> project,
        @Nullable Input<String> zone) {
        this.instance = Objects.requireNonNull(instance, "expected parameter 'instance' to be non-null");
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup, "expected parameter 'networkEndpointGroup' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.project = project;
        this.zone = zone;
    }

    private NetworkEndpointArgs() {
        this.instance = Input.empty();
        this.ipAddress = Input.empty();
        this.networkEndpointGroup = Input.empty();
        this.port = Input.empty();
        this.project = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instance;
        private Input<String> ipAddress;
        private Input<String> networkEndpointGroup;
        private Input<Integer> port;
        private @Nullable Input<String> project;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.networkEndpointGroup = defaults.networkEndpointGroup;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder instance(Input<String> instance) {
            this.instance = Objects.requireNonNull(instance);
            return this;
        }

        public Builder instance(String instance) {
            this.instance = Input.of(Objects.requireNonNull(instance));
            return this;
        }

        public Builder ipAddress(Input<String> ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Input.of(Objects.requireNonNull(ipAddress));
            return this;
        }

        public Builder networkEndpointGroup(Input<String> networkEndpointGroup) {
            this.networkEndpointGroup = Objects.requireNonNull(networkEndpointGroup);
            return this;
        }

        public Builder networkEndpointGroup(String networkEndpointGroup) {
            this.networkEndpointGroup = Input.of(Objects.requireNonNull(networkEndpointGroup));
            return this;
        }

        public Builder port(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
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

        public Builder zone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }
        public NetworkEndpointArgs build() {
            return new NetworkEndpointArgs(instance, ipAddress, networkEndpointGroup, port, project, zone);
        }
    }
}
