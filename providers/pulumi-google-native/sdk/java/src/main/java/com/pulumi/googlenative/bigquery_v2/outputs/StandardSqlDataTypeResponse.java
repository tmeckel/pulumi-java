// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.StandardSqlStructTypeResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StandardSqlDataTypeResponse {
    /**
     * @return The type of the array&#39;s elements, if type_kind = &#34;ARRAY&#34;.
     * 
     */
    private final StandardSqlDataTypeResponse arrayElementType;
    /**
     * @return The fields of this struct, in order, if type_kind = &#34;STRUCT&#34;.
     * 
     */
    private final StandardSqlStructTypeResponse structType;
    /**
     * @return The top level type of this field. Can be any standard SQL data type (e.g., &#34;INT64&#34;, &#34;DATE&#34;, &#34;ARRAY&#34;).
     * 
     */
    private final String typeKind;

    @CustomType.Constructor
    private StandardSqlDataTypeResponse(
        @CustomType.Parameter("arrayElementType") StandardSqlDataTypeResponse arrayElementType,
        @CustomType.Parameter("structType") StandardSqlStructTypeResponse structType,
        @CustomType.Parameter("typeKind") String typeKind) {
        this.arrayElementType = arrayElementType;
        this.structType = structType;
        this.typeKind = typeKind;
    }

    /**
     * @return The type of the array&#39;s elements, if type_kind = &#34;ARRAY&#34;.
     * 
     */
    public StandardSqlDataTypeResponse arrayElementType() {
        return this.arrayElementType;
    }
    /**
     * @return The fields of this struct, in order, if type_kind = &#34;STRUCT&#34;.
     * 
     */
    public StandardSqlStructTypeResponse structType() {
        return this.structType;
    }
    /**
     * @return The top level type of this field. Can be any standard SQL data type (e.g., &#34;INT64&#34;, &#34;DATE&#34;, &#34;ARRAY&#34;).
     * 
     */
    public String typeKind() {
        return this.typeKind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardSqlDataTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardSqlDataTypeResponse arrayElementType;
        private StandardSqlStructTypeResponse structType;
        private String typeKind;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardSqlDataTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arrayElementType = defaults.arrayElementType;
    	      this.structType = defaults.structType;
    	      this.typeKind = defaults.typeKind;
        }

        public Builder arrayElementType(StandardSqlDataTypeResponse arrayElementType) {
            this.arrayElementType = Objects.requireNonNull(arrayElementType);
            return this;
        }
        public Builder structType(StandardSqlStructTypeResponse structType) {
            this.structType = Objects.requireNonNull(structType);
            return this;
        }
        public Builder typeKind(String typeKind) {
            this.typeKind = Objects.requireNonNull(typeKind);
            return this;
        }        public StandardSqlDataTypeResponse build() {
            return new StandardSqlDataTypeResponse(arrayElementType, structType, typeKind);
        }
    }
}
