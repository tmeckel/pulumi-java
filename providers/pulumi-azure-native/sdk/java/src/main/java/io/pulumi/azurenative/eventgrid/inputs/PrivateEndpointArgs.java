// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PrivateEndpoint information.
 * 
 */
public final class PrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * The ARM identifier for Private Endpoint.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    public PrivateEndpointArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private PrivateEndpointArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }        public PrivateEndpointArgs build() {
            return new PrivateEndpointArgs(id);
        }
    }
}
