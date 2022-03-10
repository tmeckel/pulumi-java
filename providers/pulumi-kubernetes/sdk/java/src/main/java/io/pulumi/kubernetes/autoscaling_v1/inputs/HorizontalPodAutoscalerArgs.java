// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v1.inputs.HorizontalPodAutoscalerSpecArgs;
import io.pulumi.kubernetes.autoscaling_v1.inputs.HorizontalPodAutoscalerStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * configuration of a horizontal pod autoscaler.
 * 
 */
public final class HorizontalPodAutoscalerArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerArgs Empty = new HorizontalPodAutoscalerArgs();

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
     * behaviour of autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<HorizontalPodAutoscalerSpecArgs> spec;

    public Input<HorizontalPodAutoscalerSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * current information about the autoscaler.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<HorizontalPodAutoscalerStatusArgs> status;

    public Input<HorizontalPodAutoscalerStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public HorizontalPodAutoscalerArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<HorizontalPodAutoscalerSpecArgs> spec,
        @Nullable Input<HorizontalPodAutoscalerStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private HorizontalPodAutoscalerArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<HorizontalPodAutoscalerSpecArgs> spec;
        private @Nullable Input<HorizontalPodAutoscalerStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerArgs defaults) {
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

        public Builder spec(@Nullable Input<HorizontalPodAutoscalerSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable HorizontalPodAutoscalerSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder status(@Nullable Input<HorizontalPodAutoscalerStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable HorizontalPodAutoscalerStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public HorizontalPodAutoscalerArgs build() {
            return new HorizontalPodAutoscalerArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
