// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.container_v1beta1.enums.IstioConfigAuth;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for Istio addon.
 * 
 */
public final class IstioConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IstioConfigArgs Empty = new IstioConfigArgs();

    /**
     * The specified Istio auth mode, either none, or mutual TLS.
     * 
     */
    @Import(name="auth")
      private final @Nullable Output<IstioConfigAuth> auth;

    public Output<IstioConfigAuth> getAuth() {
        return this.auth == null ? Codegen.empty() : this.auth;
    }

    /**
     * Whether Istio is enabled for this cluster.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    public IstioConfigArgs(
        @Nullable Output<IstioConfigAuth> auth,
        @Nullable Output<Boolean> disabled) {
        this.auth = auth;
        this.disabled = disabled;
    }

    private IstioConfigArgs() {
        this.auth = Codegen.empty();
        this.disabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IstioConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IstioConfigAuth> auth;
        private @Nullable Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(IstioConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.disabled = defaults.disabled;
        }

        public Builder auth(@Nullable Output<IstioConfigAuth> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(@Nullable IstioConfigAuth auth) {
            this.auth = Codegen.ofNullable(auth);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }        public IstioConfigArgs build() {
            return new IstioConfigArgs(auth, disabled);
        }
    }
}
