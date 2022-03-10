// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Output for the task that validates connection to Azure SQL Database Managed Instance.
 * 
 */
public final class ConnectToTargetSqlMISyncTaskOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetSqlMISyncTaskOutputResponse Empty = new ConnectToTargetSqlMISyncTaskOutputResponse();

    /**
     * Target server brand version
     * 
     */
    @InputImport(name="targetServerBrandVersion", required=true)
      private final String targetServerBrandVersion;

    public String getTargetServerBrandVersion() {
        return this.targetServerBrandVersion;
    }

    /**
     * Target server version
     * 
     */
    @InputImport(name="targetServerVersion", required=true)
      private final String targetServerVersion;

    public String getTargetServerVersion() {
        return this.targetServerVersion;
    }

    /**
     * Validation errors
     * 
     */
    @InputImport(name="validationErrors", required=true)
      private final List<ReportableExceptionResponse> validationErrors;

    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public ConnectToTargetSqlMISyncTaskOutputResponse(
        String targetServerBrandVersion,
        String targetServerVersion,
        List<ReportableExceptionResponse> validationErrors) {
        this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion, "expected parameter 'targetServerBrandVersion' to be non-null");
        this.targetServerVersion = Objects.requireNonNull(targetServerVersion, "expected parameter 'targetServerVersion' to be non-null");
        this.validationErrors = Objects.requireNonNull(validationErrors, "expected parameter 'validationErrors' to be non-null");
    }

    private ConnectToTargetSqlMISyncTaskOutputResponse() {
        this.targetServerBrandVersion = null;
        this.targetServerVersion = null;
        this.validationErrors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMISyncTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetServerBrandVersion;
        private String targetServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetServerBrandVersion = defaults.targetServerBrandVersion;
    	      this.targetServerVersion = defaults.targetServerVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder targetServerBrandVersion(String targetServerBrandVersion) {
            this.targetServerBrandVersion = Objects.requireNonNull(targetServerBrandVersion);
            return this;
        }

        public Builder targetServerVersion(String targetServerVersion) {
            this.targetServerVersion = Objects.requireNonNull(targetServerVersion);
            return this;
        }

        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public ConnectToTargetSqlMISyncTaskOutputResponse build() {
            return new ConnectToTargetSqlMISyncTaskOutputResponse(targetServerBrandVersion, targetServerVersion, validationErrors);
        }
    }
}
