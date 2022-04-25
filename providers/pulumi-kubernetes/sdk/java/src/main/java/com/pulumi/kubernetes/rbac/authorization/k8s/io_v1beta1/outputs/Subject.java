// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.rbac.authorization.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Subject {
    /**
     * @return APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
     * 
     */
    private final @Nullable String apiGroup;
    /**
     * @return Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    private final String kind;
    /**
     * @return Name of the object being referenced.
     * 
     */
    private final String name;
    /**
     * @return Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    private final @Nullable String namespace;

    @CustomType.Constructor
    private Subject(
        @CustomType.Parameter("apiGroup") @Nullable String apiGroup,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
    }

    /**
     * @return APIGroup holds the API group of the referenced subject. Defaults to &#34;&#34; for ServiceAccount subjects. Defaults to &#34;rbac.authorization.k8s.io&#34; for User and Group subjects.
     * 
     */
    public Optional<String> apiGroup() {
        return Optional.ofNullable(this.apiGroup);
    }
    /**
     * @return Kind of object being referenced. Values defined by this API group are &#34;User&#34;, &#34;Group&#34;, and &#34;ServiceAccount&#34;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Name of the object being referenced.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespace of the referenced object.  If the object kind is non-namespace, such as &#34;User&#34; or &#34;Group&#34;, and this value is not empty the Authorizer should report an error.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Subject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apiGroup;
        private String kind;
        private String name;
        private @Nullable String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(Subject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
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
        }        public Subject build() {
            return new Subject(apiGroup, kind, name, namespace);
        }
    }
}
