// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGlobalTableArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGlobalTableArgs Empty = new GetGlobalTableArgs();

    @InputImport(name="tableName", required=true)
      private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    public GetGlobalTableArgs(String tableName) {
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private GetGlobalTableArgs() {
        this.tableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public GetGlobalTableArgs build() {
            return new GetGlobalTableArgs(tableName);
        }
    }
}
