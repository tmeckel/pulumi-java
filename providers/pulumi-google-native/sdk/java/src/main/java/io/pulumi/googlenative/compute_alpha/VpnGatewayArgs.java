// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.VpnGatewayStackType;
import io.pulumi.googlenative.compute_alpha.inputs.VpnGatewayVpnGatewayInterfaceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnGatewayArgs Empty = new VpnGatewayArgs();

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
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * URL of the network to which this VPN gateway is attached. Provided by the client when the VPN gateway is created.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * The stack type for this VPN gateway to identify the IP protocols that are enabled. If not specified, IPV4_ONLY will be used.
     * 
     */
    @InputImport(name="stackType")
    private final @Nullable Input<VpnGatewayStackType> stackType;

    public Input<VpnGatewayStackType> getStackType() {
        return this.stackType == null ? Input.empty() : this.stackType;
    }

    /**
     * The list of VPN interfaces associated with this VPN gateway.
     * 
     */
    @InputImport(name="vpnInterfaces")
    private final @Nullable Input<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces;

    public Input<List<VpnGatewayVpnGatewayInterfaceArgs>> getVpnInterfaces() {
        return this.vpnInterfaces == null ? Input.empty() : this.vpnInterfaces;
    }

    public VpnGatewayArgs(
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<VpnGatewayStackType> stackType,
        @Nullable Input<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.stackType = stackType;
        this.vpnInterfaces = vpnInterfaces;
    }

    private VpnGatewayArgs() {
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.stackType = Input.empty();
        this.vpnInterfaces = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<VpnGatewayStackType> stackType;
        private @Nullable Input<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.stackType = defaults.stackType;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setStackType(@Nullable Input<VpnGatewayStackType> stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder setStackType(@Nullable VpnGatewayStackType stackType) {
            this.stackType = Input.ofNullable(stackType);
            return this;
        }

        public Builder setVpnInterfaces(@Nullable Input<List<VpnGatewayVpnGatewayInterfaceArgs>> vpnInterfaces) {
            this.vpnInterfaces = vpnInterfaces;
            return this;
        }

        public Builder setVpnInterfaces(@Nullable List<VpnGatewayVpnGatewayInterfaceArgs> vpnInterfaces) {
            this.vpnInterfaces = Input.ofNullable(vpnInterfaces);
            return this;
        }

        public VpnGatewayArgs build() {
            return new VpnGatewayArgs(description, labels, name, network, project, region, requestId, stackType, vpnInterfaces);
        }
    }
}
