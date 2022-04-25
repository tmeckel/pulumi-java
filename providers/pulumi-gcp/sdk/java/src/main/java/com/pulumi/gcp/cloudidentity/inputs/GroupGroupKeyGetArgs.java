// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupGroupKeyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupGroupKeyGetArgs Empty = new GroupGroupKeyGetArgs();

    /**
     * The ID of the entity.
     * For Google-managed entities, the id must be the email address of an existing
     * group or user.
     * For external-identity-mapped entities, the id must be a string conforming
     * to the Identity Source&#39;s requirements.
     * Must be unique within a namespace.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the entity.
     * For Google-managed entities, the id must be the email address of an existing
     * group or user.
     * For external-identity-mapped entities, the id must be a string conforming
     * to the Identity Source&#39;s requirements.
     * Must be unique within a namespace.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The namespace in which the entity exists.
     * If not specified, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If specified, the EntityKey represents an external-identity-mapped group.
     * The namespace must correspond to an identity source created in Admin Console
     * and must be in the form of `identitysources/{identity_source_id}`.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return The namespace in which the entity exists.
     * If not specified, the EntityKey represents a Google-managed entity
     * such as a Google user or a Google Group.
     * If specified, the EntityKey represents an external-identity-mapped group.
     * The namespace must correspond to an identity source created in Admin Console
     * and must be in the form of `identitysources/{identity_source_id}`.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    private GroupGroupKeyGetArgs() {}

    private GroupGroupKeyGetArgs(GroupGroupKeyGetArgs $) {
        this.id = $.id;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupGroupKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupGroupKeyGetArgs $;

        public Builder() {
            $ = new GroupGroupKeyGetArgs();
        }

        public Builder(GroupGroupKeyGetArgs defaults) {
            $ = new GroupGroupKeyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the entity.
         * For Google-managed entities, the id must be the email address of an existing
         * group or user.
         * For external-identity-mapped entities, the id must be a string conforming
         * to the Identity Source&#39;s requirements.
         * Must be unique within a namespace.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the entity.
         * For Google-managed entities, the id must be the email address of an existing
         * group or user.
         * For external-identity-mapped entities, the id must be a string conforming
         * to the Identity Source&#39;s requirements.
         * Must be unique within a namespace.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param namespace The namespace in which the entity exists.
         * If not specified, the EntityKey represents a Google-managed entity
         * such as a Google user or a Google Group.
         * If specified, the EntityKey represents an external-identity-mapped group.
         * The namespace must correspond to an identity source created in Admin Console
         * and must be in the form of `identitysources/{identity_source_id}`.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The namespace in which the entity exists.
         * If not specified, the EntityKey represents a Google-managed entity
         * such as a Google user or a Google Group.
         * If specified, the EntityKey represents an external-identity-mapped group.
         * The namespace must correspond to an identity source created in Admin Console
         * and must be in the form of `identitysources/{identity_source_id}`.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GroupGroupKeyGetArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
