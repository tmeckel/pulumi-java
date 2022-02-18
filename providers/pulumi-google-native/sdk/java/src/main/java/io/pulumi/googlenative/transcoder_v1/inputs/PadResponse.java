// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Pad filter configuration for the input video. The padded input video is scaled after padding with black to match the output resolution.
 * 
 */
public final class PadResponse extends io.pulumi.resources.InvokeArgs {

    public static final PadResponse Empty = new PadResponse();

    /**
     * The number of pixels to add to the bottom. The default is 0.
     * 
     */
    @InputImport(name="bottomPixels", required=true)
    private final Integer bottomPixels;

    public Integer getBottomPixels() {
        return this.bottomPixels;
    }

    /**
     * The number of pixels to add to the left. The default is 0.
     * 
     */
    @InputImport(name="leftPixels", required=true)
    private final Integer leftPixels;

    public Integer getLeftPixels() {
        return this.leftPixels;
    }

    /**
     * The number of pixels to add to the right. The default is 0.
     * 
     */
    @InputImport(name="rightPixels", required=true)
    private final Integer rightPixels;

    public Integer getRightPixels() {
        return this.rightPixels;
    }

    /**
     * The number of pixels to add to the top. The default is 0.
     * 
     */
    @InputImport(name="topPixels", required=true)
    private final Integer topPixels;

    public Integer getTopPixels() {
        return this.topPixels;
    }

    public PadResponse(
        Integer bottomPixels,
        Integer leftPixels,
        Integer rightPixels,
        Integer topPixels) {
        this.bottomPixels = Objects.requireNonNull(bottomPixels, "expected parameter 'bottomPixels' to be non-null");
        this.leftPixels = Objects.requireNonNull(leftPixels, "expected parameter 'leftPixels' to be non-null");
        this.rightPixels = Objects.requireNonNull(rightPixels, "expected parameter 'rightPixels' to be non-null");
        this.topPixels = Objects.requireNonNull(topPixels, "expected parameter 'topPixels' to be non-null");
    }

    private PadResponse() {
        this.bottomPixels = null;
        this.leftPixels = null;
        this.rightPixels = null;
        this.topPixels = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PadResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bottomPixels;
        private Integer leftPixels;
        private Integer rightPixels;
        private Integer topPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(PadResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bottomPixels = defaults.bottomPixels;
    	      this.leftPixels = defaults.leftPixels;
    	      this.rightPixels = defaults.rightPixels;
    	      this.topPixels = defaults.topPixels;
        }

        public Builder setBottomPixels(Integer bottomPixels) {
            this.bottomPixels = Objects.requireNonNull(bottomPixels);
            return this;
        }

        public Builder setLeftPixels(Integer leftPixels) {
            this.leftPixels = Objects.requireNonNull(leftPixels);
            return this;
        }

        public Builder setRightPixels(Integer rightPixels) {
            this.rightPixels = Objects.requireNonNull(rightPixels);
            return this;
        }

        public Builder setTopPixels(Integer topPixels) {
            this.topPixels = Objects.requireNonNull(topPixels);
            return this;
        }

        public PadResponse build() {
            return new PadResponse(bottomPixels, leftPixels, rightPixels, topPixels);
        }
    }
}
