// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Video cropping configuration for the input video. The cropped input video is scaled to match the output resolution.
 * 
 */
public final class CropArgs extends io.pulumi.resources.ResourceArgs {

    public static final CropArgs Empty = new CropArgs();

    /**
     * The number of pixels to crop from the bottom. The default is 0.
     * 
     */
    @InputImport(name="bottomPixels")
    private final @Nullable Input<Integer> bottomPixels;

    public Input<Integer> getBottomPixels() {
        return this.bottomPixels == null ? Input.empty() : this.bottomPixels;
    }

    /**
     * The number of pixels to crop from the left. The default is 0.
     * 
     */
    @InputImport(name="leftPixels")
    private final @Nullable Input<Integer> leftPixels;

    public Input<Integer> getLeftPixels() {
        return this.leftPixels == null ? Input.empty() : this.leftPixels;
    }

    /**
     * The number of pixels to crop from the right. The default is 0.
     * 
     */
    @InputImport(name="rightPixels")
    private final @Nullable Input<Integer> rightPixels;

    public Input<Integer> getRightPixels() {
        return this.rightPixels == null ? Input.empty() : this.rightPixels;
    }

    /**
     * The number of pixels to crop from the top. The default is 0.
     * 
     */
    @InputImport(name="topPixels")
    private final @Nullable Input<Integer> topPixels;

    public Input<Integer> getTopPixels() {
        return this.topPixels == null ? Input.empty() : this.topPixels;
    }

    public CropArgs(
        @Nullable Input<Integer> bottomPixels,
        @Nullable Input<Integer> leftPixels,
        @Nullable Input<Integer> rightPixels,
        @Nullable Input<Integer> topPixels) {
        this.bottomPixels = bottomPixels;
        this.leftPixels = leftPixels;
        this.rightPixels = rightPixels;
        this.topPixels = topPixels;
    }

    private CropArgs() {
        this.bottomPixels = Input.empty();
        this.leftPixels = Input.empty();
        this.rightPixels = Input.empty();
        this.topPixels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CropArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bottomPixels;
        private @Nullable Input<Integer> leftPixels;
        private @Nullable Input<Integer> rightPixels;
        private @Nullable Input<Integer> topPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(CropArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bottomPixels = defaults.bottomPixels;
    	      this.leftPixels = defaults.leftPixels;
    	      this.rightPixels = defaults.rightPixels;
    	      this.topPixels = defaults.topPixels;
        }

        public Builder setBottomPixels(@Nullable Input<Integer> bottomPixels) {
            this.bottomPixels = bottomPixels;
            return this;
        }

        public Builder setBottomPixels(@Nullable Integer bottomPixels) {
            this.bottomPixels = Input.ofNullable(bottomPixels);
            return this;
        }

        public Builder setLeftPixels(@Nullable Input<Integer> leftPixels) {
            this.leftPixels = leftPixels;
            return this;
        }

        public Builder setLeftPixels(@Nullable Integer leftPixels) {
            this.leftPixels = Input.ofNullable(leftPixels);
            return this;
        }

        public Builder setRightPixels(@Nullable Input<Integer> rightPixels) {
            this.rightPixels = rightPixels;
            return this;
        }

        public Builder setRightPixels(@Nullable Integer rightPixels) {
            this.rightPixels = Input.ofNullable(rightPixels);
            return this;
        }

        public Builder setTopPixels(@Nullable Input<Integer> topPixels) {
            this.topPixels = topPixels;
            return this;
        }

        public Builder setTopPixels(@Nullable Integer topPixels) {
            this.topPixels = Input.ofNullable(topPixels);
            return this;
        }

        public CropArgs build() {
            return new CropArgs(bottomPixels, leftPixels, rightPixels, topPixels);
        }
    }
}
