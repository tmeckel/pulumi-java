// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.iam_v1.enums.RoleStage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    @InputImport(name="deleted")
    private final @Nullable Input<Boolean> deleted;

    public Input<Boolean> getDeleted() {
        return this.deleted == null ? Input.empty() : this.deleted;
    }

    /**
     * Optional. A human-readable description for the role.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Used to perform a consistent read-modify-write.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    @InputImport(name="includedPermissions")
    private final @Nullable Input<List<String>> includedPermissions;

    public Input<List<String>> getIncludedPermissions() {
        return this.includedPermissions == null ? Input.empty() : this.includedPermissions;
    }

    /**
     * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
     * 
     */
    @InputImport(name="roleId")
    private final @Nullable Input<String> roleId;

    public Input<String> getRoleId() {
        return this.roleId == null ? Input.empty() : this.roleId;
    }

    /**
     * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    @InputImport(name="stage")
    private final @Nullable Input<RoleStage> stage;

    public Input<RoleStage> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    /**
     * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    @InputImport(name="title")
    private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public RoleArgs(
        @Nullable Input<Boolean> deleted,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<List<String>> includedPermissions,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> roleId,
        @Nullable Input<RoleStage> stage,
        @Nullable Input<String> title) {
        this.deleted = deleted;
        this.description = description;
        this.etag = etag;
        this.includedPermissions = includedPermissions;
        this.name = name;
        this.project = project;
        this.roleId = roleId;
        this.stage = stage;
        this.title = title;
    }

    private RoleArgs() {
        this.deleted = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.includedPermissions = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.roleId = Input.empty();
        this.stage = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleted;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<List<String>> includedPermissions;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> roleId;
        private @Nullable Input<RoleStage> stage;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.includedPermissions = defaults.includedPermissions;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.roleId = defaults.roleId;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder setDeleted(@Nullable Input<Boolean> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder setDeleted(@Nullable Boolean deleted) {
            this.deleted = Input.ofNullable(deleted);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setIncludedPermissions(@Nullable Input<List<String>> includedPermissions) {
            this.includedPermissions = includedPermissions;
            return this;
        }

        public Builder setIncludedPermissions(@Nullable List<String> includedPermissions) {
            this.includedPermissions = Input.ofNullable(includedPermissions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRoleId(@Nullable Input<String> roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder setRoleId(@Nullable String roleId) {
            this.roleId = Input.ofNullable(roleId);
            return this;
        }

        public Builder setStage(@Nullable Input<RoleStage> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable RoleStage stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public RoleArgs build() {
            return new RoleArgs(deleted, description, etag, includedPermissions, name, project, roleId, stage, title);
        }
    }
}
