// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCassandraDataCenterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCassandraDataCenterArgs Empty = new GetCassandraDataCenterArgs();

    /**
     * Managed Cassandra cluster name.
     * 
     */
    @Import(name="clusterName", required=true)
    private String clusterName;

    /**
     * @return Managed Cassandra cluster name.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }

    /**
     * Data center name in a managed Cassandra cluster.
     * 
     */
    @Import(name="dataCenterName", required=true)
    private String dataCenterName;

    /**
     * @return Data center name in a managed Cassandra cluster.
     * 
     */
    public String dataCenterName() {
        return this.dataCenterName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCassandraDataCenterArgs() {}

    private GetCassandraDataCenterArgs(GetCassandraDataCenterArgs $) {
        this.clusterName = $.clusterName;
        this.dataCenterName = $.dataCenterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCassandraDataCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCassandraDataCenterArgs $;

        public Builder() {
            $ = new GetCassandraDataCenterArgs();
        }

        public Builder(GetCassandraDataCenterArgs defaults) {
            $ = new GetCassandraDataCenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Managed Cassandra cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param dataCenterName Data center name in a managed Cassandra cluster.
         * 
         * @return builder
         * 
         */
        public Builder dataCenterName(String dataCenterName) {
            $.dataCenterName = dataCenterName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCassandraDataCenterArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.dataCenterName = Objects.requireNonNull($.dataCenterName, "expected parameter 'dataCenterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
