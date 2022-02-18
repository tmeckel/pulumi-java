// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2SecretKeySelectorResponse;
import java.util.Objects;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 * 
 */
public final class GoogleCloudRunOpV2EnvVarSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2EnvVarSourceResponse Empty = new GoogleCloudRunOpV2EnvVarSourceResponse();

    /**
     * Selects a secret and a specific version from Cloud Secret Manager.
     * 
     */
    @InputImport(name="secretKeyRef", required=true)
    private final GoogleCloudRunOpV2SecretKeySelectorResponse secretKeyRef;

    public GoogleCloudRunOpV2SecretKeySelectorResponse getSecretKeyRef() {
        return this.secretKeyRef;
    }

    public GoogleCloudRunOpV2EnvVarSourceResponse(GoogleCloudRunOpV2SecretKeySelectorResponse secretKeyRef) {
        this.secretKeyRef = Objects.requireNonNull(secretKeyRef, "expected parameter 'secretKeyRef' to be non-null");
    }

    private GoogleCloudRunOpV2EnvVarSourceResponse() {
        this.secretKeyRef = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2EnvVarSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2SecretKeySelectorResponse secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2EnvVarSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder setSecretKeyRef(GoogleCloudRunOpV2SecretKeySelectorResponse secretKeyRef) {
            this.secretKeyRef = Objects.requireNonNull(secretKeyRef);
            return this;
        }

        public GoogleCloudRunOpV2EnvVarSourceResponse build() {
            return new GoogleCloudRunOpV2EnvVarSourceResponse(secretKeyRef);
        }
    }
}
