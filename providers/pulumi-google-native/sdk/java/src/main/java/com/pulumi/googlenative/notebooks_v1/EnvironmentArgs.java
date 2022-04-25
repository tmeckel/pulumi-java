// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.inputs.ContainerImageArgs;
import com.pulumi.googlenative.notebooks_v1.inputs.VmImageArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Use a container image to start the notebook instance.
     * 
     */
    @Import(name="containerImage")
    private @Nullable Output<ContainerImageArgs> containerImage;

    /**
     * @return Use a container image to start the notebook instance.
     * 
     */
    public Optional<Output<ContainerImageArgs>> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }

    /**
     * A brief description of this environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A brief description of this environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Display name of this environment for the UI.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of this environment for the UI.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `&#34;gs://path-to-file/file-name&#34;`
     * 
     */
    @Import(name="postStartupScript")
    private @Nullable Output<String> postStartupScript;

    /**
     * @return Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `&#34;gs://path-to-file/file-name&#34;`
     * 
     */
    public Optional<Output<String>> postStartupScript() {
        return Optional.ofNullable(this.postStartupScript);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    @Import(name="vmImage")
    private @Nullable Output<VmImageArgs> vmImage;

    /**
     * @return Use a Compute Engine VM image to start the notebook instance.
     * 
     */
    public Optional<Output<VmImageArgs>> vmImage() {
        return Optional.ofNullable(this.vmImage);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.containerImage = $.containerImage;
        this.description = $.description;
        this.displayName = $.displayName;
        this.environmentId = $.environmentId;
        this.location = $.location;
        this.postStartupScript = $.postStartupScript;
        this.project = $.project;
        this.vmImage = $.vmImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerImage Use a container image to start the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(@Nullable Output<ContainerImageArgs> containerImage) {
            $.containerImage = containerImage;
            return this;
        }

        /**
         * @param containerImage Use a container image to start the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder containerImage(ContainerImageArgs containerImage) {
            return containerImage(Output.of(containerImage));
        }

        /**
         * @param description A brief description of this environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A brief description of this environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Display name of this environment for the UI.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of this environment for the UI.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param postStartupScript Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `&#34;gs://path-to-file/file-name&#34;`
         * 
         * @return builder
         * 
         */
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            $.postStartupScript = postStartupScript;
            return this;
        }

        /**
         * @param postStartupScript Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path. Example: `&#34;gs://path-to-file/file-name&#34;`
         * 
         * @return builder
         * 
         */
        public Builder postStartupScript(String postStartupScript) {
            return postStartupScript(Output.of(postStartupScript));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param vmImage Use a Compute Engine VM image to start the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(@Nullable Output<VmImageArgs> vmImage) {
            $.vmImage = vmImage;
            return this;
        }

        /**
         * @param vmImage Use a Compute Engine VM image to start the notebook instance.
         * 
         * @return builder
         * 
         */
        public Builder vmImage(VmImageArgs vmImage) {
            return vmImage(Output.of(vmImage));
        }

        public EnvironmentArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            return $;
        }
    }

}
