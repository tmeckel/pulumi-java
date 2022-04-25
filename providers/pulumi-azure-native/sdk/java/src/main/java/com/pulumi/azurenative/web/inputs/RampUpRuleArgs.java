// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Routing rules for ramp up testing. This rule allows to redirect static traffic % to a slot or to gradually change routing % based on performance.
 * 
 */
public final class RampUpRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RampUpRuleArgs Empty = new RampUpRuleArgs();

    /**
     * Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
     * 
     */
    @Import(name="actionHostName")
    private @Nullable Output<String> actionHostName;

    /**
     * @return Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
     * 
     */
    public Optional<Output<String>> actionHostName() {
        return Optional.ofNullable(this.actionHostName);
    }

    /**
     * Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     * 
     */
    @Import(name="changeDecisionCallbackUrl")
    private @Nullable Output<String> changeDecisionCallbackUrl;

    /**
     * @return Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     * 
     */
    public Optional<Output<String>> changeDecisionCallbackUrl() {
        return Optional.ofNullable(this.changeDecisionCallbackUrl);
    }

    /**
     * Specifies interval in minutes to reevaluate ReroutePercentage.
     * 
     */
    @Import(name="changeIntervalInMinutes")
    private @Nullable Output<Integer> changeIntervalInMinutes;

    /**
     * @return Specifies interval in minutes to reevaluate ReroutePercentage.
     * 
     */
    public Optional<Output<Integer>> changeIntervalInMinutes() {
        return Optional.ofNullable(this.changeIntervalInMinutes);
    }

    /**
     * In auto ramp up scenario this is the step to add/remove from &lt;code&gt;ReroutePercentage&lt;/code&gt; until it reaches \n&lt;code&gt;MinReroutePercentage&lt;/code&gt; or
     * &lt;code&gt;MaxReroutePercentage&lt;/code&gt;. Site metrics are checked every N minutes specified in &lt;code&gt;ChangeIntervalInMinutes&lt;/code&gt;.\nCustom decision algorithm
     * can be provided in TiPCallback site extension which URL can be specified in &lt;code&gt;ChangeDecisionCallbackUrl&lt;/code&gt;.
     * 
     */
    @Import(name="changeStep")
    private @Nullable Output<Double> changeStep;

    /**
     * @return In auto ramp up scenario this is the step to add/remove from &lt;code&gt;ReroutePercentage&lt;/code&gt; until it reaches \n&lt;code&gt;MinReroutePercentage&lt;/code&gt; or
     * &lt;code&gt;MaxReroutePercentage&lt;/code&gt;. Site metrics are checked every N minutes specified in &lt;code&gt;ChangeIntervalInMinutes&lt;/code&gt;.\nCustom decision algorithm
     * can be provided in TiPCallback site extension which URL can be specified in &lt;code&gt;ChangeDecisionCallbackUrl&lt;/code&gt;.
     * 
     */
    public Optional<Output<Double>> changeStep() {
        return Optional.ofNullable(this.changeStep);
    }

    /**
     * Specifies upper boundary below which ReroutePercentage will stay.
     * 
     */
    @Import(name="maxReroutePercentage")
    private @Nullable Output<Double> maxReroutePercentage;

    /**
     * @return Specifies upper boundary below which ReroutePercentage will stay.
     * 
     */
    public Optional<Output<Double>> maxReroutePercentage() {
        return Optional.ofNullable(this.maxReroutePercentage);
    }

    /**
     * Specifies lower boundary above which ReroutePercentage will stay.
     * 
     */
    @Import(name="minReroutePercentage")
    private @Nullable Output<Double> minReroutePercentage;

    /**
     * @return Specifies lower boundary above which ReroutePercentage will stay.
     * 
     */
    public Optional<Output<Double>> minReroutePercentage() {
        return Optional.ofNullable(this.minReroutePercentage);
    }

    /**
     * Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Percentage of the traffic which will be redirected to &lt;code&gt;ActionHostName&lt;/code&gt;.
     * 
     */
    @Import(name="reroutePercentage")
    private @Nullable Output<Double> reroutePercentage;

    /**
     * @return Percentage of the traffic which will be redirected to &lt;code&gt;ActionHostName&lt;/code&gt;.
     * 
     */
    public Optional<Output<Double>> reroutePercentage() {
        return Optional.ofNullable(this.reroutePercentage);
    }

    private RampUpRuleArgs() {}

    private RampUpRuleArgs(RampUpRuleArgs $) {
        this.actionHostName = $.actionHostName;
        this.changeDecisionCallbackUrl = $.changeDecisionCallbackUrl;
        this.changeIntervalInMinutes = $.changeIntervalInMinutes;
        this.changeStep = $.changeStep;
        this.maxReroutePercentage = $.maxReroutePercentage;
        this.minReroutePercentage = $.minReroutePercentage;
        this.name = $.name;
        this.reroutePercentage = $.reroutePercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RampUpRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RampUpRuleArgs $;

        public Builder() {
            $ = new RampUpRuleArgs();
        }

        public Builder(RampUpRuleArgs defaults) {
            $ = new RampUpRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionHostName Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
         * 
         * @return builder
         * 
         */
        public Builder actionHostName(@Nullable Output<String> actionHostName) {
            $.actionHostName = actionHostName;
            return this;
        }

        /**
         * @param actionHostName Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
         * 
         * @return builder
         * 
         */
        public Builder actionHostName(String actionHostName) {
            return actionHostName(Output.of(actionHostName));
        }

        /**
         * @param changeDecisionCallbackUrl Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
         * https://www.siteextensions.net/packages/TiPCallback/
         * 
         * @return builder
         * 
         */
        public Builder changeDecisionCallbackUrl(@Nullable Output<String> changeDecisionCallbackUrl) {
            $.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
            return this;
        }

        /**
         * @param changeDecisionCallbackUrl Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
         * https://www.siteextensions.net/packages/TiPCallback/
         * 
         * @return builder
         * 
         */
        public Builder changeDecisionCallbackUrl(String changeDecisionCallbackUrl) {
            return changeDecisionCallbackUrl(Output.of(changeDecisionCallbackUrl));
        }

        /**
         * @param changeIntervalInMinutes Specifies interval in minutes to reevaluate ReroutePercentage.
         * 
         * @return builder
         * 
         */
        public Builder changeIntervalInMinutes(@Nullable Output<Integer> changeIntervalInMinutes) {
            $.changeIntervalInMinutes = changeIntervalInMinutes;
            return this;
        }

        /**
         * @param changeIntervalInMinutes Specifies interval in minutes to reevaluate ReroutePercentage.
         * 
         * @return builder
         * 
         */
        public Builder changeIntervalInMinutes(Integer changeIntervalInMinutes) {
            return changeIntervalInMinutes(Output.of(changeIntervalInMinutes));
        }

        /**
         * @param changeStep In auto ramp up scenario this is the step to add/remove from &lt;code&gt;ReroutePercentage&lt;/code&gt; until it reaches \n&lt;code&gt;MinReroutePercentage&lt;/code&gt; or
         * &lt;code&gt;MaxReroutePercentage&lt;/code&gt;. Site metrics are checked every N minutes specified in &lt;code&gt;ChangeIntervalInMinutes&lt;/code&gt;.\nCustom decision algorithm
         * can be provided in TiPCallback site extension which URL can be specified in &lt;code&gt;ChangeDecisionCallbackUrl&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder changeStep(@Nullable Output<Double> changeStep) {
            $.changeStep = changeStep;
            return this;
        }

        /**
         * @param changeStep In auto ramp up scenario this is the step to add/remove from &lt;code&gt;ReroutePercentage&lt;/code&gt; until it reaches \n&lt;code&gt;MinReroutePercentage&lt;/code&gt; or
         * &lt;code&gt;MaxReroutePercentage&lt;/code&gt;. Site metrics are checked every N minutes specified in &lt;code&gt;ChangeIntervalInMinutes&lt;/code&gt;.\nCustom decision algorithm
         * can be provided in TiPCallback site extension which URL can be specified in &lt;code&gt;ChangeDecisionCallbackUrl&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder changeStep(Double changeStep) {
            return changeStep(Output.of(changeStep));
        }

        /**
         * @param maxReroutePercentage Specifies upper boundary below which ReroutePercentage will stay.
         * 
         * @return builder
         * 
         */
        public Builder maxReroutePercentage(@Nullable Output<Double> maxReroutePercentage) {
            $.maxReroutePercentage = maxReroutePercentage;
            return this;
        }

        /**
         * @param maxReroutePercentage Specifies upper boundary below which ReroutePercentage will stay.
         * 
         * @return builder
         * 
         */
        public Builder maxReroutePercentage(Double maxReroutePercentage) {
            return maxReroutePercentage(Output.of(maxReroutePercentage));
        }

        /**
         * @param minReroutePercentage Specifies lower boundary above which ReroutePercentage will stay.
         * 
         * @return builder
         * 
         */
        public Builder minReroutePercentage(@Nullable Output<Double> minReroutePercentage) {
            $.minReroutePercentage = minReroutePercentage;
            return this;
        }

        /**
         * @param minReroutePercentage Specifies lower boundary above which ReroutePercentage will stay.
         * 
         * @return builder
         * 
         */
        public Builder minReroutePercentage(Double minReroutePercentage) {
            return minReroutePercentage(Output.of(minReroutePercentage));
        }

        /**
         * @param name Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param reroutePercentage Percentage of the traffic which will be redirected to &lt;code&gt;ActionHostName&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder reroutePercentage(@Nullable Output<Double> reroutePercentage) {
            $.reroutePercentage = reroutePercentage;
            return this;
        }

        /**
         * @param reroutePercentage Percentage of the traffic which will be redirected to &lt;code&gt;ActionHostName&lt;/code&gt;.
         * 
         * @return builder
         * 
         */
        public Builder reroutePercentage(Double reroutePercentage) {
            return reroutePercentage(Output.of(reroutePercentage));
        }

        public RampUpRuleArgs build() {
            return $;
        }
    }

}
