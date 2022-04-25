// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual Network route contract used to pass routing information for a Virtual Network.
 * 
 */
public final class VnetRouteResponse extends com.pulumi.resources.InvokeArgs {

    public static final VnetRouteResponse Empty = new VnetRouteResponse();

    /**
     * The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     */
    @Import(name="endAddress")
    private @Nullable String endAddress;

    /**
     * @return The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
     * 
     */
    public Optional<String> endAddress() {
        return Optional.ofNullable(this.endAddress);
    }

    /**
     * Resource Id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable String kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app&#39;s routes with those from a Virtual Network.
     * 
     */
    @Import(name="routeType")
    private @Nullable String routeType;

    /**
     * @return The type of route this is:
     * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network routes
     * STATIC - Static route set on the app only
     * 
     * These values will be used for syncing an app&#39;s routes with those from a Virtual Network.
     * 
     */
    public Optional<String> routeType() {
        return Optional.ofNullable(this.routeType);
    }

    /**
     * The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     */
    @Import(name="startAddress")
    private @Nullable String startAddress;

    /**
     * @return The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
     * 
     */
    public Optional<String> startAddress() {
        return Optional.ofNullable(this.startAddress);
    }

    /**
     * Resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    private VnetRouteResponse() {}

    private VnetRouteResponse(VnetRouteResponse $) {
        this.endAddress = $.endAddress;
        this.id = $.id;
        this.kind = $.kind;
        this.name = $.name;
        this.routeType = $.routeType;
        this.startAddress = $.startAddress;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VnetRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VnetRouteResponse $;

        public Builder() {
            $ = new VnetRouteResponse();
        }

        public Builder(VnetRouteResponse defaults) {
            $ = new VnetRouteResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endAddress The ending address for this route. If the start address is specified in CIDR notation, this must be omitted.
         * 
         * @return builder
         * 
         */
        public Builder endAddress(@Nullable String endAddress) {
            $.endAddress = endAddress;
            return this;
        }

        /**
         * @param id Resource Id.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name Resource Name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param routeType The type of route this is:
         * DEFAULT - By default, every app has routes to the local address ranges specified by RFC1918
         * INHERITED - Routes inherited from the real Virtual Network routes
         * STATIC - Static route set on the app only
         * 
         * These values will be used for syncing an app&#39;s routes with those from a Virtual Network.
         * 
         * @return builder
         * 
         */
        public Builder routeType(@Nullable String routeType) {
            $.routeType = routeType;
            return this;
        }

        /**
         * @param startAddress The starting address for this route. This may also include a CIDR notation, in which case the end address must not be specified.
         * 
         * @return builder
         * 
         */
        public Builder startAddress(@Nullable String startAddress) {
            $.startAddress = startAddress;
            return this;
        }

        /**
         * @param type Resource type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public VnetRouteResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
