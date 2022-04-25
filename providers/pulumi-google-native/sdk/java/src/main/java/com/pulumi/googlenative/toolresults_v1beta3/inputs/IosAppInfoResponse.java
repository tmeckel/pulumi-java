// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * iOS app information
 * 
 */
public final class IosAppInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final IosAppInfoResponse Empty = new IosAppInfoResponse();

    /**
     * The name of the app. Required
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the app. Required
     * 
     */
    public String name() {
        return this.name;
    }

    private IosAppInfoResponse() {}

    private IosAppInfoResponse(IosAppInfoResponse $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IosAppInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IosAppInfoResponse $;

        public Builder() {
            $ = new IosAppInfoResponse();
        }

        public Builder(IosAppInfoResponse defaults) {
            $ = new IosAppInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the app. Required
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public IosAppInfoResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
