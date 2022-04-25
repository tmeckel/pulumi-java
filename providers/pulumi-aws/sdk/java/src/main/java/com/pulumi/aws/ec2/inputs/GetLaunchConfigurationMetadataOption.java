// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetLaunchConfigurationMetadataOption extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchConfigurationMetadataOption Empty = new GetLaunchConfigurationMetadataOption();

    /**
     * The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    @Import(name="httpEndpoint", required=true)
    private String httpEndpoint;

    /**
     * @return The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    public String httpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    @Import(name="httpPutResponseHopLimit", required=true)
    private Integer httpPutResponseHopLimit;

    /**
     * @return The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    public Integer httpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    /**
     * If session tokens are required: `optional`, `required`.
     * 
     */
    @Import(name="httpTokens", required=true)
    private String httpTokens;

    /**
     * @return If session tokens are required: `optional`, `required`.
     * 
     */
    public String httpTokens() {
        return this.httpTokens;
    }

    private GetLaunchConfigurationMetadataOption() {}

    private GetLaunchConfigurationMetadataOption(GetLaunchConfigurationMetadataOption $) {
        this.httpEndpoint = $.httpEndpoint;
        this.httpPutResponseHopLimit = $.httpPutResponseHopLimit;
        this.httpTokens = $.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLaunchConfigurationMetadataOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLaunchConfigurationMetadataOption $;

        public Builder() {
            $ = new GetLaunchConfigurationMetadataOption();
        }

        public Builder(GetLaunchConfigurationMetadataOption defaults) {
            $ = new GetLaunchConfigurationMetadataOption(Objects.requireNonNull(defaults));
        }

        /**
         * @param httpEndpoint The state of the metadata service: `enabled`, `disabled`.
         * 
         * @return builder
         * 
         */
        public Builder httpEndpoint(String httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * @param httpPutResponseHopLimit The desired HTTP PUT response hop limit for instance metadata requests.
         * 
         * @return builder
         * 
         */
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            $.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }

        /**
         * @param httpTokens If session tokens are required: `optional`, `required`.
         * 
         * @return builder
         * 
         */
        public Builder httpTokens(String httpTokens) {
            $.httpTokens = httpTokens;
            return this;
        }

        public GetLaunchConfigurationMetadataOption build() {
            $.httpEndpoint = Objects.requireNonNull($.httpEndpoint, "expected parameter 'httpEndpoint' to be non-null");
            $.httpPutResponseHopLimit = Objects.requireNonNull($.httpPutResponseHopLimit, "expected parameter 'httpPutResponseHopLimit' to be non-null");
            $.httpTokens = Objects.requireNonNull($.httpTokens, "expected parameter 'httpTokens' to be non-null");
            return $;
        }
    }

}
