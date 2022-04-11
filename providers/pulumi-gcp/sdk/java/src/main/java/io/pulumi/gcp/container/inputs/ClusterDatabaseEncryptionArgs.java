// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterDatabaseEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterDatabaseEncryptionArgs Empty = new ClusterDatabaseEncryptionArgs();

    /**
     * the key to use to encrypt/decrypt secrets.  See the [DatabaseEncryption definition](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters#Cluster.DatabaseEncryption) for more information.
     * 
     */
    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Codegen.empty() : this.keyName;
    }

    /**
     * `ENCRYPTED` or `DECRYPTED`
     * 
     */
    @Import(name="state", required=true)
      private final Output<String> state;

    public Output<String> getState() {
        return this.state;
    }

    public ClusterDatabaseEncryptionArgs(
        @Nullable Output<String> keyName,
        Output<String> state) {
        this.keyName = keyName;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private ClusterDatabaseEncryptionArgs() {
        this.keyName = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDatabaseEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyName;
        private Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDatabaseEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = Codegen.ofNullable(keyName);
            return this;
        }
        public Builder state(Output<String> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder state(String state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }        public ClusterDatabaseEncryptionArgs build() {
            return new ClusterDatabaseEncryptionArgs(keyName, state);
        }
    }
}
