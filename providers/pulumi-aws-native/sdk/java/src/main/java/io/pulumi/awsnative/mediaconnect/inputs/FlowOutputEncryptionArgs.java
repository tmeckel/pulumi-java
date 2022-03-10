// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.inputs;

import io.pulumi.awsnative.mediaconnect.enums.FlowOutputEncryptionAlgorithm;
import io.pulumi.awsnative.mediaconnect.enums.FlowOutputEncryptionKeyType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the encryption of the flow.
 * 
 */
public final class FlowOutputEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowOutputEncryptionArgs Empty = new FlowOutputEncryptionArgs();

    /**
     * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
     * 
     */
    @InputImport(name="algorithm")
      private final @Nullable Input<FlowOutputEncryptionAlgorithm> algorithm;

    public Input<FlowOutputEncryptionAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Input.empty() : this.algorithm;
    }

    /**
     * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
     * 
     */
    @InputImport(name="keyType")
      private final @Nullable Input<FlowOutputEncryptionKeyType> keyType;

    public Input<FlowOutputEncryptionKeyType> getKeyType() {
        return this.keyType == null ? Input.empty() : this.keyType;
    }

    /**
     * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     *  The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
     * 
     */
    @InputImport(name="secretArn", required=true)
      private final Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn;
    }

    public FlowOutputEncryptionArgs(
        @Nullable Input<FlowOutputEncryptionAlgorithm> algorithm,
        @Nullable Input<FlowOutputEncryptionKeyType> keyType,
        Input<String> roleArn,
        Input<String> secretArn) {
        this.algorithm = algorithm;
        this.keyType = keyType;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
    }

    private FlowOutputEncryptionArgs() {
        this.algorithm = Input.empty();
        this.keyType = Input.empty();
        this.roleArn = Input.empty();
        this.secretArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowOutputEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlowOutputEncryptionAlgorithm> algorithm;
        private @Nullable Input<FlowOutputEncryptionKeyType> keyType;
        private Input<String> roleArn;
        private Input<String> secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowOutputEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyType = defaults.keyType;
    	      this.roleArn = defaults.roleArn;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder algorithm(@Nullable Input<FlowOutputEncryptionAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder algorithm(@Nullable FlowOutputEncryptionAlgorithm algorithm) {
            this.algorithm = Input.ofNullable(algorithm);
            return this;
        }

        public Builder keyType(@Nullable Input<FlowOutputEncryptionKeyType> keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder keyType(@Nullable FlowOutputEncryptionKeyType keyType) {
            this.keyType = Input.ofNullable(keyType);
            return this;
        }

        public Builder roleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder roleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder secretArn(Input<String> secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }

        public Builder secretArn(String secretArn) {
            this.secretArn = Input.of(Objects.requireNonNull(secretArn));
            return this;
        }
        public FlowOutputEncryptionArgs build() {
            return new FlowOutputEncryptionArgs(algorithm, keyType, roleArn, secretArn);
        }
    }
}
