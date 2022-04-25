// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.testbase.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFavoriteProcessArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFavoriteProcessArgs Empty = new GetFavoriteProcessArgs();

    /**
     * The resource name of a favorite process in a package. If the process name contains characters that are not allowed in Azure Resource Name, we use &#39;actualProcessName&#39; in request body to submit the name.
     * 
     */
    @Import(name="favoriteProcessResourceName", required=true)
    private String favoriteProcessResourceName;

    /**
     * @return The resource name of a favorite process in a package. If the process name contains characters that are not allowed in Azure Resource Name, we use &#39;actualProcessName&#39; in request body to submit the name.
     * 
     */
    public String favoriteProcessResourceName() {
        return this.favoriteProcessResourceName;
    }

    /**
     * The resource name of the Test Base Package.
     * 
     */
    @Import(name="packageName", required=true)
    private String packageName;

    /**
     * @return The resource name of the Test Base Package.
     * 
     */
    public String packageName() {
        return this.packageName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
    private String testBaseAccountName;

    /**
     * @return The resource name of the Test Base Account.
     * 
     */
    public String testBaseAccountName() {
        return this.testBaseAccountName;
    }

    private GetFavoriteProcessArgs() {}

    private GetFavoriteProcessArgs(GetFavoriteProcessArgs $) {
        this.favoriteProcessResourceName = $.favoriteProcessResourceName;
        this.packageName = $.packageName;
        this.resourceGroupName = $.resourceGroupName;
        this.testBaseAccountName = $.testBaseAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFavoriteProcessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFavoriteProcessArgs $;

        public Builder() {
            $ = new GetFavoriteProcessArgs();
        }

        public Builder(GetFavoriteProcessArgs defaults) {
            $ = new GetFavoriteProcessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param favoriteProcessResourceName The resource name of a favorite process in a package. If the process name contains characters that are not allowed in Azure Resource Name, we use &#39;actualProcessName&#39; in request body to submit the name.
         * 
         * @return builder
         * 
         */
        public Builder favoriteProcessResourceName(String favoriteProcessResourceName) {
            $.favoriteProcessResourceName = favoriteProcessResourceName;
            return this;
        }

        /**
         * @param packageName The resource name of the Test Base Package.
         * 
         * @return builder
         * 
         */
        public Builder packageName(String packageName) {
            $.packageName = packageName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param testBaseAccountName The resource name of the Test Base Account.
         * 
         * @return builder
         * 
         */
        public Builder testBaseAccountName(String testBaseAccountName) {
            $.testBaseAccountName = testBaseAccountName;
            return this;
        }

        public GetFavoriteProcessArgs build() {
            $.favoriteProcessResourceName = Objects.requireNonNull($.favoriteProcessResourceName, "expected parameter 'favoriteProcessResourceName' to be non-null");
            $.packageName = Objects.requireNonNull($.packageName, "expected parameter 'packageName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.testBaseAccountName = Objects.requireNonNull($.testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
            return $;
        }
    }

}
