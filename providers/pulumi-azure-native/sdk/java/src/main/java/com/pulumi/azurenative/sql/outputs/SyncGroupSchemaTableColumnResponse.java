// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SyncGroupSchemaTableColumnResponse {
    /**
     * @return Data size of the column.
     * 
     */
    private final @Nullable String dataSize;
    /**
     * @return Data type of the column.
     * 
     */
    private final @Nullable String dataType;
    /**
     * @return Quoted name of sync group table column.
     * 
     */
    private final @Nullable String quotedName;

    @CustomType.Constructor
    private SyncGroupSchemaTableColumnResponse(
        @CustomType.Parameter("dataSize") @Nullable String dataSize,
        @CustomType.Parameter("dataType") @Nullable String dataType,
        @CustomType.Parameter("quotedName") @Nullable String quotedName) {
        this.dataSize = dataSize;
        this.dataType = dataType;
        this.quotedName = quotedName;
    }

    /**
     * @return Data size of the column.
     * 
     */
    public Optional<String> dataSize() {
        return Optional.ofNullable(this.dataSize);
    }
    /**
     * @return Data type of the column.
     * 
     */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * @return Quoted name of sync group table column.
     * 
     */
    public Optional<String> quotedName() {
        return Optional.ofNullable(this.quotedName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncGroupSchemaTableColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataSize;
        private @Nullable String dataType;
        private @Nullable String quotedName;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncGroupSchemaTableColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSize = defaults.dataSize;
    	      this.dataType = defaults.dataType;
    	      this.quotedName = defaults.quotedName;
        }

        public Builder dataSize(@Nullable String dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder quotedName(@Nullable String quotedName) {
            this.quotedName = quotedName;
            return this;
        }        public SyncGroupSchemaTableColumnResponse build() {
            return new SyncGroupSchemaTableColumnResponse(dataSize, dataType, quotedName);
        }
    }
}
