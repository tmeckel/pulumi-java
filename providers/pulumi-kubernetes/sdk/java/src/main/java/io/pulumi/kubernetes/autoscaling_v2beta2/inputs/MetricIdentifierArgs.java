// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetricIdentifier defines the name and optionally selector for a metric
 * 
 */
public final class MetricIdentifierArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricIdentifierArgs Empty = new MetricIdentifierArgs();

    /**
     * name is the name of the given metric
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    @Import(name="selector")
      private final @Nullable Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> getSelector() {
        return this.selector == null ? Codegen.empty() : this.selector;
    }

    public MetricIdentifierArgs(
        Output<String> name,
        @Nullable Output<LabelSelectorArgs> selector) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.selector = selector;
    }

    private MetricIdentifierArgs() {
        this.name = Codegen.empty();
        this.selector = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricIdentifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<LabelSelectorArgs> selector;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricIdentifierArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.selector = defaults.selector;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            this.selector = selector;
            return this;
        }
        public Builder selector(@Nullable LabelSelectorArgs selector) {
            this.selector = Codegen.ofNullable(selector);
            return this;
        }        public MetricIdentifierArgs build() {
            return new MetricIdentifierArgs(name, selector);
        }
    }
}
