// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureStaticWebAppsRegistrationResponse {
    /**
     * @return The Client ID of the app used for login.
     * 
     */
    private final @Nullable String clientId;

    @CustomType.Constructor
    private AzureStaticWebAppsRegistrationResponse(@CustomType.Parameter("clientId") @Nullable String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return The Client ID of the app used for login.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStaticWebAppsRegistrationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStaticWebAppsRegistrationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }        public AzureStaticWebAppsRegistrationResponse build() {
            return new AzureStaticWebAppsRegistrationResponse(clientId);
        }
    }
}
