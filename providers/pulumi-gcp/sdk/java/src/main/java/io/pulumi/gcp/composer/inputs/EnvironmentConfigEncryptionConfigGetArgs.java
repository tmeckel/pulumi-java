// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentConfigEncryptionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigEncryptionConfigGetArgs Empty = new EnvironmentConfigEncryptionConfigGetArgs();

    @InputImport(name="kmsKeyName", required=true)
      private final Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public EnvironmentConfigEncryptionConfigGetArgs(Input<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private EnvironmentConfigEncryptionConfigGetArgs() {
        this.kmsKeyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigEncryptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigEncryptionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(Input<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Input.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }
        public EnvironmentConfigEncryptionConfigGetArgs build() {
            return new EnvironmentConfigEncryptionConfigGetArgs(kmsKeyName);
        }
    }
}
