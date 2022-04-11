// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.PrivateLinkServiceConnectionStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @Import(name="actionsRequired")
      private final @Nullable Output<String> actionsRequired;

    public Output<String> getActionsRequired() {
        return this.actionsRequired == null ? Codegen.empty() : this.actionsRequired;
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @Import(name="status", required=true)
      private final Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

    public Output<Either<String,PrivateLinkServiceConnectionStatus>> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStateArgs(
        @Nullable Output<String> actionsRequired,
        Output<String> description,
        Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
        this.actionsRequired = actionsRequired;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
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
        private Output<String> description;
        private Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

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
        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
            return this;
        }
        public Builder status(Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(Either<String,PrivateLinkServiceConnectionStatus> status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public PrivateLinkServiceConnectionStateArgs build() {
            return new PrivateLinkServiceConnectionStateArgs(actionsRequired, description, status);
        }
    }
}
