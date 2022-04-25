// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the input for dtmf event.
 * 
 */
public final class GoogleCloudDialogflowCxV3DtmfInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3DtmfInputArgs Empty = new GoogleCloudDialogflowCxV3DtmfInputArgs();

    /**
     * The dtmf digits.
     * 
     */
    @Import(name="digits")
    private @Nullable Output<String> digits;

    /**
     * @return The dtmf digits.
     * 
     */
    public Optional<Output<String>> digits() {
        return Optional.ofNullable(this.digits);
    }

    /**
     * The finish digit (if any).
     * 
     */
    @Import(name="finishDigit")
    private @Nullable Output<String> finishDigit;

    /**
     * @return The finish digit (if any).
     * 
     */
    public Optional<Output<String>> finishDigit() {
        return Optional.ofNullable(this.finishDigit);
    }

    private GoogleCloudDialogflowCxV3DtmfInputArgs() {}

    private GoogleCloudDialogflowCxV3DtmfInputArgs(GoogleCloudDialogflowCxV3DtmfInputArgs $) {
        this.digits = $.digits;
        this.finishDigit = $.finishDigit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3DtmfInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3DtmfInputArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3DtmfInputArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3DtmfInputArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3DtmfInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param digits The dtmf digits.
         * 
         * @return builder
         * 
         */
        public Builder digits(@Nullable Output<String> digits) {
            $.digits = digits;
            return this;
        }

        /**
         * @param digits The dtmf digits.
         * 
         * @return builder
         * 
         */
        public Builder digits(String digits) {
            return digits(Output.of(digits));
        }

        /**
         * @param finishDigit The finish digit (if any).
         * 
         * @return builder
         * 
         */
        public Builder finishDigit(@Nullable Output<String> finishDigit) {
            $.finishDigit = finishDigit;
            return this;
        }

        /**
         * @param finishDigit The finish digit (if any).
         * 
         * @return builder
         * 
         */
        public Builder finishDigit(String finishDigit) {
            return finishDigit(Output.of(finishDigit));
        }

        public GoogleCloudDialogflowCxV3DtmfInputArgs build() {
            return $;
        }
    }

}
