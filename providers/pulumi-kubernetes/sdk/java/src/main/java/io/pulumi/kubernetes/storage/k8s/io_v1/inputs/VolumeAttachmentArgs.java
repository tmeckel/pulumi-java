// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1.inputs.VolumeAttachmentSpecArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1.inputs.VolumeAttachmentStatusArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 * 
 * VolumeAttachment objects are non-namespaced.
 * 
 */
public final class VolumeAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentArgs Empty = new VolumeAttachmentArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @InputImport(name="apiVersion")
      private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
     * 
     */
    @InputImport(name="spec", required=true)
      private final Input<VolumeAttachmentSpecArgs> spec;

    public Input<VolumeAttachmentSpecArgs> getSpec() {
        return this.spec;
    }

    /**
     * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<VolumeAttachmentStatusArgs> status;

    public Input<VolumeAttachmentStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public VolumeAttachmentArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        Input<VolumeAttachmentSpecArgs> spec,
        @Nullable Input<VolumeAttachmentStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.status = status;
    }

    private VolumeAttachmentArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private Input<VolumeAttachmentSpecArgs> spec;
        private @Nullable Input<VolumeAttachmentStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder metadata(@Nullable Input<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder spec(Input<VolumeAttachmentSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }

        public Builder spec(VolumeAttachmentSpecArgs spec) {
            this.spec = Input.of(Objects.requireNonNull(spec));
            return this;
        }

        public Builder status(@Nullable Input<VolumeAttachmentStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable VolumeAttachmentStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public VolumeAttachmentArgs build() {
            return new VolumeAttachmentArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
