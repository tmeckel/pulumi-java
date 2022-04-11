// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentConnectedEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentConnectedEndpointGetArgs Empty = new ServiceAttachmentConnectedEndpointGetArgs();

    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Codegen.empty() : this.endpoint;
    }

    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public ServiceAttachmentConnectedEndpointGetArgs(
        @Nullable Output<String> endpoint,
        @Nullable Output<String> status) {
        this.endpoint = endpoint;
        this.status = status;
    }

    private ServiceAttachmentConnectedEndpointGetArgs() {
        this.endpoint = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConnectedEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConnectedEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.status = defaults.status;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Codegen.ofNullable(endpoint);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public ServiceAttachmentConnectedEndpointGetArgs build() {
            return new ServiceAttachmentConnectedEndpointGetArgs(endpoint, status);
        }
    }
}
