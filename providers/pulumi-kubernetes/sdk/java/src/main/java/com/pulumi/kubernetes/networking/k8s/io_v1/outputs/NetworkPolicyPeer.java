// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import com.pulumi.kubernetes.networking.k8s.io_v1.outputs.IPBlock;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkPolicyPeer {
    /**
     * @return IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    private final @Nullable IPBlock ipBlock;
    /**
     * @return Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
     */
    private final @Nullable LabelSelector namespaceSelector;
    /**
     * @return This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy&#39;s own Namespace.
     * 
     */
    private final @Nullable LabelSelector podSelector;

    @CustomType.Constructor
    private NetworkPolicyPeer(
        @CustomType.Parameter("ipBlock") @Nullable IPBlock ipBlock,
        @CustomType.Parameter("namespaceSelector") @Nullable LabelSelector namespaceSelector,
        @CustomType.Parameter("podSelector") @Nullable LabelSelector podSelector) {
        this.ipBlock = ipBlock;
        this.namespaceSelector = namespaceSelector;
        this.podSelector = podSelector;
    }

    /**
     * @return IPBlock defines policy on a particular IPBlock. If this field is set then neither of the other fields can be.
     * 
     */
    public Optional<IPBlock> ipBlock() {
        return Optional.ofNullable(this.ipBlock);
    }
    /**
     * @return Selects Namespaces using cluster-scoped labels. This field follows standard label selector semantics; if present but empty, it selects all namespaces.
     * 
     * If PodSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects all Pods in the Namespaces selected by NamespaceSelector.
     * 
     */
    public Optional<LabelSelector> namespaceSelector() {
        return Optional.ofNullable(this.namespaceSelector);
    }
    /**
     * @return This is a label selector which selects Pods. This field follows standard label selector semantics; if present but empty, it selects all pods.
     * 
     * If NamespaceSelector is also set, then the NetworkPolicyPeer as a whole selects the Pods matching PodSelector in the Namespaces selected by NamespaceSelector. Otherwise it selects the Pods matching PodSelector in the policy&#39;s own Namespace.
     * 
     */
    public Optional<LabelSelector> podSelector() {
        return Optional.ofNullable(this.podSelector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyPeer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IPBlock ipBlock;
        private @Nullable LabelSelector namespaceSelector;
        private @Nullable LabelSelector podSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyPeer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlock = defaults.ipBlock;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.podSelector = defaults.podSelector;
        }

        public Builder ipBlock(@Nullable IPBlock ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }
        public Builder namespaceSelector(@Nullable LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }
        public Builder podSelector(@Nullable LabelSelector podSelector) {
            this.podSelector = podSelector;
            return this;
        }        public NetworkPolicyPeer build() {
            return new NetworkPolicyPeer(ipBlock, namespaceSelector, podSelector);
        }
    }
}
