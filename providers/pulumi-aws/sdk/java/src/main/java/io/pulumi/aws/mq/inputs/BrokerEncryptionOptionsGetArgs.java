// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BrokerEncryptionOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BrokerEncryptionOptionsGetArgs Empty = new BrokerEncryptionOptionsGetArgs();

    /**
     * Amazon Resource Name (ARN) of Key Management Service (KMS) Customer Master Key (CMK) to use for encryption at rest. Requires setting `use_aws_owned_key` to `false`. To perform drift detection when AWS-managed CMKs or customer-managed CMKs are in use, this value must be configured.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Whether to enable an AWS-owned KMS CMK that is not in your account. Defaults to `true`. Setting to `false` without configuring `kms_key_id` will create an AWS-managed CMK aliased to `aws/mq` in your account.
     * 
     */
    @InputImport(name="useAwsOwnedKey")
      private final @Nullable Input<Boolean> useAwsOwnedKey;

    public Input<Boolean> getUseAwsOwnedKey() {
        return this.useAwsOwnedKey == null ? Input.empty() : this.useAwsOwnedKey;
    }

    public BrokerEncryptionOptionsGetArgs(
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<Boolean> useAwsOwnedKey) {
        this.kmsKeyId = kmsKeyId;
        this.useAwsOwnedKey = useAwsOwnedKey;
    }

    private BrokerEncryptionOptionsGetArgs() {
        this.kmsKeyId = Input.empty();
        this.useAwsOwnedKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerEncryptionOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<Boolean> useAwsOwnedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerEncryptionOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.useAwsOwnedKey = defaults.useAwsOwnedKey;
        }

        public Builder kmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder useAwsOwnedKey(@Nullable Input<Boolean> useAwsOwnedKey) {
            this.useAwsOwnedKey = useAwsOwnedKey;
            return this;
        }

        public Builder useAwsOwnedKey(@Nullable Boolean useAwsOwnedKey) {
            this.useAwsOwnedKey = Input.ofNullable(useAwsOwnedKey);
            return this;
        }
        public BrokerEncryptionOptionsGetArgs build() {
            return new BrokerEncryptionOptionsGetArgs(kmsKeyId, useAwsOwnedKey);
        }
    }
}
