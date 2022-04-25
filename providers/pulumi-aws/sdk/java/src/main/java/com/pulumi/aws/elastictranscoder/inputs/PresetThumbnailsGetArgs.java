// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PresetThumbnailsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PresetThumbnailsGetArgs Empty = new PresetThumbnailsGetArgs();

    /**
     * The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
     * 
     */
    @Import(name="aspectRatio")
    private @Nullable Output<String> aspectRatio;

    /**
     * @return The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
     * 
     */
    public Optional<Output<String>> aspectRatio() {
        return Optional.ofNullable(this.aspectRatio);
    }

    /**
     * The format of thumbnails, if any. Valid formats are jpg and png.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return The format of thumbnails, if any. Valid formats are jpg and png.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * 
     */
    @Import(name="maxHeight")
    private @Nullable Output<String> maxHeight;

    /**
     * @return The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
     * 
     */
    public Optional<Output<String>> maxHeight() {
        return Optional.ofNullable(this.maxHeight);
    }

    /**
     * The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * 
     */
    @Import(name="maxWidth")
    private @Nullable Output<String> maxWidth;

    /**
     * @return The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
     * 
     */
    public Optional<Output<String>> maxWidth() {
        return Optional.ofNullable(this.maxWidth);
    }

    /**
     * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
     * 
     */
    @Import(name="paddingPolicy")
    private @Nullable Output<String> paddingPolicy;

    /**
     * @return When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
     * 
     */
    public Optional<Output<String>> paddingPolicy() {
        return Optional.ofNullable(this.paddingPolicy);
    }

    /**
     * The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `max_width`, `max_height`, `sizing_policy`, and `padding_policy` instead of `resolution` and `aspect_ratio`. The two groups of settings are mutually exclusive. Do not use them together)
     * 
     */
    @Import(name="resolution")
    private @Nullable Output<String> resolution;

    /**
     * @return The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `max_width`, `max_height`, `sizing_policy`, and `padding_policy` instead of `resolution` and `aspect_ratio`. The two groups of settings are mutually exclusive. Do not use them together)
     * 
     */
    public Optional<Output<String>> resolution() {
        return Optional.ofNullable(this.resolution);
    }

    /**
     * A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
     * 
     */
    @Import(name="sizingPolicy")
    private @Nullable Output<String> sizingPolicy;

    /**
     * @return A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
     * 
     */
    public Optional<Output<String>> sizingPolicy() {
        return Optional.ofNullable(this.sizingPolicy);
    }

    private PresetThumbnailsGetArgs() {}

    private PresetThumbnailsGetArgs(PresetThumbnailsGetArgs $) {
        this.aspectRatio = $.aspectRatio;
        this.format = $.format;
        this.interval = $.interval;
        this.maxHeight = $.maxHeight;
        this.maxWidth = $.maxWidth;
        this.paddingPolicy = $.paddingPolicy;
        this.resolution = $.resolution;
        this.sizingPolicy = $.sizingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PresetThumbnailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PresetThumbnailsGetArgs $;

        public Builder() {
            $ = new PresetThumbnailsGetArgs();
        }

        public Builder(PresetThumbnailsGetArgs defaults) {
            $ = new PresetThumbnailsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aspectRatio The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
         * 
         * @return builder
         * 
         */
        public Builder aspectRatio(@Nullable Output<String> aspectRatio) {
            $.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * @param aspectRatio The aspect ratio of thumbnails. The following values are valid: auto, 1:1, 4:3, 3:2, 16:9
         * 
         * @return builder
         * 
         */
        public Builder aspectRatio(String aspectRatio) {
            return aspectRatio(Output.of(aspectRatio));
        }

        /**
         * @param format The format of thumbnails, if any. Valid formats are jpg and png.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of thumbnails, if any. Valid formats are jpg and png.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param interval The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The approximate number of seconds between thumbnails. The value must be an integer. The actual interval can vary by several seconds from one thumbnail to the next.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param maxHeight The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder maxHeight(@Nullable Output<String> maxHeight) {
            $.maxHeight = maxHeight;
            return this;
        }

        /**
         * @param maxHeight The maximum height of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 3072, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder maxHeight(String maxHeight) {
            return maxHeight(Output.of(maxHeight));
        }

        /**
         * @param maxWidth The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder maxWidth(@Nullable Output<String> maxWidth) {
            $.maxWidth = maxWidth;
            return this;
        }

        /**
         * @param maxWidth The maximum width of thumbnails, in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 32 and 4096, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder maxWidth(String maxWidth) {
            return maxWidth(Output.of(maxWidth));
        }

        /**
         * @param paddingPolicy When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
         * 
         * @return builder
         * 
         */
        public Builder paddingPolicy(@Nullable Output<String> paddingPolicy) {
            $.paddingPolicy = paddingPolicy;
            return this;
        }

        /**
         * @param paddingPolicy When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of thumbnails to make the total size of the thumbnails match the values that you specified for thumbnail MaxWidth and MaxHeight settings.
         * 
         * @return builder
         * 
         */
        public Builder paddingPolicy(String paddingPolicy) {
            return paddingPolicy(Output.of(paddingPolicy));
        }

        /**
         * @param resolution The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `max_width`, `max_height`, `sizing_policy`, and `padding_policy` instead of `resolution` and `aspect_ratio`. The two groups of settings are mutually exclusive. Do not use them together)
         * 
         * @return builder
         * 
         */
        public Builder resolution(@Nullable Output<String> resolution) {
            $.resolution = resolution;
            return this;
        }

        /**
         * @param resolution The width and height of thumbnail files in pixels, in the format WidthxHeight, where both values are even integers. The values cannot exceed the width and height that you specified in the Video:Resolution object. (To better control resolution and aspect ratio of thumbnails, we recommend that you use the thumbnail values `max_width`, `max_height`, `sizing_policy`, and `padding_policy` instead of `resolution` and `aspect_ratio`. The two groups of settings are mutually exclusive. Do not use them together)
         * 
         * @return builder
         * 
         */
        public Builder resolution(String resolution) {
            return resolution(Output.of(resolution));
        }

        /**
         * @param sizingPolicy A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
         * 
         * @return builder
         * 
         */
        public Builder sizingPolicy(@Nullable Output<String> sizingPolicy) {
            $.sizingPolicy = sizingPolicy;
            return this;
        }

        /**
         * @param sizingPolicy A value that controls scaling of thumbnails. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, and `ShrinkToFill`.
         * 
         * @return builder
         * 
         */
        public Builder sizingPolicy(String sizingPolicy) {
            return sizingPolicy(Output.of(sizingPolicy));
        }

        public PresetThumbnailsGetArgs build() {
            return $;
        }
    }

}
