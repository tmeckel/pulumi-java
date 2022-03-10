// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.VolumeProjectionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a projected volume source
 * 
 */
public final class ProjectedVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectedVolumeSourceArgs Empty = new ProjectedVolumeSourceArgs();

    /**
     * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @InputImport(name="defaultMode")
      private final @Nullable Input<Integer> defaultMode;

    public Input<Integer> getDefaultMode() {
        return this.defaultMode == null ? Input.empty() : this.defaultMode;
    }

    /**
     * list of volume projections
     * 
     */
    @InputImport(name="sources", required=true)
      private final Input<List<VolumeProjectionArgs>> sources;

    public Input<List<VolumeProjectionArgs>> getSources() {
        return this.sources;
    }

    public ProjectedVolumeSourceArgs(
        @Nullable Input<Integer> defaultMode,
        Input<List<VolumeProjectionArgs>> sources) {
        this.defaultMode = defaultMode;
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private ProjectedVolumeSourceArgs() {
        this.defaultMode = Input.empty();
        this.sources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectedVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultMode;
        private Input<List<VolumeProjectionArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectedVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.sources = defaults.sources;
        }

        public Builder defaultMode(@Nullable Input<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder defaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Input.ofNullable(defaultMode);
            return this;
        }

        public Builder sources(Input<List<VolumeProjectionArgs>> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder sources(List<VolumeProjectionArgs> sources) {
            this.sources = Input.of(Objects.requireNonNull(sources));
            return this;
        }
        public ProjectedVolumeSourceArgs build() {
            return new ProjectedVolumeSourceArgs(defaultMode, sources);
        }
    }
}
