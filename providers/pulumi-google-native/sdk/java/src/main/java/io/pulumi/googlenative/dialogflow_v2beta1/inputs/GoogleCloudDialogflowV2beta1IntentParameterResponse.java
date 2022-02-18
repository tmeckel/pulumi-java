// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents intent parameters.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentParameterResponse Empty = new GoogleCloudDialogflowV2beta1IntentParameterResponse();

    /**
     * Optional. The default value to use when the `value` yields an empty result. Default values can be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
     * 
     */
    @InputImport(name="defaultValue", required=true)
    private final String defaultValue;

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * The name of the parameter.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. The name of the entity type, prefixed with `@`, that describes values of the parameter. If the parameter is required, this must be provided.
     * 
     */
    @InputImport(name="entityTypeDisplayName", required=true)
    private final String entityTypeDisplayName;

    public String getEntityTypeDisplayName() {
        return this.entityTypeDisplayName;
    }

    /**
     * Optional. Indicates whether the parameter represents a list of values.
     * 
     */
    @InputImport(name="isList", required=true)
    private final Boolean isList;

    public Boolean getIsList() {
        return this.isList;
    }

    /**
     * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be completed without collecting the parameter value.
     * 
     */
    @InputImport(name="mandatory", required=true)
    private final Boolean mandatory;

    public Boolean getMandatory() {
        return this.mandatory;
    }

    /**
     * The unique identifier of this parameter.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Optional. The collection of prompts that the agent can present to the user in order to collect a value for the parameter.
     * 
     */
    @InputImport(name="prompts", required=true)
    private final List<String> prompts;

    public List<String> getPrompts() {
        return this.prompts;
    }

    /**
     * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter value defined as `$parameter_name`, - an original parameter value defined as `$parameter_name.original`, - a parameter value from some context defined as `#context_name.parameter_name`.
     * 
     */
    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public GoogleCloudDialogflowV2beta1IntentParameterResponse(
        String defaultValue,
        String displayName,
        String entityTypeDisplayName,
        Boolean isList,
        Boolean mandatory,
        String name,
        List<String> prompts,
        String value) {
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entityTypeDisplayName = Objects.requireNonNull(entityTypeDisplayName, "expected parameter 'entityTypeDisplayName' to be non-null");
        this.isList = Objects.requireNonNull(isList, "expected parameter 'isList' to be non-null");
        this.mandatory = Objects.requireNonNull(mandatory, "expected parameter 'mandatory' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.prompts = Objects.requireNonNull(prompts, "expected parameter 'prompts' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentParameterResponse() {
        this.defaultValue = null;
        this.displayName = null;
        this.entityTypeDisplayName = null;
        this.isList = null;
        this.mandatory = null;
        this.name = null;
        this.prompts = List.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultValue;
        private String displayName;
        private String entityTypeDisplayName;
        private Boolean isList;
        private Boolean mandatory;
        private String name;
        private List<String> prompts;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.displayName = defaults.displayName;
    	      this.entityTypeDisplayName = defaults.entityTypeDisplayName;
    	      this.isList = defaults.isList;
    	      this.mandatory = defaults.mandatory;
    	      this.name = defaults.name;
    	      this.prompts = defaults.prompts;
    	      this.value = defaults.value;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setEntityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = Objects.requireNonNull(entityTypeDisplayName);
            return this;
        }

        public Builder setIsList(Boolean isList) {
            this.isList = Objects.requireNonNull(isList);
            return this;
        }

        public Builder setMandatory(Boolean mandatory) {
            this.mandatory = Objects.requireNonNull(mandatory);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrompts(List<String> prompts) {
            this.prompts = Objects.requireNonNull(prompts);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentParameterResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentParameterResponse(defaultValue, displayName, entityTypeDisplayName, isList, mandatory, name, prompts, value);
        }
    }
}
