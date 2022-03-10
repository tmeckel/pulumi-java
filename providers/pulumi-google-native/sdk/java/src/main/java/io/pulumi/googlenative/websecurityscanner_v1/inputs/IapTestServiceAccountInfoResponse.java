// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
 * 
 */
public final class IapTestServiceAccountInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IapTestServiceAccountInfoResponse Empty = new IapTestServiceAccountInfoResponse();

    /**
     * Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
     * 
     */
    @InputImport(name="targetAudienceClientId", required=true)
      private final String targetAudienceClientId;

    public String getTargetAudienceClientId() {
        return this.targetAudienceClientId;
    }

    public IapTestServiceAccountInfoResponse(String targetAudienceClientId) {
        this.targetAudienceClientId = Objects.requireNonNull(targetAudienceClientId, "expected parameter 'targetAudienceClientId' to be non-null");
    }

    private IapTestServiceAccountInfoResponse() {
        this.targetAudienceClientId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IapTestServiceAccountInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetAudienceClientId;

        public Builder() {
    	      // Empty
        }

        public Builder(IapTestServiceAccountInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetAudienceClientId = defaults.targetAudienceClientId;
        }

        public Builder targetAudienceClientId(String targetAudienceClientId) {
            this.targetAudienceClientId = Objects.requireNonNull(targetAudienceClientId);
            return this;
        }
        public IapTestServiceAccountInfoResponse build() {
            return new IapTestServiceAccountInfoResponse(targetAudienceClientId);
        }
    }
}
