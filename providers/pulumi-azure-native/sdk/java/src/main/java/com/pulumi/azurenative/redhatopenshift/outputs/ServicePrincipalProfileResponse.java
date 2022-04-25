// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.redhatopenshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePrincipalProfileResponse {
    /**
     * @return The client ID used for the cluster (immutable).
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return The client secret used for the cluster (immutable).
     * 
     */
    private final @Nullable String clientSecret;

    @CustomType.Constructor
    private ServicePrincipalProfileResponse(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * @return The client ID used for the cluster (immutable).
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The client secret used for the cluster (immutable).
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }        public ServicePrincipalProfileResponse build() {
            return new ServicePrincipalProfileResponse(clientId, clientSecret);
        }
    }
}
