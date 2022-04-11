// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipPreferredMemberKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipPreferredMemberKeyArgs Empty = new GroupMembershipPreferredMemberKeyArgs();

    /**
     * The ID of the entity.
     * For Google-managed entities, the id must be the email address of an existing
     * group or user.
     * For external-identity-mapped entities, the id must be a string conforming
     * to the Identity Source's requirements.
     * Must be unique within a namespace.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
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
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    public GroupMembershipPreferredMemberKeyArgs(
        Output<String> id,
        @Nullable Output<String> namespace) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.namespace = namespace;
    }

    private GroupMembershipPreferredMemberKeyArgs() {
        this.id = Codegen.empty();
        this.namespace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipPreferredMemberKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<String> namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipPreferredMemberKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }        public GroupMembershipPreferredMemberKeyArgs build() {
            return new GroupMembershipPreferredMemberKeyArgs(id, namespace);
        }
    }
}
