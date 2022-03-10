// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CiphertextArgs extends io.pulumi.resources.ResourceArgs {

    public static final CiphertextArgs Empty = new CiphertextArgs();

    /**
     * An optional mapping that makes up the encryption context.
     * 
     */
    @InputImport(name="context")
      private final @Nullable Input<Map<String,String>> context;

    public Input<Map<String,String>> getContext() {
        return this.context == null ? Input.empty() : this.context;
    }

    /**
     * Globally unique key ID for the customer master key.
     * 
     */
    @InputImport(name="keyId", required=true)
      private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    /**
     * Data to be encrypted. Note that this may show up in logs, and it will be stored in the state file.
     * 
     */
    @InputImport(name="plaintext", required=true)
      private final Input<String> plaintext;

    public Input<String> getPlaintext() {
        return this.plaintext;
    }

    public CiphertextArgs(
        @Nullable Input<Map<String,String>> context,
        Input<String> keyId,
        Input<String> plaintext) {
        this.context = context;
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.plaintext = Objects.requireNonNull(plaintext, "expected parameter 'plaintext' to be non-null");
    }

    private CiphertextArgs() {
        this.context = Input.empty();
        this.keyId = Input.empty();
        this.plaintext = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CiphertextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> context;
        private Input<String> keyId;
        private Input<String> plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(CiphertextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.keyId = defaults.keyId;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder context(@Nullable Input<Map<String,String>> context) {
            this.context = context;
            return this;
        }

        public Builder context(@Nullable Map<String,String> context) {
            this.context = Input.ofNullable(context);
            return this;
        }

        public Builder keyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder keyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public Builder plaintext(Input<String> plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }

        public Builder plaintext(String plaintext) {
            this.plaintext = Input.of(Objects.requireNonNull(plaintext));
            return this;
        }
        public CiphertextArgs build() {
            return new CiphertextArgs(context, keyId, plaintext);
        }
    }
}
