// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs Empty = new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs();

    /**
     * The encryption-at-rest mode for encrypting Data Catalog data. Valid values are `DISABLED` and `SSE-KMS`.
     * 
     */
    @Import(name="catalogEncryptionMode", required=true)
      private final Output<String> catalogEncryptionMode;

    public Output<String> getCatalogEncryptionMode() {
        return this.catalogEncryptionMode;
    }

    /**
     * The ARN of the AWS KMS key to use for encryption at rest.
     * 
     */
    @Import(name="sseAwsKmsKeyId")
      private final @Nullable Output<String> sseAwsKmsKeyId;

    public Output<String> getSseAwsKmsKeyId() {
        return this.sseAwsKmsKeyId == null ? Codegen.empty() : this.sseAwsKmsKeyId;
    }

    public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs(
        Output<String> catalogEncryptionMode,
        @Nullable Output<String> sseAwsKmsKeyId) {
        this.catalogEncryptionMode = Objects.requireNonNull(catalogEncryptionMode, "expected parameter 'catalogEncryptionMode' to be non-null");
        this.sseAwsKmsKeyId = sseAwsKmsKeyId;
    }

    private DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs() {
        this.catalogEncryptionMode = Codegen.empty();
        this.sseAwsKmsKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> catalogEncryptionMode;
        private @Nullable Output<String> sseAwsKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogEncryptionMode = defaults.catalogEncryptionMode;
    	      this.sseAwsKmsKeyId = defaults.sseAwsKmsKeyId;
        }

        public Builder catalogEncryptionMode(Output<String> catalogEncryptionMode) {
            this.catalogEncryptionMode = Objects.requireNonNull(catalogEncryptionMode);
            return this;
        }
        public Builder catalogEncryptionMode(String catalogEncryptionMode) {
            this.catalogEncryptionMode = Output.of(Objects.requireNonNull(catalogEncryptionMode));
            return this;
        }
        public Builder sseAwsKmsKeyId(@Nullable Output<String> sseAwsKmsKeyId) {
            this.sseAwsKmsKeyId = sseAwsKmsKeyId;
            return this;
        }
        public Builder sseAwsKmsKeyId(@Nullable String sseAwsKmsKeyId) {
            this.sseAwsKmsKeyId = Codegen.ofNullable(sseAwsKmsKeyId);
            return this;
        }        public DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs build() {
            return new DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestGetArgs(catalogEncryptionMode, sseAwsKmsKeyId);
        }
    }
}
