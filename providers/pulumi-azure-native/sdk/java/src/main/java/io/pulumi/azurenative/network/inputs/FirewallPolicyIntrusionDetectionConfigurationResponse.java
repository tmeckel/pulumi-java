// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse;
import io.pulumi.azurenative.network.inputs.FirewallPolicyIntrusionDetectionSignatureSpecificationResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The operation for configuring intrusion detection.
 * 
 */
public final class FirewallPolicyIntrusionDetectionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyIntrusionDetectionConfigurationResponse Empty = new FirewallPolicyIntrusionDetectionConfigurationResponse();

    /**
     * List of rules for traffic to bypass.
     * 
     */
    @InputImport(name="bypassTrafficSettings")
      private final @Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings;

    public List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> getBypassTrafficSettings() {
        return this.bypassTrafficSettings == null ? List.of() : this.bypassTrafficSettings;
    }

    /**
     * List of specific signatures states.
     * 
     */
    @InputImport(name="signatureOverrides")
      private final @Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides;

    public List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> getSignatureOverrides() {
        return this.signatureOverrides == null ? List.of() : this.signatureOverrides;
    }

    public FirewallPolicyIntrusionDetectionConfigurationResponse(
        @Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings,
        @Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides) {
        this.bypassTrafficSettings = bypassTrafficSettings;
        this.signatureOverrides = signatureOverrides;
    }

    private FirewallPolicyIntrusionDetectionConfigurationResponse() {
        this.bypassTrafficSettings = List.of();
        this.signatureOverrides = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIntrusionDetectionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings;
        private @Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIntrusionDetectionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassTrafficSettings = defaults.bypassTrafficSettings;
    	      this.signatureOverrides = defaults.signatureOverrides;
        }

        public Builder bypassTrafficSettings(@Nullable List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsResponse> bypassTrafficSettings) {
            this.bypassTrafficSettings = bypassTrafficSettings;
            return this;
        }

        public Builder signatureOverrides(@Nullable List<FirewallPolicyIntrusionDetectionSignatureSpecificationResponse> signatureOverrides) {
            this.signatureOverrides = signatureOverrides;
            return this;
        }
        public FirewallPolicyIntrusionDetectionConfigurationResponse build() {
            return new FirewallPolicyIntrusionDetectionConfigurationResponse(bypassTrafficSettings, signatureOverrides);
        }
    }
}
