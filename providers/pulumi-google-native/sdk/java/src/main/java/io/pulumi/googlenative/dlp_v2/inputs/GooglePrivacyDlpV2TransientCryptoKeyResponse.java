// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Use this to have a random data crypto key generated. It will be discarded after the request finishes.
 * 
 */
public final class GooglePrivacyDlpV2TransientCryptoKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TransientCryptoKeyResponse Empty = new GooglePrivacyDlpV2TransientCryptoKeyResponse();

    /**
     * Name of the key. This is an arbitrary string used to differentiate different keys. A unique key is generated per name: two separate `TransientCryptoKey` protos share the same generated key if their names are the same. When the data crypto key is generated, this name is not used in any way (repeating the api call will result in a different key being generated).
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GooglePrivacyDlpV2TransientCryptoKeyResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GooglePrivacyDlpV2TransientCryptoKeyResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TransientCryptoKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TransientCryptoKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GooglePrivacyDlpV2TransientCryptoKeyResponse build() {
            return new GooglePrivacyDlpV2TransientCryptoKeyResponse(name);
        }
    }
}
