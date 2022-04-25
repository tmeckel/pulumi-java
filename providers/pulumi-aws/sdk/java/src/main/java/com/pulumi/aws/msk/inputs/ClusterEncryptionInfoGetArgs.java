// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.aws.msk.inputs.ClusterEncryptionInfoEncryptionInTransitGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEncryptionInfoGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionInfoGetArgs Empty = new ClusterEncryptionInfoGetArgs();

    /**
     * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
     * 
     */
    @Import(name="encryptionAtRestKmsKeyArn")
    private @Nullable Output<String> encryptionAtRestKmsKeyArn;

    /**
     * @return You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
     * 
     */
    public Optional<Output<String>> encryptionAtRestKmsKeyArn() {
        return Optional.ofNullable(this.encryptionAtRestKmsKeyArn);
    }

    /**
     * Configuration block to specify encryption in transit. See below.
     * 
     */
    @Import(name="encryptionInTransit")
    private @Nullable Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit;

    /**
     * @return Configuration block to specify encryption in transit. See below.
     * 
     */
    public Optional<Output<ClusterEncryptionInfoEncryptionInTransitGetArgs>> encryptionInTransit() {
        return Optional.ofNullable(this.encryptionInTransit);
    }

    private ClusterEncryptionInfoGetArgs() {}

    private ClusterEncryptionInfoGetArgs(ClusterEncryptionInfoGetArgs $) {
        this.encryptionAtRestKmsKeyArn = $.encryptionAtRestKmsKeyArn;
        this.encryptionInTransit = $.encryptionInTransit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEncryptionInfoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEncryptionInfoGetArgs $;

        public Builder() {
            $ = new ClusterEncryptionInfoGetArgs();
        }

        public Builder(ClusterEncryptionInfoGetArgs defaults) {
            $ = new ClusterEncryptionInfoGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionAtRestKmsKeyArn You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtRestKmsKeyArn(@Nullable Output<String> encryptionAtRestKmsKeyArn) {
            $.encryptionAtRestKmsKeyArn = encryptionAtRestKmsKeyArn;
            return this;
        }

        /**
         * @param encryptionAtRestKmsKeyArn You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS (&#39;aws/msk&#39; managed service) key will be used for encrypting the data at rest.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAtRestKmsKeyArn(String encryptionAtRestKmsKeyArn) {
            return encryptionAtRestKmsKeyArn(Output.of(encryptionAtRestKmsKeyArn));
        }

        /**
         * @param encryptionInTransit Configuration block to specify encryption in transit. See below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionInTransit(@Nullable Output<ClusterEncryptionInfoEncryptionInTransitGetArgs> encryptionInTransit) {
            $.encryptionInTransit = encryptionInTransit;
            return this;
        }

        /**
         * @param encryptionInTransit Configuration block to specify encryption in transit. See below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionInTransit(ClusterEncryptionInfoEncryptionInTransitGetArgs encryptionInTransit) {
            return encryptionInTransit(Output.of(encryptionInTransit));
        }

        public ClusterEncryptionInfoGetArgs build() {
            return $;
        }
    }

}
