// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apikeys_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The IP addresses of callers that are allowed to use the key.
 * 
 */
public final class V2ServerKeyRestrictionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final V2ServerKeyRestrictionsResponse Empty = new V2ServerKeyRestrictionsResponse();

    /**
     * A list of the caller IP addresses that are allowed to make API calls with this key.
     * 
     */
    @Import(name="allowedIps", required=true)
    private List<String> allowedIps;

    /**
     * @return A list of the caller IP addresses that are allowed to make API calls with this key.
     * 
     */
    public List<String> allowedIps() {
        return this.allowedIps;
    }

    private V2ServerKeyRestrictionsResponse() {}

    private V2ServerKeyRestrictionsResponse(V2ServerKeyRestrictionsResponse $) {
        this.allowedIps = $.allowedIps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V2ServerKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V2ServerKeyRestrictionsResponse $;

        public Builder() {
            $ = new V2ServerKeyRestrictionsResponse();
        }

        public Builder(V2ServerKeyRestrictionsResponse defaults) {
            $ = new V2ServerKeyRestrictionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedIps A list of the caller IP addresses that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(List<String> allowedIps) {
            $.allowedIps = allowedIps;
            return this;
        }

        /**
         * @param allowedIps A list of the caller IP addresses that are allowed to make API calls with this key.
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(String... allowedIps) {
            return allowedIps(List.of(allowedIps));
        }

        public V2ServerKeyRestrictionsResponse build() {
            $.allowedIps = Objects.requireNonNull($.allowedIps, "expected parameter 'allowedIps' to be non-null");
            return $;
        }
    }

}
