// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PrivateLinkServiceConnectionStateResponse {
    /**
     * Actions required for a private endpoint connection
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    private final String description;
    /**
     * The status of a private endpoint connection
     * 
     */
    private final String status;

    @OutputCustomType.Constructor
    private PrivateLinkServiceConnectionStateResponse(
        @OutputCustomType.Parameter("actionsRequired") @Nullable String actionsRequired,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("status") String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * Actions required for a private endpoint connection
     * 
    */
    public Optional<String> getActionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * The description for the current state of a private endpoint connection
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The status of a private endpoint connection
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private String description;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsRequired = defaults.actionsRequired;
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder actionsRequired(@Nullable String actionsRequired) {
            this.actionsRequired = actionsRequired;
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public PrivateLinkServiceConnectionStateResponse build() {
            return new PrivateLinkServiceConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
