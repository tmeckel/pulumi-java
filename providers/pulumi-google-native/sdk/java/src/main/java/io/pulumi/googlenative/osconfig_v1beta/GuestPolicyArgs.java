// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.PackageArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.PackageRepositoryArgs;
import io.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPolicyArgs Empty = new GuestPolicyArgs();

    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
     */
    @InputImport(name="assignment", required=true)
      private final Input<AssignmentArgs> assignment;

    public Input<AssignmentArgs> getAssignment() {
        return this.assignment;
    }

    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The etag for this guest policy. If this is provided on update, it must match the server's etag.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="guestPolicyId", required=true)
      private final Input<String> guestPolicyId;

    public Input<String> getGuestPolicyId() {
        return this.guestPolicyId;
    }

    /**
     * Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
     */
    @InputImport(name="packageRepositories")
      private final @Nullable Input<List<PackageRepositoryArgs>> packageRepositories;

    public Input<List<PackageRepositoryArgs>> getPackageRepositories() {
        return this.packageRepositories == null ? Input.empty() : this.packageRepositories;
    }

    /**
     * The software packages to be managed by this policy.
     * 
     */
    @InputImport(name="packages")
      private final @Nullable Input<List<PackageArgs>> packages;

    public Input<List<PackageArgs>> getPackages() {
        return this.packages == null ? Input.empty() : this.packages;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A list of Recipes to install on the VM instance.
     * 
     */
    @InputImport(name="recipes")
      private final @Nullable Input<List<SoftwareRecipeArgs>> recipes;

    public Input<List<SoftwareRecipeArgs>> getRecipes() {
        return this.recipes == null ? Input.empty() : this.recipes;
    }

    public GuestPolicyArgs(
        Input<AssignmentArgs> assignment,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        Input<String> guestPolicyId,
        @Nullable Input<String> name,
        @Nullable Input<List<PackageRepositoryArgs>> packageRepositories,
        @Nullable Input<List<PackageArgs>> packages,
        @Nullable Input<String> project,
        @Nullable Input<List<SoftwareRecipeArgs>> recipes) {
        this.assignment = Objects.requireNonNull(assignment, "expected parameter 'assignment' to be non-null");
        this.description = description;
        this.etag = etag;
        this.guestPolicyId = Objects.requireNonNull(guestPolicyId, "expected parameter 'guestPolicyId' to be non-null");
        this.name = name;
        this.packageRepositories = packageRepositories;
        this.packages = packages;
        this.project = project;
        this.recipes = recipes;
    }

    private GuestPolicyArgs() {
        this.assignment = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.guestPolicyId = Input.empty();
        this.name = Input.empty();
        this.packageRepositories = Input.empty();
        this.packages = Input.empty();
        this.project = Input.empty();
        this.recipes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AssignmentArgs> assignment;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private Input<String> guestPolicyId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<PackageRepositoryArgs>> packageRepositories;
        private @Nullable Input<List<PackageArgs>> packages;
        private @Nullable Input<String> project;
        private @Nullable Input<List<SoftwareRecipeArgs>> recipes;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.guestPolicyId = defaults.guestPolicyId;
    	      this.name = defaults.name;
    	      this.packageRepositories = defaults.packageRepositories;
    	      this.packages = defaults.packages;
    	      this.project = defaults.project;
    	      this.recipes = defaults.recipes;
        }

        public Builder assignment(Input<AssignmentArgs> assignment) {
            this.assignment = Objects.requireNonNull(assignment);
            return this;
        }

        public Builder assignment(AssignmentArgs assignment) {
            this.assignment = Input.of(Objects.requireNonNull(assignment));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder etag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder guestPolicyId(Input<String> guestPolicyId) {
            this.guestPolicyId = Objects.requireNonNull(guestPolicyId);
            return this;
        }

        public Builder guestPolicyId(String guestPolicyId) {
            this.guestPolicyId = Input.of(Objects.requireNonNull(guestPolicyId));
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder packageRepositories(@Nullable Input<List<PackageRepositoryArgs>> packageRepositories) {
            this.packageRepositories = packageRepositories;
            return this;
        }

        public Builder packageRepositories(@Nullable List<PackageRepositoryArgs> packageRepositories) {
            this.packageRepositories = Input.ofNullable(packageRepositories);
            return this;
        }

        public Builder packages(@Nullable Input<List<PackageArgs>> packages) {
            this.packages = packages;
            return this;
        }

        public Builder packages(@Nullable List<PackageArgs> packages) {
            this.packages = Input.ofNullable(packages);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder recipes(@Nullable Input<List<SoftwareRecipeArgs>> recipes) {
            this.recipes = recipes;
            return this;
        }

        public Builder recipes(@Nullable List<SoftwareRecipeArgs> recipes) {
            this.recipes = Input.ofNullable(recipes);
            return this;
        }
        public GuestPolicyArgs build() {
            return new GuestPolicyArgs(assignment, description, etag, guestPolicyId, name, packageRepositories, packages, project, recipes);
        }
    }
}
