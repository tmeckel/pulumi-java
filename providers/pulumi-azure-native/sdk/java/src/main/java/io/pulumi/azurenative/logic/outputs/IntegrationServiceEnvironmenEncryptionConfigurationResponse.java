// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmenEncryptionKeyReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationServiceEnvironmenEncryptionConfigurationResponse {
    /**
     * The encryption key reference.
     * 
     */
    private final @Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference;

    @OutputCustomType.Constructor
    private IntegrationServiceEnvironmenEncryptionConfigurationResponse(@OutputCustomType.Parameter("encryptionKeyReference") @Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference) {
        this.encryptionKeyReference = encryptionKeyReference;
    }

    /**
     * The encryption key reference.
     * 
    */
    public Optional<IntegrationServiceEnvironmenEncryptionKeyReferenceResponse> getEncryptionKeyReference() {
        return Optional.ofNullable(this.encryptionKeyReference);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmenEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmenEncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionKeyReference = defaults.encryptionKeyReference;
        }

        public Builder encryptionKeyReference(@Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference) {
            this.encryptionKeyReference = encryptionKeyReference;
            return this;
        }
        public IntegrationServiceEnvironmenEncryptionConfigurationResponse build() {
            return new IntegrationServiceEnvironmenEncryptionConfigurationResponse(encryptionKeyReference);
        }
    }
}
