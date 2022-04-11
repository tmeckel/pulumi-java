// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs.VolumeAttachmentSpecArgs;
import io.pulumi.kubernetes.storage.k8s.io_v1alpha1.inputs.VolumeAttachmentStatusArgs;
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
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Codegen.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
     * 
     */
    @Import(name="spec", required=true)
      private final Output<VolumeAttachmentSpecArgs> spec;

    public Output<VolumeAttachmentSpecArgs> getSpec() {
        return this.spec;
    }

    /**
     * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<VolumeAttachmentStatusArgs> status;

    public Output<VolumeAttachmentStatusArgs> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public VolumeAttachmentArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        Output<VolumeAttachmentSpecArgs> spec,
        @Nullable Output<VolumeAttachmentStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = Objects.requireNonNull(spec, "expected parameter 'spec' to be non-null");
        this.status = status;
    }

    private VolumeAttachmentArgs() {
        this.apiVersion = Codegen.empty();
        this.kind = Codegen.empty();
        this.metadata = Codegen.empty();
        this.spec = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private Output<VolumeAttachmentSpecArgs> spec;
        private @Nullable Output<VolumeAttachmentStatusArgs> status;

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

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Codegen.ofNullable(apiVersion);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder spec(Output<VolumeAttachmentSpecArgs> spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder spec(VolumeAttachmentSpecArgs spec) {
            this.spec = Output.of(Objects.requireNonNull(spec));
            return this;
        }
        public Builder status(@Nullable Output<VolumeAttachmentStatusArgs> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable VolumeAttachmentStatusArgs status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public VolumeAttachmentArgs build() {
            return new VolumeAttachmentArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
