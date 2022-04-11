// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.inputs;

import io.pulumi.aws.signer.inputs.SigningProfileRevocationRecordGetArgs;
import io.pulumi.aws.signer.inputs.SigningProfileSignatureValidityPeriodGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SigningProfileState extends io.pulumi.resources.ResourceArgs {

    public static final SigningProfileState Empty = new SigningProfileState();

    /**
     * The Amazon Resource Name (ARN) for the signing profile.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

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
     * A human-readable name for the signing platform associated with the signing profile.
     * 
     */
    @Import(name="platformDisplayName")
      private final @Nullable Output<String> platformDisplayName;

    public Output<String> getPlatformDisplayName() {
        return this.platformDisplayName == null ? Codegen.empty() : this.platformDisplayName;
    }

    /**
     * The ID of the platform that is used by the target signing profile.
     * 
     */
    @Import(name="platformId")
      private final @Nullable Output<String> platformId;

    public Output<String> getPlatformId() {
        return this.platformId == null ? Codegen.empty() : this.platformId;
    }

    /**
     * Revocation information for a signing profile.
     * 
     */
    @Import(name="revocationRecords")
      private final @Nullable Output<List<SigningProfileRevocationRecordGetArgs>> revocationRecords;

    public Output<List<SigningProfileRevocationRecordGetArgs>> getRevocationRecords() {
        return this.revocationRecords == null ? Codegen.empty() : this.revocationRecords;
    }

    /**
     * The validity period for a signing job.
     * 
     */
    @Import(name="signatureValidityPeriod")
      private final @Nullable Output<SigningProfileSignatureValidityPeriodGetArgs> signatureValidityPeriod;

    public Output<SigningProfileSignatureValidityPeriodGetArgs> getSignatureValidityPeriod() {
        return this.signatureValidityPeriod == null ? Codegen.empty() : this.signatureValidityPeriod;
    }

    /**
     * The status of the target signing profile.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
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

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The current version of the signing profile.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    /**
     * The signing profile ARN, including the profile version.
     * 
     */
    @Import(name="versionArn")
      private final @Nullable Output<String> versionArn;

    public Output<String> getVersionArn() {
        return this.versionArn == null ? Codegen.empty() : this.versionArn;
    }

    public SigningProfileState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> platformDisplayName,
        @Nullable Output<String> platformId,
        @Nullable Output<List<SigningProfileRevocationRecordGetArgs>> revocationRecords,
        @Nullable Output<SigningProfileSignatureValidityPeriodGetArgs> signatureValidityPeriod,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> version,
        @Nullable Output<String> versionArn) {
        this.arn = arn;
        this.name = name;
        this.namePrefix = namePrefix;
        this.platformDisplayName = platformDisplayName;
        this.platformId = platformId;
        this.revocationRecords = revocationRecords;
        this.signatureValidityPeriod = signatureValidityPeriod;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.version = version;
        this.versionArn = versionArn;
    }

    private SigningProfileState() {
        this.arn = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.platformDisplayName = Codegen.empty();
        this.platformId = Codegen.empty();
        this.revocationRecords = Codegen.empty();
        this.signatureValidityPeriod = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.version = Codegen.empty();
        this.versionArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> platformDisplayName;
        private @Nullable Output<String> platformId;
        private @Nullable Output<List<SigningProfileRevocationRecordGetArgs>> revocationRecords;
        private @Nullable Output<SigningProfileSignatureValidityPeriodGetArgs> signatureValidityPeriod;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> version;
        private @Nullable Output<String> versionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.platformDisplayName = defaults.platformDisplayName;
    	      this.platformId = defaults.platformId;
    	      this.revocationRecords = defaults.revocationRecords;
    	      this.signatureValidityPeriod = defaults.signatureValidityPeriod;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.version = defaults.version;
    	      this.versionArn = defaults.versionArn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
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
        public Builder platformDisplayName(@Nullable Output<String> platformDisplayName) {
            this.platformDisplayName = platformDisplayName;
            return this;
        }
        public Builder platformDisplayName(@Nullable String platformDisplayName) {
            this.platformDisplayName = Codegen.ofNullable(platformDisplayName);
            return this;
        }
        public Builder platformId(@Nullable Output<String> platformId) {
            this.platformId = platformId;
            return this;
        }
        public Builder platformId(@Nullable String platformId) {
            this.platformId = Codegen.ofNullable(platformId);
            return this;
        }
        public Builder revocationRecords(@Nullable Output<List<SigningProfileRevocationRecordGetArgs>> revocationRecords) {
            this.revocationRecords = revocationRecords;
            return this;
        }
        public Builder revocationRecords(@Nullable List<SigningProfileRevocationRecordGetArgs> revocationRecords) {
            this.revocationRecords = Codegen.ofNullable(revocationRecords);
            return this;
        }
        public Builder revocationRecords(SigningProfileRevocationRecordGetArgs... revocationRecords) {
            return revocationRecords(List.of(revocationRecords));
        }
        public Builder signatureValidityPeriod(@Nullable Output<SigningProfileSignatureValidityPeriodGetArgs> signatureValidityPeriod) {
            this.signatureValidityPeriod = signatureValidityPeriod;
            return this;
        }
        public Builder signatureValidityPeriod(@Nullable SigningProfileSignatureValidityPeriodGetArgs signatureValidityPeriod) {
            this.signatureValidityPeriod = Codegen.ofNullable(signatureValidityPeriod);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }
        public Builder versionArn(@Nullable Output<String> versionArn) {
            this.versionArn = versionArn;
            return this;
        }
        public Builder versionArn(@Nullable String versionArn) {
            this.versionArn = Codegen.ofNullable(versionArn);
            return this;
        }        public SigningProfileState build() {
            return new SigningProfileState(arn, name, namePrefix, platformDisplayName, platformId, revocationRecords, signatureValidityPeriod, status, tags, tagsAll, version, versionArn);
        }
    }
}
