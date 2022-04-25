// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1beta1.inputs.AutoUpgradeOptionsArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * NodeManagement defines the set of node management services turned on for the node pool.
 * 
 */
public final class NodeManagementArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeManagementArgs Empty = new NodeManagementArgs();

    /**
     * Whether the nodes will be automatically repaired.
     * 
     */
    @Import(name="autoRepair")
    private @Nullable Output<Boolean> autoRepair;

    /**
     * @return Whether the nodes will be automatically repaired.
     * 
     */
    public Optional<Output<Boolean>> autoRepair() {
        return Optional.ofNullable(this.autoRepair);
    }

    /**
     * Whether the nodes will be automatically upgraded.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<Boolean> autoUpgrade;

    /**
     * @return Whether the nodes will be automatically upgraded.
     * 
     */
    public Optional<Output<Boolean>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    /**
     * Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    @Import(name="upgradeOptions")
    private @Nullable Output<AutoUpgradeOptionsArgs> upgradeOptions;

    /**
     * @return Specifies the Auto Upgrade knobs for the node pool.
     * 
     */
    public Optional<Output<AutoUpgradeOptionsArgs>> upgradeOptions() {
        return Optional.ofNullable(this.upgradeOptions);
    }

    private NodeManagementArgs() {}

    private NodeManagementArgs(NodeManagementArgs $) {
        this.autoRepair = $.autoRepair;
        this.autoUpgrade = $.autoUpgrade;
        this.upgradeOptions = $.upgradeOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeManagementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeManagementArgs $;

        public Builder() {
            $ = new NodeManagementArgs();
        }

        public Builder(NodeManagementArgs defaults) {
            $ = new NodeManagementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoRepair Whether the nodes will be automatically repaired.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(@Nullable Output<Boolean> autoRepair) {
            $.autoRepair = autoRepair;
            return this;
        }

        /**
         * @param autoRepair Whether the nodes will be automatically repaired.
         * 
         * @return builder
         * 
         */
        public Builder autoRepair(Boolean autoRepair) {
            return autoRepair(Output.of(autoRepair));
        }

        /**
         * @param autoUpgrade Whether the nodes will be automatically upgraded.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<Boolean> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade Whether the nodes will be automatically upgraded.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(Boolean autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        /**
         * @param upgradeOptions Specifies the Auto Upgrade knobs for the node pool.
         * 
         * @return builder
         * 
         */
        public Builder upgradeOptions(@Nullable Output<AutoUpgradeOptionsArgs> upgradeOptions) {
            $.upgradeOptions = upgradeOptions;
            return this;
        }

        /**
         * @param upgradeOptions Specifies the Auto Upgrade knobs for the node pool.
         * 
         * @return builder
         * 
         */
        public Builder upgradeOptions(AutoUpgradeOptionsArgs upgradeOptions) {
            return upgradeOptions(Output.of(upgradeOptions));
        }

        public NodeManagementArgs build() {
            return $;
        }
    }

}
