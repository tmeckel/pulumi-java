// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DictionaryResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ExcludeInfoTypesResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RegexResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The rule that specifies conditions when findings of infoTypes specified in `InspectionRuleSet` are removed from results.
 * 
 */
public final class GooglePrivacyDlpV2ExclusionRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ExclusionRuleResponse Empty = new GooglePrivacyDlpV2ExclusionRuleResponse();

    /**
     * Dictionary which defines the rule.
     * 
     */
    @InputImport(name="dictionary", required=true)
    private final GooglePrivacyDlpV2DictionaryResponse dictionary;

    public GooglePrivacyDlpV2DictionaryResponse getDictionary() {
        return this.dictionary;
    }

    /**
     * Set of infoTypes for which findings would affect this rule.
     * 
     */
    @InputImport(name="excludeInfoTypes", required=true)
    private final GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes;

    public GooglePrivacyDlpV2ExcludeInfoTypesResponse getExcludeInfoTypes() {
        return this.excludeInfoTypes;
    }

    /**
     * How the rule is applied, see MatchingType documentation for details.
     * 
     */
    @InputImport(name="matchingType", required=true)
    private final String matchingType;

    public String getMatchingType() {
        return this.matchingType;
    }

    /**
     * Regular expression which defines the rule.
     * 
     */
    @InputImport(name="regex", required=true)
    private final GooglePrivacyDlpV2RegexResponse regex;

    public GooglePrivacyDlpV2RegexResponse getRegex() {
        return this.regex;
    }

    public GooglePrivacyDlpV2ExclusionRuleResponse(
        GooglePrivacyDlpV2DictionaryResponse dictionary,
        GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes,
        String matchingType,
        GooglePrivacyDlpV2RegexResponse regex) {
        this.dictionary = Objects.requireNonNull(dictionary, "expected parameter 'dictionary' to be non-null");
        this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes, "expected parameter 'excludeInfoTypes' to be non-null");
        this.matchingType = Objects.requireNonNull(matchingType, "expected parameter 'matchingType' to be non-null");
        this.regex = Objects.requireNonNull(regex, "expected parameter 'regex' to be non-null");
    }

    private GooglePrivacyDlpV2ExclusionRuleResponse() {
        this.dictionary = null;
        this.excludeInfoTypes = null;
        this.matchingType = null;
        this.regex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExclusionRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2DictionaryResponse dictionary;
        private GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes;
        private String matchingType;
        private GooglePrivacyDlpV2RegexResponse regex;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExclusionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.matchingType = defaults.matchingType;
    	      this.regex = defaults.regex;
        }

        public Builder setDictionary(GooglePrivacyDlpV2DictionaryResponse dictionary) {
            this.dictionary = Objects.requireNonNull(dictionary);
            return this;
        }

        public Builder setExcludeInfoTypes(GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes) {
            this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes);
            return this;
        }

        public Builder setMatchingType(String matchingType) {
            this.matchingType = Objects.requireNonNull(matchingType);
            return this;
        }

        public Builder setRegex(GooglePrivacyDlpV2RegexResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }

        public GooglePrivacyDlpV2ExclusionRuleResponse build() {
            return new GooglePrivacyDlpV2ExclusionRuleResponse(dictionary, excludeInfoTypes, matchingType, regex);
        }
    }
}
