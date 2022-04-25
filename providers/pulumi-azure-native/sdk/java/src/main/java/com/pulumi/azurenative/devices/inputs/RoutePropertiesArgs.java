// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.enums.RoutingSource;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a routing rule that your IoT hub uses to route messages to endpoints.
 * 
 */
public final class RoutePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutePropertiesArgs Empty = new RoutePropertiesArgs();

    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
     */
    @Import(name="endpointNames", required=true)
    private Output<List<String>> endpointNames;

    /**
     * @return The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
     */
    public Output<List<String>> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Used to specify whether a route is enabled.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Used to specify whether a route is enabled.
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     */
    @Import(name="source", required=true)
    private Output<Either<String,RoutingSource>> source;

    /**
     * @return The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     */
    public Output<Either<String,RoutingSource>> source() {
        return this.source;
    }

    private RoutePropertiesArgs() {}

    private RoutePropertiesArgs(RoutePropertiesArgs $) {
        this.condition = $.condition;
        this.endpointNames = $.endpointNames;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutePropertiesArgs $;

        public Builder() {
            $ = new RoutePropertiesArgs();
        }

        public Builder(RoutePropertiesArgs defaults) {
            $ = new RoutePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param endpointNames The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(Output<List<String>> endpointNames) {
            $.endpointNames = endpointNames;
            return this;
        }

        /**
         * @param endpointNames The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(List<String> endpointNames) {
            return endpointNames(Output.of(endpointNames));
        }

        /**
         * @param endpointNames The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(String... endpointNames) {
            return endpointNames(List.of(endpointNames));
        }

        /**
         * @param isEnabled Used to specify whether a route is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Used to specify whether a route is enabled.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param name The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param source The source that the routing rule is to be applied to, such as DeviceMessages.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<Either<String,RoutingSource>> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source that the routing rule is to be applied to, such as DeviceMessages.
         * 
         * @return builder
         * 
         */
        public Builder source(Either<String,RoutingSource> source) {
            return source(Output.of(source));
        }

        /**
         * @param source The source that the routing rule is to be applied to, such as DeviceMessages.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Either.ofLeft(source));
        }

        /**
         * @param source The source that the routing rule is to be applied to, such as DeviceMessages.
         * 
         * @return builder
         * 
         */
        public Builder source(RoutingSource source) {
            return source(Either.ofRight(source));
        }

        public RoutePropertiesArgs build() {
            $.endpointNames = Objects.requireNonNull($.endpointNames, "expected parameter 'endpointNames' to be non-null");
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
