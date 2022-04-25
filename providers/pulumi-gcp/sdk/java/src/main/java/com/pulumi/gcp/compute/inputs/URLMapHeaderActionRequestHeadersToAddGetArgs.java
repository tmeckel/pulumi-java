// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class URLMapHeaderActionRequestHeadersToAddGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapHeaderActionRequestHeadersToAddGetArgs Empty = new URLMapHeaderActionRequestHeadersToAddGetArgs();

    /**
     * The name of the header to add.
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    /**
     * @return The name of the header to add.
     * 
     */
    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue", required=true)
    private Output<String> headerValue;

    /**
     * @return The value of the header to add.
     * 
     */
    public Output<String> headerValue() {
        return this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    @Import(name="replace", required=true)
    private Output<Boolean> replace;

    /**
     * @return If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    public Output<Boolean> replace() {
        return this.replace;
    }

    private URLMapHeaderActionRequestHeadersToAddGetArgs() {}

    private URLMapHeaderActionRequestHeadersToAddGetArgs(URLMapHeaderActionRequestHeadersToAddGetArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
        this.replace = $.replace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapHeaderActionRequestHeadersToAddGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapHeaderActionRequestHeadersToAddGetArgs $;

        public Builder() {
            $ = new URLMapHeaderActionRequestHeadersToAddGetArgs();
        }

        public Builder(URLMapHeaderActionRequestHeadersToAddGetArgs defaults) {
            $ = new URLMapHeaderActionRequestHeadersToAddGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName The name of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName The name of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param headerValue The value of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        /**
         * @param headerValue The value of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        /**
         * @param replace If false, headerValue is appended to any values that already exist for the header.
         * If true, headerValue is set for the header, discarding any values that were set for that header.
         * 
         * @return builder
         * 
         */
        public Builder replace(Output<Boolean> replace) {
            $.replace = replace;
            return this;
        }

        /**
         * @param replace If false, headerValue is appended to any values that already exist for the header.
         * If true, headerValue is set for the header, discarding any values that were set for that header.
         * 
         * @return builder
         * 
         */
        public Builder replace(Boolean replace) {
            return replace(Output.of(replace));
        }

        public URLMapHeaderActionRequestHeadersToAddGetArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.headerValue = Objects.requireNonNull($.headerValue, "expected parameter 'headerValue' to be non-null");
            $.replace = Objects.requireNonNull($.replace, "expected parameter 'replace' to be non-null");
            return $;
        }
    }

}
