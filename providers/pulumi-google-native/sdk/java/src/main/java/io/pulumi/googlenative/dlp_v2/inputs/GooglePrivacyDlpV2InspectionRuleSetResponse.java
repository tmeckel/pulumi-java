// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectionRuleResponse;
import java.util.List;
import java.util.Objects;


/**
 * Rule set for modifying a set of infoTypes to alter behavior under certain circumstances, depending on the specific details of the rules within the set.
 * 
 */
public final class GooglePrivacyDlpV2InspectionRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectionRuleSetResponse Empty = new GooglePrivacyDlpV2InspectionRuleSetResponse();

    /**
     * List of infoTypes this rule set is applied to.
     * 
     */
    @InputImport(name="infoTypes", required=true)
      private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    public List<GooglePrivacyDlpV2InfoTypeResponse> getInfoTypes() {
        return this.infoTypes;
    }

    /**
     * Set of rules to be applied to infoTypes. The rules are applied in order.
     * 
     */
    @InputImport(name="rules", required=true)
      private final List<GooglePrivacyDlpV2InspectionRuleResponse> rules;

    public List<GooglePrivacyDlpV2InspectionRuleResponse> getRules() {
        return this.rules;
    }

    public GooglePrivacyDlpV2InspectionRuleSetResponse(
        List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes,
        List<GooglePrivacyDlpV2InspectionRuleResponse> rules) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
    }

    private GooglePrivacyDlpV2InspectionRuleSetResponse() {
        this.infoTypes = List.of();
        this.rules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectionRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;
        private List<GooglePrivacyDlpV2InspectionRuleResponse> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectionRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
    	      this.rules = defaults.rules;
        }

        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public Builder rules(List<GooglePrivacyDlpV2InspectionRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public GooglePrivacyDlpV2InspectionRuleSetResponse build() {
            return new GooglePrivacyDlpV2InspectionRuleSetResponse(infoTypes, rules);
        }
    }
}
