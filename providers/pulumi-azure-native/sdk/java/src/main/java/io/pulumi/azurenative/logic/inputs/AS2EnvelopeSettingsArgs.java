// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The AS2 agreement envelope settings.
 * 
 */
public final class AS2EnvelopeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2EnvelopeSettingsArgs Empty = new AS2EnvelopeSettingsArgs();

    /**
     * The value indicating whether to auto generate file name.
     * 
     */
    @InputImport(name="autogenerateFileName", required=true)
      private final Input<Boolean> autogenerateFileName;

    public Input<Boolean> getAutogenerateFileName() {
        return this.autogenerateFileName;
    }

    /**
     * The template for file name.
     * 
     */
    @InputImport(name="fileNameTemplate", required=true)
      private final Input<String> fileNameTemplate;

    public Input<String> getFileNameTemplate() {
        return this.fileNameTemplate;
    }

    /**
     * The message content type.
     * 
     */
    @InputImport(name="messageContentType", required=true)
      private final Input<String> messageContentType;

    public Input<String> getMessageContentType() {
        return this.messageContentType;
    }

    /**
     * The value indicating whether to suspend message on file name generation error.
     * 
     */
    @InputImport(name="suspendMessageOnFileNameGenerationError", required=true)
      private final Input<Boolean> suspendMessageOnFileNameGenerationError;

    public Input<Boolean> getSuspendMessageOnFileNameGenerationError() {
        return this.suspendMessageOnFileNameGenerationError;
    }

    /**
     * The value indicating whether to transmit file name in mime header.
     * 
     */
    @InputImport(name="transmitFileNameInMimeHeader", required=true)
      private final Input<Boolean> transmitFileNameInMimeHeader;

    public Input<Boolean> getTransmitFileNameInMimeHeader() {
        return this.transmitFileNameInMimeHeader;
    }

    public AS2EnvelopeSettingsArgs(
        Input<Boolean> autogenerateFileName,
        Input<String> fileNameTemplate,
        Input<String> messageContentType,
        Input<Boolean> suspendMessageOnFileNameGenerationError,
        Input<Boolean> transmitFileNameInMimeHeader) {
        this.autogenerateFileName = Objects.requireNonNull(autogenerateFileName, "expected parameter 'autogenerateFileName' to be non-null");
        this.fileNameTemplate = Objects.requireNonNull(fileNameTemplate, "expected parameter 'fileNameTemplate' to be non-null");
        this.messageContentType = Objects.requireNonNull(messageContentType, "expected parameter 'messageContentType' to be non-null");
        this.suspendMessageOnFileNameGenerationError = Objects.requireNonNull(suspendMessageOnFileNameGenerationError, "expected parameter 'suspendMessageOnFileNameGenerationError' to be non-null");
        this.transmitFileNameInMimeHeader = Objects.requireNonNull(transmitFileNameInMimeHeader, "expected parameter 'transmitFileNameInMimeHeader' to be non-null");
    }

    private AS2EnvelopeSettingsArgs() {
        this.autogenerateFileName = Input.empty();
        this.fileNameTemplate = Input.empty();
        this.messageContentType = Input.empty();
        this.suspendMessageOnFileNameGenerationError = Input.empty();
        this.transmitFileNameInMimeHeader = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2EnvelopeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> autogenerateFileName;
        private Input<String> fileNameTemplate;
        private Input<String> messageContentType;
        private Input<Boolean> suspendMessageOnFileNameGenerationError;
        private Input<Boolean> transmitFileNameInMimeHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2EnvelopeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autogenerateFileName = defaults.autogenerateFileName;
    	      this.fileNameTemplate = defaults.fileNameTemplate;
    	      this.messageContentType = defaults.messageContentType;
    	      this.suspendMessageOnFileNameGenerationError = defaults.suspendMessageOnFileNameGenerationError;
    	      this.transmitFileNameInMimeHeader = defaults.transmitFileNameInMimeHeader;
        }

        public Builder autogenerateFileName(Input<Boolean> autogenerateFileName) {
            this.autogenerateFileName = Objects.requireNonNull(autogenerateFileName);
            return this;
        }

        public Builder autogenerateFileName(Boolean autogenerateFileName) {
            this.autogenerateFileName = Input.of(Objects.requireNonNull(autogenerateFileName));
            return this;
        }

        public Builder fileNameTemplate(Input<String> fileNameTemplate) {
            this.fileNameTemplate = Objects.requireNonNull(fileNameTemplate);
            return this;
        }

        public Builder fileNameTemplate(String fileNameTemplate) {
            this.fileNameTemplate = Input.of(Objects.requireNonNull(fileNameTemplate));
            return this;
        }

        public Builder messageContentType(Input<String> messageContentType) {
            this.messageContentType = Objects.requireNonNull(messageContentType);
            return this;
        }

        public Builder messageContentType(String messageContentType) {
            this.messageContentType = Input.of(Objects.requireNonNull(messageContentType));
            return this;
        }

        public Builder suspendMessageOnFileNameGenerationError(Input<Boolean> suspendMessageOnFileNameGenerationError) {
            this.suspendMessageOnFileNameGenerationError = Objects.requireNonNull(suspendMessageOnFileNameGenerationError);
            return this;
        }

        public Builder suspendMessageOnFileNameGenerationError(Boolean suspendMessageOnFileNameGenerationError) {
            this.suspendMessageOnFileNameGenerationError = Input.of(Objects.requireNonNull(suspendMessageOnFileNameGenerationError));
            return this;
        }

        public Builder transmitFileNameInMimeHeader(Input<Boolean> transmitFileNameInMimeHeader) {
            this.transmitFileNameInMimeHeader = Objects.requireNonNull(transmitFileNameInMimeHeader);
            return this;
        }

        public Builder transmitFileNameInMimeHeader(Boolean transmitFileNameInMimeHeader) {
            this.transmitFileNameInMimeHeader = Input.of(Objects.requireNonNull(transmitFileNameInMimeHeader));
            return this;
        }
        public AS2EnvelopeSettingsArgs build() {
            return new AS2EnvelopeSettingsArgs(autogenerateFileName, fileNameTemplate, messageContentType, suspendMessageOnFileNameGenerationError, transmitFileNameInMimeHeader);
        }
    }
}
