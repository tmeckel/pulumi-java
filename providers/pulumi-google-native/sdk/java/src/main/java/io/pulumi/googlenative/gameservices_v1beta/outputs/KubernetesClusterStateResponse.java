// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KubernetesClusterStateResponse {
    /**
     * The version of Agones currently installed in the registered Kubernetes cluster.
     * 
     */
    private final String agonesVersionInstalled;
    /**
     * The version of Agones that is targeted to be installed in the cluster.
     * 
     */
    private final String agonesVersionTargeted;
    /**
     * The state for the installed versions of Agones/Kubernetes.
     * 
     */
    private final String installationState;
    /**
     * The version of Kubernetes that is currently used in the registered Kubernetes cluster (as detected by the Cloud Game Servers service).
     * 
     */
    private final String kubernetesVersionInstalled;
    /**
     * The cloud provider type reported by the first node's providerID in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the provider type will be empty.
     * 
     */
    private final String provider;
    /**
     * The detailed error message for the installed versions of Agones/Kubernetes.
     * 
     */
    private final String versionInstalledErrorMessage;

    @OutputCustomType.Constructor({"agonesVersionInstalled","agonesVersionTargeted","installationState","kubernetesVersionInstalled","provider","versionInstalledErrorMessage"})
    private KubernetesClusterStateResponse(
        String agonesVersionInstalled,
        String agonesVersionTargeted,
        String installationState,
        String kubernetesVersionInstalled,
        String provider,
        String versionInstalledErrorMessage) {
        this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled);
        this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted);
        this.installationState = Objects.requireNonNull(installationState);
        this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled);
        this.provider = Objects.requireNonNull(provider);
        this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage);
    }

    /**
     * The version of Agones currently installed in the registered Kubernetes cluster.
     * 
     */
    public String getAgonesVersionInstalled() {
        return this.agonesVersionInstalled;
    }
    /**
     * The version of Agones that is targeted to be installed in the cluster.
     * 
     */
    public String getAgonesVersionTargeted() {
        return this.agonesVersionTargeted;
    }
    /**
     * The state for the installed versions of Agones/Kubernetes.
     * 
     */
    public String getInstallationState() {
        return this.installationState;
    }
    /**
     * The version of Kubernetes that is currently used in the registered Kubernetes cluster (as detected by the Cloud Game Servers service).
     * 
     */
    public String getKubernetesVersionInstalled() {
        return this.kubernetesVersionInstalled;
    }
    /**
     * The cloud provider type reported by the first node's providerID in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the provider type will be empty.
     * 
     */
    public String getProvider() {
        return this.provider;
    }
    /**
     * The detailed error message for the installed versions of Agones/Kubernetes.
     * 
     */
    public String getVersionInstalledErrorMessage() {
        return this.versionInstalledErrorMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agonesVersionInstalled;
        private String agonesVersionTargeted;
        private String installationState;
        private String kubernetesVersionInstalled;
        private String provider;
        private String versionInstalledErrorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agonesVersionInstalled = defaults.agonesVersionInstalled;
    	      this.agonesVersionTargeted = defaults.agonesVersionTargeted;
    	      this.installationState = defaults.installationState;
    	      this.kubernetesVersionInstalled = defaults.kubernetesVersionInstalled;
    	      this.provider = defaults.provider;
    	      this.versionInstalledErrorMessage = defaults.versionInstalledErrorMessage;
        }

        public Builder setAgonesVersionInstalled(String agonesVersionInstalled) {
            this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled);
            return this;
        }

        public Builder setAgonesVersionTargeted(String agonesVersionTargeted) {
            this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted);
            return this;
        }

        public Builder setInstallationState(String installationState) {
            this.installationState = Objects.requireNonNull(installationState);
            return this;
        }

        public Builder setKubernetesVersionInstalled(String kubernetesVersionInstalled) {
            this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled);
            return this;
        }

        public Builder setProvider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }

        public Builder setVersionInstalledErrorMessage(String versionInstalledErrorMessage) {
            this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage);
            return this;
        }

        public KubernetesClusterStateResponse build() {
            return new KubernetesClusterStateResponse(agonesVersionInstalled, agonesVersionTargeted, installationState, kubernetesVersionInstalled, provider, versionInstalledErrorMessage);
        }
    }
}
