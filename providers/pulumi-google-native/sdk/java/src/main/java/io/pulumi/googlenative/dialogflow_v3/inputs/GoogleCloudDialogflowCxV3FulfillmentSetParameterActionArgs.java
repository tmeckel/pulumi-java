// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Setting a parameter value.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs Empty = new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs();

    /**
     * Display name of the parameter.
     * 
     */
    @InputImport(name="parameter")
      private final @Nullable Input<String> parameter;

    public Input<String> getParameter() {
        return this.parameter == null ? Input.empty() : this.parameter;
    }

    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<Object> value;

    public Input<Object> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs(
        @Nullable Input<String> parameter,
        @Nullable Input<Object> value) {
        this.parameter = parameter;
        this.value = value;
    }

    private GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs() {
        this.parameter = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> parameter;
        private @Nullable Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.value = defaults.value;
        }

        public Builder parameter(@Nullable Input<String> parameter) {
            this.parameter = parameter;
            return this;
        }

        public Builder parameter(@Nullable String parameter) {
            this.parameter = Input.ofNullable(parameter);
            return this;
        }

        public Builder value(@Nullable Input<Object> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable Object value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs build() {
            return new GoogleCloudDialogflowCxV3FulfillmentSetParameterActionArgs(parameter, value);
        }
    }
}
