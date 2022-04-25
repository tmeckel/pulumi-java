// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BotAliasCloudWatchLogGroupLogDestination extends com.pulumi.resources.InvokeArgs {

    public static final BotAliasCloudWatchLogGroupLogDestination Empty = new BotAliasCloudWatchLogGroupLogDestination();

    /**
     * A string used to identify this tag
     * 
     */
    @Import(name="cloudWatchLogGroupArn", required=true)
    private String cloudWatchLogGroupArn;

    /**
     * @return A string used to identify this tag
     * 
     */
    public String cloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * A string containing the value for the tag
     * 
     */
    @Import(name="logPrefix", required=true)
    private String logPrefix;

    /**
     * @return A string containing the value for the tag
     * 
     */
    public String logPrefix() {
        return this.logPrefix;
    }

    private BotAliasCloudWatchLogGroupLogDestination() {}

    private BotAliasCloudWatchLogGroupLogDestination(BotAliasCloudWatchLogGroupLogDestination $) {
        this.cloudWatchLogGroupArn = $.cloudWatchLogGroupArn;
        this.logPrefix = $.logPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotAliasCloudWatchLogGroupLogDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotAliasCloudWatchLogGroupLogDestination $;

        public Builder() {
            $ = new BotAliasCloudWatchLogGroupLogDestination();
        }

        public Builder(BotAliasCloudWatchLogGroupLogDestination defaults) {
            $ = new BotAliasCloudWatchLogGroupLogDestination(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudWatchLogGroupArn A string used to identify this tag
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
            $.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        /**
         * @param logPrefix A string containing the value for the tag
         * 
         * @return builder
         * 
         */
        public Builder logPrefix(String logPrefix) {
            $.logPrefix = logPrefix;
            return this;
        }

        public BotAliasCloudWatchLogGroupLogDestination build() {
            $.cloudWatchLogGroupArn = Objects.requireNonNull($.cloudWatchLogGroupArn, "expected parameter 'cloudWatchLogGroupArn' to be non-null");
            $.logPrefix = Objects.requireNonNull($.logPrefix, "expected parameter 'logPrefix' to be non-null");
            return $;
        }
    }

}
