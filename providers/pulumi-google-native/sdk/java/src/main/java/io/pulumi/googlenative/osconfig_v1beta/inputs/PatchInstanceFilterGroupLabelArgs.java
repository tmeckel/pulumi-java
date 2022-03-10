// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a group of VMs that can be identified as having all these labels, for example "env=prod and app=web".
 * 
 */
public final class PatchInstanceFilterGroupLabelArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchInstanceFilterGroupLabelArgs Empty = new PatchInstanceFilterGroupLabelArgs();

    /**
     * Compute Engine instance labels that must be present for a VM instance to be targeted by this filter.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    public PatchInstanceFilterGroupLabelArgs(@Nullable Input<Map<String,String>> labels) {
        this.labels = labels;
    }

    private PatchInstanceFilterGroupLabelArgs() {
        this.labels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchInstanceFilterGroupLabelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchInstanceFilterGroupLabelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }
        public PatchInstanceFilterGroupLabelArgs build() {
            return new PatchInstanceFilterGroupLabelArgs(labels);
        }
    }
}
