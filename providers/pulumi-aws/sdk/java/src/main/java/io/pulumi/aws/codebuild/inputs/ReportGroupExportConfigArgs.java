// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ReportGroupExportConfigS3DestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReportGroupExportConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportGroupExportConfigArgs Empty = new ReportGroupExportConfigArgs();

    /**
     * contains information about the S3 bucket where the run of a report is exported. see S3 Destination documented below.
     * 
     */
    @InputImport(name="s3Destination")
      private final @Nullable Input<ReportGroupExportConfigS3DestinationArgs> s3Destination;

    public Input<ReportGroupExportConfigS3DestinationArgs> getS3Destination() {
        return this.s3Destination == null ? Input.empty() : this.s3Destination;
    }

    /**
     * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ReportGroupExportConfigArgs(
        @Nullable Input<ReportGroupExportConfigS3DestinationArgs> s3Destination,
        Input<String> type) {
        this.s3Destination = s3Destination;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ReportGroupExportConfigArgs() {
        this.s3Destination = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportGroupExportConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ReportGroupExportConfigS3DestinationArgs> s3Destination;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportGroupExportConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Destination = defaults.s3Destination;
    	      this.type = defaults.type;
        }

        public Builder s3Destination(@Nullable Input<ReportGroupExportConfigS3DestinationArgs> s3Destination) {
            this.s3Destination = s3Destination;
            return this;
        }

        public Builder s3Destination(@Nullable ReportGroupExportConfigS3DestinationArgs s3Destination) {
            this.s3Destination = Input.ofNullable(s3Destination);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ReportGroupExportConfigArgs build() {
            return new ReportGroupExportConfigArgs(s3Destination, type);
        }
    }
}
