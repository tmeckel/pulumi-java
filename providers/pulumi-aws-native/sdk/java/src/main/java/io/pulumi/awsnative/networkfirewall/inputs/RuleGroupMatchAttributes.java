// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupAddress;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupPortRange;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupTCPFlagField;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupMatchAttributes extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupMatchAttributes Empty = new RuleGroupMatchAttributes();

    @InputImport(name="destinationPorts")
      private final @Nullable List<RuleGroupPortRange> destinationPorts;

    public List<RuleGroupPortRange> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }

    @InputImport(name="destinations")
      private final @Nullable List<RuleGroupAddress> destinations;

    public List<RuleGroupAddress> getDestinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }

    @InputImport(name="protocols")
      private final @Nullable List<Integer> protocols;

    public List<Integer> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }

    @InputImport(name="sourcePorts")
      private final @Nullable List<RuleGroupPortRange> sourcePorts;

    public List<RuleGroupPortRange> getSourcePorts() {
        return this.sourcePorts == null ? List.of() : this.sourcePorts;
    }

    @InputImport(name="sources")
      private final @Nullable List<RuleGroupAddress> sources;

    public List<RuleGroupAddress> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }

    @InputImport(name="tCPFlags")
      private final @Nullable List<RuleGroupTCPFlagField> tCPFlags;

    public List<RuleGroupTCPFlagField> getTCPFlags() {
        return this.tCPFlags == null ? List.of() : this.tCPFlags;
    }

    public RuleGroupMatchAttributes(
        @Nullable List<RuleGroupPortRange> destinationPorts,
        @Nullable List<RuleGroupAddress> destinations,
        @Nullable List<Integer> protocols,
        @Nullable List<RuleGroupPortRange> sourcePorts,
        @Nullable List<RuleGroupAddress> sources,
        @Nullable List<RuleGroupTCPFlagField> tCPFlags) {
        this.destinationPorts = destinationPorts;
        this.destinations = destinations;
        this.protocols = protocols;
        this.sourcePorts = sourcePorts;
        this.sources = sources;
        this.tCPFlags = tCPFlags;
    }

    private RuleGroupMatchAttributes() {
        this.destinationPorts = List.of();
        this.destinations = List.of();
        this.protocols = List.of();
        this.sourcePorts = List.of();
        this.sources = List.of();
        this.tCPFlags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupMatchAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RuleGroupPortRange> destinationPorts;
        private @Nullable List<RuleGroupAddress> destinations;
        private @Nullable List<Integer> protocols;
        private @Nullable List<RuleGroupPortRange> sourcePorts;
        private @Nullable List<RuleGroupAddress> sources;
        private @Nullable List<RuleGroupTCPFlagField> tCPFlags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupMatchAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinations = defaults.destinations;
    	      this.protocols = defaults.protocols;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sources = defaults.sources;
    	      this.tCPFlags = defaults.tCPFlags;
        }

        public Builder destinationPorts(@Nullable List<RuleGroupPortRange> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder destinations(@Nullable List<RuleGroupAddress> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder protocols(@Nullable List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder sourcePorts(@Nullable List<RuleGroupPortRange> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }

        public Builder sources(@Nullable List<RuleGroupAddress> sources) {
            this.sources = sources;
            return this;
        }

        public Builder tCPFlags(@Nullable List<RuleGroupTCPFlagField> tCPFlags) {
            this.tCPFlags = tCPFlags;
            return this;
        }
        public RuleGroupMatchAttributes build() {
            return new RuleGroupMatchAttributes(destinationPorts, destinations, protocols, sourcePorts, sources, tCPFlags);
        }
    }
}
