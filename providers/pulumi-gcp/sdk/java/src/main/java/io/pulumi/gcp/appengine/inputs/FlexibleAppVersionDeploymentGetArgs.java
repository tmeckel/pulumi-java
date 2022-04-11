// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentContainerGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentFileGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentZipGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentGetArgs Empty = new FlexibleAppVersionDeploymentGetArgs();

    /**
     * Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
     */
    @Import(name="cloudBuildOptions")
      private final @Nullable Output<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions;

    public Output<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> getCloudBuildOptions() {
        return this.cloudBuildOptions == null ? Codegen.empty() : this.cloudBuildOptions;
    }

    /**
     * The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
     */
    @Import(name="container")
      private final @Nullable Output<FlexibleAppVersionDeploymentContainerGetArgs> container;

    public Output<FlexibleAppVersionDeploymentContainerGetArgs> getContainer() {
        return this.container == null ? Codegen.empty() : this.container;
    }

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @Import(name="files")
      private final @Nullable Output<List<FlexibleAppVersionDeploymentFileGetArgs>> files;

    public Output<List<FlexibleAppVersionDeploymentFileGetArgs>> getFiles() {
        return this.files == null ? Codegen.empty() : this.files;
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @Import(name="zip")
      private final @Nullable Output<FlexibleAppVersionDeploymentZipGetArgs> zip;

    public Output<FlexibleAppVersionDeploymentZipGetArgs> getZip() {
        return this.zip == null ? Codegen.empty() : this.zip;
    }

    public FlexibleAppVersionDeploymentGetArgs(
        @Nullable Output<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions,
        @Nullable Output<FlexibleAppVersionDeploymentContainerGetArgs> container,
        @Nullable Output<List<FlexibleAppVersionDeploymentFileGetArgs>> files,
        @Nullable Output<FlexibleAppVersionDeploymentZipGetArgs> zip) {
        this.cloudBuildOptions = cloudBuildOptions;
        this.container = container;
        this.files = files;
        this.zip = zip;
    }

    private FlexibleAppVersionDeploymentGetArgs() {
        this.cloudBuildOptions = Codegen.empty();
        this.container = Codegen.empty();
        this.files = Codegen.empty();
        this.zip = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions;
        private @Nullable Output<FlexibleAppVersionDeploymentContainerGetArgs> container;
        private @Nullable Output<List<FlexibleAppVersionDeploymentFileGetArgs>> files;
        private @Nullable Output<FlexibleAppVersionDeploymentZipGetArgs> zip;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder cloudBuildOptions(@Nullable Output<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions) {
            this.cloudBuildOptions = cloudBuildOptions;
            return this;
        }
        public Builder cloudBuildOptions(@Nullable FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs cloudBuildOptions) {
            this.cloudBuildOptions = Codegen.ofNullable(cloudBuildOptions);
            return this;
        }
        public Builder container(@Nullable Output<FlexibleAppVersionDeploymentContainerGetArgs> container) {
            this.container = container;
            return this;
        }
        public Builder container(@Nullable FlexibleAppVersionDeploymentContainerGetArgs container) {
            this.container = Codegen.ofNullable(container);
            return this;
        }
        public Builder files(@Nullable Output<List<FlexibleAppVersionDeploymentFileGetArgs>> files) {
            this.files = files;
            return this;
        }
        public Builder files(@Nullable List<FlexibleAppVersionDeploymentFileGetArgs> files) {
            this.files = Codegen.ofNullable(files);
            return this;
        }
        public Builder files(FlexibleAppVersionDeploymentFileGetArgs... files) {
            return files(List.of(files));
        }
        public Builder zip(@Nullable Output<FlexibleAppVersionDeploymentZipGetArgs> zip) {
            this.zip = zip;
            return this;
        }
        public Builder zip(@Nullable FlexibleAppVersionDeploymentZipGetArgs zip) {
            this.zip = Codegen.ofNullable(zip);
            return this;
        }        public FlexibleAppVersionDeploymentGetArgs build() {
            return new FlexibleAppVersionDeploymentGetArgs(cloudBuildOptions, container, files, zip);
        }
    }
}
