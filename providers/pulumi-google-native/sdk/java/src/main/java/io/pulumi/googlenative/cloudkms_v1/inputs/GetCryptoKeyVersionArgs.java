// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCryptoKeyVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCryptoKeyVersionArgs Empty = new GetCryptoKeyVersionArgs();

    @InputImport(name="cryptoKeyId", required=true)
      private final String cryptoKeyId;

    public String getCryptoKeyId() {
        return this.cryptoKeyId;
    }

    @InputImport(name="cryptoKeyVersionId", required=true)
      private final String cryptoKeyVersionId;

    public String getCryptoKeyVersionId() {
        return this.cryptoKeyVersionId;
    }

    @InputImport(name="keyRingId", required=true)
      private final String keyRingId;

    public String getKeyRingId() {
        return this.keyRingId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetCryptoKeyVersionArgs(
        String cryptoKeyId,
        String cryptoKeyVersionId,
        String keyRingId,
        String location,
        @Nullable String project) {
        this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
        this.cryptoKeyVersionId = Objects.requireNonNull(cryptoKeyVersionId, "expected parameter 'cryptoKeyVersionId' to be non-null");
        this.keyRingId = Objects.requireNonNull(keyRingId, "expected parameter 'keyRingId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetCryptoKeyVersionArgs() {
        this.cryptoKeyId = null;
        this.cryptoKeyVersionId = null;
        this.keyRingId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCryptoKeyVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cryptoKeyId;
        private String cryptoKeyVersionId;
        private String keyRingId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCryptoKeyVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.cryptoKeyVersionId = defaults.cryptoKeyVersionId;
    	      this.keyRingId = defaults.keyRingId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder cryptoKeyId(String cryptoKeyId) {
            this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId);
            return this;
        }

        public Builder cryptoKeyVersionId(String cryptoKeyVersionId) {
            this.cryptoKeyVersionId = Objects.requireNonNull(cryptoKeyVersionId);
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            this.keyRingId = Objects.requireNonNull(keyRingId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetCryptoKeyVersionArgs build() {
            return new GetCryptoKeyVersionArgs(cryptoKeyId, cryptoKeyVersionId, keyRingId, location, project);
        }
    }
}
