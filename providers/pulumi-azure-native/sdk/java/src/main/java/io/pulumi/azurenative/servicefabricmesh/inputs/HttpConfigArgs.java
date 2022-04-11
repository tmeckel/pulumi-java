// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpHostConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the http configuration for external connectivity for this network.
 * 
 */
public final class HttpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpConfigArgs Empty = new HttpConfigArgs();

    /**
     * description for routing.
     * 
     */
    @Import(name="hosts", required=true)
      private final Output<List<HttpHostConfigArgs>> hosts;

    public Output<List<HttpHostConfigArgs>> getHosts() {
        return this.hosts;
    }

    /**
     * http gateway config name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Specifies the port at which the service endpoint below needs to be exposed.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    public HttpConfigArgs(
        Output<List<HttpHostConfigArgs>> hosts,
        Output<String> name,
        Output<Integer> port) {
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private HttpConfigArgs() {
        this.hosts = Codegen.empty();
        this.name = Codegen.empty();
        this.port = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<HttpHostConfigArgs>> hosts;
        private Output<String> name;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder hosts(Output<List<HttpHostConfigArgs>> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(List<HttpHostConfigArgs> hosts) {
            this.hosts = Output.of(Objects.requireNonNull(hosts));
            return this;
        }
        public Builder hosts(HttpHostConfigArgs... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public HttpConfigArgs build() {
            return new HttpConfigArgs(hosts, name, port);
        }
    }
}
