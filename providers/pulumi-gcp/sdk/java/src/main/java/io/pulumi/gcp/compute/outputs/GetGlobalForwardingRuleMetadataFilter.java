// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetGlobalForwardingRuleMetadataFilterFilterLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetGlobalForwardingRuleMetadataFilter {
    private final List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels;
    private final String filterMatchCriteria;

    @OutputCustomType.Constructor
    private GetGlobalForwardingRuleMetadataFilter(
        @OutputCustomType.Parameter("filterLabels") List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels,
        @OutputCustomType.Parameter("filterMatchCriteria") String filterMatchCriteria) {
        this.filterLabels = filterLabels;
        this.filterMatchCriteria = filterMatchCriteria;
    }

    public List<GetGlobalForwardingRuleMetadataFilterFilterLabel> getFilterLabels() {
        return this.filterLabels;
    }
    public String getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalForwardingRuleMetadataFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels;
        private String filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalForwardingRuleMetadataFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder filterLabels(List<GetGlobalForwardingRuleMetadataFilterFilterLabel> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder filterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }
        public GetGlobalForwardingRuleMetadataFilter build() {
            return new GetGlobalForwardingRuleMetadataFilter(filterLabels, filterMatchCriteria);
        }
    }
}
