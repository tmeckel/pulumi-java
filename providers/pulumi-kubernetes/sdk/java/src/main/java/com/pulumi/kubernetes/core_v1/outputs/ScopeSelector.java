// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.ScopedResourceSelectorRequirement;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ScopeSelector {
    /**
     * @return A list of scope selector requirements by scope of the resources.
     * 
     */
    private final @Nullable List<ScopedResourceSelectorRequirement> matchExpressions;

    @CustomType.Constructor
    private ScopeSelector(@CustomType.Parameter("matchExpressions") @Nullable List<ScopedResourceSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    /**
     * @return A list of scope selector requirements by scope of the resources.
     * 
     */
    public List<ScopedResourceSelectorRequirement> matchExpressions() {
        return this.matchExpressions == null ? List.of() : this.matchExpressions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ScopedResourceSelectorRequirement> matchExpressions;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
        }

        public Builder matchExpressions(@Nullable List<ScopedResourceSelectorRequirement> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }
        public Builder matchExpressions(ScopedResourceSelectorRequirement... matchExpressions) {
            return matchExpressions(List.of(matchExpressions));
        }        public ScopeSelector build() {
            return new ScopeSelector(matchExpressions);
        }
    }
}
