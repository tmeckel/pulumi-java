// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.inputs;

import com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsGetArgs Empty = new LifecyclePolicyPolicyDetailsGetArgs();

    /**
     * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
     * 
     */
    @Import(name="resourceTypes", required=true)
    private Output<List<String>> resourceTypes;

    /**
     * @return A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
     * 
     */
    public Output<List<String>> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     * See the `schedule` configuration block.
     * 
     */
    @Import(name="schedules", required=true)
    private Output<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules;

    /**
     * @return See the `schedule` configuration block.
     * 
     */
    public Output<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules() {
        return this.schedules;
    }

    /**
     * A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
     */
    @Import(name="targetTags", required=true)
    private Output<Map<String,String>> targetTags;

    /**
     * @return A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
     * 
     */
    public Output<Map<String,String>> targetTags() {
        return this.targetTags;
    }

    private LifecyclePolicyPolicyDetailsGetArgs() {}

    private LifecyclePolicyPolicyDetailsGetArgs(LifecyclePolicyPolicyDetailsGetArgs $) {
        this.resourceTypes = $.resourceTypes;
        this.schedules = $.schedules;
        this.targetTags = $.targetTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyPolicyDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsGetArgs $;

        public Builder() {
            $ = new LifecyclePolicyPolicyDetailsGetArgs();
        }

        public Builder(LifecyclePolicyPolicyDetailsGetArgs defaults) {
            $ = new LifecyclePolicyPolicyDetailsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceTypes A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(Output<List<String>> resourceTypes) {
            $.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * @param resourceTypes A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(List<String> resourceTypes) {
            return resourceTypes(Output.of(resourceTypes));
        }

        /**
         * @param resourceTypes A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
         * 
         * @return builder
         * 
         */
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }

        /**
         * @param schedules See the `schedule` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder schedules(Output<List<LifecyclePolicyPolicyDetailsScheduleGetArgs>> schedules) {
            $.schedules = schedules;
            return this;
        }

        /**
         * @param schedules See the `schedule` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder schedules(List<LifecyclePolicyPolicyDetailsScheduleGetArgs> schedules) {
            return schedules(Output.of(schedules));
        }

        /**
         * @param schedules See the `schedule` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder schedules(LifecyclePolicyPolicyDetailsScheduleGetArgs... schedules) {
            return schedules(List.of(schedules));
        }

        /**
         * @param targetTags A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
         * 
         * @return builder
         * 
         */
        public Builder targetTags(Output<Map<String,String>> targetTags) {
            $.targetTags = targetTags;
            return this;
        }

        /**
         * @param targetTags A map of tag keys and their values. Any resources that match the `resource_types` and are tagged with _any_ of these tags will be targeted.
         * 
         * @return builder
         * 
         */
        public Builder targetTags(Map<String,String> targetTags) {
            return targetTags(Output.of(targetTags));
        }

        public LifecyclePolicyPolicyDetailsGetArgs build() {
            $.resourceTypes = Objects.requireNonNull($.resourceTypes, "expected parameter 'resourceTypes' to be non-null");
            $.schedules = Objects.requireNonNull($.schedules, "expected parameter 'schedules' to be non-null");
            $.targetTags = Objects.requireNonNull($.targetTags, "expected parameter 'targetTags' to be non-null");
            return $;
        }
    }

}
