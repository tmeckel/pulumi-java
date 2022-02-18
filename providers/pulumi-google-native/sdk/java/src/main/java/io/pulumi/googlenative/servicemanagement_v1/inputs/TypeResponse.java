// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.FieldResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A protocol buffer message type.
 * 
 */
public final class TypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final TypeResponse Empty = new TypeResponse();

    /**
     * The list of fields.
     * 
     */
    @InputImport(name="fields", required=true)
    private final List<FieldResponse> fields;

    public List<FieldResponse> getFields() {
        return this.fields;
    }

    /**
     * The fully qualified message name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The list of types appearing in `oneof` definitions in this type.
     * 
     */
    @InputImport(name="oneofs", required=true)
    private final List<String> oneofs;

    public List<String> getOneofs() {
        return this.oneofs;
    }

    /**
     * The protocol buffer options.
     * 
     */
    @InputImport(name="options", required=true)
    private final List<OptionResponse> options;

    public List<OptionResponse> getOptions() {
        return this.options;
    }

    /**
     * The source context.
     * 
     */
    @InputImport(name="sourceContext", required=true)
    private final SourceContextResponse sourceContext;

    public SourceContextResponse getSourceContext() {
        return this.sourceContext;
    }

    /**
     * The source syntax.
     * 
     */
    @InputImport(name="syntax", required=true)
    private final String syntax;

    public String getSyntax() {
        return this.syntax;
    }

    public TypeResponse(
        List<FieldResponse> fields,
        String name,
        List<String> oneofs,
        List<OptionResponse> options,
        SourceContextResponse sourceContext,
        String syntax) {
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.oneofs = Objects.requireNonNull(oneofs, "expected parameter 'oneofs' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.sourceContext = Objects.requireNonNull(sourceContext, "expected parameter 'sourceContext' to be non-null");
        this.syntax = Objects.requireNonNull(syntax, "expected parameter 'syntax' to be non-null");
    }

    private TypeResponse() {
        this.fields = List.of();
        this.name = null;
        this.oneofs = List.of();
        this.options = List.of();
        this.sourceContext = null;
        this.syntax = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FieldResponse> fields;
        private String name;
        private List<String> oneofs;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(TypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.oneofs = defaults.oneofs;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder setFields(List<FieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOneofs(List<String> oneofs) {
            this.oneofs = Objects.requireNonNull(oneofs);
            return this;
        }

        public Builder setOptions(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder setSourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }

        public Builder setSyntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }

        public TypeResponse build() {
            return new TypeResponse(fields, name, oneofs, options, sourceContext, syntax);
        }
    }
}
