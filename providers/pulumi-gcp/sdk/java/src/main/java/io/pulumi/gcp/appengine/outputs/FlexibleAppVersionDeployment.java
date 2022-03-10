// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentCloudBuildOptions;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentContainer;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentFile;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentZip;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionDeployment {
    /**
     * Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
     */
    private final @Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions;
    /**
     * The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
     */
    private final @Nullable FlexibleAppVersionDeploymentContainer container;
    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<FlexibleAppVersionDeploymentFile> files;
    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    private final @Nullable FlexibleAppVersionDeploymentZip zip;

    @OutputCustomType.Constructor
    private FlexibleAppVersionDeployment(
        @OutputCustomType.Parameter("cloudBuildOptions") @Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions,
        @OutputCustomType.Parameter("container") @Nullable FlexibleAppVersionDeploymentContainer container,
        @OutputCustomType.Parameter("files") @Nullable List<FlexibleAppVersionDeploymentFile> files,
        @OutputCustomType.Parameter("zip") @Nullable FlexibleAppVersionDeploymentZip zip) {
        this.cloudBuildOptions = cloudBuildOptions;
        this.container = container;
        this.files = files;
        this.zip = zip;
    }

    /**
     * Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
    */
    public Optional<FlexibleAppVersionDeploymentCloudBuildOptions> getCloudBuildOptions() {
        return Optional.ofNullable(this.cloudBuildOptions);
    }
    /**
     * The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
    */
    public Optional<FlexibleAppVersionDeploymentContainer> getContainer() {
        return Optional.ofNullable(this.container);
    }
    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
    */
    public List<FlexibleAppVersionDeploymentFile> getFiles() {
        return this.files == null ? List.of() : this.files;
    }
    /**
     * Zip File
     * Structure is documented below.
     * 
    */
    public Optional<FlexibleAppVersionDeploymentZip> getZip() {
        return Optional.ofNullable(this.zip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions;
        private @Nullable FlexibleAppVersionDeploymentContainer container;
        private @Nullable List<FlexibleAppVersionDeploymentFile> files;
        private @Nullable FlexibleAppVersionDeploymentZip zip;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder cloudBuildOptions(@Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions) {
            this.cloudBuildOptions = cloudBuildOptions;
            return this;
        }

        public Builder container(@Nullable FlexibleAppVersionDeploymentContainer container) {
            this.container = container;
            return this;
        }

        public Builder files(@Nullable List<FlexibleAppVersionDeploymentFile> files) {
            this.files = files;
            return this;
        }

        public Builder zip(@Nullable FlexibleAppVersionDeploymentZip zip) {
            this.zip = zip;
            return this;
        }
        public FlexibleAppVersionDeployment build() {
            return new FlexibleAppVersionDeployment(cloudBuildOptions, container, files, zip);
        }
    }
}
