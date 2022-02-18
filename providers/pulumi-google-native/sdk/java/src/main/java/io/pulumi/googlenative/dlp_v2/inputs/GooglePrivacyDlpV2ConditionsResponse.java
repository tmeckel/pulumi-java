// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ConditionResponse;
import java.util.List;
import java.util.Objects;


/**
 * A collection of conditions.
 * 
 */
public final class GooglePrivacyDlpV2ConditionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ConditionsResponse Empty = new GooglePrivacyDlpV2ConditionsResponse();

    /**
     * A collection of conditions.
     * 
     */
    @InputImport(name="conditions", required=true)
    private final List<GooglePrivacyDlpV2ConditionResponse> conditions;

    public List<GooglePrivacyDlpV2ConditionResponse> getConditions() {
        return this.conditions;
    }

    public GooglePrivacyDlpV2ConditionsResponse(List<GooglePrivacyDlpV2ConditionResponse> conditions) {
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
    }

    private GooglePrivacyDlpV2ConditionsResponse() {
        this.conditions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ConditionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2ConditionResponse> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ConditionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(List<GooglePrivacyDlpV2ConditionResponse> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public GooglePrivacyDlpV2ConditionsResponse build() {
            return new GooglePrivacyDlpV2ConditionsResponse(conditions);
        }
    }
}
