// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * User-defined authentication requirements, including support for [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * 
 */
public final class AuthRequirementArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthRequirementArgs Empty = new AuthRequirementArgs();

    /**
     * NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience &#34;https://Service_name/API_name&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience &#34;https://library-example.googleapis.com/google.example.library.v1.LibraryService&#34;. Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<String> audiences;

    /**
     * @return NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience &#34;https://Service_name/API_name&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience &#34;https://library-example.googleapis.com/google.example.library.v1.LibraryService&#34;. Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    public Optional<Output<String>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    /**
     * id from authentication provider. Example: provider_id: bookstore_auth
     * 
     */
    @Import(name="providerId")
    private @Nullable Output<String> providerId;

    /**
     * @return id from authentication provider. Example: provider_id: bookstore_auth
     * 
     */
    public Optional<Output<String>> providerId() {
        return Optional.ofNullable(this.providerId);
    }

    private AuthRequirementArgs() {}

    private AuthRequirementArgs(AuthRequirementArgs $) {
        this.audiences = $.audiences;
        this.providerId = $.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthRequirementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthRequirementArgs $;

        public Builder() {
            $ = new AuthRequirementArgs();
        }

        public Builder(AuthRequirementArgs defaults) {
            $ = new AuthRequirementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audiences NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience &#34;https://Service_name/API_name&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience &#34;https://library-example.googleapis.com/google.example.library.v1.LibraryService&#34;. Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<String> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences NOTE: This will be deprecated soon, once AuthProvider.audiences is implemented and accepted in all the runtime components. The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, only JWTs with audience &#34;https://Service_name/API_name&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will only accept JWTs with the following audience &#34;https://library-example.googleapis.com/google.example.library.v1.LibraryService&#34;. Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(String audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param providerId id from authentication provider. Example: provider_id: bookstore_auth
         * 
         * @return builder
         * 
         */
        public Builder providerId(@Nullable Output<String> providerId) {
            $.providerId = providerId;
            return this;
        }

        /**
         * @param providerId id from authentication provider. Example: provider_id: bookstore_auth
         * 
         * @return builder
         * 
         */
        public Builder providerId(String providerId) {
            return providerId(Output.of(providerId));
        }

        public AuthRequirementArgs build() {
            return $;
        }
    }

}
