// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketObjectCustomerEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectCustomerEncryptionArgs Empty = new BucketObjectCustomerEncryptionArgs();

    /**
     * Encryption algorithm. Default: AES256
     * 
     */
    @Import(name="encryptionAlgorithm")
      private final @Nullable Output<String> encryptionAlgorithm;

    public Output<String> getEncryptionAlgorithm() {
        return this.encryptionAlgorithm == null ? Codegen.empty() : this.encryptionAlgorithm;
    }

    /**
     * Base64 encoded Customer-Supplied Encryption Key.
     * 
     */
    @Import(name="encryptionKey", required=true)
      private final Output<String> encryptionKey;

    public Output<String> getEncryptionKey() {
        return this.encryptionKey;
    }

    public BucketObjectCustomerEncryptionArgs(
        @Nullable Output<String> encryptionAlgorithm,
        Output<String> encryptionKey) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        this.encryptionKey = Objects.requireNonNull(encryptionKey, "expected parameter 'encryptionKey' to be non-null");
    }

    private BucketObjectCustomerEncryptionArgs() {
        this.encryptionAlgorithm = Codegen.empty();
        this.encryptionKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectCustomerEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptionAlgorithm;
        private Output<String> encryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectCustomerEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.encryptionKey = defaults.encryptionKey;
        }

        public Builder encryptionAlgorithm(@Nullable Output<String> encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public Builder encryptionAlgorithm(@Nullable String encryptionAlgorithm) {
            this.encryptionAlgorithm = Codegen.ofNullable(encryptionAlgorithm);
            return this;
        }
        public Builder encryptionKey(Output<String> encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Output.of(Objects.requireNonNull(encryptionKey));
            return this;
        }        public BucketObjectCustomerEncryptionArgs build() {
            return new BucketObjectCustomerEncryptionArgs(encryptionAlgorithm, encryptionKey);
        }
    }
}
