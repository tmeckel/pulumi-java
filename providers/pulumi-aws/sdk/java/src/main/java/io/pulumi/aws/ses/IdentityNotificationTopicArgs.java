// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityNotificationTopicArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityNotificationTopicArgs Empty = new IdentityNotificationTopicArgs();

    /**
     * The identity for which the Amazon SNS topic will be set. You can specify an identity by using its name or by using its Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="identity", required=true)
      private final Input<String> identity;

    public Input<String> getIdentity() {
        return this.identity;
    }

    /**
     * Whether SES should include original email headers in SNS notifications of this type. *false* by default.
     * 
     */
    @InputImport(name="includeOriginalHeaders")
      private final @Nullable Input<Boolean> includeOriginalHeaders;

    public Input<Boolean> getIncludeOriginalHeaders() {
        return this.includeOriginalHeaders == null ? Input.empty() : this.includeOriginalHeaders;
    }

    /**
     * The type of notifications that will be published to the specified Amazon SNS topic. Valid Values: *Bounce*, *Complaint* or *Delivery*.
     * 
     */
    @InputImport(name="notificationType", required=true)
      private final Input<String> notificationType;

    public Input<String> getNotificationType() {
        return this.notificationType;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic. Can be set to "" (an empty string) to disable publishing.
     * 
     */
    @InputImport(name="topicArn")
      private final @Nullable Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn == null ? Input.empty() : this.topicArn;
    }

    public IdentityNotificationTopicArgs(
        Input<String> identity,
        @Nullable Input<Boolean> includeOriginalHeaders,
        Input<String> notificationType,
        @Nullable Input<String> topicArn) {
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.includeOriginalHeaders = includeOriginalHeaders;
        this.notificationType = Objects.requireNonNull(notificationType, "expected parameter 'notificationType' to be non-null");
        this.topicArn = topicArn;
    }

    private IdentityNotificationTopicArgs() {
        this.identity = Input.empty();
        this.includeOriginalHeaders = Input.empty();
        this.notificationType = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityNotificationTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> identity;
        private @Nullable Input<Boolean> includeOriginalHeaders;
        private Input<String> notificationType;
        private @Nullable Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityNotificationTopicArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.includeOriginalHeaders = defaults.includeOriginalHeaders;
    	      this.notificationType = defaults.notificationType;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder identity(Input<String> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder identity(String identity) {
            this.identity = Input.of(Objects.requireNonNull(identity));
            return this;
        }

        public Builder includeOriginalHeaders(@Nullable Input<Boolean> includeOriginalHeaders) {
            this.includeOriginalHeaders = includeOriginalHeaders;
            return this;
        }

        public Builder includeOriginalHeaders(@Nullable Boolean includeOriginalHeaders) {
            this.includeOriginalHeaders = Input.ofNullable(includeOriginalHeaders);
            return this;
        }

        public Builder notificationType(Input<String> notificationType) {
            this.notificationType = Objects.requireNonNull(notificationType);
            return this;
        }

        public Builder notificationType(String notificationType) {
            this.notificationType = Input.of(Objects.requireNonNull(notificationType));
            return this;
        }

        public Builder topicArn(@Nullable Input<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = Input.ofNullable(topicArn);
            return this;
        }
        public IdentityNotificationTopicArgs build() {
            return new IdentityNotificationTopicArgs(identity, includeOriginalHeaders, notificationType, topicArn);
        }
    }
}
