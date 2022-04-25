// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.GroupMembersItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkGroupArgs Empty = new NetworkGroupArgs();

    /**
     * Network group conditional filter.
     * 
     */
    @Import(name="conditionalMembership")
    private @Nullable Output<String> conditionalMembership;

    /**
     * @return Network group conditional filter.
     * 
     */
    public Optional<Output<String>> conditionalMembership() {
        return Optional.ofNullable(this.conditionalMembership);
    }

    /**
     * A description of the network group.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the network group.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A friendly name for the network group.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A friendly name for the network group.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Group members of network group.
     * 
     */
    @Import(name="groupMembers")
    private @Nullable Output<List<GroupMembersItemArgs>> groupMembers;

    /**
     * @return Group members of network group.
     * 
     */
    public Optional<Output<List<GroupMembersItemArgs>>> groupMembers() {
        return Optional.ofNullable(this.groupMembers);
    }

    /**
     * Group member type.
     * 
     */
    @Import(name="memberType")
    private @Nullable Output<String> memberType;

    /**
     * @return Group member type.
     * 
     */
    public Optional<Output<String>> memberType() {
        return Optional.ofNullable(this.memberType);
    }

    /**
     * The name of the network group to get.
     * 
     */
    @Import(name="networkGroupName")
    private @Nullable Output<String> networkGroupName;

    /**
     * @return The name of the network group to get.
     * 
     */
    public Optional<Output<String>> networkGroupName() {
        return Optional.ofNullable(this.networkGroupName);
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private Output<String> networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public Output<String> networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private NetworkGroupArgs() {}

    private NetworkGroupArgs(NetworkGroupArgs $) {
        this.conditionalMembership = $.conditionalMembership;
        this.description = $.description;
        this.displayName = $.displayName;
        this.groupMembers = $.groupMembers;
        this.memberType = $.memberType;
        this.networkGroupName = $.networkGroupName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkGroupArgs $;

        public Builder() {
            $ = new NetworkGroupArgs();
        }

        public Builder(NetworkGroupArgs defaults) {
            $ = new NetworkGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionalMembership Network group conditional filter.
         * 
         * @return builder
         * 
         */
        public Builder conditionalMembership(@Nullable Output<String> conditionalMembership) {
            $.conditionalMembership = conditionalMembership;
            return this;
        }

        /**
         * @param conditionalMembership Network group conditional filter.
         * 
         * @return builder
         * 
         */
        public Builder conditionalMembership(String conditionalMembership) {
            return conditionalMembership(Output.of(conditionalMembership));
        }

        /**
         * @param description A description of the network group.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the network group.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A friendly name for the network group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A friendly name for the network group.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param groupMembers Group members of network group.
         * 
         * @return builder
         * 
         */
        public Builder groupMembers(@Nullable Output<List<GroupMembersItemArgs>> groupMembers) {
            $.groupMembers = groupMembers;
            return this;
        }

        /**
         * @param groupMembers Group members of network group.
         * 
         * @return builder
         * 
         */
        public Builder groupMembers(List<GroupMembersItemArgs> groupMembers) {
            return groupMembers(Output.of(groupMembers));
        }

        /**
         * @param groupMembers Group members of network group.
         * 
         * @return builder
         * 
         */
        public Builder groupMembers(GroupMembersItemArgs... groupMembers) {
            return groupMembers(List.of(groupMembers));
        }

        /**
         * @param memberType Group member type.
         * 
         * @return builder
         * 
         */
        public Builder memberType(@Nullable Output<String> memberType) {
            $.memberType = memberType;
            return this;
        }

        /**
         * @param memberType Group member type.
         * 
         * @return builder
         * 
         */
        public Builder memberType(String memberType) {
            return memberType(Output.of(memberType));
        }

        /**
         * @param networkGroupName The name of the network group to get.
         * 
         * @return builder
         * 
         */
        public Builder networkGroupName(@Nullable Output<String> networkGroupName) {
            $.networkGroupName = networkGroupName;
            return this;
        }

        /**
         * @param networkGroupName The name of the network group to get.
         * 
         * @return builder
         * 
         */
        public Builder networkGroupName(String networkGroupName) {
            return networkGroupName(Output.of(networkGroupName));
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(Output<String> networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            return networkManagerName(Output.of(networkManagerName));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public NetworkGroupArgs build() {
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
