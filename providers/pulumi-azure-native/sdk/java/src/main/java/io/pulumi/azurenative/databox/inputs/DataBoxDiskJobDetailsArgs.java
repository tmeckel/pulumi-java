// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ContactDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataExportDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataImportDetailsArgs;
import io.pulumi.azurenative.databox.inputs.KeyEncryptionKeyArgs;
import io.pulumi.azurenative.databox.inputs.PreferencesArgs;
import io.pulumi.azurenative.databox.inputs.ShippingAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DataBox Disk Job Details.
 * 
 */
public final class DataBoxDiskJobDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataBoxDiskJobDetailsArgs Empty = new DataBoxDiskJobDetailsArgs();

    /**
     * Contact details for notification and shipping.
     * 
     */
    @InputImport(name="contactDetails", required=true)
      private final Input<ContactDetailsArgs> contactDetails;

    public Input<ContactDetailsArgs> getContactDetails() {
        return this.contactDetails;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @InputImport(name="dataExportDetails")
      private final @Nullable Input<List<DataExportDetailsArgs>> dataExportDetails;

    public Input<List<DataExportDetailsArgs>> getDataExportDetails() {
        return this.dataExportDetails == null ? Input.empty() : this.dataExportDetails;
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @InputImport(name="dataImportDetails")
      private final @Nullable Input<List<DataImportDetailsArgs>> dataImportDetails;

    public Input<List<DataImportDetailsArgs>> getDataImportDetails() {
        return this.dataImportDetails == null ? Input.empty() : this.dataImportDetails;
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @InputImport(name="expectedDataSizeInTeraBytes")
      private final @Nullable Input<Integer> expectedDataSizeInTeraBytes;

    public Input<Integer> getExpectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes == null ? Input.empty() : this.expectedDataSizeInTeraBytes;
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    @InputImport(name="jobDetailsType", required=true)
      private final Input<String> jobDetailsType;

    public Input<String> getJobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @InputImport(name="keyEncryptionKey")
      private final @Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey;

    public Input<KeyEncryptionKeyArgs> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Input.empty() : this.keyEncryptionKey;
    }

    /**
     * User entered passkey for DataBox Disk job.
     * 
     */
    @InputImport(name="passkey")
      private final @Nullable Input<String> passkey;

    public Input<String> getPasskey() {
        return this.passkey == null ? Input.empty() : this.passkey;
    }

    /**
     * Preferences for the order.
     * 
     */
    @InputImport(name="preferences")
      private final @Nullable Input<PreferencesArgs> preferences;

    public Input<PreferencesArgs> getPreferences() {
        return this.preferences == null ? Input.empty() : this.preferences;
    }

    /**
     * User preference on what size disks are needed for the job. The map is from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an int.
     * 
     */
    @InputImport(name="preferredDisks")
      private final @Nullable Input<Map<String,Integer>> preferredDisks;

    public Input<Map<String,Integer>> getPreferredDisks() {
        return this.preferredDisks == null ? Input.empty() : this.preferredDisks;
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @InputImport(name="shippingAddress")
      private final @Nullable Input<ShippingAddressArgs> shippingAddress;

    public Input<ShippingAddressArgs> getShippingAddress() {
        return this.shippingAddress == null ? Input.empty() : this.shippingAddress;
    }

    public DataBoxDiskJobDetailsArgs(
        Input<ContactDetailsArgs> contactDetails,
        @Nullable Input<List<DataExportDetailsArgs>> dataExportDetails,
        @Nullable Input<List<DataImportDetailsArgs>> dataImportDetails,
        @Nullable Input<Integer> expectedDataSizeInTeraBytes,
        Input<String> jobDetailsType,
        @Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey,
        @Nullable Input<String> passkey,
        @Nullable Input<PreferencesArgs> preferences,
        @Nullable Input<Map<String,Integer>> preferredDisks,
        @Nullable Input<ShippingAddressArgs> shippingAddress) {
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = Objects.requireNonNull(jobDetailsType, "expected parameter 'jobDetailsType' to be non-null");
        this.keyEncryptionKey = keyEncryptionKey;
        this.passkey = passkey;
        this.preferences = preferences;
        this.preferredDisks = preferredDisks;
        this.shippingAddress = shippingAddress;
    }

    private DataBoxDiskJobDetailsArgs() {
        this.contactDetails = Input.empty();
        this.dataExportDetails = Input.empty();
        this.dataImportDetails = Input.empty();
        this.expectedDataSizeInTeraBytes = Input.empty();
        this.jobDetailsType = Input.empty();
        this.keyEncryptionKey = Input.empty();
        this.passkey = Input.empty();
        this.preferences = Input.empty();
        this.preferredDisks = Input.empty();
        this.shippingAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ContactDetailsArgs> contactDetails;
        private @Nullable Input<List<DataExportDetailsArgs>> dataExportDetails;
        private @Nullable Input<List<DataImportDetailsArgs>> dataImportDetails;
        private @Nullable Input<Integer> expectedDataSizeInTeraBytes;
        private Input<String> jobDetailsType;
        private @Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey;
        private @Nullable Input<String> passkey;
        private @Nullable Input<PreferencesArgs> preferences;
        private @Nullable Input<Map<String,Integer>> preferredDisks;
        private @Nullable Input<ShippingAddressArgs> shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactDetails = defaults.contactDetails;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.passkey = defaults.passkey;
    	      this.preferences = defaults.preferences;
    	      this.preferredDisks = defaults.preferredDisks;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder contactDetails(Input<ContactDetailsArgs> contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }

        public Builder contactDetails(ContactDetailsArgs contactDetails) {
            this.contactDetails = Input.of(Objects.requireNonNull(contactDetails));
            return this;
        }

        public Builder dataExportDetails(@Nullable Input<List<DataExportDetailsArgs>> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }

        public Builder dataExportDetails(@Nullable List<DataExportDetailsArgs> dataExportDetails) {
            this.dataExportDetails = Input.ofNullable(dataExportDetails);
            return this;
        }

        public Builder dataImportDetails(@Nullable Input<List<DataImportDetailsArgs>> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }

        public Builder dataImportDetails(@Nullable List<DataImportDetailsArgs> dataImportDetails) {
            this.dataImportDetails = Input.ofNullable(dataImportDetails);
            return this;
        }

        public Builder expectedDataSizeInTeraBytes(@Nullable Input<Integer> expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }

        public Builder expectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = Input.ofNullable(expectedDataSizeInTeraBytes);
            return this;
        }

        public Builder jobDetailsType(Input<String> jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }

        public Builder jobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Input.of(Objects.requireNonNull(jobDetailsType));
            return this;
        }

        public Builder keyEncryptionKey(@Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder keyEncryptionKey(@Nullable KeyEncryptionKeyArgs keyEncryptionKey) {
            this.keyEncryptionKey = Input.ofNullable(keyEncryptionKey);
            return this;
        }

        public Builder passkey(@Nullable Input<String> passkey) {
            this.passkey = passkey;
            return this;
        }

        public Builder passkey(@Nullable String passkey) {
            this.passkey = Input.ofNullable(passkey);
            return this;
        }

        public Builder preferences(@Nullable Input<PreferencesArgs> preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder preferences(@Nullable PreferencesArgs preferences) {
            this.preferences = Input.ofNullable(preferences);
            return this;
        }

        public Builder preferredDisks(@Nullable Input<Map<String,Integer>> preferredDisks) {
            this.preferredDisks = preferredDisks;
            return this;
        }

        public Builder preferredDisks(@Nullable Map<String,Integer> preferredDisks) {
            this.preferredDisks = Input.ofNullable(preferredDisks);
            return this;
        }

        public Builder shippingAddress(@Nullable Input<ShippingAddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder shippingAddress(@Nullable ShippingAddressArgs shippingAddress) {
            this.shippingAddress = Input.ofNullable(shippingAddress);
            return this;
        }
        public DataBoxDiskJobDetailsArgs build() {
            return new DataBoxDiskJobDetailsArgs(contactDetails, dataExportDetails, dataImportDetails, expectedDataSizeInTeraBytes, jobDetailsType, keyEncryptionKey, passkey, preferences, preferredDisks, shippingAddress);
        }
    }
}
