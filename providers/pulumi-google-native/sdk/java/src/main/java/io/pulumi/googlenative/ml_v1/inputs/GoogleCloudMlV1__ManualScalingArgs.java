// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options for manually scaling a model.
 * 
 */
public final class GoogleCloudMlV1__ManualScalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__ManualScalingArgs Empty = new GoogleCloudMlV1__ManualScalingArgs();

    /**
     * The number of nodes to allocate for this model. These nodes are always up, starting from the time the model is deployed, so the cost of operating this model will be proportional to `nodes` * number of hours since last billing cycle plus the cost for each prediction performed.
     * 
     */
    @InputImport(name="nodes")
    private final @Nullable Input<Integer> nodes;

    public Input<Integer> getNodes() {
        return this.nodes == null ? Input.empty() : this.nodes;
    }

    public GoogleCloudMlV1__ManualScalingArgs(@Nullable Input<Integer> nodes) {
        this.nodes = nodes;
    }

    private GoogleCloudMlV1__ManualScalingArgs() {
        this.nodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ManualScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ManualScalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
        }

        public Builder setNodes(@Nullable Input<Integer> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setNodes(@Nullable Integer nodes) {
            this.nodes = Input.ofNullable(nodes);
            return this;
        }

        public GoogleCloudMlV1__ManualScalingArgs build() {
            return new GoogleCloudMlV1__ManualScalingArgs(nodes);
        }
    }
}
