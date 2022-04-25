// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 * 
 */
public final class GlusterfsVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlusterfsVolumeSourceArgs Empty = new GlusterfsVolumeSourceArgs();

    /**
     * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="endpoints", required=true)
    private Output<String> endpoints;

    /**
     * @return EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Output<String> endpoints() {
        return this.endpoints;
    }

    /**
     * Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    /**
     * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    private GlusterfsVolumeSourceArgs() {}

    private GlusterfsVolumeSourceArgs(GlusterfsVolumeSourceArgs $) {
        this.endpoints = $.endpoints;
        this.path = $.path;
        this.readOnly = $.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlusterfsVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlusterfsVolumeSourceArgs $;

        public Builder() {
            $ = new GlusterfsVolumeSourceArgs();
        }

        public Builder(GlusterfsVolumeSourceArgs defaults) {
            $ = new GlusterfsVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoints EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder endpoints(Output<String> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder endpoints(String endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param path Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param readOnly ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public GlusterfsVolumeSourceArgs build() {
            $.endpoints = Objects.requireNonNull($.endpoints, "expected parameter 'endpoints' to be non-null");
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
