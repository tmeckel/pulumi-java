// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.metastore_v1alpha.BackupArgs;
import io.pulumi.googlenative.metastore_v1alpha.outputs.ServiceResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new backup in a given project and location.
 * 
 */
@ResourceType(type="google-native:metastore/v1alpha:Backup")
public class Backup extends io.pulumi.resources.CustomResource {
    /**
     * The time when the backup was started.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the backup was started.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The description of the backup.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the backup.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The time when the backup finished creating.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return The time when the backup finished creating.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The relative resource name of the backup, in the following form:projects/{project_number}/locations/{location_id}/services/{service_id}/backups/{backup_id}
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Services that are restoring from the backup.
     * 
     */
    @OutputExport(name="restoringServices", type=List.class, parameters={String.class})
    private Output<List<String>> restoringServices;

    /**
     * @return Services that are restoring from the backup.
     * 
     */
    public Output<List<String>> getRestoringServices() {
        return this.restoringServices;
    }
    /**
     * The revision of the service at the time of backup.
     * 
     */
    @OutputExport(name="serviceRevision", type=ServiceResponse.class, parameters={})
    private Output<ServiceResponse> serviceRevision;

    /**
     * @return The revision of the service at the time of backup.
     * 
     */
    public Output<ServiceResponse> getServiceRevision() {
        return this.serviceRevision;
    }
    /**
     * The current state of the backup.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the backup.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Backup(String name, BackupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1alpha:Backup", name, args == null ? BackupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Backup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:metastore/v1alpha:Backup", name, null, makeResourceOptions(options, id));
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
    public static Backup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Backup(name, id, options);
    }
}
