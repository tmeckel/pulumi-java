// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs();

    /**
     * Must be specified if type is `CATEGORICAL`. The list of possible categories.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs(@Nullable Input<List<String>> values) {
        this.values = values;
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs() {
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_CategoricalValueSpecArgs(values);
        }
    }
}
