// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Database instance IP Mapping.
 * 
 */
public final class IpMappingResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpMappingResponse Empty = new IpMappingResponse();

    /**
     * The IP address assigned.
     * 
     */
    @InputImport(name="ipAddress", required=true)
      private final String ipAddress;

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * The due time for this IP to be retired in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`. This field is only available when the IP is scheduled to be retired.
     * 
     */
    @InputImport(name="timeToRetire", required=true)
      private final String timeToRetire;

    public String getTimeToRetire() {
        return this.timeToRetire;
    }

    /**
     * The type of this IP address. A `PRIMARY` address is a public address that can accept incoming connections. A `PRIVATE` address is a private address that can accept incoming connections. An `OUTGOING` address is the source address of connections originating from the instance, if supported.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public IpMappingResponse(
        String ipAddress,
        String timeToRetire,
        String type) {
        this.ipAddress = Objects.requireNonNull(ipAddress, "expected parameter 'ipAddress' to be non-null");
        this.timeToRetire = Objects.requireNonNull(timeToRetire, "expected parameter 'timeToRetire' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IpMappingResponse() {
        this.ipAddress = null;
        this.timeToRetire = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String timeToRetire;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder timeToRetire(String timeToRetire) {
            this.timeToRetire = Objects.requireNonNull(timeToRetire);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public IpMappingResponse build() {
            return new IpMappingResponse(ipAddress, timeToRetire, type);
        }
    }
}
