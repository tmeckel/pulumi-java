// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryGetArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesState extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesState Empty = new GuestPoliciesState();

    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets
     * or groups of VM instances by different parameters such as labels, names, OS, or zones.
     * If left empty, all VM instances underneath this policy are targeted.
     * At the same level in the resource hierarchy (that is within a project), the service prevents
     * the creation of multiple policies that conflict with each other.
     * For more information, see how the service
     * [handles assignment conflicts](https://cloud.google.com/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * Structure is documented below.
     * 
     */
    @InputImport(name="assignment")
      private final @Nullable Input<GuestPoliciesAssignmentGetArgs> assignment;

    public Input<GuestPoliciesAssignmentGetArgs> getAssignment() {
        return this.assignment == null ? Input.empty() : this.assignment;
    }

    /**
     * Time this guest policy was created. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
     * "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="createTime")
      private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
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

    /**
     * The logical name of the guest policy in the project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @InputImport(name="guestPolicyId")
      private final @Nullable Input<String> guestPolicyId;

    public Input<String> getGuestPolicyId() {
        return this.guestPolicyId == null ? Input.empty() : this.guestPolicyId;
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of package repositories to configure on the VM instance.
     * This is done before any other configs are applied so they can use these repos.
     * Package repositories are only configured if the corresponding package manager(s) are available.
     * Structure is documented below.
     * 
     */
    @InputImport(name="packageRepositories")
      private final @Nullable Input<List<GuestPoliciesPackageRepositoryGetArgs>> packageRepositories;

    public Input<List<GuestPoliciesPackageRepositoryGetArgs>> getPackageRepositories() {
        return this.packageRepositories == null ? Input.empty() : this.packageRepositories;
    }

    /**
     * The software packages to be managed by this policy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="packages")
      private final @Nullable Input<List<GuestPoliciesPackageGetArgs>> packages;

    public Input<List<GuestPoliciesPackageGetArgs>> getPackages() {
        return this.packages == null ? Input.empty() : this.packages;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * A list of Recipes to install on the VM instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="recipes")
      private final @Nullable Input<List<GuestPoliciesRecipeGetArgs>> recipes;

    public Input<List<GuestPoliciesRecipeGetArgs>> getRecipes() {
        return this.recipes == null ? Input.empty() : this.recipes;
    }

    /**
     * Last time this guest policy was updated. A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example:
     * "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="updateTime")
      private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    public GuestPoliciesState(
        @Nullable Input<GuestPoliciesAssignmentGetArgs> assignment,
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> etag,
        @Nullable Input<String> guestPolicyId,
        @Nullable Input<String> name,
        @Nullable Input<List<GuestPoliciesPackageRepositoryGetArgs>> packageRepositories,
        @Nullable Input<List<GuestPoliciesPackageGetArgs>> packages,
        @Nullable Input<String> project,
        @Nullable Input<List<GuestPoliciesRecipeGetArgs>> recipes,
        @Nullable Input<String> updateTime) {
        this.assignment = assignment;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.guestPolicyId = guestPolicyId;
        this.name = name;
        this.packageRepositories = packageRepositories;
        this.packages = packages;
        this.project = project;
        this.recipes = recipes;
        this.updateTime = updateTime;
    }

    private GuestPoliciesState() {
        this.assignment = Input.empty();
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.etag = Input.empty();
        this.guestPolicyId = Input.empty();
        this.name = Input.empty();
        this.packageRepositories = Input.empty();
        this.packages = Input.empty();
        this.project = Input.empty();
        this.recipes = Input.empty();
        this.updateTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GuestPoliciesAssignmentGetArgs> assignment;
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> guestPolicyId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<GuestPoliciesPackageRepositoryGetArgs>> packageRepositories;
        private @Nullable Input<List<GuestPoliciesPackageGetArgs>> packages;
        private @Nullable Input<String> project;
        private @Nullable Input<List<GuestPoliciesRecipeGetArgs>> recipes;
        private @Nullable Input<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.guestPolicyId = defaults.guestPolicyId;
    	      this.name = defaults.name;
    	      this.packageRepositories = defaults.packageRepositories;
    	      this.packages = defaults.packages;
    	      this.project = defaults.project;
    	      this.recipes = defaults.recipes;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder assignment(@Nullable Input<GuestPoliciesAssignmentGetArgs> assignment) {
            this.assignment = assignment;
            return this;
        }

        public Builder assignment(@Nullable GuestPoliciesAssignmentGetArgs assignment) {
            this.assignment = Input.ofNullable(assignment);
            return this;
        }

        public Builder createTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
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

        public Builder guestPolicyId(@Nullable Input<String> guestPolicyId) {
            this.guestPolicyId = guestPolicyId;
            return this;
        }

        public Builder guestPolicyId(@Nullable String guestPolicyId) {
            this.guestPolicyId = Input.ofNullable(guestPolicyId);
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

        public Builder packageRepositories(@Nullable Input<List<GuestPoliciesPackageRepositoryGetArgs>> packageRepositories) {
            this.packageRepositories = packageRepositories;
            return this;
        }

        public Builder packageRepositories(@Nullable List<GuestPoliciesPackageRepositoryGetArgs> packageRepositories) {
            this.packageRepositories = Input.ofNullable(packageRepositories);
            return this;
        }

        public Builder packages(@Nullable Input<List<GuestPoliciesPackageGetArgs>> packages) {
            this.packages = packages;
            return this;
        }

        public Builder packages(@Nullable List<GuestPoliciesPackageGetArgs> packages) {
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

        public Builder recipes(@Nullable Input<List<GuestPoliciesRecipeGetArgs>> recipes) {
            this.recipes = recipes;
            return this;
        }

        public Builder recipes(@Nullable List<GuestPoliciesRecipeGetArgs> recipes) {
            this.recipes = Input.ofNullable(recipes);
            return this;
        }

        public Builder updateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }
        public GuestPoliciesState build() {
            return new GuestPoliciesState(assignment, createTime, description, etag, guestPolicyId, name, packageRepositories, packages, project, recipes, updateTime);
        }
    }
}
