// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Any additional Tenant IDs which should be used for authentication.
     * 
     */
    @InputImport(name="auxiliaryTenantIds", json=true)
      private final @Nullable Input<List<String>> auxiliaryTenantIds;

    public Input<List<String>> getAuxiliaryTenantIds() {
        return this.auxiliaryTenantIds == null ? Input.empty() : this.auxiliaryTenantIds;
    }

    /**
     * The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client Certificate
     * 
     */
    @InputImport(name="clientCertificatePassword")
      private final @Nullable Input<String> clientCertificatePassword;

    public Input<String> getClientCertificatePassword() {
        return this.clientCertificatePassword == null ? Input.empty() : this.clientCertificatePassword;
    }

    /**
     * The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service Principal using a Client Certificate.
     * 
     */
    @InputImport(name="clientCertificatePath")
      private final @Nullable Input<String> clientCertificatePath;

    public Input<String> getClientCertificatePath() {
        return this.clientCertificatePath == null ? Input.empty() : this.clientCertificatePath;
    }

    /**
     * The Client ID which should be used.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
     * 
     */
    @InputImport(name="clientSecret")
      private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * This will disable the Pulumi Partner ID which is used if a custom `partnerId` isn't specified.
     * 
     */
    @InputImport(name="disablePulumiPartnerId", json=true)
      private final @Nullable Input<Boolean> disablePulumiPartnerId;

    public Input<Boolean> getDisablePulumiPartnerId() {
        return this.disablePulumiPartnerId == null ? Input.empty() : this.disablePulumiPartnerId;
    }

    /**
     * The Cloud Environment which should be used. Possible values are public, usgovernment, german, and china. Defaults to public.
     * 
     */
    @InputImport(name="environment")
      private final @Nullable Input<String> environment;

    public Input<String> getEnvironment() {
        return this.environment == null ? Input.empty() : this.environment;
    }

    /**
     * The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected automatically.
     * 
     */
    @InputImport(name="msiEndpoint")
      private final @Nullable Input<String> msiEndpoint;

    public Input<String> getMsiEndpoint() {
        return this.msiEndpoint == null ? Input.empty() : this.msiEndpoint;
    }

    /**
     * A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
     * 
     */
    @InputImport(name="partnerId")
      private final @Nullable Input<String> partnerId;

    public Input<String> getPartnerId() {
        return this.partnerId == null ? Input.empty() : this.partnerId;
    }

    /**
     * The Subscription ID which should be used.
     * 
     */
    @InputImport(name="subscriptionId")
      private final @Nullable Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId == null ? Input.empty() : this.subscriptionId;
    }

    /**
     * The Tenant ID which should be used.
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    /**
     * Allowed Managed Service Identity be used for Authentication.
     * 
     */
    @InputImport(name="useMsi", json=true)
      private final @Nullable Input<Boolean> useMsi;

    public Input<Boolean> getUseMsi() {
        return this.useMsi == null ? Input.empty() : this.useMsi;
    }

    public ProviderArgs(
        @Nullable Input<List<String>> auxiliaryTenantIds,
        @Nullable Input<String> clientCertificatePassword,
        @Nullable Input<String> clientCertificatePath,
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<Boolean> disablePulumiPartnerId,
        @Nullable Input<String> environment,
        @Nullable Input<String> msiEndpoint,
        @Nullable Input<String> partnerId,
        @Nullable Input<String> subscriptionId,
        @Nullable Input<String> tenantId,
        @Nullable Input<Boolean> useMsi) {
        this.auxiliaryTenantIds = auxiliaryTenantIds;
        this.clientCertificatePassword = clientCertificatePassword;
        this.clientCertificatePath = clientCertificatePath;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.disablePulumiPartnerId = disablePulumiPartnerId;
        this.environment = environment == null ? Input.ofNullable("public") : environment;
        this.msiEndpoint = msiEndpoint;
        this.partnerId = partnerId;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
        this.useMsi = useMsi == null ? Input.ofNullable(false) : useMsi;
    }

    private ProviderArgs() {
        this.auxiliaryTenantIds = Input.empty();
        this.clientCertificatePassword = Input.empty();
        this.clientCertificatePath = Input.empty();
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.disablePulumiPartnerId = Input.empty();
        this.environment = Input.empty();
        this.msiEndpoint = Input.empty();
        this.partnerId = Input.empty();
        this.subscriptionId = Input.empty();
        this.tenantId = Input.empty();
        this.useMsi = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> auxiliaryTenantIds;
        private @Nullable Input<String> clientCertificatePassword;
        private @Nullable Input<String> clientCertificatePath;
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<Boolean> disablePulumiPartnerId;
        private @Nullable Input<String> environment;
        private @Nullable Input<String> msiEndpoint;
        private @Nullable Input<String> partnerId;
        private @Nullable Input<String> subscriptionId;
        private @Nullable Input<String> tenantId;
        private @Nullable Input<Boolean> useMsi;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTenantIds = defaults.auxiliaryTenantIds;
    	      this.clientCertificatePassword = defaults.clientCertificatePassword;
    	      this.clientCertificatePath = defaults.clientCertificatePath;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.disablePulumiPartnerId = defaults.disablePulumiPartnerId;
    	      this.environment = defaults.environment;
    	      this.msiEndpoint = defaults.msiEndpoint;
    	      this.partnerId = defaults.partnerId;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
    	      this.useMsi = defaults.useMsi;
        }

        public Builder auxiliaryTenantIds(@Nullable Input<List<String>> auxiliaryTenantIds) {
            this.auxiliaryTenantIds = auxiliaryTenantIds;
            return this;
        }

        public Builder auxiliaryTenantIds(@Nullable List<String> auxiliaryTenantIds) {
            this.auxiliaryTenantIds = Input.ofNullable(auxiliaryTenantIds);
            return this;
        }

        public Builder clientCertificatePassword(@Nullable Input<String> clientCertificatePassword) {
            this.clientCertificatePassword = Input.ofNullable(clientCertificatePassword).asSecret();
            return this;
        }

        public Builder clientCertificatePassword(@Nullable String clientCertificatePassword) {
            this.clientCertificatePassword = Input.ofNullable(clientCertificatePassword).asSecret();
            return this;
        }

        public Builder clientCertificatePath(@Nullable Input<String> clientCertificatePath) {
            this.clientCertificatePath = clientCertificatePath;
            return this;
        }

        public Builder clientCertificatePath(@Nullable String clientCertificatePath) {
            this.clientCertificatePath = Input.ofNullable(clientCertificatePath);
            return this;
        }

        public Builder clientId(@Nullable Input<String> clientId) {
            this.clientId = Input.ofNullable(clientId).asSecret();
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId).asSecret();
            return this;
        }

        public Builder clientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret).asSecret();
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret).asSecret();
            return this;
        }

        public Builder disablePulumiPartnerId(@Nullable Input<Boolean> disablePulumiPartnerId) {
            this.disablePulumiPartnerId = disablePulumiPartnerId;
            return this;
        }

        public Builder disablePulumiPartnerId(@Nullable Boolean disablePulumiPartnerId) {
            this.disablePulumiPartnerId = Input.ofNullable(disablePulumiPartnerId);
            return this;
        }

        public Builder environment(@Nullable Input<String> environment) {
            this.environment = environment;
            return this;
        }

        public Builder environment(@Nullable String environment) {
            this.environment = Input.ofNullable(environment);
            return this;
        }

        public Builder msiEndpoint(@Nullable Input<String> msiEndpoint) {
            this.msiEndpoint = msiEndpoint;
            return this;
        }

        public Builder msiEndpoint(@Nullable String msiEndpoint) {
            this.msiEndpoint = Input.ofNullable(msiEndpoint);
            return this;
        }

        public Builder partnerId(@Nullable Input<String> partnerId) {
            this.partnerId = partnerId;
            return this;
        }

        public Builder partnerId(@Nullable String partnerId) {
            this.partnerId = Input.ofNullable(partnerId);
            return this;
        }

        public Builder subscriptionId(@Nullable Input<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Input.ofNullable(subscriptionId);
            return this;
        }

        public Builder tenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }

        public Builder useMsi(@Nullable Input<Boolean> useMsi) {
            this.useMsi = useMsi;
            return this;
        }

        public Builder useMsi(@Nullable Boolean useMsi) {
            this.useMsi = Input.ofNullable(useMsi);
            return this;
        }
        public ProviderArgs build() {
            return new ProviderArgs(auxiliaryTenantIds, clientCertificatePassword, clientCertificatePath, clientId, clientSecret, disablePulumiPartnerId, environment, msiEndpoint, partnerId, subscriptionId, tenantId, useMsi);
        }
    }
}
