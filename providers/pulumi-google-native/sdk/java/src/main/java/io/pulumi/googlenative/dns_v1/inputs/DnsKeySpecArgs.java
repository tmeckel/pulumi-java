// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dns_v1.enums.DnsKeySpecAlgorithm;
import io.pulumi.googlenative.dns_v1.enums.DnsKeySpecKeyType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for DnsKey key generation. Used for generating initial keys for a new ManagedZone and as default when adding a new DnsKey.
 * 
 */
public final class DnsKeySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DnsKeySpecArgs Empty = new DnsKeySpecArgs();

    /**
     * String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    @Import(name="algorithm")
      private final @Nullable Output<DnsKeySpecAlgorithm> algorithm;

    public Output<DnsKeySpecAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Codegen.empty() : this.algorithm;
    }

    /**
     * Length of the keys in bits.
     * 
     */
    @Import(name="keyLength")
      private final @Nullable Output<Integer> keyLength;

    public Output<Integer> getKeyLength() {
        return this.keyLength == null ? Codegen.empty() : this.keyLength;
    }

    /**
     * Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    @Import(name="keyType")
      private final @Nullable Output<DnsKeySpecKeyType> keyType;

    public Output<DnsKeySpecKeyType> getKeyType() {
        return this.keyType == null ? Codegen.empty() : this.keyType;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    public DnsKeySpecArgs(
        @Nullable Output<DnsKeySpecAlgorithm> algorithm,
        @Nullable Output<Integer> keyLength,
        @Nullable Output<DnsKeySpecKeyType> keyType,
        @Nullable Output<String> kind) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.keyType = keyType;
        this.kind = kind;
    }

    private DnsKeySpecArgs() {
        this.algorithm = Codegen.empty();
        this.keyLength = Codegen.empty();
        this.keyType = Codegen.empty();
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsKeySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DnsKeySpecAlgorithm> algorithm;
        private @Nullable Output<Integer> keyLength;
        private @Nullable Output<DnsKeySpecKeyType> keyType;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsKeySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder algorithm(@Nullable Output<DnsKeySpecAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Builder algorithm(@Nullable DnsKeySpecAlgorithm algorithm) {
            this.algorithm = Codegen.ofNullable(algorithm);
            return this;
        }
        public Builder keyLength(@Nullable Output<Integer> keyLength) {
            this.keyLength = keyLength;
            return this;
        }
        public Builder keyLength(@Nullable Integer keyLength) {
            this.keyLength = Codegen.ofNullable(keyLength);
            return this;
        }
        public Builder keyType(@Nullable Output<DnsKeySpecKeyType> keyType) {
            this.keyType = keyType;
            return this;
        }
        public Builder keyType(@Nullable DnsKeySpecKeyType keyType) {
            this.keyType = Codegen.ofNullable(keyType);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }        public DnsKeySpecArgs build() {
            return new DnsKeySpecArgs(algorithm, keyLength, keyType, kind);
        }
    }
}
