// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.HaVpnGatewayVpnInterfaceGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HaVpnGatewayState extends io.pulumi.resources.ResourceArgs {

    public static final HaVpnGatewayState Empty = new HaVpnGatewayState();

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The network this VPN gateway is accepting traffic for.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
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
     * The region this gateway should sit in.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
      private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * A list of interfaces on this VPN gateway.
     * Structure is documented below.
     * 
     */
    @InputImport(name="vpnInterfaces")
      private final @Nullable Input<List<HaVpnGatewayVpnInterfaceGetArgs>> vpnInterfaces;

    public Input<List<HaVpnGatewayVpnInterfaceGetArgs>> getVpnInterfaces() {
        return this.vpnInterfaces == null ? Input.empty() : this.vpnInterfaces;
    }

    public HaVpnGatewayState(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> selfLink,
        @Nullable Input<List<HaVpnGatewayVpnInterfaceGetArgs>> vpnInterfaces) {
        this.description = description;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.vpnInterfaces = vpnInterfaces;
    }

    private HaVpnGatewayState() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.selfLink = Input.empty();
        this.vpnInterfaces = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HaVpnGatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<List<HaVpnGatewayVpnInterfaceGetArgs>> vpnInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(HaVpnGatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.vpnInterfaces = defaults.vpnInterfaces;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
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

        public Builder selfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder vpnInterfaces(@Nullable Input<List<HaVpnGatewayVpnInterfaceGetArgs>> vpnInterfaces) {
            this.vpnInterfaces = vpnInterfaces;
            return this;
        }

        public Builder vpnInterfaces(@Nullable List<HaVpnGatewayVpnInterfaceGetArgs> vpnInterfaces) {
            this.vpnInterfaces = Input.ofNullable(vpnInterfaces);
            return this;
        }
        public HaVpnGatewayState build() {
            return new HaVpnGatewayState(description, name, network, project, region, selfLink, vpnInterfaces);
        }
    }
}
