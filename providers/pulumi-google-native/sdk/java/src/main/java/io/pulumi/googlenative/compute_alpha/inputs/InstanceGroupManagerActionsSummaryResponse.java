// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class InstanceGroupManagerActionsSummaryResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerActionsSummaryResponse Empty = new InstanceGroupManagerActionsSummaryResponse();

    /**
     * The total number of instances in the managed instance group that are scheduled to be abandoned. Abandoning an instance removes it from the managed instance group without deleting it.
     * 
     */
    @InputImport(name="abandoning", required=true)
    private final Integer abandoning;

    public Integer getAbandoning() {
        return this.abandoning;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be created or are currently being created. If the group fails to create any of these instances, it tries again until it creates the instance successfully. If you have disabled creation retries, this field will not be populated; instead, the creatingWithoutRetries field will be populated.
     * 
     */
    @InputImport(name="creating", required=true)
    private final Integer creating;

    public Integer getCreating() {
        return this.creating;
    }

    /**
     * The number of instances that the managed instance group will attempt to create. The group attempts to create each instance only once. If the group fails to create any of these instances, it decreases the group's targetSize value accordingly.
     * 
     */
    @InputImport(name="creatingWithoutRetries", required=true)
    private final Integer creatingWithoutRetries;

    public Integer getCreatingWithoutRetries() {
        return this.creatingWithoutRetries;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be deleted or are currently being deleted.
     * 
     */
    @InputImport(name="deleting", required=true)
    private final Integer deleting;

    public Integer getDeleting() {
        return this.deleting;
    }

    /**
     * The number of instances in the managed instance group that are running and have no scheduled actions.
     * 
     */
    @InputImport(name="none", required=true)
    private final Integer none;

    public Integer getNone() {
        return this.none;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be recreated or are currently being being recreated. Recreating an instance deletes the existing root persistent disk and creates a new disk from the image that is defined in the instance template.
     * 
     */
    @InputImport(name="recreating", required=true)
    private final Integer recreating;

    public Integer getRecreating() {
        return this.recreating;
    }

    /**
     * The number of instances in the managed instance group that are being reconfigured with properties that do not require a restart or a recreate action. For example, setting or removing target pools for the instance.
     * 
     */
    @InputImport(name="refreshing", required=true)
    private final Integer refreshing;

    public Integer getRefreshing() {
        return this.refreshing;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be restarted or are currently being restarted.
     * 
     */
    @InputImport(name="restarting", required=true)
    private final Integer restarting;

    public Integer getRestarting() {
        return this.restarting;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be resumed or are currently being resumed.
     * 
     */
    @InputImport(name="resuming", required=true)
    private final Integer resuming;

    public Integer getResuming() {
        return this.resuming;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be started or are currently being started.
     * 
     */
    @InputImport(name="starting", required=true)
    private final Integer starting;

    public Integer getStarting() {
        return this.starting;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be stopped or are currently being stopped.
     * 
     */
    @InputImport(name="stopping", required=true)
    private final Integer stopping;

    public Integer getStopping() {
        return this.stopping;
    }

    /**
     * The number of instances in the managed instance group that are scheduled to be suspended or are currently being suspended.
     * 
     */
    @InputImport(name="suspending", required=true)
    private final Integer suspending;

    public Integer getSuspending() {
        return this.suspending;
    }

    /**
     * The number of instances in the managed instance group that are being verified. See the managedInstances[].currentAction property in the listManagedInstances method documentation.
     * 
     */
    @InputImport(name="verifying", required=true)
    private final Integer verifying;

    public Integer getVerifying() {
        return this.verifying;
    }

    public InstanceGroupManagerActionsSummaryResponse(
        Integer abandoning,
        Integer creating,
        Integer creatingWithoutRetries,
        Integer deleting,
        Integer none,
        Integer recreating,
        Integer refreshing,
        Integer restarting,
        Integer resuming,
        Integer starting,
        Integer stopping,
        Integer suspending,
        Integer verifying) {
        this.abandoning = Objects.requireNonNull(abandoning, "expected parameter 'abandoning' to be non-null");
        this.creating = Objects.requireNonNull(creating, "expected parameter 'creating' to be non-null");
        this.creatingWithoutRetries = Objects.requireNonNull(creatingWithoutRetries, "expected parameter 'creatingWithoutRetries' to be non-null");
        this.deleting = Objects.requireNonNull(deleting, "expected parameter 'deleting' to be non-null");
        this.none = Objects.requireNonNull(none, "expected parameter 'none' to be non-null");
        this.recreating = Objects.requireNonNull(recreating, "expected parameter 'recreating' to be non-null");
        this.refreshing = Objects.requireNonNull(refreshing, "expected parameter 'refreshing' to be non-null");
        this.restarting = Objects.requireNonNull(restarting, "expected parameter 'restarting' to be non-null");
        this.resuming = Objects.requireNonNull(resuming, "expected parameter 'resuming' to be non-null");
        this.starting = Objects.requireNonNull(starting, "expected parameter 'starting' to be non-null");
        this.stopping = Objects.requireNonNull(stopping, "expected parameter 'stopping' to be non-null");
        this.suspending = Objects.requireNonNull(suspending, "expected parameter 'suspending' to be non-null");
        this.verifying = Objects.requireNonNull(verifying, "expected parameter 'verifying' to be non-null");
    }

    private InstanceGroupManagerActionsSummaryResponse() {
        this.abandoning = null;
        this.creating = null;
        this.creatingWithoutRetries = null;
        this.deleting = null;
        this.none = null;
        this.recreating = null;
        this.refreshing = null;
        this.restarting = null;
        this.resuming = null;
        this.starting = null;
        this.stopping = null;
        this.suspending = null;
        this.verifying = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerActionsSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer abandoning;
        private Integer creating;
        private Integer creatingWithoutRetries;
        private Integer deleting;
        private Integer none;
        private Integer recreating;
        private Integer refreshing;
        private Integer restarting;
        private Integer resuming;
        private Integer starting;
        private Integer stopping;
        private Integer suspending;
        private Integer verifying;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerActionsSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abandoning = defaults.abandoning;
    	      this.creating = defaults.creating;
    	      this.creatingWithoutRetries = defaults.creatingWithoutRetries;
    	      this.deleting = defaults.deleting;
    	      this.none = defaults.none;
    	      this.recreating = defaults.recreating;
    	      this.refreshing = defaults.refreshing;
    	      this.restarting = defaults.restarting;
    	      this.resuming = defaults.resuming;
    	      this.starting = defaults.starting;
    	      this.stopping = defaults.stopping;
    	      this.suspending = defaults.suspending;
    	      this.verifying = defaults.verifying;
        }

        public Builder setAbandoning(Integer abandoning) {
            this.abandoning = Objects.requireNonNull(abandoning);
            return this;
        }

        public Builder setCreating(Integer creating) {
            this.creating = Objects.requireNonNull(creating);
            return this;
        }

        public Builder setCreatingWithoutRetries(Integer creatingWithoutRetries) {
            this.creatingWithoutRetries = Objects.requireNonNull(creatingWithoutRetries);
            return this;
        }

        public Builder setDeleting(Integer deleting) {
            this.deleting = Objects.requireNonNull(deleting);
            return this;
        }

        public Builder setNone(Integer none) {
            this.none = Objects.requireNonNull(none);
            return this;
        }

        public Builder setRecreating(Integer recreating) {
            this.recreating = Objects.requireNonNull(recreating);
            return this;
        }

        public Builder setRefreshing(Integer refreshing) {
            this.refreshing = Objects.requireNonNull(refreshing);
            return this;
        }

        public Builder setRestarting(Integer restarting) {
            this.restarting = Objects.requireNonNull(restarting);
            return this;
        }

        public Builder setResuming(Integer resuming) {
            this.resuming = Objects.requireNonNull(resuming);
            return this;
        }

        public Builder setStarting(Integer starting) {
            this.starting = Objects.requireNonNull(starting);
            return this;
        }

        public Builder setStopping(Integer stopping) {
            this.stopping = Objects.requireNonNull(stopping);
            return this;
        }

        public Builder setSuspending(Integer suspending) {
            this.suspending = Objects.requireNonNull(suspending);
            return this;
        }

        public Builder setVerifying(Integer verifying) {
            this.verifying = Objects.requireNonNull(verifying);
            return this;
        }

        public InstanceGroupManagerActionsSummaryResponse build() {
            return new InstanceGroupManagerActionsSummaryResponse(abandoning, creating, creatingWithoutRetries, deleting, none, recreating, refreshing, restarting, resuming, starting, stopping, suspending, verifying);
        }
    }
}
