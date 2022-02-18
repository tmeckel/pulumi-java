// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The user agent used during scanning.
     * 
     */
    @EnumType
    public enum ScanConfigUserAgent {
        /**
         * The user agent is unknown. Service will default to CHROME_LINUX.
         * 
         */
        UserAgentUnspecified("USER_AGENT_UNSPECIFIED"),
        /**
         * Chrome on Linux. This is the service default if unspecified.
         * 
         */
        ChromeLinux("CHROME_LINUX"),
        /**
         * Chrome on Android.
         * 
         */
        ChromeAndroid("CHROME_ANDROID"),
        /**
         * Safari on IPhone.
         * 
         */
        SafariIphone("SAFARI_IPHONE");

        private final String value;

        ScanConfigUserAgent(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ScanConfigUserAgent[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
