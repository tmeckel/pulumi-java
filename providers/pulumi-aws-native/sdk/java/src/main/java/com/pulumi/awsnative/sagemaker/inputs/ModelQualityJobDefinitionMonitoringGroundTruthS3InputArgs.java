// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Ground truth input provided in S3
 * 
 */
public final class ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs extends com.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs Empty = new ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs();

    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    @Import(name="s3Uri", required=true)
    private Output<String> s3Uri;

    /**
     * @return A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    public Output<String> s3Uri() {
        return this.s3Uri;
    }

    private ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs() {}

    private ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs(ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs $) {
        this.s3Uri = $.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs $;

        public Builder() {
            $ = new ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs();
        }

        public Builder(ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs defaults) {
            $ = new ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3Uri A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(Output<String> s3Uri) {
            $.s3Uri = s3Uri;
            return this;
        }

        /**
         * @param s3Uri A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
         * 
         * @return builder
         * 
         */
        public Builder s3Uri(String s3Uri) {
            return s3Uri(Output.of(s3Uri));
        }

        public ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs build() {
            $.s3Uri = Objects.requireNonNull($.s3Uri, "expected parameter 's3Uri' to be non-null");
            return $;
        }
    }

}
