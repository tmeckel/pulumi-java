// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform.inputs;

import io.pulumi.azurenative.autonomousdevelopmentplatform.inputs.DataPoolEncryptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Location of a Data Pool
 * 
 */
public final class DataPoolLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataPoolLocationArgs Empty = new DataPoolLocationArgs();

    /**
     * Encryption properties of a Data Pool location
     * 
     */
    @InputImport(name="encryption")
      private final @Nullable Input<DataPoolEncryptionArgs> encryption;

    public Input<DataPoolEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * The location name
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public DataPoolLocationArgs(
        @Nullable Input<DataPoolEncryptionArgs> encryption,
        Input<String> name) {
        this.encryption = encryption;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataPoolLocationArgs() {
        this.encryption = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataPoolEncryptionArgs> encryption;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPoolLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.name = defaults.name;
        }

        public Builder encryption(@Nullable Input<DataPoolEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable DataPoolEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public DataPoolLocationArgs build() {
            return new DataPoolLocationArgs(encryption, name);
        }
    }
}
