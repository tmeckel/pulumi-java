// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.ContactDetailsResponse;
import com.pulumi.azurenative.databox.inputs.CopyProgressResponse;
import com.pulumi.azurenative.databox.inputs.DataBoxAccountCopyLogDetailsResponse;
import com.pulumi.azurenative.databox.inputs.DataBoxDiskCopyLogDetailsResponse;
import com.pulumi.azurenative.databox.inputs.DataBoxHeavyAccountCopyLogDetailsResponse;
import com.pulumi.azurenative.databox.inputs.DataExportDetailsResponse;
import com.pulumi.azurenative.databox.inputs.DataImportDetailsResponse;
import com.pulumi.azurenative.databox.inputs.JobStagesResponse;
import com.pulumi.azurenative.databox.inputs.KeyEncryptionKeyResponse;
import com.pulumi.azurenative.databox.inputs.PackageShippingDetailsResponse;
import com.pulumi.azurenative.databox.inputs.PreferencesResponse;
import com.pulumi.azurenative.databox.inputs.ShippingAddressResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Databox Heavy Device Job Details
 * 
 */
public final class DataBoxHeavyJobDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataBoxHeavyJobDetailsResponse Empty = new DataBoxHeavyJobDetailsResponse();

    /**
     * Shared access key to download the chain of custody logs
     * 
     */
    @Import(name="chainOfCustodySasKey", required=true)
    private String chainOfCustodySasKey;

    /**
     * @return Shared access key to download the chain of custody logs
     * 
     */
    public String chainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }

    /**
     * Contact details for notification and shipping.
     * 
     */
    @Import(name="contactDetails", required=true)
    private ContactDetailsResponse contactDetails;

    /**
     * @return Contact details for notification and shipping.
     * 
     */
    public ContactDetailsResponse contactDetails() {
        return this.contactDetails;
    }

    /**
     * List of copy log details.
     * 
     */
    @Import(name="copyLogDetails", required=true)
    private List<Object> copyLogDetails;

    /**
     * @return List of copy log details.
     * 
     */
    public List<Object> copyLogDetails() {
        return this.copyLogDetails;
    }

    /**
     * Copy progress per account.
     * 
     */
    @Import(name="copyProgress", required=true)
    private List<CopyProgressResponse> copyProgress;

    /**
     * @return Copy progress per account.
     * 
     */
    public List<CopyProgressResponse> copyProgress() {
        return this.copyProgress;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @Import(name="dataExportDetails")
    private @Nullable List<DataExportDetailsResponse> dataExportDetails;

    /**
     * @return Details of the data to be exported from azure.
     * 
     */
    public Optional<List<DataExportDetailsResponse>> dataExportDetails() {
        return Optional.ofNullable(this.dataExportDetails);
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @Import(name="dataImportDetails")
    private @Nullable List<DataImportDetailsResponse> dataImportDetails;

    /**
     * @return Details of the data to be imported into azure.
     * 
     */
    public Optional<List<DataImportDetailsResponse>> dataImportDetails() {
        return Optional.ofNullable(this.dataImportDetails);
    }

    /**
     * Delivery package shipping details.
     * 
     */
    @Import(name="deliveryPackage", required=true)
    private PackageShippingDetailsResponse deliveryPackage;

    /**
     * @return Delivery package shipping details.
     * 
     */
    public PackageShippingDetailsResponse deliveryPackage() {
        return this.deliveryPackage;
    }

    /**
     * Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="devicePassword")
    private @Nullable String devicePassword;

    /**
     * @return Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    public Optional<String> devicePassword() {
        return Optional.ofNullable(this.devicePassword);
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @Import(name="expectedDataSizeInTeraBytes")
    private @Nullable Integer expectedDataSizeInTeraBytes;

    /**
     * @return The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    public Optional<Integer> expectedDataSizeInTeraBytes() {
        return Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }

    /**
     * Indicates the type of job details.
     * Expected value is &#39;DataBoxHeavy&#39;.
     * 
     */
    @Import(name="jobDetailsType", required=true)
    private String jobDetailsType;

    /**
     * @return Indicates the type of job details.
     * Expected value is &#39;DataBoxHeavy&#39;.
     * 
     */
    public String jobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * List of stages that run in the job.
     * 
     */
    @Import(name="jobStages", required=true)
    private List<JobStagesResponse> jobStages;

    /**
     * @return List of stages that run in the job.
     * 
     */
    public List<JobStagesResponse> jobStages() {
        return this.jobStages;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @Import(name="keyEncryptionKey")
    private @Nullable KeyEncryptionKeyResponse keyEncryptionKey;

    /**
     * @return Details about which key encryption type is being used.
     * 
     */
    public Optional<KeyEncryptionKeyResponse> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    /**
     * Preferences for the order.
     * 
     */
    @Import(name="preferences")
    private @Nullable PreferencesResponse preferences;

    /**
     * @return Preferences for the order.
     * 
     */
    public Optional<PreferencesResponse> preferences() {
        return Optional.ofNullable(this.preferences);
    }

    /**
     * Return package shipping details.
     * 
     */
    @Import(name="returnPackage", required=true)
    private PackageShippingDetailsResponse returnPackage;

    /**
     * @return Return package shipping details.
     * 
     */
    public PackageShippingDetailsResponse returnPackage() {
        return this.returnPackage;
    }

    /**
     * Shared access key to download the return shipment label
     * 
     */
    @Import(name="reverseShipmentLabelSasKey", required=true)
    private String reverseShipmentLabelSasKey;

    /**
     * @return Shared access key to download the return shipment label
     * 
     */
    public String reverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @Import(name="shippingAddress")
    private @Nullable ShippingAddressResponse shippingAddress;

    /**
     * @return Shipping address of the customer.
     * 
     */
    public Optional<ShippingAddressResponse> shippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    private DataBoxHeavyJobDetailsResponse() {}

    private DataBoxHeavyJobDetailsResponse(DataBoxHeavyJobDetailsResponse $) {
        this.chainOfCustodySasKey = $.chainOfCustodySasKey;
        this.contactDetails = $.contactDetails;
        this.copyLogDetails = $.copyLogDetails;
        this.copyProgress = $.copyProgress;
        this.dataExportDetails = $.dataExportDetails;
        this.dataImportDetails = $.dataImportDetails;
        this.deliveryPackage = $.deliveryPackage;
        this.devicePassword = $.devicePassword;
        this.expectedDataSizeInTeraBytes = $.expectedDataSizeInTeraBytes;
        this.jobDetailsType = $.jobDetailsType;
        this.jobStages = $.jobStages;
        this.keyEncryptionKey = $.keyEncryptionKey;
        this.preferences = $.preferences;
        this.returnPackage = $.returnPackage;
        this.reverseShipmentLabelSasKey = $.reverseShipmentLabelSasKey;
        this.shippingAddress = $.shippingAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataBoxHeavyJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataBoxHeavyJobDetailsResponse $;

        public Builder() {
            $ = new DataBoxHeavyJobDetailsResponse();
        }

        public Builder(DataBoxHeavyJobDetailsResponse defaults) {
            $ = new DataBoxHeavyJobDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param chainOfCustodySasKey Shared access key to download the chain of custody logs
         * 
         * @return builder
         * 
         */
        public Builder chainOfCustodySasKey(String chainOfCustodySasKey) {
            $.chainOfCustodySasKey = chainOfCustodySasKey;
            return this;
        }

        /**
         * @param contactDetails Contact details for notification and shipping.
         * 
         * @return builder
         * 
         */
        public Builder contactDetails(ContactDetailsResponse contactDetails) {
            $.contactDetails = contactDetails;
            return this;
        }

        /**
         * @param copyLogDetails List of copy log details.
         * 
         * @return builder
         * 
         */
        public Builder copyLogDetails(List<Object> copyLogDetails) {
            $.copyLogDetails = copyLogDetails;
            return this;
        }

        /**
         * @param copyLogDetails List of copy log details.
         * 
         * @return builder
         * 
         */
        public Builder copyLogDetails(Object... copyLogDetails) {
            return copyLogDetails(List.of(copyLogDetails));
        }

        /**
         * @param copyProgress Copy progress per account.
         * 
         * @return builder
         * 
         */
        public Builder copyProgress(List<CopyProgressResponse> copyProgress) {
            $.copyProgress = copyProgress;
            return this;
        }

        /**
         * @param copyProgress Copy progress per account.
         * 
         * @return builder
         * 
         */
        public Builder copyProgress(CopyProgressResponse... copyProgress) {
            return copyProgress(List.of(copyProgress));
        }

        /**
         * @param dataExportDetails Details of the data to be exported from azure.
         * 
         * @return builder
         * 
         */
        public Builder dataExportDetails(@Nullable List<DataExportDetailsResponse> dataExportDetails) {
            $.dataExportDetails = dataExportDetails;
            return this;
        }

        /**
         * @param dataExportDetails Details of the data to be exported from azure.
         * 
         * @return builder
         * 
         */
        public Builder dataExportDetails(DataExportDetailsResponse... dataExportDetails) {
            return dataExportDetails(List.of(dataExportDetails));
        }

        /**
         * @param dataImportDetails Details of the data to be imported into azure.
         * 
         * @return builder
         * 
         */
        public Builder dataImportDetails(@Nullable List<DataImportDetailsResponse> dataImportDetails) {
            $.dataImportDetails = dataImportDetails;
            return this;
        }

        /**
         * @param dataImportDetails Details of the data to be imported into azure.
         * 
         * @return builder
         * 
         */
        public Builder dataImportDetails(DataImportDetailsResponse... dataImportDetails) {
            return dataImportDetails(List.of(dataImportDetails));
        }

        /**
         * @param deliveryPackage Delivery package shipping details.
         * 
         * @return builder
         * 
         */
        public Builder deliveryPackage(PackageShippingDetailsResponse deliveryPackage) {
            $.deliveryPackage = deliveryPackage;
            return this;
        }

        /**
         * @param devicePassword Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
         * 
         * @return builder
         * 
         */
        public Builder devicePassword(@Nullable String devicePassword) {
            $.devicePassword = devicePassword;
            return this;
        }

        /**
         * @param expectedDataSizeInTeraBytes The expected size of the data, which needs to be transferred in this job, in terabytes.
         * 
         * @return builder
         * 
         */
        public Builder expectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            $.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }

        /**
         * @param jobDetailsType Indicates the type of job details.
         * Expected value is &#39;DataBoxHeavy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder jobDetailsType(String jobDetailsType) {
            $.jobDetailsType = jobDetailsType;
            return this;
        }

        /**
         * @param jobStages List of stages that run in the job.
         * 
         * @return builder
         * 
         */
        public Builder jobStages(List<JobStagesResponse> jobStages) {
            $.jobStages = jobStages;
            return this;
        }

        /**
         * @param jobStages List of stages that run in the job.
         * 
         * @return builder
         * 
         */
        public Builder jobStages(JobStagesResponse... jobStages) {
            return jobStages(List.of(jobStages));
        }

        /**
         * @param keyEncryptionKey Details about which key encryption type is being used.
         * 
         * @return builder
         * 
         */
        public Builder keyEncryptionKey(@Nullable KeyEncryptionKeyResponse keyEncryptionKey) {
            $.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        /**
         * @param preferences Preferences for the order.
         * 
         * @return builder
         * 
         */
        public Builder preferences(@Nullable PreferencesResponse preferences) {
            $.preferences = preferences;
            return this;
        }

        /**
         * @param returnPackage Return package shipping details.
         * 
         * @return builder
         * 
         */
        public Builder returnPackage(PackageShippingDetailsResponse returnPackage) {
            $.returnPackage = returnPackage;
            return this;
        }

        /**
         * @param reverseShipmentLabelSasKey Shared access key to download the return shipment label
         * 
         * @return builder
         * 
         */
        public Builder reverseShipmentLabelSasKey(String reverseShipmentLabelSasKey) {
            $.reverseShipmentLabelSasKey = reverseShipmentLabelSasKey;
            return this;
        }

        /**
         * @param shippingAddress Shipping address of the customer.
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            $.shippingAddress = shippingAddress;
            return this;
        }

        public DataBoxHeavyJobDetailsResponse build() {
            $.chainOfCustodySasKey = Objects.requireNonNull($.chainOfCustodySasKey, "expected parameter 'chainOfCustodySasKey' to be non-null");
            $.contactDetails = Objects.requireNonNull($.contactDetails, "expected parameter 'contactDetails' to be non-null");
            $.copyLogDetails = Objects.requireNonNull($.copyLogDetails, "expected parameter 'copyLogDetails' to be non-null");
            $.copyProgress = Objects.requireNonNull($.copyProgress, "expected parameter 'copyProgress' to be non-null");
            $.deliveryPackage = Objects.requireNonNull($.deliveryPackage, "expected parameter 'deliveryPackage' to be non-null");
            $.jobDetailsType = Codegen.stringProp("jobDetailsType").arg($.jobDetailsType).require();
            $.jobStages = Objects.requireNonNull($.jobStages, "expected parameter 'jobStages' to be non-null");
            $.returnPackage = Objects.requireNonNull($.returnPackage, "expected parameter 'returnPackage' to be non-null");
            $.reverseShipmentLabelSasKey = Objects.requireNonNull($.reverseShipmentLabelSasKey, "expected parameter 'reverseShipmentLabelSasKey' to be non-null");
            return $;
        }
    }

}
