// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A vertex represents a 2D point in the image. NOTE: the normalized vertex coordinates are relative to the original image and range from 0 to 1.
 * 
 */
public final class NormalizedVertexArgs extends io.pulumi.resources.ResourceArgs {

    public static final NormalizedVertexArgs Empty = new NormalizedVertexArgs();

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

    public NormalizedVertexArgs(
        @Nullable Input<Double> x,
        @Nullable Input<Double> y) {
        this.x = x;
        this.y = y;
    }

    private NormalizedVertexArgs() {
        this.x = Input.empty();
        this.y = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NormalizedVertexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> x;
        private @Nullable Input<Double> y;

        public Builder() {
    	      // Empty
        }

        public Builder(NormalizedVertexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setX(@Nullable Input<Double> x) {
            this.x = x;
            return this;
        }

        public Builder setX(@Nullable Double x) {
            this.x = Input.ofNullable(x);
            return this;
        }

        public Builder setY(@Nullable Input<Double> y) {
            this.y = y;
            return this;
        }

        public Builder setY(@Nullable Double y) {
            this.y = Input.ofNullable(y);
            return this;
        }

        public NormalizedVertexArgs build() {
            return new NormalizedVertexArgs(x, y);
        }
    }
}
