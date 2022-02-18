// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.vmmigration_v1alpha1.MigratingVmArgs;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.CloneJobResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.ComputeEngineTargetDefaultsResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.CutoverJobResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.ReplicationCycleResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.ReplicationSyncResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.SchedulePolicyResponse;
import io.pulumi.googlenative.vmmigration_v1alpha1.outputs.StatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new MigratingVm in a given Source.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:vmmigration/v1alpha1:MigratingVm")
public class MigratingVm extends io.pulumi.resources.CustomResource {
    /**
     * Details of the target VM in Compute Engine.
     * 
     */
    @OutputExport(name="computeEngineTargetDefaults", type=ComputeEngineTargetDefaultsResponse.class, parameters={})
    private Output<ComputeEngineTargetDefaultsResponse> computeEngineTargetDefaults;

    /**
     * @return Details of the target VM in Compute Engine.
     * 
     */
    public Output<ComputeEngineTargetDefaultsResponse> getComputeEngineTargetDefaults() {
        return this.computeEngineTargetDefaults;
    }
    /**
     * The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the migrating VM was created (this refers to this resource and not to the time it was installed in the source).
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The percentage progress of the current running replication cycle.
     * 
     */
    @OutputExport(name="currentSyncInfo", type=ReplicationCycleResponse.class, parameters={})
    private Output<ReplicationCycleResponse> currentSyncInfo;

    /**
     * @return The percentage progress of the current running replication cycle.
     * 
     */
    public Output<ReplicationCycleResponse> getCurrentSyncInfo() {
        return this.currentSyncInfo;
    }
    /**
     * The description attached to the migrating VM by the user.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description attached to the migrating VM by the user.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The display name attached to the MigratingVm by the user.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name attached to the MigratingVm by the user.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Provides details on the state of the Migrating VM in case of an error in replication.
     * 
     */
    @OutputExport(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return Provides details on the state of the Migrating VM in case of an error in replication.
     * 
     */
    public Output<StatusResponse> getError() {
        return this.error;
    }
    /**
     * The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
     * 
     */
    @OutputExport(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return The group this migrating vm is included in, if any. The group is represented by the full path of the appropriate Group resource.
     * 
     */
    public Output<String> getGroup() {
        return this.group;
    }
    /**
     * The labels of the migrating VM.
     * 
     */
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels of the migrating VM.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The most updated snapshot created time in the source that finished replication.
     * 
     */
    @OutputExport(name="lastSync", type=ReplicationSyncResponse.class, parameters={})
    private Output<ReplicationSyncResponse> lastSync;

    /**
     * @return The most updated snapshot created time in the source that finished replication.
     * 
     */
    public Output<ReplicationSyncResponse> getLastSync() {
        return this.lastSync;
    }
    /**
     * The identifier of the MigratingVm.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The identifier of the MigratingVm.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The replication schedule policy.
     * 
     */
    @OutputExport(name="policy", type=SchedulePolicyResponse.class, parameters={})
    private Output<SchedulePolicyResponse> policy;

    /**
     * @return The replication schedule policy.
     * 
     */
    public Output<SchedulePolicyResponse> getPolicy() {
        return this.policy;
    }
    /**
     * The recent clone jobs performed on the migrating VM. This field holds the vm's last completed clone job and the vm's running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the "view" parameter of the Get/List request.
     * 
     */
    @OutputExport(name="recentCloneJobs", type=List.class, parameters={CloneJobResponse.class})
    private Output<List<CloneJobResponse>> recentCloneJobs;

    /**
     * @return The recent clone jobs performed on the migrating VM. This field holds the vm's last completed clone job and the vm's running clone job, if one exists. Note: To have this field populated you need to explicitly request it via the "view" parameter of the Get/List request.
     * 
     */
    public Output<List<CloneJobResponse>> getRecentCloneJobs() {
        return this.recentCloneJobs;
    }
    /**
     * The recent cutover jobs performed on the migrating VM. This field holds the vm's last completed cutover job and the vm's running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the "view" parameter of the Get/List request.
     * 
     */
    @OutputExport(name="recentCutoverJobs", type=List.class, parameters={CutoverJobResponse.class})
    private Output<List<CutoverJobResponse>> recentCutoverJobs;

    /**
     * @return The recent cutover jobs performed on the migrating VM. This field holds the vm's last completed cutover job and the vm's running cutover job, if one exists. Note: To have this field populated you need to explicitly request it via the "view" parameter of the Get/List request.
     * 
     */
    public Output<List<CutoverJobResponse>> getRecentCutoverJobs() {
        return this.recentCutoverJobs;
    }
    /**
     * The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not the VM's name but rather its moRef id. This id is of the form vm-.
     * 
     */
    @OutputExport(name="sourceVmId", type=String.class, parameters={})
    private Output<String> sourceVmId;

    /**
     * @return The unique ID of the VM in the source. The VM's name in vSphere can be changed, so this is not the VM's name but rather its moRef id. This id is of the form vm-.
     * 
     */
    public Output<String> getSourceVmId() {
        return this.sourceVmId;
    }
    /**
     * State of the MigratingVm.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the MigratingVm.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The last time the migrating VM state was updated.
     * 
     */
    @OutputExport(name="stateTime", type=String.class, parameters={})
    private Output<String> stateTime;

    /**
     * @return The last time the migrating VM state was updated.
     * 
     */
    public Output<String> getStateTime() {
        return this.stateTime;
    }
    /**
     * The last time the migrating VM resource was updated.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last time the migrating VM resource was updated.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MigratingVm(String name, MigratingVmArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:MigratingVm", name, args == null ? MigratingVmArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MigratingVm(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:vmmigration/v1alpha1:MigratingVm", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static MigratingVm get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MigratingVm(name, id, options);
    }
}
