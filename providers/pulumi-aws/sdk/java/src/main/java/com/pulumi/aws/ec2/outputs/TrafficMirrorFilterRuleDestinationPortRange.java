// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TrafficMirrorFilterRuleDestinationPortRange {
    /**
     * @return Starting port of the range
     * 
     */
    private final @Nullable Integer fromPort;
    /**
     * @return Ending port of the range
     * 
     */
    private final @Nullable Integer toPort;

    @CustomType.Constructor
    private TrafficMirrorFilterRuleDestinationPortRange(
        @CustomType.Parameter("fromPort") @Nullable Integer fromPort,
        @CustomType.Parameter("toPort") @Nullable Integer toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    /**
     * @return Starting port of the range
     * 
     */
    public Optional<Integer> fromPort() {
        return Optional.ofNullable(this.fromPort);
    }
    /**
     * @return Ending port of the range
     * 
     */
    public Optional<Integer> toPort() {
        return Optional.ofNullable(this.toPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorFilterRuleDestinationPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer fromPort;
        private @Nullable Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorFilterRuleDestinationPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = toPort;
            return this;
        }        public TrafficMirrorFilterRuleDestinationPortRange build() {
            return new TrafficMirrorFilterRuleDestinationPortRange(fromPort, toPort);
        }
    }
}
