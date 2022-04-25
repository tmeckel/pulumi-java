// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.OsType;
import com.pulumi.azurenative.machinelearningservices.enums.RemoteLoginPortPublicAccess;
import com.pulumi.azurenative.machinelearningservices.enums.VmPriority;
import com.pulumi.azurenative.machinelearningservices.inputs.ResourceIdArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.ScaleSettingsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.UserAccountCredentialsArgs;
import com.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineImageArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AML Compute properties
 * 
 */
public final class AmlComputePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmlComputePropertiesArgs Empty = new AmlComputePropertiesArgs();

    /**
     * Enable or disable node public IP address provisioning. Possible values are: Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates that the compute nodes will have a private endpoint and no public IPs.
     * 
     */
    @Import(name="enableNodePublicIp")
    private @Nullable Output<Boolean> enableNodePublicIp;

    /**
     * @return Enable or disable node public IP address provisioning. Possible values are: Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates that the compute nodes will have a private endpoint and no public IPs.
     * 
     */
    public Optional<Output<Boolean>> enableNodePublicIp() {
        return Optional.ofNullable(this.enableNodePublicIp);
    }

    /**
     * Network is isolated or not
     * 
     */
    @Import(name="isolatedNetwork")
    private @Nullable Output<Boolean> isolatedNetwork;

    /**
     * @return Network is isolated or not
     * 
     */
    public Optional<Output<Boolean>> isolatedNetwork() {
        return Optional.ofNullable(this.isolatedNetwork);
    }

    /**
     * Compute OS Type
     * 
     */
    @Import(name="osType")
    private @Nullable Output<Either<String,OsType>> osType;

    /**
     * @return Compute OS Type
     * 
     */
    public Optional<Output<Either<String,OsType>>> osType() {
        return Optional.ofNullable(this.osType);
    }

    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
     * 
     */
    @Import(name="remoteLoginPortPublicAccess")
    private @Nullable Output<Either<String,RemoteLoginPortPublicAccess>> remoteLoginPortPublicAccess;

    /**
     * @return State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
     * 
     */
    public Optional<Output<Either<String,RemoteLoginPortPublicAccess>>> remoteLoginPortPublicAccess() {
        return Optional.ofNullable(this.remoteLoginPortPublicAccess);
    }

    /**
     * Scale settings for AML Compute
     * 
     */
    @Import(name="scaleSettings")
    private @Nullable Output<ScaleSettingsArgs> scaleSettings;

    /**
     * @return Scale settings for AML Compute
     * 
     */
    public Optional<Output<ScaleSettingsArgs>> scaleSettings() {
        return Optional.ofNullable(this.scaleSettings);
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    @Import(name="subnet")
    private @Nullable Output<ResourceIdArgs> subnet;

    /**
     * @return Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    public Optional<Output<ResourceIdArgs>> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * Credentials for an administrator user account that will be created on each compute node.
     * 
     */
    @Import(name="userAccountCredentials")
    private @Nullable Output<UserAccountCredentialsArgs> userAccountCredentials;

    /**
     * @return Credentials for an administrator user account that will be created on each compute node.
     * 
     */
    public Optional<Output<UserAccountCredentialsArgs>> userAccountCredentials() {
        return Optional.ofNullable(this.userAccountCredentials);
    }

    /**
     * Virtual Machine image for AML Compute - windows only
     * 
     */
    @Import(name="virtualMachineImage")
    private @Nullable Output<VirtualMachineImageArgs> virtualMachineImage;

    /**
     * @return Virtual Machine image for AML Compute - windows only
     * 
     */
    public Optional<Output<VirtualMachineImageArgs>> virtualMachineImage() {
        return Optional.ofNullable(this.virtualMachineImage);
    }

    /**
     * Virtual Machine priority
     * 
     */
    @Import(name="vmPriority")
    private @Nullable Output<Either<String,VmPriority>> vmPriority;

    /**
     * @return Virtual Machine priority
     * 
     */
    public Optional<Output<Either<String,VmPriority>>> vmPriority() {
        return Optional.ofNullable(this.vmPriority);
    }

    /**
     * Virtual Machine Size
     * 
     */
    @Import(name="vmSize")
    private @Nullable Output<String> vmSize;

    /**
     * @return Virtual Machine Size
     * 
     */
    public Optional<Output<String>> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    private AmlComputePropertiesArgs() {}

    private AmlComputePropertiesArgs(AmlComputePropertiesArgs $) {
        this.enableNodePublicIp = $.enableNodePublicIp;
        this.isolatedNetwork = $.isolatedNetwork;
        this.osType = $.osType;
        this.remoteLoginPortPublicAccess = $.remoteLoginPortPublicAccess;
        this.scaleSettings = $.scaleSettings;
        this.subnet = $.subnet;
        this.userAccountCredentials = $.userAccountCredentials;
        this.virtualMachineImage = $.virtualMachineImage;
        this.vmPriority = $.vmPriority;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmlComputePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmlComputePropertiesArgs $;

        public Builder() {
            $ = new AmlComputePropertiesArgs();
        }

        public Builder(AmlComputePropertiesArgs defaults) {
            $ = new AmlComputePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableNodePublicIp Enable or disable node public IP address provisioning. Possible values are: Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates that the compute nodes will have a private endpoint and no public IPs.
         * 
         * @return builder
         * 
         */
        public Builder enableNodePublicIp(@Nullable Output<Boolean> enableNodePublicIp) {
            $.enableNodePublicIp = enableNodePublicIp;
            return this;
        }

        /**
         * @param enableNodePublicIp Enable or disable node public IP address provisioning. Possible values are: Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates that the compute nodes will have a private endpoint and no public IPs.
         * 
         * @return builder
         * 
         */
        public Builder enableNodePublicIp(Boolean enableNodePublicIp) {
            return enableNodePublicIp(Output.of(enableNodePublicIp));
        }

        /**
         * @param isolatedNetwork Network is isolated or not
         * 
         * @return builder
         * 
         */
        public Builder isolatedNetwork(@Nullable Output<Boolean> isolatedNetwork) {
            $.isolatedNetwork = isolatedNetwork;
            return this;
        }

        /**
         * @param isolatedNetwork Network is isolated or not
         * 
         * @return builder
         * 
         */
        public Builder isolatedNetwork(Boolean isolatedNetwork) {
            return isolatedNetwork(Output.of(isolatedNetwork));
        }

        /**
         * @param osType Compute OS Type
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable Output<Either<String,OsType>> osType) {
            $.osType = osType;
            return this;
        }

        /**
         * @param osType Compute OS Type
         * 
         * @return builder
         * 
         */
        public Builder osType(Either<String,OsType> osType) {
            return osType(Output.of(osType));
        }

        /**
         * @param osType Compute OS Type
         * 
         * @return builder
         * 
         */
        public Builder osType(String osType) {
            return osType(Either.ofLeft(osType));
        }

        /**
         * @param osType Compute OS Type
         * 
         * @return builder
         * 
         */
        public Builder osType(OsType osType) {
            return osType(Either.ofRight(osType));
        }

        /**
         * @param remoteLoginPortPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder remoteLoginPortPublicAccess(@Nullable Output<Either<String,RemoteLoginPortPublicAccess>> remoteLoginPortPublicAccess) {
            $.remoteLoginPortPublicAccess = remoteLoginPortPublicAccess;
            return this;
        }

        /**
         * @param remoteLoginPortPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder remoteLoginPortPublicAccess(Either<String,RemoteLoginPortPublicAccess> remoteLoginPortPublicAccess) {
            return remoteLoginPortPublicAccess(Output.of(remoteLoginPortPublicAccess));
        }

        /**
         * @param remoteLoginPortPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder remoteLoginPortPublicAccess(String remoteLoginPortPublicAccess) {
            return remoteLoginPortPublicAccess(Either.ofLeft(remoteLoginPortPublicAccess));
        }

        /**
         * @param remoteLoginPortPublicAccess State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder remoteLoginPortPublicAccess(RemoteLoginPortPublicAccess remoteLoginPortPublicAccess) {
            return remoteLoginPortPublicAccess(Either.ofRight(remoteLoginPortPublicAccess));
        }

        /**
         * @param scaleSettings Scale settings for AML Compute
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(@Nullable Output<ScaleSettingsArgs> scaleSettings) {
            $.scaleSettings = scaleSettings;
            return this;
        }

        /**
         * @param scaleSettings Scale settings for AML Compute
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(ScaleSettingsArgs scaleSettings) {
            return scaleSettings(Output.of(scaleSettings));
        }

        /**
         * @param subnet Virtual network subnet resource ID the compute nodes belong to.
         * 
         * @return builder
         * 
         */
        public Builder subnet(@Nullable Output<ResourceIdArgs> subnet) {
            $.subnet = subnet;
            return this;
        }

        /**
         * @param subnet Virtual network subnet resource ID the compute nodes belong to.
         * 
         * @return builder
         * 
         */
        public Builder subnet(ResourceIdArgs subnet) {
            return subnet(Output.of(subnet));
        }

        /**
         * @param userAccountCredentials Credentials for an administrator user account that will be created on each compute node.
         * 
         * @return builder
         * 
         */
        public Builder userAccountCredentials(@Nullable Output<UserAccountCredentialsArgs> userAccountCredentials) {
            $.userAccountCredentials = userAccountCredentials;
            return this;
        }

        /**
         * @param userAccountCredentials Credentials for an administrator user account that will be created on each compute node.
         * 
         * @return builder
         * 
         */
        public Builder userAccountCredentials(UserAccountCredentialsArgs userAccountCredentials) {
            return userAccountCredentials(Output.of(userAccountCredentials));
        }

        /**
         * @param virtualMachineImage Virtual Machine image for AML Compute - windows only
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineImage(@Nullable Output<VirtualMachineImageArgs> virtualMachineImage) {
            $.virtualMachineImage = virtualMachineImage;
            return this;
        }

        /**
         * @param virtualMachineImage Virtual Machine image for AML Compute - windows only
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineImage(VirtualMachineImageArgs virtualMachineImage) {
            return virtualMachineImage(Output.of(virtualMachineImage));
        }

        /**
         * @param vmPriority Virtual Machine priority
         * 
         * @return builder
         * 
         */
        public Builder vmPriority(@Nullable Output<Either<String,VmPriority>> vmPriority) {
            $.vmPriority = vmPriority;
            return this;
        }

        /**
         * @param vmPriority Virtual Machine priority
         * 
         * @return builder
         * 
         */
        public Builder vmPriority(Either<String,VmPriority> vmPriority) {
            return vmPriority(Output.of(vmPriority));
        }

        /**
         * @param vmPriority Virtual Machine priority
         * 
         * @return builder
         * 
         */
        public Builder vmPriority(String vmPriority) {
            return vmPriority(Either.ofLeft(vmPriority));
        }

        /**
         * @param vmPriority Virtual Machine priority
         * 
         * @return builder
         * 
         */
        public Builder vmPriority(VmPriority vmPriority) {
            return vmPriority(Either.ofRight(vmPriority));
        }

        /**
         * @param vmSize Virtual Machine Size
         * 
         * @return builder
         * 
         */
        public Builder vmSize(@Nullable Output<String> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        /**
         * @param vmSize Virtual Machine Size
         * 
         * @return builder
         * 
         */
        public Builder vmSize(String vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public AmlComputePropertiesArgs build() {
            $.enableNodePublicIp = Codegen.booleanProp("enableNodePublicIp").output().arg($.enableNodePublicIp).def(true).getNullable();
            $.osType = Codegen.stringProp("osType").left(OsType.class).output().arg($.osType).def("Linux").getNullable();
            $.remoteLoginPortPublicAccess = Codegen.stringProp("remoteLoginPortPublicAccess").left(RemoteLoginPortPublicAccess.class).output().arg($.remoteLoginPortPublicAccess).def("NotSpecified").getNullable();
            return $;
        }
    }

}
