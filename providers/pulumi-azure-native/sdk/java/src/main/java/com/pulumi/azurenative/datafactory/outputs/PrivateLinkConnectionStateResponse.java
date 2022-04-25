// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkConnectionStateResponse {
    /**
     * @return ActionsRequired for a private link connection
     * 
     */
    private final @Nullable String actionsRequired;
    /**
     * @return Description of a private link connection
     * 
     */
    private final @Nullable String description;
    /**
     * @return Status of a private link connection
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private PrivateLinkConnectionStateResponse(
        @CustomType.Parameter("actionsRequired") @Nullable String actionsRequired,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("status") @Nullable String status) {
        this.actionsRequired = actionsRequired;
        this.description = description;
        this.status = status;
    }

    /**
     * @return ActionsRequired for a private link connection
     * 
     */
    public Optional<String> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }
    /**
     * @return Description of a private link connection
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Status of a private link connection
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionsRequired;
        private @Nullable String description;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkConnectionStateResponse defaults) {
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
        }        public PrivateLinkConnectionStateResponse build() {
            return new PrivateLinkConnectionStateResponse(actionsRequired, description, status);
        }
    }
}
