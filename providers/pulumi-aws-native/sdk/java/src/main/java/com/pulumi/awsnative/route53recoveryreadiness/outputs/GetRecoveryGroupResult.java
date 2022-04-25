// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.outputs;

import com.pulumi.awsnative.route53recoveryreadiness.outputs.RecoveryGroupTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecoveryGroupResult {
    /**
     * @return A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    private final @Nullable List<String> cells;
    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    private final @Nullable String recoveryGroupArn;
    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    private final @Nullable List<RecoveryGroupTag> tags;

    @CustomType.Constructor
    private GetRecoveryGroupResult(
        @CustomType.Parameter("cells") @Nullable List<String> cells,
        @CustomType.Parameter("recoveryGroupArn") @Nullable String recoveryGroupArn,
        @CustomType.Parameter("tags") @Nullable List<RecoveryGroupTag> tags) {
        this.cells = cells;
        this.recoveryGroupArn = recoveryGroupArn;
        this.tags = tags;
    }

    /**
     * @return A list of the cell Amazon Resource Names (ARNs) in the recovery group.
     * 
     */
    public List<String> cells() {
        return this.cells == null ? List.of() : this.cells;
    }
    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public Optional<String> recoveryGroupArn() {
        return Optional.ofNullable(this.recoveryGroupArn);
    }
    /**
     * @return A collection of tags associated with a resource.
     * 
     */
    public List<RecoveryGroupTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecoveryGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cells;
        private @Nullable String recoveryGroupArn;
        private @Nullable List<RecoveryGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecoveryGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cells = defaults.cells;
    	      this.recoveryGroupArn = defaults.recoveryGroupArn;
    	      this.tags = defaults.tags;
        }

        public Builder cells(@Nullable List<String> cells) {
            this.cells = cells;
            return this;
        }
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }
        public Builder recoveryGroupArn(@Nullable String recoveryGroupArn) {
            this.recoveryGroupArn = recoveryGroupArn;
            return this;
        }
        public Builder tags(@Nullable List<RecoveryGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(RecoveryGroupTag... tags) {
            return tags(List.of(tags));
        }        public GetRecoveryGroupResult build() {
            return new GetRecoveryGroupResult(cells, recoveryGroupArn, tags);
        }
    }
}
