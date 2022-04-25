// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointIscseArgs;
import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointManagementArgs;
import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointNfArgs;
import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineEndpointSmbArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OntapStorageVirtualMachineEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final OntapStorageVirtualMachineEndpointArgs Empty = new OntapStorageVirtualMachineEndpointArgs();

    /**
     * An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * 
     */
    @Import(name="iscses")
    private @Nullable Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses;

    /**
     * @return An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
     * 
     */
    public Optional<Output<List<OntapStorageVirtualMachineEndpointIscseArgs>>> iscses() {
        return Optional.ofNullable(this.iscses);
    }

    /**
     * An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    @Import(name="managements")
    private @Nullable Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements;

    /**
     * @return An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
     * 
     */
    public Optional<Output<List<OntapStorageVirtualMachineEndpointManagementArgs>>> managements() {
        return Optional.ofNullable(this.managements);
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * 
     */
    @Import(name="nfs")
    private @Nullable Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs;

    /**
     * @return An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
     * 
     */
    public Optional<Output<List<OntapStorageVirtualMachineEndpointNfArgs>>> nfs() {
        return Optional.ofNullable(this.nfs);
    }

    /**
     * An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
     * 
     */
    @Import(name="smbs")
    private @Nullable Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs;

    /**
     * @return An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
     * 
     */
    public Optional<Output<List<OntapStorageVirtualMachineEndpointSmbArgs>>> smbs() {
        return Optional.ofNullable(this.smbs);
    }

    private OntapStorageVirtualMachineEndpointArgs() {}

    private OntapStorageVirtualMachineEndpointArgs(OntapStorageVirtualMachineEndpointArgs $) {
        this.iscses = $.iscses;
        this.managements = $.managements;
        this.nfs = $.nfs;
        this.smbs = $.smbs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OntapStorageVirtualMachineEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OntapStorageVirtualMachineEndpointArgs $;

        public Builder() {
            $ = new OntapStorageVirtualMachineEndpointArgs();
        }

        public Builder(OntapStorageVirtualMachineEndpointArgs defaults) {
            $ = new OntapStorageVirtualMachineEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param iscses An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder iscses(@Nullable Output<List<OntapStorageVirtualMachineEndpointIscseArgs>> iscses) {
            $.iscses = iscses;
            return this;
        }

        /**
         * @param iscses An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder iscses(List<OntapStorageVirtualMachineEndpointIscseArgs> iscses) {
            return iscses(Output.of(iscses));
        }

        /**
         * @param iscses An endpoint for accessing data on your storage virtual machine via iSCSI protocol. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder iscses(OntapStorageVirtualMachineEndpointIscseArgs... iscses) {
            return iscses(List.of(iscses));
        }

        /**
         * @param managements An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managements(@Nullable Output<List<OntapStorageVirtualMachineEndpointManagementArgs>> managements) {
            $.managements = managements;
            return this;
        }

        /**
         * @param managements An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managements(List<OntapStorageVirtualMachineEndpointManagementArgs> managements) {
            return managements(Output.of(managements));
        }

        /**
         * @param managements An endpoint for managing your file system using the NetApp ONTAP CLI and NetApp ONTAP API. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managements(OntapStorageVirtualMachineEndpointManagementArgs... managements) {
            return managements(List.of(managements));
        }

        /**
         * @param nfs An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder nfs(@Nullable Output<List<OntapStorageVirtualMachineEndpointNfArgs>> nfs) {
            $.nfs = nfs;
            return this;
        }

        /**
         * @param nfs An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder nfs(List<OntapStorageVirtualMachineEndpointNfArgs> nfs) {
            return nfs(Output.of(nfs));
        }

        /**
         * @param nfs An endpoint for accessing data on your storage virtual machine via NFS protocol. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder nfs(OntapStorageVirtualMachineEndpointNfArgs... nfs) {
            return nfs(List.of(nfs));
        }

        /**
         * @param smbs An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder smbs(@Nullable Output<List<OntapStorageVirtualMachineEndpointSmbArgs>> smbs) {
            $.smbs = smbs;
            return this;
        }

        /**
         * @param smbs An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder smbs(List<OntapStorageVirtualMachineEndpointSmbArgs> smbs) {
            return smbs(Output.of(smbs));
        }

        /**
         * @param smbs An endpoint for accessing data on your storage virtual machine via SMB protocol. This is only set if an active_directory_configuration has been set. See Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder smbs(OntapStorageVirtualMachineEndpointSmbArgs... smbs) {
            return smbs(List.of(smbs));
        }

        public OntapStorageVirtualMachineEndpointArgs build() {
            return $;
        }
    }

}
