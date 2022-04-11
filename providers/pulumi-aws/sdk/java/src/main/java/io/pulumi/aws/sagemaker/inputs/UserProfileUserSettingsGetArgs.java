// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsJupyterServerAppSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsKernelGatewayAppSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsSharingSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserProfileUserSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsGetArgs Empty = new UserProfileUserSettingsGetArgs();

    /**
     * The execution role ARN for the user.
     * 
     */
    @Import(name="executionRole", required=true)
      private final Output<String> executionRole;

    public Output<String> getExecutionRole() {
        return this.executionRole;
    }

    /**
     * The Jupyter server's app settings. See Jupyter Server App Settings below.
     * 
     */
    @Import(name="jupyterServerAppSettings")
      private final @Nullable Output<UserProfileUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings;

    public Output<UserProfileUserSettingsJupyterServerAppSettingsGetArgs> getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings == null ? Codegen.empty() : this.jupyterServerAppSettings;
    }

    /**
     * The kernel gateway app settings. See Kernel Gateway App Settings below.
     * 
     */
    @Import(name="kernelGatewayAppSettings")
      private final @Nullable Output<UserProfileUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings;

    public Output<UserProfileUserSettingsKernelGatewayAppSettingsGetArgs> getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings == null ? Codegen.empty() : this.kernelGatewayAppSettings;
    }

    /**
     * The security groups.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * The sharing settings. See Sharing Settings below.
     * 
     */
    @Import(name="sharingSettings")
      private final @Nullable Output<UserProfileUserSettingsSharingSettingsGetArgs> sharingSettings;

    public Output<UserProfileUserSettingsSharingSettingsGetArgs> getSharingSettings() {
        return this.sharingSettings == null ? Codegen.empty() : this.sharingSettings;
    }

    /**
     * The TensorBoard app settings. See TensorBoard App Settings below.
     * 
     */
    @Import(name="tensorBoardAppSettings")
      private final @Nullable Output<UserProfileUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings;

    public Output<UserProfileUserSettingsTensorBoardAppSettingsGetArgs> getTensorBoardAppSettings() {
        return this.tensorBoardAppSettings == null ? Codegen.empty() : this.tensorBoardAppSettings;
    }

    public UserProfileUserSettingsGetArgs(
        Output<String> executionRole,
        @Nullable Output<UserProfileUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings,
        @Nullable Output<UserProfileUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<UserProfileUserSettingsSharingSettingsGetArgs> sharingSettings,
        @Nullable Output<UserProfileUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings) {
        this.executionRole = Objects.requireNonNull(executionRole, "expected parameter 'executionRole' to be non-null");
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
        this.tensorBoardAppSettings = tensorBoardAppSettings;
    }

    private UserProfileUserSettingsGetArgs() {
        this.executionRole = Codegen.empty();
        this.jupyterServerAppSettings = Codegen.empty();
        this.kernelGatewayAppSettings = Codegen.empty();
        this.securityGroups = Codegen.empty();
        this.sharingSettings = Codegen.empty();
        this.tensorBoardAppSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> executionRole;
        private @Nullable Output<UserProfileUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings;
        private @Nullable Output<UserProfileUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<UserProfileUserSettingsSharingSettingsGetArgs> sharingSettings;
        private @Nullable Output<UserProfileUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
    	      this.tensorBoardAppSettings = defaults.tensorBoardAppSettings;
        }

        public Builder executionRole(Output<String> executionRole) {
            this.executionRole = Objects.requireNonNull(executionRole);
            return this;
        }
        public Builder executionRole(String executionRole) {
            this.executionRole = Output.of(Objects.requireNonNull(executionRole));
            return this;
        }
        public Builder jupyterServerAppSettings(@Nullable Output<UserProfileUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }
        public Builder jupyterServerAppSettings(@Nullable UserProfileUserSettingsJupyterServerAppSettingsGetArgs jupyterServerAppSettings) {
            this.jupyterServerAppSettings = Codegen.ofNullable(jupyterServerAppSettings);
            return this;
        }
        public Builder kernelGatewayAppSettings(@Nullable Output<UserProfileUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }
        public Builder kernelGatewayAppSettings(@Nullable UserProfileUserSettingsKernelGatewayAppSettingsGetArgs kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = Codegen.ofNullable(kernelGatewayAppSettings);
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sharingSettings(@Nullable Output<UserProfileUserSettingsSharingSettingsGetArgs> sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }
        public Builder sharingSettings(@Nullable UserProfileUserSettingsSharingSettingsGetArgs sharingSettings) {
            this.sharingSettings = Codegen.ofNullable(sharingSettings);
            return this;
        }
        public Builder tensorBoardAppSettings(@Nullable Output<UserProfileUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings) {
            this.tensorBoardAppSettings = tensorBoardAppSettings;
            return this;
        }
        public Builder tensorBoardAppSettings(@Nullable UserProfileUserSettingsTensorBoardAppSettingsGetArgs tensorBoardAppSettings) {
            this.tensorBoardAppSettings = Codegen.ofNullable(tensorBoardAppSettings);
            return this;
        }        public UserProfileUserSettingsGetArgs build() {
            return new UserProfileUserSettingsGetArgs(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings, tensorBoardAppSettings);
        }
    }
}
