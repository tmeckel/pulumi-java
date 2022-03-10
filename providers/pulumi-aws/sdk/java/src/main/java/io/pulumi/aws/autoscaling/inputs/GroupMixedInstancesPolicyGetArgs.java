// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyInstancesDistributionGetArgs;
import io.pulumi.aws.autoscaling.inputs.GroupMixedInstancesPolicyLaunchTemplateGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyGetArgs Empty = new GroupMixedInstancesPolicyGetArgs();

    /**
     * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
     * 
     */
    @InputImport(name="instancesDistribution")
      private final @Nullable Input<GroupMixedInstancesPolicyInstancesDistributionGetArgs> instancesDistribution;

    public Input<GroupMixedInstancesPolicyInstancesDistributionGetArgs> getInstancesDistribution() {
        return this.instancesDistribution == null ? Input.empty() : this.instancesDistribution;
    }

    /**
     * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
     * 
     */
    @InputImport(name="launchTemplate", required=true)
      private final Input<GroupMixedInstancesPolicyLaunchTemplateGetArgs> launchTemplate;

    public Input<GroupMixedInstancesPolicyLaunchTemplateGetArgs> getLaunchTemplate() {
        return this.launchTemplate;
    }

    public GroupMixedInstancesPolicyGetArgs(
        @Nullable Input<GroupMixedInstancesPolicyInstancesDistributionGetArgs> instancesDistribution,
        Input<GroupMixedInstancesPolicyLaunchTemplateGetArgs> launchTemplate) {
        this.instancesDistribution = instancesDistribution;
        this.launchTemplate = Objects.requireNonNull(launchTemplate, "expected parameter 'launchTemplate' to be non-null");
    }

    private GroupMixedInstancesPolicyGetArgs() {
        this.instancesDistribution = Input.empty();
        this.launchTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GroupMixedInstancesPolicyInstancesDistributionGetArgs> instancesDistribution;
        private Input<GroupMixedInstancesPolicyLaunchTemplateGetArgs> launchTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancesDistribution = defaults.instancesDistribution;
    	      this.launchTemplate = defaults.launchTemplate;
        }

        public Builder instancesDistribution(@Nullable Input<GroupMixedInstancesPolicyInstancesDistributionGetArgs> instancesDistribution) {
            this.instancesDistribution = instancesDistribution;
            return this;
        }

        public Builder instancesDistribution(@Nullable GroupMixedInstancesPolicyInstancesDistributionGetArgs instancesDistribution) {
            this.instancesDistribution = Input.ofNullable(instancesDistribution);
            return this;
        }

        public Builder launchTemplate(Input<GroupMixedInstancesPolicyLaunchTemplateGetArgs> launchTemplate) {
            this.launchTemplate = Objects.requireNonNull(launchTemplate);
            return this;
        }

        public Builder launchTemplate(GroupMixedInstancesPolicyLaunchTemplateGetArgs launchTemplate) {
            this.launchTemplate = Input.of(Objects.requireNonNull(launchTemplate));
            return this;
        }
        public GroupMixedInstancesPolicyGetArgs build() {
            return new GroupMixedInstancesPolicyGetArgs(instancesDistribution, launchTemplate);
        }
    }
}
