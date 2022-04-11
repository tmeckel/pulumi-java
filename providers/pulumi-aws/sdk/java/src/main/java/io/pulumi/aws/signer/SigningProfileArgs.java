// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer;

import io.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileArgs Empty = new SigningProfileArgs();

    /**
     * A unique signing profile name. By default generated by the provider. Signing profile names are immutable and cannot be reused after canceled.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A signing profile name prefix. The provider will generate a unique suffix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @Import(name="platformId", required=true)
      private final Output<String> platformId;

    public Output<String> getPlatformId() {
        return this.platformId;
    }

    /**
     * The validity period for a signing job.
     * 
     */
    @Import(name="signatureValidityPeriod")
      private final @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;

    public Output<SigningProfileSignatureValidityPeriodArgs> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod == null ? Codegen.empty() : this.signatureValidityPeriod;
    }

    /**
     * A list of tags associated with the signing profile. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public SigningProfileArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        Output<String> platformId,
        @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod,
        @Nullable Output<Map<String,String>> tags) {
        this.name = name;
        this.namePrefix = namePrefix;
        this.platformId = Objects.requireNonNull(platformId, "expected parameter 'platformId' to be non-null");
        this.signatureValidityPeriod = signatureValidityPeriod;
        this.tags = tags;
    }

    private SigningProfileArgs() {
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.platformId = Codegen.empty();
        this.signatureValidityPeriod = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private Output<String> platformId;
        private @Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.platformId = defaults.platformId;
    	      this.signatureValidityPeriod = defaults.signatureValidityPeriod;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder platformId(Output<String> platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }
        public Builder platformId(String platformId) {
            this.platformId = Output.of(Objects.requireNonNull(platformId));
            return this;
        }
        public Builder signatureValidityPeriod(@Nullable Output<SigningProfileSignatureValidityPeriodArgs> signatureValidityPeriod) {
            this.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }
        public Builder signatureValidityPeriod(@Nullable SigningProfileSignatureValidityPeriodArgs signatureValidityPeriod) {
            this.signatureValidityPeriod = Codegen.ofNullable(signatureValidityPeriod);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public SigningProfileArgs build() {
            return new SigningProfileArgs(name, namePrefix, platformId, signatureValidityPeriod, tags);
        }
    }
}
