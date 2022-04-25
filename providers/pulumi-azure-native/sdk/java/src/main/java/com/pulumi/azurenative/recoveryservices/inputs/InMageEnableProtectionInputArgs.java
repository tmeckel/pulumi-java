// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.InMageDiskExclusionInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMware Azure specific enable protection input.
 * 
 */
public final class InMageEnableProtectionInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final InMageEnableProtectionInputArgs Empty = new InMageEnableProtectionInputArgs();

    /**
     * The target data store name.
     * 
     */
    @Import(name="datastoreName")
    private @Nullable Output<String> datastoreName;

    /**
     * @return The target data store name.
     * 
     */
    public Optional<Output<String>> datastoreName() {
        return Optional.ofNullable(this.datastoreName);
    }

    /**
     * The enable disk exclusion input.
     * 
     */
    @Import(name="diskExclusionInput")
    private @Nullable Output<InMageDiskExclusionInputArgs> diskExclusionInput;

    /**
     * @return The enable disk exclusion input.
     * 
     */
    public Optional<Output<InMageDiskExclusionInputArgs>> diskExclusionInput() {
        return Optional.ofNullable(this.diskExclusionInput);
    }

    /**
     * The disks to include list.
     * 
     */
    @Import(name="disksToInclude")
    private @Nullable Output<List<String>> disksToInclude;

    /**
     * @return The disks to include list.
     * 
     */
    public Optional<Output<List<String>>> disksToInclude() {
        return Optional.ofNullable(this.disksToInclude);
    }

    /**
     * The class type.
     * Expected value is &#39;InMage&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The class type.
     * Expected value is &#39;InMage&#39;.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The Master Target Id.
     * 
     */
    @Import(name="masterTargetId", required=true)
    private Output<String> masterTargetId;

    /**
     * @return The Master Target Id.
     * 
     */
    public Output<String> masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * The multi vm group Id.
     * 
     */
    @Import(name="multiVmGroupId", required=true)
    private Output<String> multiVmGroupId;

    /**
     * @return The multi vm group Id.
     * 
     */
    public Output<String> multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * The multi vm group name.
     * 
     */
    @Import(name="multiVmGroupName", required=true)
    private Output<String> multiVmGroupName;

    /**
     * @return The multi vm group name.
     * 
     */
    public Output<String> multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * The Process Server Id.
     * 
     */
    @Import(name="processServerId", required=true)
    private Output<String> processServerId;

    /**
     * @return The Process Server Id.
     * 
     */
    public Output<String> processServerId() {
        return this.processServerId;
    }

    /**
     * The retention drive to use on the MT.
     * 
     */
    @Import(name="retentionDrive", required=true)
    private Output<String> retentionDrive;

    /**
     * @return The retention drive to use on the MT.
     * 
     */
    public Output<String> retentionDrive() {
        return this.retentionDrive;
    }

    /**
     * The CS account Id.
     * 
     */
    @Import(name="runAsAccountId")
    private @Nullable Output<String> runAsAccountId;

    /**
     * @return The CS account Id.
     * 
     */
    public Optional<Output<String>> runAsAccountId() {
        return Optional.ofNullable(this.runAsAccountId);
    }

    /**
     * The Vm Name.
     * 
     */
    @Import(name="vmFriendlyName")
    private @Nullable Output<String> vmFriendlyName;

    /**
     * @return The Vm Name.
     * 
     */
    public Optional<Output<String>> vmFriendlyName() {
        return Optional.ofNullable(this.vmFriendlyName);
    }

    private InMageEnableProtectionInputArgs() {}

    private InMageEnableProtectionInputArgs(InMageEnableProtectionInputArgs $) {
        this.datastoreName = $.datastoreName;
        this.diskExclusionInput = $.diskExclusionInput;
        this.disksToInclude = $.disksToInclude;
        this.instanceType = $.instanceType;
        this.masterTargetId = $.masterTargetId;
        this.multiVmGroupId = $.multiVmGroupId;
        this.multiVmGroupName = $.multiVmGroupName;
        this.processServerId = $.processServerId;
        this.retentionDrive = $.retentionDrive;
        this.runAsAccountId = $.runAsAccountId;
        this.vmFriendlyName = $.vmFriendlyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageEnableProtectionInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageEnableProtectionInputArgs $;

        public Builder() {
            $ = new InMageEnableProtectionInputArgs();
        }

        public Builder(InMageEnableProtectionInputArgs defaults) {
            $ = new InMageEnableProtectionInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreName The target data store name.
         * 
         * @return builder
         * 
         */
        public Builder datastoreName(@Nullable Output<String> datastoreName) {
            $.datastoreName = datastoreName;
            return this;
        }

        /**
         * @param datastoreName The target data store name.
         * 
         * @return builder
         * 
         */
        public Builder datastoreName(String datastoreName) {
            return datastoreName(Output.of(datastoreName));
        }

        /**
         * @param diskExclusionInput The enable disk exclusion input.
         * 
         * @return builder
         * 
         */
        public Builder diskExclusionInput(@Nullable Output<InMageDiskExclusionInputArgs> diskExclusionInput) {
            $.diskExclusionInput = diskExclusionInput;
            return this;
        }

        /**
         * @param diskExclusionInput The enable disk exclusion input.
         * 
         * @return builder
         * 
         */
        public Builder diskExclusionInput(InMageDiskExclusionInputArgs diskExclusionInput) {
            return diskExclusionInput(Output.of(diskExclusionInput));
        }

        /**
         * @param disksToInclude The disks to include list.
         * 
         * @return builder
         * 
         */
        public Builder disksToInclude(@Nullable Output<List<String>> disksToInclude) {
            $.disksToInclude = disksToInclude;
            return this;
        }

        /**
         * @param disksToInclude The disks to include list.
         * 
         * @return builder
         * 
         */
        public Builder disksToInclude(List<String> disksToInclude) {
            return disksToInclude(Output.of(disksToInclude));
        }

        /**
         * @param disksToInclude The disks to include list.
         * 
         * @return builder
         * 
         */
        public Builder disksToInclude(String... disksToInclude) {
            return disksToInclude(List.of(disksToInclude));
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;InMage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The class type.
         * Expected value is &#39;InMage&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param masterTargetId The Master Target Id.
         * 
         * @return builder
         * 
         */
        public Builder masterTargetId(Output<String> masterTargetId) {
            $.masterTargetId = masterTargetId;
            return this;
        }

        /**
         * @param masterTargetId The Master Target Id.
         * 
         * @return builder
         * 
         */
        public Builder masterTargetId(String masterTargetId) {
            return masterTargetId(Output.of(masterTargetId));
        }

        /**
         * @param multiVmGroupId The multi vm group Id.
         * 
         * @return builder
         * 
         */
        public Builder multiVmGroupId(Output<String> multiVmGroupId) {
            $.multiVmGroupId = multiVmGroupId;
            return this;
        }

        /**
         * @param multiVmGroupId The multi vm group Id.
         * 
         * @return builder
         * 
         */
        public Builder multiVmGroupId(String multiVmGroupId) {
            return multiVmGroupId(Output.of(multiVmGroupId));
        }

        /**
         * @param multiVmGroupName The multi vm group name.
         * 
         * @return builder
         * 
         */
        public Builder multiVmGroupName(Output<String> multiVmGroupName) {
            $.multiVmGroupName = multiVmGroupName;
            return this;
        }

        /**
         * @param multiVmGroupName The multi vm group name.
         * 
         * @return builder
         * 
         */
        public Builder multiVmGroupName(String multiVmGroupName) {
            return multiVmGroupName(Output.of(multiVmGroupName));
        }

        /**
         * @param processServerId The Process Server Id.
         * 
         * @return builder
         * 
         */
        public Builder processServerId(Output<String> processServerId) {
            $.processServerId = processServerId;
            return this;
        }

        /**
         * @param processServerId The Process Server Id.
         * 
         * @return builder
         * 
         */
        public Builder processServerId(String processServerId) {
            return processServerId(Output.of(processServerId));
        }

        /**
         * @param retentionDrive The retention drive to use on the MT.
         * 
         * @return builder
         * 
         */
        public Builder retentionDrive(Output<String> retentionDrive) {
            $.retentionDrive = retentionDrive;
            return this;
        }

        /**
         * @param retentionDrive The retention drive to use on the MT.
         * 
         * @return builder
         * 
         */
        public Builder retentionDrive(String retentionDrive) {
            return retentionDrive(Output.of(retentionDrive));
        }

        /**
         * @param runAsAccountId The CS account Id.
         * 
         * @return builder
         * 
         */
        public Builder runAsAccountId(@Nullable Output<String> runAsAccountId) {
            $.runAsAccountId = runAsAccountId;
            return this;
        }

        /**
         * @param runAsAccountId The CS account Id.
         * 
         * @return builder
         * 
         */
        public Builder runAsAccountId(String runAsAccountId) {
            return runAsAccountId(Output.of(runAsAccountId));
        }

        /**
         * @param vmFriendlyName The Vm Name.
         * 
         * @return builder
         * 
         */
        public Builder vmFriendlyName(@Nullable Output<String> vmFriendlyName) {
            $.vmFriendlyName = vmFriendlyName;
            return this;
        }

        /**
         * @param vmFriendlyName The Vm Name.
         * 
         * @return builder
         * 
         */
        public Builder vmFriendlyName(String vmFriendlyName) {
            return vmFriendlyName(Output.of(vmFriendlyName));
        }

        public InMageEnableProtectionInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            $.masterTargetId = Objects.requireNonNull($.masterTargetId, "expected parameter 'masterTargetId' to be non-null");
            $.multiVmGroupId = Objects.requireNonNull($.multiVmGroupId, "expected parameter 'multiVmGroupId' to be non-null");
            $.multiVmGroupName = Objects.requireNonNull($.multiVmGroupName, "expected parameter 'multiVmGroupName' to be non-null");
            $.processServerId = Objects.requireNonNull($.processServerId, "expected parameter 'processServerId' to be non-null");
            $.retentionDrive = Objects.requireNonNull($.retentionDrive, "expected parameter 'retentionDrive' to be non-null");
            return $;
        }
    }

}
