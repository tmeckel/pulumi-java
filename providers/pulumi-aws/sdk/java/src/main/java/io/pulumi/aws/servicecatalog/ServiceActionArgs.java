// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceActionArgs Empty = new ServiceActionArgs();

    /**
     * Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
     * 
     */
    @InputImport(name="acceptLanguage")
      private final @Nullable Input<String> acceptLanguage;

    public Input<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Input.empty() : this.acceptLanguage;
    }

    /**
     * Self-service action definition configuration block. Detailed below.
     * 
     */
    @InputImport(name="definition", required=true)
      private final Input<ServiceActionDefinitionArgs> definition;

    public Input<ServiceActionDefinitionArgs> getDefinition() {
        return this.definition;
    }

    /**
     * Self-service action description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Self-service action name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ServiceActionArgs(
        @Nullable Input<String> acceptLanguage,
        Input<ServiceActionDefinitionArgs> definition,
        @Nullable Input<String> description,
        @Nullable Input<String> name) {
        this.acceptLanguage = acceptLanguage;
        this.definition = Objects.requireNonNull(definition, "expected parameter 'definition' to be non-null");
        this.description = description;
        this.name = name;
    }

    private ServiceActionArgs() {
        this.acceptLanguage = Input.empty();
        this.definition = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceptLanguage;
        private Input<ServiceActionDefinitionArgs> definition;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.definition = defaults.definition;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
        }

        public Builder acceptLanguage(@Nullable Input<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Input.ofNullable(acceptLanguage);
            return this;
        }

        public Builder definition(Input<ServiceActionDefinitionArgs> definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }

        public Builder definition(ServiceActionDefinitionArgs definition) {
            this.definition = Input.of(Objects.requireNonNull(definition));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ServiceActionArgs build() {
            return new ServiceActionArgs(acceptLanguage, definition, description, name);
        }
    }
}
