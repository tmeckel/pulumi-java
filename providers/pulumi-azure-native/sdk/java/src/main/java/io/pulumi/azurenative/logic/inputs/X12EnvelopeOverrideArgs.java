// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.X12DateFormat;
import io.pulumi.azurenative.logic.enums.X12TimeFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The X12 envelope override settings.
 * 
 */
public final class X12EnvelopeOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12EnvelopeOverrideArgs Empty = new X12EnvelopeOverrideArgs();

    /**
     * The date format.
     * 
     */
    @InputImport(name="dateFormat", required=true)
      private final Input<Either<String,X12DateFormat>> dateFormat;

    public Input<Either<String,X12DateFormat>> getDateFormat() {
        return this.dateFormat;
    }

    /**
     * The functional identifier code.
     * 
     */
    @InputImport(name="functionalIdentifierCode")
      private final @Nullable Input<String> functionalIdentifierCode;

    public Input<String> getFunctionalIdentifierCode() {
        return this.functionalIdentifierCode == null ? Input.empty() : this.functionalIdentifierCode;
    }

    /**
     * The header version.
     * 
     */
    @InputImport(name="headerVersion", required=true)
      private final Input<String> headerVersion;

    public Input<String> getHeaderVersion() {
        return this.headerVersion;
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="messageId", required=true)
      private final Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId;
    }

    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="protocolVersion", required=true)
      private final Input<String> protocolVersion;

    public Input<String> getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The receiver application id.
     * 
     */
    @InputImport(name="receiverApplicationId", required=true)
      private final Input<String> receiverApplicationId;

    public Input<String> getReceiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * The responsible agency code.
     * 
     */
    @InputImport(name="responsibleAgencyCode", required=true)
      private final Input<String> responsibleAgencyCode;

    public Input<String> getResponsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }

    /**
     * The sender application id.
     * 
     */
    @InputImport(name="senderApplicationId", required=true)
      private final Input<String> senderApplicationId;

    public Input<String> getSenderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="targetNamespace", required=true)
      private final Input<String> targetNamespace;

    public Input<String> getTargetNamespace() {
        return this.targetNamespace;
    }

    /**
     * The time format.
     * 
     */
    @InputImport(name="timeFormat", required=true)
      private final Input<Either<String,X12TimeFormat>> timeFormat;

    public Input<Either<String,X12TimeFormat>> getTimeFormat() {
        return this.timeFormat;
    }

    public X12EnvelopeOverrideArgs(
        Input<Either<String,X12DateFormat>> dateFormat,
        @Nullable Input<String> functionalIdentifierCode,
        Input<String> headerVersion,
        Input<String> messageId,
        Input<String> protocolVersion,
        Input<String> receiverApplicationId,
        Input<String> responsibleAgencyCode,
        Input<String> senderApplicationId,
        Input<String> targetNamespace,
        Input<Either<String,X12TimeFormat>> timeFormat) {
        this.dateFormat = Objects.requireNonNull(dateFormat, "expected parameter 'dateFormat' to be non-null");
        this.functionalIdentifierCode = functionalIdentifierCode;
        this.headerVersion = Objects.requireNonNull(headerVersion, "expected parameter 'headerVersion' to be non-null");
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.protocolVersion = Objects.requireNonNull(protocolVersion, "expected parameter 'protocolVersion' to be non-null");
        this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId, "expected parameter 'receiverApplicationId' to be non-null");
        this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode, "expected parameter 'responsibleAgencyCode' to be non-null");
        this.senderApplicationId = Objects.requireNonNull(senderApplicationId, "expected parameter 'senderApplicationId' to be non-null");
        this.targetNamespace = Objects.requireNonNull(targetNamespace, "expected parameter 'targetNamespace' to be non-null");
        this.timeFormat = Objects.requireNonNull(timeFormat, "expected parameter 'timeFormat' to be non-null");
    }

    private X12EnvelopeOverrideArgs() {
        this.dateFormat = Input.empty();
        this.functionalIdentifierCode = Input.empty();
        this.headerVersion = Input.empty();
        this.messageId = Input.empty();
        this.protocolVersion = Input.empty();
        this.receiverApplicationId = Input.empty();
        this.responsibleAgencyCode = Input.empty();
        this.senderApplicationId = Input.empty();
        this.targetNamespace = Input.empty();
        this.timeFormat = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12EnvelopeOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,X12DateFormat>> dateFormat;
        private @Nullable Input<String> functionalIdentifierCode;
        private Input<String> headerVersion;
        private Input<String> messageId;
        private Input<String> protocolVersion;
        private Input<String> receiverApplicationId;
        private Input<String> responsibleAgencyCode;
        private Input<String> senderApplicationId;
        private Input<String> targetNamespace;
        private Input<Either<String,X12TimeFormat>> timeFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(X12EnvelopeOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.functionalIdentifierCode = defaults.functionalIdentifierCode;
    	      this.headerVersion = defaults.headerVersion;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.responsibleAgencyCode = defaults.responsibleAgencyCode;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.timeFormat = defaults.timeFormat;
        }

        public Builder dateFormat(Input<Either<String,X12DateFormat>> dateFormat) {
            this.dateFormat = Objects.requireNonNull(dateFormat);
            return this;
        }

        public Builder dateFormat(Either<String,X12DateFormat> dateFormat) {
            this.dateFormat = Input.of(Objects.requireNonNull(dateFormat));
            return this;
        }

        public Builder functionalIdentifierCode(@Nullable Input<String> functionalIdentifierCode) {
            this.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        public Builder functionalIdentifierCode(@Nullable String functionalIdentifierCode) {
            this.functionalIdentifierCode = Input.ofNullable(functionalIdentifierCode);
            return this;
        }

        public Builder headerVersion(Input<String> headerVersion) {
            this.headerVersion = Objects.requireNonNull(headerVersion);
            return this;
        }

        public Builder headerVersion(String headerVersion) {
            this.headerVersion = Input.of(Objects.requireNonNull(headerVersion));
            return this;
        }

        public Builder messageId(Input<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder messageId(String messageId) {
            this.messageId = Input.of(Objects.requireNonNull(messageId));
            return this;
        }

        public Builder protocolVersion(Input<String> protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder protocolVersion(String protocolVersion) {
            this.protocolVersion = Input.of(Objects.requireNonNull(protocolVersion));
            return this;
        }

        public Builder receiverApplicationId(Input<String> receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }

        public Builder receiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Input.of(Objects.requireNonNull(receiverApplicationId));
            return this;
        }

        public Builder responsibleAgencyCode(Input<String> responsibleAgencyCode) {
            this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode);
            return this;
        }

        public Builder responsibleAgencyCode(String responsibleAgencyCode) {
            this.responsibleAgencyCode = Input.of(Objects.requireNonNull(responsibleAgencyCode));
            return this;
        }

        public Builder senderApplicationId(Input<String> senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }

        public Builder senderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Input.of(Objects.requireNonNull(senderApplicationId));
            return this;
        }

        public Builder targetNamespace(Input<String> targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }

        public Builder targetNamespace(String targetNamespace) {
            this.targetNamespace = Input.of(Objects.requireNonNull(targetNamespace));
            return this;
        }

        public Builder timeFormat(Input<Either<String,X12TimeFormat>> timeFormat) {
            this.timeFormat = Objects.requireNonNull(timeFormat);
            return this;
        }

        public Builder timeFormat(Either<String,X12TimeFormat> timeFormat) {
            this.timeFormat = Input.of(Objects.requireNonNull(timeFormat));
            return this;
        }
        public X12EnvelopeOverrideArgs build() {
            return new X12EnvelopeOverrideArgs(dateFormat, functionalIdentifierCode, headerVersion, messageId, protocolVersion, receiverApplicationId, responsibleAgencyCode, senderApplicationId, targetNamespace, timeFormat);
        }
    }
}
