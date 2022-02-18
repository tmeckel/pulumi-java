// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationRoleResult {
    /**
     * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    private final Boolean deleted;
    /**
     * Optional. A human-readable description for the role.
     * 
     */
    private final String description;
    /**
     * Used to perform a consistent read-modify-write.
     * 
     */
    private final String etag;
    /**
     * The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    private final List<String> includedPermissions;
    /**
     * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    private final String name;
    /**
     * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    private final String stage;
    /**
     * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"deleted","description","etag","includedPermissions","name","stage","title"})
    private GetOrganizationRoleResult(
        Boolean deleted,
        String description,
        String etag,
        List<String> includedPermissions,
        String name,
        String stage,
        String title) {
        this.deleted = Objects.requireNonNull(deleted);
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.includedPermissions = Objects.requireNonNull(includedPermissions);
        this.name = Objects.requireNonNull(name);
        this.stage = Objects.requireNonNull(stage);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    public Boolean getDeleted() {
        return this.deleted;
    }
    /**
     * Optional. A human-readable description for the role.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Used to perform a consistent read-modify-write.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    public List<String> getIncludedPermissions() {
        return this.includedPermissions;
    }
    /**
     * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    public String getStage() {
        return this.stage;
    }
    /**
     * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationRoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean deleted;
        private String description;
        private String etag;
        private List<String> includedPermissions;
        private String name;
        private String stage;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.includedPermissions = defaults.includedPermissions;
    	      this.name = defaults.name;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder setDeleted(Boolean deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setIncludedPermissions(List<String> includedPermissions) {
            this.includedPermissions = Objects.requireNonNull(includedPermissions);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GetOrganizationRoleResult build() {
            return new GetOrganizationRoleResult(deleted, description, etag, includedPermissions, name, stage, title);
        }
    }
}
