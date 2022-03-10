// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FleetLaunchTemplateConfigLaunchTemplateSpecification {
    /**
     * ID of the launch template.
     * 
     */
    private final @Nullable String launchTemplateId;
    /**
     * Name of the launch template.
     * 
     */
    private final @Nullable String launchTemplateName;
    /**
     * Version number of the launch template.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor
    private FleetLaunchTemplateConfigLaunchTemplateSpecification(
        @OutputCustomType.Parameter("launchTemplateId") @Nullable String launchTemplateId,
        @OutputCustomType.Parameter("launchTemplateName") @Nullable String launchTemplateName,
        @OutputCustomType.Parameter("version") String version) {
        this.launchTemplateId = launchTemplateId;
        this.launchTemplateName = launchTemplateName;
        this.version = version;
    }

    /**
     * ID of the launch template.
     * 
    */
    public Optional<String> getLaunchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }
    /**
     * Name of the launch template.
     * 
    */
    public Optional<String> getLaunchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }
    /**
     * Version number of the launch template.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigLaunchTemplateSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String launchTemplateId;
        private @Nullable String launchTemplateName;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigLaunchTemplateSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateId = defaults.launchTemplateId;
    	      this.launchTemplateName = defaults.launchTemplateName;
    	      this.version = defaults.version;
        }

        public Builder launchTemplateId(@Nullable String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateName(@Nullable String launchTemplateName) {
            this.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public FleetLaunchTemplateConfigLaunchTemplateSpecification build() {
            return new FleetLaunchTemplateConfigLaunchTemplateSpecification(launchTemplateId, launchTemplateName, version);
        }
    }
}
