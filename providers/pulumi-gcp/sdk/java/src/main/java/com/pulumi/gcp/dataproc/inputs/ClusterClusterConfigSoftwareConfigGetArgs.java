// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterConfigSoftwareConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigSoftwareConfigGetArgs Empty = new ClusterClusterConfigSoftwareConfigGetArgs();

    /**
     * The Cloud Dataproc image version to use
     * for the cluster - this controls the sets of software versions
     * installed onto the nodes when you create clusters. If not specified, defaults to the
     * latest version. For a list of valid versions see
     * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
     * 
     */
    @Import(name="imageVersion")
    private @Nullable Output<String> imageVersion;

    /**
     * @return The Cloud Dataproc image version to use
     * for the cluster - this controls the sets of software versions
     * installed onto the nodes when you create clusters. If not specified, defaults to the
     * latest version. For a list of valid versions see
     * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
     * 
     */
    public Optional<Output<String>> imageVersion() {
        return Optional.ofNullable(this.imageVersion);
    }

    /**
     * The set of optional components to activate on the cluster.
     * Accepted values are:
     * * ANACONDA
     * * DRUID
     * * FLINK
     * * HBASE
     * * HIVE_WEBHCAT
     * * JUPYTER
     * * PRESTO
     * * RANGER
     * * SOLR
     * * ZEPPELIN
     * * ZOOKEEPER
     * 
     */
    @Import(name="optionalComponents")
    private @Nullable Output<List<String>> optionalComponents;

    /**
     * @return The set of optional components to activate on the cluster.
     * Accepted values are:
     * * ANACONDA
     * * DRUID
     * * FLINK
     * * HBASE
     * * HIVE_WEBHCAT
     * * JUPYTER
     * * PRESTO
     * * RANGER
     * * SOLR
     * * ZEPPELIN
     * * ZOOKEEPER
     * 
     */
    public Optional<Output<List<String>>> optionalComponents() {
        return Optional.ofNullable(this.optionalComponents);
    }

    /**
     * A list of override and additional properties (key/value pairs)
     * used to modify various aspects of the common configuration files used when creating
     * a cluster. For a list of valid properties please see
     * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
     * 
     */
    @Import(name="overrideProperties")
    private @Nullable Output<Map<String,String>> overrideProperties;

    /**
     * @return A list of override and additional properties (key/value pairs)
     * used to modify various aspects of the common configuration files used when creating
     * a cluster. For a list of valid properties please see
     * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
     * 
     */
    public Optional<Output<Map<String,String>>> overrideProperties() {
        return Optional.ofNullable(this.overrideProperties);
    }

    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private ClusterClusterConfigSoftwareConfigGetArgs() {}

    private ClusterClusterConfigSoftwareConfigGetArgs(ClusterClusterConfigSoftwareConfigGetArgs $) {
        this.imageVersion = $.imageVersion;
        this.optionalComponents = $.optionalComponents;
        this.overrideProperties = $.overrideProperties;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigSoftwareConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigSoftwareConfigGetArgs $;

        public Builder() {
            $ = new ClusterClusterConfigSoftwareConfigGetArgs();
        }

        public Builder(ClusterClusterConfigSoftwareConfigGetArgs defaults) {
            $ = new ClusterClusterConfigSoftwareConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageVersion The Cloud Dataproc image version to use
         * for the cluster - this controls the sets of software versions
         * installed onto the nodes when you create clusters. If not specified, defaults to the
         * latest version. For a list of valid versions see
         * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
         * 
         * @return builder
         * 
         */
        public Builder imageVersion(@Nullable Output<String> imageVersion) {
            $.imageVersion = imageVersion;
            return this;
        }

        /**
         * @param imageVersion The Cloud Dataproc image version to use
         * for the cluster - this controls the sets of software versions
         * installed onto the nodes when you create clusters. If not specified, defaults to the
         * latest version. For a list of valid versions see
         * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
         * 
         * @return builder
         * 
         */
        public Builder imageVersion(String imageVersion) {
            return imageVersion(Output.of(imageVersion));
        }

        /**
         * @param optionalComponents The set of optional components to activate on the cluster.
         * Accepted values are:
         * * ANACONDA
         * * DRUID
         * * FLINK
         * * HBASE
         * * HIVE_WEBHCAT
         * * JUPYTER
         * * PRESTO
         * * RANGER
         * * SOLR
         * * ZEPPELIN
         * * ZOOKEEPER
         * 
         * @return builder
         * 
         */
        public Builder optionalComponents(@Nullable Output<List<String>> optionalComponents) {
            $.optionalComponents = optionalComponents;
            return this;
        }

        /**
         * @param optionalComponents The set of optional components to activate on the cluster.
         * Accepted values are:
         * * ANACONDA
         * * DRUID
         * * FLINK
         * * HBASE
         * * HIVE_WEBHCAT
         * * JUPYTER
         * * PRESTO
         * * RANGER
         * * SOLR
         * * ZEPPELIN
         * * ZOOKEEPER
         * 
         * @return builder
         * 
         */
        public Builder optionalComponents(List<String> optionalComponents) {
            return optionalComponents(Output.of(optionalComponents));
        }

        /**
         * @param optionalComponents The set of optional components to activate on the cluster.
         * Accepted values are:
         * * ANACONDA
         * * DRUID
         * * FLINK
         * * HBASE
         * * HIVE_WEBHCAT
         * * JUPYTER
         * * PRESTO
         * * RANGER
         * * SOLR
         * * ZEPPELIN
         * * ZOOKEEPER
         * 
         * @return builder
         * 
         */
        public Builder optionalComponents(String... optionalComponents) {
            return optionalComponents(List.of(optionalComponents));
        }

        /**
         * @param overrideProperties A list of override and additional properties (key/value pairs)
         * used to modify various aspects of the common configuration files used when creating
         * a cluster. For a list of valid properties please see
         * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
         * 
         * @return builder
         * 
         */
        public Builder overrideProperties(@Nullable Output<Map<String,String>> overrideProperties) {
            $.overrideProperties = overrideProperties;
            return this;
        }

        /**
         * @param overrideProperties A list of override and additional properties (key/value pairs)
         * used to modify various aspects of the common configuration files used when creating
         * a cluster. For a list of valid properties please see
         * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
         * 
         * @return builder
         * 
         */
        public Builder overrideProperties(Map<String,String> overrideProperties) {
            return overrideProperties(Output.of(overrideProperties));
        }

        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        public ClusterClusterConfigSoftwareConfigGetArgs build() {
            return $;
        }
    }

}
