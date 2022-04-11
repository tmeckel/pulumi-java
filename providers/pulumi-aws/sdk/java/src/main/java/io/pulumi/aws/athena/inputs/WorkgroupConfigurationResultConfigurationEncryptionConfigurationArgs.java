// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs Empty = new WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs();

    /**
     * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (`SSE_S3`), server-side encryption with KMS-managed keys (`SSE_KMS`), or client-side encryption with KMS-managed keys (`CSE_KMS`) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
     * 
     */
    @Import(name="encryptionOption")
      private final @Nullable Output<String> encryptionOption;

    public Output<String> getEncryptionOption() {
        return this.encryptionOption == null ? Codegen.empty() : this.encryptionOption;
    }

    /**
     * For `SSE_KMS` and `CSE_KMS`, this is the KMS key Amazon Resource Name (ARN).
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Codegen.empty() : this.kmsKeyArn;
    }

    public WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs(
        @Nullable Output<String> encryptionOption,
        @Nullable Output<String> kmsKeyArn) {
        this.encryptionOption = encryptionOption;
        this.kmsKeyArn = kmsKeyArn;
    }

    private WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs() {
        this.encryptionOption = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptionOption;
        private @Nullable Output<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionOption = defaults.encryptionOption;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder encryptionOption(@Nullable Output<String> encryptionOption) {
            this.encryptionOption = encryptionOption;
            return this;
        }
        public Builder encryptionOption(@Nullable String encryptionOption) {
            this.encryptionOption = Codegen.ofNullable(encryptionOption);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Codegen.ofNullable(kmsKeyArn);
            return this;
        }        public WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs build() {
            return new WorkgroupConfigurationResultConfigurationEncryptionConfigurationArgs(encryptionOption, kmsKeyArn);
        }
    }
}
