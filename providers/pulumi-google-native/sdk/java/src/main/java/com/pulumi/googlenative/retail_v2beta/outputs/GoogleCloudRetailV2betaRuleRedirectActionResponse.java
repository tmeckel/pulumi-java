// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaRuleRedirectActionResponse {
    /**
     * @return URL must have length equal or less than 2000 characters.
     * 
     */
    private final String redirectUri;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaRuleRedirectActionResponse(@CustomType.Parameter("redirectUri") String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * @return URL must have length equal or less than 2000 characters.
     * 
     */
    public String redirectUri() {
        return this.redirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String redirectUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleRedirectActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectUri = defaults.redirectUri;
        }

        public Builder redirectUri(String redirectUri) {
            this.redirectUri = Objects.requireNonNull(redirectUri);
            return this;
        }        public GoogleCloudRetailV2betaRuleRedirectActionResponse build() {
            return new GoogleCloudRetailV2betaRuleRedirectActionResponse(redirectUri);
        }
    }
}
