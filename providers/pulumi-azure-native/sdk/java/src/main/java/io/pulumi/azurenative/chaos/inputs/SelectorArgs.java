// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.enums.SelectorType;
import io.pulumi.azurenative.chaos.inputs.TargetReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a selector in the Experiment resource.
 * 
 */
public final class SelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final SelectorArgs Empty = new SelectorArgs();

    /**
     * String of the selector ID.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * List of Target references.
     * 
     */
    @InputImport(name="targets", required=true)
      private final Input<List<TargetReferenceArgs>> targets;

    public Input<List<TargetReferenceArgs>> getTargets() {
        return this.targets;
    }

    /**
     * Enum of the selector type.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<SelectorType> type;

    public Input<SelectorType> getType() {
        return this.type;
    }

    public SelectorArgs(
        Input<String> id,
        Input<List<TargetReferenceArgs>> targets,
        Input<SelectorType> type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.targets = Objects.requireNonNull(targets, "expected parameter 'targets' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SelectorArgs() {
        this.id = Input.empty();
        this.targets = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private Input<List<TargetReferenceArgs>> targets;
        private Input<SelectorType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.targets = defaults.targets;
    	      this.type = defaults.type;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder targets(Input<List<TargetReferenceArgs>> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }

        public Builder targets(List<TargetReferenceArgs> targets) {
            this.targets = Input.of(Objects.requireNonNull(targets));
            return this;
        }

        public Builder type(Input<SelectorType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(SelectorType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public SelectorArgs build() {
            return new SelectorArgs(id, targets, type);
        }
    }
}
