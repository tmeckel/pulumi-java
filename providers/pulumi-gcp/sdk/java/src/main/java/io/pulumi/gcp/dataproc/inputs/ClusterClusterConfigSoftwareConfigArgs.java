// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigSoftwareConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigSoftwareConfigArgs Empty = new ClusterClusterConfigSoftwareConfigArgs();

    /**
     * The Cloud Dataproc image version to use
     * for the cluster - this controls the sets of software versions
     * installed onto the nodes when you create clusters. If not specified, defaults to the
     * latest version. For a list of valid versions see
     * [Cloud Dataproc versions](https://cloud.google.com/dataproc/docs/concepts/dataproc-versions)
     * 
     */
    @Import(name="imageVersion")
      private final @Nullable Output<String> imageVersion;

    public Output<String> getImageVersion() {
        return this.imageVersion == null ? Codegen.empty() : this.imageVersion;
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
      private final @Nullable Output<List<String>> optionalComponents;

    public Output<List<String>> getOptionalComponents() {
        return this.optionalComponents == null ? Codegen.empty() : this.optionalComponents;
    }

    /**
     * A list of override and additional properties (key/value pairs)
     * used to modify various aspects of the common configuration files used when creating
     * a cluster. For a list of valid properties please see
     * [Cluster properties](https://cloud.google.com/dataproc/docs/concepts/cluster-properties)
     * 
     */
    @Import(name="overrideProperties")
      private final @Nullable Output<Map<String,String>> overrideProperties;

    public Output<Map<String,String>> getOverrideProperties() {
        return this.overrideProperties == null ? Codegen.empty() : this.overrideProperties;
    }

    @Import(name="properties")
      private final @Nullable Output<Map<String,Object>> properties;

    public Output<Map<String,Object>> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public ClusterClusterConfigSoftwareConfigArgs(
        @Nullable Output<String> imageVersion,
        @Nullable Output<List<String>> optionalComponents,
        @Nullable Output<Map<String,String>> overrideProperties,
        @Nullable Output<Map<String,Object>> properties) {
        this.imageVersion = imageVersion;
        this.optionalComponents = optionalComponents;
        this.overrideProperties = overrideProperties;
        this.properties = properties;
    }

    private ClusterClusterConfigSoftwareConfigArgs() {
        this.imageVersion = Codegen.empty();
        this.optionalComponents = Codegen.empty();
        this.overrideProperties = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigSoftwareConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> imageVersion;
        private @Nullable Output<List<String>> optionalComponents;
        private @Nullable Output<Map<String,String>> overrideProperties;
        private @Nullable Output<Map<String,Object>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigSoftwareConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersion = defaults.imageVersion;
    	      this.optionalComponents = defaults.optionalComponents;
    	      this.overrideProperties = defaults.overrideProperties;
    	      this.properties = defaults.properties;
        }

        public Builder imageVersion(@Nullable Output<String> imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public Builder imageVersion(@Nullable String imageVersion) {
            this.imageVersion = Codegen.ofNullable(imageVersion);
            return this;
        }
        public Builder optionalComponents(@Nullable Output<List<String>> optionalComponents) {
            this.optionalComponents = optionalComponents;
            return this;
        }
        public Builder optionalComponents(@Nullable List<String> optionalComponents) {
            this.optionalComponents = Codegen.ofNullable(optionalComponents);
            return this;
        }
        public Builder optionalComponents(String... optionalComponents) {
            return optionalComponents(List.of(optionalComponents));
        }
        public Builder overrideProperties(@Nullable Output<Map<String,String>> overrideProperties) {
            this.overrideProperties = overrideProperties;
            return this;
        }
        public Builder overrideProperties(@Nullable Map<String,String> overrideProperties) {
            this.overrideProperties = Codegen.ofNullable(overrideProperties);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,Object> properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public ClusterClusterConfigSoftwareConfigArgs build() {
            return new ClusterClusterConfigSoftwareConfigArgs(imageVersion, optionalComponents, overrideProperties, properties);
        }
    }
}
