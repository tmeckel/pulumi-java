// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.detective.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MemberState extends com.pulumi.resources.ResourceArgs {

    public static final MemberState Empty = new MemberState();

    /**
     * AWS account ID for the account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return AWS account ID for the account.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * AWS account ID for the administrator account.
     * 
     */
    @Import(name="administratorId")
    private @Nullable Output<String> administratorId;

    /**
     * @return AWS account ID for the administrator account.
     * 
     */
    public Optional<Output<String>> administratorId() {
        return Optional.ofNullable(this.administratorId);
    }

    /**
     * If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
     * 
     */
    @Import(name="disableEmailNotification")
    private @Nullable Output<Boolean> disableEmailNotification;

    /**
     * @return If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
     * 
     */
    public Optional<Output<Boolean>> disableEmailNotification() {
        return Optional.ofNullable(this.disableEmailNotification);
    }

    @Import(name="disabledReason")
    private @Nullable Output<String> disabledReason;

    public Optional<Output<String>> disabledReason() {
        return Optional.ofNullable(this.disabledReason);
    }

    /**
     * Email address for the account.
     * 
     */
    @Import(name="emailAddress")
    private @Nullable Output<String> emailAddress;

    /**
     * @return Email address for the account.
     * 
     */
    public Optional<Output<String>> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    /**
     * ARN of the behavior graph to invite the member accounts to contribute their data to.
     * 
     */
    @Import(name="graphArn")
    private @Nullable Output<String> graphArn;

    /**
     * @return ARN of the behavior graph to invite the member accounts to contribute their data to.
     * 
     */
    public Optional<Output<String>> graphArn() {
        return Optional.ofNullable(this.graphArn);
    }

    /**
     * Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
     * 
     */
    @Import(name="invitedTime")
    private @Nullable Output<String> invitedTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
     * 
     */
    public Optional<Output<String>> invitedTime() {
        return Optional.ofNullable(this.invitedTime);
    }

    /**
     * A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    /**
     * Current membership status of the member account.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Current membership status of the member account.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account&#39;s status.
     * 
     */
    @Import(name="updatedTime")
    private @Nullable Output<String> updatedTime;

    /**
     * @return Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account&#39;s status.
     * 
     */
    public Optional<Output<String>> updatedTime() {
        return Optional.ofNullable(this.updatedTime);
    }

    /**
     * Data volume in bytes per day for the member account.
     * 
     */
    @Import(name="volumeUsageInBytes")
    private @Nullable Output<String> volumeUsageInBytes;

    /**
     * @return Data volume in bytes per day for the member account.
     * 
     */
    public Optional<Output<String>> volumeUsageInBytes() {
        return Optional.ofNullable(this.volumeUsageInBytes);
    }

    private MemberState() {}

    private MemberState(MemberState $) {
        this.accountId = $.accountId;
        this.administratorId = $.administratorId;
        this.disableEmailNotification = $.disableEmailNotification;
        this.disabledReason = $.disabledReason;
        this.emailAddress = $.emailAddress;
        this.graphArn = $.graphArn;
        this.invitedTime = $.invitedTime;
        this.message = $.message;
        this.status = $.status;
        this.updatedTime = $.updatedTime;
        this.volumeUsageInBytes = $.volumeUsageInBytes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MemberState $;

        public Builder() {
            $ = new MemberState();
        }

        public Builder(MemberState defaults) {
            $ = new MemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId AWS account ID for the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId AWS account ID for the account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param administratorId AWS account ID for the administrator account.
         * 
         * @return builder
         * 
         */
        public Builder administratorId(@Nullable Output<String> administratorId) {
            $.administratorId = administratorId;
            return this;
        }

        /**
         * @param administratorId AWS account ID for the administrator account.
         * 
         * @return builder
         * 
         */
        public Builder administratorId(String administratorId) {
            return administratorId(Output.of(administratorId));
        }

        /**
         * @param disableEmailNotification If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableEmailNotification(@Nullable Output<Boolean> disableEmailNotification) {
            $.disableEmailNotification = disableEmailNotification;
            return this;
        }

        /**
         * @param disableEmailNotification If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableEmailNotification(Boolean disableEmailNotification) {
            return disableEmailNotification(Output.of(disableEmailNotification));
        }

        public Builder disabledReason(@Nullable Output<String> disabledReason) {
            $.disabledReason = disabledReason;
            return this;
        }

        public Builder disabledReason(String disabledReason) {
            return disabledReason(Output.of(disabledReason));
        }

        /**
         * @param emailAddress Email address for the account.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(@Nullable Output<String> emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        /**
         * @param emailAddress Email address for the account.
         * 
         * @return builder
         * 
         */
        public Builder emailAddress(String emailAddress) {
            return emailAddress(Output.of(emailAddress));
        }

        /**
         * @param graphArn ARN of the behavior graph to invite the member accounts to contribute their data to.
         * 
         * @return builder
         * 
         */
        public Builder graphArn(@Nullable Output<String> graphArn) {
            $.graphArn = graphArn;
            return this;
        }

        /**
         * @param graphArn ARN of the behavior graph to invite the member accounts to contribute their data to.
         * 
         * @return builder
         * 
         */
        public Builder graphArn(String graphArn) {
            return graphArn(Output.of(graphArn));
        }

        /**
         * @param invitedTime Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
         * 
         * @return builder
         * 
         */
        public Builder invitedTime(@Nullable Output<String> invitedTime) {
            $.invitedTime = invitedTime;
            return this;
        }

        /**
         * @param invitedTime Date and time, in UTC and extended RFC 3339 format, when an Amazon Detective membership invitation was last sent to the account.
         * 
         * @return builder
         * 
         */
        public Builder invitedTime(String invitedTime) {
            return invitedTime(Output.of(invitedTime));
        }

        /**
         * @param message A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param status Current membership status of the member account.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current membership status of the member account.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param updatedTime Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account&#39;s status.
         * 
         * @return builder
         * 
         */
        public Builder updatedTime(@Nullable Output<String> updatedTime) {
            $.updatedTime = updatedTime;
            return this;
        }

        /**
         * @param updatedTime Date and time, in UTC and extended RFC 3339 format, of the most recent change to the member account&#39;s status.
         * 
         * @return builder
         * 
         */
        public Builder updatedTime(String updatedTime) {
            return updatedTime(Output.of(updatedTime));
        }

        /**
         * @param volumeUsageInBytes Data volume in bytes per day for the member account.
         * 
         * @return builder
         * 
         */
        public Builder volumeUsageInBytes(@Nullable Output<String> volumeUsageInBytes) {
            $.volumeUsageInBytes = volumeUsageInBytes;
            return this;
        }

        /**
         * @param volumeUsageInBytes Data volume in bytes per day for the member account.
         * 
         * @return builder
         * 
         */
        public Builder volumeUsageInBytes(String volumeUsageInBytes) {
            return volumeUsageInBytes(Output.of(volumeUsageInBytes));
        }

        public MemberState build() {
            return $;
        }
    }

}
