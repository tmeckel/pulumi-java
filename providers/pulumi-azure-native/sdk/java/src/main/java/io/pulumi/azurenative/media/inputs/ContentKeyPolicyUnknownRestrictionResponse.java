// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a ContentKeyPolicyRestriction that is unavailable in the current API version.
 * 
 */
public final class ContentKeyPolicyUnknownRestrictionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContentKeyPolicyUnknownRestrictionResponse Empty = new ContentKeyPolicyUnknownRestrictionResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyUnknownRestriction'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyUnknownRestrictionResponse(String odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyUnknownRestrictionResponse() {
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyUnknownRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyUnknownRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public ContentKeyPolicyUnknownRestrictionResponse build() {
            return new ContentKeyPolicyUnknownRestrictionResponse(odataType);
        }
    }
}
