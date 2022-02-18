// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.enums.PublicKeyCredentialFormat;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A public key format and data.
 * 
 */
public final class PublicKeyCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicKeyCredentialArgs Empty = new PublicKeyCredentialArgs();

    /**
     * The format of the key.
     * 
     */
    @InputImport(name="format")
    private final @Nullable Input<PublicKeyCredentialFormat> format;

    public Input<PublicKeyCredentialFormat> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * The key data.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public PublicKeyCredentialArgs(
        @Nullable Input<PublicKeyCredentialFormat> format,
        @Nullable Input<String> key) {
        this.format = format;
        this.key = key;
    }

    private PublicKeyCredentialArgs() {
        this.format = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PublicKeyCredentialFormat> format;
        private @Nullable Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.key = defaults.key;
        }

        public Builder setFormat(@Nullable Input<PublicKeyCredentialFormat> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable PublicKeyCredentialFormat format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public PublicKeyCredentialArgs build() {
            return new PublicKeyCredentialArgs(format, key);
        }
    }
}
