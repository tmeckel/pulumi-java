// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState {
    /**
     * @return A description of any extra actions that may be required.
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * @return The description for the private link service connection state.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Status of the the private link service connection. Can be Pending, Approved, Rejected, or Disconnected.
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState(
        @CustomType.Parameter("actionsRequired") @Nullable String actionsRequired,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("status") @Nullable String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * @return A description of any extra actions that may be required.
     * 
     */
    public Optional<String> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * @return The description for the private link service connection state.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Status of the the private link service connection. Can be Pending, Approved, Rejected, or Disconnected.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState build() {
            return new PrivateEndpointConnectionPropertiesResponsePrivateLinkServiceConnectionState(actionsRequired, description, status);
        }
    }
}
