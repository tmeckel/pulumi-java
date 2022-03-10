// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OracleSchemaResponse {
    /**
     * Tables in the schema.
     * 
     */
    private final List<OracleTableResponse> oracleTables;
    /**
     * Schema name.
     * 
     */
    private final String schemaName;

    @OutputCustomType.Constructor
    private OracleSchemaResponse(
        @OutputCustomType.Parameter("oracleTables") List<OracleTableResponse> oracleTables,
        @OutputCustomType.Parameter("schemaName") String schemaName) {
        this.oracleTables = oracleTables;
        this.schemaName = schemaName;
    }

    /**
     * Tables in the schema.
     * 
    */
    public List<OracleTableResponse> getOracleTables() {
        return this.oracleTables;
    }
    /**
     * Schema name.
     * 
    */
    public String getSchemaName() {
        return this.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OracleTableResponse> oracleTables;
        private String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oracleTables = defaults.oracleTables;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder oracleTables(List<OracleTableResponse> oracleTables) {
            this.oracleTables = Objects.requireNonNull(oracleTables);
            return this;
        }

        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public OracleSchemaResponse build() {
            return new OracleSchemaResponse(oracleTables, schemaName);
        }
    }
}
