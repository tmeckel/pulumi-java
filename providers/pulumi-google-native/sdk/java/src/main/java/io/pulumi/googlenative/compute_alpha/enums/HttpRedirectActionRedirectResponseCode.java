// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are: - MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301. - FOUND, which corresponds to 302. - SEE_OTHER which corresponds to 303. - TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method is retained. - PERMANENT_REDIRECT, which corresponds to 308. In this case, the request method is retained.
     * 
     */
    @EnumType
    public enum HttpRedirectActionRedirectResponseCode {
        /**
         * Http Status Code 302 - Found.
         * 
         */
        Found("FOUND"),
        /**
         * Http Status Code 301 - Moved Permanently.
         * 
         */
        MovedPermanentlyDefault("MOVED_PERMANENTLY_DEFAULT"),
        /**
         * Http Status Code 308 - Permanent Redirect maintaining HTTP method.
         * 
         */
        PermanentRedirect("PERMANENT_REDIRECT"),
        /**
         * Http Status Code 303 - See Other.
         * 
         */
        SeeOther("SEE_OTHER"),
        /**
         * Http Status Code 307 - Temporary Redirect maintaining HTTP method.
         * 
         */
        TemporaryRedirect("TEMPORARY_REDIRECT");

        private final String value;

        HttpRedirectActionRedirectResponseCode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HttpRedirectActionRedirectResponseCode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
