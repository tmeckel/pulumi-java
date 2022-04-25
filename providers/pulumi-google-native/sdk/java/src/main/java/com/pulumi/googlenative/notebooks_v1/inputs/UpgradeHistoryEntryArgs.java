// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.enums.UpgradeHistoryEntryAction;
import com.pulumi.googlenative.notebooks_v1.enums.UpgradeHistoryEntryState;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The entry of VM image upgrade history.
 * 
 */
public final class UpgradeHistoryEntryArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpgradeHistoryEntryArgs Empty = new UpgradeHistoryEntryArgs();

    /**
     * Action. Rolloback or Upgrade.
     * 
     */
    @Import(name="action")
    private @Nullable Output<UpgradeHistoryEntryAction> action;

    /**
     * @return Action. Rolloback or Upgrade.
     * 
     */
    public Optional<Output<UpgradeHistoryEntryAction>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The container image before this instance upgrade.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<String> containerImage;

    /**
     * @return The container image before this instance upgrade.
     * 
     */
    public Optional<Output<String>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    /**
     * The time that this instance upgrade history entry is created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time that this instance upgrade history entry is created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The framework of this notebook instance.
     * 
     */
    @Import(name="framework")
    private @Nullable Output<String> framework;

    /**
     * @return The framework of this notebook instance.
     * 
     */
    public Optional<Output<String>> framework() {
        return Optional.ofNullable(this.framework);
    }

    /**
     * The snapshot of the boot disk of this notebook instance before upgrade.
     * 
     */
    @Import(name="snapshot")
    private @Nullable Output<String> snapshot;

    /**
     * @return The snapshot of the boot disk of this notebook instance before upgrade.
     * 
     */
    public Optional<Output<String>> snapshot() {
        return Optional.ofNullable(this.snapshot);
    }

    /**
     * The state of this instance upgrade history entry.
     * 
     */
    @Import(name="state")
    private @Nullable Output<UpgradeHistoryEntryState> state;

    /**
     * @return The state of this instance upgrade history entry.
     * 
     */
    public Optional<Output<UpgradeHistoryEntryState>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Target VM Image. Format: ainotebooks-vm/project/image-name/name.
     * 
     */
    @Import(name="targetImage")
    private @Nullable Output<String> targetImage;

    /**
     * @return Target VM Image. Format: ainotebooks-vm/project/image-name/name.
     * 
     */
    public Optional<Output<String>> targetImage() {
        return Optional.ofNullable(this.targetImage);
    }

    /**
     * Target VM Version, like m63.
     * 
     */
    @Import(name="targetVersion")
    private @Nullable Output<String> targetVersion;

    /**
     * @return Target VM Version, like m63.
     * 
     */
    public Optional<Output<String>> targetVersion() {
        return Optional.ofNullable(this.targetVersion);
    }

    /**
     * The version of the notebook instance before this upgrade.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the notebook instance before this upgrade.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The VM image before this instance upgrade.
     * 
     */
    @Import(name="vmImage")
    private @Nullable Output<String> vmImage;

    /**
     * @return The VM image before this instance upgrade.
     * 
     */
    public Optional<Output<String>> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    private UpgradeHistoryEntryArgs() {}

    private UpgradeHistoryEntryArgs(UpgradeHistoryEntryArgs $) {
        this.action = $.action;
        this.containerImage = $.containerImage;
        this.createTime = $.createTime;
        this.framework = $.framework;
        this.snapshot = $.snapshot;
        this.state = $.state;
        this.targetImage = $.targetImage;
        this.targetVersion = $.targetVersion;
        this.version = $.version;
        this.vmImage = $.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpgradeHistoryEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeHistoryEntryArgs $;

        public Builder() {
            $ = new UpgradeHistoryEntryArgs();
        }

        public Builder(UpgradeHistoryEntryArgs defaults) {
            $ = new UpgradeHistoryEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Action. Rolloback or Upgrade.
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<UpgradeHistoryEntryAction> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Action. Rolloback or Upgrade.
         * 
         * @return builder
         * 
         */
        public Builder action(UpgradeHistoryEntryAction action) {
            return action(Output.of(action));
        }

        /**
         * @param containerImage The container image before this instance upgrade.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(@Nullable Output<String> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        /**
         * @param containerImage The container image before this instance upgrade.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(String containerImage) {
            return containerImage(Output.of(containerImage));
        }

        /**
         * @param createTime The time that this instance upgrade history entry is created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time that this instance upgrade history entry is created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param framework The framework of this notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder framework(@Nullable Output<String> framework) {
            $.framework = framework;
            return this;
        }

        /**
         * @param framework The framework of this notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder framework(String framework) {
            return framework(Output.of(framework));
        }

        /**
         * @param snapshot The snapshot of the boot disk of this notebook instance before upgrade.
         * 
         * @return builder
         * 
         */
        public Builder snapshot(@Nullable Output<String> snapshot) {
            $.snapshot = snapshot;
            return this;
        }

        /**
         * @param snapshot The snapshot of the boot disk of this notebook instance before upgrade.
         * 
         * @return builder
         * 
         */
        public Builder snapshot(String snapshot) {
            return snapshot(Output.of(snapshot));
        }

        /**
         * @param state The state of this instance upgrade history entry.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<UpgradeHistoryEntryState> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of this instance upgrade history entry.
         * 
         * @return builder
         * 
         */
        public Builder state(UpgradeHistoryEntryState state) {
            return state(Output.of(state));
        }

        /**
         * @param targetImage Target VM Image. Format: ainotebooks-vm/project/image-name/name.
         * 
         * @return builder
         * 
         */
        public Builder targetImage(@Nullable Output<String> targetImage) {
            $.targetImage = targetImage;
            return this;
        }

        /**
         * @param targetImage Target VM Image. Format: ainotebooks-vm/project/image-name/name.
         * 
         * @return builder
         * 
         */
        public Builder targetImage(String targetImage) {
            return targetImage(Output.of(targetImage));
        }

        /**
         * @param targetVersion Target VM Version, like m63.
         * 
         * @return builder
         * 
         */
        public Builder targetVersion(@Nullable Output<String> targetVersion) {
            $.targetVersion = targetVersion;
            return this;
        }

        /**
         * @param targetVersion Target VM Version, like m63.
         * 
         * @return builder
         * 
         */
        public Builder targetVersion(String targetVersion) {
            return targetVersion(Output.of(targetVersion));
        }

        /**
         * @param version The version of the notebook instance before this upgrade.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the notebook instance before this upgrade.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param vmImage The VM image before this instance upgrade.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(@Nullable Output<String> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        /**
         * @param vmImage The VM image before this instance upgrade.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(String vmImage) {
            return vmImage(Output.of(vmImage));
        }

        public UpgradeHistoryEntryArgs build() {
            return $;
        }
    }

}
