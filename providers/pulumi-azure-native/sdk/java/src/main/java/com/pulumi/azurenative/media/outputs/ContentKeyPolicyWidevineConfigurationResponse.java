// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContentKeyPolicyWidevineConfigurationResponse {
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyWidevineConfiguration&#39;.
     * 
     */
    private final String odataType;
    /**
     * @return The Widevine template.
     * 
     */
    private final String widevineTemplate;

    @CustomType.Constructor
    private ContentKeyPolicyWidevineConfigurationResponse(
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("widevineTemplate") String widevineTemplate) {
        this.odataType = odataType;
        this.widevineTemplate = widevineTemplate;
    }

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.ContentKeyPolicyWidevineConfiguration&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return The Widevine template.
     * 
     */
    public String widevineTemplate() {
        return this.widevineTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyWidevineConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String widevineTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyWidevineConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.widevineTemplate = defaults.widevineTemplate;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder widevineTemplate(String widevineTemplate) {
            this.widevineTemplate = Objects.requireNonNull(widevineTemplate);
            return this;
        }        public ContentKeyPolicyWidevineConfigurationResponse build() {
            return new ContentKeyPolicyWidevineConfigurationResponse(odataType, widevineTemplate);
        }
    }
}
