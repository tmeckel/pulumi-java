// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class ConnectToTargetSqlMITaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetSqlMITaskInputResponse Empty = new ConnectToTargetSqlMITaskInputResponse();

    @InputImport(name="targetConnectionInfo", required=true)
    private final SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlMITaskInputResponse(SqlConnectionInfoResponse targetConnectionInfo) {
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlMITaskInputResponse() {
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMITaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMITaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder setTargetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }

        public ConnectToTargetSqlMITaskInputResponse build() {
            return new ConnectToTargetSqlMITaskInputResponse(targetConnectionInfo);
        }
    }
}
