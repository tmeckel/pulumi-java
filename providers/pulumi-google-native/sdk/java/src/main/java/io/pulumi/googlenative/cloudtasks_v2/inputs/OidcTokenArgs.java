// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information needed for generating an [OpenID Connect token](https://developers.google.com/identity/protocols/OpenIDConnect). This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
 * 
 */
public final class OidcTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final OidcTokenArgs Empty = new OidcTokenArgs();

    /**
     * Audience to be used when generating OIDC token. If not specified, the URI specified in target will be used.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OIDC token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @InputImport(name="serviceAccountEmail")
      private final @Nullable Input<String> serviceAccountEmail;

    public Input<String> getServiceAccountEmail() {
        return this.serviceAccountEmail == null ? Input.empty() : this.serviceAccountEmail;
    }

    public OidcTokenArgs(
        @Nullable Input<String> audience,
        @Nullable Input<String> serviceAccountEmail) {
        this.audience = audience;
        this.serviceAccountEmail = serviceAccountEmail;
    }

    private OidcTokenArgs() {
        this.audience = Input.empty();
        this.serviceAccountEmail = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OidcTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audience;
        private @Nullable Input<String> serviceAccountEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(OidcTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
        }

        public Builder audience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder serviceAccountEmail(@Nullable Input<String> serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = Input.ofNullable(serviceAccountEmail);
            return this;
        }
        public OidcTokenArgs build() {
            return new OidcTokenArgs(audience, serviceAccountEmail);
        }
    }
}
