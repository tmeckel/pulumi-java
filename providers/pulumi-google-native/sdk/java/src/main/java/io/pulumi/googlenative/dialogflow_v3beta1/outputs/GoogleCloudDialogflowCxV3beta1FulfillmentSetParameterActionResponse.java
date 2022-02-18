// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse {
    /**
     * Display name of the parameter.
     * 
     */
    private final String parameter;
    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    private final Object value;

    @OutputCustomType.Constructor({"parameter","value"})
    private GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse(
        String parameter,
        Object value) {
        this.parameter = Objects.requireNonNull(parameter);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Display name of the parameter.
     * 
     */
    public String getParameter() {
        return this.parameter;
    }
    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    public Object getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameter;
        private Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.value = defaults.value;
        }

        public Builder setParameter(String parameter) {
            this.parameter = Objects.requireNonNull(parameter);
            return this;
        }

        public Builder setValue(Object value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionResponse(parameter, value);
        }
    }
}
