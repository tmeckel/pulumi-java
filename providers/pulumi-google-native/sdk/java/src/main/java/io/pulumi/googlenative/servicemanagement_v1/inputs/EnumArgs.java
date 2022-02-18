// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.enums.EnumSyntax;
import io.pulumi.googlenative.servicemanagement_v1.inputs.EnumValueArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SourceContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enum type definition.
 * 
 */
public final class EnumArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnumArgs Empty = new EnumArgs();

    /**
     * Enum value definitions.
     * 
     */
    @InputImport(name="enumvalue")
    private final @Nullable Input<List<EnumValueArgs>> enumvalue;

    public Input<List<EnumValueArgs>> getEnumvalue() {
        return this.enumvalue == null ? Input.empty() : this.enumvalue;
    }

    /**
     * Enum type name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Protocol buffer options.
     * 
     */
    @InputImport(name="options")
    private final @Nullable Input<List<OptionArgs>> options;

    public Input<List<OptionArgs>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * The source context.
     * 
     */
    @InputImport(name="sourceContext")
    private final @Nullable Input<SourceContextArgs> sourceContext;

    public Input<SourceContextArgs> getSourceContext() {
        return this.sourceContext == null ? Input.empty() : this.sourceContext;
    }

    /**
     * The source syntax.
     * 
     */
    @InputImport(name="syntax")
    private final @Nullable Input<EnumSyntax> syntax;

    public Input<EnumSyntax> getSyntax() {
        return this.syntax == null ? Input.empty() : this.syntax;
    }

    public EnumArgs(
        @Nullable Input<List<EnumValueArgs>> enumvalue,
        @Nullable Input<String> name,
        @Nullable Input<List<OptionArgs>> options,
        @Nullable Input<SourceContextArgs> sourceContext,
        @Nullable Input<EnumSyntax> syntax) {
        this.enumvalue = enumvalue;
        this.name = name;
        this.options = options;
        this.sourceContext = sourceContext;
        this.syntax = syntax;
    }

    private EnumArgs() {
        this.enumvalue = Input.empty();
        this.name = Input.empty();
        this.options = Input.empty();
        this.sourceContext = Input.empty();
        this.syntax = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EnumValueArgs>> enumvalue;
        private @Nullable Input<String> name;
        private @Nullable Input<List<OptionArgs>> options;
        private @Nullable Input<SourceContextArgs> sourceContext;
        private @Nullable Input<EnumSyntax> syntax;

        public Builder() {
    	      // Empty
        }

        public Builder(EnumArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enumvalue = defaults.enumvalue;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
        }

        public Builder setEnumvalue(@Nullable Input<List<EnumValueArgs>> enumvalue) {
            this.enumvalue = enumvalue;
            return this;
        }

        public Builder setEnumvalue(@Nullable List<EnumValueArgs> enumvalue) {
            this.enumvalue = Input.ofNullable(enumvalue);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptions(@Nullable Input<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable List<OptionArgs> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSourceContext(@Nullable Input<SourceContextArgs> sourceContext) {
            this.sourceContext = sourceContext;
            return this;
        }

        public Builder setSourceContext(@Nullable SourceContextArgs sourceContext) {
            this.sourceContext = Input.ofNullable(sourceContext);
            return this;
        }

        public Builder setSyntax(@Nullable Input<EnumSyntax> syntax) {
            this.syntax = syntax;
            return this;
        }

        public Builder setSyntax(@Nullable EnumSyntax syntax) {
            this.syntax = Input.ofNullable(syntax);
            return this;
        }

        public EnumArgs build() {
            return new EnumArgs(enumvalue, name, options, sourceContext, syntax);
        }
    }
}
