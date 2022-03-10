// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserIdentityPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserIdentityPropertiesResponse Empty = new UserIdentityPropertiesResponse();

    /**
     * The client id of user assigned identity.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable String clientId;

    public Optional<String> getClientId() {
        return this.clientId == null ? Optional.empty() : Optional.ofNullable(this.clientId);
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @InputImport(name="principalId")
      private final @Nullable String principalId;

    public Optional<String> getPrincipalId() {
        return this.principalId == null ? Optional.empty() : Optional.ofNullable(this.principalId);
    }

    public UserIdentityPropertiesResponse(
        @Nullable String clientId,
        @Nullable String principalId) {
        this.clientId = clientId;
        this.principalId = principalId;
    }

    private UserIdentityPropertiesResponse() {
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserIdentityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserIdentityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder principalId(@Nullable String principalId) {
            this.principalId = principalId;
            return this;
        }
        public UserIdentityPropertiesResponse build() {
            return new UserIdentityPropertiesResponse(clientId, principalId);
        }
    }
}
