// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class QueueOutboundCallerConfig {
    /**
     * @return Specifies the caller ID name.
     * 
     */
    private final @Nullable String outboundCallerIdName;
    /**
     * @return Specifies the caller ID number.
     * 
     */
    private final @Nullable String outboundCallerIdNumberId;
    /**
     * @return Specifies outbound whisper flow to be used during an outbound call.
     * 
     */
    private final @Nullable String outboundFlowId;

    @CustomType.Constructor
    private QueueOutboundCallerConfig(
        @CustomType.Parameter("outboundCallerIdName") @Nullable String outboundCallerIdName,
        @CustomType.Parameter("outboundCallerIdNumberId") @Nullable String outboundCallerIdNumberId,
        @CustomType.Parameter("outboundFlowId") @Nullable String outboundFlowId) {
        this.outboundCallerIdName = outboundCallerIdName;
        this.outboundCallerIdNumberId = outboundCallerIdNumberId;
        this.outboundFlowId = outboundFlowId;
    }

    /**
     * @return Specifies the caller ID name.
     * 
     */
    public Optional<String> outboundCallerIdName() {
        return Optional.ofNullable(this.outboundCallerIdName);
    }
    /**
     * @return Specifies the caller ID number.
     * 
     */
    public Optional<String> outboundCallerIdNumberId() {
        return Optional.ofNullable(this.outboundCallerIdNumberId);
    }
    /**
     * @return Specifies outbound whisper flow to be used during an outbound call.
     * 
     */
    public Optional<String> outboundFlowId() {
        return Optional.ofNullable(this.outboundFlowId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueOutboundCallerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String outboundCallerIdName;
        private @Nullable String outboundCallerIdNumberId;
        private @Nullable String outboundFlowId;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueOutboundCallerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outboundCallerIdName = defaults.outboundCallerIdName;
    	      this.outboundCallerIdNumberId = defaults.outboundCallerIdNumberId;
    	      this.outboundFlowId = defaults.outboundFlowId;
        }

        public Builder outboundCallerIdName(@Nullable String outboundCallerIdName) {
            this.outboundCallerIdName = outboundCallerIdName;
            return this;
        }
        public Builder outboundCallerIdNumberId(@Nullable String outboundCallerIdNumberId) {
            this.outboundCallerIdNumberId = outboundCallerIdNumberId;
            return this;
        }
        public Builder outboundFlowId(@Nullable String outboundFlowId) {
            this.outboundFlowId = outboundFlowId;
            return this;
        }        public QueueOutboundCallerConfig build() {
            return new QueueOutboundCallerConfig(outboundCallerIdName, outboundCallerIdNumberId, outboundFlowId);
        }
    }
}
