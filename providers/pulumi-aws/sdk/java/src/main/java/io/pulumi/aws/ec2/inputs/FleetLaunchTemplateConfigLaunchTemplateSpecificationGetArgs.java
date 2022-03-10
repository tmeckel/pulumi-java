// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs Empty = new FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs();

    /**
     * ID of the launch template.
     * 
     */
    @InputImport(name="launchTemplateId")
      private final @Nullable Input<String> launchTemplateId;

    public Input<String> getLaunchTemplateId() {
        return this.launchTemplateId == null ? Input.empty() : this.launchTemplateId;
    }

    /**
     * Name of the launch template.
     * 
     */
    @InputImport(name="launchTemplateName")
      private final @Nullable Input<String> launchTemplateName;

    public Input<String> getLaunchTemplateName() {
        return this.launchTemplateName == null ? Input.empty() : this.launchTemplateName;
    }

    /**
     * Version number of the launch template.
     * 
     */
    @InputImport(name="version", required=true)
      private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    public FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs(
        @Nullable Input<String> launchTemplateId,
        @Nullable Input<String> launchTemplateName,
        Input<String> version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs() {
        this.launchTemplateId = Input.empty();
        this.launchTemplateName = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> launchTemplateId;
        private @Nullable Input<String> launchTemplateName;
        private Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable Input<String> launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = Input.ofNullable(launchTemplateId);
            return this;
        }

        public Builder launchTemplateName(@Nullable Input<String> launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = Input.ofNullable(launchTemplateName);
            return this;
        }

        public Builder version(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder version(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }
        public FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs build() {
            return new FleetLaunchTemplateConfigLaunchTemplateSpecificationGetArgs(launchTemplateId, launchTemplateName, version);
        }
    }
}
