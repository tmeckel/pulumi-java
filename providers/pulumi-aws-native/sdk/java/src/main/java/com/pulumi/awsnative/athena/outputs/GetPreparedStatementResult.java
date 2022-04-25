// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPreparedStatementResult {
    /**
     * @return The description of the prepared statement.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The query string for the prepared statement.
     * 
     */
    private final @Nullable String queryStatement;

    @CustomType.Constructor
    private GetPreparedStatementResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("queryStatement") @Nullable String queryStatement) {
        this.description = description;
        this.queryStatement = queryStatement;
    }

    /**
     * @return The description of the prepared statement.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The query string for the prepared statement.
     * 
     */
    public Optional<String> queryStatement() {
        return Optional.ofNullable(this.queryStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPreparedStatementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String queryStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPreparedStatementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.queryStatement = defaults.queryStatement;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder queryStatement(@Nullable String queryStatement) {
            this.queryStatement = queryStatement;
            return this;
        }        public GetPreparedStatementResult build() {
            return new GetPreparedStatementResult(description, queryStatement);
        }
    }
}
