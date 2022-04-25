// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs Empty = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs();

    /**
     * Number of characters after the finding to consider. Either this or window_before must be specified
     * 
     */
    @Import(name="windowAfter")
    private @Nullable Output<Integer> windowAfter;

    /**
     * @return Number of characters after the finding to consider. Either this or window_before must be specified
     * 
     */
    public Optional<Output<Integer>> windowAfter() {
        return Optional.ofNullable(this.windowAfter);
    }

    /**
     * Number of characters before the finding to consider. Either this or window_after must be specified
     * 
     */
    @Import(name="windowBefore")
    private @Nullable Output<Integer> windowBefore;

    /**
     * @return Number of characters before the finding to consider. Either this or window_after must be specified
     * 
     */
    public Optional<Output<Integer>> windowBefore() {
        return Optional.ofNullable(this.windowBefore);
    }

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs() {}

    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs $) {
        this.windowAfter = $.windowAfter;
        this.windowBefore = $.windowBefore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs $;

        public Builder() {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs();
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs defaults) {
            $ = new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param windowAfter Number of characters after the finding to consider. Either this or window_before must be specified
         * 
         * @return builder
         * 
         */
        public Builder windowAfter(@Nullable Output<Integer> windowAfter) {
            $.windowAfter = windowAfter;
            return this;
        }

        /**
         * @param windowAfter Number of characters after the finding to consider. Either this or window_before must be specified
         * 
         * @return builder
         * 
         */
        public Builder windowAfter(Integer windowAfter) {
            return windowAfter(Output.of(windowAfter));
        }

        /**
         * @param windowBefore Number of characters before the finding to consider. Either this or window_after must be specified
         * 
         * @return builder
         * 
         */
        public Builder windowBefore(@Nullable Output<Integer> windowBefore) {
            $.windowBefore = windowBefore;
            return this;
        }

        /**
         * @param windowBefore Number of characters before the finding to consider. Either this or window_after must be specified
         * 
         * @return builder
         * 
         */
        public Builder windowBefore(Integer windowBefore) {
            return windowBefore(Output.of(windowBefore));
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityGetArgs build() {
            return $;
        }
    }

}
