// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SparkHistoryServerConfigResponse {
    /**
     * @return Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name]
     * 
     */
    private final String dataprocCluster;

    @CustomType.Constructor
    private SparkHistoryServerConfigResponse(@CustomType.Parameter("dataprocCluster") String dataprocCluster) {
        this.dataprocCluster = dataprocCluster;
    }

    /**
     * @return Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name]
     * 
     */
    public String dataprocCluster() {
        return this.dataprocCluster;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkHistoryServerConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataprocCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkHistoryServerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocCluster = defaults.dataprocCluster;
        }

        public Builder dataprocCluster(String dataprocCluster) {
            this.dataprocCluster = Objects.requireNonNull(dataprocCluster);
            return this;
        }        public SparkHistoryServerConfigResponse build() {
            return new SparkHistoryServerConfigResponse(dataprocCluster);
        }
    }
}
