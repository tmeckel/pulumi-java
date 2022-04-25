// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.timestreamwrite.inputs;

import com.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs Empty = new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs();

    /**
     * Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     * 
     */
    @Import(name="s3Configuration")
    private @Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationGetArgs> s3Configuration;

    /**
     * @return Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     * 
     */
    public Optional<Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationGetArgs>> s3Configuration() {
        return Optional.ofNullable(this.s3Configuration);
    }

    private TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs() {}

    private TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs $) {
        this.s3Configuration = $.s3Configuration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs $;

        public Builder() {
            $ = new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs();
        }

        public Builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs defaults) {
            $ = new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param s3Configuration Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder s3Configuration(@Nullable Output<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationGetArgs> s3Configuration) {
            $.s3Configuration = s3Configuration;
            return this;
        }

        /**
         * @param s3Configuration Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
         * 
         * @return builder
         * 
         */
        public Builder s3Configuration(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationGetArgs s3Configuration) {
            return s3Configuration(Output.of(s3Configuration));
        }

        public TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationGetArgs build() {
            return $;
        }
    }

}
