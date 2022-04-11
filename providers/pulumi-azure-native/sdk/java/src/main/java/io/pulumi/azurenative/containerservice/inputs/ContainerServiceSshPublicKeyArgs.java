// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about SSH certificate public key data.
 * 
 */
public final class ContainerServiceSshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerServiceSshPublicKeyArgs Empty = new ContainerServiceSshPublicKeyArgs();

    /**
     * Certificate public key used to authenticate with VMs through SSH. The certificate must be in PEM format with or without headers.
     * 
     */
    @Import(name="keyData", required=true)
      private final Output<String> keyData;

    public Output<String> getKeyData() {
        return this.keyData;
    }

    public ContainerServiceSshPublicKeyArgs(Output<String> keyData) {
        this.keyData = Objects.requireNonNull(keyData, "expected parameter 'keyData' to be non-null");
    }

    private ContainerServiceSshPublicKeyArgs() {
        this.keyData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceSshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceSshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyData = defaults.keyData;
        }

        public Builder keyData(Output<String> keyData) {
            this.keyData = Objects.requireNonNull(keyData);
            return this;
        }
        public Builder keyData(String keyData) {
            this.keyData = Output.of(Objects.requireNonNull(keyData));
            return this;
        }        public ContainerServiceSshPublicKeyArgs build() {
            return new ContainerServiceSshPublicKeyArgs(keyData);
        }
    }
}
