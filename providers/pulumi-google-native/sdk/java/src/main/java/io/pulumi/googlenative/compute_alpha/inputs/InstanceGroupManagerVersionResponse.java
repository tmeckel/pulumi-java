// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentResponse;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerVersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerVersionResponse Empty = new InstanceGroupManagerVersionResponse();

    /**
     * The URL of the instance template that is specified for this managed instance group. The group uses this template to create new instances in the managed instance group until the `targetSize` for this version is reached. The templates for existing instances in the group do not change unless you run recreateInstances, run applyUpdatesToInstances, or set the group's updatePolicy.type to PROACTIVE; in those cases, existing instances are updated until the `targetSize` for this version is reached.
     * 
     */
    @InputImport(name="instanceTemplate", required=true)
    private final String instanceTemplate;

    public String getInstanceTemplate() {
        return this.instanceTemplate;
    }

    /**
     * Name of the version. Unique among all versions in the scope of this managed instance group.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies the intended number of instances to be created from the instanceTemplate. The final number of instances created from the template will be equal to: - If expressed as a fixed number, the minimum of either targetSize.fixed or instanceGroupManager.targetSize is used. - if expressed as a percent, the targetSize would be (targetSize.percent/100 * InstanceGroupManager.targetSize) If there is a remainder, the number is rounded. If unset, this version will update any remaining instances not updated by another version. Read Starting a canary update for more information.
     * 
     */
    @InputImport(name="targetSize", required=true)
    private final FixedOrPercentResponse targetSize;

    public FixedOrPercentResponse getTargetSize() {
        return this.targetSize;
    }

    public InstanceGroupManagerVersionResponse(
        String instanceTemplate,
        String name,
        FixedOrPercentResponse targetSize) {
        this.instanceTemplate = Objects.requireNonNull(instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.targetSize = Objects.requireNonNull(targetSize, "expected parameter 'targetSize' to be non-null");
    }

    private InstanceGroupManagerVersionResponse() {
        this.instanceTemplate = null;
        this.name = null;
        this.targetSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceTemplate;
        private String name;
        private FixedOrPercentResponse targetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.targetSize = defaults.targetSize;
        }

        public Builder setInstanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTargetSize(FixedOrPercentResponse targetSize) {
            this.targetSize = Objects.requireNonNull(targetSize);
            return this;
        }

        public InstanceGroupManagerVersionResponse build() {
            return new InstanceGroupManagerVersionResponse(instanceTemplate, name, targetSize);
        }
    }
}
