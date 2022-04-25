// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceHealthCheckConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckConfigGetArgs Empty = new ServiceHealthCheckConfigGetArgs();

    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    /**
     * @return The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don&#39;t specify a value, the default value is /.
     * 
     */
    @Import(name="resourcePath")
    private @Nullable Output<String> resourcePath;

    /**
     * @return The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don&#39;t specify a value, the default value is /.
     * 
     */
    public Optional<Output<String>> resourcePath() {
        return Optional.ofNullable(this.resourcePath);
    }

    /**
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ServiceHealthCheckConfigGetArgs() {}

    private ServiceHealthCheckConfigGetArgs(ServiceHealthCheckConfigGetArgs $) {
        this.failureThreshold = $.failureThreshold;
        this.resourcePath = $.resourcePath;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHealthCheckConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHealthCheckConfigGetArgs $;

        public Builder() {
            $ = new ServiceHealthCheckConfigGetArgs();
        }

        public Builder(ServiceHealthCheckConfigGetArgs defaults) {
            $ = new ServiceHealthCheckConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureThreshold The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param failureThreshold The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        /**
         * @param resourcePath The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don&#39;t specify a value, the default value is /.
         * 
         * @return builder
         * 
         */
        public Builder resourcePath(@Nullable Output<String> resourcePath) {
            $.resourcePath = resourcePath;
            return this;
        }

        /**
         * @param resourcePath The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don&#39;t specify a value, the default value is /.
         * 
         * @return builder
         * 
         */
        public Builder resourcePath(String resourcePath) {
            return resourcePath(Output.of(resourcePath));
        }

        /**
         * @param type The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ServiceHealthCheckConfigGetArgs build() {
            return $;
        }
    }

}
