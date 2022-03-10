// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberState extends io.pulumi.resources.ResourceArgs {

    public static final MemberState Empty = new MemberState();

    /**
     * The AWS account ID for the account.
     * 
     */
    @InputImport(name="accountId")
      private final @Nullable Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId == null ? Input.empty() : this.accountId;
    }

    /**
     * The AWS account ID for the administrator account.
     * 
     */
    @InputImport(name="administratorAccountId")
      private final @Nullable Input<String> administratorAccountId;

    public Input<String> getAdministratorAccountId() {
        return this.administratorAccountId == null ? Input.empty() : this.administratorAccountId;
    }

    /**
     * The Amazon Resource Name (ARN) of the account.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The email address for the account.
     * 
     */
    @InputImport(name="email")
      private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
     * 
     */
    @InputImport(name="invitationDisableEmailNotification")
      private final @Nullable Input<String> invitationDisableEmailNotification;

    public Input<String> getInvitationDisableEmailNotification() {
        return this.invitationDisableEmailNotification == null ? Input.empty() : this.invitationDisableEmailNotification;
    }

    /**
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
     * 
     */
    @InputImport(name="invitationMessage")
      private final @Nullable Input<String> invitationMessage;

    public Input<String> getInvitationMessage() {
        return this.invitationMessage == null ? Input.empty() : this.invitationMessage;
    }

    /**
     * Send an invitation to a member
     * 
     */
    @InputImport(name="invite")
      private final @Nullable Input<Boolean> invite;

    public Input<Boolean> getInvite() {
        return this.invite == null ? Input.empty() : this.invite;
    }

    /**
     * The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * 
     */
    @InputImport(name="invitedAt")
      private final @Nullable Input<String> invitedAt;

    public Input<String> getInvitedAt() {
        return this.invitedAt == null ? Input.empty() : this.invitedAt;
    }

    @InputImport(name="masterAccountId")
      private final @Nullable Input<String> masterAccountId;

    public Input<String> getMasterAccountId() {
        return this.masterAccountId == null ? Input.empty() : this.masterAccountId;
    }

    /**
     * The current status of the relationship between the account and the administrator account.
     * 
     */
    @InputImport(name="relationshipStatus")
      private final @Nullable Input<String> relationshipStatus;

    public Input<String> getRelationshipStatus() {
        return this.relationshipStatus == null ? Input.empty() : this.relationshipStatus;
    }

    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
     * 
     */
    @InputImport(name="updatedAt")
      private final @Nullable Input<String> updatedAt;

    public Input<String> getUpdatedAt() {
        return this.updatedAt == null ? Input.empty() : this.updatedAt;
    }

    public MemberState(
        @Nullable Input<String> accountId,
        @Nullable Input<String> administratorAccountId,
        @Nullable Input<String> arn,
        @Nullable Input<String> email,
        @Nullable Input<String> invitationDisableEmailNotification,
        @Nullable Input<String> invitationMessage,
        @Nullable Input<Boolean> invite,
        @Nullable Input<String> invitedAt,
        @Nullable Input<String> masterAccountId,
        @Nullable Input<String> relationshipStatus,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> updatedAt) {
        this.accountId = accountId;
        this.administratorAccountId = administratorAccountId;
        this.arn = arn;
        this.email = email;
        this.invitationDisableEmailNotification = invitationDisableEmailNotification;
        this.invitationMessage = invitationMessage;
        this.invite = invite;
        this.invitedAt = invitedAt;
        this.masterAccountId = masterAccountId;
        this.relationshipStatus = relationshipStatus;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.updatedAt = updatedAt;
    }

    private MemberState() {
        this.accountId = Input.empty();
        this.administratorAccountId = Input.empty();
        this.arn = Input.empty();
        this.email = Input.empty();
        this.invitationDisableEmailNotification = Input.empty();
        this.invitationMessage = Input.empty();
        this.invite = Input.empty();
        this.invitedAt = Input.empty();
        this.masterAccountId = Input.empty();
        this.relationshipStatus = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.updatedAt = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountId;
        private @Nullable Input<String> administratorAccountId;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> email;
        private @Nullable Input<String> invitationDisableEmailNotification;
        private @Nullable Input<String> invitationMessage;
        private @Nullable Input<Boolean> invite;
        private @Nullable Input<String> invitedAt;
        private @Nullable Input<String> masterAccountId;
        private @Nullable Input<String> relationshipStatus;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.administratorAccountId = defaults.administratorAccountId;
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.invitationDisableEmailNotification = defaults.invitationDisableEmailNotification;
    	      this.invitationMessage = defaults.invitationMessage;
    	      this.invite = defaults.invite;
    	      this.invitedAt = defaults.invitedAt;
    	      this.masterAccountId = defaults.masterAccountId;
    	      this.relationshipStatus = defaults.relationshipStatus;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder accountId(@Nullable Input<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = Input.ofNullable(accountId);
            return this;
        }

        public Builder administratorAccountId(@Nullable Input<String> administratorAccountId) {
            this.administratorAccountId = administratorAccountId;
            return this;
        }

        public Builder administratorAccountId(@Nullable String administratorAccountId) {
            this.administratorAccountId = Input.ofNullable(administratorAccountId);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder email(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder email(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder invitationDisableEmailNotification(@Nullable Input<String> invitationDisableEmailNotification) {
            this.invitationDisableEmailNotification = invitationDisableEmailNotification;
            return this;
        }

        public Builder invitationDisableEmailNotification(@Nullable String invitationDisableEmailNotification) {
            this.invitationDisableEmailNotification = Input.ofNullable(invitationDisableEmailNotification);
            return this;
        }

        public Builder invitationMessage(@Nullable Input<String> invitationMessage) {
            this.invitationMessage = invitationMessage;
            return this;
        }

        public Builder invitationMessage(@Nullable String invitationMessage) {
            this.invitationMessage = Input.ofNullable(invitationMessage);
            return this;
        }

        public Builder invite(@Nullable Input<Boolean> invite) {
            this.invite = invite;
            return this;
        }

        public Builder invite(@Nullable Boolean invite) {
            this.invite = Input.ofNullable(invite);
            return this;
        }

        public Builder invitedAt(@Nullable Input<String> invitedAt) {
            this.invitedAt = invitedAt;
            return this;
        }

        public Builder invitedAt(@Nullable String invitedAt) {
            this.invitedAt = Input.ofNullable(invitedAt);
            return this;
        }

        public Builder masterAccountId(@Nullable Input<String> masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }

        public Builder masterAccountId(@Nullable String masterAccountId) {
            this.masterAccountId = Input.ofNullable(masterAccountId);
            return this;
        }

        public Builder relationshipStatus(@Nullable Input<String> relationshipStatus) {
            this.relationshipStatus = relationshipStatus;
            return this;
        }

        public Builder relationshipStatus(@Nullable String relationshipStatus) {
            this.relationshipStatus = Input.ofNullable(relationshipStatus);
            return this;
        }

        public Builder status(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder updatedAt(@Nullable Input<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(@Nullable String updatedAt) {
            this.updatedAt = Input.ofNullable(updatedAt);
            return this;
        }
        public MemberState build() {
            return new MemberState(accountId, administratorAccountId, arn, email, invitationDisableEmailNotification, invitationMessage, invite, invitedAt, masterAccountId, relationshipStatus, status, tags, tagsAll, updatedAt);
        }
    }
}
