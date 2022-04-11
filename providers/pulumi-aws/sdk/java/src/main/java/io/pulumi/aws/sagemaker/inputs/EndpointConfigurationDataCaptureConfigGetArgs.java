// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs;
import io.pulumi.aws.sagemaker.inputs.EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationDataCaptureConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationDataCaptureConfigGetArgs Empty = new EndpointConfigurationDataCaptureConfigGetArgs();

    /**
     * The content type headers to capture. Fields are documented below.
     * 
     */
    @Import(name="captureContentTypeHeader")
      private final @Nullable Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs> captureContentTypeHeader;

    public Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs> getCaptureContentTypeHeader() {
        return this.captureContentTypeHeader == null ? Codegen.empty() : this.captureContentTypeHeader;
    }

    /**
     * Specifies what data to capture. Fields are documented below.
     * 
     */
    @Import(name="captureOptions", required=true)
      private final Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs>> captureOptions;

    public Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs>> getCaptureOptions() {
        return this.captureOptions;
    }

    /**
     * The URL for S3 location where the captured data is stored.
     * 
     */
    @Import(name="destinationS3Uri", required=true)
      private final Output<String> destinationS3Uri;

    public Output<String> getDestinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * Flag to enable data capture. Defaults to `false`.
     * 
     */
    @Import(name="enableCapture")
      private final @Nullable Output<Boolean> enableCapture;

    public Output<Boolean> getEnableCapture() {
        return this.enableCapture == null ? Codegen.empty() : this.enableCapture;
    }

    /**
     * Portion of data to capture. Should be between 0 and 100.
     * 
     */
    @Import(name="initialSamplingPercentage", required=true)
      private final Output<Integer> initialSamplingPercentage;

    public Output<Integer> getInitialSamplingPercentage() {
        return this.initialSamplingPercentage;
    }

    /**
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt the asynchronous inference output in Amazon S3.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    public EndpointConfigurationDataCaptureConfigGetArgs(
        @Nullable Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs> captureContentTypeHeader,
        Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs>> captureOptions,
        Output<String> destinationS3Uri,
        @Nullable Output<Boolean> enableCapture,
        Output<Integer> initialSamplingPercentage,
        @Nullable Output<String> kmsKeyId) {
        this.captureContentTypeHeader = captureContentTypeHeader;
        this.captureOptions = Objects.requireNonNull(captureOptions, "expected parameter 'captureOptions' to be non-null");
        this.destinationS3Uri = Objects.requireNonNull(destinationS3Uri, "expected parameter 'destinationS3Uri' to be non-null");
        this.enableCapture = enableCapture;
        this.initialSamplingPercentage = Objects.requireNonNull(initialSamplingPercentage, "expected parameter 'initialSamplingPercentage' to be non-null");
        this.kmsKeyId = kmsKeyId;
    }

    private EndpointConfigurationDataCaptureConfigGetArgs() {
        this.captureContentTypeHeader = Codegen.empty();
        this.captureOptions = Codegen.empty();
        this.destinationS3Uri = Codegen.empty();
        this.enableCapture = Codegen.empty();
        this.initialSamplingPercentage = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationDataCaptureConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs> captureContentTypeHeader;
        private Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs>> captureOptions;
        private Output<String> destinationS3Uri;
        private @Nullable Output<Boolean> enableCapture;
        private Output<Integer> initialSamplingPercentage;
        private @Nullable Output<String> kmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationDataCaptureConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureContentTypeHeader = defaults.captureContentTypeHeader;
    	      this.captureOptions = defaults.captureOptions;
    	      this.destinationS3Uri = defaults.destinationS3Uri;
    	      this.enableCapture = defaults.enableCapture;
    	      this.initialSamplingPercentage = defaults.initialSamplingPercentage;
    	      this.kmsKeyId = defaults.kmsKeyId;
        }

        public Builder captureContentTypeHeader(@Nullable Output<EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs> captureContentTypeHeader) {
            this.captureContentTypeHeader = captureContentTypeHeader;
            return this;
        }
        public Builder captureContentTypeHeader(@Nullable EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs captureContentTypeHeader) {
            this.captureContentTypeHeader = Codegen.ofNullable(captureContentTypeHeader);
            return this;
        }
        public Builder captureOptions(Output<List<EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs>> captureOptions) {
            this.captureOptions = Objects.requireNonNull(captureOptions);
            return this;
        }
        public Builder captureOptions(List<EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs> captureOptions) {
            this.captureOptions = Output.of(Objects.requireNonNull(captureOptions));
            return this;
        }
        public Builder captureOptions(EndpointConfigurationDataCaptureConfigCaptureOptionGetArgs... captureOptions) {
            return captureOptions(List.of(captureOptions));
        }
        public Builder destinationS3Uri(Output<String> destinationS3Uri) {
            this.destinationS3Uri = Objects.requireNonNull(destinationS3Uri);
            return this;
        }
        public Builder destinationS3Uri(String destinationS3Uri) {
            this.destinationS3Uri = Output.of(Objects.requireNonNull(destinationS3Uri));
            return this;
        }
        public Builder enableCapture(@Nullable Output<Boolean> enableCapture) {
            this.enableCapture = enableCapture;
            return this;
        }
        public Builder enableCapture(@Nullable Boolean enableCapture) {
            this.enableCapture = Codegen.ofNullable(enableCapture);
            return this;
        }
        public Builder initialSamplingPercentage(Output<Integer> initialSamplingPercentage) {
            this.initialSamplingPercentage = Objects.requireNonNull(initialSamplingPercentage);
            return this;
        }
        public Builder initialSamplingPercentage(Integer initialSamplingPercentage) {
            this.initialSamplingPercentage = Output.of(Objects.requireNonNull(initialSamplingPercentage));
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }        public EndpointConfigurationDataCaptureConfigGetArgs build() {
            return new EndpointConfigurationDataCaptureConfigGetArgs(captureContentTypeHeader, captureOptions, destinationS3Uri, enableCapture, initialSamplingPercentage, kmsKeyId);
        }
    }
}
