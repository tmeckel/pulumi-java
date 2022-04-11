// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.SecretReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents storage that is managed by an external CSI volume driver (Beta feature)
 * 
 */
public final class CSIPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIPersistentVolumeSourceArgs Empty = new CSIPersistentVolumeSourceArgs();

    /**
     * ControllerExpandSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerExpandVolume call. This is an alpha field and requires enabling ExpandCSIVolumes feature gate. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="controllerExpandSecretRef")
      private final @Nullable Output<SecretReferenceArgs> controllerExpandSecretRef;

    public Output<SecretReferenceArgs> getControllerExpandSecretRef() {
        return this.controllerExpandSecretRef == null ? Codegen.empty() : this.controllerExpandSecretRef;
    }

    /**
     * ControllerPublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI ControllerPublishVolume and ControllerUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="controllerPublishSecretRef")
      private final @Nullable Output<SecretReferenceArgs> controllerPublishSecretRef;

    public Output<SecretReferenceArgs> getControllerPublishSecretRef() {
        return this.controllerPublishSecretRef == null ? Codegen.empty() : this.controllerPublishSecretRef;
    }

    /**
     * Driver is the name of the driver to use for this volume. Required.
     * 
     */
    @Import(name="driver", required=true)
      private final Output<String> driver;

    public Output<String> getDriver() {
        return this.driver;
    }

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs".
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> getFsType() {
        return this.fsType == null ? Codegen.empty() : this.fsType;
    }

    /**
     * NodePublishSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodePublishVolume and NodeUnpublishVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="nodePublishSecretRef")
      private final @Nullable Output<SecretReferenceArgs> nodePublishSecretRef;

    public Output<SecretReferenceArgs> getNodePublishSecretRef() {
        return this.nodePublishSecretRef == null ? Codegen.empty() : this.nodePublishSecretRef;
    }

    /**
     * NodeStageSecretRef is a reference to the secret object containing sensitive information to pass to the CSI driver to complete the CSI NodeStageVolume and NodeStageVolume and NodeUnstageVolume calls. This field is optional, and may be empty if no secret is required. If the secret object contains more than one secret, all secrets are passed.
     * 
     */
    @Import(name="nodeStageSecretRef")
      private final @Nullable Output<SecretReferenceArgs> nodeStageSecretRef;

    public Output<SecretReferenceArgs> getNodeStageSecretRef() {
        return this.nodeStageSecretRef == null ? Codegen.empty() : this.nodeStageSecretRef;
    }

    /**
     * Optional: The value to pass to ControllerPublishVolumeRequest. Defaults to false (read/write).
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Codegen.empty() : this.readOnly;
    }

    /**
     * Attributes of the volume to publish.
     * 
     */
    @Import(name="volumeAttributes")
      private final @Nullable Output<Map<String,String>> volumeAttributes;

    public Output<Map<String,String>> getVolumeAttributes() {
        return this.volumeAttributes == null ? Codegen.empty() : this.volumeAttributes;
    }

    /**
     * VolumeHandle is the unique volume name returned by the CSI volume plugin’s CreateVolume to refer to the volume on all subsequent calls. Required.
     * 
     */
    @Import(name="volumeHandle", required=true)
      private final Output<String> volumeHandle;

    public Output<String> getVolumeHandle() {
        return this.volumeHandle;
    }

    public CSIPersistentVolumeSourceArgs(
        @Nullable Output<SecretReferenceArgs> controllerExpandSecretRef,
        @Nullable Output<SecretReferenceArgs> controllerPublishSecretRef,
        Output<String> driver,
        @Nullable Output<String> fsType,
        @Nullable Output<SecretReferenceArgs> nodePublishSecretRef,
        @Nullable Output<SecretReferenceArgs> nodeStageSecretRef,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<Map<String,String>> volumeAttributes,
        Output<String> volumeHandle) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
        this.controllerPublishSecretRef = controllerPublishSecretRef;
        this.driver = Objects.requireNonNull(driver, "expected parameter 'driver' to be non-null");
        this.fsType = fsType;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.nodeStageSecretRef = nodeStageSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
        this.volumeHandle = Objects.requireNonNull(volumeHandle, "expected parameter 'volumeHandle' to be non-null");
    }

    private CSIPersistentVolumeSourceArgs() {
        this.controllerExpandSecretRef = Codegen.empty();
        this.controllerPublishSecretRef = Codegen.empty();
        this.driver = Codegen.empty();
        this.fsType = Codegen.empty();
        this.nodePublishSecretRef = Codegen.empty();
        this.nodeStageSecretRef = Codegen.empty();
        this.readOnly = Codegen.empty();
        this.volumeAttributes = Codegen.empty();
        this.volumeHandle = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecretReferenceArgs> controllerExpandSecretRef;
        private @Nullable Output<SecretReferenceArgs> controllerPublishSecretRef;
        private Output<String> driver;
        private @Nullable Output<String> fsType;
        private @Nullable Output<SecretReferenceArgs> nodePublishSecretRef;
        private @Nullable Output<SecretReferenceArgs> nodeStageSecretRef;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<Map<String,String>> volumeAttributes;
        private Output<String> volumeHandle;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerExpandSecretRef = defaults.controllerExpandSecretRef;
    	      this.controllerPublishSecretRef = defaults.controllerPublishSecretRef;
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.nodePublishSecretRef = defaults.nodePublishSecretRef;
    	      this.nodeStageSecretRef = defaults.nodeStageSecretRef;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeAttributes = defaults.volumeAttributes;
    	      this.volumeHandle = defaults.volumeHandle;
        }

        public Builder controllerExpandSecretRef(@Nullable Output<SecretReferenceArgs> controllerExpandSecretRef) {
            this.controllerExpandSecretRef = controllerExpandSecretRef;
            return this;
        }
        public Builder controllerExpandSecretRef(@Nullable SecretReferenceArgs controllerExpandSecretRef) {
            this.controllerExpandSecretRef = Codegen.ofNullable(controllerExpandSecretRef);
            return this;
        }
        public Builder controllerPublishSecretRef(@Nullable Output<SecretReferenceArgs> controllerPublishSecretRef) {
            this.controllerPublishSecretRef = controllerPublishSecretRef;
            return this;
        }
        public Builder controllerPublishSecretRef(@Nullable SecretReferenceArgs controllerPublishSecretRef) {
            this.controllerPublishSecretRef = Codegen.ofNullable(controllerPublishSecretRef);
            return this;
        }
        public Builder driver(Output<String> driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }
        public Builder driver(String driver) {
            this.driver = Output.of(Objects.requireNonNull(driver));
            return this;
        }
        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Codegen.ofNullable(fsType);
            return this;
        }
        public Builder nodePublishSecretRef(@Nullable Output<SecretReferenceArgs> nodePublishSecretRef) {
            this.nodePublishSecretRef = nodePublishSecretRef;
            return this;
        }
        public Builder nodePublishSecretRef(@Nullable SecretReferenceArgs nodePublishSecretRef) {
            this.nodePublishSecretRef = Codegen.ofNullable(nodePublishSecretRef);
            return this;
        }
        public Builder nodeStageSecretRef(@Nullable Output<SecretReferenceArgs> nodeStageSecretRef) {
            this.nodeStageSecretRef = nodeStageSecretRef;
            return this;
        }
        public Builder nodeStageSecretRef(@Nullable SecretReferenceArgs nodeStageSecretRef) {
            this.nodeStageSecretRef = Codegen.ofNullable(nodeStageSecretRef);
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Codegen.ofNullable(readOnly);
            return this;
        }
        public Builder volumeAttributes(@Nullable Output<Map<String,String>> volumeAttributes) {
            this.volumeAttributes = volumeAttributes;
            return this;
        }
        public Builder volumeAttributes(@Nullable Map<String,String> volumeAttributes) {
            this.volumeAttributes = Codegen.ofNullable(volumeAttributes);
            return this;
        }
        public Builder volumeHandle(Output<String> volumeHandle) {
            this.volumeHandle = Objects.requireNonNull(volumeHandle);
            return this;
        }
        public Builder volumeHandle(String volumeHandle) {
            this.volumeHandle = Output.of(Objects.requireNonNull(volumeHandle));
            return this;
        }        public CSIPersistentVolumeSourceArgs build() {
            return new CSIPersistentVolumeSourceArgs(controllerExpandSecretRef, controllerPublishSecretRef, driver, fsType, nodePublishSecretRef, nodeStageSecretRef, readOnly, volumeAttributes, volumeHandle);
        }
    }
}
