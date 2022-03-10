// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class PolicyRestorePolicy {
    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
     */
    private final Boolean $default;

    @OutputCustomType.Constructor
    private PolicyRestorePolicy(@OutputCustomType.Parameter("default") Boolean $default) {
        this.$default = $default;
    }

    /**
     * May only be set to true. If set, then the default Policy is restored.
     * 
    */
    public Boolean get$default() {
        return this.$default;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRestorePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean $default;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRestorePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
        }

        public Builder $default(Boolean $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }
        public PolicyRestorePolicy build() {
            return new PolicyRestorePolicy($default);
        }
    }
}
