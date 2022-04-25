// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ExampleRequestResponse {
    /**
     * @return Sample input data for the web service&#39;s global parameters
     * 
     */
    private final @Nullable Map<String,Object> globalParameters;
    /**
     * @return Sample input data for the web service&#39;s input(s) given as an input name to sample input values matrix map.
     * 
     */
    private final @Nullable Map<String,List<List<Object>>> inputs;

    @CustomType.Constructor
    private ExampleRequestResponse(
        @CustomType.Parameter("globalParameters") @Nullable Map<String,Object> globalParameters,
        @CustomType.Parameter("inputs") @Nullable Map<String,List<List<Object>>> inputs) {
        this.globalParameters = globalParameters;
        this.inputs = inputs;
    }

    /**
     * @return Sample input data for the web service&#39;s global parameters
     * 
     */
    public Map<String,Object> globalParameters() {
        return this.globalParameters == null ? Map.of() : this.globalParameters;
    }
    /**
     * @return Sample input data for the web service&#39;s input(s) given as an input name to sample input values matrix map.
     * 
     */
    public Map<String,List<List<Object>>> inputs() {
        return this.inputs == null ? Map.of() : this.inputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExampleRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> globalParameters;
        private @Nullable Map<String,List<List<Object>>> inputs;

        public Builder() {
    	      // Empty
        }

        public Builder(ExampleRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.globalParameters = defaults.globalParameters;
    	      this.inputs = defaults.inputs;
        }

        public Builder globalParameters(@Nullable Map<String,Object> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }
        public Builder inputs(@Nullable Map<String,List<List<Object>>> inputs) {
            this.inputs = inputs;
            return this;
        }        public ExampleRequestResponse build() {
            return new ExampleRequestResponse(globalParameters, inputs);
        }
    }
}
