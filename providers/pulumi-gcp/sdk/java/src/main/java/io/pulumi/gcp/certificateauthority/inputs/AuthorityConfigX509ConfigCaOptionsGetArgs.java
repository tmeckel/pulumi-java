// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigCaOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigCaOptionsGetArgs Empty = new AuthorityConfigX509ConfigCaOptionsGetArgs();

    /**
     * When true, the "CA" in Basic Constraints extension will be set to true.
     * 
     */
    @InputImport(name="isCa", required=true)
      private final Input<Boolean> isCa;

    public Input<Boolean> getIsCa() {
        return this.isCa;
    }

    /**
     * Refers to the "path length constraint" in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    @InputImport(name="maxIssuerPathLength")
      private final @Nullable Input<Integer> maxIssuerPathLength;

    public Input<Integer> getMaxIssuerPathLength() {
        return this.maxIssuerPathLength == null ? Input.empty() : this.maxIssuerPathLength;
    }

    /**
     * When true, the "CA" in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    @InputImport(name="nonCa")
      private final @Nullable Input<Boolean> nonCa;

    public Input<Boolean> getNonCa() {
        return this.nonCa == null ? Input.empty() : this.nonCa;
    }

    /**
     * When true, the "path length constraint" in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    @InputImport(name="zeroMaxIssuerPathLength")
      private final @Nullable Input<Boolean> zeroMaxIssuerPathLength;

    public Input<Boolean> getZeroMaxIssuerPathLength() {
        return this.zeroMaxIssuerPathLength == null ? Input.empty() : this.zeroMaxIssuerPathLength;
    }

    public AuthorityConfigX509ConfigCaOptionsGetArgs(
        Input<Boolean> isCa,
        @Nullable Input<Integer> maxIssuerPathLength,
        @Nullable Input<Boolean> nonCa,
        @Nullable Input<Boolean> zeroMaxIssuerPathLength) {
        this.isCa = Objects.requireNonNull(isCa, "expected parameter 'isCa' to be non-null");
        this.maxIssuerPathLength = maxIssuerPathLength;
        this.nonCa = nonCa;
        this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
    }

    private AuthorityConfigX509ConfigCaOptionsGetArgs() {
        this.isCa = Input.empty();
        this.maxIssuerPathLength = Input.empty();
        this.nonCa = Input.empty();
        this.zeroMaxIssuerPathLength = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigCaOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> isCa;
        private @Nullable Input<Integer> maxIssuerPathLength;
        private @Nullable Input<Boolean> nonCa;
        private @Nullable Input<Boolean> zeroMaxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigCaOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
    	      this.nonCa = defaults.nonCa;
    	      this.zeroMaxIssuerPathLength = defaults.zeroMaxIssuerPathLength;
        }

        public Builder isCa(Input<Boolean> isCa) {
            this.isCa = Objects.requireNonNull(isCa);
            return this;
        }

        public Builder isCa(Boolean isCa) {
            this.isCa = Input.of(Objects.requireNonNull(isCa));
            return this;
        }

        public Builder maxIssuerPathLength(@Nullable Input<Integer> maxIssuerPathLength) {
            this.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }

        public Builder maxIssuerPathLength(@Nullable Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = Input.ofNullable(maxIssuerPathLength);
            return this;
        }

        public Builder nonCa(@Nullable Input<Boolean> nonCa) {
            this.nonCa = nonCa;
            return this;
        }

        public Builder nonCa(@Nullable Boolean nonCa) {
            this.nonCa = Input.ofNullable(nonCa);
            return this;
        }

        public Builder zeroMaxIssuerPathLength(@Nullable Input<Boolean> zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
            return this;
        }

        public Builder zeroMaxIssuerPathLength(@Nullable Boolean zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = Input.ofNullable(zeroMaxIssuerPathLength);
            return this;
        }
        public AuthorityConfigX509ConfigCaOptionsGetArgs build() {
            return new AuthorityConfigX509ConfigCaOptionsGetArgs(isCa, maxIssuerPathLength, nonCa, zeroMaxIssuerPathLength);
        }
    }
}
