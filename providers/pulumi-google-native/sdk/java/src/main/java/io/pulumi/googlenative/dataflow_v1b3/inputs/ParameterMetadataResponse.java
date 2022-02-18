// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Metadata for a specific parameter.
 * 
 */
public final class ParameterMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final ParameterMetadataResponse Empty = new ParameterMetadataResponse();

    /**
     * Optional. Additional metadata for describing this parameter.
     * 
     */
    @InputImport(name="customMetadata", required=true)
    private final Map<String,String> customMetadata;

    public Map<String,String> getCustomMetadata() {
        return this.customMetadata;
    }

    /**
     * The help text to display for the parameter.
     * 
     */
    @InputImport(name="helpText", required=true)
    private final String helpText;

    public String getHelpText() {
        return this.helpText;
    }

    /**
     * Optional. Whether the parameter is optional. Defaults to false.
     * 
     */
    @InputImport(name="isOptional", required=true)
    private final Boolean isOptional;

    public Boolean getIsOptional() {
        return this.isOptional;
    }

    /**
     * The label to display for the parameter.
     * 
     */
    @InputImport(name="label", required=true)
    private final String label;

    public String getLabel() {
        return this.label;
    }

    /**
     * The name of the parameter.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Optional. The type of the parameter. Used for selecting input picker.
     * 
     */
    @InputImport(name="paramType", required=true)
    private final String paramType;

    public String getParamType() {
        return this.paramType;
    }

    /**
     * Optional. Regexes that the parameter must match.
     * 
     */
    @InputImport(name="regexes", required=true)
    private final List<String> regexes;

    public List<String> getRegexes() {
        return this.regexes;
    }

    public ParameterMetadataResponse(
        Map<String,String> customMetadata,
        String helpText,
        Boolean isOptional,
        String label,
        String name,
        String paramType,
        List<String> regexes) {
        this.customMetadata = Objects.requireNonNull(customMetadata, "expected parameter 'customMetadata' to be non-null");
        this.helpText = Objects.requireNonNull(helpText, "expected parameter 'helpText' to be non-null");
        this.isOptional = Objects.requireNonNull(isOptional, "expected parameter 'isOptional' to be non-null");
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.paramType = Objects.requireNonNull(paramType, "expected parameter 'paramType' to be non-null");
        this.regexes = Objects.requireNonNull(regexes, "expected parameter 'regexes' to be non-null");
    }

    private ParameterMetadataResponse() {
        this.customMetadata = Map.of();
        this.helpText = null;
        this.isOptional = null;
        this.label = null;
        this.name = null;
        this.paramType = null;
        this.regexes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> customMetadata;
        private String helpText;
        private Boolean isOptional;
        private String label;
        private String name;
        private String paramType;
        private List<String> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customMetadata = defaults.customMetadata;
    	      this.helpText = defaults.helpText;
    	      this.isOptional = defaults.isOptional;
    	      this.label = defaults.label;
    	      this.name = defaults.name;
    	      this.paramType = defaults.paramType;
    	      this.regexes = defaults.regexes;
        }

        public Builder setCustomMetadata(Map<String,String> customMetadata) {
            this.customMetadata = Objects.requireNonNull(customMetadata);
            return this;
        }

        public Builder setHelpText(String helpText) {
            this.helpText = Objects.requireNonNull(helpText);
            return this;
        }

        public Builder setIsOptional(Boolean isOptional) {
            this.isOptional = Objects.requireNonNull(isOptional);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParamType(String paramType) {
            this.paramType = Objects.requireNonNull(paramType);
            return this;
        }

        public Builder setRegexes(List<String> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }

        public ParameterMetadataResponse build() {
            return new ParameterMetadataResponse(customMetadata, helpText, isOptional, label, name, paramType, regexes);
        }
    }
}
