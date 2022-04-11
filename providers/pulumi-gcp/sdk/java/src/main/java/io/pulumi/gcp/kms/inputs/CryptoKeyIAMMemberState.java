// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyIAMMemberState extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMMemberState Empty = new CryptoKeyIAMMemberState();

    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<CryptoKeyIAMMemberConditionGetArgs> condition;

    public Output<CryptoKeyIAMMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider's project setting will be used as a fallback.
     * 
     */
    @Import(name="cryptoKeyId")
      private final @Nullable Output<String> cryptoKeyId;

    public Output<String> getCryptoKeyId() {
        return this.cryptoKeyId == null ? Codegen.empty() : this.cryptoKeyId;
    }

    /**
     * (Computed) The etag of the project's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The role that should be applied. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public CryptoKeyIAMMemberState(
        @Nullable Output<CryptoKeyIAMMemberConditionGetArgs> condition,
        @Nullable Output<String> cryptoKeyId,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.cryptoKeyId = cryptoKeyId;
        this.etag = etag;
        this.member = member;
        this.role = role;
    }

    private CryptoKeyIAMMemberState() {
        this.condition = Codegen.empty();
        this.cryptoKeyId = Codegen.empty();
        this.etag = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyIAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CryptoKeyIAMMemberConditionGetArgs> condition;
        private @Nullable Output<String> cryptoKeyId;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyIAMMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<CryptoKeyIAMMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable CryptoKeyIAMMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder cryptoKeyId(@Nullable Output<String> cryptoKeyId) {
            this.cryptoKeyId = cryptoKeyId;
            return this;
        }
        public Builder cryptoKeyId(@Nullable String cryptoKeyId) {
            this.cryptoKeyId = Codegen.ofNullable(cryptoKeyId);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public CryptoKeyIAMMemberState build() {
            return new CryptoKeyIAMMemberState(condition, cryptoKeyId, etag, member, role);
        }
    }
}
