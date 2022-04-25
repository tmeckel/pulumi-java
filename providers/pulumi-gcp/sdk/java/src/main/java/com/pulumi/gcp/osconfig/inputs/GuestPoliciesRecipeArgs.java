// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArtifactArgs;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeInstallStepArgs;
import com.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeUpdateStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeArgs Empty = new GuestPoliciesRecipeArgs();

    /**
     * Resources available to be used in the steps in the recipe.
     * Structure is documented below.
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<List<GuestPoliciesRecipeArtifactArgs>> artifacts;

    /**
     * @return Resources available to be used in the steps in the recipe.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<GuestPoliciesRecipeArtifactArgs>>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * Default is INSTALLED. The desired state the agent should maintain for this recipe.
     * INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions.
     * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
     * if a higher version of the recipe is assigned to this instance.
     * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * Default value is `INSTALLED`.
     * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
     * 
     */
    @Import(name="desiredState")
    private @Nullable Output<String> desiredState;

    /**
     * @return Default is INSTALLED. The desired state the agent should maintain for this recipe.
     * INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions.
     * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
     * if a higher version of the recipe is assigned to this instance.
     * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
     * Default value is `INSTALLED`.
     * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
     * 
     */
    public Optional<Output<String>> desiredState() {
        return Optional.ofNullable(this.desiredState);
    }

    /**
     * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    @Import(name="installSteps")
    private @Nullable Output<List<GuestPoliciesRecipeInstallStepArgs>> installSteps;

    /**
     * @return Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<GuestPoliciesRecipeInstallStepArgs>>> installSteps() {
        return Optional.ofNullable(this.installSteps);
    }

    /**
     * Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
     * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
     * This means that requests to create multiple recipes with the same name and version are rejected since they
     * could potentially have conflicting assignments.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    @Import(name="updateSteps")
    private @Nullable Output<List<GuestPoliciesRecipeUpdateStepArgs>> updateSteps;

    /**
     * @return Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
     * Any steps taken (including partially completed steps) are not rolled back.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<GuestPoliciesRecipeUpdateStepArgs>>> updateSteps() {
        return Optional.ofNullable(this.updateSteps);
    }

    /**
     * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GuestPoliciesRecipeArgs() {}

    private GuestPoliciesRecipeArgs(GuestPoliciesRecipeArgs $) {
        this.artifacts = $.artifacts;
        this.desiredState = $.desiredState;
        this.installSteps = $.installSteps;
        this.name = $.name;
        this.updateSteps = $.updateSteps;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesRecipeArgs $;

        public Builder() {
            $ = new GuestPoliciesRecipeArgs();
        }

        public Builder(GuestPoliciesRecipeArgs defaults) {
            $ = new GuestPoliciesRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifacts Resources available to be used in the steps in the recipe.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(@Nullable Output<List<GuestPoliciesRecipeArtifactArgs>> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        /**
         * @param artifacts Resources available to be used in the steps in the recipe.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(List<GuestPoliciesRecipeArtifactArgs> artifacts) {
            return artifacts(Output.of(artifacts));
        }

        /**
         * @param artifacts Resources available to be used in the steps in the recipe.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder artifacts(GuestPoliciesRecipeArtifactArgs... artifacts) {
            return artifacts(List.of(artifacts));
        }

        /**
         * @param desiredState Default is INSTALLED. The desired state the agent should maintain for this recipe.
         * INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions.
         * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
         * if a higher version of the recipe is assigned to this instance.
         * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
         * Default value is `INSTALLED`.
         * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(@Nullable Output<String> desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        /**
         * @param desiredState Default is INSTALLED. The desired state the agent should maintain for this recipe.
         * INSTALLED: The software recipe is installed on the instance but won&#39;t be updated to new versions.
         * INSTALLED_KEEP_UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version,
         * if a higher version of the recipe is assigned to this instance.
         * REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
         * Default value is `INSTALLED`.
         * Possible values are `INSTALLED`, `UPDATED`, and `REMOVED`.
         * 
         * @return builder
         * 
         */
        public Builder desiredState(String desiredState) {
            return desiredState(Output.of(desiredState));
        }

        /**
         * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
         * Any steps taken (including partially completed steps) are not rolled back.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder installSteps(@Nullable Output<List<GuestPoliciesRecipeInstallStepArgs>> installSteps) {
            $.installSteps = installSteps;
            return this;
        }

        /**
         * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
         * Any steps taken (including partially completed steps) are not rolled back.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder installSteps(List<GuestPoliciesRecipeInstallStepArgs> installSteps) {
            return installSteps(Output.of(installSteps));
        }

        /**
         * @param installSteps Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation.
         * Any steps taken (including partially completed steps) are not rolled back.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder installSteps(GuestPoliciesRecipeInstallStepArgs... installSteps) {
            return installSteps(List.of(installSteps));
        }

        /**
         * @param name Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
         * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
         * This means that requests to create multiple recipes with the same name and version are rejected since they
         * could potentially have conflicting assignments.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique identifier for the recipe. Only one recipe with a given name is installed on an instance.
         * Names are also used to identify resources which helps to determine whether guest policies have conflicts.
         * This means that requests to create multiple recipes with the same name and version are rejected since they
         * could potentially have conflicting assignments.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
         * Any steps taken (including partially completed steps) are not rolled back.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder updateSteps(@Nullable Output<List<GuestPoliciesRecipeUpdateStepArgs>> updateSteps) {
            $.updateSteps = updateSteps;
            return this;
        }

        /**
         * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
         * Any steps taken (including partially completed steps) are not rolled back.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder updateSteps(List<GuestPoliciesRecipeUpdateStepArgs> updateSteps) {
            return updateSteps(Output.of(updateSteps));
        }

        /**
         * @param updateSteps Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe.
         * Any steps taken (including partially completed steps) are not rolled back.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder updateSteps(GuestPoliciesRecipeUpdateStepArgs... updateSteps) {
            return updateSteps(List.of(updateSteps));
        }

        /**
         * @param version The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GuestPoliciesRecipeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
