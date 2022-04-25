// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlUpsertSettingsResponse {
    /**
     * @return Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object interimSchemaName;
    /**
     * @return Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    private final @Nullable Object keys;
    /**
     * @return Specifies whether to use temp db for upsert interim table. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object useTempDB;

    @CustomType.Constructor
    private SqlUpsertSettingsResponse(
        @CustomType.Parameter("interimSchemaName") @Nullable Object interimSchemaName,
        @CustomType.Parameter("keys") @Nullable Object keys,
        @CustomType.Parameter("useTempDB") @Nullable Object useTempDB) {
        this.interimSchemaName = interimSchemaName;
        this.keys = keys;
        this.useTempDB = useTempDB;
    }

    /**
     * @return Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> interimSchemaName() {
        return Optional.ofNullable(this.interimSchemaName);
    }
    /**
     * @return Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    public Optional<Object> keys() {
        return Optional.ofNullable(this.keys);
    }
    /**
     * @return Specifies whether to use temp db for upsert interim table. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> useTempDB() {
        return Optional.ofNullable(this.useTempDB);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlUpsertSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object interimSchemaName;
        private @Nullable Object keys;
        private @Nullable Object useTempDB;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlUpsertSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interimSchemaName = defaults.interimSchemaName;
    	      this.keys = defaults.keys;
    	      this.useTempDB = defaults.useTempDB;
        }

        public Builder interimSchemaName(@Nullable Object interimSchemaName) {
            this.interimSchemaName = interimSchemaName;
            return this;
        }
        public Builder keys(@Nullable Object keys) {
            this.keys = keys;
            return this;
        }
        public Builder useTempDB(@Nullable Object useTempDB) {
            this.useTempDB = useTempDB;
            return this;
        }        public SqlUpsertSettingsResponse build() {
            return new SqlUpsertSettingsResponse(interimSchemaName, keys, useTempDB);
        }
    }
}
