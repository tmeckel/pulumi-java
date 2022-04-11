// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The data stored in Parquet format.
 * 
 */
public final class ParquetFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParquetFormatArgs Empty = new ParquetFormatArgs();

    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deserializer")
      private final @Nullable Output<Object> deserializer;

    public Output<Object> getDeserializer() {
        return this.deserializer == null ? Codegen.empty() : this.deserializer;
    }

    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serializer")
      private final @Nullable Output<Object> serializer;

    public Output<Object> getSerializer() {
        return this.serializer == null ? Codegen.empty() : this.serializer;
    }

    /**
     * Type of dataset storage format.
     * Expected value is 'ParquetFormat'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ParquetFormatArgs(
        @Nullable Output<Object> deserializer,
        @Nullable Output<Object> serializer,
        Output<String> type) {
        this.deserializer = deserializer;
        this.serializer = serializer;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ParquetFormatArgs() {
        this.deserializer = Codegen.empty();
        this.serializer = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParquetFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> deserializer;
        private @Nullable Output<Object> serializer;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ParquetFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deserializer = defaults.deserializer;
    	      this.serializer = defaults.serializer;
    	      this.type = defaults.type;
        }

        public Builder deserializer(@Nullable Output<Object> deserializer) {
            this.deserializer = deserializer;
            return this;
        }
        public Builder deserializer(@Nullable Object deserializer) {
            this.deserializer = Codegen.ofNullable(deserializer);
            return this;
        }
        public Builder serializer(@Nullable Output<Object> serializer) {
            this.serializer = serializer;
            return this;
        }
        public Builder serializer(@Nullable Object serializer) {
            this.serializer = Codegen.ofNullable(serializer);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ParquetFormatArgs build() {
            return new ParquetFormatArgs(deserializer, serializer, type);
        }
    }
}
