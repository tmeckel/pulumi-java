// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Used with equivalent term set glossaries.
 * 
 */
public final class LanguageCodesSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LanguageCodesSetArgs Empty = new LanguageCodesSetArgs();

    /**
     * The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    @InputImport(name="languageCodes")
      private final @Nullable Input<List<String>> languageCodes;

    public Input<List<String>> getLanguageCodes() {
        return this.languageCodes == null ? Input.empty() : this.languageCodes;
    }

    public LanguageCodesSetArgs(@Nullable Input<List<String>> languageCodes) {
        this.languageCodes = languageCodes;
    }

    private LanguageCodesSetArgs() {
        this.languageCodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageCodesSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> languageCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageCodesSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.languageCodes = defaults.languageCodes;
        }

        public Builder languageCodes(@Nullable Input<List<String>> languageCodes) {
            this.languageCodes = languageCodes;
            return this;
        }

        public Builder languageCodes(@Nullable List<String> languageCodes) {
            this.languageCodes = Input.ofNullable(languageCodes);
            return this;
        }
        public LanguageCodesSetArgs build() {
            return new LanguageCodesSetArgs(languageCodes);
        }
    }
}
