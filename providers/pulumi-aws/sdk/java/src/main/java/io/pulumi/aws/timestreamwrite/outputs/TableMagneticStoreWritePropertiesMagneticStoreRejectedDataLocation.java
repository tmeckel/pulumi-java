// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.timestreamwrite.outputs;

import io.pulumi.aws.timestreamwrite.outputs.TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation {
    /**
     * Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     * 
     */
    private final @Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration s3Configuration;

    @OutputCustomType.Constructor
    private TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation(@OutputCustomType.Parameter("s3Configuration") @Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * Configuration of an S3 location to write error reports for records rejected, asynchronously, during magnetic store writes. See S3 Configuration below for more details.
     * 
    */
    public Optional<TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration> getS3Configuration() {
        return Optional.ofNullable(this.s3Configuration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder s3Configuration(@Nullable TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocationS3Configuration s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }
        public TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation build() {
            return new TableMagneticStoreWritePropertiesMagneticStoreRejectedDataLocation(s3Configuration);
        }
    }
}
