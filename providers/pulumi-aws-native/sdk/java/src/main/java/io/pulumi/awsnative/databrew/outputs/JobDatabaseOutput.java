// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.JobDatabaseOutputDatabaseOutputMode;
import io.pulumi.awsnative.databrew.outputs.JobDatabaseTableOutputOptions;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobDatabaseOutput {
    private final JobDatabaseTableOutputOptions databaseOptions;
    /**
     * Database table name
     * 
     */
    private final @Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode;
    /**
     * Glue connection name
     * 
     */
    private final String glueConnectionName;

    @OutputCustomType.Constructor
    private JobDatabaseOutput(
        @OutputCustomType.Parameter("databaseOptions") JobDatabaseTableOutputOptions databaseOptions,
        @OutputCustomType.Parameter("databaseOutputMode") @Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode,
        @OutputCustomType.Parameter("glueConnectionName") String glueConnectionName) {
        this.databaseOptions = databaseOptions;
        this.databaseOutputMode = databaseOutputMode;
        this.glueConnectionName = glueConnectionName;
    }

    public JobDatabaseTableOutputOptions getDatabaseOptions() {
        return this.databaseOptions;
    }
    /**
     * Database table name
     * 
    */
    public Optional<JobDatabaseOutputDatabaseOutputMode> getDatabaseOutputMode() {
        return Optional.ofNullable(this.databaseOutputMode);
    }
    /**
     * Glue connection name
     * 
    */
    public String getGlueConnectionName() {
        return this.glueConnectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDatabaseOutput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobDatabaseTableOutputOptions databaseOptions;
        private @Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode;
        private String glueConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDatabaseOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseOptions = defaults.databaseOptions;
    	      this.databaseOutputMode = defaults.databaseOutputMode;
    	      this.glueConnectionName = defaults.glueConnectionName;
        }

        public Builder databaseOptions(JobDatabaseTableOutputOptions databaseOptions) {
            this.databaseOptions = Objects.requireNonNull(databaseOptions);
            return this;
        }

        public Builder databaseOutputMode(@Nullable JobDatabaseOutputDatabaseOutputMode databaseOutputMode) {
            this.databaseOutputMode = databaseOutputMode;
            return this;
        }

        public Builder glueConnectionName(String glueConnectionName) {
            this.glueConnectionName = Objects.requireNonNull(glueConnectionName);
            return this;
        }
        public JobDatabaseOutput build() {
            return new JobDatabaseOutput(databaseOptions, databaseOutputMode, glueConnectionName);
        }
    }
}
