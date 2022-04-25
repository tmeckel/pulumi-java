// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AzureStaticWebAppsRegistrationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureStaticWebAppsResponse {
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The configuration settings of the Azure Static Web Apps registration.
     * 
     */
    private final @Nullable AzureStaticWebAppsRegistrationResponse registration;

    @CustomType.Constructor
    private AzureStaticWebAppsResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("registration") @Nullable AzureStaticWebAppsRegistrationResponse registration) {
        this.enabled = enabled;
        this.registration = registration;
    }

    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Azure Static Web Apps provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The configuration settings of the Azure Static Web Apps registration.
     * 
     */
    public Optional<AzureStaticWebAppsRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStaticWebAppsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable AzureStaticWebAppsRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStaticWebAppsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder registration(@Nullable AzureStaticWebAppsRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }        public AzureStaticWebAppsResponse build() {
            return new AzureStaticWebAppsResponse(enabled, registration);
        }
    }
}
