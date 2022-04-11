// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceMetadataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceMetadataGetArgs Empty = new ServiceMetadataGetArgs();

    /**
     * Annotations is a key value map stored with a resource that
     * may be set by external tools to store and retrieve arbitrary metadata. More
     * info: http://kubernetes.io/docs/user-guide/annotations
     * **Note**: The Cloud Run API may add additional annotations that were not provided in your config.
     * If the provider plan shows a diff where a server-side annotation is added, you can add it to your config
     * or apply the lifecycle.ignore_changes rule to the metadata.0.annotations field.
     * Cloud Run (fully managed) uses the following annotation keys to configure features on a Service:
     * - `run.googleapis.com/ingress` sets the [ingress settings](https://cloud.google.com/sdk/gcloud/reference/run/deploy#--ingress)
     *   for the Service. For example, `"run.googleapis.com/ingress" = "all"`.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * - 
     * A sequence number representing a specific generation of the desired state.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<Integer> generation;

    public Output<Integer> getGeneration() {
        return this.generation == null ? Codegen.empty() : this.generation;
    }

    /**
     * Map of string keys and values that can be used to organize and categorize
     * (scope and select) objects. May match selectors of replication controllers
     * and routes.
     * More info: http://kubernetes.io/docs/user-guide/labels
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * In Cloud Run the namespace must be equal to either the
     * project ID or project number.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    /**
     * - 
     * An opaque value that represents the internal version of this object that
     * can be used by clients to determine when objects have changed. May be used
     * for optimistic concurrency, change detection, and the watch operation on a
     * resource or set of resources. They may only be valid for a
     * particular resource or set of resources.
     * More info:
     * https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    @Import(name="resourceVersion")
      private final @Nullable Output<String> resourceVersion;

    public Output<String> getResourceVersion() {
        return this.resourceVersion == null ? Codegen.empty() : this.resourceVersion;
    }

    /**
     * - 
     * SelfLink is a URL representing this object.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * - 
     * UID is a unique id generated by the server on successful creation of a resource and is not
     * allowed to change on PUT operations.
     * More info: http://kubernetes.io/docs/user-guide/identifiers#uids
     * 
     */
    @Import(name="uid")
      private final @Nullable Output<String> uid;

    public Output<String> getUid() {
        return this.uid == null ? Codegen.empty() : this.uid;
    }

    public ServiceMetadataGetArgs(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<Integer> generation,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> namespace,
        @Nullable Output<String> resourceVersion,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> uid) {
        this.annotations = annotations;
        this.generation = generation;
        this.labels = labels;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.uid = uid;
    }

    private ServiceMetadataGetArgs() {
        this.annotations = Codegen.empty();
        this.generation = Codegen.empty();
        this.labels = Codegen.empty();
        this.namespace = Codegen.empty();
        this.resourceVersion = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.uid = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<Integer> generation;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> resourceVersion;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> uid;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMetadataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.generation = defaults.generation;
    	      this.labels = defaults.labels;
    	      this.namespace = defaults.namespace;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
    	      this.uid = defaults.uid;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder generation(@Nullable Output<Integer> generation) {
            this.generation = generation;
            return this;
        }
        public Builder generation(@Nullable Integer generation) {
            this.generation = Codegen.ofNullable(generation);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder resourceVersion(@Nullable Output<String> resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public Builder resourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = Codegen.ofNullable(resourceVersion);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder uid(@Nullable Output<String> uid) {
            this.uid = uid;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = Codegen.ofNullable(uid);
            return this;
        }        public ServiceMetadataGetArgs build() {
            return new ServiceMetadataGetArgs(annotations, generation, labels, namespace, resourceVersion, selfLink, uid);
        }
    }
}
