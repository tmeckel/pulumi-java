// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.azurenative.security.inputs.AllowlistCustomAlertRuleArgs;
import com.pulumi.azurenative.security.inputs.DenylistCustomAlertRuleArgs;
import com.pulumi.azurenative.security.inputs.ThresholdCustomAlertRuleArgs;
import com.pulumi.azurenative.security.inputs.TimeWindowCustomAlertRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceSecurityGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceSecurityGroupArgs Empty = new DeviceSecurityGroupArgs();

    /**
     * The allow-list custom alert rules.
     * 
     */
    @Import(name="allowlistRules")
    private @Nullable Output<List<AllowlistCustomAlertRuleArgs>> allowlistRules;

    /**
     * @return The allow-list custom alert rules.
     * 
     */
    public Optional<Output<List<AllowlistCustomAlertRuleArgs>>> allowlistRules() {
        return Optional.ofNullable(this.allowlistRules);
    }

    /**
     * The deny-list custom alert rules.
     * 
     */
    @Import(name="denylistRules")
    private @Nullable Output<List<DenylistCustomAlertRuleArgs>> denylistRules;

    /**
     * @return The deny-list custom alert rules.
     * 
     */
    public Optional<Output<List<DenylistCustomAlertRuleArgs>>> denylistRules() {
        return Optional.ofNullable(this.denylistRules);
    }

    /**
     * The name of the device security group. Note that the name of the device security group is case insensitive.
     * 
     */
    @Import(name="deviceSecurityGroupName")
    private @Nullable Output<String> deviceSecurityGroupName;

    /**
     * @return The name of the device security group. Note that the name of the device security group is case insensitive.
     * 
     */
    public Optional<Output<String>> deviceSecurityGroupName() {
        return Optional.ofNullable(this.deviceSecurityGroupName);
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The identifier of the resource.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The list of custom alert threshold rules.
     * 
     */
    @Import(name="thresholdRules")
    private @Nullable Output<List<ThresholdCustomAlertRuleArgs>> thresholdRules;

    /**
     * @return The list of custom alert threshold rules.
     * 
     */
    public Optional<Output<List<ThresholdCustomAlertRuleArgs>>> thresholdRules() {
        return Optional.ofNullable(this.thresholdRules);
    }

    /**
     * The list of custom alert time-window rules.
     * 
     */
    @Import(name="timeWindowRules")
    private @Nullable Output<List<TimeWindowCustomAlertRuleArgs>> timeWindowRules;

    /**
     * @return The list of custom alert time-window rules.
     * 
     */
    public Optional<Output<List<TimeWindowCustomAlertRuleArgs>>> timeWindowRules() {
        return Optional.ofNullable(this.timeWindowRules);
    }

    private DeviceSecurityGroupArgs() {}

    private DeviceSecurityGroupArgs(DeviceSecurityGroupArgs $) {
        this.allowlistRules = $.allowlistRules;
        this.denylistRules = $.denylistRules;
        this.deviceSecurityGroupName = $.deviceSecurityGroupName;
        this.resourceId = $.resourceId;
        this.thresholdRules = $.thresholdRules;
        this.timeWindowRules = $.timeWindowRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceSecurityGroupArgs $;

        public Builder() {
            $ = new DeviceSecurityGroupArgs();
        }

        public Builder(DeviceSecurityGroupArgs defaults) {
            $ = new DeviceSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowlistRules The allow-list custom alert rules.
         * 
         * @return builder
         * 
         */
        public Builder allowlistRules(@Nullable Output<List<AllowlistCustomAlertRuleArgs>> allowlistRules) {
            $.allowlistRules = allowlistRules;
            return this;
        }

        /**
         * @param allowlistRules The allow-list custom alert rules.
         * 
         * @return builder
         * 
         */
        public Builder allowlistRules(List<AllowlistCustomAlertRuleArgs> allowlistRules) {
            return allowlistRules(Output.of(allowlistRules));
        }

        /**
         * @param allowlistRules The allow-list custom alert rules.
         * 
         * @return builder
         * 
         */
        public Builder allowlistRules(AllowlistCustomAlertRuleArgs... allowlistRules) {
            return allowlistRules(List.of(allowlistRules));
        }

        /**
         * @param denylistRules The deny-list custom alert rules.
         * 
         * @return builder
         * 
         */
        public Builder denylistRules(@Nullable Output<List<DenylistCustomAlertRuleArgs>> denylistRules) {
            $.denylistRules = denylistRules;
            return this;
        }

        /**
         * @param denylistRules The deny-list custom alert rules.
         * 
         * @return builder
         * 
         */
        public Builder denylistRules(List<DenylistCustomAlertRuleArgs> denylistRules) {
            return denylistRules(Output.of(denylistRules));
        }

        /**
         * @param denylistRules The deny-list custom alert rules.
         * 
         * @return builder
         * 
         */
        public Builder denylistRules(DenylistCustomAlertRuleArgs... denylistRules) {
            return denylistRules(List.of(denylistRules));
        }

        /**
         * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security group is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder deviceSecurityGroupName(@Nullable Output<String> deviceSecurityGroupName) {
            $.deviceSecurityGroupName = deviceSecurityGroupName;
            return this;
        }

        /**
         * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security group is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder deviceSecurityGroupName(String deviceSecurityGroupName) {
            return deviceSecurityGroupName(Output.of(deviceSecurityGroupName));
        }

        /**
         * @param resourceId The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param thresholdRules The list of custom alert threshold rules.
         * 
         * @return builder
         * 
         */
        public Builder thresholdRules(@Nullable Output<List<ThresholdCustomAlertRuleArgs>> thresholdRules) {
            $.thresholdRules = thresholdRules;
            return this;
        }

        /**
         * @param thresholdRules The list of custom alert threshold rules.
         * 
         * @return builder
         * 
         */
        public Builder thresholdRules(List<ThresholdCustomAlertRuleArgs> thresholdRules) {
            return thresholdRules(Output.of(thresholdRules));
        }

        /**
         * @param thresholdRules The list of custom alert threshold rules.
         * 
         * @return builder
         * 
         */
        public Builder thresholdRules(ThresholdCustomAlertRuleArgs... thresholdRules) {
            return thresholdRules(List.of(thresholdRules));
        }

        /**
         * @param timeWindowRules The list of custom alert time-window rules.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowRules(@Nullable Output<List<TimeWindowCustomAlertRuleArgs>> timeWindowRules) {
            $.timeWindowRules = timeWindowRules;
            return this;
        }

        /**
         * @param timeWindowRules The list of custom alert time-window rules.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowRules(List<TimeWindowCustomAlertRuleArgs> timeWindowRules) {
            return timeWindowRules(Output.of(timeWindowRules));
        }

        /**
         * @param timeWindowRules The list of custom alert time-window rules.
         * 
         * @return builder
         * 
         */
        public Builder timeWindowRules(TimeWindowCustomAlertRuleArgs... timeWindowRules) {
            return timeWindowRules(List.of(timeWindowRules));
        }

        public DeviceSecurityGroupArgs build() {
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
