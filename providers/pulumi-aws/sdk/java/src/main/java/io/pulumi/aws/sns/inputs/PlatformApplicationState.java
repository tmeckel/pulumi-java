// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlatformApplicationState extends io.pulumi.resources.ResourceArgs {

    public static final PlatformApplicationState Empty = new PlatformApplicationState();

    /**
     * The ARN of the SNS platform application
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * SNS Topic triggered when a delivery to any of the platform endpoints associated with your platform application encounters a permanent failure.
     * 
     */
    @Import(name="eventDeliveryFailureTopicArn")
      private final @Nullable Output<String> eventDeliveryFailureTopicArn;

    public Output<String> getEventDeliveryFailureTopicArn() {
        return this.eventDeliveryFailureTopicArn == null ? Codegen.empty() : this.eventDeliveryFailureTopicArn;
    }

    /**
     * SNS Topic triggered when a new platform endpoint is added to your platform application.
     * 
     */
    @Import(name="eventEndpointCreatedTopicArn")
      private final @Nullable Output<String> eventEndpointCreatedTopicArn;

    public Output<String> getEventEndpointCreatedTopicArn() {
        return this.eventEndpointCreatedTopicArn == null ? Codegen.empty() : this.eventEndpointCreatedTopicArn;
    }

    /**
     * SNS Topic triggered when an existing platform endpoint is deleted from your platform application.
     * 
     */
    @Import(name="eventEndpointDeletedTopicArn")
      private final @Nullable Output<String> eventEndpointDeletedTopicArn;

    public Output<String> getEventEndpointDeletedTopicArn() {
        return this.eventEndpointDeletedTopicArn == null ? Codegen.empty() : this.eventEndpointDeletedTopicArn;
    }

    /**
     * SNS Topic triggered when an existing platform endpoint is changed from your platform application.
     * 
     */
    @Import(name="eventEndpointUpdatedTopicArn")
      private final @Nullable Output<String> eventEndpointUpdatedTopicArn;

    public Output<String> getEventEndpointUpdatedTopicArn() {
        return this.eventEndpointUpdatedTopicArn == null ? Codegen.empty() : this.eventEndpointUpdatedTopicArn;
    }

    /**
     * The IAM role permitted to receive failure feedback for this application.
     * 
     */
    @Import(name="failureFeedbackRoleArn")
      private final @Nullable Output<String> failureFeedbackRoleArn;

    public Output<String> getFailureFeedbackRoleArn() {
        return this.failureFeedbackRoleArn == null ? Codegen.empty() : this.failureFeedbackRoleArn;
    }

    /**
     * The friendly name for the SNS platform application
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The platform that the app is registered with. See [Platform](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for supported platforms.
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<String> platform;

    public Output<String> getPlatform() {
        return this.platform == null ? Codegen.empty() : this.platform;
    }

    /**
     * Application Platform credential. See [Credential](http://docs.aws.amazon.com/sns/latest/dg/mobile-push-send-register.html) for type of credential required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    @Import(name="platformCredential")
      private final @Nullable Output<String> platformCredential;

    public Output<String> getPlatformCredential() {
        return this.platformCredential == null ? Codegen.empty() : this.platformCredential;
    }

    /**
     * Application Platform principal. See [Principal](http://docs.aws.amazon.com/sns/latest/api/API_CreatePlatformApplication.html) for type of principal required for platform. The value of this attribute when stored into the state is only a hash of the real value, so therefore it is not practical to use this as an attribute for other resources.
     * 
     */
    @Import(name="platformPrincipal")
      private final @Nullable Output<String> platformPrincipal;

    public Output<String> getPlatformPrincipal() {
        return this.platformPrincipal == null ? Codegen.empty() : this.platformPrincipal;
    }

    /**
     * The IAM role permitted to receive success feedback for this application.
     * 
     */
    @Import(name="successFeedbackRoleArn")
      private final @Nullable Output<String> successFeedbackRoleArn;

    public Output<String> getSuccessFeedbackRoleArn() {
        return this.successFeedbackRoleArn == null ? Codegen.empty() : this.successFeedbackRoleArn;
    }

    /**
     * The percentage of success to sample (0-100)
     * 
     */
    @Import(name="successFeedbackSampleRate")
      private final @Nullable Output<String> successFeedbackSampleRate;

    public Output<String> getSuccessFeedbackSampleRate() {
        return this.successFeedbackSampleRate == null ? Codegen.empty() : this.successFeedbackSampleRate;
    }

    public PlatformApplicationState(
        @Nullable Output<String> arn,
        @Nullable Output<String> eventDeliveryFailureTopicArn,
        @Nullable Output<String> eventEndpointCreatedTopicArn,
        @Nullable Output<String> eventEndpointDeletedTopicArn,
        @Nullable Output<String> eventEndpointUpdatedTopicArn,
        @Nullable Output<String> failureFeedbackRoleArn,
        @Nullable Output<String> name,
        @Nullable Output<String> platform,
        @Nullable Output<String> platformCredential,
        @Nullable Output<String> platformPrincipal,
        @Nullable Output<String> successFeedbackRoleArn,
        @Nullable Output<String> successFeedbackSampleRate) {
        this.arn = arn;
        this.eventDeliveryFailureTopicArn = eventDeliveryFailureTopicArn;
        this.eventEndpointCreatedTopicArn = eventEndpointCreatedTopicArn;
        this.eventEndpointDeletedTopicArn = eventEndpointDeletedTopicArn;
        this.eventEndpointUpdatedTopicArn = eventEndpointUpdatedTopicArn;
        this.failureFeedbackRoleArn = failureFeedbackRoleArn;
        this.name = name;
        this.platform = platform;
        this.platformCredential = platformCredential;
        this.platformPrincipal = platformPrincipal;
        this.successFeedbackRoleArn = successFeedbackRoleArn;
        this.successFeedbackSampleRate = successFeedbackSampleRate;
    }

    private PlatformApplicationState() {
        this.arn = Codegen.empty();
        this.eventDeliveryFailureTopicArn = Codegen.empty();
        this.eventEndpointCreatedTopicArn = Codegen.empty();
        this.eventEndpointDeletedTopicArn = Codegen.empty();
        this.eventEndpointUpdatedTopicArn = Codegen.empty();
        this.failureFeedbackRoleArn = Codegen.empty();
        this.name = Codegen.empty();
        this.platform = Codegen.empty();
        this.platformCredential = Codegen.empty();
        this.platformPrincipal = Codegen.empty();
        this.successFeedbackRoleArn = Codegen.empty();
        this.successFeedbackSampleRate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlatformApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> eventDeliveryFailureTopicArn;
        private @Nullable Output<String> eventEndpointCreatedTopicArn;
        private @Nullable Output<String> eventEndpointDeletedTopicArn;
        private @Nullable Output<String> eventEndpointUpdatedTopicArn;
        private @Nullable Output<String> failureFeedbackRoleArn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> platform;
        private @Nullable Output<String> platformCredential;
        private @Nullable Output<String> platformPrincipal;
        private @Nullable Output<String> successFeedbackRoleArn;
        private @Nullable Output<String> successFeedbackSampleRate;

        public Builder() {
    	      // Empty
        }

        public Builder(PlatformApplicationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.eventDeliveryFailureTopicArn = defaults.eventDeliveryFailureTopicArn;
    	      this.eventEndpointCreatedTopicArn = defaults.eventEndpointCreatedTopicArn;
    	      this.eventEndpointDeletedTopicArn = defaults.eventEndpointDeletedTopicArn;
    	      this.eventEndpointUpdatedTopicArn = defaults.eventEndpointUpdatedTopicArn;
    	      this.failureFeedbackRoleArn = defaults.failureFeedbackRoleArn;
    	      this.name = defaults.name;
    	      this.platform = defaults.platform;
    	      this.platformCredential = defaults.platformCredential;
    	      this.platformPrincipal = defaults.platformPrincipal;
    	      this.successFeedbackRoleArn = defaults.successFeedbackRoleArn;
    	      this.successFeedbackSampleRate = defaults.successFeedbackSampleRate;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder eventDeliveryFailureTopicArn(@Nullable Output<String> eventDeliveryFailureTopicArn) {
            this.eventDeliveryFailureTopicArn = eventDeliveryFailureTopicArn;
            return this;
        }
        public Builder eventDeliveryFailureTopicArn(@Nullable String eventDeliveryFailureTopicArn) {
            this.eventDeliveryFailureTopicArn = Codegen.ofNullable(eventDeliveryFailureTopicArn);
            return this;
        }
        public Builder eventEndpointCreatedTopicArn(@Nullable Output<String> eventEndpointCreatedTopicArn) {
            this.eventEndpointCreatedTopicArn = eventEndpointCreatedTopicArn;
            return this;
        }
        public Builder eventEndpointCreatedTopicArn(@Nullable String eventEndpointCreatedTopicArn) {
            this.eventEndpointCreatedTopicArn = Codegen.ofNullable(eventEndpointCreatedTopicArn);
            return this;
        }
        public Builder eventEndpointDeletedTopicArn(@Nullable Output<String> eventEndpointDeletedTopicArn) {
            this.eventEndpointDeletedTopicArn = eventEndpointDeletedTopicArn;
            return this;
        }
        public Builder eventEndpointDeletedTopicArn(@Nullable String eventEndpointDeletedTopicArn) {
            this.eventEndpointDeletedTopicArn = Codegen.ofNullable(eventEndpointDeletedTopicArn);
            return this;
        }
        public Builder eventEndpointUpdatedTopicArn(@Nullable Output<String> eventEndpointUpdatedTopicArn) {
            this.eventEndpointUpdatedTopicArn = eventEndpointUpdatedTopicArn;
            return this;
        }
        public Builder eventEndpointUpdatedTopicArn(@Nullable String eventEndpointUpdatedTopicArn) {
            this.eventEndpointUpdatedTopicArn = Codegen.ofNullable(eventEndpointUpdatedTopicArn);
            return this;
        }
        public Builder failureFeedbackRoleArn(@Nullable Output<String> failureFeedbackRoleArn) {
            this.failureFeedbackRoleArn = failureFeedbackRoleArn;
            return this;
        }
        public Builder failureFeedbackRoleArn(@Nullable String failureFeedbackRoleArn) {
            this.failureFeedbackRoleArn = Codegen.ofNullable(failureFeedbackRoleArn);
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
        public Builder platform(@Nullable Output<String> platform) {
            this.platform = platform;
            return this;
        }
        public Builder platform(@Nullable String platform) {
            this.platform = Codegen.ofNullable(platform);
            return this;
        }
        public Builder platformCredential(@Nullable Output<String> platformCredential) {
            this.platformCredential = platformCredential;
            return this;
        }
        public Builder platformCredential(@Nullable String platformCredential) {
            this.platformCredential = Codegen.ofNullable(platformCredential);
            return this;
        }
        public Builder platformPrincipal(@Nullable Output<String> platformPrincipal) {
            this.platformPrincipal = platformPrincipal;
            return this;
        }
        public Builder platformPrincipal(@Nullable String platformPrincipal) {
            this.platformPrincipal = Codegen.ofNullable(platformPrincipal);
            return this;
        }
        public Builder successFeedbackRoleArn(@Nullable Output<String> successFeedbackRoleArn) {
            this.successFeedbackRoleArn = successFeedbackRoleArn;
            return this;
        }
        public Builder successFeedbackRoleArn(@Nullable String successFeedbackRoleArn) {
            this.successFeedbackRoleArn = Codegen.ofNullable(successFeedbackRoleArn);
            return this;
        }
        public Builder successFeedbackSampleRate(@Nullable Output<String> successFeedbackSampleRate) {
            this.successFeedbackSampleRate = successFeedbackSampleRate;
            return this;
        }
        public Builder successFeedbackSampleRate(@Nullable String successFeedbackSampleRate) {
            this.successFeedbackSampleRate = Codegen.ofNullable(successFeedbackSampleRate);
            return this;
        }        public PlatformApplicationState build() {
            return new PlatformApplicationState(arn, eventDeliveryFailureTopicArn, eventEndpointCreatedTopicArn, eventEndpointDeletedTopicArn, eventEndpointUpdatedTopicArn, failureFeedbackRoleArn, name, platform, platformCredential, platformPrincipal, successFeedbackRoleArn, successFeedbackSampleRate);
        }
    }
}
