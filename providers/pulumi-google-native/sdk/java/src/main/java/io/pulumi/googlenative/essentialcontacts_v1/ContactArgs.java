// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.essentialcontacts_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.essentialcontacts_v1.enums.ContactNotificationCategorySubscriptionsItem;
import io.pulumi.googlenative.essentialcontacts_v1.enums.ContactValidationState;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * The email address to send notifications to. This does not need to be a Google account.
     * 
     */
    @Import(name="email", required=true)
      private final Output<String> email;

    public Output<String> getEmail() {
        return this.email;
    }

    /**
     * The preferred language for notifications, as a ISO 639-1 language code. See [Supported languages](https://cloud.google.com/resource-manager/docs/managing-notification-contacts#supported-languages) for a list of supported languages.
     * 
     */
    @Import(name="languageTag")
      private final @Nullable Output<String> languageTag;

    public Output<String> getLanguageTag() {
        return this.languageTag == null ? Codegen.empty() : this.languageTag;
    }

    /**
     * The identifier for the contact. Format: {resource_type}/{resource_id}/contacts/{contact_id}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The categories of notifications that the contact will receive communications for.
     * 
     */
    @Import(name="notificationCategorySubscriptions")
      private final @Nullable Output<List<ContactNotificationCategorySubscriptionsItem>> notificationCategorySubscriptions;

    public Output<List<ContactNotificationCategorySubscriptionsItem>> getNotificationCategorySubscriptions() {
        return this.notificationCategorySubscriptions == null ? Codegen.empty() : this.notificationCategorySubscriptions;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The last time the validation_state was updated, either manually or automatically. A contact is considered stale if its validation state was updated more than 1 year ago.
     * 
     */
    @Import(name="validateTime")
      private final @Nullable Output<String> validateTime;

    public Output<String> getValidateTime() {
        return this.validateTime == null ? Codegen.empty() : this.validateTime;
    }

    /**
     * The validity of the contact. A contact is considered valid if it is the correct recipient for notifications for a particular resource.
     * 
     */
    @Import(name="validationState")
      private final @Nullable Output<ContactValidationState> validationState;

    public Output<ContactValidationState> getValidationState() {
        return this.validationState == null ? Codegen.empty() : this.validationState;
    }

    public ContactArgs(
        Output<String> email,
        @Nullable Output<String> languageTag,
        @Nullable Output<String> name,
        @Nullable Output<List<ContactNotificationCategorySubscriptionsItem>> notificationCategorySubscriptions,
        @Nullable Output<String> project,
        @Nullable Output<String> validateTime,
        @Nullable Output<ContactValidationState> validationState) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.languageTag = languageTag;
        this.name = name;
        this.notificationCategorySubscriptions = notificationCategorySubscriptions;
        this.project = project;
        this.validateTime = validateTime;
        this.validationState = validationState;
    }

    private ContactArgs() {
        this.email = Codegen.empty();
        this.languageTag = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationCategorySubscriptions = Codegen.empty();
        this.project = Codegen.empty();
        this.validateTime = Codegen.empty();
        this.validationState = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> email;
        private @Nullable Output<String> languageTag;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ContactNotificationCategorySubscriptionsItem>> notificationCategorySubscriptions;
        private @Nullable Output<String> project;
        private @Nullable Output<String> validateTime;
        private @Nullable Output<ContactValidationState> validationState;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.languageTag = defaults.languageTag;
    	      this.name = defaults.name;
    	      this.notificationCategorySubscriptions = defaults.notificationCategorySubscriptions;
    	      this.project = defaults.project;
    	      this.validateTime = defaults.validateTime;
    	      this.validationState = defaults.validationState;
        }

        public Builder email(Output<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder email(String email) {
            this.email = Output.of(Objects.requireNonNull(email));
            return this;
        }
        public Builder languageTag(@Nullable Output<String> languageTag) {
            this.languageTag = languageTag;
            return this;
        }
        public Builder languageTag(@Nullable String languageTag) {
            this.languageTag = Codegen.ofNullable(languageTag);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notificationCategorySubscriptions(@Nullable Output<List<ContactNotificationCategorySubscriptionsItem>> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = notificationCategorySubscriptions;
            return this;
        }
        public Builder notificationCategorySubscriptions(@Nullable List<ContactNotificationCategorySubscriptionsItem> notificationCategorySubscriptions) {
            this.notificationCategorySubscriptions = Codegen.ofNullable(notificationCategorySubscriptions);
            return this;
        }
        public Builder notificationCategorySubscriptions(ContactNotificationCategorySubscriptionsItem... notificationCategorySubscriptions) {
            return notificationCategorySubscriptions(List.of(notificationCategorySubscriptions));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder validateTime(@Nullable Output<String> validateTime) {
            this.validateTime = validateTime;
            return this;
        }
        public Builder validateTime(@Nullable String validateTime) {
            this.validateTime = Codegen.ofNullable(validateTime);
            return this;
        }
        public Builder validationState(@Nullable Output<ContactValidationState> validationState) {
            this.validationState = validationState;
            return this;
        }
        public Builder validationState(@Nullable ContactValidationState validationState) {
            this.validationState = Codegen.ofNullable(validationState);
            return this;
        }        public ContactArgs build() {
            return new ContactArgs(email, languageTag, name, notificationCategorySubscriptions, project, validateTime, validationState);
        }
    }
}
