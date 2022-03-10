// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContentKeyPolicyFairPlayConfigurationResponse {
    /**
     * The key that must be used as FairPlay Application Secret key.
     * 
     */
    private final String ask;
    /**
     * The Base64 representation of FairPlay certificate in PKCS 12 (pfx) format (including private key).
     * 
     */
    private final String fairPlayPfx;
    /**
     * The password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     * 
     */
    private final String fairPlayPfxPassword;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration'.
     * 
     */
    private final String odataType;
    /**
     * Offline rental policy
     * 
     */
    private final @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration;
    /**
     * The rental and lease key type.
     * 
     */
    private final String rentalAndLeaseKeyType;
    /**
     * The rental duration. Must be greater than or equal to 0.
     * 
     */
    private final Double rentalDuration;

    @OutputCustomType.Constructor
    private ContentKeyPolicyFairPlayConfigurationResponse(
        @OutputCustomType.Parameter("ask") String ask,
        @OutputCustomType.Parameter("fairPlayPfx") String fairPlayPfx,
        @OutputCustomType.Parameter("fairPlayPfxPassword") String fairPlayPfxPassword,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("offlineRentalConfiguration") @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration,
        @OutputCustomType.Parameter("rentalAndLeaseKeyType") String rentalAndLeaseKeyType,
        @OutputCustomType.Parameter("rentalDuration") Double rentalDuration) {
        this.ask = ask;
        this.fairPlayPfx = fairPlayPfx;
        this.fairPlayPfxPassword = fairPlayPfxPassword;
        this.odataType = odataType;
        this.offlineRentalConfiguration = offlineRentalConfiguration;
        this.rentalAndLeaseKeyType = rentalAndLeaseKeyType;
        this.rentalDuration = rentalDuration;
    }

    /**
     * The key that must be used as FairPlay Application Secret key.
     * 
    */
    public String getAsk() {
        return this.ask;
    }
    /**
     * The Base64 representation of FairPlay certificate in PKCS 12 (pfx) format (including private key).
     * 
    */
    public String getFairPlayPfx() {
        return this.fairPlayPfx;
    }
    /**
     * The password encrypting FairPlay certificate in PKCS 12 (pfx) format.
     * 
    */
    public String getFairPlayPfxPassword() {
        return this.fairPlayPfxPassword;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyFairPlayConfiguration'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Offline rental policy
     * 
    */
    public Optional<ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse> getOfflineRentalConfiguration() {
        return Optional.ofNullable(this.offlineRentalConfiguration);
    }
    /**
     * The rental and lease key type.
     * 
    */
    public String getRentalAndLeaseKeyType() {
        return this.rentalAndLeaseKeyType;
    }
    /**
     * The rental duration. Must be greater than or equal to 0.
     * 
    */
    public Double getRentalDuration() {
        return this.rentalDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyFairPlayConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ask;
        private String fairPlayPfx;
        private String fairPlayPfxPassword;
        private String odataType;
        private @Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration;
        private String rentalAndLeaseKeyType;
        private Double rentalDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyFairPlayConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ask = defaults.ask;
    	      this.fairPlayPfx = defaults.fairPlayPfx;
    	      this.fairPlayPfxPassword = defaults.fairPlayPfxPassword;
    	      this.odataType = defaults.odataType;
    	      this.offlineRentalConfiguration = defaults.offlineRentalConfiguration;
    	      this.rentalAndLeaseKeyType = defaults.rentalAndLeaseKeyType;
    	      this.rentalDuration = defaults.rentalDuration;
        }

        public Builder ask(String ask) {
            this.ask = Objects.requireNonNull(ask);
            return this;
        }

        public Builder fairPlayPfx(String fairPlayPfx) {
            this.fairPlayPfx = Objects.requireNonNull(fairPlayPfx);
            return this;
        }

        public Builder fairPlayPfxPassword(String fairPlayPfxPassword) {
            this.fairPlayPfxPassword = Objects.requireNonNull(fairPlayPfxPassword);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder offlineRentalConfiguration(@Nullable ContentKeyPolicyFairPlayOfflineRentalConfigurationResponse offlineRentalConfiguration) {
            this.offlineRentalConfiguration = offlineRentalConfiguration;
            return this;
        }

        public Builder rentalAndLeaseKeyType(String rentalAndLeaseKeyType) {
            this.rentalAndLeaseKeyType = Objects.requireNonNull(rentalAndLeaseKeyType);
            return this;
        }

        public Builder rentalDuration(Double rentalDuration) {
            this.rentalDuration = Objects.requireNonNull(rentalDuration);
            return this;
        }
        public ContentKeyPolicyFairPlayConfigurationResponse build() {
            return new ContentKeyPolicyFairPlayConfigurationResponse(ask, fairPlayPfx, fairPlayPfxPassword, odataType, offlineRentalConfiguration, rentalAndLeaseKeyType, rentalDuration);
        }
    }
}
