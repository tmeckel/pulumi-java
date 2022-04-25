// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetViewArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetViewArgs Empty = new GetViewArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The user ID. Use * to retrieve hub level view.
     * 
     */
    @Import(name="userId", required=true)
    private String userId;

    /**
     * @return The user ID. Use * to retrieve hub level view.
     * 
     */
    public String userId() {
        return this.userId;
    }

    /**
     * The name of the view.
     * 
     */
    @Import(name="viewName", required=true)
    private String viewName;

    /**
     * @return The name of the view.
     * 
     */
    public String viewName() {
        return this.viewName;
    }

    private GetViewArgs() {}

    private GetViewArgs(GetViewArgs $) {
        this.hubName = $.hubName;
        this.resourceGroupName = $.resourceGroupName;
        this.userId = $.userId;
        this.viewName = $.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetViewArgs $;

        public Builder() {
            $ = new GetViewArgs();
        }

        public Builder(GetViewArgs defaults) {
            $ = new GetViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param userId The user ID. Use * to retrieve hub level view.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param viewName The name of the view.
         * 
         * @return builder
         * 
         */
        public Builder viewName(String viewName) {
            $.viewName = viewName;
            return this;
        }

        public GetViewArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            $.viewName = Objects.requireNonNull($.viewName, "expected parameter 'viewName' to be non-null");
            return $;
        }
    }

}
