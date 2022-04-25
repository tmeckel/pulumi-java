// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecLoggingAccessLogFile {
    /**
     * @return The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private VirtualGatewaySpecLoggingAccessLogFile(@CustomType.Parameter("path") String path) {
        this.path = path;
    }

    /**
     * @return The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLogFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecLoggingAccessLogFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public VirtualGatewaySpecLoggingAccessLogFile build() {
            return new VirtualGatewaySpecLoggingAccessLogFile(path);
        }
    }
}
