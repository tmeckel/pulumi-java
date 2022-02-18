// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.vision_v1.inputs.NormalizedVertexArgs;
import io.pulumi.googlenative.vision_v1.inputs.VertexArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A bounding polygon for the detected image annotation.
 * 
 */
public final class BoundingPolyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BoundingPolyArgs Empty = new BoundingPolyArgs();

    /**
     * The bounding polygon normalized vertices.
     * 
     */
    @InputImport(name="normalizedVertices")
    private final @Nullable Input<List<NormalizedVertexArgs>> normalizedVertices;

    public Input<List<NormalizedVertexArgs>> getNormalizedVertices() {
        return this.normalizedVertices == null ? Input.empty() : this.normalizedVertices;
    }

    /**
     * The bounding polygon vertices.
     * 
     */
    @InputImport(name="vertices")
    private final @Nullable Input<List<VertexArgs>> vertices;

    public Input<List<VertexArgs>> getVertices() {
        return this.vertices == null ? Input.empty() : this.vertices;
    }

    public BoundingPolyArgs(
        @Nullable Input<List<NormalizedVertexArgs>> normalizedVertices,
        @Nullable Input<List<VertexArgs>> vertices) {
        this.normalizedVertices = normalizedVertices;
        this.vertices = vertices;
    }

    private BoundingPolyArgs() {
        this.normalizedVertices = Input.empty();
        this.vertices = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoundingPolyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NormalizedVertexArgs>> normalizedVertices;
        private @Nullable Input<List<VertexArgs>> vertices;

        public Builder() {
    	      // Empty
        }

        public Builder(BoundingPolyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.normalizedVertices = defaults.normalizedVertices;
    	      this.vertices = defaults.vertices;
        }

        public Builder setNormalizedVertices(@Nullable Input<List<NormalizedVertexArgs>> normalizedVertices) {
            this.normalizedVertices = normalizedVertices;
            return this;
        }

        public Builder setNormalizedVertices(@Nullable List<NormalizedVertexArgs> normalizedVertices) {
            this.normalizedVertices = Input.ofNullable(normalizedVertices);
            return this;
        }

        public Builder setVertices(@Nullable Input<List<VertexArgs>> vertices) {
            this.vertices = vertices;
            return this;
        }

        public Builder setVertices(@Nullable List<VertexArgs> vertices) {
            this.vertices = Input.ofNullable(vertices);
            return this;
        }

        public BoundingPolyArgs build() {
            return new BoundingPolyArgs(normalizedVertices, vertices);
        }
    }
}
