// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore {
    /**
     * Characters to not transform when masking.
     * 
     */
    private final @Nullable String charactersToSkip;
    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
     * 
     */
    private final @Nullable String commonCharactersToIgnore;

    @OutputCustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore(
        @OutputCustomType.Parameter("charactersToSkip") @Nullable String charactersToSkip,
        @OutputCustomType.Parameter("commonCharactersToIgnore") @Nullable String commonCharactersToIgnore) {
        this.charactersToSkip = charactersToSkip;
        this.commonCharactersToIgnore = commonCharactersToIgnore;
    }

    /**
     * Characters to not transform when masking.
     * 
    */
    public Optional<String> getCharactersToSkip() {
        return Optional.ofNullable(this.charactersToSkip);
    }
    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * Possible values are `NUMERIC`, `ALPHA_UPPER_CASE`, `ALPHA_LOWER_CASE`, `PUNCTUATION`, and `WHITESPACE`.
     * 
    */
    public Optional<String> getCommonCharactersToIgnore() {
        return Optional.ofNullable(this.commonCharactersToIgnore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String charactersToSkip;
        private @Nullable String commonCharactersToIgnore;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToSkip = defaults.charactersToSkip;
    	      this.commonCharactersToIgnore = defaults.commonCharactersToIgnore;
        }

        public Builder charactersToSkip(@Nullable String charactersToSkip) {
            this.charactersToSkip = charactersToSkip;
            return this;
        }

        public Builder commonCharactersToIgnore(@Nullable String commonCharactersToIgnore) {
            this.commonCharactersToIgnore = commonCharactersToIgnore;
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore(charactersToSkip, commonCharactersToIgnore);
        }
    }
}
