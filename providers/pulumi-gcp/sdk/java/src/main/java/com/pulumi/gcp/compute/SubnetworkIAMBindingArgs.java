// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.SubnetworkIAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetworkIAMBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubnetworkIAMBindingArgs Empty = new SubnetworkIAMBindingArgs();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<SubnetworkIAMBindingConditionArgs> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<SubnetworkIAMBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The GCP region for this subnetwork.
     * Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="subnetwork", required=true)
    private Output<String> subnetwork;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> subnetwork() {
        return this.subnetwork;
    }

    private SubnetworkIAMBindingArgs() {}

    private SubnetworkIAMBindingArgs(SubnetworkIAMBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.project = $.project;
        this.region = $.region;
        this.role = $.role;
        this.subnetwork = $.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetworkIAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetworkIAMBindingArgs $;

        public Builder() {
            $ = new SubnetworkIAMBindingArgs();
        }

        public Builder(SubnetworkIAMBindingArgs defaults) {
            $ = new SubnetworkIAMBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<SubnetworkIAMBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(SubnetworkIAMBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The GCP region for this subnetwork.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
         * region is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The GCP region for this subnetwork.
         * Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
         * region is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.compute.SubnetworkIAMBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param subnetwork Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(Output<String> subnetwork) {
            $.subnetwork = subnetwork;
            return this;
        }

        /**
         * @param subnetwork Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder subnetwork(String subnetwork) {
            return subnetwork(Output.of(subnetwork));
        }

        public SubnetworkIAMBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.subnetwork = Objects.requireNonNull($.subnetwork, "expected parameter 'subnetwork' to be non-null");
            return $;
        }
    }

}
