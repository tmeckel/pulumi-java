// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the hand off to a live agent, typically on which external agent service provider to connect to a conversation. Currently, this feature is not general available, please contact Google to get access.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs();

    /**
     * Uses LivePerson (https://www.liveperson.com).
     * 
     */
    @Import(name="livePersonConfig")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig;

    /**
     * @return Uses LivePerson (https://www.liveperson.com).
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs>> livePersonConfig() {
        return Optional.ofNullable(this.livePersonConfig);
    }

    /**
     * Uses Salesforce Live Agent.
     * 
     */
    @Import(name="salesforceLiveAgentConfig")
    private @Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig;

    /**
     * @return Uses Salesforce Live Agent.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs>> salesforceLiveAgentConfig() {
        return Optional.ofNullable(this.salesforceLiveAgentConfig);
    }

    private GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs() {}

    private GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs(GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs $) {
        this.livePersonConfig = $.livePersonConfig;
        this.salesforceLiveAgentConfig = $.salesforceLiveAgentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param livePersonConfig Uses LivePerson (https://www.liveperson.com).
         * 
         * @return builder
         * 
         */
        public Builder livePersonConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs> livePersonConfig) {
            $.livePersonConfig = livePersonConfig;
            return this;
        }

        /**
         * @param livePersonConfig Uses LivePerson (https://www.liveperson.com).
         * 
         * @return builder
         * 
         */
        public Builder livePersonConfig(GoogleCloudDialogflowV2HumanAgentHandoffConfigLivePersonConfigArgs livePersonConfig) {
            return livePersonConfig(Output.of(livePersonConfig));
        }

        /**
         * @param salesforceLiveAgentConfig Uses Salesforce Live Agent.
         * 
         * @return builder
         * 
         */
        public Builder salesforceLiveAgentConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs> salesforceLiveAgentConfig) {
            $.salesforceLiveAgentConfig = salesforceLiveAgentConfig;
            return this;
        }

        /**
         * @param salesforceLiveAgentConfig Uses Salesforce Live Agent.
         * 
         * @return builder
         * 
         */
        public Builder salesforceLiveAgentConfig(GoogleCloudDialogflowV2HumanAgentHandoffConfigSalesforceLiveAgentConfigArgs salesforceLiveAgentConfig) {
            return salesforceLiveAgentConfig(Output.of(salesforceLiveAgentConfig));
        }

        public GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs build() {
            return $;
        }
    }

}
