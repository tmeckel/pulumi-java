// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A 2D coordinate in an image. The origin is the top-left.
 * 
 */
public final class VertexArgs extends io.pulumi.resources.ResourceArgs {

    public static final VertexArgs Empty = new VertexArgs();

    /**
     * X coordinate.
     * 
     */
    @InputImport(name="x")
      private final @Nullable Input<Double> x;

    public Input<Double> getX() {
        return this.x == null ? Input.empty() : this.x;
    }

    /**
     * Y coordinate.
     * 
     */
    @InputImport(name="y")
      private final @Nullable Input<Double> y;

    public Input<Double> getY() {
        return this.y == null ? Input.empty() : this.y;
    }

    public VertexArgs(
        @Nullable Input<Double> x,
        @Nullable Input<Double> y) {
        this.x = x;
        this.y = y;
    }

    private VertexArgs() {
        this.x = Input.empty();
        this.y = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VertexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> x;
        private @Nullable Input<Double> y;

        public Builder() {
    	      // Empty
        }

        public Builder(VertexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder x(@Nullable Input<Double> x) {
            this.x = x;
            return this;
        }

        public Builder x(@Nullable Double x) {
            this.x = Input.ofNullable(x);
            return this;
        }

        public Builder y(@Nullable Input<Double> y) {
            this.y = y;
            return this;
        }

        public Builder y(@Nullable Double y) {
            this.y = Input.ofNullable(y);
            return this;
        }
        public VertexArgs build() {
            return new VertexArgs(x, y);
        }
    }
}
