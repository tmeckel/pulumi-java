// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse {
    /**
     * A list of cascading if-else conditions.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases;

    @OutputCustomType.Constructor({"cases"})
    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases) {
        this.cases = Objects.requireNonNull(cases);
    }

    /**
     * A list of cascading if-else conditions.
     * 
     */
    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> getCases() {
        return this.cases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
        }

        public Builder setCases(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases) {
            this.cases = Objects.requireNonNull(cases);
            return this;
        }

        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse(cases);
        }
    }
}
