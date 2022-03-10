// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretVersionArgs Empty = new GetSecretVersionArgs();

    /**
     * Specifies the secret containing the version that you want to retrieve. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret.
     * 
     */
    @InputImport(name="secretId", required=true)
      private final String secretId;

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * Specifies the unique identifier of the version of the secret that you want to retrieve. Overrides `version_stage`.
     * 
     */
    @InputImport(name="versionId")
      private final @Nullable String versionId;

    public Optional<String> getVersionId() {
        return this.versionId == null ? Optional.empty() : Optional.ofNullable(this.versionId);
    }

    /**
     * Specifies the secret version that you want to retrieve by the staging label attached to the version. Defaults to `AWSCURRENT`.
     * 
     */
    @InputImport(name="versionStage")
      private final @Nullable String versionStage;

    public Optional<String> getVersionStage() {
        return this.versionStage == null ? Optional.empty() : Optional.ofNullable(this.versionStage);
    }

    public GetSecretVersionArgs(
        String secretId,
        @Nullable String versionId,
        @Nullable String versionStage) {
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
        this.versionId = versionId;
        this.versionStage = versionStage;
    }

    private GetSecretVersionArgs() {
        this.secretId = null;
        this.versionId = null;
        this.versionStage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretId;
        private @Nullable String versionId;
        private @Nullable String versionStage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretId = defaults.secretId;
    	      this.versionId = defaults.versionId;
    	      this.versionStage = defaults.versionStage;
        }

        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder versionId(@Nullable String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Builder versionStage(@Nullable String versionStage) {
            this.versionStage = versionStage;
            return this;
        }
        public GetSecretVersionArgs build() {
            return new GetSecretVersionArgs(secretId, versionId, versionStage);
        }
    }
}
