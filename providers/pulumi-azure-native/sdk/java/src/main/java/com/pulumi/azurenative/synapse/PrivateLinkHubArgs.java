// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkHubArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkHubArgs Empty = new PrivateLinkHubArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the privateLinkHub
     * 
     */
    @Import(name="privateLinkHubName")
    private @Nullable Output<String> privateLinkHubName;

    /**
     * @return Name of the privateLinkHub
     * 
     */
    public Optional<Output<String>> privateLinkHubName() {
        return Optional.ofNullable(this.privateLinkHubName);
    }

    /**
     * PrivateLinkHub provisioning state
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<String> provisioningState;

    /**
     * @return PrivateLinkHub provisioning state
     * 
     */
    public Optional<Output<String>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PrivateLinkHubArgs() {}

    private PrivateLinkHubArgs(PrivateLinkHubArgs $) {
        this.location = $.location;
        this.privateLinkHubName = $.privateLinkHubName;
        this.provisioningState = $.provisioningState;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkHubArgs $;

        public Builder() {
            $ = new PrivateLinkHubArgs();
        }

        public Builder(PrivateLinkHubArgs defaults) {
            $ = new PrivateLinkHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param privateLinkHubName Name of the privateLinkHub
         * 
         * @return builder
         * 
         */
        public Builder privateLinkHubName(@Nullable Output<String> privateLinkHubName) {
            $.privateLinkHubName = privateLinkHubName;
            return this;
        }

        /**
         * @param privateLinkHubName Name of the privateLinkHub
         * 
         * @return builder
         * 
         */
        public Builder privateLinkHubName(String privateLinkHubName) {
            return privateLinkHubName(Output.of(privateLinkHubName));
        }

        /**
         * @param provisioningState PrivateLinkHub provisioning state
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param provisioningState PrivateLinkHub provisioning state
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            return provisioningState(Output.of(provisioningState));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PrivateLinkHubArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
