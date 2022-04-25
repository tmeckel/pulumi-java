// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1alpha1.inputs.OracleTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Oracle schema.
 * 
 */
public final class OracleSchemaResponse extends com.pulumi.resources.InvokeArgs {

    public static final OracleSchemaResponse Empty = new OracleSchemaResponse();

    /**
     * Tables in the schema.
     * 
     */
    @Import(name="oracleTables", required=true)
    private List<OracleTableResponse> oracleTables;

    /**
     * @return Tables in the schema.
     * 
     */
    public List<OracleTableResponse> oracleTables() {
        return this.oracleTables;
    }

    /**
     * Schema name.
     * 
     */
    @Import(name="schemaName", required=true)
    private String schemaName;

    /**
     * @return Schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    private OracleSchemaResponse() {}

    private OracleSchemaResponse(OracleSchemaResponse $) {
        this.oracleTables = $.oracleTables;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleSchemaResponse $;

        public Builder() {
            $ = new OracleSchemaResponse();
        }

        public Builder(OracleSchemaResponse defaults) {
            $ = new OracleSchemaResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param oracleTables Tables in the schema.
         * 
         * @return builder
         * 
         */
        public Builder oracleTables(List<OracleTableResponse> oracleTables) {
            $.oracleTables = oracleTables;
            return this;
        }

        /**
         * @param oracleTables Tables in the schema.
         * 
         * @return builder
         * 
         */
        public Builder oracleTables(OracleTableResponse... oracleTables) {
            return oracleTables(List.of(oracleTables));
        }

        /**
         * @param schemaName Schema name.
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public OracleSchemaResponse build() {
            $.oracleTables = Objects.requireNonNull($.oracleTables, "expected parameter 'oracleTables' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            return $;
        }
    }

}
