// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.eks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption provider for the cluster.
 * 
 */
public final class ClusterEncryptionConfigProviderPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionConfigProviderPropertiesArgs Empty = new ClusterEncryptionConfigProviderPropertiesArgs();

    /**
     * Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
     * 
     */
    @Import(name="keyArn")
    private @Nullable Output<String> keyArn;

    /**
     * @return Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
     * 
     */
    public Optional<Output<String>> keyArn() {
        return Optional.ofNullable(this.keyArn);
    }

    private ClusterEncryptionConfigProviderPropertiesArgs() {}

    private ClusterEncryptionConfigProviderPropertiesArgs(ClusterEncryptionConfigProviderPropertiesArgs $) {
        this.keyArn = $.keyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEncryptionConfigProviderPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEncryptionConfigProviderPropertiesArgs $;

        public Builder() {
            $ = new ClusterEncryptionConfigProviderPropertiesArgs();
        }

        public Builder(ClusterEncryptionConfigProviderPropertiesArgs defaults) {
            $ = new ClusterEncryptionConfigProviderPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyArn Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
         * 
         * @return builder
         * 
         */
        public Builder keyArn(@Nullable Output<String> keyArn) {
            $.keyArn = keyArn;
            return this;
        }

        /**
         * @param keyArn Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key.
         * 
         * @return builder
         * 
         */
        public Builder keyArn(String keyArn) {
            return keyArn(Output.of(keyArn));
        }

        public ClusterEncryptionConfigProviderPropertiesArgs build() {
            return $;
        }
    }

}
