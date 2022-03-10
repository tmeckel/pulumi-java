// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.AWSElasticBlockStoreVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.AzureDiskVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.AzureFilePersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.CSIPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.CephFSPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.CinderPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.FCVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.FlexPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.FlockerVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.GCEPersistentDiskVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.GlusterfsPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.HostPathVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ISCSIPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.LocalVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.NFSVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import io.pulumi.kubernetes.core_v1.inputs.PhotonPersistentDiskVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.PortworxVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.QuobyteVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.RBDPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.ScaleIOPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.StorageOSPersistentVolumeSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.VolumeNodeAffinityArgs;
import io.pulumi.kubernetes.core_v1.inputs.VsphereVirtualDiskVolumeSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 * 
 */
public final class PersistentVolumeSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistentVolumeSpecArgs Empty = new PersistentVolumeSpecArgs();

    /**
     * AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
     * 
     */
    @InputImport(name="accessModes")
      private final @Nullable Input<List<String>> accessModes;

    public Input<List<String>> getAccessModes() {
        return this.accessModes == null ? Input.empty() : this.accessModes;
    }

    /**
     * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     * 
     */
    @InputImport(name="awsElasticBlockStore")
      private final @Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore;

    public Input<AWSElasticBlockStoreVolumeSourceArgs> getAwsElasticBlockStore() {
        return this.awsElasticBlockStore == null ? Input.empty() : this.awsElasticBlockStore;
    }

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     * 
     */
    @InputImport(name="azureDisk")
      private final @Nullable Input<AzureDiskVolumeSourceArgs> azureDisk;

    public Input<AzureDiskVolumeSourceArgs> getAzureDisk() {
        return this.azureDisk == null ? Input.empty() : this.azureDisk;
    }

    /**
     * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
     * 
     */
    @InputImport(name="azureFile")
      private final @Nullable Input<AzureFilePersistentVolumeSourceArgs> azureFile;

    public Input<AzureFilePersistentVolumeSourceArgs> getAzureFile() {
        return this.azureFile == null ? Input.empty() : this.azureFile;
    }

    /**
     * A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Map<String,String>> capacity;

    public Input<Map<String,String>> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
     * 
     */
    @InputImport(name="cephfs")
      private final @Nullable Input<CephFSPersistentVolumeSourceArgs> cephfs;

    public Input<CephFSPersistentVolumeSourceArgs> getCephfs() {
        return this.cephfs == null ? Input.empty() : this.cephfs;
    }

    /**
     * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     * 
     */
    @InputImport(name="cinder")
      private final @Nullable Input<CinderPersistentVolumeSourceArgs> cinder;

    public Input<CinderPersistentVolumeSourceArgs> getCinder() {
        return this.cinder == null ? Input.empty() : this.cinder;
    }

    /**
     * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
     * 
     */
    @InputImport(name="claimRef")
      private final @Nullable Input<ObjectReferenceArgs> claimRef;

    public Input<ObjectReferenceArgs> getClaimRef() {
        return this.claimRef == null ? Input.empty() : this.claimRef;
    }

    /**
     * CSI represents storage that is handled by an external CSI driver (Beta feature).
     * 
     */
    @InputImport(name="csi")
      private final @Nullable Input<CSIPersistentVolumeSourceArgs> csi;

    public Input<CSIPersistentVolumeSourceArgs> getCsi() {
        return this.csi == null ? Input.empty() : this.csi;
    }

    /**
     * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     * 
     */
    @InputImport(name="fc")
      private final @Nullable Input<FCVolumeSourceArgs> fc;

    public Input<FCVolumeSourceArgs> getFc() {
        return this.fc == null ? Input.empty() : this.fc;
    }

    /**
     * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     * 
     */
    @InputImport(name="flexVolume")
      private final @Nullable Input<FlexPersistentVolumeSourceArgs> flexVolume;

    public Input<FlexPersistentVolumeSourceArgs> getFlexVolume() {
        return this.flexVolume == null ? Input.empty() : this.flexVolume;
    }

    /**
     * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
     * 
     */
    @InputImport(name="flocker")
      private final @Nullable Input<FlockerVolumeSourceArgs> flocker;

    public Input<FlockerVolumeSourceArgs> getFlocker() {
        return this.flocker == null ? Input.empty() : this.flocker;
    }

    /**
     * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @InputImport(name="gcePersistentDisk")
      private final @Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk;

    public Input<GCEPersistentDiskVolumeSourceArgs> getGcePersistentDisk() {
        return this.gcePersistentDisk == null ? Input.empty() : this.gcePersistentDisk;
    }

    /**
     * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     * 
     */
    @InputImport(name="glusterfs")
      private final @Nullable Input<GlusterfsPersistentVolumeSourceArgs> glusterfs;

    public Input<GlusterfsPersistentVolumeSourceArgs> getGlusterfs() {
        return this.glusterfs == null ? Input.empty() : this.glusterfs;
    }

    /**
     * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     * 
     */
    @InputImport(name="hostPath")
      private final @Nullable Input<HostPathVolumeSourceArgs> hostPath;

    public Input<HostPathVolumeSourceArgs> getHostPath() {
        return this.hostPath == null ? Input.empty() : this.hostPath;
    }

    /**
     * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
     * 
     */
    @InputImport(name="iscsi")
      private final @Nullable Input<ISCSIPersistentVolumeSourceArgs> iscsi;

    public Input<ISCSIPersistentVolumeSourceArgs> getIscsi() {
        return this.iscsi == null ? Input.empty() : this.iscsi;
    }

    /**
     * Local represents directly-attached storage with node affinity
     * 
     */
    @InputImport(name="local")
      private final @Nullable Input<LocalVolumeSourceArgs> local;

    public Input<LocalVolumeSourceArgs> getLocal() {
        return this.local == null ? Input.empty() : this.local;
    }

    /**
     * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
     * 
     */
    @InputImport(name="mountOptions")
      private final @Nullable Input<List<String>> mountOptions;

    public Input<List<String>> getMountOptions() {
        return this.mountOptions == null ? Input.empty() : this.mountOptions;
    }

    /**
     * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     * 
     */
    @InputImport(name="nfs")
      private final @Nullable Input<NFSVolumeSourceArgs> nfs;

    public Input<NFSVolumeSourceArgs> getNfs() {
        return this.nfs == null ? Input.empty() : this.nfs;
    }

    /**
     * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
     * 
     */
    @InputImport(name="nodeAffinity")
      private final @Nullable Input<VolumeNodeAffinityArgs> nodeAffinity;

    public Input<VolumeNodeAffinityArgs> getNodeAffinity() {
        return this.nodeAffinity == null ? Input.empty() : this.nodeAffinity;
    }

    /**
     * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
     * 
     * Possible enum values:
     *  - `"Delete"` means the volume will be deleted from Kubernetes on release from its claim. The volume plugin must support Deletion.
     *  - `"Recycle"` means the volume will be recycled back into the pool of unbound persistent volumes on release from its claim. The volume plugin must support Recycling.
     *  - `"Retain"` means the volume will be left in its current phase (Released) for manual reclamation by the administrator. The default policy is Retain.
     * 
     */
    @InputImport(name="persistentVolumeReclaimPolicy")
      private final @Nullable Input<String> persistentVolumeReclaimPolicy;

    public Input<String> getPersistentVolumeReclaimPolicy() {
        return this.persistentVolumeReclaimPolicy == null ? Input.empty() : this.persistentVolumeReclaimPolicy;
    }

    /**
     * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
     * 
     */
    @InputImport(name="photonPersistentDisk")
      private final @Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk;

    public Input<PhotonPersistentDiskVolumeSourceArgs> getPhotonPersistentDisk() {
        return this.photonPersistentDisk == null ? Input.empty() : this.photonPersistentDisk;
    }

    /**
     * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
     * 
     */
    @InputImport(name="portworxVolume")
      private final @Nullable Input<PortworxVolumeSourceArgs> portworxVolume;

    public Input<PortworxVolumeSourceArgs> getPortworxVolume() {
        return this.portworxVolume == null ? Input.empty() : this.portworxVolume;
    }

    /**
     * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
     * 
     */
    @InputImport(name="quobyte")
      private final @Nullable Input<QuobyteVolumeSourceArgs> quobyte;

    public Input<QuobyteVolumeSourceArgs> getQuobyte() {
        return this.quobyte == null ? Input.empty() : this.quobyte;
    }

    /**
     * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
     * 
     */
    @InputImport(name="rbd")
      private final @Nullable Input<RBDPersistentVolumeSourceArgs> rbd;

    public Input<RBDPersistentVolumeSourceArgs> getRbd() {
        return this.rbd == null ? Input.empty() : this.rbd;
    }

    /**
     * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     * 
     */
    @InputImport(name="scaleIO")
      private final @Nullable Input<ScaleIOPersistentVolumeSourceArgs> scaleIO;

    public Input<ScaleIOPersistentVolumeSourceArgs> getScaleIO() {
        return this.scaleIO == null ? Input.empty() : this.scaleIO;
    }

    /**
     * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
     * 
     */
    @InputImport(name="storageClassName")
      private final @Nullable Input<String> storageClassName;

    public Input<String> getStorageClassName() {
        return this.storageClassName == null ? Input.empty() : this.storageClassName;
    }

    /**
     * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
     * 
     */
    @InputImport(name="storageos")
      private final @Nullable Input<StorageOSPersistentVolumeSourceArgs> storageos;

    public Input<StorageOSPersistentVolumeSourceArgs> getStorageos() {
        return this.storageos == null ? Input.empty() : this.storageos;
    }

    /**
     * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
     * 
     */
    @InputImport(name="volumeMode")
      private final @Nullable Input<String> volumeMode;

    public Input<String> getVolumeMode() {
        return this.volumeMode == null ? Input.empty() : this.volumeMode;
    }

    /**
     * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
     * 
     */
    @InputImport(name="vsphereVolume")
      private final @Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume;

    public Input<VsphereVirtualDiskVolumeSourceArgs> getVsphereVolume() {
        return this.vsphereVolume == null ? Input.empty() : this.vsphereVolume;
    }

    public PersistentVolumeSpecArgs(
        @Nullable Input<List<String>> accessModes,
        @Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore,
        @Nullable Input<AzureDiskVolumeSourceArgs> azureDisk,
        @Nullable Input<AzureFilePersistentVolumeSourceArgs> azureFile,
        @Nullable Input<Map<String,String>> capacity,
        @Nullable Input<CephFSPersistentVolumeSourceArgs> cephfs,
        @Nullable Input<CinderPersistentVolumeSourceArgs> cinder,
        @Nullable Input<ObjectReferenceArgs> claimRef,
        @Nullable Input<CSIPersistentVolumeSourceArgs> csi,
        @Nullable Input<FCVolumeSourceArgs> fc,
        @Nullable Input<FlexPersistentVolumeSourceArgs> flexVolume,
        @Nullable Input<FlockerVolumeSourceArgs> flocker,
        @Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk,
        @Nullable Input<GlusterfsPersistentVolumeSourceArgs> glusterfs,
        @Nullable Input<HostPathVolumeSourceArgs> hostPath,
        @Nullable Input<ISCSIPersistentVolumeSourceArgs> iscsi,
        @Nullable Input<LocalVolumeSourceArgs> local,
        @Nullable Input<List<String>> mountOptions,
        @Nullable Input<NFSVolumeSourceArgs> nfs,
        @Nullable Input<VolumeNodeAffinityArgs> nodeAffinity,
        @Nullable Input<String> persistentVolumeReclaimPolicy,
        @Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk,
        @Nullable Input<PortworxVolumeSourceArgs> portworxVolume,
        @Nullable Input<QuobyteVolumeSourceArgs> quobyte,
        @Nullable Input<RBDPersistentVolumeSourceArgs> rbd,
        @Nullable Input<ScaleIOPersistentVolumeSourceArgs> scaleIO,
        @Nullable Input<String> storageClassName,
        @Nullable Input<StorageOSPersistentVolumeSourceArgs> storageos,
        @Nullable Input<String> volumeMode,
        @Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume) {
        this.accessModes = accessModes;
        this.awsElasticBlockStore = awsElasticBlockStore;
        this.azureDisk = azureDisk;
        this.azureFile = azureFile;
        this.capacity = capacity;
        this.cephfs = cephfs;
        this.cinder = cinder;
        this.claimRef = claimRef;
        this.csi = csi;
        this.fc = fc;
        this.flexVolume = flexVolume;
        this.flocker = flocker;
        this.gcePersistentDisk = gcePersistentDisk;
        this.glusterfs = glusterfs;
        this.hostPath = hostPath;
        this.iscsi = iscsi;
        this.local = local;
        this.mountOptions = mountOptions;
        this.nfs = nfs;
        this.nodeAffinity = nodeAffinity;
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
        this.photonPersistentDisk = photonPersistentDisk;
        this.portworxVolume = portworxVolume;
        this.quobyte = quobyte;
        this.rbd = rbd;
        this.scaleIO = scaleIO;
        this.storageClassName = storageClassName;
        this.storageos = storageos;
        this.volumeMode = volumeMode;
        this.vsphereVolume = vsphereVolume;
    }

    private PersistentVolumeSpecArgs() {
        this.accessModes = Input.empty();
        this.awsElasticBlockStore = Input.empty();
        this.azureDisk = Input.empty();
        this.azureFile = Input.empty();
        this.capacity = Input.empty();
        this.cephfs = Input.empty();
        this.cinder = Input.empty();
        this.claimRef = Input.empty();
        this.csi = Input.empty();
        this.fc = Input.empty();
        this.flexVolume = Input.empty();
        this.flocker = Input.empty();
        this.gcePersistentDisk = Input.empty();
        this.glusterfs = Input.empty();
        this.hostPath = Input.empty();
        this.iscsi = Input.empty();
        this.local = Input.empty();
        this.mountOptions = Input.empty();
        this.nfs = Input.empty();
        this.nodeAffinity = Input.empty();
        this.persistentVolumeReclaimPolicy = Input.empty();
        this.photonPersistentDisk = Input.empty();
        this.portworxVolume = Input.empty();
        this.quobyte = Input.empty();
        this.rbd = Input.empty();
        this.scaleIO = Input.empty();
        this.storageClassName = Input.empty();
        this.storageos = Input.empty();
        this.volumeMode = Input.empty();
        this.vsphereVolume = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accessModes;
        private @Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore;
        private @Nullable Input<AzureDiskVolumeSourceArgs> azureDisk;
        private @Nullable Input<AzureFilePersistentVolumeSourceArgs> azureFile;
        private @Nullable Input<Map<String,String>> capacity;
        private @Nullable Input<CephFSPersistentVolumeSourceArgs> cephfs;
        private @Nullable Input<CinderPersistentVolumeSourceArgs> cinder;
        private @Nullable Input<ObjectReferenceArgs> claimRef;
        private @Nullable Input<CSIPersistentVolumeSourceArgs> csi;
        private @Nullable Input<FCVolumeSourceArgs> fc;
        private @Nullable Input<FlexPersistentVolumeSourceArgs> flexVolume;
        private @Nullable Input<FlockerVolumeSourceArgs> flocker;
        private @Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk;
        private @Nullable Input<GlusterfsPersistentVolumeSourceArgs> glusterfs;
        private @Nullable Input<HostPathVolumeSourceArgs> hostPath;
        private @Nullable Input<ISCSIPersistentVolumeSourceArgs> iscsi;
        private @Nullable Input<LocalVolumeSourceArgs> local;
        private @Nullable Input<List<String>> mountOptions;
        private @Nullable Input<NFSVolumeSourceArgs> nfs;
        private @Nullable Input<VolumeNodeAffinityArgs> nodeAffinity;
        private @Nullable Input<String> persistentVolumeReclaimPolicy;
        private @Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk;
        private @Nullable Input<PortworxVolumeSourceArgs> portworxVolume;
        private @Nullable Input<QuobyteVolumeSourceArgs> quobyte;
        private @Nullable Input<RBDPersistentVolumeSourceArgs> rbd;
        private @Nullable Input<ScaleIOPersistentVolumeSourceArgs> scaleIO;
        private @Nullable Input<String> storageClassName;
        private @Nullable Input<StorageOSPersistentVolumeSourceArgs> storageos;
        private @Nullable Input<String> volumeMode;
        private @Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.awsElasticBlockStore = defaults.awsElasticBlockStore;
    	      this.azureDisk = defaults.azureDisk;
    	      this.azureFile = defaults.azureFile;
    	      this.capacity = defaults.capacity;
    	      this.cephfs = defaults.cephfs;
    	      this.cinder = defaults.cinder;
    	      this.claimRef = defaults.claimRef;
    	      this.csi = defaults.csi;
    	      this.fc = defaults.fc;
    	      this.flexVolume = defaults.flexVolume;
    	      this.flocker = defaults.flocker;
    	      this.gcePersistentDisk = defaults.gcePersistentDisk;
    	      this.glusterfs = defaults.glusterfs;
    	      this.hostPath = defaults.hostPath;
    	      this.iscsi = defaults.iscsi;
    	      this.local = defaults.local;
    	      this.mountOptions = defaults.mountOptions;
    	      this.nfs = defaults.nfs;
    	      this.nodeAffinity = defaults.nodeAffinity;
    	      this.persistentVolumeReclaimPolicy = defaults.persistentVolumeReclaimPolicy;
    	      this.photonPersistentDisk = defaults.photonPersistentDisk;
    	      this.portworxVolume = defaults.portworxVolume;
    	      this.quobyte = defaults.quobyte;
    	      this.rbd = defaults.rbd;
    	      this.scaleIO = defaults.scaleIO;
    	      this.storageClassName = defaults.storageClassName;
    	      this.storageos = defaults.storageos;
    	      this.volumeMode = defaults.volumeMode;
    	      this.vsphereVolume = defaults.vsphereVolume;
        }

        public Builder accessModes(@Nullable Input<List<String>> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        public Builder accessModes(@Nullable List<String> accessModes) {
            this.accessModes = Input.ofNullable(accessModes);
            return this;
        }

        public Builder awsElasticBlockStore(@Nullable Input<AWSElasticBlockStoreVolumeSourceArgs> awsElasticBlockStore) {
            this.awsElasticBlockStore = awsElasticBlockStore;
            return this;
        }

        public Builder awsElasticBlockStore(@Nullable AWSElasticBlockStoreVolumeSourceArgs awsElasticBlockStore) {
            this.awsElasticBlockStore = Input.ofNullable(awsElasticBlockStore);
            return this;
        }

        public Builder azureDisk(@Nullable Input<AzureDiskVolumeSourceArgs> azureDisk) {
            this.azureDisk = azureDisk;
            return this;
        }

        public Builder azureDisk(@Nullable AzureDiskVolumeSourceArgs azureDisk) {
            this.azureDisk = Input.ofNullable(azureDisk);
            return this;
        }

        public Builder azureFile(@Nullable Input<AzureFilePersistentVolumeSourceArgs> azureFile) {
            this.azureFile = azureFile;
            return this;
        }

        public Builder azureFile(@Nullable AzureFilePersistentVolumeSourceArgs azureFile) {
            this.azureFile = Input.ofNullable(azureFile);
            return this;
        }

        public Builder capacity(@Nullable Input<Map<String,String>> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Map<String,String> capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder cephfs(@Nullable Input<CephFSPersistentVolumeSourceArgs> cephfs) {
            this.cephfs = cephfs;
            return this;
        }

        public Builder cephfs(@Nullable CephFSPersistentVolumeSourceArgs cephfs) {
            this.cephfs = Input.ofNullable(cephfs);
            return this;
        }

        public Builder cinder(@Nullable Input<CinderPersistentVolumeSourceArgs> cinder) {
            this.cinder = cinder;
            return this;
        }

        public Builder cinder(@Nullable CinderPersistentVolumeSourceArgs cinder) {
            this.cinder = Input.ofNullable(cinder);
            return this;
        }

        public Builder claimRef(@Nullable Input<ObjectReferenceArgs> claimRef) {
            this.claimRef = claimRef;
            return this;
        }

        public Builder claimRef(@Nullable ObjectReferenceArgs claimRef) {
            this.claimRef = Input.ofNullable(claimRef);
            return this;
        }

        public Builder csi(@Nullable Input<CSIPersistentVolumeSourceArgs> csi) {
            this.csi = csi;
            return this;
        }

        public Builder csi(@Nullable CSIPersistentVolumeSourceArgs csi) {
            this.csi = Input.ofNullable(csi);
            return this;
        }

        public Builder fc(@Nullable Input<FCVolumeSourceArgs> fc) {
            this.fc = fc;
            return this;
        }

        public Builder fc(@Nullable FCVolumeSourceArgs fc) {
            this.fc = Input.ofNullable(fc);
            return this;
        }

        public Builder flexVolume(@Nullable Input<FlexPersistentVolumeSourceArgs> flexVolume) {
            this.flexVolume = flexVolume;
            return this;
        }

        public Builder flexVolume(@Nullable FlexPersistentVolumeSourceArgs flexVolume) {
            this.flexVolume = Input.ofNullable(flexVolume);
            return this;
        }

        public Builder flocker(@Nullable Input<FlockerVolumeSourceArgs> flocker) {
            this.flocker = flocker;
            return this;
        }

        public Builder flocker(@Nullable FlockerVolumeSourceArgs flocker) {
            this.flocker = Input.ofNullable(flocker);
            return this;
        }

        public Builder gcePersistentDisk(@Nullable Input<GCEPersistentDiskVolumeSourceArgs> gcePersistentDisk) {
            this.gcePersistentDisk = gcePersistentDisk;
            return this;
        }

        public Builder gcePersistentDisk(@Nullable GCEPersistentDiskVolumeSourceArgs gcePersistentDisk) {
            this.gcePersistentDisk = Input.ofNullable(gcePersistentDisk);
            return this;
        }

        public Builder glusterfs(@Nullable Input<GlusterfsPersistentVolumeSourceArgs> glusterfs) {
            this.glusterfs = glusterfs;
            return this;
        }

        public Builder glusterfs(@Nullable GlusterfsPersistentVolumeSourceArgs glusterfs) {
            this.glusterfs = Input.ofNullable(glusterfs);
            return this;
        }

        public Builder hostPath(@Nullable Input<HostPathVolumeSourceArgs> hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder hostPath(@Nullable HostPathVolumeSourceArgs hostPath) {
            this.hostPath = Input.ofNullable(hostPath);
            return this;
        }

        public Builder iscsi(@Nullable Input<ISCSIPersistentVolumeSourceArgs> iscsi) {
            this.iscsi = iscsi;
            return this;
        }

        public Builder iscsi(@Nullable ISCSIPersistentVolumeSourceArgs iscsi) {
            this.iscsi = Input.ofNullable(iscsi);
            return this;
        }

        public Builder local(@Nullable Input<LocalVolumeSourceArgs> local) {
            this.local = local;
            return this;
        }

        public Builder local(@Nullable LocalVolumeSourceArgs local) {
            this.local = Input.ofNullable(local);
            return this;
        }

        public Builder mountOptions(@Nullable Input<List<String>> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = Input.ofNullable(mountOptions);
            return this;
        }

        public Builder nfs(@Nullable Input<NFSVolumeSourceArgs> nfs) {
            this.nfs = nfs;
            return this;
        }

        public Builder nfs(@Nullable NFSVolumeSourceArgs nfs) {
            this.nfs = Input.ofNullable(nfs);
            return this;
        }

        public Builder nodeAffinity(@Nullable Input<VolumeNodeAffinityArgs> nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }

        public Builder nodeAffinity(@Nullable VolumeNodeAffinityArgs nodeAffinity) {
            this.nodeAffinity = Input.ofNullable(nodeAffinity);
            return this;
        }

        public Builder persistentVolumeReclaimPolicy(@Nullable Input<String> persistentVolumeReclaimPolicy) {
            this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
            return this;
        }

        public Builder persistentVolumeReclaimPolicy(@Nullable String persistentVolumeReclaimPolicy) {
            this.persistentVolumeReclaimPolicy = Input.ofNullable(persistentVolumeReclaimPolicy);
            return this;
        }

        public Builder photonPersistentDisk(@Nullable Input<PhotonPersistentDiskVolumeSourceArgs> photonPersistentDisk) {
            this.photonPersistentDisk = photonPersistentDisk;
            return this;
        }

        public Builder photonPersistentDisk(@Nullable PhotonPersistentDiskVolumeSourceArgs photonPersistentDisk) {
            this.photonPersistentDisk = Input.ofNullable(photonPersistentDisk);
            return this;
        }

        public Builder portworxVolume(@Nullable Input<PortworxVolumeSourceArgs> portworxVolume) {
            this.portworxVolume = portworxVolume;
            return this;
        }

        public Builder portworxVolume(@Nullable PortworxVolumeSourceArgs portworxVolume) {
            this.portworxVolume = Input.ofNullable(portworxVolume);
            return this;
        }

        public Builder quobyte(@Nullable Input<QuobyteVolumeSourceArgs> quobyte) {
            this.quobyte = quobyte;
            return this;
        }

        public Builder quobyte(@Nullable QuobyteVolumeSourceArgs quobyte) {
            this.quobyte = Input.ofNullable(quobyte);
            return this;
        }

        public Builder rbd(@Nullable Input<RBDPersistentVolumeSourceArgs> rbd) {
            this.rbd = rbd;
            return this;
        }

        public Builder rbd(@Nullable RBDPersistentVolumeSourceArgs rbd) {
            this.rbd = Input.ofNullable(rbd);
            return this;
        }

        public Builder scaleIO(@Nullable Input<ScaleIOPersistentVolumeSourceArgs> scaleIO) {
            this.scaleIO = scaleIO;
            return this;
        }

        public Builder scaleIO(@Nullable ScaleIOPersistentVolumeSourceArgs scaleIO) {
            this.scaleIO = Input.ofNullable(scaleIO);
            return this;
        }

        public Builder storageClassName(@Nullable Input<String> storageClassName) {
            this.storageClassName = storageClassName;
            return this;
        }

        public Builder storageClassName(@Nullable String storageClassName) {
            this.storageClassName = Input.ofNullable(storageClassName);
            return this;
        }

        public Builder storageos(@Nullable Input<StorageOSPersistentVolumeSourceArgs> storageos) {
            this.storageos = storageos;
            return this;
        }

        public Builder storageos(@Nullable StorageOSPersistentVolumeSourceArgs storageos) {
            this.storageos = Input.ofNullable(storageos);
            return this;
        }

        public Builder volumeMode(@Nullable Input<String> volumeMode) {
            this.volumeMode = volumeMode;
            return this;
        }

        public Builder volumeMode(@Nullable String volumeMode) {
            this.volumeMode = Input.ofNullable(volumeMode);
            return this;
        }

        public Builder vsphereVolume(@Nullable Input<VsphereVirtualDiskVolumeSourceArgs> vsphereVolume) {
            this.vsphereVolume = vsphereVolume;
            return this;
        }

        public Builder vsphereVolume(@Nullable VsphereVirtualDiskVolumeSourceArgs vsphereVolume) {
            this.vsphereVolume = Input.ofNullable(vsphereVolume);
            return this;
        }
        public PersistentVolumeSpecArgs build() {
            return new PersistentVolumeSpecArgs(accessModes, awsElasticBlockStore, azureDisk, azureFile, capacity, cephfs, cinder, claimRef, csi, fc, flexVolume, flocker, gcePersistentDisk, glusterfs, hostPath, iscsi, local, mountOptions, nfs, nodeAffinity, persistentVolumeReclaimPolicy, photonPersistentDisk, portworxVolume, quobyte, rbd, scaleIO, storageClassName, storageos, volumeMode, vsphereVolume);
        }
    }
}
