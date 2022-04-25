// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TokenRequest {
    /**
     * @return Audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
     * 
     */
    private final String audience;
    /**
     * @return ExpirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;
     * 
     */
    private final @Nullable Integer expirationSeconds;

    @CustomType.Constructor
    private TokenRequest(
        @CustomType.Parameter("audience") String audience,
        @CustomType.Parameter("expirationSeconds") @Nullable Integer expirationSeconds) {
        this.audience = audience;
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * @return Audience is the intended audience of the token in &#34;TokenRequestSpec&#34;. It will default to the audiences of kube apiserver.
     * 
     */
    public String audience() {
        return this.audience;
    }
    /**
     * @return ExpirationSeconds is the duration of validity of the token in &#34;TokenRequestSpec&#34;. It has the same default value of &#34;ExpirationSeconds&#34; in &#34;TokenRequestSpec&#34;
     * 
     */
    public Optional<Integer> expirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audience;
        private @Nullable Integer expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder audience(String audience) {
            this.audience = Objects.requireNonNull(audience);
            return this;
        }
        public Builder expirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }        public TokenRequest build() {
            return new TokenRequest(audience, expirationSeconds);
        }
    }
}
