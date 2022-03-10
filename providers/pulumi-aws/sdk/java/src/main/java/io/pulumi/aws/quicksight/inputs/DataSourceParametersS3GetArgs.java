// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.aws.quicksight.inputs.DataSourceParametersS3ManifestFileLocationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class DataSourceParametersS3GetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersS3GetArgs Empty = new DataSourceParametersS3GetArgs();

    /**
     * An object containing the S3 location of the S3 manifest file.
     * 
     */
    @InputImport(name="manifestFileLocation", required=true)
      private final Input<DataSourceParametersS3ManifestFileLocationGetArgs> manifestFileLocation;

    public Input<DataSourceParametersS3ManifestFileLocationGetArgs> getManifestFileLocation() {
        return this.manifestFileLocation;
    }

    public DataSourceParametersS3GetArgs(Input<DataSourceParametersS3ManifestFileLocationGetArgs> manifestFileLocation) {
        this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation, "expected parameter 'manifestFileLocation' to be non-null");
    }

    private DataSourceParametersS3GetArgs() {
        this.manifestFileLocation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersS3GetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DataSourceParametersS3ManifestFileLocationGetArgs> manifestFileLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersS3GetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manifestFileLocation = defaults.manifestFileLocation;
        }

        public Builder manifestFileLocation(Input<DataSourceParametersS3ManifestFileLocationGetArgs> manifestFileLocation) {
            this.manifestFileLocation = Objects.requireNonNull(manifestFileLocation);
            return this;
        }

        public Builder manifestFileLocation(DataSourceParametersS3ManifestFileLocationGetArgs manifestFileLocation) {
            this.manifestFileLocation = Input.of(Objects.requireNonNull(manifestFileLocation));
            return this;
        }
        public DataSourceParametersS3GetArgs build() {
            return new DataSourceParametersS3GetArgs(manifestFileLocation);
        }
    }
}
