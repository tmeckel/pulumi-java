// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Oracle Column.
 * 
 */
public final class OracleColumnResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleColumnResponse Empty = new OracleColumnResponse();

    /**
     * Column name.
     * 
     */
    @InputImport(name="columnName", required=true)
    private final String columnName;

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * The Oracle data type.
     * 
     */
    @InputImport(name="dataType", required=true)
    private final String dataType;

    public String getDataType() {
        return this.dataType;
    }

    /**
     * Column encoding.
     * 
     */
    @InputImport(name="encoding", required=true)
    private final String encoding;

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * Column length.
     * 
     */
    @InputImport(name="length", required=true)
    private final Integer length;

    public Integer getLength() {
        return this.length;
    }

    /**
     * Whether or not the column can accept a null value.
     * 
     */
    @InputImport(name="nullable", required=true)
    private final Boolean nullable;

    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * The ordinal position of the column in the table.
     * 
     */
    @InputImport(name="ordinalPosition", required=true)
    private final Integer ordinalPosition;

    public Integer getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Column precision.
     * 
     */
    @InputImport(name="precision", required=true)
    private final Integer precision;

    public Integer getPrecision() {
        return this.precision;
    }

    /**
     * Whether or not the column represents a primary key.
     * 
     */
    @InputImport(name="primaryKey", required=true)
    private final Boolean primaryKey;

    public Boolean getPrimaryKey() {
        return this.primaryKey;
    }

    /**
     * Column scale.
     * 
     */
    @InputImport(name="scale", required=true)
    private final Integer scale;

    public Integer getScale() {
        return this.scale;
    }

    public OracleColumnResponse(
        String columnName,
        String dataType,
        String encoding,
        Integer length,
        Boolean nullable,
        Integer ordinalPosition,
        Integer precision,
        Boolean primaryKey,
        Integer scale) {
        this.columnName = Objects.requireNonNull(columnName, "expected parameter 'columnName' to be non-null");
        this.dataType = Objects.requireNonNull(dataType, "expected parameter 'dataType' to be non-null");
        this.encoding = Objects.requireNonNull(encoding, "expected parameter 'encoding' to be non-null");
        this.length = Objects.requireNonNull(length, "expected parameter 'length' to be non-null");
        this.nullable = Objects.requireNonNull(nullable, "expected parameter 'nullable' to be non-null");
        this.ordinalPosition = Objects.requireNonNull(ordinalPosition, "expected parameter 'ordinalPosition' to be non-null");
        this.precision = Objects.requireNonNull(precision, "expected parameter 'precision' to be non-null");
        this.primaryKey = Objects.requireNonNull(primaryKey, "expected parameter 'primaryKey' to be non-null");
        this.scale = Objects.requireNonNull(scale, "expected parameter 'scale' to be non-null");
    }

    private OracleColumnResponse() {
        this.columnName = null;
        this.dataType = null;
        this.encoding = null;
        this.length = null;
        this.nullable = null;
        this.ordinalPosition = null;
        this.precision = null;
        this.primaryKey = null;
        this.scale = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String dataType;
        private String encoding;
        private Integer length;
        private Boolean nullable;
        private Integer ordinalPosition;
        private Integer precision;
        private Boolean primaryKey;
        private Integer scale;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.dataType = defaults.dataType;
    	      this.encoding = defaults.encoding;
    	      this.length = defaults.length;
    	      this.nullable = defaults.nullable;
    	      this.ordinalPosition = defaults.ordinalPosition;
    	      this.precision = defaults.precision;
    	      this.primaryKey = defaults.primaryKey;
    	      this.scale = defaults.scale;
        }

        public Builder setColumnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }

        public Builder setDataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }

        public Builder setEncoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }

        public Builder setLength(Integer length) {
            this.length = Objects.requireNonNull(length);
            return this;
        }

        public Builder setNullable(Boolean nullable) {
            this.nullable = Objects.requireNonNull(nullable);
            return this;
        }

        public Builder setOrdinalPosition(Integer ordinalPosition) {
            this.ordinalPosition = Objects.requireNonNull(ordinalPosition);
            return this;
        }

        public Builder setPrecision(Integer precision) {
            this.precision = Objects.requireNonNull(precision);
            return this;
        }

        public Builder setPrimaryKey(Boolean primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setScale(Integer scale) {
            this.scale = Objects.requireNonNull(scale);
            return this;
        }

        public OracleColumnResponse build() {
            return new OracleColumnResponse(columnName, dataType, encoding, length, nullable, ordinalPosition, precision, primaryKey, scale);
        }
    }
}
