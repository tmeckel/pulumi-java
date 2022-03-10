// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App Dapr component metadata.
 * 
 */
public final class DaprMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaprMetadataArgs Empty = new DaprMetadataArgs();

    /**
     * Metadata property name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name of the Container App secret from which to pull the metadata property value.
     * 
     */
    @InputImport(name="secretRef")
      private final @Nullable Input<String> secretRef;

    public Input<String> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    /**
     * Metadata property value.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public DaprMetadataArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> secretRef,
        @Nullable Input<String> value) {
        this.name = name;
        this.secretRef = secretRef;
        this.value = value;
    }

    private DaprMetadataArgs() {
        this.name = Input.empty();
        this.secretRef = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> secretRef;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secretRef = defaults.secretRef;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder secretRef(@Nullable Input<String> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder secretRef(@Nullable String secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder value(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public DaprMetadataArgs build() {
            return new DaprMetadataArgs(name, secretRef, value);
        }
    }
}
