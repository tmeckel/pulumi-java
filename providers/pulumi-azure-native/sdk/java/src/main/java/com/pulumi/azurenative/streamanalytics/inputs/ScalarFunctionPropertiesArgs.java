// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceFunctionBindingArgs;
import com.pulumi.azurenative.streamanalytics.inputs.FunctionInputArgs;
import com.pulumi.azurenative.streamanalytics.inputs.FunctionOutputArgs;
import com.pulumi.azurenative.streamanalytics.inputs.JavaScriptFunctionBindingArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with a scalar function.
 * 
 */
public final class ScalarFunctionPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScalarFunctionPropertiesArgs Empty = new ScalarFunctionPropertiesArgs();

    /**
     * The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    @Import(name="binding")
    private @Nullable Output<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> binding;

    /**
     * @return The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    public Optional<Output<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>>> binding() {
        return Optional.ofNullable(this.binding);
    }

    /**
     * A list of inputs describing the parameters of the function.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<FunctionInputArgs>> inputs;

    /**
     * @return A list of inputs describing the parameters of the function.
     * 
     */
    public Optional<Output<List<FunctionInputArgs>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The output of the function.
     * 
     */
    @Import(name="output")
    private @Nullable Output<FunctionOutputArgs> output;

    /**
     * @return The output of the function.
     * 
     */
    public Optional<Output<FunctionOutputArgs>> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * Indicates the type of function.
     * Expected value is &#39;Scalar&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Indicates the type of function.
     * Expected value is &#39;Scalar&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ScalarFunctionPropertiesArgs() {}

    private ScalarFunctionPropertiesArgs(ScalarFunctionPropertiesArgs $) {
        this.binding = $.binding;
        this.inputs = $.inputs;
        this.output = $.output;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalarFunctionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalarFunctionPropertiesArgs $;

        public Builder() {
            $ = new ScalarFunctionPropertiesArgs();
        }

        public Builder(ScalarFunctionPropertiesArgs defaults) {
            $ = new ScalarFunctionPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param binding The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder binding(@Nullable Output<Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs>> binding) {
            $.binding = binding;
            return this;
        }

        /**
         * @param binding The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder binding(Either<AzureMachineLearningWebServiceFunctionBindingArgs,JavaScriptFunctionBindingArgs> binding) {
            return binding(Output.of(binding));
        }

        /**
         * @param binding The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder binding(AzureMachineLearningWebServiceFunctionBindingArgs binding) {
            return binding(Either.ofLeft(binding));
        }

        /**
         * @param binding The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder binding(JavaScriptFunctionBindingArgs binding) {
            return binding(Either.ofRight(binding));
        }

        /**
         * @param inputs A list of inputs describing the parameters of the function.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<FunctionInputArgs>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs A list of inputs describing the parameters of the function.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<FunctionInputArgs> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs A list of inputs describing the parameters of the function.
         * 
         * @return builder
         * 
         */
        public Builder inputs(FunctionInputArgs... inputs) {
            return inputs(List.of(inputs));
        }

        /**
         * @param output The output of the function.
         * 
         * @return builder
         * 
         */
        public Builder output(@Nullable Output<FunctionOutputArgs> output) {
            $.output = output;
            return this;
        }

        /**
         * @param output The output of the function.
         * 
         * @return builder
         * 
         */
        public Builder output(FunctionOutputArgs output) {
            return output(Output.of(output));
        }

        /**
         * @param type Indicates the type of function.
         * Expected value is &#39;Scalar&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Indicates the type of function.
         * Expected value is &#39;Scalar&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ScalarFunctionPropertiesArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
