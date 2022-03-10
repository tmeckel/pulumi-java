// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.VolumeErrorArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeAttachmentStatus is the status of a VolumeAttachment request.
 * 
 */
public final class VolumeAttachmentStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentStatusArgs Empty = new VolumeAttachmentStatusArgs();

    /**
     * The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @InputImport(name="attachError")
      private final @Nullable Input<VolumeErrorArgs> attachError;

    public Input<VolumeErrorArgs> getAttachError() {
        return this.attachError == null ? Input.empty() : this.attachError;
    }

    /**
     * Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @InputImport(name="attached", required=true)
      private final Input<Boolean> attached;

    public Input<Boolean> getAttached() {
        return this.attached;
    }

    /**
     * Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    @InputImport(name="attachmentMetadata")
      private final @Nullable Input<Map<String,String>> attachmentMetadata;

    public Input<Map<String,String>> getAttachmentMetadata() {
        return this.attachmentMetadata == null ? Input.empty() : this.attachmentMetadata;
    }

    /**
     * The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
     * 
     */
    @InputImport(name="detachError")
      private final @Nullable Input<VolumeErrorArgs> detachError;

    public Input<VolumeErrorArgs> getDetachError() {
        return this.detachError == null ? Input.empty() : this.detachError;
    }

    public VolumeAttachmentStatusArgs(
        @Nullable Input<VolumeErrorArgs> attachError,
        Input<Boolean> attached,
        @Nullable Input<Map<String,String>> attachmentMetadata,
        @Nullable Input<VolumeErrorArgs> detachError) {
        this.attachError = attachError;
        this.attached = Objects.requireNonNull(attached, "expected parameter 'attached' to be non-null");
        this.attachmentMetadata = attachmentMetadata;
        this.detachError = detachError;
    }

    private VolumeAttachmentStatusArgs() {
        this.attachError = Input.empty();
        this.attached = Input.empty();
        this.attachmentMetadata = Input.empty();
        this.detachError = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VolumeErrorArgs> attachError;
        private Input<Boolean> attached;
        private @Nullable Input<Map<String,String>> attachmentMetadata;
        private @Nullable Input<VolumeErrorArgs> detachError;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachError = defaults.attachError;
    	      this.attached = defaults.attached;
    	      this.attachmentMetadata = defaults.attachmentMetadata;
    	      this.detachError = defaults.detachError;
        }

        public Builder attachError(@Nullable Input<VolumeErrorArgs> attachError) {
            this.attachError = attachError;
            return this;
        }

        public Builder attachError(@Nullable VolumeErrorArgs attachError) {
            this.attachError = Input.ofNullable(attachError);
            return this;
        }

        public Builder attached(Input<Boolean> attached) {
            this.attached = Objects.requireNonNull(attached);
            return this;
        }

        public Builder attached(Boolean attached) {
            this.attached = Input.of(Objects.requireNonNull(attached));
            return this;
        }

        public Builder attachmentMetadata(@Nullable Input<Map<String,String>> attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            return this;
        }

        public Builder attachmentMetadata(@Nullable Map<String,String> attachmentMetadata) {
            this.attachmentMetadata = Input.ofNullable(attachmentMetadata);
            return this;
        }

        public Builder detachError(@Nullable Input<VolumeErrorArgs> detachError) {
            this.detachError = detachError;
            return this;
        }

        public Builder detachError(@Nullable VolumeErrorArgs detachError) {
            this.detachError = Input.ofNullable(detachError);
            return this;
        }
        public VolumeAttachmentStatusArgs build() {
            return new VolumeAttachmentStatusArgs(attachError, attached, attachmentMetadata, detachError);
        }
    }
}
