// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs Empty = new FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs();

    /**
     * Object that contains an attribute `items` that contains the list of field patterns in a field-level encryption content type profile specify the fields that you want to be encrypted.
     * 
     */
    @Import(name="fieldPatterns", required=true)
      private final Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns;

    public Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> getFieldPatterns() {
        return this.fieldPatterns;
    }

    /**
     * The provider associated with the public key being used for encryption.
     * 
     */
    @Import(name="providerId", required=true)
      private final Output<String> providerId;

    public Output<String> getProviderId() {
        return this.providerId;
    }

    /**
     * The public key associated with a set of field-level encryption patterns, to be used when encrypting the fields that match the patterns.
     * 
     */
    @Import(name="publicKeyId", required=true)
      private final Output<String> publicKeyId;

    public Output<String> getPublicKeyId() {
        return this.publicKeyId;
    }

    public FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs(
        Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns,
        Output<String> providerId,
        Output<String> publicKeyId) {
        this.fieldPatterns = Objects.requireNonNull(fieldPatterns, "expected parameter 'fieldPatterns' to be non-null");
        this.providerId = Objects.requireNonNull(providerId, "expected parameter 'providerId' to be non-null");
        this.publicKeyId = Objects.requireNonNull(publicKeyId, "expected parameter 'publicKeyId' to be non-null");
    }

    private FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs() {
        this.fieldPatterns = Codegen.empty();
        this.providerId = Codegen.empty();
        this.publicKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns;
        private Output<String> providerId;
        private Output<String> publicKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldPatterns = defaults.fieldPatterns;
    	      this.providerId = defaults.providerId;
    	      this.publicKeyId = defaults.publicKeyId;
        }

        public Builder fieldPatterns(Output<FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs> fieldPatterns) {
            this.fieldPatterns = Objects.requireNonNull(fieldPatterns);
            return this;
        }
        public Builder fieldPatterns(FieldLevelEncryptionProfileEncryptionEntitiesItemFieldPatternsGetArgs fieldPatterns) {
            this.fieldPatterns = Output.of(Objects.requireNonNull(fieldPatterns));
            return this;
        }
        public Builder providerId(Output<String> providerId) {
            this.providerId = Objects.requireNonNull(providerId);
            return this;
        }
        public Builder providerId(String providerId) {
            this.providerId = Output.of(Objects.requireNonNull(providerId));
            return this;
        }
        public Builder publicKeyId(Output<String> publicKeyId) {
            this.publicKeyId = Objects.requireNonNull(publicKeyId);
            return this;
        }
        public Builder publicKeyId(String publicKeyId) {
            this.publicKeyId = Output.of(Objects.requireNonNull(publicKeyId));
            return this;
        }        public FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs build() {
            return new FieldLevelEncryptionProfileEncryptionEntitiesItemGetArgs(fieldPatterns, providerId, publicKeyId);
        }
    }
}
