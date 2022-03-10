// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the configuration for FHIR profiles and validation.
 * 
 */
public final class ValidationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidationConfigArgs Empty = new ValidationConfigArgs();

    /**
     * Whether to disable FHIRPath validation for incoming resources. Set this to true to disable checking incoming resources for conformance against FHIRPath requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @InputImport(name="disableFhirpathValidation")
      private final @Nullable Input<Boolean> disableFhirpathValidation;

    public Input<Boolean> getDisableFhirpathValidation() {
        return this.disableFhirpathValidation == null ? Input.empty() : this.disableFhirpathValidation;
    }

    /**
     * Whether to disable profile validation for this FHIR store. Set this to true to disable checking incoming resources for conformance against structure definitions in this FHIR store.
     * 
     */
    @InputImport(name="disableProfileValidation")
      private final @Nullable Input<Boolean> disableProfileValidation;

    public Input<Boolean> getDisableProfileValidation() {
        return this.disableProfileValidation == null ? Input.empty() : this.disableProfileValidation;
    }

    /**
     * Whether to disable reference type validation for incoming resources. Set this to true to disable checking incoming resources for conformance against reference type requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @InputImport(name="disableReferenceTypeValidation")
      private final @Nullable Input<Boolean> disableReferenceTypeValidation;

    public Input<Boolean> getDisableReferenceTypeValidation() {
        return this.disableReferenceTypeValidation == null ? Input.empty() : this.disableReferenceTypeValidation;
    }

    /**
     * Whether to disable required fields validation for incoming resources. Set this to true to disable checking incoming resources for conformance against required fields requirement defined in the FHIR specification. This property only affects resource types that do not have profiles configured for them, any rules in enabled implementation guides will still be enforced.
     * 
     */
    @InputImport(name="disableRequiredFieldValidation")
      private final @Nullable Input<Boolean> disableRequiredFieldValidation;

    public Input<Boolean> getDisableRequiredFieldValidation() {
        return this.disableRequiredFieldValidation == null ? Input.empty() : this.disableRequiredFieldValidation;
    }

    /**
     * A list of implementation guide URLs in this FHIR store that are used to configure the profiles to use for validation. For example, to use the US Core profiles for validation, set `enabled_implementation_guides` to `["http://hl7.org/fhir/us/core/ImplementationGuide/ig"]`. If `enabled_implementation_guides` is empty or omitted, then incoming resources are only required to conform to the base FHIR profiles. Otherwise, a resource must conform to at least one profile listed in the `global` property of one of the enabled ImplementationGuides. The Cloud Healthcare API does not currently enforce all of the rules in a StructureDefinition. The following rules are supported: - min/max - minValue/maxValue - maxLength - type - fixed[x] - pattern[x] on simple types - slicing, when using "value" as the discriminator type When a URL cannot be resolved (for example, in a type assertion), the server does not return an error.
     * 
     */
    @InputImport(name="enabledImplementationGuides")
      private final @Nullable Input<List<String>> enabledImplementationGuides;

    public Input<List<String>> getEnabledImplementationGuides() {
        return this.enabledImplementationGuides == null ? Input.empty() : this.enabledImplementationGuides;
    }

    public ValidationConfigArgs(
        @Nullable Input<Boolean> disableFhirpathValidation,
        @Nullable Input<Boolean> disableProfileValidation,
        @Nullable Input<Boolean> disableReferenceTypeValidation,
        @Nullable Input<Boolean> disableRequiredFieldValidation,
        @Nullable Input<List<String>> enabledImplementationGuides) {
        this.disableFhirpathValidation = disableFhirpathValidation;
        this.disableProfileValidation = disableProfileValidation;
        this.disableReferenceTypeValidation = disableReferenceTypeValidation;
        this.disableRequiredFieldValidation = disableRequiredFieldValidation;
        this.enabledImplementationGuides = enabledImplementationGuides;
    }

    private ValidationConfigArgs() {
        this.disableFhirpathValidation = Input.empty();
        this.disableProfileValidation = Input.empty();
        this.disableReferenceTypeValidation = Input.empty();
        this.disableRequiredFieldValidation = Input.empty();
        this.enabledImplementationGuides = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableFhirpathValidation;
        private @Nullable Input<Boolean> disableProfileValidation;
        private @Nullable Input<Boolean> disableReferenceTypeValidation;
        private @Nullable Input<Boolean> disableRequiredFieldValidation;
        private @Nullable Input<List<String>> enabledImplementationGuides;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFhirpathValidation = defaults.disableFhirpathValidation;
    	      this.disableProfileValidation = defaults.disableProfileValidation;
    	      this.disableReferenceTypeValidation = defaults.disableReferenceTypeValidation;
    	      this.disableRequiredFieldValidation = defaults.disableRequiredFieldValidation;
    	      this.enabledImplementationGuides = defaults.enabledImplementationGuides;
        }

        public Builder disableFhirpathValidation(@Nullable Input<Boolean> disableFhirpathValidation) {
            this.disableFhirpathValidation = disableFhirpathValidation;
            return this;
        }

        public Builder disableFhirpathValidation(@Nullable Boolean disableFhirpathValidation) {
            this.disableFhirpathValidation = Input.ofNullable(disableFhirpathValidation);
            return this;
        }

        public Builder disableProfileValidation(@Nullable Input<Boolean> disableProfileValidation) {
            this.disableProfileValidation = disableProfileValidation;
            return this;
        }

        public Builder disableProfileValidation(@Nullable Boolean disableProfileValidation) {
            this.disableProfileValidation = Input.ofNullable(disableProfileValidation);
            return this;
        }

        public Builder disableReferenceTypeValidation(@Nullable Input<Boolean> disableReferenceTypeValidation) {
            this.disableReferenceTypeValidation = disableReferenceTypeValidation;
            return this;
        }

        public Builder disableReferenceTypeValidation(@Nullable Boolean disableReferenceTypeValidation) {
            this.disableReferenceTypeValidation = Input.ofNullable(disableReferenceTypeValidation);
            return this;
        }

        public Builder disableRequiredFieldValidation(@Nullable Input<Boolean> disableRequiredFieldValidation) {
            this.disableRequiredFieldValidation = disableRequiredFieldValidation;
            return this;
        }

        public Builder disableRequiredFieldValidation(@Nullable Boolean disableRequiredFieldValidation) {
            this.disableRequiredFieldValidation = Input.ofNullable(disableRequiredFieldValidation);
            return this;
        }

        public Builder enabledImplementationGuides(@Nullable Input<List<String>> enabledImplementationGuides) {
            this.enabledImplementationGuides = enabledImplementationGuides;
            return this;
        }

        public Builder enabledImplementationGuides(@Nullable List<String> enabledImplementationGuides) {
            this.enabledImplementationGuides = Input.ofNullable(enabledImplementationGuides);
            return this;
        }
        public ValidationConfigArgs build() {
            return new ValidationConfigArgs(disableFhirpathValidation, disableProfileValidation, disableReferenceTypeValidation, disableRequiredFieldValidation, enabledImplementationGuides);
        }
    }
}
