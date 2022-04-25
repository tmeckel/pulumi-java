// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpHealthCheckArgs Empty = new HttpHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Import(name="checkIntervalSec")
    private @Nullable Output<Integer> checkIntervalSec;

    /**
     * @return How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    public Optional<Output<Integer>> checkIntervalSec() {
        return Optional.ofNullable(this.checkIntervalSec);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
    private @Nullable Output<Integer> healthyThreshold;

    /**
     * @return A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    public Optional<Output<Integer>> healthyThreshold() {
        return Optional.ofNullable(this.healthyThreshold);
    }

    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The TCP port number for the HTTP health check request. The default value is 80.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The TCP port number for the HTTP health check request. The default value is 80.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
     */
    @Import(name="requestPath")
    private @Nullable Output<String> requestPath;

    /**
     * @return The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
     */
    public Optional<Output<String>> requestPath() {
        return Optional.ofNullable(this.requestPath);
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
    private @Nullable Output<Integer> timeoutSec;

    /**
     * @return How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    public Optional<Output<Integer>> timeoutSec() {
        return Optional.ofNullable(this.timeoutSec);
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
    private @Nullable Output<Integer> unhealthyThreshold;

    /**
     * @return A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    public Optional<Output<Integer>> unhealthyThreshold() {
        return Optional.ofNullable(this.unhealthyThreshold);
    }

    private HttpHealthCheckArgs() {}

    private HttpHealthCheckArgs(HttpHealthCheckArgs $) {
        this.checkIntervalSec = $.checkIntervalSec;
        this.description = $.description;
        this.healthyThreshold = $.healthyThreshold;
        this.host = $.host;
        this.name = $.name;
        this.port = $.port;
        this.project = $.project;
        this.requestId = $.requestId;
        this.requestPath = $.requestPath;
        this.timeoutSec = $.timeoutSec;
        this.unhealthyThreshold = $.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpHealthCheckArgs $;

        public Builder() {
            $ = new HttpHealthCheckArgs();
        }

        public Builder(HttpHealthCheckArgs defaults) {
            $ = new HttpHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param checkIntervalSec How often (in seconds) to send a health check. The default value is 5 seconds.
         * 
         * @return builder
         * 
         */
        public Builder checkIntervalSec(@Nullable Output<Integer> checkIntervalSec) {
            $.checkIntervalSec = checkIntervalSec;
            return this;
        }

        /**
         * @param checkIntervalSec How often (in seconds) to send a health check. The default value is 5 seconds.
         * 
         * @return builder
         * 
         */
        public Builder checkIntervalSec(Integer checkIntervalSec) {
            return checkIntervalSec(Output.of(checkIntervalSec));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param healthyThreshold A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            $.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * @param healthyThreshold A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            return healthyThreshold(Output.of(healthyThreshold));
        }

        /**
         * @param host The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The TCP port number for the HTTP health check request. The default value is 80.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The TCP port number for the HTTP health check request. The default value is 80.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param requestPath The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(@Nullable Output<String> requestPath) {
            $.requestPath = requestPath;
            return this;
        }

        /**
         * @param requestPath The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(String requestPath) {
            return requestPath(Output.of(requestPath));
        }

        /**
         * @param timeoutSec How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            $.timeoutSec = timeoutSec;
            return this;
        }

        /**
         * @param timeoutSec How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSec(Integer timeoutSec) {
            return timeoutSec(Output.of(timeoutSec));
        }

        /**
         * @param unhealthyThreshold A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            $.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * @param unhealthyThreshold A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
         * 
         * @return builder
         * 
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            return unhealthyThreshold(Output.of(unhealthyThreshold));
        }

        public HttpHealthCheckArgs build() {
            return $;
        }
    }

}
