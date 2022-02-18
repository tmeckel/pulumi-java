// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.ConfigMapEnvSourceArgs;
import io.pulumi.googlenative.run_v1alpha1.inputs.SecretEnvSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run EnvFromSource represents the source of a set of ConfigMaps
 * 
 */
public final class EnvFromSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvFromSourceArgs Empty = new EnvFromSourceArgs();

    /**
     * (Optional) The ConfigMap to select from
     * 
     */
    @InputImport(name="configMapRef")
    private final @Nullable Input<ConfigMapEnvSourceArgs> configMapRef;

    public Input<ConfigMapEnvSourceArgs> getConfigMapRef() {
        return this.configMapRef == null ? Input.empty() : this.configMapRef;
    }

    /**
     * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    @InputImport(name="prefix")
    private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    /**
     * (Optional) The Secret to select from
     * 
     */
    @InputImport(name="secretRef")
    private final @Nullable Input<SecretEnvSourceArgs> secretRef;

    public Input<SecretEnvSourceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    public EnvFromSourceArgs(
        @Nullable Input<ConfigMapEnvSourceArgs> configMapRef,
        @Nullable Input<String> prefix,
        @Nullable Input<SecretEnvSourceArgs> secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    private EnvFromSourceArgs() {
        this.configMapRef = Input.empty();
        this.prefix = Input.empty();
        this.secretRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConfigMapEnvSourceArgs> configMapRef;
        private @Nullable Input<String> prefix;
        private @Nullable Input<SecretEnvSourceArgs> secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvFromSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder setConfigMapRef(@Nullable Input<ConfigMapEnvSourceArgs> configMapRef) {
            this.configMapRef = configMapRef;
            return this;
        }

        public Builder setConfigMapRef(@Nullable ConfigMapEnvSourceArgs configMapRef) {
            this.configMapRef = Input.ofNullable(configMapRef);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }

        public Builder setSecretRef(@Nullable Input<SecretEnvSourceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder setSecretRef(@Nullable SecretEnvSourceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public EnvFromSourceArgs build() {
            return new EnvFromSourceArgs(configMapRef, prefix, secretRef);
        }
    }
}
