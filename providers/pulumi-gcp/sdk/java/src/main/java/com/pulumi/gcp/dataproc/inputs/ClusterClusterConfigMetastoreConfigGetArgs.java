// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigMetastoreConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigMetastoreConfigGetArgs Empty = new ClusterClusterConfigMetastoreConfigGetArgs();

    /**
     * Resource name of an existing Dataproc Metastore service.
     * 
     */
    @Import(name="dataprocMetastoreService", required=true)
    private Output<String> dataprocMetastoreService;

    /**
     * @return Resource name of an existing Dataproc Metastore service.
     * 
     */
    public Output<String> dataprocMetastoreService() {
        return this.dataprocMetastoreService;
    }

    private ClusterClusterConfigMetastoreConfigGetArgs() {}

    private ClusterClusterConfigMetastoreConfigGetArgs(ClusterClusterConfigMetastoreConfigGetArgs $) {
        this.dataprocMetastoreService = $.dataprocMetastoreService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigMetastoreConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigMetastoreConfigGetArgs $;

        public Builder() {
            $ = new ClusterClusterConfigMetastoreConfigGetArgs();
        }

        public Builder(ClusterClusterConfigMetastoreConfigGetArgs defaults) {
            $ = new ClusterClusterConfigMetastoreConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataprocMetastoreService Resource name of an existing Dataproc Metastore service.
         * 
         * @return builder
         * 
         */
        public Builder dataprocMetastoreService(Output<String> dataprocMetastoreService) {
            $.dataprocMetastoreService = dataprocMetastoreService;
            return this;
        }

        /**
         * @param dataprocMetastoreService Resource name of an existing Dataproc Metastore service.
         * 
         * @return builder
         * 
         */
        public Builder dataprocMetastoreService(String dataprocMetastoreService) {
            return dataprocMetastoreService(Output.of(dataprocMetastoreService));
        }

        public ClusterClusterConfigMetastoreConfigGetArgs build() {
            $.dataprocMetastoreService = Objects.requireNonNull($.dataprocMetastoreService, "expected parameter 'dataprocMetastoreService' to be non-null");
            return $;
        }
    }

}
