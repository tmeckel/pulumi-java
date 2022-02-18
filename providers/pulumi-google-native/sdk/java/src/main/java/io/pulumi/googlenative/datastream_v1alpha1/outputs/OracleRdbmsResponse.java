// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleSchemaResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OracleRdbmsResponse {
    /**
     * Oracle schemas/databases in the database server.
     * 
     */
    private final List<OracleSchemaResponse> oracleSchemas;

    @OutputCustomType.Constructor({"oracleSchemas"})
    private OracleRdbmsResponse(List<OracleSchemaResponse> oracleSchemas) {
        this.oracleSchemas = Objects.requireNonNull(oracleSchemas);
    }

    /**
     * Oracle schemas/databases in the database server.
     * 
     */
    public List<OracleSchemaResponse> getOracleSchemas() {
        return this.oracleSchemas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleRdbmsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OracleSchemaResponse> oracleSchemas;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleRdbmsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleSchemas = defaults.oracleSchemas;
        }

        public Builder setOracleSchemas(List<OracleSchemaResponse> oracleSchemas) {
            this.oracleSchemas = Objects.requireNonNull(oracleSchemas);
            return this;
        }

        public OracleRdbmsResponse build() {
            return new OracleRdbmsResponse(oracleSchemas);
        }
    }
}
