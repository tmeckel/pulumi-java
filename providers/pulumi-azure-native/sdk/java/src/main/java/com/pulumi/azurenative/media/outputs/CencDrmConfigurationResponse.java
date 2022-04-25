// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.StreamingPolicyPlayReadyConfigurationResponse;
import com.pulumi.azurenative.media.outputs.StreamingPolicyWidevineConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CencDrmConfigurationResponse {
    /**
     * @return PlayReady configurations
     * 
     */
    private final @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
    /**
     * @return Widevine configurations
     * 
     */
    private final @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

    @CustomType.Constructor
    private CencDrmConfigurationResponse(
        @CustomType.Parameter("playReady") @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady,
        @CustomType.Parameter("widevine") @Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
        this.playReady = playReady;
        this.widevine = widevine;
    }

    /**
     * @return PlayReady configurations
     * 
     */
    public Optional<StreamingPolicyPlayReadyConfigurationResponse> playReady() {
        return Optional.ofNullable(this.playReady);
    }
    /**
     * @return Widevine configurations
     * 
     */
    public Optional<StreamingPolicyWidevineConfigurationResponse> widevine() {
        return Optional.ofNullable(this.widevine);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CencDrmConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
        private @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CencDrmConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
        }

        public Builder playReady(@Nullable StreamingPolicyPlayReadyConfigurationResponse playReady) {
            this.playReady = playReady;
            return this;
        }
        public Builder widevine(@Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
            this.widevine = widevine;
            return this;
        }        public CencDrmConfigurationResponse build() {
            return new CencDrmConfigurationResponse(playReady, widevine);
        }
    }
}
