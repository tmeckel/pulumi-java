// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Type of the manifest, can be `HLS` or `DASH`.
     * 
     */
    @EnumType
    public enum ManifestType {
        /**
         * The manifest type is not specified.
         * 
         */
        ManifestTypeUnspecified("MANIFEST_TYPE_UNSPECIFIED"),
        /**
         * Create `HLS` manifest. The corresponding file extension is `.m3u8`.
         * 
         */
        Hls("HLS"),
        /**
         * Create `DASH` manifest. The corresponding file extension is `.mpd`.
         * 
         */
        Dash("DASH");

        private final String value;

        ManifestType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManifestType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
