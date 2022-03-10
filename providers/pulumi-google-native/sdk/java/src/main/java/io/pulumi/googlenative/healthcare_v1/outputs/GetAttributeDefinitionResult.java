// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAttributeDefinitionResult {
    /**
     * Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    private final List<String> allowedValues;
    /**
     * The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    private final String category;
    /**
     * Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    private final List<String> consentDefaultValues;
    /**
     * Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    private final String dataMappingDefaultValue;
    /**
     * Optional. A description of the attribute.
     * 
     */
    private final String description;
    /**
     * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private GetAttributeDefinitionResult(
        @OutputCustomType.Parameter("allowedValues") List<String> allowedValues,
        @OutputCustomType.Parameter("category") String category,
        @OutputCustomType.Parameter("consentDefaultValues") List<String> consentDefaultValues,
        @OutputCustomType.Parameter("dataMappingDefaultValue") String dataMappingDefaultValue,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("name") String name) {
        this.allowedValues = allowedValues;
        this.category = category;
        this.consentDefaultValues = consentDefaultValues;
        this.dataMappingDefaultValue = dataMappingDefaultValue;
        this.description = description;
        this.name = name;
    }

    /**
     * Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
    */
    public List<String> getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * The category of the attribute. The value of this field cannot be changed after creation.
     * 
    */
    public String getCategory() {
        return this.category;
    }
    /**
     * Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
    */
    public List<String> getConsentDefaultValues() {
        return this.consentDefaultValues;
    }
    /**
     * Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
    */
    public String getDataMappingDefaultValue() {
        return this.dataMappingDefaultValue;
    }
    /**
     * Optional. A description of the attribute.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttributeDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedValues;
        private String category;
        private List<String> consentDefaultValues;
        private String dataMappingDefaultValue;
        private String description;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttributeDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.category = defaults.category;
    	      this.consentDefaultValues = defaults.consentDefaultValues;
    	      this.dataMappingDefaultValue = defaults.dataMappingDefaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder allowedValues(List<String> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder consentDefaultValues(List<String> consentDefaultValues) {
            this.consentDefaultValues = Objects.requireNonNull(consentDefaultValues);
            return this;
        }

        public Builder dataMappingDefaultValue(String dataMappingDefaultValue) {
            this.dataMappingDefaultValue = Objects.requireNonNull(dataMappingDefaultValue);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetAttributeDefinitionResult build() {
            return new GetAttributeDefinitionResult(allowedValues, category, consentDefaultValues, dataMappingDefaultValue, description, name);
        }
    }
}
