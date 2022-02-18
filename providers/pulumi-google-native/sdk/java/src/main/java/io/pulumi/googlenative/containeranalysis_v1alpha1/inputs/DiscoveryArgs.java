// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.enums.DiscoveryAnalysisKind;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider's project. A `Discovery` occurrence is created in a consumer's project at the start of analysis. The occurrence's operation will indicate the status of the analysis. Absence of an occurrence linked to this note for a resource indicates that analysis hasn't started.
 * 
 */
public final class DiscoveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiscoveryArgs Empty = new DiscoveryArgs();

    /**
     * The kind of analysis that is handled by this discovery.
     * 
     */
    @InputImport(name="analysisKind")
    private final @Nullable Input<DiscoveryAnalysisKind> analysisKind;

    public Input<DiscoveryAnalysisKind> getAnalysisKind() {
        return this.analysisKind == null ? Input.empty() : this.analysisKind;
    }

    public DiscoveryArgs(@Nullable Input<DiscoveryAnalysisKind> analysisKind) {
        this.analysisKind = analysisKind;
    }

    private DiscoveryArgs() {
        this.analysisKind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscoveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DiscoveryAnalysisKind> analysisKind;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscoveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analysisKind = defaults.analysisKind;
        }

        public Builder setAnalysisKind(@Nullable Input<DiscoveryAnalysisKind> analysisKind) {
            this.analysisKind = analysisKind;
            return this;
        }

        public Builder setAnalysisKind(@Nullable DiscoveryAnalysisKind analysisKind) {
            this.analysisKind = Input.ofNullable(analysisKind);
            return this;
        }

        public DiscoveryArgs build() {
            return new DiscoveryArgs(analysisKind);
        }
    }
}
