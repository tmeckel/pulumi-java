// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryScriptOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryScriptOptionsGetArgs Empty = new JobQueryScriptOptionsGetArgs();

    /**
     * Determines which statement in the script represents the "key result",
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
     */
    @Import(name="keyResultStatement")
      private final @Nullable Output<String> keyResultStatement;

    public Output<String> getKeyResultStatement() {
        return this.keyResultStatement == null ? Codegen.empty() : this.keyResultStatement;
    }

    /**
     * Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
     */
    @Import(name="statementByteBudget")
      private final @Nullable Output<String> statementByteBudget;

    public Output<String> getStatementByteBudget() {
        return this.statementByteBudget == null ? Codegen.empty() : this.statementByteBudget;
    }

    /**
     * Timeout period for each statement in a script.
     * 
     */
    @Import(name="statementTimeoutMs")
      private final @Nullable Output<String> statementTimeoutMs;

    public Output<String> getStatementTimeoutMs() {
        return this.statementTimeoutMs == null ? Codegen.empty() : this.statementTimeoutMs;
    }

    public JobQueryScriptOptionsGetArgs(
        @Nullable Output<String> keyResultStatement,
        @Nullable Output<String> statementByteBudget,
        @Nullable Output<String> statementTimeoutMs) {
        this.keyResultStatement = keyResultStatement;
        this.statementByteBudget = statementByteBudget;
        this.statementTimeoutMs = statementTimeoutMs;
    }

    private JobQueryScriptOptionsGetArgs() {
        this.keyResultStatement = Codegen.empty();
        this.statementByteBudget = Codegen.empty();
        this.statementTimeoutMs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryScriptOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyResultStatement;
        private @Nullable Output<String> statementByteBudget;
        private @Nullable Output<String> statementTimeoutMs;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryScriptOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyResultStatement = defaults.keyResultStatement;
    	      this.statementByteBudget = defaults.statementByteBudget;
    	      this.statementTimeoutMs = defaults.statementTimeoutMs;
        }

        public Builder keyResultStatement(@Nullable Output<String> keyResultStatement) {
            this.keyResultStatement = keyResultStatement;
            return this;
        }
        public Builder keyResultStatement(@Nullable String keyResultStatement) {
            this.keyResultStatement = Codegen.ofNullable(keyResultStatement);
            return this;
        }
        public Builder statementByteBudget(@Nullable Output<String> statementByteBudget) {
            this.statementByteBudget = statementByteBudget;
            return this;
        }
        public Builder statementByteBudget(@Nullable String statementByteBudget) {
            this.statementByteBudget = Codegen.ofNullable(statementByteBudget);
            return this;
        }
        public Builder statementTimeoutMs(@Nullable Output<String> statementTimeoutMs) {
            this.statementTimeoutMs = statementTimeoutMs;
            return this;
        }
        public Builder statementTimeoutMs(@Nullable String statementTimeoutMs) {
            this.statementTimeoutMs = Codegen.ofNullable(statementTimeoutMs);
            return this;
        }        public JobQueryScriptOptionsGetArgs build() {
            return new JobQueryScriptOptionsGetArgs(keyResultStatement, statementByteBudget, statementTimeoutMs);
        }
    }
}
