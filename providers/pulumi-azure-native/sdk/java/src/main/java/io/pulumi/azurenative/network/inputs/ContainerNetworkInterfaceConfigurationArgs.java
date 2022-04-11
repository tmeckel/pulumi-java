// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.IPConfigurationProfileArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container network interface configuration child resource.
 * 
 */
public final class ContainerNetworkInterfaceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerNetworkInterfaceConfigurationArgs Empty = new ContainerNetworkInterfaceConfigurationArgs();

    /**
     * A list of container network interfaces created from this container network interface configuration.
     * 
     */
    @Import(name="containerNetworkInterfaces")
      private final @Nullable Output<List<SubResourceArgs>> containerNetworkInterfaces;

    public Output<List<SubResourceArgs>> getContainerNetworkInterfaces() {
        return this.containerNetworkInterfaces == null ? Codegen.empty() : this.containerNetworkInterfaces;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * A list of ip configurations of the container network interface configuration.
     * 
     */
    @Import(name="ipConfigurations")
      private final @Nullable Output<List<IPConfigurationProfileArgs>> ipConfigurations;

    public Output<List<IPConfigurationProfileArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Codegen.empty() : this.ipConfigurations;
    }

    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public ContainerNetworkInterfaceConfigurationArgs(
        @Nullable Output<List<SubResourceArgs>> containerNetworkInterfaces,
        @Nullable Output<String> id,
        @Nullable Output<List<IPConfigurationProfileArgs>> ipConfigurations,
        @Nullable Output<String> name) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
    }

    private ContainerNetworkInterfaceConfigurationArgs() {
        this.containerNetworkInterfaces = Codegen.empty();
        this.id = Codegen.empty();
        this.ipConfigurations = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworkInterfaceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SubResourceArgs>> containerNetworkInterfaces;
        private @Nullable Output<String> id;
        private @Nullable Output<List<IPConfigurationProfileArgs>> ipConfigurations;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworkInterfaceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaces = defaults.containerNetworkInterfaces;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
        }

        public Builder containerNetworkInterfaces(@Nullable Output<List<SubResourceArgs>> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = containerNetworkInterfaces;
            return this;
        }
        public Builder containerNetworkInterfaces(@Nullable List<SubResourceArgs> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = Codegen.ofNullable(containerNetworkInterfaces);
            return this;
        }
        public Builder containerNetworkInterfaces(SubResourceArgs... containerNetworkInterfaces) {
            return containerNetworkInterfaces(List.of(containerNetworkInterfaces));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder ipConfigurations(@Nullable Output<List<IPConfigurationProfileArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<IPConfigurationProfileArgs> ipConfigurations) {
            this.ipConfigurations = Codegen.ofNullable(ipConfigurations);
            return this;
        }
        public Builder ipConfigurations(IPConfigurationProfileArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public ContainerNetworkInterfaceConfigurationArgs build() {
            return new ContainerNetworkInterfaceConfigurationArgs(containerNetworkInterfaces, id, ipConfigurations, name);
        }
    }
}
