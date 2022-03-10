// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTCPFlag;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupTCPFlagField extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupTCPFlagField Empty = new RuleGroupTCPFlagField();

    @InputImport(name="flags", required=true)
      private final List<RuleGroupTCPFlag> flags;

    public List<RuleGroupTCPFlag> getFlags() {
        return this.flags;
    }

    @InputImport(name="masks")
      private final @Nullable List<RuleGroupTCPFlag> masks;

    public List<RuleGroupTCPFlag> getMasks() {
        return this.masks == null ? List.of() : this.masks;
    }

    public RuleGroupTCPFlagField(
        List<RuleGroupTCPFlag> flags,
        @Nullable List<RuleGroupTCPFlag> masks) {
        this.flags = Objects.requireNonNull(flags, "expected parameter 'flags' to be non-null");
        this.masks = masks;
    }

    private RuleGroupTCPFlagField() {
        this.flags = List.of();
        this.masks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupTCPFlagField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupTCPFlag> flags;
        private @Nullable List<RuleGroupTCPFlag> masks;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupTCPFlagField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.masks = defaults.masks;
        }

        public Builder flags(List<RuleGroupTCPFlag> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }

        public Builder masks(@Nullable List<RuleGroupTCPFlag> masks) {
            this.masks = masks;
            return this;
        }
        public RuleGroupTCPFlagField build() {
            return new RuleGroupTCPFlagField(flags, masks);
        }
    }
}
