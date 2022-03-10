// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.storage.k8s.io_v1beta1.inputs.TokenRequestArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CSIDriverSpec is the specification of a CSIDriver.
 * 
 */
public final class CSIDriverSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CSIDriverSpecArgs Empty = new CSIDriverSpecArgs();

    /**
     * attachRequired indicates this CSI volume driver requires an attach operation (because it implements the CSI ControllerPublishVolume() method), and that the Kubernetes attach detach controller should call the attach volume interface which checks the volumeattachment status and waits until the volume is attached before proceeding to mounting. The CSI external-attacher coordinates with CSI volume driver and updates the volumeattachment status when the attach operation is complete. If the CSIDriverRegistry feature gate is enabled and the value is specified to false, the attach operation will be skipped. Otherwise the attach operation will be called.
     * 
     */
    @InputImport(name="attachRequired")
      private final @Nullable Input<Boolean> attachRequired;

    public Input<Boolean> getAttachRequired() {
        return this.attachRequired == null ? Input.empty() : this.attachRequired;
    }

    /**
     * Defines if the underlying volume supports changing ownership and permission of the volume before being mounted. Refer to the specific FSGroupPolicy values for additional details. This field is alpha-level, and is only honored by servers that enable the CSIVolumeFSGroupPolicy feature gate.
     * 
     */
    @InputImport(name="fsGroupPolicy")
      private final @Nullable Input<String> fsGroupPolicy;

    public Input<String> getFsGroupPolicy() {
        return this.fsGroupPolicy == null ? Input.empty() : this.fsGroupPolicy;
    }

    /**
     * If set to true, podInfoOnMount indicates this CSI volume driver requires additional pod information (like podName, podUID, etc.) during mount operations. If set to false, pod information will not be passed on mount. Default is false. The CSI driver specifies podInfoOnMount as part of driver deployment. If true, Kubelet will pass pod information as VolumeContext in the CSI NodePublishVolume() calls. The CSI driver is responsible for parsing and validating the information passed in as VolumeContext. The following VolumeConext will be passed if podInfoOnMount is set to true. This list might grow, but the prefix will be used. "csi.storage.k8s.io/pod.name": pod.Name "csi.storage.k8s.io/pod.namespace": pod.Namespace "csi.storage.k8s.io/pod.uid": string(pod.UID) "csi.storage.k8s.io/ephemeral": "true" iff the volume is an ephemeral inline volume
     *                                 defined by a CSIVolumeSource, otherwise "false"
     * 
     * "csi.storage.k8s.io/ephemeral" is a new feature in Kubernetes 1.16. It is only required for drivers which support both the "Persistent" and "Ephemeral" VolumeLifecycleMode. Other drivers can leave pod info disabled and/or ignore this field. As Kubernetes 1.15 doesn't support this field, drivers can only support one mode when deployed on such a cluster and the deployment determines which mode that is, for example via a command line parameter of the driver.
     * 
     */
    @InputImport(name="podInfoOnMount")
      private final @Nullable Input<Boolean> podInfoOnMount;

    public Input<Boolean> getPodInfoOnMount() {
        return this.podInfoOnMount == null ? Input.empty() : this.podInfoOnMount;
    }

    /**
     * RequiresRepublish indicates the CSI driver wants `NodePublishVolume` being periodically called to reflect any possible change in the mounted volume. This field defaults to false.
     * 
     * Note: After a successful initial NodePublishVolume call, subsequent calls to NodePublishVolume should only update the contents of the volume. New mount points will not be seen by a running container.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    @InputImport(name="requiresRepublish")
      private final @Nullable Input<Boolean> requiresRepublish;

    public Input<Boolean> getRequiresRepublish() {
        return this.requiresRepublish == null ? Input.empty() : this.requiresRepublish;
    }

    /**
     * If set to true, storageCapacity indicates that the CSI volume driver wants pod scheduling to consider the storage capacity that the driver deployment will report by creating CSIStorageCapacity objects with capacity information.
     * 
     * The check can be enabled immediately when deploying a driver. In that case, provisioning new volumes with late binding will pause until the driver deployment has published some suitable CSIStorageCapacity object.
     * 
     * Alternatively, the driver can be deployed with the field unset or false and it can be flipped later when storage capacity information has been published.
     * 
     * This is an alpha field and only available when the CSIStorageCapacity feature is enabled. The default is false.
     * 
     */
    @InputImport(name="storageCapacity")
      private final @Nullable Input<Boolean> storageCapacity;

    public Input<Boolean> getStorageCapacity() {
        return this.storageCapacity == null ? Input.empty() : this.storageCapacity;
    }

    /**
     * TokenRequests indicates the CSI driver needs pods' service account tokens it is mounting volume for to do necessary authentication. Kubelet will pass the tokens in VolumeContext in the CSI NodePublishVolume calls. The CSI driver should parse and validate the following VolumeContext: "csi.storage.k8s.io/serviceAccount.tokens": {
     *   "<audience>": {
     *     "token": <token>,
     *     "expirationTimestamp": <expiration timestamp in RFC3339>,
     *   },
     *   ...
     * }
     * 
     * Note: Audience in each TokenRequest should be different and at most one token is empty string. To receive a new token after expiry, RequiresRepublish can be used to trigger NodePublishVolume periodically.
     * 
     * This is an alpha feature and only available when the CSIServiceAccountToken feature is enabled.
     * 
     */
    @InputImport(name="tokenRequests")
      private final @Nullable Input<List<TokenRequestArgs>> tokenRequests;

    public Input<List<TokenRequestArgs>> getTokenRequests() {
        return this.tokenRequests == null ? Input.empty() : this.tokenRequests;
    }

    /**
     * VolumeLifecycleModes defines what kind of volumes this CSI volume driver supports. The default if the list is empty is "Persistent", which is the usage defined by the CSI specification and implemented in Kubernetes via the usual PV/PVC mechanism. The other mode is "Ephemeral". In this mode, volumes are defined inline inside the pod spec with CSIVolumeSource and their lifecycle is tied to the lifecycle of that pod. A driver has to be aware of this because it is only going to get a NodePublishVolume call for such a volume. For more information about implementing this mode, see https://kubernetes-csi.github.io/docs/ephemeral-local-volumes.html A driver can support one or more of these modes and more modes may be added in the future.
     * 
     */
    @InputImport(name="volumeLifecycleModes")
      private final @Nullable Input<List<String>> volumeLifecycleModes;

    public Input<List<String>> getVolumeLifecycleModes() {
        return this.volumeLifecycleModes == null ? Input.empty() : this.volumeLifecycleModes;
    }

    public CSIDriverSpecArgs(
        @Nullable Input<Boolean> attachRequired,
        @Nullable Input<String> fsGroupPolicy,
        @Nullable Input<Boolean> podInfoOnMount,
        @Nullable Input<Boolean> requiresRepublish,
        @Nullable Input<Boolean> storageCapacity,
        @Nullable Input<List<TokenRequestArgs>> tokenRequests,
        @Nullable Input<List<String>> volumeLifecycleModes) {
        this.attachRequired = attachRequired;
        this.fsGroupPolicy = fsGroupPolicy;
        this.podInfoOnMount = podInfoOnMount;
        this.requiresRepublish = requiresRepublish;
        this.storageCapacity = storageCapacity;
        this.tokenRequests = tokenRequests;
        this.volumeLifecycleModes = volumeLifecycleModes;
    }

    private CSIDriverSpecArgs() {
        this.attachRequired = Input.empty();
        this.fsGroupPolicy = Input.empty();
        this.podInfoOnMount = Input.empty();
        this.requiresRepublish = Input.empty();
        this.storageCapacity = Input.empty();
        this.tokenRequests = Input.empty();
        this.volumeLifecycleModes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CSIDriverSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> attachRequired;
        private @Nullable Input<String> fsGroupPolicy;
        private @Nullable Input<Boolean> podInfoOnMount;
        private @Nullable Input<Boolean> requiresRepublish;
        private @Nullable Input<Boolean> storageCapacity;
        private @Nullable Input<List<TokenRequestArgs>> tokenRequests;
        private @Nullable Input<List<String>> volumeLifecycleModes;

        public Builder() {
    	      // Empty
        }

        public Builder(CSIDriverSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachRequired = defaults.attachRequired;
    	      this.fsGroupPolicy = defaults.fsGroupPolicy;
    	      this.podInfoOnMount = defaults.podInfoOnMount;
    	      this.requiresRepublish = defaults.requiresRepublish;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.tokenRequests = defaults.tokenRequests;
    	      this.volumeLifecycleModes = defaults.volumeLifecycleModes;
        }

        public Builder attachRequired(@Nullable Input<Boolean> attachRequired) {
            this.attachRequired = attachRequired;
            return this;
        }

        public Builder attachRequired(@Nullable Boolean attachRequired) {
            this.attachRequired = Input.ofNullable(attachRequired);
            return this;
        }

        public Builder fsGroupPolicy(@Nullable Input<String> fsGroupPolicy) {
            this.fsGroupPolicy = fsGroupPolicy;
            return this;
        }

        public Builder fsGroupPolicy(@Nullable String fsGroupPolicy) {
            this.fsGroupPolicy = Input.ofNullable(fsGroupPolicy);
            return this;
        }

        public Builder podInfoOnMount(@Nullable Input<Boolean> podInfoOnMount) {
            this.podInfoOnMount = podInfoOnMount;
            return this;
        }

        public Builder podInfoOnMount(@Nullable Boolean podInfoOnMount) {
            this.podInfoOnMount = Input.ofNullable(podInfoOnMount);
            return this;
        }

        public Builder requiresRepublish(@Nullable Input<Boolean> requiresRepublish) {
            this.requiresRepublish = requiresRepublish;
            return this;
        }

        public Builder requiresRepublish(@Nullable Boolean requiresRepublish) {
            this.requiresRepublish = Input.ofNullable(requiresRepublish);
            return this;
        }

        public Builder storageCapacity(@Nullable Input<Boolean> storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Builder storageCapacity(@Nullable Boolean storageCapacity) {
            this.storageCapacity = Input.ofNullable(storageCapacity);
            return this;
        }

        public Builder tokenRequests(@Nullable Input<List<TokenRequestArgs>> tokenRequests) {
            this.tokenRequests = tokenRequests;
            return this;
        }

        public Builder tokenRequests(@Nullable List<TokenRequestArgs> tokenRequests) {
            this.tokenRequests = Input.ofNullable(tokenRequests);
            return this;
        }

        public Builder volumeLifecycleModes(@Nullable Input<List<String>> volumeLifecycleModes) {
            this.volumeLifecycleModes = volumeLifecycleModes;
            return this;
        }

        public Builder volumeLifecycleModes(@Nullable List<String> volumeLifecycleModes) {
            this.volumeLifecycleModes = Input.ofNullable(volumeLifecycleModes);
            return this;
        }
        public CSIDriverSpecArgs build() {
            return new CSIDriverSpecArgs(attachRequired, fsGroupPolicy, podInfoOnMount, requiresRepublish, storageCapacity, tokenRequests, volumeLifecycleModes);
        }
    }
}
