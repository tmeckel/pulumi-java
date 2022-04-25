// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBookmarkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBookmarkArgs Empty = new GetBookmarkArgs();

    /**
     * Bookmark ID
     * 
     */
    @Import(name="bookmarkId", required=true)
    private String bookmarkId;

    /**
     * @return Bookmark ID
     * 
     */
    public String bookmarkId() {
        return this.bookmarkId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetBookmarkArgs() {}

    private GetBookmarkArgs(GetBookmarkArgs $) {
        this.bookmarkId = $.bookmarkId;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBookmarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBookmarkArgs $;

        public Builder() {
            $ = new GetBookmarkArgs();
        }

        public Builder(GetBookmarkArgs defaults) {
            $ = new GetBookmarkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bookmarkId Bookmark ID
         * 
         * @return builder
         * 
         */
        public Builder bookmarkId(String bookmarkId) {
            $.bookmarkId = bookmarkId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetBookmarkArgs build() {
            $.bookmarkId = Objects.requireNonNull($.bookmarkId, "expected parameter 'bookmarkId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
