// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VideoArgs extends com.pulumi.resources.ResourceArgs {

    public static final VideoArgs Empty = new VideoArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Azure Video Analyzer account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional video description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Optional video title provided by the user. Value can be up to 256 characters long.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The name of the video to create or update.
     * 
     */
    @Import(name="videoName")
    private @Nullable Output<String> videoName;

    /**
     * @return The name of the video to create or update.
     * 
     */
    public Optional<Output<String>> videoName() {
        return Optional.ofNullable(this.videoName);
    }

    private VideoArgs() {}

    private VideoArgs(VideoArgs $) {
        this.accountName = $.accountName;
        this.description = $.description;
        this.resourceGroupName = $.resourceGroupName;
        this.title = $.title;
        this.videoName = $.videoName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoArgs $;

        public Builder() {
            $ = new VideoArgs();
        }

        public Builder(VideoArgs defaults) {
            $ = new VideoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Azure Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param description Optional video description provided by the user. Value can be up to 2048 characters long.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional video description provided by the user. Value can be up to 2048 characters long.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param title Optional video title provided by the user. Value can be up to 256 characters long.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Optional video title provided by the user. Value can be up to 256 characters long.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param videoName The name of the video to create or update.
         * 
         * @return builder
         * 
         */
        public Builder videoName(@Nullable Output<String> videoName) {
            $.videoName = videoName;
            return this;
        }

        /**
         * @param videoName The name of the video to create or update.
         * 
         * @return builder
         * 
         */
        public Builder videoName(String videoName) {
            return videoName(Output.of(videoName));
        }

        public VideoArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
