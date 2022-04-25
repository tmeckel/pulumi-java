// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LeaveUntransformedResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ThrowErrorResponse;
import java.util.Objects;


/**
 * How to handle transformation errors during de-identification. A transformation error occurs when the requested transformation is incompatible with the data. For example, trying to de-identify an IP address using a `DateShift` transformation would result in a transformation error, since date info cannot be extracted from an IP address. Information about any incompatible transformations, and how they were handled, is returned in the response as part of the `TransformationOverviews`.
 * 
 */
public final class GooglePrivacyDlpV2TransformationErrorHandlingResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TransformationErrorHandlingResponse Empty = new GooglePrivacyDlpV2TransformationErrorHandlingResponse();

    /**
     * Ignore errors
     * 
     */
    @Import(name="leaveUntransformed", required=true)
    private GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed;

    /**
     * @return Ignore errors
     * 
     */
    public GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed() {
        return this.leaveUntransformed;
    }

    /**
     * Throw an error
     * 
     */
    @Import(name="throwError", required=true)
    private GooglePrivacyDlpV2ThrowErrorResponse throwError;

    /**
     * @return Throw an error
     * 
     */
    public GooglePrivacyDlpV2ThrowErrorResponse throwError() {
        return this.throwError;
    }

    private GooglePrivacyDlpV2TransformationErrorHandlingResponse() {}

    private GooglePrivacyDlpV2TransformationErrorHandlingResponse(GooglePrivacyDlpV2TransformationErrorHandlingResponse $) {
        this.leaveUntransformed = $.leaveUntransformed;
        this.throwError = $.throwError;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2TransformationErrorHandlingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2TransformationErrorHandlingResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2TransformationErrorHandlingResponse();
        }

        public Builder(GooglePrivacyDlpV2TransformationErrorHandlingResponse defaults) {
            $ = new GooglePrivacyDlpV2TransformationErrorHandlingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param leaveUntransformed Ignore errors
         * 
         * @return builder
         * 
         */
        public Builder leaveUntransformed(GooglePrivacyDlpV2LeaveUntransformedResponse leaveUntransformed) {
            $.leaveUntransformed = leaveUntransformed;
            return this;
        }

        /**
         * @param throwError Throw an error
         * 
         * @return builder
         * 
         */
        public Builder throwError(GooglePrivacyDlpV2ThrowErrorResponse throwError) {
            $.throwError = throwError;
            return this;
        }

        public GooglePrivacyDlpV2TransformationErrorHandlingResponse build() {
            $.leaveUntransformed = Objects.requireNonNull($.leaveUntransformed, "expected parameter 'leaveUntransformed' to be non-null");
            $.throwError = Objects.requireNonNull($.throwError, "expected parameter 'throwError' to be non-null");
            return $;
        }
    }

}
