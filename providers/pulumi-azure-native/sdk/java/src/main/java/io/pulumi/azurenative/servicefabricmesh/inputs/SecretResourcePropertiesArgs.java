// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties of a secret resource.
 * 
 */
public final class SecretResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretResourcePropertiesArgs Empty = new SecretResourcePropertiesArgs();

    /**
     * The type of the content stored in the secret value. The value of this property is opaque to Service Fabric. Once set, the value of this property cannot be changed.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * User readable description of the secret.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Describes the kind of secret.
     * Expected value is 'SecretResourceProperties'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    public SecretResourcePropertiesArgs(
        @Nullable Input<String> contentType,
        @Nullable Input<String> description,
        Input<String> kind) {
        this.contentType = contentType;
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private SecretResourcePropertiesArgs() {
        this.contentType = Input.empty();
        this.description = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> description;
        private Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
        }

        public Builder contentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder contentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
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

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }
        public SecretResourcePropertiesArgs build() {
            return new SecretResourcePropertiesArgs(contentType, description, kind);
        }
    }
}
