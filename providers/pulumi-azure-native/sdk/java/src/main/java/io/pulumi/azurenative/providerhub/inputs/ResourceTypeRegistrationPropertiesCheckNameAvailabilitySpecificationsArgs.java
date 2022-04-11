// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs Empty = new ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs();

    @Import(name="enableDefaultValidation")
      private final @Nullable Output<Boolean> enableDefaultValidation;

    public Output<Boolean> getEnableDefaultValidation() {
        return this.enableDefaultValidation == null ? Codegen.empty() : this.enableDefaultValidation;
    }

    @Import(name="resourceTypesWithCustomValidation")
      private final @Nullable Output<List<String>> resourceTypesWithCustomValidation;

    public Output<List<String>> getResourceTypesWithCustomValidation() {
        return this.resourceTypesWithCustomValidation == null ? Codegen.empty() : this.resourceTypesWithCustomValidation;
    }

    public ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs(
        @Nullable Output<Boolean> enableDefaultValidation,
        @Nullable Output<List<String>> resourceTypesWithCustomValidation) {
        this.enableDefaultValidation = enableDefaultValidation;
        this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
    }

    private ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs() {
        this.enableDefaultValidation = Codegen.empty();
        this.resourceTypesWithCustomValidation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableDefaultValidation;
        private @Nullable Output<List<String>> resourceTypesWithCustomValidation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDefaultValidation = defaults.enableDefaultValidation;
    	      this.resourceTypesWithCustomValidation = defaults.resourceTypesWithCustomValidation;
        }

        public Builder enableDefaultValidation(@Nullable Output<Boolean> enableDefaultValidation) {
            this.enableDefaultValidation = enableDefaultValidation;
            return this;
        }
        public Builder enableDefaultValidation(@Nullable Boolean enableDefaultValidation) {
            this.enableDefaultValidation = Codegen.ofNullable(enableDefaultValidation);
            return this;
        }
        public Builder resourceTypesWithCustomValidation(@Nullable Output<List<String>> resourceTypesWithCustomValidation) {
            this.resourceTypesWithCustomValidation = resourceTypesWithCustomValidation;
            return this;
        }
        public Builder resourceTypesWithCustomValidation(@Nullable List<String> resourceTypesWithCustomValidation) {
            this.resourceTypesWithCustomValidation = Codegen.ofNullable(resourceTypesWithCustomValidation);
            return this;
        }
        public Builder resourceTypesWithCustomValidation(String... resourceTypesWithCustomValidation) {
            return resourceTypesWithCustomValidation(List.of(resourceTypesWithCustomValidation));
        }        public ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs build() {
            return new ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs(enableDefaultValidation, resourceTypesWithCustomValidation);
        }
    }
}
