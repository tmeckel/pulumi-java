// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.IpMappingType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database instance IP Mapping.
 * 
 */
public final class IpMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpMappingArgs Empty = new IpMappingArgs();

    /**
     * The IP address assigned.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
     */
    @InputImport(name="timeToRetire")
    private final @Nullable Input<String> timeToRetire;

    public Input<String> getTimeToRetire() {
        return this.timeToRetire == null ? Input.empty() : this.timeToRetire;
    }

    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<IpMappingType> type;

    public Input<IpMappingType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IpMappingArgs(
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> timeToRetire,
        @Nullable Input<IpMappingType> type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    private IpMappingArgs() {
        this.ipAddress = Input.empty();
        this.timeToRetire = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> timeToRetire;
        private @Nullable Input<IpMappingType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setTimeToRetire(@Nullable Input<String> timeToRetire) {
            this.timeToRetire = timeToRetire;
            return this;
        }

        public Builder setTimeToRetire(@Nullable String timeToRetire) {
            this.timeToRetire = Input.ofNullable(timeToRetire);
            return this;
        }

        public Builder setType(@Nullable Input<IpMappingType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable IpMappingType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public IpMappingArgs build() {
            return new IpMappingArgs(ipAddress, timeToRetire, type);
        }
    }
}
