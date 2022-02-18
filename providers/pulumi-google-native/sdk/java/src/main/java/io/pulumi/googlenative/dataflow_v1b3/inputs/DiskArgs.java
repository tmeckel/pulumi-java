// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the data disk used by a workflow job.
 * 
 */
public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    /**
     * Disk storage type, as defined by Google Compute Engine. This must be a disk type appropriate to the project and zone in which the workers will run. If unknown or unspecified, the service will attempt to choose a reasonable default. For example, the standard persistent disk type is a resource name typically ending in "pd-standard". If SSD persistent disks are available, the resource name typically ends with "pd-ssd". The actual valid values are defined the Google Compute Engine API, not by the Cloud Dataflow API; consult the Google Compute Engine documentation for more information about determining the set of available disk types for a particular project and zone. Google Compute Engine Disk types are local to a particular project in a particular zone, and so the resource name will typically look something like this: compute.googleapis.com/projects/project-id/zones/zone/diskTypes/pd-standard
     * 
     */
    @InputImport(name="diskType")
    private final @Nullable Input<String> diskType;

    public Input<String> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * Directory in a VM where disk is mounted.
     * 
     */
    @InputImport(name="mountPoint")
    private final @Nullable Input<String> mountPoint;

    public Input<String> getMountPoint() {
        return this.mountPoint == null ? Input.empty() : this.mountPoint;
    }

    /**
     * Size of disk in GB. If zero or unspecified, the service will attempt to choose a reasonable default.
     * 
     */
    @InputImport(name="sizeGb")
    private final @Nullable Input<Integer> sizeGb;

    public Input<Integer> getSizeGb() {
        return this.sizeGb == null ? Input.empty() : this.sizeGb;
    }

    public DiskArgs(
        @Nullable Input<String> diskType,
        @Nullable Input<String> mountPoint,
        @Nullable Input<Integer> sizeGb) {
        this.diskType = diskType;
        this.mountPoint = mountPoint;
        this.sizeGb = sizeGb;
    }

    private DiskArgs() {
        this.diskType = Input.empty();
        this.mountPoint = Input.empty();
        this.sizeGb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskType;
        private @Nullable Input<String> mountPoint;
        private @Nullable Input<Integer> sizeGb;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskType = defaults.diskType;
    	      this.mountPoint = defaults.mountPoint;
    	      this.sizeGb = defaults.sizeGb;
        }

        public Builder setDiskType(@Nullable Input<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setMountPoint(@Nullable Input<String> mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        public Builder setMountPoint(@Nullable String mountPoint) {
            this.mountPoint = Input.ofNullable(mountPoint);
            return this;
        }

        public Builder setSizeGb(@Nullable Input<Integer> sizeGb) {
            this.sizeGb = sizeGb;
            return this;
        }

        public Builder setSizeGb(@Nullable Integer sizeGb) {
            this.sizeGb = Input.ofNullable(sizeGb);
            return this;
        }

        public DiskArgs build() {
            return new DiskArgs(diskType, mountPoint, sizeGb);
        }
    }
}
