// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudtasks_v2beta3.enums.AppEngineHttpRequestHttpMethod;
import com.pulumi.googlenative.cloudtasks_v2beta3.inputs.AppEngineRoutingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * App Engine HTTP request. The message defines the HTTP request that is sent to an App Engine app when the task is dispatched. Using AppEngineHttpRequest requires [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control) Google IAM permission for the project and the following scope: `https://www.googleapis.com/auth/cloud-platform` The task will be delivered to the App Engine app which belongs to the same project as the queue. For more information, see [How Requests are Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and how routing is affected by [dispatch files](https://cloud.google.com/appengine/docs/python/config/dispatchref). Traffic is encrypted during transport and never leaves Google datacenters. Because this traffic is carried over a communication mechanism internal to Google, you cannot explicitly set the protocol (for example, HTTP or HTTPS). The request to the handler, however, will appear to have used the HTTP protocol. The AppEngineRouting used to construct the URL that the task is delivered to can be set at the queue-level or task-level: * If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing. The `url` that the task will be sent to is: * `url =` host `+` relative_uri Tasks can be dispatched to secure app handlers, unsecure app handlers, and URIs restricted with [`login: admin`](https://cloud.google.com/appengine/docs/standard/python/config/appref). Because tasks are not run as any user, they cannot be dispatched to URIs restricted with [`login: required`](https://cloud.google.com/appengine/docs/standard/python/config/appref) Task dispatches also do not follow redirects. The task attempt has succeeded if the app&#39;s request handler returns an HTTP response code in the range [`200` - `299`]. The task attempt has failed if the app&#39;s handler returns a non-2xx response code or Cloud Tasks does not receive response before the deadline. Failed tasks will be retried according to the retry configuration. `503` (Service Unavailable) is considered an App Engine system error instead of an application error and will cause Cloud Tasks&#39; traffic congestion control to temporarily throttle the queue&#39;s dispatches. Unlike other types of task targets, a `429` (Too Many Requests) response from an app handler does not cause traffic congestion control to throttle the queue.
 * 
 */
public final class AppEngineHttpRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppEngineHttpRequestArgs Empty = new AppEngineHttpRequestArgs();

    /**
     * Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    @Import(name="appEngineRouting")
    private @Nullable Output<AppEngineRoutingArgs> appEngineRouting;

    /**
     * @return Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    public Optional<Output<AppEngineRoutingArgs>> appEngineRouting() {
        return Optional.ofNullable(this.appEngineRouting);
    }

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
     * 
     */
    @Import(name="body")
    private @Nullable Output<String> body;

    /**
     * @return HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
     * 
     */
    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Tasks will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,String>> headers;

    /**
     * @return HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Tasks will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    public Optional<Output<Map<String,String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<AppEngineHttpRequestHttpMethod> httpMethod;

    /**
     * @return The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    public Optional<Output<AppEngineHttpRequestHttpMethod>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * The relative URI. The relative URI must begin with &#34;/&#34; and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    @Import(name="relativeUri")
    private @Nullable Output<String> relativeUri;

    /**
     * @return The relative URI. The relative URI must begin with &#34;/&#34; and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    public Optional<Output<String>> relativeUri() {
        return Optional.ofNullable(this.relativeUri);
    }

    private AppEngineHttpRequestArgs() {}

    private AppEngineHttpRequestArgs(AppEngineHttpRequestArgs $) {
        this.appEngineRouting = $.appEngineRouting;
        this.body = $.body;
        this.headers = $.headers;
        this.httpMethod = $.httpMethod;
        this.relativeUri = $.relativeUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppEngineHttpRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineHttpRequestArgs $;

        public Builder() {
            $ = new AppEngineHttpRequestArgs();
        }

        public Builder(AppEngineHttpRequestArgs defaults) {
            $ = new AppEngineHttpRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineRouting Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRouting(@Nullable Output<AppEngineRoutingArgs> appEngineRouting) {
            $.appEngineRouting = appEngineRouting;
            return this;
        }

        /**
         * @param appEngineRouting Task-level setting for App Engine routing. If set, app_engine_routing_override is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRouting(AppEngineRoutingArgs appEngineRouting) {
            return appEngineRouting(Output.of(appEngineRouting));
        }

        /**
         * @param body HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
         * 
         * @return builder
         * 
         */
        public Builder body(String body) {
            return body(Output.of(body));
        }

        /**
         * @param headers HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Tasks will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;`. This header can be modified, but Cloud Tasks will append `&#34;AppEngine-Google; (+http://code.google.com/appengine)&#34;` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `&#34;application/octet-stream&#34;`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `&#34;application/json&#34;`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,String> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param httpMethod The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<AppEngineHttpRequestHttpMethod> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP method to use for the request. The default is POST. The app&#39;s request handler for the task&#39;s target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(AppEngineHttpRequestHttpMethod httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param relativeUri The relative URI. The relative URI must begin with &#34;/&#34; and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
         * 
         * @return builder
         * 
         */
        public Builder relativeUri(@Nullable Output<String> relativeUri) {
            $.relativeUri = relativeUri;
            return this;
        }

        /**
         * @param relativeUri The relative URI. The relative URI must begin with &#34;/&#34; and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path &#34;/&#34; will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
         * 
         * @return builder
         * 
         */
        public Builder relativeUri(String relativeUri) {
            return relativeUri(Output.of(relativeUri));
        }

        public AppEngineHttpRequestArgs build() {
            return $;
        }
    }

}
