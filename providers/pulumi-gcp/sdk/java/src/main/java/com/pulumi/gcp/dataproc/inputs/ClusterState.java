// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    @Import(name="clusterConfig")
    private @Nullable Output<ClusterClusterConfigGetArgs> clusterConfig;

    /**
     * @return Allows you to configure various aspects of the cluster.
     * Structure defined below.
     * 
     */
    public Optional<Output<ClusterClusterConfigGetArgs>> clusterConfig() {
        return Optional.ofNullable(this.clusterConfig);
    }

    /**
     * The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    @Import(name="gracefulDecommissionTimeout")
    private @Nullable Output<String> gracefulDecommissionTimeout;

    /**
     * @return The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
     * terraform apply
     * 
     */
    public Optional<Output<String>> gracefulDecommissionTimeout() {
        return Optional.ofNullable(this.gracefulDecommissionTimeout);
    }

    /**
     * The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The list of labels (key/value pairs) to be applied to
     * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
     * which is the name of the cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The name of the cluster, unique within the project and
     * zone.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the cluster, unique within the project and
     * zone.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the `cluster` will exist. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the cluster and associated nodes will be created in.
     * Defaults to `global`.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.clusterConfig = $.clusterConfig;
        this.gracefulDecommissionTimeout = $.gracefulDecommissionTimeout;
        this.labels = $.labels;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterConfig Allows you to configure various aspects of the cluster.
         * Structure defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(@Nullable Output<ClusterClusterConfigGetArgs> clusterConfig) {
            $.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * @param clusterConfig Allows you to configure various aspects of the cluster.
         * Structure defined below.
         * 
         * @return builder
         * 
         */
        public Builder clusterConfig(ClusterClusterConfigGetArgs clusterConfig) {
            return clusterConfig(Output.of(clusterConfig));
        }

        /**
         * @param gracefulDecommissionTimeout The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
         * terraform apply
         * 
         * @return builder
         * 
         */
        public Builder gracefulDecommissionTimeout(@Nullable Output<String> gracefulDecommissionTimeout) {
            $.gracefulDecommissionTimeout = gracefulDecommissionTimeout;
            return this;
        }

        /**
         * @param gracefulDecommissionTimeout The timeout duration which allows graceful decomissioning when you change the number of worker nodes directly through a
         * terraform apply
         * 
         * @return builder
         * 
         */
        public Builder gracefulDecommissionTimeout(String gracefulDecommissionTimeout) {
            return gracefulDecommissionTimeout(Output.of(gracefulDecommissionTimeout));
        }

        /**
         * @param labels The list of labels (key/value pairs) to be applied to
         * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
         * which is the name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The list of labels (key/value pairs) to be applied to
         * instances in the cluster. GCP generates some itself including `goog-dataproc-cluster-name`
         * which is the name of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name The name of the cluster, unique within the project and
         * zone.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cluster, unique within the project and
         * zone.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the `cluster` will exist. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the `cluster` will exist. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the cluster and associated nodes will be created in.
         * Defaults to `global`.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the cluster and associated nodes will be created in.
         * Defaults to `global`.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ClusterState build() {
            return $;
        }
    }

}
