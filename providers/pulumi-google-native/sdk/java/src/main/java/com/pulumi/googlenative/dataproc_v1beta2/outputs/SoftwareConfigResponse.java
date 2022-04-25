// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SoftwareConfigResponse {
    /**
     * @return Optional. The version of software inside the cluster. It must be one of the supported Dataproc Versions (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#supported_dataproc_versions), such as &#34;1.2&#34; (including a subminor version, such as &#34;1.2.29&#34;), or the &#34;preview&#34; version (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
     * 
     */
    private final String imageVersion;
    /**
     * @return The set of optional components to activate on the cluster.
     * 
     */
    private final List<String> optionalComponents;
    /**
     * @return Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig: pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    private final Map<String,String> properties;

    @CustomType.Constructor
    private SoftwareConfigResponse(
        @CustomType.Parameter("imageVersion") String imageVersion,
        @CustomType.Parameter("optionalComponents") List<String> optionalComponents,
        @CustomType.Parameter("properties") Map<String,String> properties) {
        this.imageVersion = imageVersion;
        this.optionalComponents = optionalComponents;
        this.properties = properties;
    }

    /**
     * @return Optional. The version of software inside the cluster. It must be one of the supported Dataproc Versions (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#supported_dataproc_versions), such as &#34;1.2&#34; (including a subminor version, such as &#34;1.2.29&#34;), or the &#34;preview&#34; version (https://cloud.google.com/dataproc/docs/concepts/versioning/dataproc-versions#other_versions). If unspecified, it defaults to the latest Debian version.
     * 
     */
    public String imageVersion() {
        return this.imageVersion;
    }
    /**
     * @return The set of optional components to activate on the cluster.
     * 
     */
    public List<String> optionalComponents() {
        return this.optionalComponents;
    }
    /**
     * @return Optional. The properties to set on daemon config files.Property keys are specified in prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp: distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig: pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster properties (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    public Map<String,String> properties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageVersion;
        private List<String> optionalComponents;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageVersion = defaults.imageVersion;
    	      this.optionalComponents = defaults.optionalComponents;
    	      this.properties = defaults.properties;
        }

        public Builder imageVersion(String imageVersion) {
            this.imageVersion = Objects.requireNonNull(imageVersion);
            return this;
        }
        public Builder optionalComponents(List<String> optionalComponents) {
            this.optionalComponents = Objects.requireNonNull(optionalComponents);
            return this;
        }
        public Builder optionalComponents(String... optionalComponents) {
            return optionalComponents(List.of(optionalComponents));
        }
        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public SoftwareConfigResponse build() {
            return new SoftwareConfigResponse(imageVersion, optionalComponents, properties);
        }
    }
}
