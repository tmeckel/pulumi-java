// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.AzureActiveDirectoryAppResponse;
import io.pulumi.azurenative.datamigration.inputs.MiSqlConnectionInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Input for the task that validates connection to Azure SQL Database Managed Instance online scenario.
 * 
 */
public final class ConnectToTargetSqlMISyncTaskInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetSqlMISyncTaskInputResponse Empty = new ConnectToTargetSqlMISyncTaskInputResponse();

    /**
     * Azure Active Directory Application the DMS instance will use to connect to the target instance of Azure SQL Database Managed Instance and the Azure Storage Account
     * 
     */
    @InputImport(name="azureApp", required=true)
      private final AzureActiveDirectoryAppResponse azureApp;

    public AzureActiveDirectoryAppResponse getAzureApp() {
        return this.azureApp;
    }

    /**
     * Connection information for Azure SQL Database Managed Instance
     * 
     */
    @InputImport(name="targetConnectionInfo", required=true)
      private final MiSqlConnectionInfoResponse targetConnectionInfo;

    public MiSqlConnectionInfoResponse getTargetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    public ConnectToTargetSqlMISyncTaskInputResponse(
        AzureActiveDirectoryAppResponse azureApp,
        MiSqlConnectionInfoResponse targetConnectionInfo) {
        this.azureApp = Objects.requireNonNull(azureApp, "expected parameter 'azureApp' to be non-null");
        this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
    }

    private ConnectToTargetSqlMISyncTaskInputResponse() {
        this.azureApp = null;
        this.targetConnectionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMISyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureActiveDirectoryAppResponse azureApp;
        private MiSqlConnectionInfoResponse targetConnectionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureApp = defaults.azureApp;
    	      this.targetConnectionInfo = defaults.targetConnectionInfo;
        }

        public Builder azureApp(AzureActiveDirectoryAppResponse azureApp) {
            this.azureApp = Objects.requireNonNull(azureApp);
            return this;
        }

        public Builder targetConnectionInfo(MiSqlConnectionInfoResponse targetConnectionInfo) {
            this.targetConnectionInfo = Objects.requireNonNull(targetConnectionInfo);
            return this;
        }
        public ConnectToTargetSqlMISyncTaskInputResponse build() {
            return new ConnectToTargetSqlMISyncTaskInputResponse(azureApp, targetConnectionInfo);
        }
    }
}
