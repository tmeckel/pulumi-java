// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ValidateSyncMigrationInputSqlServerTaskOutputResponse {
    /**
     * Database identifier
     * 
     */
    private final String id;
    /**
     * Name of database
     * 
     */
    private final String name;
    /**
     * Errors associated with a selected database object
     * 
     */
    private final List<ReportableExceptionResponse> validationErrors;

    @OutputCustomType.Constructor
    private ValidateSyncMigrationInputSqlServerTaskOutputResponse(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("validationErrors") List<ReportableExceptionResponse> validationErrors) {
        this.id = id;
        this.name = name;
        this.validationErrors = validationErrors;
    }

    /**
     * Database identifier
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of database
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Errors associated with a selected database object
     * 
    */
    public List<ReportableExceptionResponse> getValidationErrors() {
        return this.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateSyncMigrationInputSqlServerTaskOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private List<ReportableExceptionResponse> validationErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateSyncMigrationInputSqlServerTaskOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.validationErrors = defaults.validationErrors;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            this.validationErrors = Objects.requireNonNull(validationErrors);
            return this;
        }
        public ValidateSyncMigrationInputSqlServerTaskOutputResponse build() {
            return new ValidateSyncMigrationInputSqlServerTaskOutputResponse(id, name, validationErrors);
        }
    }
}
