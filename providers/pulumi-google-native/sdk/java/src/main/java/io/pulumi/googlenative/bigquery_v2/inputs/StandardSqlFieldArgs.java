// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.bigquery_v2.inputs.StandardSqlDataTypeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A field or a column.
 * 
 */
public final class StandardSqlFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardSqlFieldArgs Empty = new StandardSqlFieldArgs();

    /**
     * Optional. The name of this field. Can be absent for struct fields.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Optional. The type of this parameter. Absent if not explicitly specified (e.g., CREATE FUNCTION statement can omit the return type; in this case the output parameter does not have this "type" field).
     * 
     */
    @Import(name="type")
      private final @Nullable Output<StandardSqlDataTypeArgs> type;

    public Output<StandardSqlDataTypeArgs> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public StandardSqlFieldArgs(
        @Nullable Output<String> name,
        @Nullable Output<StandardSqlDataTypeArgs> type) {
        this.name = name;
        this.type = type;
    }

    private StandardSqlFieldArgs() {
        this.name = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<StandardSqlDataTypeArgs> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder type(@Nullable Output<StandardSqlDataTypeArgs> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable StandardSqlDataTypeArgs type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public StandardSqlFieldArgs build() {
            return new StandardSqlFieldArgs(name, type);
        }
    }
}
