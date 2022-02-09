// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.outputs;

import io.pulumi.azurenative.kubernetes.outputs.CredentialResultResponse;
import io.pulumi.azurenative.kubernetes.outputs.HybridConnectionConfigResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListConnectedClusterUserCredentialResult {
    private final HybridConnectionConfigResponse hybridConnectionConfig;
    private final List<CredentialResultResponse> kubeconfigs;

    @OutputCustomType.Constructor({"hybridConnectionConfig","kubeconfigs"})
    private ListConnectedClusterUserCredentialResult(
        HybridConnectionConfigResponse hybridConnectionConfig,
        List<CredentialResultResponse> kubeconfigs) {
        this.hybridConnectionConfig = Objects.requireNonNull(hybridConnectionConfig);
        this.kubeconfigs = Objects.requireNonNull(kubeconfigs);
    }

    public HybridConnectionConfigResponse getHybridConnectionConfig() {
        return this.hybridConnectionConfig;
    }
    public List<CredentialResultResponse> getKubeconfigs() {
        return this.kubeconfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConnectedClusterUserCredentialResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridConnectionConfigResponse hybridConnectionConfig;
        private List<CredentialResultResponse> kubeconfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConnectedClusterUserCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hybridConnectionConfig = defaults.hybridConnectionConfig;
    	      this.kubeconfigs = defaults.kubeconfigs;
        }

        public Builder setHybridConnectionConfig(HybridConnectionConfigResponse hybridConnectionConfig) {
            this.hybridConnectionConfig = Objects.requireNonNull(hybridConnectionConfig);
            return this;
        }

        public Builder setKubeconfigs(List<CredentialResultResponse> kubeconfigs) {
            this.kubeconfigs = Objects.requireNonNull(kubeconfigs);
            return this;
        }

        public ListConnectedClusterUserCredentialResult build() {
            return new ListConnectedClusterUserCredentialResult(hybridConnectionConfig, kubeconfigs);
        }
    }
}
