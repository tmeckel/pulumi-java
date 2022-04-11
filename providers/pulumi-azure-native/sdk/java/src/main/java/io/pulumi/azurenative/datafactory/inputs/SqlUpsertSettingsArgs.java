// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sql upsert option settings
 * 
 */
public final class SqlUpsertSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlUpsertSettingsArgs Empty = new SqlUpsertSettingsArgs();

    /**
     * Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="interimSchemaName")
      private final @Nullable Output<Object> interimSchemaName;

    public Output<Object> getInterimSchemaName() {
        return this.interimSchemaName == null ? Codegen.empty() : this.interimSchemaName;
    }

    /**
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<Object> keys;

    public Output<Object> getKeys() {
        return this.keys == null ? Codegen.empty() : this.keys;
    }

    /**
     * Specifies whether to use temp db for upsert interim table. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useTempDB")
      private final @Nullable Output<Object> useTempDB;

    public Output<Object> getUseTempDB() {
        return this.useTempDB == null ? Codegen.empty() : this.useTempDB;
    }

    public SqlUpsertSettingsArgs(
        @Nullable Output<Object> interimSchemaName,
        @Nullable Output<Object> keys,
        @Nullable Output<Object> useTempDB) {
        this.interimSchemaName = interimSchemaName;
        this.keys = keys;
        this.useTempDB = useTempDB;
    }

    private SqlUpsertSettingsArgs() {
        this.interimSchemaName = Codegen.empty();
        this.keys = Codegen.empty();
        this.useTempDB = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlUpsertSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> interimSchemaName;
        private @Nullable Output<Object> keys;
        private @Nullable Output<Object> useTempDB;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlUpsertSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interimSchemaName = defaults.interimSchemaName;
    	      this.keys = defaults.keys;
    	      this.useTempDB = defaults.useTempDB;
        }

        public Builder interimSchemaName(@Nullable Output<Object> interimSchemaName) {
            this.interimSchemaName = interimSchemaName;
            return this;
        }
        public Builder interimSchemaName(@Nullable Object interimSchemaName) {
            this.interimSchemaName = Codegen.ofNullable(interimSchemaName);
            return this;
        }
        public Builder keys(@Nullable Output<Object> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable Object keys) {
            this.keys = Codegen.ofNullable(keys);
            return this;
        }
        public Builder useTempDB(@Nullable Output<Object> useTempDB) {
            this.useTempDB = useTempDB;
            return this;
        }
        public Builder useTempDB(@Nullable Object useTempDB) {
            this.useTempDB = Codegen.ofNullable(useTempDB);
            return this;
        }        public SqlUpsertSettingsArgs build() {
            return new SqlUpsertSettingsArgs(interimSchemaName, keys, useTempDB);
        }
    }
}
