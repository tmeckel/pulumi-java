// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.EnumValueResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EnumResponse {
    /**
     * Enum value definitions.
     * 
     */
    private final List<EnumValueResponse> enumvalue;
    /**
     * Enum type name.
     * 
     */
    private final String name;
    /**
     * Protocol buffer options.
     * 
     */
    private final List<OptionResponse> options;
    /**
     * The source context.
     * 
     */
    private final SourceContextResponse sourceContext;
    /**
     * The source syntax.
     * 
     */
    private final String syntax;

    @OutputCustomType.Constructor
    private EnumResponse(
        @OutputCustomType.Parameter("enumvalue") List<EnumValueResponse> enumvalue,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("options") List<OptionResponse> options,
        @OutputCustomType.Parameter("sourceContext") SourceContextResponse sourceContext,
        @OutputCustomType.Parameter("syntax") String syntax) {
        this.enumvalue = enumvalue;
        this.name = name;
        this.options = options;
        this.sourceContext = sourceContext;
        this.syntax = syntax;
    }

    /**
     * Enum value definitions.
     * 
    */
    public List<EnumValueResponse> getEnumvalue() {
        return this.enumvalue;
    }
    /**
     * Enum type name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Protocol buffer options.
     * 
    */
    public List<OptionResponse> getOptions() {
        return this.options;
    }
    /**
     * The source context.
     * 
    */
    public SourceContextResponse getSourceContext() {
        return this.sourceContext;
    }
    /**
     * The source syntax.
     * 
    */
    public String getSyntax() {
        return this.syntax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnumResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EnumValueResponse> enumvalue;
        private String name;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(EnumResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumvalue = defaults.enumvalue;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder enumvalue(List<EnumValueResponse> enumvalue) {
            this.enumvalue = Objects.requireNonNull(enumvalue);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }

        public Builder sourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }

        public Builder syntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }
        public EnumResponse build() {
            return new EnumResponse(enumvalue, name, options, sourceContext, syntax);
        }
    }
}
