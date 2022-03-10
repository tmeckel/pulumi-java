// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.inputs;

import io.pulumi.aws.timestreamwrite.inputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs Empty = new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs();

    /**
     * Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     * 
     */
    @InputImport(name="s3Configuration")
      private final @Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs> s3Configuration;

    public Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs> getS3Configuration() {
        return this.s3Configuration == null ? Input.empty() : this.s3Configuration;
    }

    public TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs(@Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs> s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    private TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs() {
        this.s3Configuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs> s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder s3Configuration(@Nullable Input<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs> s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }

        public Builder s3Configuration(@Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3ConfigurationArgs s3Configuration) {
            this.s3Configuration = Input.ofNullable(s3Configuration);
            return this;
        }
        public TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs build() {
            return new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationArgs(s3Configuration);
        }
    }
}
