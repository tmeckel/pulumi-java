// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TypedLocalObjectReference contains enough information to let you locate the typed referenced object inside the same namespace.
 * 
 */
public final class TypedLocalObjectReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TypedLocalObjectReferenceArgs Empty = new TypedLocalObjectReferenceArgs();

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    @InputImport(name="apiGroup")
      private final @Nullable Input<String> apiGroup;

    public Input<String> getApiGroup() {
        return this.apiGroup == null ? Input.empty() : this.apiGroup;
    }

    /**
     * Kind is the type of resource being referenced
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public TypedLocalObjectReferenceArgs(
        @Nullable Input<String> apiGroup,
        Input<String> kind,
        Input<String> name) {
        this.apiGroup = apiGroup;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private TypedLocalObjectReferenceArgs() {
        this.apiGroup = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedLocalObjectReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiGroup;
        private Input<String> kind;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedLocalObjectReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder apiGroup(@Nullable Input<String> apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        public Builder apiGroup(@Nullable String apiGroup) {
            this.apiGroup = Input.ofNullable(apiGroup);
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

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public TypedLocalObjectReferenceArgs build() {
            return new TypedLocalObjectReferenceArgs(apiGroup, kind, name);
        }
    }
}
