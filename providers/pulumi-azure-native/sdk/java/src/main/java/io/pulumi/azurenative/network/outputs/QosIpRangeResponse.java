// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class QosIpRangeResponse {
    /**
     * End IP Address.
     * 
     */
    private final @Nullable String endIP;
    /**
     * Start IP Address.
     * 
     */
    private final @Nullable String startIP;

    @OutputCustomType.Constructor
    private QosIpRangeResponse(
        @OutputCustomType.Parameter("endIP") @Nullable String endIP,
        @OutputCustomType.Parameter("startIP") @Nullable String startIP) {
        this.endIP = endIP;
        this.startIP = startIP;
    }

    /**
     * End IP Address.
     * 
    */
    public Optional<String> getEndIP() {
        return Optional.ofNullable(this.endIP);
    }
    /**
     * Start IP Address.
     * 
    */
    public Optional<String> getStartIP() {
        return Optional.ofNullable(this.startIP);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QosIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIP;
        private @Nullable String startIP;

        public Builder() {
    	      // Empty
        }

        public Builder(QosIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIP = defaults.endIP;
    	      this.startIP = defaults.startIP;
        }

        public Builder endIP(@Nullable String endIP) {
            this.endIP = endIP;
            return this;
        }

        public Builder startIP(@Nullable String startIP) {
            this.startIP = startIP;
            return this;
        }
        public QosIpRangeResponse build() {
            return new QosIpRangeResponse(endIP, startIP);
        }
    }
}
