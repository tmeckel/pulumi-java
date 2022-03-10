// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecr.outputs;

import io.pulumi.awsnative.ecr.enums.RepositoryEncryptionType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepositoryEncryptionConfiguration {
    private final RepositoryEncryptionType encryptionType;
    private final @Nullable String kmsKey;

    @OutputCustomType.Constructor
    private RepositoryEncryptionConfiguration(
        @OutputCustomType.Parameter("encryptionType") RepositoryEncryptionType encryptionType,
        @OutputCustomType.Parameter("kmsKey") @Nullable String kmsKey) {
        this.encryptionType = encryptionType;
        this.kmsKey = kmsKey;
    }

    public RepositoryEncryptionType getEncryptionType() {
        return this.encryptionType;
    }
    public Optional<String> getKmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryEncryptionType encryptionType;
        private @Nullable String kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionType = defaults.encryptionType;
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder encryptionType(RepositoryEncryptionType encryptionType) {
            this.encryptionType = Objects.requireNonNull(encryptionType);
            return this;
        }

        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public RepositoryEncryptionConfiguration build() {
            return new RepositoryEncryptionConfiguration(encryptionType, kmsKey);
        }
    }
}
