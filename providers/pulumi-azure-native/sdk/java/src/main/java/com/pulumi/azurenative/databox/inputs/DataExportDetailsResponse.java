// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.ManagedDiskDetailsResponse;
import com.pulumi.azurenative.databox.inputs.StorageAccountDetailsResponse;
import com.pulumi.azurenative.databox.inputs.TransferConfigurationResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the data to be used for exporting data from azure.
 * 
 */
public final class DataExportDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DataExportDetailsResponse Empty = new DataExportDetailsResponse();

    /**
     * Account details of the data to be transferred
     * 
     */
    @Import(name="accountDetails", required=true)
    private Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;

    /**
     * @return Account details of the data to be transferred
     * 
     */
    public Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails() {
        return this.accountDetails;
    }

    /**
     * Level of the logs to be collected.
     * 
     */
    @Import(name="logCollectionLevel")
    private @Nullable String logCollectionLevel;

    /**
     * @return Level of the logs to be collected.
     * 
     */
    public Optional<String> logCollectionLevel() {
        return Optional.ofNullable(this.logCollectionLevel);
    }

    /**
     * Configuration for the data transfer.
     * 
     */
    @Import(name="transferConfiguration", required=true)
    private TransferConfigurationResponse transferConfiguration;

    /**
     * @return Configuration for the data transfer.
     * 
     */
    public TransferConfigurationResponse transferConfiguration() {
        return this.transferConfiguration;
    }

    private DataExportDetailsResponse() {}

    private DataExportDetailsResponse(DataExportDetailsResponse $) {
        this.accountDetails = $.accountDetails;
        this.logCollectionLevel = $.logCollectionLevel;
        this.transferConfiguration = $.transferConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataExportDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataExportDetailsResponse $;

        public Builder() {
            $ = new DataExportDetailsResponse();
        }

        public Builder(DataExportDetailsResponse defaults) {
            $ = new DataExportDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountDetails Account details of the data to be transferred
         * 
         * @return builder
         * 
         */
        public Builder accountDetails(Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails) {
            $.accountDetails = accountDetails;
            return this;
        }

        /**
         * @param accountDetails Account details of the data to be transferred
         * 
         * @return builder
         * 
         */
        public Builder accountDetails(ManagedDiskDetailsResponse accountDetails) {
            return accountDetails(Either.ofLeft(accountDetails));
        }

        /**
         * @param accountDetails Account details of the data to be transferred
         * 
         * @return builder
         * 
         */
        public Builder accountDetails(StorageAccountDetailsResponse accountDetails) {
            return accountDetails(Either.ofRight(accountDetails));
        }

        /**
         * @param logCollectionLevel Level of the logs to be collected.
         * 
         * @return builder
         * 
         */
        public Builder logCollectionLevel(@Nullable String logCollectionLevel) {
            $.logCollectionLevel = logCollectionLevel;
            return this;
        }

        /**
         * @param transferConfiguration Configuration for the data transfer.
         * 
         * @return builder
         * 
         */
        public Builder transferConfiguration(TransferConfigurationResponse transferConfiguration) {
            $.transferConfiguration = transferConfiguration;
            return this;
        }

        public DataExportDetailsResponse build() {
            $.accountDetails = Objects.requireNonNull($.accountDetails, "expected parameter 'accountDetails' to be non-null");
            $.logCollectionLevel = Codegen.stringProp("logCollectionLevel").arg($.logCollectionLevel).def("Error").getNullable();
            $.transferConfiguration = Objects.requireNonNull($.transferConfiguration, "expected parameter 'transferConfiguration' to be non-null");
            return $;
        }
    }

}
