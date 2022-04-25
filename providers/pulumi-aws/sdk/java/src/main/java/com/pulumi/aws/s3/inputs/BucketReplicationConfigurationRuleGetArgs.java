// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleDestinationGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleFilterGetArgs;
import com.pulumi.aws.s3.inputs.BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketReplicationConfigurationRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationConfigurationRuleGetArgs Empty = new BucketReplicationConfigurationRuleGetArgs();

    /**
     * Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    @Import(name="deleteMarkerReplicationStatus")
    private @Nullable Output<String> deleteMarkerReplicationStatus;

    /**
     * @return Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
     * 
     */
    public Optional<Output<String>> deleteMarkerReplicationStatus() {
        return Optional.ofNullable(this.deleteMarkerReplicationStatus);
    }

    /**
     * Specifies the destination for the rule (documented below).
     * 
     */
    @Import(name="destination", required=true)
    private Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination;

    /**
     * @return Specifies the destination for the rule (documented below).
     * 
     */
    public Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination() {
        return this.destination;
    }

    /**
     * Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    @Import(name="filter")
    private @Nullable Output<BucketReplicationConfigurationRuleFilterGetArgs> filter;

    /**
     * @return Filter that identifies subset of objects to which the replication rule applies (documented below).
     * 
     */
    public Optional<Output<BucketReplicationConfigurationRuleFilterGetArgs>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Specifies special object selection criteria (documented below).
     * 
     */
    @Import(name="sourceSelectionCriteria")
    private @Nullable Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria;

    /**
     * @return Specifies special object selection criteria (documented below).
     * 
     */
    public Optional<Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs>> sourceSelectionCriteria() {
        return Optional.ofNullable(this.sourceSelectionCriteria);
    }

    /**
     * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    private BucketReplicationConfigurationRuleGetArgs() {}

    private BucketReplicationConfigurationRuleGetArgs(BucketReplicationConfigurationRuleGetArgs $) {
        this.deleteMarkerReplicationStatus = $.deleteMarkerReplicationStatus;
        this.destination = $.destination;
        this.filter = $.filter;
        this.id = $.id;
        this.prefix = $.prefix;
        this.priority = $.priority;
        this.sourceSelectionCriteria = $.sourceSelectionCriteria;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationConfigurationRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationConfigurationRuleGetArgs $;

        public Builder() {
            $ = new BucketReplicationConfigurationRuleGetArgs();
        }

        public Builder(BucketReplicationConfigurationRuleGetArgs defaults) {
            $ = new BucketReplicationConfigurationRuleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteMarkerReplicationStatus Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
         * 
         * @return builder
         * 
         */
        public Builder deleteMarkerReplicationStatus(@Nullable Output<String> deleteMarkerReplicationStatus) {
            $.deleteMarkerReplicationStatus = deleteMarkerReplicationStatus;
            return this;
        }

        /**
         * @param deleteMarkerReplicationStatus Whether delete markers are replicated. The only valid value is `Enabled`. To disable, omit this argument. This argument is only valid with V2 replication configurations (i.e., when `filter` is used).
         * 
         * @return builder
         * 
         */
        public Builder deleteMarkerReplicationStatus(String deleteMarkerReplicationStatus) {
            return deleteMarkerReplicationStatus(Output.of(deleteMarkerReplicationStatus));
        }

        /**
         * @param destination Specifies the destination for the rule (documented below).
         * 
         * @return builder
         * 
         */
        public Builder destination(Output<BucketReplicationConfigurationRuleDestinationGetArgs> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Specifies the destination for the rule (documented below).
         * 
         * @return builder
         * 
         */
        public Builder destination(BucketReplicationConfigurationRuleDestinationGetArgs destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param filter Filter that identifies subset of objects to which the replication rule applies (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<BucketReplicationConfigurationRuleFilterGetArgs> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Filter that identifies subset of objects to which the replication rule applies (documented below).
         * 
         * @return builder
         * 
         */
        public Builder filter(BucketReplicationConfigurationRuleFilterGetArgs filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param id Unique identifier for the rule. Must be less than or equal to 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier for the rule. Must be less than or equal to 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param prefix Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param priority The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority associated with the rule. Priority should only be set if `filter` is configured. If not provided, defaults to `0`. Priority must be unique between multiple rules.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param sourceSelectionCriteria Specifies special object selection criteria (documented below).
         * 
         * @return builder
         * 
         */
        public Builder sourceSelectionCriteria(@Nullable Output<BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs> sourceSelectionCriteria) {
            $.sourceSelectionCriteria = sourceSelectionCriteria;
            return this;
        }

        /**
         * @param sourceSelectionCriteria Specifies special object selection criteria (documented below).
         * 
         * @return builder
         * 
         */
        public Builder sourceSelectionCriteria(BucketReplicationConfigurationRuleSourceSelectionCriteriaGetArgs sourceSelectionCriteria) {
            return sourceSelectionCriteria(Output.of(sourceSelectionCriteria));
        }

        /**
         * @param status The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public BucketReplicationConfigurationRuleGetArgs build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
