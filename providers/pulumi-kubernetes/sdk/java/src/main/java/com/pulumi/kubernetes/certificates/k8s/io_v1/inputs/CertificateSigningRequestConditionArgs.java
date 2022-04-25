// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.certificates.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
 * 
 */
public final class CertificateSigningRequestConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateSigningRequestConditionArgs Empty = new CertificateSigningRequestConditionArgs();

    /**
     * lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
     * 
     */
    @Import(name="lastTransitionTime")
    private @Nullable Output<String> lastTransitionTime;

    /**
     * @return lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
     * 
     */
    public Optional<Output<String>> lastTransitionTime() {
        return Optional.ofNullable(this.lastTransitionTime);
    }

    /**
     * lastUpdateTime is the time of the last update to this condition
     * 
     */
    @Import(name="lastUpdateTime")
    private @Nullable Output<String> lastUpdateTime;

    /**
     * @return lastUpdateTime is the time of the last update to this condition
     * 
     */
    public Optional<Output<String>> lastUpdateTime() {
        return Optional.ofNullable(this.lastUpdateTime);
    }

    /**
     * message contains a human readable message with details about the request state
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return message contains a human readable message with details about the request state
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * reason indicates a brief reason for the request state
     * 
     */
    @Import(name="reason")
    private @Nullable Output<String> reason;

    /**
     * @return reason indicates a brief reason for the request state
     * 
     */
    public Optional<Output<String>> reason() {
        return Optional.ofNullable(this.reason);
    }

    /**
     * status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
     * 
     * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
     * 
     * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
     * 
     * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
     * 
     * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
     * 
     * Only one condition of a given type is allowed.
     * 
     * Possible enum values:
     *  - `&#34;Approved&#34;` Approved indicates the request was approved and should be issued by the signer.
     *  - `&#34;Denied&#34;` Denied indicates the request was denied and should not be issued by the signer.
     *  - `&#34;Failed&#34;` Failed indicates the signer failed to issue the certificate.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
     * 
     * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
     * 
     * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
     * 
     * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
     * 
     * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
     * 
     * Only one condition of a given type is allowed.
     * 
     * Possible enum values:
     *  - `&#34;Approved&#34;` Approved indicates the request was approved and should be issued by the signer.
     *  - `&#34;Denied&#34;` Denied indicates the request was denied and should not be issued by the signer.
     *  - `&#34;Failed&#34;` Failed indicates the signer failed to issue the certificate.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private CertificateSigningRequestConditionArgs() {}

    private CertificateSigningRequestConditionArgs(CertificateSigningRequestConditionArgs $) {
        this.lastTransitionTime = $.lastTransitionTime;
        this.lastUpdateTime = $.lastUpdateTime;
        this.message = $.message;
        this.reason = $.reason;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateSigningRequestConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateSigningRequestConditionArgs $;

        public Builder() {
            $ = new CertificateSigningRequestConditionArgs();
        }

        public Builder(CertificateSigningRequestConditionArgs defaults) {
            $ = new CertificateSigningRequestConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastTransitionTime lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(@Nullable Output<String> lastTransitionTime) {
            $.lastTransitionTime = lastTransitionTime;
            return this;
        }

        /**
         * @param lastTransitionTime lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time.
         * 
         * @return builder
         * 
         */
        public Builder lastTransitionTime(String lastTransitionTime) {
            return lastTransitionTime(Output.of(lastTransitionTime));
        }

        /**
         * @param lastUpdateTime lastUpdateTime is the time of the last update to this condition
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(@Nullable Output<String> lastUpdateTime) {
            $.lastUpdateTime = lastUpdateTime;
            return this;
        }

        /**
         * @param lastUpdateTime lastUpdateTime is the time of the last update to this condition
         * 
         * @return builder
         * 
         */
        public Builder lastUpdateTime(String lastUpdateTime) {
            return lastUpdateTime(Output.of(lastUpdateTime));
        }

        /**
         * @param message message contains a human readable message with details about the request state
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message message contains a human readable message with details about the request state
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param reason reason indicates a brief reason for the request state
         * 
         * @return builder
         * 
         */
        public Builder reason(@Nullable Output<String> reason) {
            $.reason = reason;
            return this;
        }

        /**
         * @param reason reason indicates a brief reason for the request state
         * 
         * @return builder
         * 
         */
        public Builder reason(String reason) {
            return reason(Output.of(reason));
        }

        /**
         * @param status status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be &#34;False&#34; or &#34;Unknown&#34;.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param type type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
         * 
         * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
         * 
         * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
         * 
         * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
         * 
         * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
         * 
         * Only one condition of a given type is allowed.
         * 
         * Possible enum values:
         *  - `&#34;Approved&#34;` Approved indicates the request was approved and should be issued by the signer.
         *  - `&#34;Denied&#34;` Denied indicates the request was denied and should not be issued by the signer.
         *  - `&#34;Failed&#34;` Failed indicates the signer failed to issue the certificate.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type of the condition. Known conditions are &#34;Approved&#34;, &#34;Denied&#34;, and &#34;Failed&#34;.
         * 
         * An &#34;Approved&#34; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.
         * 
         * A &#34;Denied&#34; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.
         * 
         * A &#34;Failed&#34; condition is added via the /status subresource, indicating the signer failed to issue the certificate.
         * 
         * Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.
         * 
         * Only one condition of a given type is allowed.
         * 
         * Possible enum values:
         *  - `&#34;Approved&#34;` Approved indicates the request was approved and should be issued by the signer.
         *  - `&#34;Denied&#34;` Denied indicates the request was denied and should not be issued by the signer.
         *  - `&#34;Failed&#34;` Failed indicates the signer failed to issue the certificate.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CertificateSigningRequestConditionArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
