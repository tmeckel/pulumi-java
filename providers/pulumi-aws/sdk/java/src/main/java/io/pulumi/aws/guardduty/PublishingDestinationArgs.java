// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublishingDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublishingDestinationArgs Empty = new PublishingDestinationArgs();

    /**
     * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    @Import(name="destinationArn", required=true)
      private final Output<String> destinationArn;

    public Output<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * Currently there is only "S3" available as destination type which is also the default value
     * 
     */
    @Import(name="destinationType")
      private final @Nullable Output<String> destinationType;

    public Output<String> getDestinationType() {
        return this.destinationType == null ? Codegen.empty() : this.destinationType;
    }

    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Import(name="detectorId", required=true)
      private final Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    @Import(name="kmsKeyArn", required=true)
      private final Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public PublishingDestinationArgs(
        Output<String> destinationArn,
        @Nullable Output<String> destinationType,
        Output<String> detectorId,
        Output<String> kmsKeyArn) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.destinationType = destinationType;
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
    }

    private PublishingDestinationArgs() {
        this.destinationArn = Codegen.empty();
        this.destinationType = Codegen.empty();
        this.detectorId = Codegen.empty();
        this.kmsKeyArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishingDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationArn;
        private @Nullable Output<String> destinationType;
        private Output<String> detectorId;
        private Output<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishingDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.destinationType = defaults.destinationType;
    	      this.detectorId = defaults.detectorId;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder destinationArn(Output<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }
        public Builder destinationArn(String destinationArn) {
            this.destinationArn = Output.of(Objects.requireNonNull(destinationArn));
            return this;
        }
        public Builder destinationType(@Nullable Output<String> destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public Builder destinationType(@Nullable String destinationType) {
            this.destinationType = Codegen.ofNullable(destinationType);
            return this;
        }
        public Builder detectorId(Output<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }
        public Builder detectorId(String detectorId) {
            this.detectorId = Output.of(Objects.requireNonNull(detectorId));
            return this;
        }
        public Builder kmsKeyArn(Output<String> kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Output.of(Objects.requireNonNull(kmsKeyArn));
            return this;
        }        public PublishingDestinationArgs build() {
            return new PublishingDestinationArgs(destinationArn, destinationType, detectorId, kmsKeyArn);
        }
    }
}
