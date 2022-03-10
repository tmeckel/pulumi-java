// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.azurenative.management.inputs.EntityParentGroupInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The entity.
 * 
 */
public final class EntityInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final EntityInfoResponse Empty = new EntityInfoResponse();

    /**
     * The friendly name of the management group.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The fully qualified ID for the entity.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The users specific permissions to this item.
     * 
     */
    @InputImport(name="inheritedPermissions")
      private final @Nullable String inheritedPermissions;

    public Optional<String> getInheritedPermissions() {
        return this.inheritedPermissions == null ? Optional.empty() : Optional.ofNullable(this.inheritedPermissions);
    }

    /**
     * The name of the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Number of children is the number of Groups that are exactly one level underneath the current Group.
     * 
     */
    @InputImport(name="numberOfChildGroups")
      private final @Nullable Integer numberOfChildGroups;

    public Optional<Integer> getNumberOfChildGroups() {
        return this.numberOfChildGroups == null ? Optional.empty() : Optional.ofNullable(this.numberOfChildGroups);
    }

    /**
     * Number of children is the number of Groups and Subscriptions that are exactly one level underneath the current Group.
     * 
     */
    @InputImport(name="numberOfChildren")
      private final @Nullable Integer numberOfChildren;

    public Optional<Integer> getNumberOfChildren() {
        return this.numberOfChildren == null ? Optional.empty() : Optional.ofNullable(this.numberOfChildren);
    }

    @InputImport(name="numberOfDescendants")
      private final @Nullable Integer numberOfDescendants;

    public Optional<Integer> getNumberOfDescendants() {
        return this.numberOfDescendants == null ? Optional.empty() : Optional.ofNullable(this.numberOfDescendants);
    }

    /**
     * (Optional) The ID of the parent management group.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable EntityParentGroupInfoResponse parent;

    public Optional<EntityParentGroupInfoResponse> getParent() {
        return this.parent == null ? Optional.empty() : Optional.ofNullable(this.parent);
    }

    /**
     * The parent display name chain from the root group to the immediate parent
     * 
     */
    @InputImport(name="parentDisplayNameChain")
      private final @Nullable List<String> parentDisplayNameChain;

    public List<String> getParentDisplayNameChain() {
        return this.parentDisplayNameChain == null ? List.of() : this.parentDisplayNameChain;
    }

    /**
     * The parent name chain from the root group to the immediate parent
     * 
     */
    @InputImport(name="parentNameChain")
      private final @Nullable List<String> parentNameChain;

    public List<String> getParentNameChain() {
        return this.parentNameChain == null ? List.of() : this.parentNameChain;
    }

    /**
     * The users specific permissions to this item.
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable String permissions;

    public Optional<String> getPermissions() {
        return this.permissions == null ? Optional.empty() : Optional.ofNullable(this.permissions);
    }

    /**
     * The AAD Tenant ID associated with the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @InputImport(name="tenantId")
      private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    /**
     * The type of the resource. For example, Microsoft.Management/managementGroups
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public EntityInfoResponse(
        @Nullable String displayName,
        String id,
        @Nullable String inheritedPermissions,
        String name,
        @Nullable Integer numberOfChildGroups,
        @Nullable Integer numberOfChildren,
        @Nullable Integer numberOfDescendants,
        @Nullable EntityParentGroupInfoResponse parent,
        @Nullable List<String> parentDisplayNameChain,
        @Nullable List<String> parentNameChain,
        @Nullable String permissions,
        @Nullable String tenantId,
        String type) {
        this.displayName = displayName;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.inheritedPermissions = inheritedPermissions;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.numberOfChildGroups = numberOfChildGroups;
        this.numberOfChildren = numberOfChildren;
        this.numberOfDescendants = numberOfDescendants;
        this.parent = parent;
        this.parentDisplayNameChain = parentDisplayNameChain;
        this.parentNameChain = parentNameChain;
        this.permissions = permissions;
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EntityInfoResponse() {
        this.displayName = null;
        this.id = null;
        this.inheritedPermissions = null;
        this.name = null;
        this.numberOfChildGroups = null;
        this.numberOfChildren = null;
        this.numberOfDescendants = null;
        this.parent = null;
        this.parentDisplayNameChain = List.of();
        this.parentNameChain = List.of();
        this.permissions = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private @Nullable String inheritedPermissions;
        private String name;
        private @Nullable Integer numberOfChildGroups;
        private @Nullable Integer numberOfChildren;
        private @Nullable Integer numberOfDescendants;
        private @Nullable EntityParentGroupInfoResponse parent;
        private @Nullable List<String> parentDisplayNameChain;
        private @Nullable List<String> parentNameChain;
        private @Nullable String permissions;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.inheritedPermissions = defaults.inheritedPermissions;
    	      this.name = defaults.name;
    	      this.numberOfChildGroups = defaults.numberOfChildGroups;
    	      this.numberOfChildren = defaults.numberOfChildren;
    	      this.numberOfDescendants = defaults.numberOfDescendants;
    	      this.parent = defaults.parent;
    	      this.parentDisplayNameChain = defaults.parentDisplayNameChain;
    	      this.parentNameChain = defaults.parentNameChain;
    	      this.permissions = defaults.permissions;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder inheritedPermissions(@Nullable String inheritedPermissions) {
            this.inheritedPermissions = inheritedPermissions;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder numberOfChildGroups(@Nullable Integer numberOfChildGroups) {
            this.numberOfChildGroups = numberOfChildGroups;
            return this;
        }

        public Builder numberOfChildren(@Nullable Integer numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }

        public Builder numberOfDescendants(@Nullable Integer numberOfDescendants) {
            this.numberOfDescendants = numberOfDescendants;
            return this;
        }

        public Builder parent(@Nullable EntityParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }

        public Builder parentDisplayNameChain(@Nullable List<String> parentDisplayNameChain) {
            this.parentDisplayNameChain = parentDisplayNameChain;
            return this;
        }

        public Builder parentNameChain(@Nullable List<String> parentNameChain) {
            this.parentNameChain = parentNameChain;
            return this;
        }

        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EntityInfoResponse build() {
            return new EntityInfoResponse(displayName, id, inheritedPermissions, name, numberOfChildGroups, numberOfChildren, numberOfDescendants, parent, parentDisplayNameChain, parentNameChain, permissions, tenantId, type);
        }
    }
}
