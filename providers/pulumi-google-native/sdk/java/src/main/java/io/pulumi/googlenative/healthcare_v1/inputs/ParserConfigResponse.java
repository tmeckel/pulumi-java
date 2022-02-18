// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.SchemaPackageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration for the parser. It determines how the server parses the messages.
 * 
 */
public final class ParserConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParserConfigResponse Empty = new ParserConfigResponse();

    /**
     * Determines whether messages with no header are allowed.
     * 
     */
    @InputImport(name="allowNullHeader", required=true)
    private final Boolean allowNullHeader;

    public Boolean getAllowNullHeader() {
        return this.allowNullHeader;
    }

    /**
     * Schemas used to parse messages in this store, if schematized parsing is desired.
     * 
     */
    @InputImport(name="schema", required=true)
    private final SchemaPackageResponse schema;

    public SchemaPackageResponse getSchema() {
        return this.schema;
    }

    /**
     * Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator, matching the HL7 version 2 specification.
     * 
     */
    @InputImport(name="segmentTerminator", required=true)
    private final String segmentTerminator;

    public String getSegmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
     * 
     */
    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public ParserConfigResponse(
        Boolean allowNullHeader,
        SchemaPackageResponse schema,
        String segmentTerminator,
        String version) {
        this.allowNullHeader = Objects.requireNonNull(allowNullHeader, "expected parameter 'allowNullHeader' to be non-null");
        this.schema = Objects.requireNonNull(schema, "expected parameter 'schema' to be non-null");
        this.segmentTerminator = Objects.requireNonNull(segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ParserConfigResponse() {
        this.allowNullHeader = null;
        this.schema = null;
        this.segmentTerminator = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParserConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowNullHeader;
        private SchemaPackageResponse schema;
        private String segmentTerminator;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ParserConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowNullHeader = defaults.allowNullHeader;
    	      this.schema = defaults.schema;
    	      this.segmentTerminator = defaults.segmentTerminator;
    	      this.version = defaults.version;
        }

        public Builder setAllowNullHeader(Boolean allowNullHeader) {
            this.allowNullHeader = Objects.requireNonNull(allowNullHeader);
            return this;
        }

        public Builder setSchema(SchemaPackageResponse schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }

        public Builder setSegmentTerminator(String segmentTerminator) {
            this.segmentTerminator = Objects.requireNonNull(segmentTerminator);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public ParserConfigResponse build() {
            return new ParserConfigResponse(allowNullHeader, schema, segmentTerminator, version);
        }
    }
}
