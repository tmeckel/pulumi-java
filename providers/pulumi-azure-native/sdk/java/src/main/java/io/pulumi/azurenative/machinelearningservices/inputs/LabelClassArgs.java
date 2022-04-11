// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a label or a category of labels in a labeling job.
 * 
 */
public final class LabelClassArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelClassArgs Empty = new LabelClassArgs();

    /**
     * Display name of the label class.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Dictionary of subclasses of the label class.
     * 
     */
    @Import(name="subclasses")
      private final @Nullable Output<Map<String,LabelClassArgs>> subclasses;

    public Output<Map<String,LabelClassArgs>> getSubclasses() {
        return this.subclasses == null ? Codegen.empty() : this.subclasses;
    }

    public LabelClassArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<Map<String,LabelClassArgs>> subclasses) {
        this.displayName = displayName;
        this.subclasses = subclasses;
    }

    private LabelClassArgs() {
        this.displayName = Codegen.empty();
        this.subclasses = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelClassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<Map<String,LabelClassArgs>> subclasses;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelClassArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.subclasses = defaults.subclasses;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder subclasses(@Nullable Output<Map<String,LabelClassArgs>> subclasses) {
            this.subclasses = subclasses;
            return this;
        }
        public Builder subclasses(@Nullable Map<String,LabelClassArgs> subclasses) {
            this.subclasses = Codegen.ofNullable(subclasses);
            return this;
        }        public LabelClassArgs build() {
            return new LabelClassArgs(displayName, subclasses);
        }
    }
}
