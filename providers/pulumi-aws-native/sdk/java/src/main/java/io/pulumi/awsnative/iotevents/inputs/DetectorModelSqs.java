// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorModelSqs extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelSqs Empty = new DetectorModelSqs();

    @InputImport(name="payload")
      private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> getPayload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    /**
     * The URL of the SQS queue where the data is written.
     * 
     */
    @InputImport(name="queueUrl", required=true)
      private final String queueUrl;

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * Set this to `TRUE` if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set this to `FALSE`.
     * 
     */
    @InputImport(name="useBase64")
      private final @Nullable Boolean useBase64;

    public Optional<Boolean> getUseBase64() {
        return this.useBase64 == null ? Optional.empty() : Optional.ofNullable(this.useBase64);
    }

    public DetectorModelSqs(
        @Nullable DetectorModelPayload payload,
        String queueUrl,
        @Nullable Boolean useBase64) {
        this.payload = payload;
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
        this.useBase64 = useBase64;
    }

    private DetectorModelSqs() {
        this.payload = null;
        this.queueUrl = null;
        this.useBase64 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSqs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelPayload payload;
        private String queueUrl;
        private @Nullable Boolean useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSqs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.queueUrl = defaults.queueUrl;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder useBase64(@Nullable Boolean useBase64) {
            this.useBase64 = useBase64;
            return this;
        }
        public DetectorModelSqs build() {
            return new DetectorModelSqs(payload, queueUrl, useBase64);
        }
    }
}
