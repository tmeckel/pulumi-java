// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs Empty = new SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs();

    /**
     * Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
     * 
     */
    @Import(name="cloudwatchEncryptionMode")
    private @Nullable Output<String> cloudwatchEncryptionMode;

    /**
     * @return Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
     * 
     */
    public Optional<Output<String>> cloudwatchEncryptionMode() {
        return Optional.ofNullable(this.cloudwatchEncryptionMode);
    }

    /**
     * Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    private SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs() {}

    private SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs $) {
        this.cloudwatchEncryptionMode = $.cloudwatchEncryptionMode;
        this.kmsKeyArn = $.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs $;

        public Builder() {
            $ = new SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs();
        }

        public Builder(SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs defaults) {
            $ = new SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchEncryptionMode Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchEncryptionMode(@Nullable Output<String> cloudwatchEncryptionMode) {
            $.cloudwatchEncryptionMode = cloudwatchEncryptionMode;
            return this;
        }

        /**
         * @param cloudwatchEncryptionMode Encryption mode to use for CloudWatch data. Valid values: `DISABLED`, `SSE-KMS`. Default value: `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchEncryptionMode(String cloudwatchEncryptionMode) {
            return cloudwatchEncryptionMode(Output.of(cloudwatchEncryptionMode));
        }

        /**
         * @param kmsKeyArn Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn Amazon Resource Name (ARN) of the KMS key to be used to encrypt the data.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        public SecurityConfigurationEncryptionConfigurationCloudwatchEncryptionGetArgs build() {
            return $;
        }
    }

}
