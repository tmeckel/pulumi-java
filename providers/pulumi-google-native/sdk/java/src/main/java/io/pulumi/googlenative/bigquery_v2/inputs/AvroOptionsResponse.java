// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class AvroOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AvroOptionsResponse Empty = new AvroOptionsResponse();

    /**
     * [Optional] If sourceFormat is set to "AVRO", indicates whether to interpret logical types as the corresponding BigQuery data type (for example, TIMESTAMP), instead of using the raw type (for example, INTEGER).
     * 
     */
    @InputImport(name="useAvroLogicalTypes", required=true)
    private final Boolean useAvroLogicalTypes;

    public Boolean getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes;
    }

    public AvroOptionsResponse(Boolean useAvroLogicalTypes) {
        this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes, "expected parameter 'useAvroLogicalTypes' to be non-null");
    }

    private AvroOptionsResponse() {
        this.useAvroLogicalTypes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvroOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder setUseAvroLogicalTypes(Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Objects.requireNonNull(useAvroLogicalTypes);
            return this;
        }

        public AvroOptionsResponse build() {
            return new AvroOptionsResponse(useAvroLogicalTypes);
        }
    }
}
