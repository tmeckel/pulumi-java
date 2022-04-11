// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.inputs;

import io.pulumi.azurenative.aadiam.enums.PrivateEndpointServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An object that represents the approval state of the private link connection.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable Output<String> actionsRequired;

    public Output<String> getActionsRequired() {
        return this.actionsRequired == null ? Codegen.empty() : this.actionsRequired;
    }

    /**
     * The reason for approval or rejection.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Indicates whether the connection has been approved, rejected or removed by the given policy owner.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status;

    public Output<Either<String,PrivateEndpointServiceConnectionStatus>> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> actionsRequired,
        @Nullable Output<String> description,
        @Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    private PrivateLinkServiceConnectionStateArgs() {
        this.actionsRequired = Codegen.empty();
        this.description = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> actionsRequired;
        private @Nullable Output<String> description;
        private @Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }
        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = Codegen.ofNullable(actionsRequired);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,PrivateEndpointServiceConnectionStatus>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,PrivateEndpointServiceConnectionStatus> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
