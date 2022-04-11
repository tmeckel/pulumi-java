// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs();

    /**
     * Partially mask a string by replacing a given number of characters with a fixed character.
     * Masking can start from the beginning or end of the string.
     * Structure is documented below.
     * 
     */
    @Import(name="characterMaskConfig")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> characterMaskConfig;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> getCharacterMaskConfig() {
        return this.characterMaskConfig == null ? Codegen.empty() : this.characterMaskConfig;
    }

    /**
     * Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC [https://tools.ietf.org/html/rfc5297](https://tools.ietf.org/html/rfc5297).
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoDeterministicConfig")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> cryptoDeterministicConfig;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> getCryptoDeterministicConfig() {
        return this.cryptoDeterministicConfig == null ? Codegen.empty() : this.cryptoDeterministicConfig;
    }

    /**
     * Replaces an identifier with a surrogate using Format Preserving Encryption (FPE) with the FFX mode of operation; however when used in the `content.reidentify` API method, it serves the opposite function by reversing the surrogate back into the original identifier. The identifier must be encoded as ASCII. For a given crypto key and context, the same identifier will be replaced with the same surrogate. Identifiers must be at least two characters long. In the case that the identifier is the empty string, it will be skipped. See [https://cloud.google.com/dlp/docs/pseudonymization](https://cloud.google.com/dlp/docs/pseudonymization) to learn more.
     * Note: We recommend using CryptoDeterministicConfig for all use cases which do not require preserving the input alphabet space and size, plus warrant referential integrity.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoReplaceFfxFpeConfig")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> getCryptoReplaceFfxFpeConfig() {
        return this.cryptoReplaceFfxFpeConfig == null ? Codegen.empty() : this.cryptoReplaceFfxFpeConfig;
    }

    /**
     * Replace each input value with a given value.
     * Structure is documented below.
     * 
     */
    @Import(name="replaceConfig")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> replaceConfig;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> getReplaceConfig() {
        return this.replaceConfig == null ? Codegen.empty() : this.replaceConfig;
    }

    /**
     * Replace each matching finding with the name of the info type.
     * 
     */
    @Import(name="replaceWithInfoTypeConfig")
      private final @Nullable Output<Boolean> replaceWithInfoTypeConfig;

    public Output<Boolean> getReplaceWithInfoTypeConfig() {
        return this.replaceWithInfoTypeConfig == null ? Codegen.empty() : this.replaceWithInfoTypeConfig;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs(
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> characterMaskConfig,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> cryptoDeterministicConfig,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> replaceConfig,
        @Nullable Output<Boolean> replaceWithInfoTypeConfig) {
        this.characterMaskConfig = characterMaskConfig;
        this.cryptoDeterministicConfig = cryptoDeterministicConfig;
        this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
        this.replaceConfig = replaceConfig;
        this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs() {
        this.characterMaskConfig = Codegen.empty();
        this.cryptoDeterministicConfig = Codegen.empty();
        this.cryptoReplaceFfxFpeConfig = Codegen.empty();
        this.replaceConfig = Codegen.empty();
        this.replaceWithInfoTypeConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> characterMaskConfig;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> cryptoDeterministicConfig;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> replaceConfig;
        private @Nullable Output<Boolean> replaceWithInfoTypeConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characterMaskConfig = defaults.characterMaskConfig;
    	      this.cryptoDeterministicConfig = defaults.cryptoDeterministicConfig;
    	      this.cryptoReplaceFfxFpeConfig = defaults.cryptoReplaceFfxFpeConfig;
    	      this.replaceConfig = defaults.replaceConfig;
    	      this.replaceWithInfoTypeConfig = defaults.replaceWithInfoTypeConfig;
        }

        public Builder characterMaskConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs> characterMaskConfig) {
            this.characterMaskConfig = characterMaskConfig;
            return this;
        }
        public Builder characterMaskConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigArgs characterMaskConfig) {
            this.characterMaskConfig = Codegen.ofNullable(characterMaskConfig);
            return this;
        }
        public Builder cryptoDeterministicConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs> cryptoDeterministicConfig) {
            this.cryptoDeterministicConfig = cryptoDeterministicConfig;
            return this;
        }
        public Builder cryptoDeterministicConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigArgs cryptoDeterministicConfig) {
            this.cryptoDeterministicConfig = Codegen.ofNullable(cryptoDeterministicConfig);
            return this;
        }
        public Builder cryptoReplaceFfxFpeConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig) {
            this.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
            return this;
        }
        public Builder cryptoReplaceFfxFpeConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs cryptoReplaceFfxFpeConfig) {
            this.cryptoReplaceFfxFpeConfig = Codegen.ofNullable(cryptoReplaceFfxFpeConfig);
            return this;
        }
        public Builder replaceConfig(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs> replaceConfig) {
            this.replaceConfig = replaceConfig;
            return this;
        }
        public Builder replaceConfig(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigArgs replaceConfig) {
            this.replaceConfig = Codegen.ofNullable(replaceConfig);
            return this;
        }
        public Builder replaceWithInfoTypeConfig(@Nullable Output<Boolean> replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
            return this;
        }
        public Builder replaceWithInfoTypeConfig(@Nullable Boolean replaceWithInfoTypeConfig) {
            this.replaceWithInfoTypeConfig = Codegen.ofNullable(replaceWithInfoTypeConfig);
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationArgs(characterMaskConfig, cryptoDeterministicConfig, cryptoReplaceFfxFpeConfig, replaceConfig, replaceWithInfoTypeConfig);
        }
    }
}
