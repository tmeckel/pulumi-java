// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningexperimentation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectArgs Empty = new GetProjectArgs();

    /**
     * The name of the machine learning team account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the machine learning team account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the machine learning project under a team account workspace.
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return The name of the machine learning project under a team account workspace.
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * The name of the resource group to which the machine learning team account belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to which the machine learning team account belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the machine learning team account workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the machine learning team account workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetProjectArgs() {}

    private GetProjectArgs(GetProjectArgs $) {
        this.accountName = $.accountName;
        this.projectName = $.projectName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectArgs $;

        public Builder() {
            $ = new GetProjectArgs();
        }

        public Builder(GetProjectArgs defaults) {
            $ = new GetProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the machine learning team account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param projectName The name of the machine learning project under a team account workspace.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the machine learning team account belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the machine learning team account workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetProjectArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
