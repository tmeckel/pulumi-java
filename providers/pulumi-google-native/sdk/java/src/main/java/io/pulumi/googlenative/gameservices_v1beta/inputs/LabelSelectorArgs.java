// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The label selector, used to group labels on the resources.
 * 
 */
public final class LabelSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelSelectorArgs Empty = new LabelSelectorArgs();

    /**
     * Resource labels for this selector.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    public LabelSelectorArgs(@Nullable Output<Map<String,String>> labels) {
        this.labels = labels;
    }

    private LabelSelectorArgs() {
        this.labels = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }        public LabelSelectorArgs build() {
            return new LabelSelectorArgs(labels);
        }
    }
}
