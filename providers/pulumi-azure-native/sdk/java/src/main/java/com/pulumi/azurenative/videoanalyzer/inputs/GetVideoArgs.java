// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVideoArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVideoArgs Empty = new GetVideoArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Azure Video Analyzer account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the video to retrieve.
     * 
     */
    @Import(name="videoName", required=true)
    private String videoName;

    /**
     * @return The name of the video to retrieve.
     * 
     */
    public String videoName() {
        return this.videoName;
    }

    private GetVideoArgs() {}

    private GetVideoArgs(GetVideoArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.videoName = $.videoName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVideoArgs $;

        public Builder() {
            $ = new GetVideoArgs();
        }

        public Builder(GetVideoArgs defaults) {
            $ = new GetVideoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param videoName The name of the video to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder videoName(String videoName) {
            $.videoName = videoName;
            return this;
        }

        public GetVideoArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.videoName = Objects.requireNonNull($.videoName, "expected parameter 'videoName' to be non-null");
            return $;
        }
    }

}
