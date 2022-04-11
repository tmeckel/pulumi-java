// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A unique identifier for an entity in the Cloud Identity Groups API. An entity can represent either a group with an optional `namespace` or a user without a `namespace`. The combination of `id` and `namespace` must be unique; however, the same `id` can be used with different `namespace`s.
 * 
 */
public final class EntityKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntityKeyArgs Empty = new EntityKeyArgs();

    /**
     * The ID of the entity. For Google-managed entities, the `id` must be the email address of an existing group or user. For external-identity-mapped entities, the `id` must be a string conforming to the Identity Source's requirements. Must be unique within a `namespace`.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source_id}`.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    public EntityKeyArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> namespace) {
        this.id = id;
        this.namespace = namespace;
    }

    private EntityKeyArgs() {
        this.id = Codegen.empty();
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }        public EntityKeyArgs build() {
            return new EntityKeyArgs(id, namespace);
        }
    }
}
