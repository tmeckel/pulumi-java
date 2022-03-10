// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification;
import io.pulumi.aws.autoscaling.outputs.GroupMixedInstancesPolicyLaunchTemplateOverride;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupMixedInstancesPolicyLaunchTemplate {
    /**
     * Override the instance launch template specification in the Launch Template.
     * 
     */
    private final GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification;
    /**
     * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
     */
    private final @Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides;

    @OutputCustomType.Constructor
    private GroupMixedInstancesPolicyLaunchTemplate(
        @OutputCustomType.Parameter("launchTemplateSpecification") GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification,
        @OutputCustomType.Parameter("overrides") @Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.overrides = overrides;
    }

    /**
     * Override the instance launch template specification in the Launch Template.
     * 
    */
    public GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification getLaunchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }
    /**
     * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
    */
    public List<GroupMixedInstancesPolicyLaunchTemplateOverride> getOverrides() {
        return this.overrides == null ? List.of() : this.overrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification;
        private @Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchTemplateSpecification = defaults.launchTemplateSpecification;
    	      this.overrides = defaults.overrides;
        }

        public Builder launchTemplateSpecification(GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification) {
            this.launchTemplateSpecification = Objects.requireNonNull(launchTemplateSpecification);
            return this;
        }

        public Builder overrides(@Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides) {
            this.overrides = overrides;
            return this;
        }
        public GroupMixedInstancesPolicyLaunchTemplate build() {
            return new GroupMixedInstancesPolicyLaunchTemplate(launchTemplateSpecification, overrides);
        }
    }
}
