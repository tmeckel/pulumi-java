// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1.inputs.CustomFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Increment a streamz counter with the specified metric and field names. Metric names should start with a '/', generally be lowercase-only, and end in "_count". Field names should not contain an initial slash. The actual exported metric names will have "/iam/policy" prepended. Field names correspond to IAM request parameters and field values are their respective values. Supported field names: - "authority", which is "[token]" if IAMContext.token is present, otherwise the value of IAMContext.authority_selector if present, and otherwise a representation of IAMContext.principal; or - "iam_principal", a representation of IAMContext.principal even if a token or authority selector is present; or - "" (empty string), resulting in a counter with no fields. Examples: counter { metric: "/debug_access_count" field: "iam_principal" } ==> increment counter /iam/policy/debug_access_count {iam_principal=[value of IAMContext.principal]}
 * 
 */
public final class CounterOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CounterOptionsResponse Empty = new CounterOptionsResponse();

    /**
     * Custom fields.
     * 
     */
    @InputImport(name="customFields", required=true)
      private final List<CustomFieldResponse> customFields;

    public List<CustomFieldResponse> getCustomFields() {
        return this.customFields;
    }

    /**
     * The field value to attribute.
     * 
     */
    @InputImport(name="field", required=true)
      private final String field;

    public String getField() {
        return this.field;
    }

    /**
     * The metric to update.
     * 
     */
    @InputImport(name="metric", required=true)
      private final String metric;

    public String getMetric() {
        return this.metric;
    }

    public CounterOptionsResponse(
        List<CustomFieldResponse> customFields,
        String field,
        String metric) {
        this.customFields = Objects.requireNonNull(customFields, "expected parameter 'customFields' to be non-null");
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private CounterOptionsResponse() {
        this.customFields = List.of();
        this.field = null;
        this.metric = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CounterOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CustomFieldResponse> customFields;
        private String field;
        private String metric;

        public Builder() {
    	      // Empty
        }

        public Builder(CounterOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder customFields(List<CustomFieldResponse> customFields) {
            this.customFields = Objects.requireNonNull(customFields);
            return this;
        }

        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder metric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public CounterOptionsResponse build() {
            return new CounterOptionsResponse(customFields, field, metric);
        }
    }
}
