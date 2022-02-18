// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.translate_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Used with equivalent term set glossaries.
 * 
 */
public final class LanguageCodesSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final LanguageCodesSetResponse Empty = new LanguageCodesSetResponse();

    /**
     * The BCP-47 language code(s) for terms defined in the glossary. All entries are unique. The list contains at least two entries. Expected to be an exact match for GlossaryTerm.language_code.
     * 
     */
    @InputImport(name="languageCodes", required=true)
    private final List<String> languageCodes;

    public List<String> getLanguageCodes() {
        return this.languageCodes;
    }

    public LanguageCodesSetResponse(List<String> languageCodes) {
        this.languageCodes = Objects.requireNonNull(languageCodes, "expected parameter 'languageCodes' to be non-null");
    }

    private LanguageCodesSetResponse() {
        this.languageCodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LanguageCodesSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> languageCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(LanguageCodesSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.languageCodes = defaults.languageCodes;
        }

        public Builder setLanguageCodes(List<String> languageCodes) {
            this.languageCodes = Objects.requireNonNull(languageCodes);
            return this;
        }

        public LanguageCodesSetResponse build() {
            return new LanguageCodesSetResponse(languageCodes);
        }
    }
}
