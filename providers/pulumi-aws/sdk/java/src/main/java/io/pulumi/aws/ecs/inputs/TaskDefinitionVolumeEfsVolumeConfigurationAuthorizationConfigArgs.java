// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs Empty = new TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs();

    /**
     * Access point ID to use. If an access point is specified, the root directory value will be relative to the directory set for the access point. If specified, transit encryption must be enabled in the EFSVolumeConfiguration.
     * 
     */
    @InputImport(name="accessPointId")
      private final @Nullable Input<String> accessPointId;

    public Input<String> getAccessPointId() {
        return this.accessPointId == null ? Input.empty() : this.accessPointId;
    }

    /**
     * Whether or not to use the Amazon ECS task IAM role defined in a task definition when mounting the Amazon EFS file system. If enabled, transit encryption must be enabled in the EFSVolumeConfiguration. Valid values: `ENABLED`, `DISABLED`. If this parameter is omitted, the default value of `DISABLED` is used.
     * 
     */
    @InputImport(name="iam")
      private final @Nullable Input<String> iam;

    public Input<String> getIam() {
        return this.iam == null ? Input.empty() : this.iam;
    }

    public TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs(
        @Nullable Input<String> accessPointId,
        @Nullable Input<String> iam) {
        this.accessPointId = accessPointId;
        this.iam = iam;
    }

    private TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs() {
        this.accessPointId = Input.empty();
        this.iam = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessPointId;
        private @Nullable Input<String> iam;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointId = defaults.accessPointId;
    	      this.iam = defaults.iam;
        }

        public Builder accessPointId(@Nullable Input<String> accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        public Builder accessPointId(@Nullable String accessPointId) {
            this.accessPointId = Input.ofNullable(accessPointId);
            return this;
        }

        public Builder iam(@Nullable Input<String> iam) {
            this.iam = iam;
            return this;
        }

        public Builder iam(@Nullable String iam) {
            this.iam = Input.ofNullable(iam);
            return this;
        }
        public TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs build() {
            return new TaskDefinitionVolumeEfsVolumeConfigurationAuthorizationConfigArgs(accessPointId, iam);
        }
    }
}
