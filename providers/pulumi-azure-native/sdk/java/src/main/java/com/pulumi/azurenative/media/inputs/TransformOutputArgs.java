// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.OnErrorType;
import com.pulumi.azurenative.media.enums.Priority;
import com.pulumi.azurenative.media.inputs.AudioAnalyzerPresetArgs;
import com.pulumi.azurenative.media.inputs.BuiltInStandardEncoderPresetArgs;
import com.pulumi.azurenative.media.inputs.FaceDetectorPresetArgs;
import com.pulumi.azurenative.media.inputs.StandardEncoderPresetArgs;
import com.pulumi.azurenative.media.inputs.VideoAnalyzerPresetArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of a TransformOutput, which are the rules to be applied while generating the desired output.
 * 
 */
public final class TransformOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransformOutputArgs Empty = new TransformOutputArgs();

    /**
     * A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with &#39;ContinueJob&#39;. The default is &#39;StopProcessingJob&#39;.
     * 
     */
    @Import(name="onError")
    private @Nullable Output<Either<String,OnErrorType>> onError;

    /**
     * @return A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with &#39;ContinueJob&#39;. The default is &#39;StopProcessingJob&#39;.
     * 
     */
    public Optional<Output<Either<String,OnErrorType>>> onError() {
        return Optional.ofNullable(this.onError);
    }

    /**
     * Preset that describes the operations that will be used to modify, transcode, or extract insights from the source file to generate the output.
     * 
     */
    @Import(name="preset", required=true)
    private Output<Object> preset;

    /**
     * @return Preset that describes the operations that will be used to modify, transcode, or extract insights from the source file to generate the output.
     * 
     */
    public Output<Object> preset() {
        return this.preset;
    }

    /**
     * Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     * 
     */
    @Import(name="relativePriority")
    private @Nullable Output<Either<String,Priority>> relativePriority;

    /**
     * @return Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
     * 
     */
    public Optional<Output<Either<String,Priority>>> relativePriority() {
        return Optional.ofNullable(this.relativePriority);
    }

    private TransformOutputArgs() {}

    private TransformOutputArgs(TransformOutputArgs $) {
        this.onError = $.onError;
        this.preset = $.preset;
        this.relativePriority = $.relativePriority;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransformOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransformOutputArgs $;

        public Builder() {
            $ = new TransformOutputArgs();
        }

        public Builder(TransformOutputArgs defaults) {
            $ = new TransformOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onError A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with &#39;ContinueJob&#39;. The default is &#39;StopProcessingJob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder onError(@Nullable Output<Either<String,OnErrorType>> onError) {
            $.onError = onError;
            return this;
        }

        /**
         * @param onError A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with &#39;ContinueJob&#39;. The default is &#39;StopProcessingJob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder onError(Either<String,OnErrorType> onError) {
            return onError(Output.of(onError));
        }

        /**
         * @param onError A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with &#39;ContinueJob&#39;. The default is &#39;StopProcessingJob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder onError(String onError) {
            return onError(Either.ofLeft(onError));
        }

        /**
         * @param onError A Transform can define more than one outputs. This property defines what the service should do when one output fails - either continue to produce other outputs, or, stop the other outputs. The overall Job state will not reflect failures of outputs that are specified with &#39;ContinueJob&#39;. The default is &#39;StopProcessingJob&#39;.
         * 
         * @return builder
         * 
         */
        public Builder onError(OnErrorType onError) {
            return onError(Either.ofRight(onError));
        }

        /**
         * @param preset Preset that describes the operations that will be used to modify, transcode, or extract insights from the source file to generate the output.
         * 
         * @return builder
         * 
         */
        public Builder preset(Output<Object> preset) {
            $.preset = preset;
            return this;
        }

        /**
         * @param preset Preset that describes the operations that will be used to modify, transcode, or extract insights from the source file to generate the output.
         * 
         * @return builder
         * 
         */
        public Builder preset(Object preset) {
            return preset(Output.of(preset));
        }

        /**
         * @param relativePriority Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
         * 
         * @return builder
         * 
         */
        public Builder relativePriority(@Nullable Output<Either<String,Priority>> relativePriority) {
            $.relativePriority = relativePriority;
            return this;
        }

        /**
         * @param relativePriority Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
         * 
         * @return builder
         * 
         */
        public Builder relativePriority(Either<String,Priority> relativePriority) {
            return relativePriority(Output.of(relativePriority));
        }

        /**
         * @param relativePriority Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
         * 
         * @return builder
         * 
         */
        public Builder relativePriority(String relativePriority) {
            return relativePriority(Either.ofLeft(relativePriority));
        }

        /**
         * @param relativePriority Sets the relative priority of the TransformOutputs within a Transform. This sets the priority that the service uses for processing TransformOutputs. The default priority is Normal.
         * 
         * @return builder
         * 
         */
        public Builder relativePriority(Priority relativePriority) {
            return relativePriority(Either.ofRight(relativePriority));
        }

        public TransformOutputArgs build() {
            $.preset = Objects.requireNonNull($.preset, "expected parameter 'preset' to be non-null");
            return $;
        }
    }

}
