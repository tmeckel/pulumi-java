// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Spark History Server configuration for the workload.
 * 
 */
public final class SparkHistoryServerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkHistoryServerConfigArgs Empty = new SparkHistoryServerConfigArgs();

    /**
     * Optional. Resource name of an existing Dataproc Cluster to act as a Spark History Server for the workload.Example: projects/[project_id]/regions/[region]/clusters/[cluster_name]
     * 
     */
    @InputImport(name="dataprocCluster")
    private final @Nullable Input<String> dataprocCluster;

    public Input<String> getDataprocCluster() {
        return this.dataprocCluster == null ? Input.empty() : this.dataprocCluster;
    }

    public SparkHistoryServerConfigArgs(@Nullable Input<String> dataprocCluster) {
        this.dataprocCluster = dataprocCluster;
    }

    private SparkHistoryServerConfigArgs() {
        this.dataprocCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkHistoryServerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataprocCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkHistoryServerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocCluster = defaults.dataprocCluster;
        }

        public Builder setDataprocCluster(@Nullable Input<String> dataprocCluster) {
            this.dataprocCluster = dataprocCluster;
            return this;
        }

        public Builder setDataprocCluster(@Nullable String dataprocCluster) {
            this.dataprocCluster = Input.ofNullable(dataprocCluster);
            return this;
        }

        public SparkHistoryServerConfigArgs build() {
            return new SparkHistoryServerConfigArgs(dataprocCluster);
        }
    }
}
