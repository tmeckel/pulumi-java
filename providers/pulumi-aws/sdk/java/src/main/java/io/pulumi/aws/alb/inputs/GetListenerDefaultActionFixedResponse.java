// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetListenerDefaultActionFixedResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionFixedResponse Empty = new GetListenerDefaultActionFixedResponse();

    @InputImport(name="contentType", required=true)
      private final String contentType;

    public String getContentType() {
        return this.contentType;
    }

    @InputImport(name="messageBody", required=true)
      private final String messageBody;

    public String getMessageBody() {
        return this.messageBody;
    }

    @InputImport(name="statusCode", required=true)
      private final String statusCode;

    public String getStatusCode() {
        return this.statusCode;
    }

    public GetListenerDefaultActionFixedResponse(
        String contentType,
        String messageBody,
        String statusCode) {
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.messageBody = Objects.requireNonNull(messageBody, "expected parameter 'messageBody' to be non-null");
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private GetListenerDefaultActionFixedResponse() {
        this.contentType = null;
        this.messageBody = null;
        this.statusCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionFixedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String messageBody;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder messageBody(String messageBody) {
            this.messageBody = Objects.requireNonNull(messageBody);
            return this;
        }

        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public GetListenerDefaultActionFixedResponse build() {
            return new GetListenerDefaultActionFixedResponse(contentType, messageBody, statusCode);
        }
    }
}
