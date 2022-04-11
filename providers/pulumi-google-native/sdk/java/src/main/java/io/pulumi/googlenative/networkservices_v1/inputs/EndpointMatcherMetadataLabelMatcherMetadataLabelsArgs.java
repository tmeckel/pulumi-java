// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines a name-pair value for a single label.
 * 
 */
public final class EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs Empty = new EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs();

    /**
     * Label name presented as key in xDS Node Metadata.
     * 
     */
    @Import(name="labelName", required=true)
      private final Output<String> labelName;

    public Output<String> getLabelName() {
        return this.labelName;
    }

    /**
     * Label value presented as value corresponding to the above key, in xDS Node Metadata.
     * 
     */
    @Import(name="labelValue", required=true)
      private final Output<String> labelValue;

    public Output<String> getLabelValue() {
        return this.labelValue;
    }

    public EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs(
        Output<String> labelName,
        Output<String> labelValue) {
        this.labelName = Objects.requireNonNull(labelName, "expected parameter 'labelName' to be non-null");
        this.labelValue = Objects.requireNonNull(labelValue, "expected parameter 'labelValue' to be non-null");
    }

    private EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs() {
        this.labelName = Codegen.empty();
        this.labelValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> labelName;
        private Output<String> labelValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
    	      this.labelValue = defaults.labelValue;
        }

        public Builder labelName(Output<String> labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }
        public Builder labelName(String labelName) {
            this.labelName = Output.of(Objects.requireNonNull(labelName));
            return this;
        }
        public Builder labelValue(Output<String> labelValue) {
            this.labelValue = Objects.requireNonNull(labelValue);
            return this;
        }
        public Builder labelValue(String labelValue) {
            this.labelValue = Output.of(Objects.requireNonNull(labelValue));
            return this;
        }        public EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs build() {
            return new EndpointMatcherMetadataLabelMatcherMetadataLabelsArgs(labelName, labelValue);
        }
    }
}
