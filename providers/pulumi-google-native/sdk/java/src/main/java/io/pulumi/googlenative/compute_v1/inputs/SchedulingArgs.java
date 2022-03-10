// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.SchedulingInstanceTerminationAction;
import io.pulumi.googlenative.compute_v1.enums.SchedulingOnHostMaintenance;
import io.pulumi.googlenative.compute_v1.enums.SchedulingProvisioningModel;
import io.pulumi.googlenative.compute_v1.inputs.SchedulingNodeAffinityArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sets the scheduling options for an Instance. NextID: 21
 * 
 */
public final class SchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingArgs Empty = new SchedulingArgs();

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    @InputImport(name="automaticRestart")
      private final @Nullable Input<Boolean> automaticRestart;

    public Input<Boolean> getAutomaticRestart() {
        return this.automaticRestart == null ? Input.empty() : this.automaticRestart;
    }

    /**
     * Specifies the termination action for the instance.
     * 
     */
    @InputImport(name="instanceTerminationAction")
      private final @Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction;

    public Input<SchedulingInstanceTerminationAction> getInstanceTerminationAction() {
        return this.instanceTerminationAction == null ? Input.empty() : this.instanceTerminationAction;
    }

    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @InputImport(name="locationHint")
      private final @Nullable Input<String> locationHint;

    public Input<String> getLocationHint() {
        return this.locationHint == null ? Input.empty() : this.locationHint;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    @InputImport(name="minNodeCpus")
      private final @Nullable Input<Integer> minNodeCpus;

    public Input<Integer> getMinNodeCpus() {
        return this.minNodeCpus == null ? Input.empty() : this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    @InputImport(name="nodeAffinities")
      private final @Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities;

    public Input<List<SchedulingNodeAffinityArgs>> getNodeAffinities() {
        return this.nodeAffinities == null ? Input.empty() : this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    @InputImport(name="onHostMaintenance")
      private final @Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance;

    public Input<SchedulingOnHostMaintenance> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Input.empty() : this.onHostMaintenance;
    }

    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    @InputImport(name="preemptible")
      private final @Nullable Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible == null ? Input.empty() : this.preemptible;
    }

    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    @InputImport(name="provisioningModel")
      private final @Nullable Input<SchedulingProvisioningModel> provisioningModel;

    public Input<SchedulingProvisioningModel> getProvisioningModel() {
        return this.provisioningModel == null ? Input.empty() : this.provisioningModel;
    }

    public SchedulingArgs(
        @Nullable Input<Boolean> automaticRestart,
        @Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction,
        @Nullable Input<String> locationHint,
        @Nullable Input<Integer> minNodeCpus,
        @Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities,
        @Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance,
        @Nullable Input<Boolean> preemptible,
        @Nullable Input<SchedulingProvisioningModel> provisioningModel) {
        this.automaticRestart = automaticRestart;
        this.instanceTerminationAction = instanceTerminationAction;
        this.locationHint = locationHint;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
    }

    private SchedulingArgs() {
        this.automaticRestart = Input.empty();
        this.instanceTerminationAction = Input.empty();
        this.locationHint = Input.empty();
        this.minNodeCpus = Input.empty();
        this.nodeAffinities = Input.empty();
        this.onHostMaintenance = Input.empty();
        this.preemptible = Input.empty();
        this.provisioningModel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> automaticRestart;
        private @Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction;
        private @Nullable Input<String> locationHint;
        private @Nullable Input<Integer> minNodeCpus;
        private @Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities;
        private @Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance;
        private @Nullable Input<Boolean> preemptible;
        private @Nullable Input<SchedulingProvisioningModel> provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.locationHint = defaults.locationHint;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder automaticRestart(@Nullable Input<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }

        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Input.ofNullable(automaticRestart);
            return this;
        }

        public Builder instanceTerminationAction(@Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction) {
            this.instanceTerminationAction = instanceTerminationAction;
            return this;
        }

        public Builder instanceTerminationAction(@Nullable SchedulingInstanceTerminationAction instanceTerminationAction) {
            this.instanceTerminationAction = Input.ofNullable(instanceTerminationAction);
            return this;
        }

        public Builder locationHint(@Nullable Input<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder locationHint(@Nullable String locationHint) {
            this.locationHint = Input.ofNullable(locationHint);
            return this;
        }

        public Builder minNodeCpus(@Nullable Input<Integer> minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = Input.ofNullable(minNodeCpus);
            return this;
        }

        public Builder nodeAffinities(@Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder nodeAffinities(@Nullable List<SchedulingNodeAffinityArgs> nodeAffinities) {
            this.nodeAffinities = Input.ofNullable(nodeAffinities);
            return this;
        }

        public Builder onHostMaintenance(@Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder onHostMaintenance(@Nullable SchedulingOnHostMaintenance onHostMaintenance) {
            this.onHostMaintenance = Input.ofNullable(onHostMaintenance);
            return this;
        }

        public Builder preemptible(@Nullable Input<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Input.ofNullable(preemptible);
            return this;
        }

        public Builder provisioningModel(@Nullable Input<SchedulingProvisioningModel> provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }

        public Builder provisioningModel(@Nullable SchedulingProvisioningModel provisioningModel) {
            this.provisioningModel = Input.ofNullable(provisioningModel);
            return this;
        }
        public SchedulingArgs build() {
            return new SchedulingArgs(automaticRestart, instanceTerminationAction, locationHint, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}
