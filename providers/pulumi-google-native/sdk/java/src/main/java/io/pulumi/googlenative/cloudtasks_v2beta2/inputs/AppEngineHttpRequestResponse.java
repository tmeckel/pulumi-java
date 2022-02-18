// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta2.inputs.AppEngineRoutingResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * App Engine HTTP request. The message defines the HTTP request that is sent to an App Engine app when the task is dispatched. This proto can only be used for tasks in a queue which has app_engine_http_target set. Using AppEngineHttpRequest requires [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control) Google IAM permission for the project and the following scope: `https://www.googleapis.com/auth/cloud-platform` The task will be delivered to the App Engine app which belongs to the same project as the queue. For more information, see [How Requests are Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and how routing is affected by [dispatch files](https://cloud.google.com/appengine/docs/python/config/dispatchref). Traffic is encrypted during transport and never leaves Google datacenters. Because this traffic is carried over a communication mechanism internal to Google, you cannot explicitly set the protocol (for example, HTTP or HTTPS). The request to the handler, however, will appear to have used the HTTP protocol. The AppEngineRouting used to construct the URL that the task is delivered to can be set at the queue-level or task-level: * If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing. The `url` that the task will be sent to is: * `url =` host `+` relative_url Tasks can be dispatched to secure app handlers, unsecure app handlers, and URIs restricted with [`login: admin`](https://cloud.google.com/appengine/docs/standard/python/config/appref). Because tasks are not run as any user, they cannot be dispatched to URIs restricted with [`login: required`](https://cloud.google.com/appengine/docs/standard/python/config/appref) Task dispatches also do not follow redirects. The task attempt has succeeded if the app's request handler returns an HTTP response code in the range [`200` - `299`]. The task attempt has failed if the app's handler returns a non-2xx response code or Cloud Tasks does not receive response before the deadline. Failed tasks will be retried according to the retry configuration. `503` (Service Unavailable) is considered an App Engine system error instead of an application error and will cause Cloud Tasks' traffic congestion control to temporarily throttle the queue's dispatches. Unlike other types of task targets, a `429` (Too Many Requests) response from an app handler does not cause traffic congestion control to throttle the queue.
 * 
 */
public final class AppEngineHttpRequestResponse extends io.pulumi.resources.InvokeArgs {

    public static final AppEngineHttpRequestResponse Empty = new AppEngineHttpRequestResponse();

    /**
     * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    @InputImport(name="appEngineRouting", required=true)
    private final AppEngineRoutingResponse appEngineRouting;

    public AppEngineRoutingResponse getAppEngineRouting() {
        return this.appEngineRouting;
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. If the task has a payload, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/appengine/docs/python/taskqueue/push/creating-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    @InputImport(name="headers", required=true)
    private final Map<String,String> headers;

    public Map<String,String> getHeaders() {
        return this.headers;
    }

    /**
     * The HTTP method to use for the request. The default is POST. The app's request handler for the task's target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    @InputImport(name="httpMethod", required=true)
    private final String httpMethod;

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * Payload. The payload will be sent as the HTTP message body. A message body, and thus a payload, is allowed only if the HTTP method is POST or PUT. It is an error to set a data payload on a task with an incompatible HttpMethod.
     * 
     */
    @InputImport(name="payload", required=true)
    private final String payload;

    public String getPayload() {
        return this.payload;
    }

    /**
     * The relative URL. The relative URL must begin with "/" and must be a valid HTTP relative URL. It can contain a path and query string arguments. If the relative URL is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    @InputImport(name="relativeUrl", required=true)
    private final String relativeUrl;

    public String getRelativeUrl() {
        return this.relativeUrl;
    }

    public AppEngineHttpRequestResponse(
        AppEngineRoutingResponse appEngineRouting,
        Map<String,String> headers,
        String httpMethod,
        String payload,
        String relativeUrl) {
        this.appEngineRouting = Objects.requireNonNull(appEngineRouting, "expected parameter 'appEngineRouting' to be non-null");
        this.headers = Objects.requireNonNull(headers, "expected parameter 'headers' to be non-null");
        this.httpMethod = Objects.requireNonNull(httpMethod, "expected parameter 'httpMethod' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.relativeUrl = Objects.requireNonNull(relativeUrl, "expected parameter 'relativeUrl' to be non-null");
    }

    private AppEngineHttpRequestResponse() {
        this.appEngineRouting = null;
        this.headers = Map.of();
        this.httpMethod = null;
        this.payload = null;
        this.relativeUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpRequestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineRoutingResponse appEngineRouting;
        private Map<String,String> headers;
        private String httpMethod;
        private String payload;
        private String relativeUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpRequestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.payload = defaults.payload;
    	      this.relativeUrl = defaults.relativeUrl;
        }

        public Builder setAppEngineRouting(AppEngineRoutingResponse appEngineRouting) {
            this.appEngineRouting = Objects.requireNonNull(appEngineRouting);
            return this;
        }

        public Builder setHeaders(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setPayload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setRelativeUrl(String relativeUrl) {
            this.relativeUrl = Objects.requireNonNull(relativeUrl);
            return this;
        }

        public AppEngineHttpRequestResponse build() {
            return new AppEngineHttpRequestResponse(appEngineRouting, headers, httpMethod, payload, relativeUrl);
        }
    }
}
