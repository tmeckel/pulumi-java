// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.IntegrationServiceEnvironmenEncryptionKeyReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the integration service environment.
 * 
 */
public final class IntegrationServiceEnvironmenEncryptionConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final IntegrationServiceEnvironmenEncryptionConfigurationResponse Empty = new IntegrationServiceEnvironmenEncryptionConfigurationResponse();

    /**
     * The encryption key reference.
     * 
     */
    @Import(name="encryptionKeyReference")
    private @Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference;

    /**
     * @return The encryption key reference.
     * 
     */
    public Optional<IntegrationServiceEnvironmenEncryptionKeyReferenceResponse> encryptionKeyReference() {
        return Optional.ofNullable(this.encryptionKeyReference);
    }

    private IntegrationServiceEnvironmenEncryptionConfigurationResponse() {}

    private IntegrationServiceEnvironmenEncryptionConfigurationResponse(IntegrationServiceEnvironmenEncryptionConfigurationResponse $) {
        this.encryptionKeyReference = $.encryptionKeyReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationServiceEnvironmenEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationServiceEnvironmenEncryptionConfigurationResponse $;

        public Builder() {
            $ = new IntegrationServiceEnvironmenEncryptionConfigurationResponse();
        }

        public Builder(IntegrationServiceEnvironmenEncryptionConfigurationResponse defaults) {
            $ = new IntegrationServiceEnvironmenEncryptionConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionKeyReference The encryption key reference.
         * 
         * @return builder
         * 
         */
        public Builder encryptionKeyReference(@Nullable IntegrationServiceEnvironmenEncryptionKeyReferenceResponse encryptionKeyReference) {
            $.encryptionKeyReference = encryptionKeyReference;
            return this;
        }

        public IntegrationServiceEnvironmenEncryptionConfigurationResponse build() {
            return $;
        }
    }

}
