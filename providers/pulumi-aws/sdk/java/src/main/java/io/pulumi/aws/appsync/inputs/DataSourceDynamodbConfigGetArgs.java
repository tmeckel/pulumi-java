// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigDeltaSyncConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceDynamodbConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceDynamodbConfigGetArgs Empty = new DataSourceDynamodbConfigGetArgs();

    @InputImport(name="deltaSyncConfig")
      private final @Nullable Input<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> deltaSyncConfig;

    public Input<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> getDeltaSyncConfig() {
        return this.deltaSyncConfig == null ? Input.empty() : this.deltaSyncConfig;
    }

    /**
     * AWS Region for RDS HTTP endpoint. Defaults to current region.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Name of the DynamoDB table.
     * 
     */
    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    /**
     * Set to `true` to use Amazon Cognito credentials with this data source.
     * 
     */
    @InputImport(name="useCallerCredentials")
      private final @Nullable Input<Boolean> useCallerCredentials;

    public Input<Boolean> getUseCallerCredentials() {
        return this.useCallerCredentials == null ? Input.empty() : this.useCallerCredentials;
    }

    @InputImport(name="versioned")
      private final @Nullable Input<Boolean> versioned;

    public Input<Boolean> getVersioned() {
        return this.versioned == null ? Input.empty() : this.versioned;
    }

    public DataSourceDynamodbConfigGetArgs(
        @Nullable Input<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> deltaSyncConfig,
        @Nullable Input<String> region,
        Input<String> tableName,
        @Nullable Input<Boolean> useCallerCredentials,
        @Nullable Input<Boolean> versioned) {
        this.deltaSyncConfig = deltaSyncConfig;
        this.region = region;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
        this.useCallerCredentials = useCallerCredentials;
        this.versioned = versioned;
    }

    private DataSourceDynamodbConfigGetArgs() {
        this.deltaSyncConfig = Input.empty();
        this.region = Input.empty();
        this.tableName = Input.empty();
        this.useCallerCredentials = Input.empty();
        this.versioned = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceDynamodbConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> deltaSyncConfig;
        private @Nullable Input<String> region;
        private Input<String> tableName;
        private @Nullable Input<Boolean> useCallerCredentials;
        private @Nullable Input<Boolean> versioned;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceDynamodbConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaSyncConfig = defaults.deltaSyncConfig;
    	      this.region = defaults.region;
    	      this.tableName = defaults.tableName;
    	      this.useCallerCredentials = defaults.useCallerCredentials;
    	      this.versioned = defaults.versioned;
        }

        public Builder deltaSyncConfig(@Nullable Input<DataSourceDynamodbConfigDeltaSyncConfigGetArgs> deltaSyncConfig) {
            this.deltaSyncConfig = deltaSyncConfig;
            return this;
        }

        public Builder deltaSyncConfig(@Nullable DataSourceDynamodbConfigDeltaSyncConfigGetArgs deltaSyncConfig) {
            this.deltaSyncConfig = Input.ofNullable(deltaSyncConfig);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder tableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }

        public Builder useCallerCredentials(@Nullable Input<Boolean> useCallerCredentials) {
            this.useCallerCredentials = useCallerCredentials;
            return this;
        }

        public Builder useCallerCredentials(@Nullable Boolean useCallerCredentials) {
            this.useCallerCredentials = Input.ofNullable(useCallerCredentials);
            return this;
        }

        public Builder versioned(@Nullable Input<Boolean> versioned) {
            this.versioned = versioned;
            return this;
        }

        public Builder versioned(@Nullable Boolean versioned) {
            this.versioned = Input.ofNullable(versioned);
            return this;
        }
        public DataSourceDynamodbConfigGetArgs build() {
            return new DataSourceDynamodbConfigGetArgs(deltaSyncConfig, region, tableName, useCallerCredentials, versioned);
        }
    }
}
