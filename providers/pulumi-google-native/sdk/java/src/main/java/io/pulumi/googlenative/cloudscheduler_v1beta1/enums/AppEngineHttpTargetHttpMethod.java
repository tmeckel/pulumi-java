// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
     * 
     */
    @EnumType
    public enum AppEngineHttpTargetHttpMethod {
        /**
         * HTTP method unspecified. Defaults to POST.
         * 
         */
        HttpMethodUnspecified("HTTP_METHOD_UNSPECIFIED"),
        /**
         * HTTP POST
         * 
         */
        Post("POST"),
        /**
         * HTTP GET
         * 
         */
        Get("GET"),
        /**
         * HTTP HEAD
         * 
         */
        Head("HEAD"),
        /**
         * HTTP PUT
         * 
         */
        Put("PUT"),
        /**
         * HTTP DELETE
         * 
         */
        Delete("DELETE"),
        /**
         * HTTP PATCH
         * 
         */
        Patch("PATCH"),
        /**
         * HTTP OPTIONS
         * 
         */
        Options("OPTIONS");

        private final String value;

        AppEngineHttpTargetHttpMethod(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AppEngineHttpTargetHttpMethod[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
