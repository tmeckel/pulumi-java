// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowS3InputFormatConfigS3InputFileType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowS3InputFormatConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowS3InputFormatConfigArgs Empty = new FlowS3InputFormatConfigArgs();

    @Import(name="s3InputFileType")
      private final @Nullable Output<FlowS3InputFormatConfigS3InputFileType> s3InputFileType;

    public Output<FlowS3InputFormatConfigS3InputFileType> getS3InputFileType() {
        return this.s3InputFileType == null ? Codegen.empty() : this.s3InputFileType;
    }

    public FlowS3InputFormatConfigArgs(@Nullable Output<FlowS3InputFormatConfigS3InputFileType> s3InputFileType) {
        this.s3InputFileType = s3InputFileType;
    }

    private FlowS3InputFormatConfigArgs() {
        this.s3InputFileType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowS3InputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowS3InputFormatConfigS3InputFileType> s3InputFileType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowS3InputFormatConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3InputFileType = defaults.s3InputFileType;
        }

        public Builder s3InputFileType(@Nullable Output<FlowS3InputFormatConfigS3InputFileType> s3InputFileType) {
            this.s3InputFileType = s3InputFileType;
            return this;
        }
        public Builder s3InputFileType(@Nullable FlowS3InputFormatConfigS3InputFileType s3InputFileType) {
            this.s3InputFileType = Codegen.ofNullable(s3InputFileType);
            return this;
        }        public FlowS3InputFormatConfigArgs build() {
            return new FlowS3InputFormatConfigArgs(s3InputFileType);
        }
    }
}
