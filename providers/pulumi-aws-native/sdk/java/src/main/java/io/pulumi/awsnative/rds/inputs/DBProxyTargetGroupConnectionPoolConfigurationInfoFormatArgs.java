// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs Empty = new DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs();

    /**
     * The number of seconds for a proxy to wait for a connection to become available in the connection pool.
     * 
     */
    @Import(name="connectionBorrowTimeout")
      private final @Nullable Output<Integer> connectionBorrowTimeout;

    public Output<Integer> getConnectionBorrowTimeout() {
        return this.connectionBorrowTimeout == null ? Codegen.empty() : this.connectionBorrowTimeout;
    }

    /**
     * One or more SQL statements for the proxy to run when opening each new database connection.
     * 
     */
    @Import(name="initQuery")
      private final @Nullable Output<String> initQuery;

    public Output<String> getInitQuery() {
        return this.initQuery == null ? Codegen.empty() : this.initQuery;
    }

    /**
     * The maximum size of the connection pool for each target in a target group.
     * 
     */
    @Import(name="maxConnectionsPercent")
      private final @Nullable Output<Integer> maxConnectionsPercent;

    public Output<Integer> getMaxConnectionsPercent() {
        return this.maxConnectionsPercent == null ? Codegen.empty() : this.maxConnectionsPercent;
    }

    /**
     * Controls how actively the proxy closes idle database connections in the connection pool.
     * 
     */
    @Import(name="maxIdleConnectionsPercent")
      private final @Nullable Output<Integer> maxIdleConnectionsPercent;

    public Output<Integer> getMaxIdleConnectionsPercent() {
        return this.maxIdleConnectionsPercent == null ? Codegen.empty() : this.maxIdleConnectionsPercent;
    }

    /**
     * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection.
     * 
     */
    @Import(name="sessionPinningFilters")
      private final @Nullable Output<List<String>> sessionPinningFilters;

    public Output<List<String>> getSessionPinningFilters() {
        return this.sessionPinningFilters == null ? Codegen.empty() : this.sessionPinningFilters;
    }

    public DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs(
        @Nullable Output<Integer> connectionBorrowTimeout,
        @Nullable Output<String> initQuery,
        @Nullable Output<Integer> maxConnectionsPercent,
        @Nullable Output<Integer> maxIdleConnectionsPercent,
        @Nullable Output<List<String>> sessionPinningFilters) {
        this.connectionBorrowTimeout = connectionBorrowTimeout;
        this.initQuery = initQuery;
        this.maxConnectionsPercent = maxConnectionsPercent;
        this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
        this.sessionPinningFilters = sessionPinningFilters;
    }

    private DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs() {
        this.connectionBorrowTimeout = Codegen.empty();
        this.initQuery = Codegen.empty();
        this.maxConnectionsPercent = Codegen.empty();
        this.maxIdleConnectionsPercent = Codegen.empty();
        this.sessionPinningFilters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> connectionBorrowTimeout;
        private @Nullable Output<String> initQuery;
        private @Nullable Output<Integer> maxConnectionsPercent;
        private @Nullable Output<Integer> maxIdleConnectionsPercent;
        private @Nullable Output<List<String>> sessionPinningFilters;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBorrowTimeout = defaults.connectionBorrowTimeout;
    	      this.initQuery = defaults.initQuery;
    	      this.maxConnectionsPercent = defaults.maxConnectionsPercent;
    	      this.maxIdleConnectionsPercent = defaults.maxIdleConnectionsPercent;
    	      this.sessionPinningFilters = defaults.sessionPinningFilters;
        }

        public Builder connectionBorrowTimeout(@Nullable Output<Integer> connectionBorrowTimeout) {
            this.connectionBorrowTimeout = connectionBorrowTimeout;
            return this;
        }
        public Builder connectionBorrowTimeout(@Nullable Integer connectionBorrowTimeout) {
            this.connectionBorrowTimeout = Codegen.ofNullable(connectionBorrowTimeout);
            return this;
        }
        public Builder initQuery(@Nullable Output<String> initQuery) {
            this.initQuery = initQuery;
            return this;
        }
        public Builder initQuery(@Nullable String initQuery) {
            this.initQuery = Codegen.ofNullable(initQuery);
            return this;
        }
        public Builder maxConnectionsPercent(@Nullable Output<Integer> maxConnectionsPercent) {
            this.maxConnectionsPercent = maxConnectionsPercent;
            return this;
        }
        public Builder maxConnectionsPercent(@Nullable Integer maxConnectionsPercent) {
            this.maxConnectionsPercent = Codegen.ofNullable(maxConnectionsPercent);
            return this;
        }
        public Builder maxIdleConnectionsPercent(@Nullable Output<Integer> maxIdleConnectionsPercent) {
            this.maxIdleConnectionsPercent = maxIdleConnectionsPercent;
            return this;
        }
        public Builder maxIdleConnectionsPercent(@Nullable Integer maxIdleConnectionsPercent) {
            this.maxIdleConnectionsPercent = Codegen.ofNullable(maxIdleConnectionsPercent);
            return this;
        }
        public Builder sessionPinningFilters(@Nullable Output<List<String>> sessionPinningFilters) {
            this.sessionPinningFilters = sessionPinningFilters;
            return this;
        }
        public Builder sessionPinningFilters(@Nullable List<String> sessionPinningFilters) {
            this.sessionPinningFilters = Codegen.ofNullable(sessionPinningFilters);
            return this;
        }
        public Builder sessionPinningFilters(String... sessionPinningFilters) {
            return sessionPinningFilters(List.of(sessionPinningFilters));
        }        public DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs build() {
            return new DBProxyTargetGroupConnectionPoolConfigurationInfoFormatArgs(connectionBorrowTimeout, initQuery, maxConnectionsPercent, maxIdleConnectionsPercent, sessionPinningFilters);
        }
    }
}
