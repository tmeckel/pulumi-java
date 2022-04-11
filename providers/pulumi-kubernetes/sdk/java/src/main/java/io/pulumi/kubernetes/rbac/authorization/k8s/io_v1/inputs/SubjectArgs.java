// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 * 
 */
public final class SubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubjectArgs Empty = new SubjectArgs();

    /**
     * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
     * 
     */
    @Import(name="apiGroup")
      private final @Nullable Output<String> apiGroup;

    public Output<String> getApiGroup() {
        return this.apiGroup == null ? Codegen.empty() : this.apiGroup;
    }

    /**
     * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * Name of the object being referenced.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    public SubjectArgs(
        @Nullable Output<String> apiGroup,
        Output<String> kind,
        Output<String> name,
        @Nullable Output<String> namespace) {
        this.apiGroup = apiGroup;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = namespace;
    }

    private SubjectArgs() {
        this.apiGroup = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiGroup;
        private Output<String> kind;
        private Output<String> name;
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
        }

        public Builder apiGroup(@Nullable Output<String> apiGroup) {
            this.apiGroup = apiGroup;
            return this;
        }
        public Builder apiGroup(@Nullable String apiGroup) {
            this.apiGroup = Codegen.ofNullable(apiGroup);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }        public SubjectArgs build() {
            return new SubjectArgs(apiGroup, kind, name, namespace);
        }
    }
}
