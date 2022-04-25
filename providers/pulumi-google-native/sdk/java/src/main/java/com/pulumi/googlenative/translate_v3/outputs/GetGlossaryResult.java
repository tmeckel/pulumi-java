// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.translate_v3.outputs.GlossaryInputConfigResponse;
import com.pulumi.googlenative.translate_v3.outputs.LanguageCodePairResponse;
import com.pulumi.googlenative.translate_v3.outputs.LanguageCodesSetResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlossaryResult {
    /**
     * @return When the glossary creation was finished.
     * 
     */
    private final String endTime;
    /**
     * @return The number of entries defined in the glossary.
     * 
     */
    private final Integer entryCount;
    /**
     * @return Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    private final GlossaryInputConfigResponse inputConfig;
    /**
     * @return Used with equivalent term set glossaries.
     * 
     */
    private final LanguageCodesSetResponse languageCodesSet;
    /**
     * @return Used with unidirectional glossaries.
     * 
     */
    private final LanguageCodePairResponse languagePair;
    /**
     * @return The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    private final String name;
    /**
     * @return When CreateGlossary was called.
     * 
     */
    private final String submitTime;

    @CustomType.Constructor
    private GetGlossaryResult(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("entryCount") Integer entryCount,
        @CustomType.Parameter("inputConfig") GlossaryInputConfigResponse inputConfig,
        @CustomType.Parameter("languageCodesSet") LanguageCodesSetResponse languageCodesSet,
        @CustomType.Parameter("languagePair") LanguageCodePairResponse languagePair,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("submitTime") String submitTime) {
        this.endTime = endTime;
        this.entryCount = entryCount;
        this.inputConfig = inputConfig;
        this.languageCodesSet = languageCodesSet;
        this.languagePair = languagePair;
        this.name = name;
        this.submitTime = submitTime;
    }

    /**
     * @return When the glossary creation was finished.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return The number of entries defined in the glossary.
     * 
     */
    public Integer entryCount() {
        return this.entryCount;
    }
    /**
     * @return Provides examples to build the glossary from. Total glossary must not exceed 10M Unicode codepoints.
     * 
     */
    public GlossaryInputConfigResponse inputConfig() {
        return this.inputConfig;
    }
    /**
     * @return Used with equivalent term set glossaries.
     * 
     */
    public LanguageCodesSetResponse languageCodesSet() {
        return this.languageCodesSet;
    }
    /**
     * @return Used with unidirectional glossaries.
     * 
     */
    public LanguageCodePairResponse languagePair() {
        return this.languagePair;
    }
    /**
     * @return The resource name of the glossary. Glossary names have the form `projects/{project-number-or-id}/locations/{location-id}/glossaries/{glossary-id}`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return When CreateGlossary was called.
     * 
     */
    public String submitTime() {
        return this.submitTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlossaryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private Integer entryCount;
        private GlossaryInputConfigResponse inputConfig;
        private LanguageCodesSetResponse languageCodesSet;
        private LanguageCodePairResponse languagePair;
        private String name;
        private String submitTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlossaryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.entryCount = defaults.entryCount;
    	      this.inputConfig = defaults.inputConfig;
    	      this.languageCodesSet = defaults.languageCodesSet;
    	      this.languagePair = defaults.languagePair;
    	      this.name = defaults.name;
    	      this.submitTime = defaults.submitTime;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder entryCount(Integer entryCount) {
            this.entryCount = Objects.requireNonNull(entryCount);
            return this;
        }
        public Builder inputConfig(GlossaryInputConfigResponse inputConfig) {
            this.inputConfig = Objects.requireNonNull(inputConfig);
            return this;
        }
        public Builder languageCodesSet(LanguageCodesSetResponse languageCodesSet) {
            this.languageCodesSet = Objects.requireNonNull(languageCodesSet);
            return this;
        }
        public Builder languagePair(LanguageCodePairResponse languagePair) {
            this.languagePair = Objects.requireNonNull(languagePair);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder submitTime(String submitTime) {
            this.submitTime = Objects.requireNonNull(submitTime);
            return this;
        }        public GetGlossaryResult build() {
            return new GetGlossaryResult(endTime, entryCount, inputConfig, languageCodesSet, languagePair, name, submitTime);
        }
    }
}
