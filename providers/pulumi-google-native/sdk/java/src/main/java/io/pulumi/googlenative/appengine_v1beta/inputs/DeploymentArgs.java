// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.appengine_v1beta.inputs.BuildInfoArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.CloudBuildOptionsArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ContainerInfoArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ZipInfoArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Code and application artifacts used to deploy a version to App Engine.
 * 
 */
public final class DeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentArgs Empty = new DeploymentArgs();

    /**
     * Google Cloud Build build information. Only applicable for instances running in the App Engine flexible environment.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<BuildInfoArgs> build;

    public Output<BuildInfoArgs> getBuild() {
        return this.build == null ? Codegen.empty() : this.build;
    }

    /**
     * Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine flexible environment using files or zip.
     * 
     */
    @Import(name="cloudBuildOptions")
      private final @Nullable Output<CloudBuildOptionsArgs> cloudBuildOptions;

    public Output<CloudBuildOptionsArgs> getCloudBuildOptions() {
        return this.cloudBuildOptions == null ? Codegen.empty() : this.cloudBuildOptions;
    }

    /**
     * The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment.
     * 
     */
    @Import(name="container")
      private final @Nullable Output<ContainerInfoArgs> container;

    public Output<ContainerInfoArgs> getContainer() {
        return this.container == null ? Codegen.empty() : this.container;
    }

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
     * 
     */
    @Import(name="files")
      private final @Nullable Output<Map<String,String>> files;

    public Output<Map<String,String>> getFiles() {
        return this.files == null ? Codegen.empty() : this.files;
    }

    /**
     * The zip file for this deployment, if this is a zip deployment.
     * 
     */
    @Import(name="zip")
      private final @Nullable Output<ZipInfoArgs> zip;

    public Output<ZipInfoArgs> getZip() {
        return this.zip == null ? Codegen.empty() : this.zip;
    }

    public DeploymentArgs(
        @Nullable Output<BuildInfoArgs> build,
        @Nullable Output<CloudBuildOptionsArgs> cloudBuildOptions,
        @Nullable Output<ContainerInfoArgs> container,
        @Nullable Output<Map<String,String>> files,
        @Nullable Output<ZipInfoArgs> zip) {
        this.build = build;
        this.cloudBuildOptions = cloudBuildOptions;
        this.container = container;
        this.files = files;
        this.zip = zip;
    }

    private DeploymentArgs() {
        this.build = Codegen.empty();
        this.cloudBuildOptions = Codegen.empty();
        this.container = Codegen.empty();
        this.files = Codegen.empty();
        this.zip = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BuildInfoArgs> build;
        private @Nullable Output<CloudBuildOptionsArgs> cloudBuildOptions;
        private @Nullable Output<ContainerInfoArgs> container;
        private @Nullable Output<Map<String,String>> files;
        private @Nullable Output<ZipInfoArgs> zip;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.build = defaults.build;
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder build(@Nullable Output<BuildInfoArgs> build) {
            this.build = build;
            return this;
        }
        public Builder build(@Nullable BuildInfoArgs build) {
            this.build = Codegen.ofNullable(build);
            return this;
        }
        public Builder cloudBuildOptions(@Nullable Output<CloudBuildOptionsArgs> cloudBuildOptions) {
            this.cloudBuildOptions = cloudBuildOptions;
            return this;
        }
        public Builder cloudBuildOptions(@Nullable CloudBuildOptionsArgs cloudBuildOptions) {
            this.cloudBuildOptions = Codegen.ofNullable(cloudBuildOptions);
            return this;
        }
        public Builder container(@Nullable Output<ContainerInfoArgs> container) {
            this.container = container;
            return this;
        }
        public Builder container(@Nullable ContainerInfoArgs container) {
            this.container = Codegen.ofNullable(container);
            return this;
        }
        public Builder files(@Nullable Output<Map<String,String>> files) {
            this.files = files;
            return this;
        }
        public Builder files(@Nullable Map<String,String> files) {
            this.files = Codegen.ofNullable(files);
            return this;
        }
        public Builder zip(@Nullable Output<ZipInfoArgs> zip) {
            this.zip = zip;
            return this;
        }
        public Builder zip(@Nullable ZipInfoArgs zip) {
            this.zip = Codegen.ofNullable(zip);
            return this;
        }        public DeploymentArgs build() {
            return new DeploymentArgs(build, cloudBuildOptions, container, files, zip);
        }
    }
}
