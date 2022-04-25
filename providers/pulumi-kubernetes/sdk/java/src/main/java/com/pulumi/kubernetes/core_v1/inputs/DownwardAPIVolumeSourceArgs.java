// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.DownwardAPIVolumeFileArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 * 
 */
public final class DownwardAPIVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DownwardAPIVolumeSourceArgs Empty = new DownwardAPIVolumeSourceArgs();

    /**
     * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @Import(name="defaultMode")
    private @Nullable Output<Integer> defaultMode;

    /**
     * @return Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Output<Integer>> defaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }

    /**
     * Items is a list of downward API volume file
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<DownwardAPIVolumeFileArgs>> items;

    /**
     * @return Items is a list of downward API volume file
     * 
     */
    public Optional<Output<List<DownwardAPIVolumeFileArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    private DownwardAPIVolumeSourceArgs() {}

    private DownwardAPIVolumeSourceArgs(DownwardAPIVolumeSourceArgs $) {
        this.defaultMode = $.defaultMode;
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DownwardAPIVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DownwardAPIVolumeSourceArgs $;

        public Builder() {
            $ = new DownwardAPIVolumeSourceArgs();
        }

        public Builder(DownwardAPIVolumeSourceArgs defaults) {
            $ = new DownwardAPIVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultMode Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(@Nullable Output<Integer> defaultMode) {
            $.defaultMode = defaultMode;
            return this;
        }

        /**
         * @param defaultMode Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
         * 
         * @return builder
         * 
         */
        public Builder defaultMode(Integer defaultMode) {
            return defaultMode(Output.of(defaultMode));
        }

        /**
         * @param items Items is a list of downward API volume file
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<DownwardAPIVolumeFileArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items Items is a list of downward API volume file
         * 
         * @return builder
         * 
         */
        public Builder items(List<DownwardAPIVolumeFileArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items Items is a list of downward API volume file
         * 
         * @return builder
         * 
         */
        public Builder items(DownwardAPIVolumeFileArgs... items) {
            return items(List.of(items));
        }

        public DownwardAPIVolumeSourceArgs build() {
            return $;
        }
    }

}
