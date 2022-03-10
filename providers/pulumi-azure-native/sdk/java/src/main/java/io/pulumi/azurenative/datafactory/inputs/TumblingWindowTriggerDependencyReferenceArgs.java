// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Referenced tumbling window trigger dependency.
 * 
 */
public final class TumblingWindowTriggerDependencyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final TumblingWindowTriggerDependencyReferenceArgs Empty = new TumblingWindowTriggerDependencyReferenceArgs();

    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    @InputImport(name="offset")
      private final @Nullable Input<String> offset;

    public Input<String> getOffset() {
        return this.offset == null ? Input.empty() : this.offset;
    }

    /**
     * Referenced trigger.
     * 
     */
    @InputImport(name="referenceTrigger", required=true)
      private final Input<TriggerReferenceArgs> referenceTrigger;

    public Input<TriggerReferenceArgs> getReferenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Input<String> size;

    public Input<String> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * The type of dependency reference.
     * Expected value is 'TumblingWindowTriggerDependencyReference'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public TumblingWindowTriggerDependencyReferenceArgs(
        @Nullable Input<String> offset,
        Input<TriggerReferenceArgs> referenceTrigger,
        @Nullable Input<String> size,
        Input<String> type) {
        this.offset = offset;
        this.referenceTrigger = Objects.requireNonNull(referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
        this.size = size;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TumblingWindowTriggerDependencyReferenceArgs() {
        this.offset = Input.empty();
        this.referenceTrigger = Input.empty();
        this.size = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TumblingWindowTriggerDependencyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> offset;
        private Input<TriggerReferenceArgs> referenceTrigger;
        private @Nullable Input<String> size;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TumblingWindowTriggerDependencyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offset = defaults.offset;
    	      this.referenceTrigger = defaults.referenceTrigger;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        public Builder offset(@Nullable Input<String> offset) {
            this.offset = offset;
            return this;
        }

        public Builder offset(@Nullable String offset) {
            this.offset = Input.ofNullable(offset);
            return this;
        }

        public Builder referenceTrigger(Input<TriggerReferenceArgs> referenceTrigger) {
            this.referenceTrigger = Objects.requireNonNull(referenceTrigger);
            return this;
        }

        public Builder referenceTrigger(TriggerReferenceArgs referenceTrigger) {
            this.referenceTrigger = Input.of(Objects.requireNonNull(referenceTrigger));
            return this;
        }

        public Builder size(@Nullable Input<String> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable String size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public TumblingWindowTriggerDependencyReferenceArgs build() {
            return new TumblingWindowTriggerDependencyReferenceArgs(offset, referenceTrigger, size, type);
        }
    }
}
