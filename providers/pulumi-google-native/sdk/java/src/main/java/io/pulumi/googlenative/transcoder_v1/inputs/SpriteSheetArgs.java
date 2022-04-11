// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sprite sheet configuration.
 * 
 */
public final class SpriteSheetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpriteSheetArgs Empty = new SpriteSheetArgs();

    /**
     * The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
     * 
     */
    @Import(name="columnCount")
      private final @Nullable Output<Integer> columnCount;

    public Output<Integer> getColumnCount() {
        return this.columnCount == null ? Codegen.empty() : this.columnCount;
    }

    /**
     * End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
     * 
     */
    @Import(name="endTimeOffset")
      private final @Nullable Output<String> endTimeOffset;

    public Output<String> getEndTimeOffset() {
        return this.endTimeOffset == null ? Codegen.empty() : this.endTimeOffset;
    }

    /**
     * File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
     * 
     */
    @Import(name="filePrefix", required=true)
      private final Output<String> filePrefix;

    public Output<String> getFilePrefix() {
        return this.filePrefix;
    }

    /**
     * Format type. The default is `jpeg`. Supported formats: - `jpeg`
     * 
     */
    @Import(name="format")
      private final @Nullable Output<String> format;

    public Output<String> getFormat() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<String> interval;

    public Output<String> getInterval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    /**
     * The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
     * 
     */
    @Import(name="quality")
      private final @Nullable Output<Integer> quality;

    public Output<Integer> getQuality() {
        return this.quality == null ? Codegen.empty() : this.quality;
    }

    /**
     * The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
     * 
     */
    @Import(name="rowCount")
      private final @Nullable Output<Integer> rowCount;

    public Output<Integer> getRowCount() {
        return this.rowCount == null ? Codegen.empty() : this.rowCount;
    }

    /**
     * The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    @Import(name="spriteHeightPixels", required=true)
      private final Output<Integer> spriteHeightPixels;

    public Output<Integer> getSpriteHeightPixels() {
        return this.spriteHeightPixels;
    }

    /**
     * The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    @Import(name="spriteWidthPixels", required=true)
      private final Output<Integer> spriteWidthPixels;

    public Output<Integer> getSpriteWidthPixels() {
        return this.spriteWidthPixels;
    }

    /**
     * Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
     * 
     */
    @Import(name="startTimeOffset")
      private final @Nullable Output<String> startTimeOffset;

    public Output<String> getStartTimeOffset() {
        return this.startTimeOffset == null ? Codegen.empty() : this.startTimeOffset;
    }

    /**
     * Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
     * 
     */
    @Import(name="totalCount")
      private final @Nullable Output<Integer> totalCount;

    public Output<Integer> getTotalCount() {
        return this.totalCount == null ? Codegen.empty() : this.totalCount;
    }

    public SpriteSheetArgs(
        @Nullable Output<Integer> columnCount,
        @Nullable Output<String> endTimeOffset,
        Output<String> filePrefix,
        @Nullable Output<String> format,
        @Nullable Output<String> interval,
        @Nullable Output<Integer> quality,
        @Nullable Output<Integer> rowCount,
        Output<Integer> spriteHeightPixels,
        Output<Integer> spriteWidthPixels,
        @Nullable Output<String> startTimeOffset,
        @Nullable Output<Integer> totalCount) {
        this.columnCount = columnCount;
        this.endTimeOffset = endTimeOffset;
        this.filePrefix = Objects.requireNonNull(filePrefix, "expected parameter 'filePrefix' to be non-null");
        this.format = format;
        this.interval = interval;
        this.quality = quality;
        this.rowCount = rowCount;
        this.spriteHeightPixels = Objects.requireNonNull(spriteHeightPixels, "expected parameter 'spriteHeightPixels' to be non-null");
        this.spriteWidthPixels = Objects.requireNonNull(spriteWidthPixels, "expected parameter 'spriteWidthPixels' to be non-null");
        this.startTimeOffset = startTimeOffset;
        this.totalCount = totalCount;
    }

    private SpriteSheetArgs() {
        this.columnCount = Codegen.empty();
        this.endTimeOffset = Codegen.empty();
        this.filePrefix = Codegen.empty();
        this.format = Codegen.empty();
        this.interval = Codegen.empty();
        this.quality = Codegen.empty();
        this.rowCount = Codegen.empty();
        this.spriteHeightPixels = Codegen.empty();
        this.spriteWidthPixels = Codegen.empty();
        this.startTimeOffset = Codegen.empty();
        this.totalCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpriteSheetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> columnCount;
        private @Nullable Output<String> endTimeOffset;
        private Output<String> filePrefix;
        private @Nullable Output<String> format;
        private @Nullable Output<String> interval;
        private @Nullable Output<Integer> quality;
        private @Nullable Output<Integer> rowCount;
        private Output<Integer> spriteHeightPixels;
        private Output<Integer> spriteWidthPixels;
        private @Nullable Output<String> startTimeOffset;
        private @Nullable Output<Integer> totalCount;

        public Builder() {
    	      // Empty
        }

        public Builder(SpriteSheetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnCount = defaults.columnCount;
    	      this.endTimeOffset = defaults.endTimeOffset;
    	      this.filePrefix = defaults.filePrefix;
    	      this.format = defaults.format;
    	      this.interval = defaults.interval;
    	      this.quality = defaults.quality;
    	      this.rowCount = defaults.rowCount;
    	      this.spriteHeightPixels = defaults.spriteHeightPixels;
    	      this.spriteWidthPixels = defaults.spriteWidthPixels;
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.totalCount = defaults.totalCount;
        }

        public Builder columnCount(@Nullable Output<Integer> columnCount) {
            this.columnCount = columnCount;
            return this;
        }
        public Builder columnCount(@Nullable Integer columnCount) {
            this.columnCount = Codegen.ofNullable(columnCount);
            return this;
        }
        public Builder endTimeOffset(@Nullable Output<String> endTimeOffset) {
            this.endTimeOffset = endTimeOffset;
            return this;
        }
        public Builder endTimeOffset(@Nullable String endTimeOffset) {
            this.endTimeOffset = Codegen.ofNullable(endTimeOffset);
            return this;
        }
        public Builder filePrefix(Output<String> filePrefix) {
            this.filePrefix = Objects.requireNonNull(filePrefix);
            return this;
        }
        public Builder filePrefix(String filePrefix) {
            this.filePrefix = Output.of(Objects.requireNonNull(filePrefix));
            return this;
        }
        public Builder format(@Nullable Output<String> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder interval(@Nullable Output<String> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable String interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }
        public Builder quality(@Nullable Output<Integer> quality) {
            this.quality = quality;
            return this;
        }
        public Builder quality(@Nullable Integer quality) {
            this.quality = Codegen.ofNullable(quality);
            return this;
        }
        public Builder rowCount(@Nullable Output<Integer> rowCount) {
            this.rowCount = rowCount;
            return this;
        }
        public Builder rowCount(@Nullable Integer rowCount) {
            this.rowCount = Codegen.ofNullable(rowCount);
            return this;
        }
        public Builder spriteHeightPixels(Output<Integer> spriteHeightPixels) {
            this.spriteHeightPixels = Objects.requireNonNull(spriteHeightPixels);
            return this;
        }
        public Builder spriteHeightPixels(Integer spriteHeightPixels) {
            this.spriteHeightPixels = Output.of(Objects.requireNonNull(spriteHeightPixels));
            return this;
        }
        public Builder spriteWidthPixels(Output<Integer> spriteWidthPixels) {
            this.spriteWidthPixels = Objects.requireNonNull(spriteWidthPixels);
            return this;
        }
        public Builder spriteWidthPixels(Integer spriteWidthPixels) {
            this.spriteWidthPixels = Output.of(Objects.requireNonNull(spriteWidthPixels));
            return this;
        }
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }
        public Builder startTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = Codegen.ofNullable(startTimeOffset);
            return this;
        }
        public Builder totalCount(@Nullable Output<Integer> totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Builder totalCount(@Nullable Integer totalCount) {
            this.totalCount = Codegen.ofNullable(totalCount);
            return this;
        }        public SpriteSheetArgs build() {
            return new SpriteSheetArgs(columnCount, endTimeOffset, filePrefix, format, interval, quality, rowCount, spriteHeightPixels, spriteWidthPixels, startTimeOffset, totalCount);
        }
    }
}
