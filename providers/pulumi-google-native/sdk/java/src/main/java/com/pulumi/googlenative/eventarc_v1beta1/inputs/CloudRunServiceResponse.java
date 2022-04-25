// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Cloud Run service destination.
 * 
 */
public final class CloudRunServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudRunServiceResponse Empty = new CloudRunServiceResponse();

    /**
     * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    @Import(name="path", required=true)
    private String path;

    /**
     * @return Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    public String path() {
        return this.path;
    }

    /**
     * The region the Cloud Run service is deployed in.
     * 
     */
    @Import(name="region", required=true)
    private String region;

    /**
     * @return The region the Cloud Run service is deployed in.
     * 
     */
    public String region() {
        return this.region;
    }

    /**
     * The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project of the trigger object can be addressed.
     * 
     */
    @Import(name="service", required=true)
    private String service;

    /**
     * @return The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project of the trigger object can be addressed.
     * 
     */
    public String service() {
        return this.service;
    }

    private CloudRunServiceResponse() {}

    private CloudRunServiceResponse(CloudRunServiceResponse $) {
        this.path = $.path;
        this.region = $.region;
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudRunServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRunServiceResponse $;

        public Builder() {
            $ = new CloudRunServiceResponse();
        }

        public Builder(CloudRunServiceResponse defaults) {
            $ = new CloudRunServiceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            $.path = path;
            return this;
        }

        /**
         * @param region The region the Cloud Run service is deployed in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            $.region = region;
            return this;
        }

        /**
         * @param service The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project of the trigger object can be addressed.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            $.service = service;
            return this;
        }

        public CloudRunServiceResponse build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.service = Objects.requireNonNull($.service, "expected parameter 'service' to be non-null");
            return $;
        }
    }

}
