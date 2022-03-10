// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.tpu_v2alpha1.enums.AttachedDiskMode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A node-attached disk resource. Next ID: 8;
 * 
 */
public final class AttachedDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDiskArgs Empty = new AttachedDiskArgs();

    /**
     * The mode in which to attach this disk. If not specified, the default is READ_WRITE mode. Only applicable to data_disks.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<AttachedDiskMode> mode;

    public Input<AttachedDiskMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Specifies the full path to an existing disk. For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
     * 
     */
    @InputImport(name="sourceDisk")
      private final @Nullable Input<String> sourceDisk;

    public Input<String> getSourceDisk() {
        return this.sourceDisk == null ? Input.empty() : this.sourceDisk;
    }

    public AttachedDiskArgs(
        @Nullable Input<AttachedDiskMode> mode,
        @Nullable Input<String> sourceDisk) {
        this.mode = mode;
        this.sourceDisk = sourceDisk;
    }

    private AttachedDiskArgs() {
        this.mode = Input.empty();
        this.sourceDisk = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AttachedDiskMode> mode;
        private @Nullable Input<String> sourceDisk;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.sourceDisk = defaults.sourceDisk;
        }

        public Builder mode(@Nullable Input<AttachedDiskMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable AttachedDiskMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder sourceDisk(@Nullable Input<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder sourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Input.ofNullable(sourceDisk);
            return this;
        }
        public AttachedDiskArgs build() {
            return new AttachedDiskArgs(mode, sourceDisk);
        }
    }
}
