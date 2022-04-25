// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceFunctionBindingResponse;
import com.pulumi.azurenative.streamanalytics.outputs.FunctionInputResponse;
import com.pulumi.azurenative.streamanalytics.outputs.FunctionOutputResponse;
import com.pulumi.azurenative.streamanalytics.outputs.JavaScriptFunctionBindingResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScalarFunctionPropertiesResponse {
    /**
     * @return The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    private final @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding;
    /**
     * @return The current entity tag for the function. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    private final String etag;
    /**
     * @return A list of inputs describing the parameters of the function.
     * 
     */
    private final @Nullable List<FunctionInputResponse> inputs;
    /**
     * @return The output of the function.
     * 
     */
    private final @Nullable FunctionOutputResponse output;
    /**
     * @return Indicates the type of function.
     * Expected value is &#39;Scalar&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ScalarFunctionPropertiesResponse(
        @CustomType.Parameter("binding") @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("inputs") @Nullable List<FunctionInputResponse> inputs,
        @CustomType.Parameter("output") @Nullable FunctionOutputResponse output,
        @CustomType.Parameter("type") String type) {
        this.binding = binding;
        this.etag = etag;
        this.inputs = inputs;
        this.output = output;
        this.type = type;
    }

    /**
     * @return The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    public Optional<Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse>> binding() {
        return Optional.ofNullable(this.binding);
    }
    /**
     * @return The current entity tag for the function. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return A list of inputs describing the parameters of the function.
     * 
     */
    public List<FunctionInputResponse> inputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * @return The output of the function.
     * 
     */
    public Optional<FunctionOutputResponse> output() {
        return Optional.ofNullable(this.output);
    }
    /**
     * @return Indicates the type of function.
     * Expected value is &#39;Scalar&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalarFunctionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding;
        private String etag;
        private @Nullable List<FunctionInputResponse> inputs;
        private @Nullable FunctionOutputResponse output;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalarFunctionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.binding = defaults.binding;
    	      this.etag = defaults.etag;
    	      this.inputs = defaults.inputs;
    	      this.output = defaults.output;
    	      this.type = defaults.type;
        }

        public Builder binding(@Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding) {
            this.binding = binding;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder inputs(@Nullable List<FunctionInputResponse> inputs) {
            this.inputs = inputs;
            return this;
        }
        public Builder inputs(FunctionInputResponse... inputs) {
            return inputs(List.of(inputs));
        }
        public Builder output(@Nullable FunctionOutputResponse output) {
            this.output = output;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ScalarFunctionPropertiesResponse build() {
            return new ScalarFunctionPropertiesResponse(binding, etag, inputs, output, type);
        }
    }
}
