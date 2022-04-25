// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Input for the task that validates connection to SQL DB and target server requirements
 * 
 */
public final class ConnectToTargetSqlDbTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetSqlDbTaskInputArgs Empty = new ConnectToTargetSqlDbTaskInputArgs();

    /**
     * Connection information for target SQL DB
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> targetConnectionInfo;

    /**
     * @return Connection information for target SQL DB
     * 
     */
    public Output<SqlConnectionInfoArgs> targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private ConnectToTargetSqlDbTaskInputArgs() {}

    private ConnectToTargetSqlDbTaskInputArgs(ConnectToTargetSqlDbTaskInputArgs $) {
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToTargetSqlDbTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToTargetSqlDbTaskInputArgs $;

        public Builder() {
            $ = new ConnectToTargetSqlDbTaskInputArgs();
        }

        public Builder(ConnectToTargetSqlDbTaskInputArgs defaults) {
            $ = new ConnectToTargetSqlDbTaskInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param targetConnectionInfo Connection information for target SQL DB
         * 
         * @return builder
         * 
         */
        public Builder targetConnectionInfo(Output<SqlConnectionInfoArgs> targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        /**
         * @param targetConnectionInfo Connection information for target SQL DB
         * 
         * @return builder
         * 
         */
        public Builder targetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            return targetConnectionInfo(Output.of(targetConnectionInfo));
        }

        public ConnectToTargetSqlDbTaskInputArgs build() {
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}
