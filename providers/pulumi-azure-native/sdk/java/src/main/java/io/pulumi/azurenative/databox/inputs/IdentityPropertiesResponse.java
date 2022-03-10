// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.UserAssignedPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed identity properties.
 * 
 */
public final class IdentityPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityPropertiesResponse Empty = new IdentityPropertiesResponse();

    /**
     * Managed service identity type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * User assigned identity properties.
     * 
     */
    @InputImport(name="userAssigned")
      private final @Nullable UserAssignedPropertiesResponse userAssigned;

    public Optional<UserAssignedPropertiesResponse> getUserAssigned() {
        return this.userAssigned == null ? Optional.empty() : Optional.ofNullable(this.userAssigned);
    }

    public IdentityPropertiesResponse(
        @Nullable String type,
        @Nullable UserAssignedPropertiesResponse userAssigned) {
        this.type = type;
        this.userAssigned = userAssigned;
    }

    private IdentityPropertiesResponse() {
        this.type = null;
        this.userAssigned = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable UserAssignedPropertiesResponse userAssigned;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssigned = defaults.userAssigned;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder userAssigned(@Nullable UserAssignedPropertiesResponse userAssigned) {
            this.userAssigned = userAssigned;
            return this;
        }
        public IdentityPropertiesResponse build() {
            return new IdentityPropertiesResponse(type, userAssigned);
        }
    }
}
