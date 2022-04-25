// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.BaseImageTriggerArgs;
import com.pulumi.azurenative.containerregistry.inputs.SourceTriggerArgs;
import com.pulumi.azurenative.containerregistry.inputs.TimerTriggerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a trigger.
 * 
 */
public final class TriggerPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerPropertiesArgs Empty = new TriggerPropertiesArgs();

    /**
     * The trigger based on base image dependencies.
     * 
     */
    @Import(name="baseImageTrigger")
    private @Nullable Output<BaseImageTriggerArgs> baseImageTrigger;

    /**
     * @return The trigger based on base image dependencies.
     * 
     */
    public Optional<Output<BaseImageTriggerArgs>> baseImageTrigger() {
        return Optional.ofNullable(this.baseImageTrigger);
    }

    /**
     * The collection of triggers based on source code repository.
     * 
     */
    @Import(name="sourceTriggers")
    private @Nullable Output<List<SourceTriggerArgs>> sourceTriggers;

    /**
     * @return The collection of triggers based on source code repository.
     * 
     */
    public Optional<Output<List<SourceTriggerArgs>>> sourceTriggers() {
        return Optional.ofNullable(this.sourceTriggers);
    }

    /**
     * The collection of timer triggers.
     * 
     */
    @Import(name="timerTriggers")
    private @Nullable Output<List<TimerTriggerArgs>> timerTriggers;

    /**
     * @return The collection of timer triggers.
     * 
     */
    public Optional<Output<List<TimerTriggerArgs>>> timerTriggers() {
        return Optional.ofNullable(this.timerTriggers);
    }

    private TriggerPropertiesArgs() {}

    private TriggerPropertiesArgs(TriggerPropertiesArgs $) {
        this.baseImageTrigger = $.baseImageTrigger;
        this.sourceTriggers = $.sourceTriggers;
        this.timerTriggers = $.timerTriggers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TriggerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TriggerPropertiesArgs $;

        public Builder() {
            $ = new TriggerPropertiesArgs();
        }

        public Builder(TriggerPropertiesArgs defaults) {
            $ = new TriggerPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseImageTrigger The trigger based on base image dependencies.
         * 
         * @return builder
         * 
         */
        public Builder baseImageTrigger(@Nullable Output<BaseImageTriggerArgs> baseImageTrigger) {
            $.baseImageTrigger = baseImageTrigger;
            return this;
        }

        /**
         * @param baseImageTrigger The trigger based on base image dependencies.
         * 
         * @return builder
         * 
         */
        public Builder baseImageTrigger(BaseImageTriggerArgs baseImageTrigger) {
            return baseImageTrigger(Output.of(baseImageTrigger));
        }

        /**
         * @param sourceTriggers The collection of triggers based on source code repository.
         * 
         * @return builder
         * 
         */
        public Builder sourceTriggers(@Nullable Output<List<SourceTriggerArgs>> sourceTriggers) {
            $.sourceTriggers = sourceTriggers;
            return this;
        }

        /**
         * @param sourceTriggers The collection of triggers based on source code repository.
         * 
         * @return builder
         * 
         */
        public Builder sourceTriggers(List<SourceTriggerArgs> sourceTriggers) {
            return sourceTriggers(Output.of(sourceTriggers));
        }

        /**
         * @param sourceTriggers The collection of triggers based on source code repository.
         * 
         * @return builder
         * 
         */
        public Builder sourceTriggers(SourceTriggerArgs... sourceTriggers) {
            return sourceTriggers(List.of(sourceTriggers));
        }

        /**
         * @param timerTriggers The collection of timer triggers.
         * 
         * @return builder
         * 
         */
        public Builder timerTriggers(@Nullable Output<List<TimerTriggerArgs>> timerTriggers) {
            $.timerTriggers = timerTriggers;
            return this;
        }

        /**
         * @param timerTriggers The collection of timer triggers.
         * 
         * @return builder
         * 
         */
        public Builder timerTriggers(List<TimerTriggerArgs> timerTriggers) {
            return timerTriggers(Output.of(timerTriggers));
        }

        /**
         * @param timerTriggers The collection of timer triggers.
         * 
         * @return builder
         * 
         */
        public Builder timerTriggers(TimerTriggerArgs... timerTriggers) {
            return timerTriggers(List.of(timerTriggers));
        }

        public TriggerPropertiesArgs build() {
            return $;
        }
    }

}
