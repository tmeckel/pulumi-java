// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyArgs Empty = new GetOrganizationPolicyArgs();

    /**
     * (Required) The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Import(name="constraint", required=true)
    private String constraint;

    /**
     * @return (Required) The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    public String constraint() {
        return this.constraint;
    }

    /**
     * The project ID.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    /**
     * @return The project ID.
     * 
     */
    public String project() {
        return this.project;
    }

    private GetOrganizationPolicyArgs() {}

    private GetOrganizationPolicyArgs(GetOrganizationPolicyArgs $) {
        this.constraint = $.constraint;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationPolicyArgs $;

        public Builder() {
            $ = new GetOrganizationPolicyArgs();
        }

        public Builder(GetOrganizationPolicyArgs defaults) {
            $ = new GetOrganizationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param constraint (Required) The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
         * 
         * @return builder
         * 
         */
        public Builder constraint(String constraint) {
            $.constraint = constraint;
            return this;
        }

        /**
         * @param project The project ID.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public GetOrganizationPolicyArgs build() {
            $.constraint = Objects.requireNonNull($.constraint, "expected parameter 'constraint' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
