// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse {
    /**
     * @return Additional cases to be evaluated.
     * 
     */
    private final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases;
    /**
     * @return Returned message.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageResponse message;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse(
        @CustomType.Parameter("additionalCases") GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases,
        @CustomType.Parameter("message") GoogleCloudDialogflowCxV3ResponseMessageResponse message) {
        this.additionalCases = additionalCases;
        this.message = message;
    }

    /**
     * @return Additional cases to be evaluated.
     * 
     */
    public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases() {
        return this.additionalCases;
    }
    /**
     * @return Returned message.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageResponse message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases;
        private GoogleCloudDialogflowCxV3ResponseMessageResponse message;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCases = defaults.additionalCases;
    	      this.message = defaults.message;
        }

        public Builder additionalCases(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases) {
            this.additionalCases = Objects.requireNonNull(additionalCases);
            return this;
        }
        public Builder message(GoogleCloudDialogflowCxV3ResponseMessageResponse message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse(additionalCases, message);
        }
    }
}
