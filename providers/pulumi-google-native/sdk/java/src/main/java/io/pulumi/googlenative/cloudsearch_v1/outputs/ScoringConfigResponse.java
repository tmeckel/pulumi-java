// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ScoringConfigResponse {
    /**
     * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI.
     * 
     */
    private final Boolean disableFreshness;
    /**
     * Whether to personalize the results. By default, personal signals will be used to boost results.
     * 
     */
    private final Boolean disablePersonalization;

    @OutputCustomType.Constructor({"disableFreshness","disablePersonalization"})
    private ScoringConfigResponse(
        Boolean disableFreshness,
        Boolean disablePersonalization) {
        this.disableFreshness = Objects.requireNonNull(disableFreshness);
        this.disablePersonalization = Objects.requireNonNull(disablePersonalization);
    }

    /**
     * Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI.
     * 
     */
    public Boolean getDisableFreshness() {
        return this.disableFreshness;
    }
    /**
     * Whether to personalize the results. By default, personal signals will be used to boost results.
     * 
     */
    public Boolean getDisablePersonalization() {
        return this.disablePersonalization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScoringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableFreshness;
        private Boolean disablePersonalization;

        public Builder() {
    	      // Empty
        }

        public Builder(ScoringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableFreshness = defaults.disableFreshness;
    	      this.disablePersonalization = defaults.disablePersonalization;
        }

        public Builder setDisableFreshness(Boolean disableFreshness) {
            this.disableFreshness = Objects.requireNonNull(disableFreshness);
            return this;
        }

        public Builder setDisablePersonalization(Boolean disablePersonalization) {
            this.disablePersonalization = Objects.requireNonNull(disablePersonalization);
            return this;
        }

        public ScoringConfigResponse build() {
            return new ScoringConfigResponse(disableFreshness, disablePersonalization);
        }
    }
}
