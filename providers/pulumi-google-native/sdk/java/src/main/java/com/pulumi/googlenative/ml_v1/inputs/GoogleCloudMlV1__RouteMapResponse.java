// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies HTTP paths served by a custom container. AI Platform Prediction sends requests to these paths on the container; the custom container must run an HTTP server that responds to these requests with appropriate responses. Read [Custom container requirements](/ai-platform/prediction/docs/custom-container-requirements) for details on how to create your container image to meet these requirements.
 * 
 */
public final class GoogleCloudMlV1__RouteMapResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__RouteMapResponse Empty = new GoogleCloudMlV1__RouteMapResponse();

    /**
     * HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container&#39;s IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID /models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    @Import(name="health", required=true)
    private String health;

    /**
     * @return HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container&#39;s IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID /models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    public String health() {
        return this.health;
    }

    /**
     * HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container&#39;s IP address and port. AI Platform Prediction then returns the container&#39;s response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID/models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    @Import(name="predict", required=true)
    private String predict;

    /**
     * @return HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container&#39;s IP address and port. AI Platform Prediction then returns the container&#39;s response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID/models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
     * 
     */
    public String predict() {
        return this.predict;
    }

    private GoogleCloudMlV1__RouteMapResponse() {}

    private GoogleCloudMlV1__RouteMapResponse(GoogleCloudMlV1__RouteMapResponse $) {
        this.health = $.health;
        this.predict = $.predict;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudMlV1__RouteMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1__RouteMapResponse $;

        public Builder() {
            $ = new GoogleCloudMlV1__RouteMapResponse();
        }

        public Builder(GoogleCloudMlV1__RouteMapResponse defaults) {
            $ = new GoogleCloudMlV1__RouteMapResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param health HTTP path on the container to send health checkss to. AI Platform Prediction intermittently sends GET requests to this path on the container&#39;s IP address and port to check that the container is healthy. Read more about [health checks](/ai-platform/prediction/docs/custom-container-requirements#checks). For example, if you set this field to `/bar`, then AI Platform Prediction intermittently sends a GET request to the `/bar` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/ MODEL/versions/VERSION The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID /models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
         * 
         * @return builder
         * 
         */
        public Builder health(String health) {
            $.health = health;
            return this;
        }

        /**
         * @param predict HTTP path on the container to send prediction requests to. AI Platform Prediction forwards requests sent using projects.predict to this path on the container&#39;s IP address and port. AI Platform Prediction then returns the container&#39;s response in the API response. For example, if you set this field to `/foo`, then when AI Platform Prediction receives a prediction request, it forwards the request body in a POST request to the `/foo` path on the port of your container specified by the first value of Version.container.ports. If you don&#39;t specify this field, it defaults to the following value: /v1/models/MODEL/versions/VERSION:predict The placeholders in this value are replaced as follows: * MODEL: The name of the parent Model. This does not include the &#34;projects/PROJECT_ID/models/&#34; prefix that the API returns in output; it is the bare model name, as provided to projects.models.create. * VERSION: The name of the model version. This does not include the &#34;projects/PROJECT_ID/models/MODEL/versions/&#34; prefix that the API returns in output; it is the bare version name, as provided to projects.models.versions.create.
         * 
         * @return builder
         * 
         */
        public Builder predict(String predict) {
            $.predict = predict;
            return this;
        }

        public GoogleCloudMlV1__RouteMapResponse build() {
            $.health = Objects.requireNonNull($.health, "expected parameter 'health' to be non-null");
            $.predict = Objects.requireNonNull($.predict, "expected parameter 'predict' to be non-null");
            return $;
        }
    }

}
