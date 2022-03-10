// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleSchemaArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle database structure.
 * 
 */
public final class OracleRdbmsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleRdbmsArgs Empty = new OracleRdbmsArgs();

    /**
     * Oracle schemas/databases in the database server.
     * 
     */
    @InputImport(name="oracleSchemas")
      private final @Nullable Input<List<OracleSchemaArgs>> oracleSchemas;

    public Input<List<OracleSchemaArgs>> getOracleSchemas() {
        return this.oracleSchemas == null ? Input.empty() : this.oracleSchemas;
    }

    public OracleRdbmsArgs(@Nullable Input<List<OracleSchemaArgs>> oracleSchemas) {
        this.oracleSchemas = oracleSchemas;
    }

    private OracleRdbmsArgs() {
        this.oracleSchemas = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleRdbmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OracleSchemaArgs>> oracleSchemas;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleRdbmsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleSchemas = defaults.oracleSchemas;
        }

        public Builder oracleSchemas(@Nullable Input<List<OracleSchemaArgs>> oracleSchemas) {
            this.oracleSchemas = oracleSchemas;
            return this;
        }

        public Builder oracleSchemas(@Nullable List<OracleSchemaArgs> oracleSchemas) {
            this.oracleSchemas = Input.ofNullable(oracleSchemas);
            return this;
        }
        public OracleRdbmsArgs build() {
            return new OracleRdbmsArgs(oracleSchemas);
        }
    }
}
