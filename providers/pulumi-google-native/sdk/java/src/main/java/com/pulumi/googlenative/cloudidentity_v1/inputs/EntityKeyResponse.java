// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A unique identifier for an entity in the Cloud Identity Groups API. An entity can represent either a group with an optional `namespace` or a user without a `namespace`. The combination of `id` and `namespace` must be unique; however, the same `id` can be used with different `namespace`s.
 * 
 */
public final class EntityKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final EntityKeyResponse Empty = new EntityKeyResponse();

    /**
     * The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source}`.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source}`.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    private EntityKeyResponse() {}

    private EntityKeyResponse(EntityKeyResponse $) {
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EntityKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EntityKeyResponse $;

        public Builder() {
            $ = new EntityKeyResponse();
        }

        public Builder(EntityKeyResponse defaults) {
            $ = new EntityKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace The namespace in which the entity exists. If not specified, the `EntityKey` represents a Google-managed entity such as a Google user or a Google Group. If specified, the `EntityKey` represents an external-identity-mapped group. The namespace must correspond to an identity source created in Admin Console and must be in the form of `identitysources/{identity_source}`.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public EntityKeyResponse build() {
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
