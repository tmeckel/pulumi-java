// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountIdTokenResult {
    private final @Nullable List<String> delegates;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The `id_token` representing the new generated identity.
     * 
     */
    private final String idToken;
    private final @Nullable Boolean includeEmail;
    private final String targetAudience;
    private final @Nullable String targetServiceAccount;

    @CustomType.Constructor
    private GetAccountIdTokenResult(
        @CustomType.Parameter("delegates") @Nullable List<String> delegates,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idToken") String idToken,
        @CustomType.Parameter("includeEmail") @Nullable Boolean includeEmail,
        @CustomType.Parameter("targetAudience") String targetAudience,
        @CustomType.Parameter("targetServiceAccount") @Nullable String targetServiceAccount) {
        this.delegates = delegates;
        this.id = id;
        this.idToken = idToken;
        this.includeEmail = includeEmail;
        this.targetAudience = targetAudience;
        this.targetServiceAccount = targetServiceAccount;
    }

    public List<String> delegates() {
        return this.delegates == null ? List.of() : this.delegates;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The `id_token` representing the new generated identity.
     * 
     */
    public String idToken() {
        return this.idToken;
    }
    public Optional<Boolean> includeEmail() {
        return Optional.ofNullable(this.includeEmail);
    }
    public String targetAudience() {
        return this.targetAudience;
    }
    public Optional<String> targetServiceAccount() {
        return Optional.ofNullable(this.targetServiceAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountIdTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> delegates;
        private String id;
        private String idToken;
        private @Nullable Boolean includeEmail;
        private String targetAudience;
        private @Nullable String targetServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountIdTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegates = defaults.delegates;
    	      this.id = defaults.id;
    	      this.idToken = defaults.idToken;
    	      this.includeEmail = defaults.includeEmail;
    	      this.targetAudience = defaults.targetAudience;
    	      this.targetServiceAccount = defaults.targetServiceAccount;
        }

        public Builder delegates(@Nullable List<String> delegates) {
            this.delegates = delegates;
            return this;
        }
        public Builder delegates(String... delegates) {
            return delegates(List.of(delegates));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder idToken(String idToken) {
            this.idToken = Objects.requireNonNull(idToken);
            return this;
        }
        public Builder includeEmail(@Nullable Boolean includeEmail) {
            this.includeEmail = includeEmail;
            return this;
        }
        public Builder targetAudience(String targetAudience) {
            this.targetAudience = Objects.requireNonNull(targetAudience);
            return this;
        }
        public Builder targetServiceAccount(@Nullable String targetServiceAccount) {
            this.targetServiceAccount = targetServiceAccount;
            return this;
        }        public GetAccountIdTokenResult build() {
            return new GetAccountIdTokenResult(delegates, id, idToken, includeEmail, targetAudience, targetServiceAccount);
        }
    }
}
