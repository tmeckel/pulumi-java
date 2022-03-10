// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineNotificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineNotificationsArgs Empty = new PipelineNotificationsArgs();

    /**
     * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder has finished processing a job in this pipeline.
     * 
     */
    @InputImport(name="completed")
      private final @Nullable Input<String> completed;

    public Input<String> getCompleted() {
        return this.completed == null ? Input.empty() : this.completed;
    }

    /**
     * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters an error condition while processing a job in this pipeline.
     * 
     */
    @InputImport(name="error")
      private final @Nullable Input<String> error;

    public Input<String> getError() {
        return this.error == null ? Input.empty() : this.error;
    }

    /**
     * The topic ARN for the Amazon Simple Notification Service (Amazon SNS) topic that you want to notify when Elastic Transcoder has started to process a job in this pipeline.
     * 
     */
    @InputImport(name="progressing")
      private final @Nullable Input<String> progressing;

    public Input<String> getProgressing() {
        return this.progressing == null ? Input.empty() : this.progressing;
    }

    /**
     * The topic ARN for the Amazon SNS topic that you want to notify when Elastic Transcoder encounters a warning condition while processing a job in this pipeline.
     * 
     */
    @InputImport(name="warning")
      private final @Nullable Input<String> warning;

    public Input<String> getWarning() {
        return this.warning == null ? Input.empty() : this.warning;
    }

    public PipelineNotificationsArgs(
        @Nullable Input<String> completed,
        @Nullable Input<String> error,
        @Nullable Input<String> progressing,
        @Nullable Input<String> warning) {
        this.completed = completed;
        this.error = error;
        this.progressing = progressing;
        this.warning = warning;
    }

    private PipelineNotificationsArgs() {
        this.completed = Input.empty();
        this.error = Input.empty();
        this.progressing = Input.empty();
        this.warning = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> completed;
        private @Nullable Input<String> error;
        private @Nullable Input<String> progressing;
        private @Nullable Input<String> warning;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineNotificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completed = defaults.completed;
    	      this.error = defaults.error;
    	      this.progressing = defaults.progressing;
    	      this.warning = defaults.warning;
        }

        public Builder completed(@Nullable Input<String> completed) {
            this.completed = completed;
            return this;
        }

        public Builder completed(@Nullable String completed) {
            this.completed = Input.ofNullable(completed);
            return this;
        }

        public Builder error(@Nullable Input<String> error) {
            this.error = error;
            return this;
        }

        public Builder error(@Nullable String error) {
            this.error = Input.ofNullable(error);
            return this;
        }

        public Builder progressing(@Nullable Input<String> progressing) {
            this.progressing = progressing;
            return this;
        }

        public Builder progressing(@Nullable String progressing) {
            this.progressing = Input.ofNullable(progressing);
            return this;
        }

        public Builder warning(@Nullable Input<String> warning) {
            this.warning = warning;
            return this;
        }

        public Builder warning(@Nullable String warning) {
            this.warning = Input.ofNullable(warning);
            return this;
        }
        public PipelineNotificationsArgs build() {
            return new PipelineNotificationsArgs(completed, error, progressing, warning);
        }
    }
}
