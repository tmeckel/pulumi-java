// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesPackageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageGetArgs Empty = new GuestPoliciesPackageGetArgs();

    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe.
     * INSTALLED: The software recipe is installed on the instance but won't be updated to new versions.
     * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
     * if a higher version of the recipe is assigned to this instance.
     * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * Default value is `INSTALLED`.
     * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
     * 
     */
    @Import(name="desiredState")
      private final @Nullable Output<String> desiredState;

    public Output<String> getDesiredState() {
        return this.desiredState == null ? Codegen.empty() : this.desiredState;
    }

    /**
     * Type of package manager that can be used to install this package. If a system does not have the package manager,
     * the package is not installed or removed no error message is returned. By default, or if you specify ANY,
     * the agent attempts to install and remove this package using the default package manager.
     * This is useful when creating a policy that applies to different types of systems.
     * The default behavior is ANY.
     * Default value is `ANY`.
     * Possible values are `ANY`, `APT`, `YUM`, `ZYPPER`, and `GOO`.
     * 
     */
    @Import(name="manager")
      private final @Nullable Output<String> manager;

    public Output<String> getManager() {
        return this.manager == null ? Codegen.empty() : this.manager;
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public GuestPoliciesPackageGetArgs(
        @Nullable Output<String> desiredState,
        @Nullable Output<String> manager,
        Output<String> name) {
        this.desiredState = desiredState;
        this.manager = manager;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GuestPoliciesPackageGetArgs() {
        this.desiredState = Codegen.empty();
        this.manager = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> desiredState;
        private @Nullable Output<String> manager;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.manager = defaults.manager;
    	      this.name = defaults.name;
        }

        public Builder desiredState(@Nullable Output<String> desiredState) {
            this.desiredState = desiredState;
            return this;
        }
        public Builder desiredState(@Nullable String desiredState) {
            this.desiredState = Codegen.ofNullable(desiredState);
            return this;
        }
        public Builder manager(@Nullable Output<String> manager) {
            this.manager = manager;
            return this;
        }
        public Builder manager(@Nullable String manager) {
            this.manager = Codegen.ofNullable(manager);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public GuestPoliciesPackageGetArgs build() {
            return new GuestPoliciesPackageGetArgs(desiredState, manager, name);
        }
    }
}
