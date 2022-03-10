// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorModelSqsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelSqsArgs Empty = new DetectorModelSqsArgs();

    @InputImport(name="payload")
      private final @Nullable Input<DetectorModelPayloadArgs> payload;

    public Input<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    /**
     * The URL of the SQS queue where the data is written.
     * 
     */
    @InputImport(name="queueUrl", required=true)
      private final Input<String> queueUrl;

    public Input<String> getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * Set this to `TRUE` if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set this to `FALSE`.
     * 
     */
    @InputImport(name="useBase64")
      private final @Nullable Input<Boolean> useBase64;

    public Input<Boolean> getUseBase64() {
        return this.useBase64 == null ? Input.empty() : this.useBase64;
    }

    public DetectorModelSqsArgs(
        @Nullable Input<DetectorModelPayloadArgs> payload,
        Input<String> queueUrl,
        @Nullable Input<Boolean> useBase64) {
        this.payload = payload;
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
        this.useBase64 = useBase64;
    }

    private DetectorModelSqsArgs() {
        this.payload = Input.empty();
        this.queueUrl = Input.empty();
        this.useBase64 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSqsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DetectorModelPayloadArgs> payload;
        private Input<String> queueUrl;
        private @Nullable Input<Boolean> useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSqsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.queueUrl = defaults.queueUrl;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder payload(@Nullable Input<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }

        public Builder queueUrl(Input<String> queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Input.of(Objects.requireNonNull(queueUrl));
            return this;
        }

        public Builder useBase64(@Nullable Input<Boolean> useBase64) {
            this.useBase64 = useBase64;
            return this;
        }

        public Builder useBase64(@Nullable Boolean useBase64) {
            this.useBase64 = Input.ofNullable(useBase64);
            return this;
        }
        public DetectorModelSqsArgs build() {
            return new DetectorModelSqsArgs(payload, queueUrl, useBase64);
        }
    }
}
