// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.inputs;

import io.pulumi.awsnative.healthlake.inputs.FHIRDatastoreKmsEncryptionConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * The server-side encryption key configuration for a customer provided encryption key.
 * 
 */
public final class FHIRDatastoreSseConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FHIRDatastoreSseConfigurationArgs Empty = new FHIRDatastoreSseConfigurationArgs();

    @Import(name="kmsEncryptionConfig", required=true)
      private final Output<FHIRDatastoreKmsEncryptionConfigArgs> kmsEncryptionConfig;

    public Output<FHIRDatastoreKmsEncryptionConfigArgs> getKmsEncryptionConfig() {
        return this.kmsEncryptionConfig;
    }

    public FHIRDatastoreSseConfigurationArgs(Output<FHIRDatastoreKmsEncryptionConfigArgs> kmsEncryptionConfig) {
        this.kmsEncryptionConfig = Objects.requireNonNull(kmsEncryptionConfig, "expected parameter 'kmsEncryptionConfig' to be non-null");
    }

    private FHIRDatastoreSseConfigurationArgs() {
        this.kmsEncryptionConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastoreSseConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FHIRDatastoreKmsEncryptionConfigArgs> kmsEncryptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastoreSseConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsEncryptionConfig = defaults.kmsEncryptionConfig;
        }

        public Builder kmsEncryptionConfig(Output<FHIRDatastoreKmsEncryptionConfigArgs> kmsEncryptionConfig) {
            this.kmsEncryptionConfig = Objects.requireNonNull(kmsEncryptionConfig);
            return this;
        }
        public Builder kmsEncryptionConfig(FHIRDatastoreKmsEncryptionConfigArgs kmsEncryptionConfig) {
            this.kmsEncryptionConfig = Output.of(Objects.requireNonNull(kmsEncryptionConfig));
            return this;
        }        public FHIRDatastoreSseConfigurationArgs build() {
            return new FHIRDatastoreSseConfigurationArgs(kmsEncryptionConfig);
        }
    }
}
