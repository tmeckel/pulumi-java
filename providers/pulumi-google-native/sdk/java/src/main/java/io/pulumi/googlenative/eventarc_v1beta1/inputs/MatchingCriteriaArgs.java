// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Matches events based on exact matches on the CloudEvents attributes.
 * 
 */
public final class MatchingCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final MatchingCriteriaArgs Empty = new MatchingCriteriaArgs();

    /**
     * The name of a CloudEvents attribute. Currently, only a subset of attributes can be specified. All triggers MUST provide a matching criteria for the 'type' attribute.
     * 
     */
    @Import(name="attribute", required=true)
      private final Output<String> attribute;

    public Output<String> getAttribute() {
        return this.attribute;
    }

    /**
     * The value for the attribute.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public MatchingCriteriaArgs(
        Output<String> attribute,
        Output<String> value) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private MatchingCriteriaArgs() {
        this.attribute = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MatchingCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attribute;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MatchingCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.value = defaults.value;
        }

        public Builder attribute(Output<String> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder attribute(String attribute) {
            this.attribute = Output.of(Objects.requireNonNull(attribute));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public MatchingCriteriaArgs build() {
            return new MatchingCriteriaArgs(attribute, value);
        }
    }
}
