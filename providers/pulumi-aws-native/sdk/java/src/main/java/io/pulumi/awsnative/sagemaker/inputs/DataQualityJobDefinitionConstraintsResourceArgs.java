// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The baseline constraints resource for a monitoring job.
 * 
 */
public final class DataQualityJobDefinitionConstraintsResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataQualityJobDefinitionConstraintsResourceArgs Empty = new DataQualityJobDefinitionConstraintsResourceArgs();

    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    @InputImport(name="s3Uri")
      private final @Nullable Input<String> s3Uri;

    public Input<String> getS3Uri() {
        return this.s3Uri == null ? Input.empty() : this.s3Uri;
    }

    public DataQualityJobDefinitionConstraintsResourceArgs(@Nullable Input<String> s3Uri) {
        this.s3Uri = s3Uri;
    }

    private DataQualityJobDefinitionConstraintsResourceArgs() {
        this.s3Uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataQualityJobDefinitionConstraintsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(DataQualityJobDefinitionConstraintsResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder s3Uri(@Nullable Input<String> s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }

        public Builder s3Uri(@Nullable String s3Uri) {
            this.s3Uri = Input.ofNullable(s3Uri);
            return this;
        }
        public DataQualityJobDefinitionConstraintsResourceArgs build() {
            return new DataQualityJobDefinitionConstraintsResourceArgs(s3Uri);
        }
    }
}
