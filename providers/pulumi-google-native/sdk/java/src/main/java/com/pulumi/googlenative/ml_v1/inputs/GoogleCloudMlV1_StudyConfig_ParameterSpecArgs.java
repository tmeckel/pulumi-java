// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType;
import com.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1_StudyConfig_ParameterSpecType;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs;
import com.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a single parameter to optimize.
 * 
 */
public final class GoogleCloudMlV1_StudyConfig_ParameterSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_StudyConfig_ParameterSpecArgs Empty = new GoogleCloudMlV1_StudyConfig_ParameterSpecArgs();

    /**
     * The value spec for a &#39;CATEGORICAL&#39; parameter.
     * 
     */
    @Import(name="categoricalValueSpec")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs> categoricalValueSpec;

    /**
     * @return The value spec for a &#39;CATEGORICAL&#39; parameter.
     * 
     */
    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs>> categoricalValueSpec() {
        return Optional.ofNullable(this.categoricalValueSpec);
    }

    /**
     * A child node is active if the parameter&#39;s value matches the child node&#39;s matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
     * 
     */
    @Import(name="childParameterSpecs")
    private @Nullable Output<List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs>> childParameterSpecs;

    /**
     * @return A child node is active if the parameter&#39;s value matches the child node&#39;s matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
     * 
     */
    public Optional<Output<List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs>>> childParameterSpecs() {
        return Optional.ofNullable(this.childParameterSpecs);
    }

    /**
     * The value spec for a &#39;DISCRETE&#39; parameter.
     * 
     */
    @Import(name="discreteValueSpec")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecArgs> discreteValueSpec;

    /**
     * @return The value spec for a &#39;DISCRETE&#39; parameter.
     * 
     */
    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecArgs>> discreteValueSpec() {
        return Optional.ofNullable(this.discreteValueSpec);
    }

    /**
     * The value spec for a &#39;DOUBLE&#39; parameter.
     * 
     */
    @Import(name="doubleValueSpec")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs> doubleValueSpec;

    /**
     * @return The value spec for a &#39;DOUBLE&#39; parameter.
     * 
     */
    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs>> doubleValueSpec() {
        return Optional.ofNullable(this.doubleValueSpec);
    }

    /**
     * The value spec for an &#39;INTEGER&#39; parameter.
     * 
     */
    @Import(name="integerValueSpec")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs> integerValueSpec;

    /**
     * @return The value spec for an &#39;INTEGER&#39; parameter.
     * 
     */
    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs>> integerValueSpec() {
        return Optional.ofNullable(this.integerValueSpec);
    }

    /**
     * The parameter name must be unique amongst all ParameterSpecs.
     * 
     */
    @Import(name="parameter", required=true)
    private Output<String> parameter;

    /**
     * @return The parameter name must be unique amongst all ParameterSpecs.
     * 
     */
    public Output<String> parameter() {
        return this.parameter;
    }

    @Import(name="parentCategoricalValues")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecArgs> parentCategoricalValues;

    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecArgs>> parentCategoricalValues() {
        return Optional.ofNullable(this.parentCategoricalValues);
    }

    @Import(name="parentDiscreteValues")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs> parentDiscreteValues;

    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs>> parentDiscreteValues() {
        return Optional.ofNullable(this.parentDiscreteValues);
    }

    @Import(name="parentIntValues")
    private @Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecArgs> parentIntValues;

    public Optional<Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecArgs>> parentIntValues() {
        return Optional.ofNullable(this.parentIntValues);
    }

    /**
     * How the parameter should be scaled. Leave unset for categorical parameters.
     * 
     */
    @Import(name="scaleType")
    private @Nullable Output<GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType> scaleType;

    /**
     * @return How the parameter should be scaled. Leave unset for categorical parameters.
     * 
     */
    public Optional<Output<GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType>> scaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    /**
     * The type of the parameter.
     * 
     */
    @Import(name="type", required=true)
    private Output<GoogleCloudMlV1_StudyConfig_ParameterSpecType> type;

    /**
     * @return The type of the parameter.
     * 
     */
    public Output<GoogleCloudMlV1_StudyConfig_ParameterSpecType> type() {
        return this.type;
    }

    private GoogleCloudMlV1_StudyConfig_ParameterSpecArgs() {}

    private GoogleCloudMlV1_StudyConfig_ParameterSpecArgs(GoogleCloudMlV1_StudyConfig_ParameterSpecArgs $) {
        this.categoricalValueSpec = $.categoricalValueSpec;
        this.childParameterSpecs = $.childParameterSpecs;
        this.discreteValueSpec = $.discreteValueSpec;
        this.doubleValueSpec = $.doubleValueSpec;
        this.integerValueSpec = $.integerValueSpec;
        this.parameter = $.parameter;
        this.parentCategoricalValues = $.parentCategoricalValues;
        this.parentDiscreteValues = $.parentDiscreteValues;
        this.parentIntValues = $.parentIntValues;
        this.scaleType = $.scaleType;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1_StudyConfig_ParameterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_StudyConfig_ParameterSpecArgs $;

        public Builder() {
            $ = new GoogleCloudMlV1_StudyConfig_ParameterSpecArgs();
        }

        public Builder(GoogleCloudMlV1_StudyConfig_ParameterSpecArgs defaults) {
            $ = new GoogleCloudMlV1_StudyConfig_ParameterSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categoricalValueSpec The value spec for a &#39;CATEGORICAL&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder categoricalValueSpec(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs> categoricalValueSpec) {
            $.categoricalValueSpec = categoricalValueSpec;
            return this;
        }

        /**
         * @param categoricalValueSpec The value spec for a &#39;CATEGORICAL&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder categoricalValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs categoricalValueSpec) {
            return categoricalValueSpec(Output.of(categoricalValueSpec));
        }

        /**
         * @param childParameterSpecs A child node is active if the parameter&#39;s value matches the child node&#39;s matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
         * 
         * @return builder
         * 
         */
        public Builder childParameterSpecs(@Nullable Output<List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs>> childParameterSpecs) {
            $.childParameterSpecs = childParameterSpecs;
            return this;
        }

        /**
         * @param childParameterSpecs A child node is active if the parameter&#39;s value matches the child node&#39;s matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
         * 
         * @return builder
         * 
         */
        public Builder childParameterSpecs(List<GoogleCloudMlV1_StudyConfig_ParameterSpecArgs> childParameterSpecs) {
            return childParameterSpecs(Output.of(childParameterSpecs));
        }

        /**
         * @param childParameterSpecs A child node is active if the parameter&#39;s value matches the child node&#39;s matching_parent_values. If two items in child_parameter_specs have the same name, they must have disjoint matching_parent_values.
         * 
         * @return builder
         * 
         */
        public Builder childParameterSpecs(GoogleCloudMlV1_StudyConfig_ParameterSpecArgs... childParameterSpecs) {
            return childParameterSpecs(List.of(childParameterSpecs));
        }

        /**
         * @param discreteValueSpec The value spec for a &#39;DISCRETE&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder discreteValueSpec(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecArgs> discreteValueSpec) {
            $.discreteValueSpec = discreteValueSpec;
            return this;
        }

        /**
         * @param discreteValueSpec The value spec for a &#39;DISCRETE&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder discreteValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_DiscreteValueSpecArgs discreteValueSpec) {
            return discreteValueSpec(Output.of(discreteValueSpec));
        }

        /**
         * @param doubleValueSpec The value spec for a &#39;DOUBLE&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder doubleValueSpec(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs> doubleValueSpec) {
            $.doubleValueSpec = doubleValueSpec;
            return this;
        }

        /**
         * @param doubleValueSpec The value spec for a &#39;DOUBLE&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder doubleValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs doubleValueSpec) {
            return doubleValueSpec(Output.of(doubleValueSpec));
        }

        /**
         * @param integerValueSpec The value spec for an &#39;INTEGER&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder integerValueSpec(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs> integerValueSpec) {
            $.integerValueSpec = integerValueSpec;
            return this;
        }

        /**
         * @param integerValueSpec The value spec for an &#39;INTEGER&#39; parameter.
         * 
         * @return builder
         * 
         */
        public Builder integerValueSpec(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecArgs integerValueSpec) {
            return integerValueSpec(Output.of(integerValueSpec));
        }

        /**
         * @param parameter The parameter name must be unique amongst all ParameterSpecs.
         * 
         * @return builder
         * 
         */
        public Builder parameter(Output<String> parameter) {
            $.parameter = parameter;
            return this;
        }

        /**
         * @param parameter The parameter name must be unique amongst all ParameterSpecs.
         * 
         * @return builder
         * 
         */
        public Builder parameter(String parameter) {
            return parameter(Output.of(parameter));
        }

        public Builder parentCategoricalValues(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecArgs> parentCategoricalValues) {
            $.parentCategoricalValues = parentCategoricalValues;
            return this;
        }

        public Builder parentCategoricalValues(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentCategoricalValueSpecArgs parentCategoricalValues) {
            return parentCategoricalValues(Output.of(parentCategoricalValues));
        }

        public Builder parentDiscreteValues(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs> parentDiscreteValues) {
            $.parentDiscreteValues = parentDiscreteValues;
            return this;
        }

        public Builder parentDiscreteValues(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentDiscreteValueSpecArgs parentDiscreteValues) {
            return parentDiscreteValues(Output.of(parentDiscreteValues));
        }

        public Builder parentIntValues(@Nullable Output<GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecArgs> parentIntValues) {
            $.parentIntValues = parentIntValues;
            return this;
        }

        public Builder parentIntValues(GoogleCloudMlV1_StudyConfigParameterSpec_MatchingParentIntValueSpecArgs parentIntValues) {
            return parentIntValues(Output.of(parentIntValues));
        }

        /**
         * @param scaleType How the parameter should be scaled. Leave unset for categorical parameters.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(@Nullable Output<GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType> scaleType) {
            $.scaleType = scaleType;
            return this;
        }

        /**
         * @param scaleType How the parameter should be scaled. Leave unset for categorical parameters.
         * 
         * @return builder
         * 
         */
        public Builder scaleType(GoogleCloudMlV1_StudyConfig_ParameterSpecScaleType scaleType) {
            return scaleType(Output.of(scaleType));
        }

        /**
         * @param type The type of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<GoogleCloudMlV1_StudyConfig_ParameterSpecType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder type(GoogleCloudMlV1_StudyConfig_ParameterSpecType type) {
            return type(Output.of(type));
        }

        public GoogleCloudMlV1_StudyConfig_ParameterSpecArgs build() {
            $.parameter = Objects.requireNonNull($.parameter, "expected parameter 'parameter' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
