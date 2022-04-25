// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.ConfigMapKeySelectorResponse;
import com.pulumi.googlenative.run_v1alpha1.inputs.SecretKeySelectorResponse;
import java.util.Objects;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class EnvVarSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvVarSourceResponse Empty = new EnvVarSourceResponse();

    /**
     * (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    @Import(name="configMapKeyRef", required=true)
    private ConfigMapKeySelectorResponse configMapKeyRef;

    /**
     * @return (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
     * 
     */
    public ConfigMapKeySelectorResponse configMapKeyRef() {
        return this.configMapKeyRef;
    }

    /**
     * (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    @Import(name="secretKeyRef", required=true)
    private SecretKeySelectorResponse secretKeyRef;

    /**
     * @return (Optional) Selects a key (version) of a secret in Secret Manager.
     * 
     */
    public SecretKeySelectorResponse secretKeyRef() {
        return this.secretKeyRef;
    }

    private EnvVarSourceResponse() {}

    private EnvVarSourceResponse(EnvVarSourceResponse $) {
        this.configMapKeyRef = $.configMapKeyRef;
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvVarSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvVarSourceResponse $;

        public Builder() {
            $ = new EnvVarSourceResponse();
        }

        public Builder(EnvVarSourceResponse defaults) {
            $ = new EnvVarSourceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param configMapKeyRef (Optional) Not supported by Cloud Run Selects a key of a ConfigMap.
         * 
         * @return builder
         * 
         */
        public Builder configMapKeyRef(ConfigMapKeySelectorResponse configMapKeyRef) {
            $.configMapKeyRef = configMapKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef (Optional) Selects a key (version) of a secret in Secret Manager.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(SecretKeySelectorResponse secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        public EnvVarSourceResponse build() {
            $.configMapKeyRef = Objects.requireNonNull($.configMapKeyRef, "expected parameter 'configMapKeyRef' to be non-null");
            $.secretKeyRef = Objects.requireNonNull($.secretKeyRef, "expected parameter 'secretKeyRef' to be non-null");
            return $;
        }
    }

}
