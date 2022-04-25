// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.TriggerReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Referenced tumbling window trigger dependency.
 * 
 */
public final class TumblingWindowTriggerDependencyReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TumblingWindowTriggerDependencyReferenceArgs Empty = new TumblingWindowTriggerDependencyReferenceArgs();

    /**
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    @Import(name="offset")
    private @Nullable Output<String> offset;

    /**
     * @return Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     */
    public Optional<Output<String>> offset() {
        return Optional.ofNullable(this.offset);
    }

    /**
     * Referenced trigger.
     * 
     */
    @Import(name="referenceTrigger", required=true)
    private Output<TriggerReferenceArgs> referenceTrigger;

    /**
     * @return Referenced trigger.
     * 
     */
    public Output<TriggerReferenceArgs> referenceTrigger() {
        return this.referenceTrigger;
    }

    /**
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
     */
    @Import(name="size")
    private @Nullable Output<String> size;

    /**
     * @return The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
     * 
     */
    public Optional<Output<String>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * The type of dependency reference.
     * Expected value is &#39;TumblingWindowTriggerDependencyReference&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of dependency reference.
     * Expected value is &#39;TumblingWindowTriggerDependencyReference&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TumblingWindowTriggerDependencyReferenceArgs() {}

    private TumblingWindowTriggerDependencyReferenceArgs(TumblingWindowTriggerDependencyReferenceArgs $) {
        this.offset = $.offset;
        this.referenceTrigger = $.referenceTrigger;
        this.size = $.size;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TumblingWindowTriggerDependencyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TumblingWindowTriggerDependencyReferenceArgs $;

        public Builder() {
            $ = new TumblingWindowTriggerDependencyReferenceArgs();
        }

        public Builder(TumblingWindowTriggerDependencyReferenceArgs defaults) {
            $ = new TumblingWindowTriggerDependencyReferenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param offset Timespan applied to the start time of a tumbling window when evaluating dependency.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Output<String> offset) {
            $.offset = offset;
            return this;
        }

        /**
         * @param offset Timespan applied to the start time of a tumbling window when evaluating dependency.
         * 
         * @return builder
         * 
         */
        public Builder offset(String offset) {
            return offset(Output.of(offset));
        }

        /**
         * @param referenceTrigger Referenced trigger.
         * 
         * @return builder
         * 
         */
        public Builder referenceTrigger(Output<TriggerReferenceArgs> referenceTrigger) {
            $.referenceTrigger = referenceTrigger;
            return this;
        }

        /**
         * @param referenceTrigger Referenced trigger.
         * 
         * @return builder
         * 
         */
        public Builder referenceTrigger(TriggerReferenceArgs referenceTrigger) {
            return referenceTrigger(Output.of(referenceTrigger));
        }

        /**
         * @param size The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<String> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used.
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Output.of(size));
        }

        /**
         * @param type The type of dependency reference.
         * Expected value is &#39;TumblingWindowTriggerDependencyReference&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of dependency reference.
         * Expected value is &#39;TumblingWindowTriggerDependencyReference&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TumblingWindowTriggerDependencyReferenceArgs build() {
            $.referenceTrigger = Objects.requireNonNull($.referenceTrigger, "expected parameter 'referenceTrigger' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
