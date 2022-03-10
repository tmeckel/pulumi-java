// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private Connectivity
 * 
 */
public final class PrivateConnectivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateConnectivityArgs Empty = new PrivateConnectivityArgs();

    @InputImport(name="privateConnectionName")
      private final @Nullable Input<String> privateConnectionName;

    public Input<String> getPrivateConnectionName() {
        return this.privateConnectionName == null ? Input.empty() : this.privateConnectionName;
    }

    public PrivateConnectivityArgs(@Nullable Input<String> privateConnectionName) {
        this.privateConnectionName = privateConnectionName;
    }

    private PrivateConnectivityArgs() {
        this.privateConnectionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> privateConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateConnectionName = defaults.privateConnectionName;
        }

        public Builder privateConnectionName(@Nullable Input<String> privateConnectionName) {
            this.privateConnectionName = privateConnectionName;
            return this;
        }

        public Builder privateConnectionName(@Nullable String privateConnectionName) {
            this.privateConnectionName = Input.ofNullable(privateConnectionName);
            return this;
        }
        public PrivateConnectivityArgs build() {
            return new PrivateConnectivityArgs(privateConnectionName);
        }
    }
}
