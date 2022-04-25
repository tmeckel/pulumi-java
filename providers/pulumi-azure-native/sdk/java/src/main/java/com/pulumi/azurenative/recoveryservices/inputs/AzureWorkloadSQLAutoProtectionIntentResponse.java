// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Workload SQL Auto Protection intent item.
 * 
 */
public final class AzureWorkloadSQLAutoProtectionIntentResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureWorkloadSQLAutoProtectionIntentResponse Empty = new AzureWorkloadSQLAutoProtectionIntentResponse();

    /**
     * Type of backup management for the backed up item.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable String backupManagementType;

    /**
     * @return Type of backup management for the backed up item.
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    @Import(name="itemId")
    private @Nullable String itemId;

    /**
     * @return ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
     * 
     */
    public Optional<String> itemId() {
        return Optional.ofNullable(this.itemId);
    }

    /**
     * ID of the backup policy with which this item is backed up.
     * 
     */
    @Import(name="policyId")
    private @Nullable String policyId;

    /**
     * @return ID of the backup policy with which this item is backed up.
     * 
     */
    public Optional<String> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * backup protectionIntent type.
     * Expected value is &#39;AzureWorkloadSQLAutoProtectionIntent&#39;.
     * 
     */
    @Import(name="protectionIntentItemType", required=true)
    private String protectionIntentItemType;

    /**
     * @return backup protectionIntent type.
     * Expected value is &#39;AzureWorkloadSQLAutoProtectionIntent&#39;.
     * 
     */
    public String protectionIntentItemType() {
        return this.protectionIntentItemType;
    }

    /**
     * Backup state of this backup item.
     * 
     */
    @Import(name="protectionState")
    private @Nullable String protectionState;

    /**
     * @return Backup state of this backup item.
     * 
     */
    public Optional<String> protectionState() {
        return Optional.ofNullable(this.protectionState);
    }

    /**
     * ARM ID of the resource to be backed up.
     * 
     */
    @Import(name="sourceResourceId")
    private @Nullable String sourceResourceId;

    /**
     * @return ARM ID of the resource to be backed up.
     * 
     */
    public Optional<String> sourceResourceId() {
        return Optional.ofNullable(this.sourceResourceId);
    }

    /**
     * Workload item type of the item for which intent is to be set
     * 
     */
    @Import(name="workloadItemType")
    private @Nullable String workloadItemType;

    /**
     * @return Workload item type of the item for which intent is to be set
     * 
     */
    public Optional<String> workloadItemType() {
        return Optional.ofNullable(this.workloadItemType);
    }

    private AzureWorkloadSQLAutoProtectionIntentResponse() {}

    private AzureWorkloadSQLAutoProtectionIntentResponse(AzureWorkloadSQLAutoProtectionIntentResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.itemId = $.itemId;
        this.policyId = $.policyId;
        this.protectionIntentItemType = $.protectionIntentItemType;
        this.protectionState = $.protectionState;
        this.sourceResourceId = $.sourceResourceId;
        this.workloadItemType = $.workloadItemType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureWorkloadSQLAutoProtectionIntentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureWorkloadSQLAutoProtectionIntentResponse $;

        public Builder() {
            $ = new AzureWorkloadSQLAutoProtectionIntentResponse();
        }

        public Builder(AzureWorkloadSQLAutoProtectionIntentResponse defaults) {
            $ = new AzureWorkloadSQLAutoProtectionIntentResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType Type of backup management for the backed up item.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param itemId ID of the item which is getting protected, In case of Azure Vm , it is ProtectedItemId
         * 
         * @return builder
         * 
         */
        public Builder itemId(@Nullable String itemId) {
            $.itemId = itemId;
            return this;
        }

        /**
         * @param policyId ID of the backup policy with which this item is backed up.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable String policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param protectionIntentItemType backup protectionIntent type.
         * Expected value is &#39;AzureWorkloadSQLAutoProtectionIntent&#39;.
         * 
         * @return builder
         * 
         */
        public Builder protectionIntentItemType(String protectionIntentItemType) {
            $.protectionIntentItemType = protectionIntentItemType;
            return this;
        }

        /**
         * @param protectionState Backup state of this backup item.
         * 
         * @return builder
         * 
         */
        public Builder protectionState(@Nullable String protectionState) {
            $.protectionState = protectionState;
            return this;
        }

        /**
         * @param sourceResourceId ARM ID of the resource to be backed up.
         * 
         * @return builder
         * 
         */
        public Builder sourceResourceId(@Nullable String sourceResourceId) {
            $.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * @param workloadItemType Workload item type of the item for which intent is to be set
         * 
         * @return builder
         * 
         */
        public Builder workloadItemType(@Nullable String workloadItemType) {
            $.workloadItemType = workloadItemType;
            return this;
        }

        public AzureWorkloadSQLAutoProtectionIntentResponse build() {
            $.protectionIntentItemType = Codegen.stringProp("protectionIntentItemType").arg($.protectionIntentItemType).require();
            return $;
        }
    }

}
