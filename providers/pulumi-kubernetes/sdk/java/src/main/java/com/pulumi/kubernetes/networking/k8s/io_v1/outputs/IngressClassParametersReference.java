// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressClassParametersReference {
    /**
     * @return APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    private final @Nullable String apiGroup;
    /**
     * @return Kind is the type of resource being referenced.
     * 
     */
    private final String kind;
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    private final String name;
    /**
     * @return Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
     * 
     */
    private final @Nullable String scope;

    @CustomType.Constructor
    private IngressClassParametersReference(
        @CustomType.Parameter("apiGroup") @Nullable String apiGroup,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("scope") @Nullable String scope) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
        this.scope = scope;
    }

    /**
     * @return APIGroup is the group for the resource being referenced. If APIGroup is not specified, the specified Kind must be in the core API group. For any other third-party types, APIGroup is required.
     * 
     */
    public Optional<String> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * @return Kind is the type of resource being referenced.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name is the name of resource being referenced.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespace is the namespace of the resource being referenced. This field is required when scope is set to &#34;Namespace&#34; and must be unset when scope is set to &#34;Cluster&#34;.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return Scope represents if this refers to a cluster or namespace scoped resource. This may be set to &#34;Cluster&#34; (default) or &#34;Namespace&#34;.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressClassParametersReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGroup;
        private String kind;
        private String name;
        private @Nullable String namespace;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressClassParametersReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.scope = defaults.scope;
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
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }        public IngressClassParametersReference build() {
            return new IngressClassParametersReference(apiGroup, kind, name, namespace, scope);
        }
    }
}
