// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Photon Controller persistent disk resource.
 * 
 */
public final class PhotonPersistentDiskVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PhotonPersistentDiskVolumeSourceArgs Empty = new PhotonPersistentDiskVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> getFsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * ID that identifies Photon Controller persistent disk
     * 
     */
    @Import(name="pdID", required=true)
      private final Output<String> pdID;

    public Output<String> getPdID() {
        return this.pdID;
    }

    public PhotonPersistentDiskVolumeSourceArgs(
        @Nullable Output<String> fsType,
        Output<String> pdID) {
        this.fsType = fsType;
        this.pdID = Objects.requireNonNull(pdID, "expected parameter 'pdID' to be non-null");
    }

    private PhotonPersistentDiskVolumeSourceArgs() {
        this.fsType = Codegen.empty();
        this.pdID = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PhotonPersistentDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private Output<String> pdID;

        public Builder() {
    	      // Empty
        }

        public Builder(PhotonPersistentDiskVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.pdID = defaults.pdID;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
            return this;
        }
        public Builder pdID(Output<String> pdID) {
            this.pdID = Objects.requireNonNull(pdID);
            return this;
        }
        public Builder pdID(String pdID) {
            this.pdID = Output.of(Objects.requireNonNull(pdID));
            return this;
        }        public PhotonPersistentDiskVolumeSourceArgs build() {
            return new PhotonPersistentDiskVolumeSourceArgs(fsType, pdID);
        }
    }
}
