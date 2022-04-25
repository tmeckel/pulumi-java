// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information needed for generating an [OAuth token](https://developers.google.com/identity/protocols/OAuth2). This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
 * 
 */
public final class OAuthTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final OAuthTokenArgs Empty = new OAuthTokenArgs();

    /**
     * OAuth scope to be used for generating OAuth access token. If not specified, &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return OAuth scope to be used for generating OAuth access token. If not specified, &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    private OAuthTokenArgs() {}

    private OAuthTokenArgs(OAuthTokenArgs $) {
        this.scope = $.scope;
        this.serviceAccountEmail = $.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OAuthTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OAuthTokenArgs $;

        public Builder() {
            $ = new OAuthTokenArgs();
        }

        public Builder(OAuthTokenArgs defaults) {
            $ = new OAuthTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope OAuth scope to be used for generating OAuth access token. If not specified, &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope OAuth scope to be used for generating OAuth access token. If not specified, &#34;https://www.googleapis.com/auth/cloud-platform&#34; will be used.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param serviceAccountEmail [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail [Service account email](https://cloud.google.com/iam/docs/service-accounts) to be used for generating OAuth token. The service account must be within the same project as the queue. The caller must have iam.serviceAccounts.actAs permission for the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        public OAuthTokenArgs build() {
            return $;
        }
    }

}
