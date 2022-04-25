// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1alpha1.outputs.ConfigMapKeySelectorResponse;
import com.pulumi.googlenative.run_v1alpha1.outputs.SecretKeySelectorResponse;
import java.util.Objects;

@CustomType
public final class EnvVarSourceResponse {
    /**
     * @return (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    private final ConfigMapKeySelectorResponse configMapKeyRef;
    /**
     * @return (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    private final SecretKeySelectorResponse secretKeyRef;

    @CustomType.Constructor
    private EnvVarSourceResponse(
        @CustomType.Parameter("configMapKeyRef") ConfigMapKeySelectorResponse configMapKeyRef,
        @CustomType.Parameter("secretKeyRef") SecretKeySelectorResponse secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.secretKeyRef = secretKeyRef;
    }

    /**
     * @return (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    public ConfigMapKeySelectorResponse configMapKeyRef() {
        return this.configMapKeyRef;
    }
    /**
     * @return (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    public SecretKeySelectorResponse secretKeyRef() {
        return this.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapKeySelectorResponse configMapKeyRef;
        private SecretKeySelectorResponse secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapKeyRef = defaults.configMapKeyRef;
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder configMapKeyRef(ConfigMapKeySelectorResponse configMapKeyRef) {
            this.configMapKeyRef = Objects.requireNonNull(configMapKeyRef);
            return this;
        }
        public Builder secretKeyRef(SecretKeySelectorResponse secretKeyRef) {
            this.secretKeyRef = Objects.requireNonNull(secretKeyRef);
            return this;
        }        public EnvVarSourceResponse build() {
            return new EnvVarSourceResponse(configMapKeyRef, secretKeyRef);
        }
    }
}
