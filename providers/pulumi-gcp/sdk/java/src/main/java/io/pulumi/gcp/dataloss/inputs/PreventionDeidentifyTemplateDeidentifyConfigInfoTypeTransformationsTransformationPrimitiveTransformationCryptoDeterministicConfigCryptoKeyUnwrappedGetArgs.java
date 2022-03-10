// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs();

    /**
     * A 128/192/256 bit key.
     * A base64-encoded string.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs(Input<String> key) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs() {
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyUnwrappedGetArgs(key);
        }
    }
}
