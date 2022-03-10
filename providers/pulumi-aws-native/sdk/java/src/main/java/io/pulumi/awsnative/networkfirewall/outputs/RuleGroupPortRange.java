// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupPortRange {
    private final Integer fromPort;
    private final Integer toPort;

    @OutputCustomType.Constructor
    private RuleGroupPortRange(
        @OutputCustomType.Parameter("fromPort") Integer fromPort,
        @OutputCustomType.Parameter("toPort") Integer toPort) {
        this.fromPort = fromPort;
        this.toPort = toPort;
    }

    public Integer getFromPort() {
        return this.fromPort;
    }
    public Integer getToPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fromPort;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fromPort = defaults.fromPort;
    	      this.toPort = defaults.toPort;
        }

        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }

        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }
        public RuleGroupPortRange build() {
            return new RuleGroupPortRange(fromPort, toPort);
        }
    }
}
