// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.enums.TransferConfigurationType;
import com.pulumi.azurenative.databox.inputs.TransferConfigurationTransferAllDetailsArgs;
import com.pulumi.azurenative.databox.inputs.TransferConfigurationTransferFilterDetailsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for defining the transfer of data.
 * 
 */
public final class TransferConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransferConfigurationArgs Empty = new TransferConfigurationArgs();

    /**
     * Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    @Import(name="transferAllDetails")
    private @Nullable Output<TransferConfigurationTransferAllDetailsArgs> transferAllDetails;

    /**
     * @return Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
     * 
     */
    public Optional<Output<TransferConfigurationTransferAllDetailsArgs>> transferAllDetails() {
        return Optional.ofNullable(this.transferAllDetails);
    }

    /**
     * Type of the configuration for transfer.
     * 
     */
    @Import(name="transferConfigurationType", required=true)
    private Output<Either<String,TransferConfigurationType>> transferConfigurationType;

    /**
     * @return Type of the configuration for transfer.
     * 
     */
    public Output<Either<String,TransferConfigurationType>> transferConfigurationType() {
        return this.transferConfigurationType;
    }

    /**
     * Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    @Import(name="transferFilterDetails")
    private @Nullable Output<TransferConfigurationTransferFilterDetailsArgs> transferFilterDetails;

    /**
     * @return Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
     * 
     */
    public Optional<Output<TransferConfigurationTransferFilterDetailsArgs>> transferFilterDetails() {
        return Optional.ofNullable(this.transferFilterDetails);
    }

    private TransferConfigurationArgs() {}

    private TransferConfigurationArgs(TransferConfigurationArgs $) {
        this.transferAllDetails = $.transferAllDetails;
        this.transferConfigurationType = $.transferConfigurationType;
        this.transferFilterDetails = $.transferFilterDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferConfigurationArgs $;

        public Builder() {
            $ = new TransferConfigurationArgs();
        }

        public Builder(TransferConfigurationArgs defaults) {
            $ = new TransferConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param transferAllDetails Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
         * 
         * @return builder
         * 
         */
        public Builder transferAllDetails(@Nullable Output<TransferConfigurationTransferAllDetailsArgs> transferAllDetails) {
            $.transferAllDetails = transferAllDetails;
            return this;
        }

        /**
         * @param transferAllDetails Map of filter type and the details to transfer all data. This field is required only if the TransferConfigurationType is given as TransferAll
         * 
         * @return builder
         * 
         */
        public Builder transferAllDetails(TransferConfigurationTransferAllDetailsArgs transferAllDetails) {
            return transferAllDetails(Output.of(transferAllDetails));
        }

        /**
         * @param transferConfigurationType Type of the configuration for transfer.
         * 
         * @return builder
         * 
         */
        public Builder transferConfigurationType(Output<Either<String,TransferConfigurationType>> transferConfigurationType) {
            $.transferConfigurationType = transferConfigurationType;
            return this;
        }

        /**
         * @param transferConfigurationType Type of the configuration for transfer.
         * 
         * @return builder
         * 
         */
        public Builder transferConfigurationType(Either<String,TransferConfigurationType> transferConfigurationType) {
            return transferConfigurationType(Output.of(transferConfigurationType));
        }

        /**
         * @param transferConfigurationType Type of the configuration for transfer.
         * 
         * @return builder
         * 
         */
        public Builder transferConfigurationType(String transferConfigurationType) {
            return transferConfigurationType(Either.ofLeft(transferConfigurationType));
        }

        /**
         * @param transferConfigurationType Type of the configuration for transfer.
         * 
         * @return builder
         * 
         */
        public Builder transferConfigurationType(TransferConfigurationType transferConfigurationType) {
            return transferConfigurationType(Either.ofRight(transferConfigurationType));
        }

        /**
         * @param transferFilterDetails Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
         * 
         * @return builder
         * 
         */
        public Builder transferFilterDetails(@Nullable Output<TransferConfigurationTransferFilterDetailsArgs> transferFilterDetails) {
            $.transferFilterDetails = transferFilterDetails;
            return this;
        }

        /**
         * @param transferFilterDetails Map of filter type and the details to filter. This field is required only if the TransferConfigurationType is given as TransferUsingFilter.
         * 
         * @return builder
         * 
         */
        public Builder transferFilterDetails(TransferConfigurationTransferFilterDetailsArgs transferFilterDetails) {
            return transferFilterDetails(Output.of(transferFilterDetails));
        }

        public TransferConfigurationArgs build() {
            $.transferConfigurationType = Objects.requireNonNull($.transferConfigurationType, "expected parameter 'transferConfigurationType' to be non-null");
            return $;
        }
    }

}
