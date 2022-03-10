// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A message that holds specific allowed and denied values. This message can define specific values and subtrees of Cloud Resource Manager resource hierarchy (`Organizations`, `Folders`, `Projects`) that are allowed or denied. This is achieved by using the `under:` and optional `is:` prefixes. The `under:` prefix is used to denote resource subtree values. The `is:` prefix is used to denote specific values, and is required only if the value contains a ":". Values prefixed with "is:" are treated the same as values with no prefix. Ancestry subtrees must be in one of the following formats: - "projects/", e.g. "projects/tokyo-rain-123" - "folders/", e.g. "folders/1234" - "organizations/", e.g. "organizations/1234" The `supports_under` field of the associated `Constraint` defines whether ancestry prefixes can be used.
 * 
 */
public final class GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse Empty = new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse();

    /**
     * List of values allowed at this resource.
     * 
     */
    @InputImport(name="allowedValues", required=true)
      private final List<String> allowedValues;

    public List<String> getAllowedValues() {
        return this.allowedValues;
    }

    /**
     * List of values denied at this resource.
     * 
     */
    @InputImport(name="deniedValues", required=true)
      private final List<String> deniedValues;

    public List<String> getDeniedValues() {
        return this.deniedValues;
    }

    public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(
        List<String> allowedValues,
        List<String> deniedValues) {
        this.allowedValues = Objects.requireNonNull(allowedValues, "expected parameter 'allowedValues' to be non-null");
        this.deniedValues = Objects.requireNonNull(deniedValues, "expected parameter 'deniedValues' to be non-null");
    }

    private GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse() {
        this.allowedValues = List.of();
        this.deniedValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedValues;
        private List<String> deniedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.deniedValues = defaults.deniedValues;
        }

        public Builder allowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder deniedValues(List<String> deniedValues) {
            this.deniedValues = Objects.requireNonNull(deniedValues);
            return this;
        }
        public GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse build() {
            return new GoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValuesResponse(allowedValues, deniedValues);
        }
    }
}
