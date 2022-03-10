// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingNodeAffinityGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateSchedulingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateSchedulingGetArgs Empty = new InstanceTemplateSchedulingGetArgs();

    /**
     * Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    @InputImport(name="automaticRestart")
      private final @Nullable Input<Boolean> automaticRestart;

    public Input<Boolean> getAutomaticRestart() {
        return this.automaticRestart == null ? Input.empty() : this.automaticRestart;
    }

    @InputImport(name="minNodeCpus")
      private final @Nullable Input<Integer> minNodeCpus;

    public Input<Integer> getMinNodeCpus() {
        return this.minNodeCpus == null ? Input.empty() : this.minNodeCpus;
    }

    /**
     * Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    @InputImport(name="nodeAffinities")
      private final @Nullable Input<List<InstanceTemplateSchedulingNodeAffinityGetArgs>> nodeAffinities;

    public Input<List<InstanceTemplateSchedulingNodeAffinityGetArgs>> getNodeAffinities() {
        return this.nodeAffinities == null ? Input.empty() : this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this
     * instance.
     * 
     */
    @InputImport(name="onHostMaintenance")
      private final @Nullable Input<String> onHostMaintenance;

    public Input<String> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Input.empty() : this.onHostMaintenance;
    }

    /**
     * Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    @InputImport(name="preemptible")
      private final @Nullable Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible == null ? Input.empty() : this.preemptible;
    }

    public InstanceTemplateSchedulingGetArgs(
        @Nullable Input<Boolean> automaticRestart,
        @Nullable Input<Integer> minNodeCpus,
        @Nullable Input<List<InstanceTemplateSchedulingNodeAffinityGetArgs>> nodeAffinities,
        @Nullable Input<String> onHostMaintenance,
        @Nullable Input<Boolean> preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    private InstanceTemplateSchedulingGetArgs() {
        this.automaticRestart = Input.empty();
        this.minNodeCpus = Input.empty();
        this.nodeAffinities = Input.empty();
        this.onHostMaintenance = Input.empty();
        this.preemptible = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateSchedulingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> automaticRestart;
        private @Nullable Input<Integer> minNodeCpus;
        private @Nullable Input<List<InstanceTemplateSchedulingNodeAffinityGetArgs>> nodeAffinities;
        private @Nullable Input<String> onHostMaintenance;
        private @Nullable Input<Boolean> preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateSchedulingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder automaticRestart(@Nullable Input<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }

        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Input.ofNullable(automaticRestart);
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

        public Builder nodeAffinities(@Nullable Input<List<InstanceTemplateSchedulingNodeAffinityGetArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder nodeAffinities(@Nullable List<InstanceTemplateSchedulingNodeAffinityGetArgs> nodeAffinities) {
            this.nodeAffinities = Input.ofNullable(nodeAffinities);
            return this;
        }

        public Builder onHostMaintenance(@Nullable Input<String> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
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
        public InstanceTemplateSchedulingGetArgs build() {
            return new InstanceTemplateSchedulingGetArgs(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
