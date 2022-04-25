// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication configuration information
 * 
 */
public final class FhirServiceAuthenticationConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FhirServiceAuthenticationConfigurationResponse Empty = new FhirServiceAuthenticationConfigurationResponse();

    /**
     * The audience url for the service
     * 
     */
    @Import(name="audience")
    private @Nullable String audience;

    /**
     * @return The audience url for the service
     * 
     */
    public Optional<String> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * The authority url for the service
     * 
     */
    @Import(name="authority")
    private @Nullable String authority;

    /**
     * @return The authority url for the service
     * 
     */
    public Optional<String> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * If the SMART on FHIR proxy is enabled
     * 
     */
    @Import(name="smartProxyEnabled")
    private @Nullable Boolean smartProxyEnabled;

    /**
     * @return If the SMART on FHIR proxy is enabled
     * 
     */
    public Optional<Boolean> smartProxyEnabled() {
        return Optional.ofNullable(this.smartProxyEnabled);
    }

    private FhirServiceAuthenticationConfigurationResponse() {}

    private FhirServiceAuthenticationConfigurationResponse(FhirServiceAuthenticationConfigurationResponse $) {
        this.audience = $.audience;
        this.authority = $.authority;
        this.smartProxyEnabled = $.smartProxyEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirServiceAuthenticationConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirServiceAuthenticationConfigurationResponse $;

        public Builder() {
            $ = new FhirServiceAuthenticationConfigurationResponse();
        }

        public Builder(FhirServiceAuthenticationConfigurationResponse defaults) {
            $ = new FhirServiceAuthenticationConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param audience The audience url for the service
         * 
         * @return builder
         * 
         */
        public Builder audience(@Nullable String audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param authority The authority url for the service
         * 
         * @return builder
         * 
         */
        public Builder authority(@Nullable String authority) {
            $.authority = authority;
            return this;
        }

        /**
         * @param smartProxyEnabled If the SMART on FHIR proxy is enabled
         * 
         * @return builder
         * 
         */
        public Builder smartProxyEnabled(@Nullable Boolean smartProxyEnabled) {
            $.smartProxyEnabled = smartProxyEnabled;
            return this;
        }

        public FhirServiceAuthenticationConfigurationResponse build() {
            return $;
        }
    }

}
