// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Image registry that contains the base image.
 * 
 */
public final class ModelDockerSectionResponseResponseBaseImageRegistry extends io.pulumi.resources.InvokeArgs {

    public static final ModelDockerSectionResponseResponseBaseImageRegistry Empty = new ModelDockerSectionResponseResponseBaseImageRegistry();

    @InputImport(name="address")
      private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    public ModelDockerSectionResponseResponseBaseImageRegistry(@Nullable String address) {
        this.address = address;
    }

    private ModelDockerSectionResponseResponseBaseImageRegistry() {
        this.address = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDockerSectionResponseResponseBaseImageRegistry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDockerSectionResponseResponseBaseImageRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public ModelDockerSectionResponseResponseBaseImageRegistry build() {
            return new ModelDockerSectionResponseResponseBaseImageRegistry(address);
        }
    }
}
