// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts;

import io.pulumi.awsnative.ssmcontacts.enums.ContactChannelChannelType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactChannelArgs Empty = new ContactChannelArgs();

    /**
     * The details that SSM Incident Manager uses when trying to engage the contact channel.
     * 
     */
    @Import(name="channelAddress")
      private final @Nullable Output<String> channelAddress;

    public Output<String> getChannelAddress() {
        return this.channelAddress == null ? Codegen.empty() : this.channelAddress;
    }

    /**
     * The device name. String of 6 to 50 alphabetical, numeric, dash, and underscore characters.
     * 
     */
    @Import(name="channelName")
      private final @Nullable Output<String> channelName;

    public Output<String> getChannelName() {
        return this.channelName == null ? Codegen.empty() : this.channelName;
    }

    /**
     * Device type, which specify notification channel. Currently supported values: “SMS”, “VOICE”, “EMAIL”, “CHATBOT.
     * 
     */
    @Import(name="channelType")
      private final @Nullable Output<ContactChannelChannelType> channelType;

    public Output<ContactChannelChannelType> getChannelType() {
        return this.channelType == null ? Codegen.empty() : this.channelType;
    }

    /**
     * ARN of the contact resource
     * 
     */
    @Import(name="contactId")
      private final @Nullable Output<String> contactId;

    public Output<String> getContactId() {
        return this.contactId == null ? Codegen.empty() : this.contactId;
    }

    /**
     * If you want to activate the channel at a later time, you can choose to defer activation. SSM Incident Manager can't engage your contact channel until it has been activated.
     * 
     */
    @Import(name="deferActivation")
      private final @Nullable Output<Boolean> deferActivation;

    public Output<Boolean> getDeferActivation() {
        return this.deferActivation == null ? Codegen.empty() : this.deferActivation;
    }

    public ContactChannelArgs(
        @Nullable Output<String> channelAddress,
        @Nullable Output<String> channelName,
        @Nullable Output<ContactChannelChannelType> channelType,
        @Nullable Output<String> contactId,
        @Nullable Output<Boolean> deferActivation) {
        this.channelAddress = channelAddress;
        this.channelName = channelName;
        this.channelType = channelType;
        this.contactId = contactId;
        this.deferActivation = deferActivation;
    }

    private ContactChannelArgs() {
        this.channelAddress = Codegen.empty();
        this.channelName = Codegen.empty();
        this.channelType = Codegen.empty();
        this.contactId = Codegen.empty();
        this.deferActivation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> channelAddress;
        private @Nullable Output<String> channelName;
        private @Nullable Output<ContactChannelChannelType> channelType;
        private @Nullable Output<String> contactId;
        private @Nullable Output<Boolean> deferActivation;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelAddress = defaults.channelAddress;
    	      this.channelName = defaults.channelName;
    	      this.channelType = defaults.channelType;
    	      this.contactId = defaults.contactId;
    	      this.deferActivation = defaults.deferActivation;
        }

        public Builder channelAddress(@Nullable Output<String> channelAddress) {
            this.channelAddress = channelAddress;
            return this;
        }
        public Builder channelAddress(@Nullable String channelAddress) {
            this.channelAddress = Codegen.ofNullable(channelAddress);
            return this;
        }
        public Builder channelName(@Nullable Output<String> channelName) {
            this.channelName = channelName;
            return this;
        }
        public Builder channelName(@Nullable String channelName) {
            this.channelName = Codegen.ofNullable(channelName);
            return this;
        }
        public Builder channelType(@Nullable Output<ContactChannelChannelType> channelType) {
            this.channelType = channelType;
            return this;
        }
        public Builder channelType(@Nullable ContactChannelChannelType channelType) {
            this.channelType = Codegen.ofNullable(channelType);
            return this;
        }
        public Builder contactId(@Nullable Output<String> contactId) {
            this.contactId = contactId;
            return this;
        }
        public Builder contactId(@Nullable String contactId) {
            this.contactId = Codegen.ofNullable(contactId);
            return this;
        }
        public Builder deferActivation(@Nullable Output<Boolean> deferActivation) {
            this.deferActivation = deferActivation;
            return this;
        }
        public Builder deferActivation(@Nullable Boolean deferActivation) {
            this.deferActivation = Codegen.ofNullable(deferActivation);
            return this;
        }        public ContactChannelArgs build() {
            return new ContactChannelArgs(channelAddress, channelName, channelType, contactId, deferActivation);
        }
    }
}
