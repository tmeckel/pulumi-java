// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EmailChannelState extends io.pulumi.resources.ResourceArgs {

    public static final EmailChannelState Empty = new EmailChannelState();

    /**
     * The application ID.
     * 
     */
    @Import(name="applicationId")
      private final @Nullable Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId == null ? Codegen.empty() : this.applicationId;
    }

    /**
     * The ARN of the Amazon SES configuration set that you want to apply to messages that you send through the channel.
     * 
     */
    @Import(name="configurationSet")
      private final @Nullable Output<String> configurationSet;

    public Output<String> getConfigurationSet() {
        return this.configurationSet == null ? Codegen.empty() : this.configurationSet;
    }

    /**
     * Whether the channel is enabled or disabled. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The email address used to send emails from. You can use email only (`user@example.com`) or friendly address (`User <user@example.com>`). This field comply with [RFC 5322](https://www.ietf.org/rfc/rfc5322.txt).
     * 
     */
    @Import(name="fromAddress")
      private final @Nullable Output<String> fromAddress;

    public Output<String> getFromAddress() {
        return this.fromAddress == null ? Codegen.empty() : this.fromAddress;
    }

    /**
     * The ARN of an identity verified with SES.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<String> identity;

    public Output<String> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Messages per second that can be sent.
     * 
     */
    @Import(name="messagesPerSecond")
      private final @Nullable Output<Integer> messagesPerSecond;

    public Output<Integer> getMessagesPerSecond() {
        return this.messagesPerSecond == null ? Codegen.empty() : this.messagesPerSecond;
    }

    /**
     * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    public EmailChannelState(
        @Nullable Output<String> applicationId,
        @Nullable Output<String> configurationSet,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> fromAddress,
        @Nullable Output<String> identity,
        @Nullable Output<Integer> messagesPerSecond,
        @Nullable Output<String> roleArn) {
        this.applicationId = applicationId;
        this.configurationSet = configurationSet;
        this.enabled = enabled;
        this.fromAddress = fromAddress;
        this.identity = identity;
        this.messagesPerSecond = messagesPerSecond;
        this.roleArn = roleArn;
    }

    private EmailChannelState() {
        this.applicationId = Codegen.empty();
        this.configurationSet = Codegen.empty();
        this.enabled = Codegen.empty();
        this.fromAddress = Codegen.empty();
        this.identity = Codegen.empty();
        this.messagesPerSecond = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationId;
        private @Nullable Output<String> configurationSet;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> fromAddress;
        private @Nullable Output<String> identity;
        private @Nullable Output<Integer> messagesPerSecond;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.configurationSet = defaults.configurationSet;
    	      this.enabled = defaults.enabled;
    	      this.fromAddress = defaults.fromAddress;
    	      this.identity = defaults.identity;
    	      this.messagesPerSecond = defaults.messagesPerSecond;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder applicationId(@Nullable Output<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Builder applicationId(@Nullable String applicationId) {
            this.applicationId = Codegen.ofNullable(applicationId);
            return this;
        }
        public Builder configurationSet(@Nullable Output<String> configurationSet) {
            this.configurationSet = configurationSet;
            return this;
        }
        public Builder configurationSet(@Nullable String configurationSet) {
            this.configurationSet = Codegen.ofNullable(configurationSet);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder fromAddress(@Nullable Output<String> fromAddress) {
            this.fromAddress = fromAddress;
            return this;
        }
        public Builder fromAddress(@Nullable String fromAddress) {
            this.fromAddress = Codegen.ofNullable(fromAddress);
            return this;
        }
        public Builder identity(@Nullable Output<String> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable String identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder messagesPerSecond(@Nullable Output<Integer> messagesPerSecond) {
            this.messagesPerSecond = messagesPerSecond;
            return this;
        }
        public Builder messagesPerSecond(@Nullable Integer messagesPerSecond) {
            this.messagesPerSecond = Codegen.ofNullable(messagesPerSecond);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }        public EmailChannelState build() {
            return new EmailChannelState(applicationId, configurationSet, enabled, fromAddress, identity, messagesPerSecond, roleArn);
        }
    }
}
