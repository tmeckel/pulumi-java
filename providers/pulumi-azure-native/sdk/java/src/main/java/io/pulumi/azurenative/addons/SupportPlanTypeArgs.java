// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.addons;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SupportPlanTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SupportPlanTypeArgs Empty = new SupportPlanTypeArgs();

    /**
     * The Canonical support plan type.
     * 
     */
    @InputImport(name="planTypeName")
      private final @Nullable Input<String> planTypeName;

    public Input<String> getPlanTypeName() {
        return this.planTypeName == null ? Input.empty() : this.planTypeName;
    }

    /**
     * The support plan type. For now the only valid type is "canonical".
     * 
     */
    @InputImport(name="providerName", required=true)
      private final Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName;
    }

    public SupportPlanTypeArgs(
        @Nullable Input<String> planTypeName,
        Input<String> providerName) {
        this.planTypeName = planTypeName;
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
    }

    private SupportPlanTypeArgs() {
        this.planTypeName = Input.empty();
        this.providerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SupportPlanTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> planTypeName;
        private Input<String> providerName;

        public Builder() {
    	      // Empty
        }

        public Builder(SupportPlanTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.planTypeName = defaults.planTypeName;
    	      this.providerName = defaults.providerName;
        }

        public Builder planTypeName(@Nullable Input<String> planTypeName) {
            this.planTypeName = planTypeName;
            return this;
        }

        public Builder planTypeName(@Nullable String planTypeName) {
            this.planTypeName = Input.ofNullable(planTypeName);
            return this;
        }

        public Builder providerName(Input<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder providerName(String providerName) {
            this.providerName = Input.of(Objects.requireNonNull(providerName));
            return this;
        }
        public SupportPlanTypeArgs build() {
            return new SupportPlanTypeArgs(planTypeName, providerName);
        }
    }
}
