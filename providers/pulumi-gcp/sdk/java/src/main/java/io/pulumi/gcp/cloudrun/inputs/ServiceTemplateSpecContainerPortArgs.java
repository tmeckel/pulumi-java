// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTemplateSpecContainerPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerPortArgs Empty = new ServiceTemplateSpecContainerPortArgs();

    /**
     * Port number.
     * 
     */
    @InputImport(name="containerPort", required=true)
      private final Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return this.containerPort;
    }

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Protocol used on port. Defaults to TCP.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public ServiceTemplateSpecContainerPortArgs(
        Input<Integer> containerPort,
        @Nullable Input<String> name,
        @Nullable Input<String> protocol) {
        this.containerPort = Objects.requireNonNull(containerPort, "expected parameter 'containerPort' to be non-null");
        this.name = name;
        this.protocol = protocol;
    }

    private ServiceTemplateSpecContainerPortArgs() {
        this.containerPort = Input.empty();
        this.name = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> containerPort;
        private @Nullable Input<String> name;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        public Builder containerPort(Input<Integer> containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }

        public Builder containerPort(Integer containerPort) {
            this.containerPort = Input.of(Objects.requireNonNull(containerPort));
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

        public Builder protocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }
        public ServiceTemplateSpecContainerPortArgs build() {
            return new ServiceTemplateSpecContainerPortArgs(containerPort, name, protocol);
        }
    }
}
