// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigCustomInfoType;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigInfoType;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigLimits;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSet;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionInspectTemplateInspectConfig {
    /**
     * List of options defining data content to scan. If empty, text, images, and other content will be included.
     * Each value may be one of `CONTENT_TEXT` and `CONTENT_IMAGE`.
     * 
     */
    private final @Nullable List<String> contentOptions;
    /**
     * Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PreventionInspectTemplateInspectConfigCustomInfoType> customInfoTypes;
    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable Boolean excludeInfoTypes;
    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response.
     * 
     */
    private final @Nullable Boolean includeQuote;
    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PreventionInspectTemplateInspectConfigInfoType> infoTypes;
    /**
     * Configuration to control the number of findings returned.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigLimits limits;
    /**
     * Only returns findings equal or above this threshold. See https://cloud.google.com/dlp/docs/likelihood for more info
     * Default value is `POSSIBLE`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    private final @Nullable String minLikelihood;
    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
     * other rules are executed in the order they are specified for each info type.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PreventionInspectTemplateInspectConfigRuleSet> ruleSets;

    @OutputCustomType.Constructor
    private PreventionInspectTemplateInspectConfig(
        @OutputCustomType.Parameter("contentOptions") @Nullable List<String> contentOptions,
        @OutputCustomType.Parameter("customInfoTypes") @Nullable List<PreventionInspectTemplateInspectConfigCustomInfoType> customInfoTypes,
        @OutputCustomType.Parameter("excludeInfoTypes") @Nullable Boolean excludeInfoTypes,
        @OutputCustomType.Parameter("includeQuote") @Nullable Boolean includeQuote,
        @OutputCustomType.Parameter("infoTypes") @Nullable List<PreventionInspectTemplateInspectConfigInfoType> infoTypes,
        @OutputCustomType.Parameter("limits") @Nullable PreventionInspectTemplateInspectConfigLimits limits,
        @OutputCustomType.Parameter("minLikelihood") @Nullable String minLikelihood,
        @OutputCustomType.Parameter("ruleSets") @Nullable List<PreventionInspectTemplateInspectConfigRuleSet> ruleSets) {
        this.contentOptions = contentOptions;
        this.customInfoTypes = customInfoTypes;
        this.excludeInfoTypes = excludeInfoTypes;
        this.includeQuote = includeQuote;
        this.infoTypes = infoTypes;
        this.limits = limits;
        this.minLikelihood = minLikelihood;
        this.ruleSets = ruleSets;
    }

    /**
     * List of options defining data content to scan. If empty, text, images, and other content will be included.
     * Each value may be one of `CONTENT_TEXT` and `CONTENT_IMAGE`.
     * 
    */
    public List<String> getContentOptions() {
        return this.contentOptions == null ? List.of() : this.contentOptions;
    }
    /**
     * Custom info types to be used. See https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
     * Structure is documented below.
     * 
    */
    public List<PreventionInspectTemplateInspectConfigCustomInfoType> getCustomInfoTypes() {
        return this.customInfoTypes == null ? List.of() : this.customInfoTypes;
    }
    /**
     * Set of infoTypes for which findings would affect this rule.
     * Structure is documented below.
     * 
    */
    public Optional<Boolean> getExcludeInfoTypes() {
        return Optional.ofNullable(this.excludeInfoTypes);
    }
    /**
     * When true, a contextual quote from the data that triggered a finding is included in the response.
     * 
    */
    public Optional<Boolean> getIncludeQuote() {
        return Optional.ofNullable(this.includeQuote);
    }
    /**
     * If a finding is matched by any of the infoType detectors listed here, the finding will be excluded from the scan results.
     * Structure is documented below.
     * 
    */
    public List<PreventionInspectTemplateInspectConfigInfoType> getInfoTypes() {
        return this.infoTypes == null ? List.of() : this.infoTypes;
    }
    /**
     * Configuration to control the number of findings returned.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionInspectTemplateInspectConfigLimits> getLimits() {
        return Optional.ofNullable(this.limits);
    }
    /**
     * Only returns findings equal or above this threshold. See https://cloud.google.com/dlp/docs/likelihood for more info
     * Default value is `POSSIBLE`.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
    */
    public Optional<String> getMinLikelihood() {
        return Optional.ofNullable(this.minLikelihood);
    }
    /**
     * Set of rules to apply to the findings for this InspectConfig. Exclusion rules, contained in the set are executed in the end,
     * other rules are executed in the order they are specified for each info type.
     * Structure is documented below.
     * 
    */
    public List<PreventionInspectTemplateInspectConfigRuleSet> getRuleSets() {
        return this.ruleSets == null ? List.of() : this.ruleSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> contentOptions;
        private @Nullable List<PreventionInspectTemplateInspectConfigCustomInfoType> customInfoTypes;
        private @Nullable Boolean excludeInfoTypes;
        private @Nullable Boolean includeQuote;
        private @Nullable List<PreventionInspectTemplateInspectConfigInfoType> infoTypes;
        private @Nullable PreventionInspectTemplateInspectConfigLimits limits;
        private @Nullable String minLikelihood;
        private @Nullable List<PreventionInspectTemplateInspectConfigRuleSet> ruleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentOptions = defaults.contentOptions;
    	      this.customInfoTypes = defaults.customInfoTypes;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.includeQuote = defaults.includeQuote;
    	      this.infoTypes = defaults.infoTypes;
    	      this.limits = defaults.limits;
    	      this.minLikelihood = defaults.minLikelihood;
    	      this.ruleSets = defaults.ruleSets;
        }

        public Builder contentOptions(@Nullable List<String> contentOptions) {
            this.contentOptions = contentOptions;
            return this;
        }

        public Builder customInfoTypes(@Nullable List<PreventionInspectTemplateInspectConfigCustomInfoType> customInfoTypes) {
            this.customInfoTypes = customInfoTypes;
            return this;
        }

        public Builder excludeInfoTypes(@Nullable Boolean excludeInfoTypes) {
            this.excludeInfoTypes = excludeInfoTypes;
            return this;
        }

        public Builder includeQuote(@Nullable Boolean includeQuote) {
            this.includeQuote = includeQuote;
            return this;
        }

        public Builder infoTypes(@Nullable List<PreventionInspectTemplateInspectConfigInfoType> infoTypes) {
            this.infoTypes = infoTypes;
            return this;
        }

        public Builder limits(@Nullable PreventionInspectTemplateInspectConfigLimits limits) {
            this.limits = limits;
            return this;
        }

        public Builder minLikelihood(@Nullable String minLikelihood) {
            this.minLikelihood = minLikelihood;
            return this;
        }

        public Builder ruleSets(@Nullable List<PreventionInspectTemplateInspectConfigRuleSet> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }
        public PreventionInspectTemplateInspectConfig build() {
            return new PreventionInspectTemplateInspectConfig(contentOptions, customInfoTypes, excludeInfoTypes, includeQuote, infoTypes, limits, minLikelihood, ruleSets);
        }
    }
}
