// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CapabilityPropertiesResponse {
    /**
     * Localized string of the description.
     * 
     */
    private final String description;
    /**
     * URL to retrieve JSON schema of the Capability parameters.
     * 
     */
    private final String parametersSchema;
    /**
     * String of the Publisher that this Capability extends.
     * 
     */
    private final String publisher;
    /**
     * String of the Target Type that this Capability extends.
     * 
     */
    private final String targetType;
    /**
     * String of the URN for this Capability Type.
     * 
     */
    private final String urn;

    @OutputCustomType.Constructor
    private CapabilityPropertiesResponse(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("parametersSchema") String parametersSchema,
        @OutputCustomType.Parameter("publisher") String publisher,
        @OutputCustomType.Parameter("targetType") String targetType,
        @OutputCustomType.Parameter("urn") String urn) {
        this.description = description;
        this.parametersSchema = parametersSchema;
        this.publisher = publisher;
        this.targetType = targetType;
        this.urn = urn;
    }

    /**
     * Localized string of the description.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * URL to retrieve JSON schema of the Capability parameters.
     * 
    */
    public String getParametersSchema() {
        return this.parametersSchema;
    }
    /**
     * String of the Publisher that this Capability extends.
     * 
    */
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * String of the Target Type that this Capability extends.
     * 
    */
    public String getTargetType() {
        return this.targetType;
    }
    /**
     * String of the URN for this Capability Type.
     * 
    */
    public String getUrn() {
        return this.urn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapabilityPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String parametersSchema;
        private String publisher;
        private String targetType;
        private String urn;

        public Builder() {
    	      // Empty
        }

        public Builder(CapabilityPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.parametersSchema = defaults.parametersSchema;
    	      this.publisher = defaults.publisher;
    	      this.targetType = defaults.targetType;
    	      this.urn = defaults.urn;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder parametersSchema(String parametersSchema) {
            this.parametersSchema = Objects.requireNonNull(parametersSchema);
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder targetType(String targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder urn(String urn) {
            this.urn = Objects.requireNonNull(urn);
            return this;
        }
        public CapabilityPropertiesResponse build() {
            return new CapabilityPropertiesResponse(description, parametersSchema, publisher, targetType, urn);
        }
    }
}
