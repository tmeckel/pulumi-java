// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * 2D normalized coordinates. Default: `{0.0, 0.0}`
 * 
 */
public final class NormalizedCoordinateArgs extends com.pulumi.resources.ResourceArgs {

    public static final NormalizedCoordinateArgs Empty = new NormalizedCoordinateArgs();

    /**
     * Normalized x coordinate.
     * 
     */
    @Import(name="x")
    private @Nullable Output<Double> x;

    /**
     * @return Normalized x coordinate.
     * 
     */
    public Optional<Output<Double>> x() {
        return Optional.ofNullable(this.x);
    }

    /**
     * Normalized y coordinate.
     * 
     */
    @Import(name="y")
    private @Nullable Output<Double> y;

    /**
     * @return Normalized y coordinate.
     * 
     */
    public Optional<Output<Double>> y() {
        return Optional.ofNullable(this.y);
    }

    private NormalizedCoordinateArgs() {}

    private NormalizedCoordinateArgs(NormalizedCoordinateArgs $) {
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NormalizedCoordinateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NormalizedCoordinateArgs $;

        public Builder() {
            $ = new NormalizedCoordinateArgs();
        }

        public Builder(NormalizedCoordinateArgs defaults) {
            $ = new NormalizedCoordinateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param x Normalized x coordinate.
         * 
         * @return builder
         * 
         */
        public Builder x(@Nullable Output<Double> x) {
            $.x = x;
            return this;
        }

        /**
         * @param x Normalized x coordinate.
         * 
         * @return builder
         * 
         */
        public Builder x(Double x) {
            return x(Output.of(x));
        }

        /**
         * @param y Normalized y coordinate.
         * 
         * @return builder
         * 
         */
        public Builder y(@Nullable Output<Double> y) {
            $.y = y;
            return this;
        }

        /**
         * @param y Normalized y coordinate.
         * 
         * @return builder
         * 
         */
        public Builder y(Double y) {
            return y(Output.of(y));
        }

        public NormalizedCoordinateArgs build() {
            return $;
        }
    }

}
