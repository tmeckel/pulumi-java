// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmiLaunchPermissionState extends com.pulumi.resources.ResourceArgs {

    public static final AmiLaunchPermissionState Empty = new AmiLaunchPermissionState();

    /**
     * An AWS Account ID to add launch permissions.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return An AWS Account ID to add launch permissions.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return A region-unique name for the AMI.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    private AmiLaunchPermissionState() {}

    private AmiLaunchPermissionState(AmiLaunchPermissionState $) {
        this.accountId = $.accountId;
        this.imageId = $.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmiLaunchPermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmiLaunchPermissionState $;

        public Builder() {
            $ = new AmiLaunchPermissionState();
        }

        public Builder(AmiLaunchPermissionState defaults) {
            $ = new AmiLaunchPermissionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId An AWS Account ID to add launch permissions.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId An AWS Account ID to add launch permissions.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param imageId A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId A region-unique name for the AMI.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        public AmiLaunchPermissionState build() {
            return $;
        }
    }

}
