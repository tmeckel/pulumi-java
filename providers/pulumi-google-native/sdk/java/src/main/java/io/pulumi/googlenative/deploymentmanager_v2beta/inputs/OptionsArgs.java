// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.AsyncOptionsArgs;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.InputMappingArgs;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.ValidationOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options allows customized resource handling by Deployment Manager.
 * 
 */
public final class OptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptionsArgs Empty = new OptionsArgs();

    /**
     * Options regarding how to thread async requests.
     * 
     */
    @InputImport(name="asyncOptions")
      private final @Nullable Input<List<AsyncOptionsArgs>> asyncOptions;

    public Input<List<AsyncOptionsArgs>> getAsyncOptions() {
        return this.asyncOptions == null ? Input.empty() : this.asyncOptions;
    }

    /**
     * The mappings that apply for requests.
     * 
     */
    @InputImport(name="inputMappings")
      private final @Nullable Input<List<InputMappingArgs>> inputMappings;

    public Input<List<InputMappingArgs>> getInputMappings() {
        return this.inputMappings == null ? Input.empty() : this.inputMappings;
    }

    /**
     * Options for how to validate and process properties on a resource.
     * 
     */
    @InputImport(name="validationOptions")
      private final @Nullable Input<ValidationOptionsArgs> validationOptions;

    public Input<ValidationOptionsArgs> getValidationOptions() {
        return this.validationOptions == null ? Input.empty() : this.validationOptions;
    }

    /**
     * Additional properties block described as a jsonSchema, these properties will never be part of the json payload, but they can be consumed by InputMappings, this must be a valid json schema draft-04. The properties specified here will be decouple in a different section. This schema will be merged to the schema validation, and properties here will be extracted From the payload and consumed explicitly by InputMappings. ex: field1: type: string field2: type: number
     * 
     */
    @InputImport(name="virtualProperties")
      private final @Nullable Input<String> virtualProperties;

    public Input<String> getVirtualProperties() {
        return this.virtualProperties == null ? Input.empty() : this.virtualProperties;
    }

    public OptionsArgs(
        @Nullable Input<List<AsyncOptionsArgs>> asyncOptions,
        @Nullable Input<List<InputMappingArgs>> inputMappings,
        @Nullable Input<ValidationOptionsArgs> validationOptions,
        @Nullable Input<String> virtualProperties) {
        this.asyncOptions = asyncOptions;
        this.inputMappings = inputMappings;
        this.validationOptions = validationOptions;
        this.virtualProperties = virtualProperties;
    }

    private OptionsArgs() {
        this.asyncOptions = Input.empty();
        this.inputMappings = Input.empty();
        this.validationOptions = Input.empty();
        this.virtualProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AsyncOptionsArgs>> asyncOptions;
        private @Nullable Input<List<InputMappingArgs>> inputMappings;
        private @Nullable Input<ValidationOptionsArgs> validationOptions;
        private @Nullable Input<String> virtualProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncOptions = defaults.asyncOptions;
    	      this.inputMappings = defaults.inputMappings;
    	      this.validationOptions = defaults.validationOptions;
    	      this.virtualProperties = defaults.virtualProperties;
        }

        public Builder asyncOptions(@Nullable Input<List<AsyncOptionsArgs>> asyncOptions) {
            this.asyncOptions = asyncOptions;
            return this;
        }

        public Builder asyncOptions(@Nullable List<AsyncOptionsArgs> asyncOptions) {
            this.asyncOptions = Input.ofNullable(asyncOptions);
            return this;
        }

        public Builder inputMappings(@Nullable Input<List<InputMappingArgs>> inputMappings) {
            this.inputMappings = inputMappings;
            return this;
        }

        public Builder inputMappings(@Nullable List<InputMappingArgs> inputMappings) {
            this.inputMappings = Input.ofNullable(inputMappings);
            return this;
        }

        public Builder validationOptions(@Nullable Input<ValidationOptionsArgs> validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public Builder validationOptions(@Nullable ValidationOptionsArgs validationOptions) {
            this.validationOptions = Input.ofNullable(validationOptions);
            return this;
        }

        public Builder virtualProperties(@Nullable Input<String> virtualProperties) {
            this.virtualProperties = virtualProperties;
            return this;
        }

        public Builder virtualProperties(@Nullable String virtualProperties) {
            this.virtualProperties = Input.ofNullable(virtualProperties);
            return this;
        }
        public OptionsArgs build() {
            return new OptionsArgs(asyncOptions, inputMappings, validationOptions, virtualProperties);
        }
    }
}
