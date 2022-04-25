// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Types of validations to run after the migration
 * 
 */
public final class MigrationValidationOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrationValidationOptionsArgs Empty = new MigrationValidationOptionsArgs();

    /**
     * Allows to perform a checksum based data integrity validation between source and target for the selected database / tables .
     * 
     */
    @Import(name="enableDataIntegrityValidation")
    private @Nullable Output<Boolean> enableDataIntegrityValidation;

    /**
     * @return Allows to perform a checksum based data integrity validation between source and target for the selected database / tables .
     * 
     */
    public Optional<Output<Boolean>> enableDataIntegrityValidation() {
        return Optional.ofNullable(this.enableDataIntegrityValidation);
    }

    /**
     * Allows to perform a quick and intelligent query analysis by retrieving queries from the source database and executes them in the target. The result will have execution statistics for executions in source and target databases for the extracted queries.
     * 
     */
    @Import(name="enableQueryAnalysisValidation")
    private @Nullable Output<Boolean> enableQueryAnalysisValidation;

    /**
     * @return Allows to perform a quick and intelligent query analysis by retrieving queries from the source database and executes them in the target. The result will have execution statistics for executions in source and target databases for the extracted queries.
     * 
     */
    public Optional<Output<Boolean>> enableQueryAnalysisValidation() {
        return Optional.ofNullable(this.enableQueryAnalysisValidation);
    }

    /**
     * Allows to compare the schema information between source and target.
     * 
     */
    @Import(name="enableSchemaValidation")
    private @Nullable Output<Boolean> enableSchemaValidation;

    /**
     * @return Allows to compare the schema information between source and target.
     * 
     */
    public Optional<Output<Boolean>> enableSchemaValidation() {
        return Optional.ofNullable(this.enableSchemaValidation);
    }

    private MigrationValidationOptionsArgs() {}

    private MigrationValidationOptionsArgs(MigrationValidationOptionsArgs $) {
        this.enableDataIntegrityValidation = $.enableDataIntegrityValidation;
        this.enableQueryAnalysisValidation = $.enableQueryAnalysisValidation;
        this.enableSchemaValidation = $.enableSchemaValidation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrationValidationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrationValidationOptionsArgs $;

        public Builder() {
            $ = new MigrationValidationOptionsArgs();
        }

        public Builder(MigrationValidationOptionsArgs defaults) {
            $ = new MigrationValidationOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableDataIntegrityValidation Allows to perform a checksum based data integrity validation between source and target for the selected database / tables .
         * 
         * @return builder
         * 
         */
        public Builder enableDataIntegrityValidation(@Nullable Output<Boolean> enableDataIntegrityValidation) {
            $.enableDataIntegrityValidation = enableDataIntegrityValidation;
            return this;
        }

        /**
         * @param enableDataIntegrityValidation Allows to perform a checksum based data integrity validation between source and target for the selected database / tables .
         * 
         * @return builder
         * 
         */
        public Builder enableDataIntegrityValidation(Boolean enableDataIntegrityValidation) {
            return enableDataIntegrityValidation(Output.of(enableDataIntegrityValidation));
        }

        /**
         * @param enableQueryAnalysisValidation Allows to perform a quick and intelligent query analysis by retrieving queries from the source database and executes them in the target. The result will have execution statistics for executions in source and target databases for the extracted queries.
         * 
         * @return builder
         * 
         */
        public Builder enableQueryAnalysisValidation(@Nullable Output<Boolean> enableQueryAnalysisValidation) {
            $.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
            return this;
        }

        /**
         * @param enableQueryAnalysisValidation Allows to perform a quick and intelligent query analysis by retrieving queries from the source database and executes them in the target. The result will have execution statistics for executions in source and target databases for the extracted queries.
         * 
         * @return builder
         * 
         */
        public Builder enableQueryAnalysisValidation(Boolean enableQueryAnalysisValidation) {
            return enableQueryAnalysisValidation(Output.of(enableQueryAnalysisValidation));
        }

        /**
         * @param enableSchemaValidation Allows to compare the schema information between source and target.
         * 
         * @return builder
         * 
         */
        public Builder enableSchemaValidation(@Nullable Output<Boolean> enableSchemaValidation) {
            $.enableSchemaValidation = enableSchemaValidation;
            return this;
        }

        /**
         * @param enableSchemaValidation Allows to compare the schema information between source and target.
         * 
         * @return builder
         * 
         */
        public Builder enableSchemaValidation(Boolean enableSchemaValidation) {
            return enableSchemaValidation(Output.of(enableSchemaValidation));
        }

        public MigrationValidationOptionsArgs build() {
            return $;
        }
    }

}
