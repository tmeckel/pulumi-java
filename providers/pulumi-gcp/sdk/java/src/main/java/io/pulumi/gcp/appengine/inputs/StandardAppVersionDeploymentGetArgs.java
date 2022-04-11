// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentFileGetArgs;
import io.pulumi.gcp.appengine.inputs.StandardAppVersionDeploymentZipGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentGetArgs Empty = new StandardAppVersionDeploymentGetArgs();

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @Import(name="files")
      private final @Nullable Output<List<StandardAppVersionDeploymentFileGetArgs>> files;

    public Output<List<StandardAppVersionDeploymentFileGetArgs>> getFiles() {
        return this.files == null ? Codegen.empty() : this.files;
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @Import(name="zip")
      private final @Nullable Output<StandardAppVersionDeploymentZipGetArgs> zip;

    public Output<StandardAppVersionDeploymentZipGetArgs> getZip() {
        return this.zip == null ? Codegen.empty() : this.zip;
    }

    public StandardAppVersionDeploymentGetArgs(
        @Nullable Output<List<StandardAppVersionDeploymentFileGetArgs>> files,
        @Nullable Output<StandardAppVersionDeploymentZipGetArgs> zip) {
        this.files = files;
        this.zip = zip;
    }

    private StandardAppVersionDeploymentGetArgs() {
        this.files = Codegen.empty();
        this.zip = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<StandardAppVersionDeploymentFileGetArgs>> files;
        private @Nullable Output<StandardAppVersionDeploymentZipGetArgs> zip;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionDeploymentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder files(@Nullable Output<List<StandardAppVersionDeploymentFileGetArgs>> files) {
            this.files = files;
            return this;
        }
        public Builder files(@Nullable List<StandardAppVersionDeploymentFileGetArgs> files) {
            this.files = Codegen.ofNullable(files);
            return this;
        }
        public Builder files(StandardAppVersionDeploymentFileGetArgs... files) {
            return files(List.of(files));
        }
        public Builder zip(@Nullable Output<StandardAppVersionDeploymentZipGetArgs> zip) {
            this.zip = zip;
            return this;
        }
        public Builder zip(@Nullable StandardAppVersionDeploymentZipGetArgs zip) {
            this.zip = Codegen.ofNullable(zip);
            return this;
        }        public StandardAppVersionDeploymentGetArgs build() {
            return new StandardAppVersionDeploymentGetArgs(files, zip);
        }
    }
}
