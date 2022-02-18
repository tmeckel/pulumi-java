// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A unique identifier for an entity in the Cloud Identity Groups API. An entity can represent either a group with an optional `namespace` or a user without a `namespace`. The combination of `id` and `namespace` must be unique; however, the same `id` can be used with different `namespace`s.
 * 
 */
public final class EntityKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final EntityKeyResponse Empty = new EntityKeyResponse();

    /**
     * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source}`.
     * 
     */
    @InputImport(name="namespace", required=true)
    private final String namespace;

    public String getNamespace() {
        return this.namespace;
    }

    public EntityKeyResponse(String namespace) {
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
    }

    private EntityKeyResponse() {
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespace = defaults.namespace;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public EntityKeyResponse build() {
            return new EntityKeyResponse(namespace);
        }
    }
}
