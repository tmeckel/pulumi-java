// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TypedLocalObjectReference {
    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    private final @Nullable String apiGroup;
    /**
     * Kind is the type of resource being referenced
     * 
     */
    private final String kind;
    /**
     * Name is the name of resource being referenced
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private TypedLocalObjectReference(
        @OutputCustomType.Parameter("apiGroup") @Nullable String apiGroup,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
    }

    /**
     * APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
    */
    public Optional<String> getApiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * Kind is the type of resource being referenced
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name is the name of resource being referenced
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TypedLocalObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGroup;
        private String kind;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TypedLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder apiGroup(@Nullable String apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public TypedLocalObjectReference build() {
            return new TypedLocalObjectReference(apiGroup, kind, name);
        }
    }
}
