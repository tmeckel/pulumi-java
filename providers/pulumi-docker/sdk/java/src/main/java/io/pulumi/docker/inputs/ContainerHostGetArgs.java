// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ContainerHostGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerHostGetArgs Empty = new ContainerHostGetArgs();

    @InputImport(name="host", required=true)
      private final Input<String> host;

    public Input<String> getHost() {
        return this.host;
    }

    @InputImport(name="ip", required=true)
      private final Input<String> ip;

    public Input<String> getIp() {
        return this.ip;
    }

    public ContainerHostGetArgs(
        Input<String> host,
        Input<String> ip) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.ip = Objects.requireNonNull(ip, "expected parameter 'ip' to be non-null");
    }

    private ContainerHostGetArgs() {
        this.host = Input.empty();
        this.ip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerHostGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> host;
        private Input<String> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerHostGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.ip = defaults.ip;
        }

        public Builder host(Input<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder host(String host) {
            this.host = Input.of(Objects.requireNonNull(host));
            return this;
        }

        public Builder ip(Input<String> ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }

        public Builder ip(String ip) {
            this.ip = Input.of(Objects.requireNonNull(ip));
            return this;
        }
        public ContainerHostGetArgs build() {
            return new ContainerHostGetArgs(host, ip);
        }
    }
}
