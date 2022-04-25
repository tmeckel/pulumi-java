// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the spec to match discrete values from parent parameter.
 * 
 */
public final class GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs();

    /**
     * Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<Double>> values;

    /**
     * @return Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
     * 
     */
    public Optional<Output<List<Double>>> values() {
        return Optional.ofNullable(this.values);
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs() {}

    private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs $) {
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs();
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs defaults) {
            $ = new GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param values Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<Double>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<Double> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Matches values of the parent parameter with type &#39;DISCRETE&#39;. All values must exist in `discrete_value_spec` of parent parameter.
         * 
         * @return builder
         * 
         */
        public Builder values(Double... values) {
            return values(List.of(values));
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs build() {
            return $;
        }
    }

}
