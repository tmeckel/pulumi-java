// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ServiceSpecArgs;
import io.pulumi.kubernetes.core_v1.inputs.ServiceStatusArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. Service object exists.
 * 2. Related Endpoint objects are created. Each time we get an update, wait 10 seconds
 *    for any stragglers.
 * 3. The endpoints objects target some number of living objects (unless the Service is
 *    an "empty headless" Service [1] or a Service with '.spec.type: ExternalName').
 * 4. External IP address is allocated (if Service has '.spec.type: LoadBalancer').
 * 
 * Known limitations:
 * Services targeting ReplicaSets (and, by extension, Deployments,
 * StatefulSets, etc.) with '.spec.replicas' set to 0 are not handled, and will time
 * out. To work around this limitation, set 'pulumi.com/skipAwait: "true"' on
 * '.metadata.annotations' for the Service. Work to handle this case is in progress [2].
 * 
 * [1] https://kubernetes.io/docs/concepts/services-networking/service/#headless-services
 * [2] https://github.com/pulumi/pulumi-kubernetes/pull/703
 * 
 * If the Service has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the 'customTimeouts' option on the resource.
 * 
 */
public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

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
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<ObjectMetaArgs> metadata;

    public Input<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<ServiceSpecArgs> spec;

    public Input<ServiceSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    /**
     * Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<ServiceStatusArgs> status;

    public Input<ServiceStatusArgs> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ServiceArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> kind,
        @Nullable Input<ObjectMetaArgs> metadata,
        @Nullable Input<ServiceSpecArgs> spec,
        @Nullable Input<ServiceStatusArgs> status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    private ServiceArgs() {
        this.apiVersion = Input.empty();
        this.kind = Input.empty();
        this.metadata = Input.empty();
        this.spec = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> kind;
        private @Nullable Input<ObjectMetaArgs> metadata;
        private @Nullable Input<ServiceSpecArgs> spec;
        private @Nullable Input<ServiceStatusArgs> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
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

        public Builder spec(@Nullable Input<ServiceSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable ServiceSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }

        public Builder status(@Nullable Input<ServiceStatusArgs> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable ServiceStatusArgs status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(apiVersion, kind, metadata, spec, status);
        }
    }
}
