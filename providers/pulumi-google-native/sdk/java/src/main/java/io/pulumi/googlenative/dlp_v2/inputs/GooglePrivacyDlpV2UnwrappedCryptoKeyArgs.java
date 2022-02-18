// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Using raw keys is prone to security risks due to accidentally leaking the key. Choose another type of key if possible.
 * 
 */
public final class GooglePrivacyDlpV2UnwrappedCryptoKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2UnwrappedCryptoKeyArgs Empty = new GooglePrivacyDlpV2UnwrappedCryptoKeyArgs();

    /**
     * A 128/192/256 bit key.
     * 
     */
    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    public GooglePrivacyDlpV2UnwrappedCryptoKeyArgs(Input<String> key) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private GooglePrivacyDlpV2UnwrappedCryptoKeyArgs() {
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2UnwrappedCryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2UnwrappedCryptoKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public GooglePrivacyDlpV2UnwrappedCryptoKeyArgs build() {
            return new GooglePrivacyDlpV2UnwrappedCryptoKeyArgs(key);
        }
    }
}
