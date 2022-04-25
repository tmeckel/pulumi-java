// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.outputs;

import com.pulumi.aws.autoscaling.outputs.GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification;
import com.pulumi.aws.autoscaling.outputs.GroupMixedInstancesPolicyLaunchTemplateOverride;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GroupMixedInstancesPolicyLaunchTemplate {
    /**
     * @return Override the instance launch template specification in the Launch Template.
     * 
     */
    private final GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification;
    /**
     * @return List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
     */
    private final @Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides;

    @CustomType.Constructor
    private GroupMixedInstancesPolicyLaunchTemplate(
        @CustomType.Parameter("launchTemplateSpecification") GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification,
        @CustomType.Parameter("overrides") @Nullable List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        this.overrides = overrides;
    }

    /**
     * @return Override the instance launch template specification in the Launch Template.
     * 
     */
    public GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification launchTemplateSpecification() {
        return this.launchTemplateSpecification;
    }
    /**
     * @return List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
     * 
     */
    public List<GroupMixedInstancesPolicyLaunchTemplateOverride> overrides() {
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
        public Builder overrides(GroupMixedInstancesPolicyLaunchTemplateOverride... overrides) {
            return overrides(List.of(overrides));
        }        public GroupMixedInstancesPolicyLaunchTemplate build() {
            return new GroupMixedInstancesPolicyLaunchTemplate(launchTemplateSpecification, overrides);
        }
    }
}
