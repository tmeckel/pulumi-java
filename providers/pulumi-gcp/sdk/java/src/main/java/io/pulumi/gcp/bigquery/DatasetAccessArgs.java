// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigquery.inputs.DatasetAccessViewArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetAccessArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetAccessArgs Empty = new DatasetAccessArgs();

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * A domain to grant access to. Any users signed in with the
     * domain specified will be granted the specified access
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Codegen.empty() : this.domain;
    }

    /**
     * An email address of a Google Group to grant access to.
     * 
     */
    @Import(name="groupByEmail")
      private final @Nullable Output<String> groupByEmail;

    public Output<String> getGroupByEmail() {
        return this.groupByEmail == null ? Codegen.empty() : this.groupByEmail;
    }

    /**
     * Some other type of member that appears in the IAM Policy but isn't a user,
     * group, domain, or special group. For example: `allUsers`
     * 
     */
    @Import(name="iamMember")
      private final @Nullable Output<String> iamMember;

    public Output<String> getIamMember() {
        return this.iamMember == null ? Codegen.empty() : this.iamMember;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Describes the rights granted to the user specified by the other
     * member of the access object. Basic, predefined, and custom roles are
     * supported. Predefined roles that have equivalent basic roles are
     * swapped by the API to their basic counterparts, and will show a diff
     * post-create. See
     * [official docs](https://cloud.google.com/bigquery/docs/access-control).
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * A special group to grant access to. Possible values include:
     * 
     */
    @Import(name="specialGroup")
      private final @Nullable Output<String> specialGroup;

    public Output<String> getSpecialGroup() {
        return this.specialGroup == null ? Codegen.empty() : this.specialGroup;
    }

    /**
     * An email address of a user to grant access to. For example:
     * fred@example.com
     * 
     */
    @Import(name="userByEmail")
      private final @Nullable Output<String> userByEmail;

    public Output<String> getUserByEmail() {
        return this.userByEmail == null ? Codegen.empty() : this.userByEmail;
    }

    /**
     * A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * 
     */
    @Import(name="view")
      private final @Nullable Output<DatasetAccessViewArgs> view;

    public Output<DatasetAccessViewArgs> getView() {
        return this.view == null ? Codegen.empty() : this.view;
    }

    public DatasetAccessArgs(
        Output<String> datasetId,
        @Nullable Output<String> domain,
        @Nullable Output<String> groupByEmail,
        @Nullable Output<String> iamMember,
        @Nullable Output<String> project,
        @Nullable Output<String> role,
        @Nullable Output<String> specialGroup,
        @Nullable Output<String> userByEmail,
        @Nullable Output<DatasetAccessViewArgs> view) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.domain = domain;
        this.groupByEmail = groupByEmail;
        this.iamMember = iamMember;
        this.project = project;
        this.role = role;
        this.specialGroup = specialGroup;
        this.userByEmail = userByEmail;
        this.view = view;
    }

    private DatasetAccessArgs() {
        this.datasetId = Codegen.empty();
        this.domain = Codegen.empty();
        this.groupByEmail = Codegen.empty();
        this.iamMember = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.specialGroup = Codegen.empty();
        this.userByEmail = Codegen.empty();
        this.view = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> groupByEmail;
        private @Nullable Output<String> iamMember;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;
        private @Nullable Output<String> specialGroup;
        private @Nullable Output<String> userByEmail;
        private @Nullable Output<DatasetAccessViewArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.domain = defaults.domain;
    	      this.groupByEmail = defaults.groupByEmail;
    	      this.iamMember = defaults.iamMember;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.specialGroup = defaults.specialGroup;
    	      this.userByEmail = defaults.userByEmail;
    	      this.view = defaults.view;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Codegen.ofNullable(domain);
            return this;
        }
        public Builder groupByEmail(@Nullable Output<String> groupByEmail) {
            this.groupByEmail = groupByEmail;
            return this;
        }
        public Builder groupByEmail(@Nullable String groupByEmail) {
            this.groupByEmail = Codegen.ofNullable(groupByEmail);
            return this;
        }
        public Builder iamMember(@Nullable Output<String> iamMember) {
            this.iamMember = iamMember;
            return this;
        }
        public Builder iamMember(@Nullable String iamMember) {
            this.iamMember = Codegen.ofNullable(iamMember);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder specialGroup(@Nullable Output<String> specialGroup) {
            this.specialGroup = specialGroup;
            return this;
        }
        public Builder specialGroup(@Nullable String specialGroup) {
            this.specialGroup = Codegen.ofNullable(specialGroup);
            return this;
        }
        public Builder userByEmail(@Nullable Output<String> userByEmail) {
            this.userByEmail = userByEmail;
            return this;
        }
        public Builder userByEmail(@Nullable String userByEmail) {
            this.userByEmail = Codegen.ofNullable(userByEmail);
            return this;
        }
        public Builder view(@Nullable Output<DatasetAccessViewArgs> view) {
            this.view = view;
            return this;
        }
        public Builder view(@Nullable DatasetAccessViewArgs view) {
            this.view = Codegen.ofNullable(view);
            return this;
        }        public DatasetAccessArgs build() {
            return new DatasetAccessArgs(datasetId, domain, groupByEmail, iamMember, project, role, specialGroup, userByEmail, view);
        }
    }
}
