// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs Empty = new ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs();

    /**
     * ID of the launch template. You must specify either the launch template ID or launch template name in the request, but not both.
     * 
     */
    @Import(name="launchTemplateId")
      private final @Nullable Output<String> launchTemplateId;

    public Output<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Codegen.empty() : this.launchTemplateId;
    }

    /**
     * Name of the launch template.
     * 
     */
    @Import(name="launchTemplateName")
      private final @Nullable Output<String> launchTemplateName;

    public Output<String> getLaunchTemplateName() {
        return this.launchTemplateName == null ? Codegen.empty() : this.launchTemplateName;
    }

    /**
     * The version number of the launch template. Default: The default version of the launch template.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs(
        @Nullable Output<String> launchTemplateId,
        @Nullable Output<String> launchTemplateName,
        @Nullable Output<String> version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    private ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs() {
        this.launchTemplateId = Codegen.empty();
        this.launchTemplateName = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> launchTemplateId;
        private @Nullable Output<String> launchTemplateName;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = Codegen.ofNullable(launchTemplateId);
            return this;
        }
        public Builder launchTemplateName(@Nullable Output<String> launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }
        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = Codegen.ofNullable(launchTemplateName);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs build() {
            return new ComputeEnvironmentComputeResourcesLaunchTemplateGetArgs(launchTemplateId, launchTemplateName, version);
        }
    }
}
