// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse;
import java.util.List;
import java.util.Objects;


/**
 * A list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse Empty = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse();

    /**
     * A list of cascading if-else conditions.
     * 
     */
    @InputImport(name="cases", required=true)
      private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases;

    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> getCases() {
        return this.cases;
    }

    public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases) {
        this.cases = Objects.requireNonNull(cases, "expected parameter 'cases' to be non-null");
    }

    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse() {
        this.cases = List.of();
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

        public Builder cases(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases) {
            this.cases = Objects.requireNonNull(cases);
            return this;
        }
        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse(cases);
        }
    }
}
