// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An attribution method that approximates Shapley values for features that contribute to the label being predicted. A sampling strategy is used to approximate the value rather than considering all subsets of features.
 * 
 */
public final class GoogleCloudMlV1__SampledShapleyAttributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__SampledShapleyAttributionArgs Empty = new GoogleCloudMlV1__SampledShapleyAttributionArgs();

    /**
     * The number of feature permutations to consider when approximating the Shapley values.
     * 
     */
    @InputImport(name="numPaths")
      private final @Nullable Input<Integer> numPaths;

    public Input<Integer> getNumPaths() {
        return this.numPaths == null ? Input.empty() : this.numPaths;
    }

    public GoogleCloudMlV1__SampledShapleyAttributionArgs(@Nullable Input<Integer> numPaths) {
        this.numPaths = numPaths;
    }

    private GoogleCloudMlV1__SampledShapleyAttributionArgs() {
        this.numPaths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__SampledShapleyAttributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> numPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__SampledShapleyAttributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numPaths = defaults.numPaths;
        }

        public Builder numPaths(@Nullable Input<Integer> numPaths) {
            this.numPaths = numPaths;
            return this;
        }

        public Builder numPaths(@Nullable Integer numPaths) {
            this.numPaths = Input.ofNullable(numPaths);
            return this;
        }
        public GoogleCloudMlV1__SampledShapleyAttributionArgs build() {
            return new GoogleCloudMlV1__SampledShapleyAttributionArgs(numPaths);
        }
    }
}
