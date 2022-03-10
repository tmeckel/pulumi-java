// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ConnectToSourceSqlServerTaskOutputTaskLevelResponse {
    /**
     * Source agent jobs as a map from agent job name to id.
     * 
     */
    private final Map<String,String> agentJobs;
    /**
     * Source databases as a map from database name to database id
     * 
     */
    private final Map<String,String> databases;
    /**
     * Result identifier
     * 
     */
    private final String id;
    /**
     * Source logins as a map from login name to login id.
     * 
     */
    private final Map<String,String> logins;
    /**
     * Type of result - database level or task level
     * Expected value is 'TaskLevelOutput'.
     * 
     */
    private final String resultType;
    /**
     * Source server brand version
     * 
     */
    private final String sourceServerBrandVersion;
    /**
     * Source server version
     * 
     */
    private final String sourceServerVersion;
    /**
     * Validation errors
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @OutputCustomType.Constructor
    private ConnectToSourceSqlServerTaskOutputTaskLevelResponse(
        @OutputCustomType.Parameter("agentJobs") Map<String,String> agentJobs,
        @OutputCustomType.Parameter("databases") Map<String,String> databases,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("logins") Map<String,String> logins,
        @OutputCustomType.Parameter("resultType") String resultType,
        @OutputCustomType.Parameter("sourceServerBrandVersion") String sourceServerBrandVersion,
        @OutputCustomType.Parameter("sourceServerVersion") String sourceServerVersion,
        @OutputCustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.agentJobs = agentJobs;
        this.databases = databases;
        this.id = id;
        this.logins = logins;
        this.resultType = resultType;
        this.sourceServerBrandVersion = sourceServerBrandVersion;
        this.sourceServerVersion = sourceServerVersion;
        this.validationErrors = validationErrors;
    }

    /**
     * Source agent jobs as a map from agent job name to id.
     * 
    */
    public Map<String,String> getAgentJobs() {
        return this.agentJobs;
    }
    /**
     * Source databases as a map from database name to database id
     * 
    */
    public Map<String,String> getDatabases() {
        return this.databases;
    }
    /**
     * Result identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Source logins as a map from login name to login id.
     * 
    */
    public Map<String,String> getLogins() {
        return this.logins;
    }
    /**
     * Type of result - database level or task level
     * Expected value is 'TaskLevelOutput'.
     * 
    */
    public String getResultType() {
        return this.resultType;
    }
    /**
     * Source server brand version
     * 
    */
    public String getSourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }
    /**
     * Source server version
     * 
    */
    public String getSourceServerVersion() {
        return this.sourceServerVersion;
    }
    /**
     * Validation errors
     * 
    */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerTaskOutputTaskLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> agentJobs;
        private Map<String,String> databases;
        private String id;
        private Map<String,String> logins;
        private String resultType;
        private String sourceServerBrandVersion;
        private String sourceServerVersion;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerTaskOutputTaskLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentJobs = defaults.agentJobs;
    	      this.databases = defaults.databases;
    	      this.id = defaults.id;
    	      this.logins = defaults.logins;
    	      this.resultType = defaults.resultType;
    	      this.sourceServerBrandVersion = defaults.sourceServerBrandVersion;
    	      this.sourceServerVersion = defaults.sourceServerVersion;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder agentJobs(Map<String,String> agentJobs) {
            this.agentJobs = Objects.requireNonNull(agentJobs);
            return this;
        }

        public Builder databases(Map<String,String> databases) {
            this.databases = Objects.requireNonNull(databases);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder logins(Map<String,String> logins) {
            this.logins = Objects.requireNonNull(logins);
            return this;
        }

        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder sourceServerBrandVersion(String sourceServerBrandVersion) {
            this.sourceServerBrandVersion = Objects.requireNonNull(sourceServerBrandVersion);
            return this;
        }

        public Builder sourceServerVersion(String sourceServerVersion) {
            this.sourceServerVersion = Objects.requireNonNull(sourceServerVersion);
            return this;
        }

        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public ConnectToSourceSqlServerTaskOutputTaskLevelResponse build() {
            return new ConnectToSourceSqlServerTaskOutputTaskLevelResponse(agentJobs, databases, id, logins, resultType, sourceServerBrandVersion, sourceServerVersion, validationErrors);
        }
    }
}
