// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.docker.inputs.ServiceEndpointSpecPortGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceEndpointSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointSpecGetArgs Empty = new ServiceEndpointSpecGetArgs();

    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    @Import(name="ports")
      private final @Nullable Output<List<ServiceEndpointSpecPortGetArgs>> ports;

    public Output<List<ServiceEndpointSpecPortGetArgs>> getPorts() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    public ServiceEndpointSpecGetArgs(
        @Nullable Output<String> mode,
        @Nullable Output<List<ServiceEndpointSpecPortGetArgs>> ports) {
        this.mode = mode;
        this.ports = ports;
    }

    private ServiceEndpointSpecGetArgs() {
        this.mode = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mode;
        private @Nullable Output<List<ServiceEndpointSpecPortGetArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.ports = defaults.ports;
        }

        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder ports(@Nullable Output<List<ServiceEndpointSpecPortGetArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<ServiceEndpointSpecPortGetArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(ServiceEndpointSpecPortGetArgs... ports) {
            return ports(List.of(ports));
        }        public ServiceEndpointSpecGetArgs build() {
            return new ServiceEndpointSpecGetArgs(mode, ports);
        }
    }
}
