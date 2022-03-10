// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a container endpoint.
 * 
 */
public final class EndpointPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointPropertiesResponse Empty = new EndpointPropertiesResponse();

    /**
     * The name of the endpoint.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Port used by the container.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public EndpointPropertiesResponse(
        String name,
        @Nullable Integer port) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = port;
    }

    private EndpointPropertiesResponse() {
        this.name = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public EndpointPropertiesResponse build() {
            return new EndpointPropertiesResponse(name, port);
        }
    }
}
