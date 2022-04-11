// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolAdminCreateUserConfigInviteMessageTemplateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolAdminCreateUserConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAdminCreateUserConfigArgs Empty = new UserPoolAdminCreateUserConfigArgs();

    /**
     * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
     * 
     */
    @Import(name="allowAdminCreateUserOnly")
      private final @Nullable Output<Boolean> allowAdminCreateUserOnly;

    public Output<Boolean> getAllowAdminCreateUserOnly() {
        return this.allowAdminCreateUserOnly == null ? Codegen.empty() : this.allowAdminCreateUserOnly;
    }

    /**
     * Invite message template structure. Detailed below.
     * 
     */
    @Import(name="inviteMessageTemplate")
      private final @Nullable Output<UserPoolAdminCreateUserConfigInviteMessageTemplateArgs> inviteMessageTemplate;

    public Output<UserPoolAdminCreateUserConfigInviteMessageTemplateArgs> getInviteMessageTemplate() {
        return this.inviteMessageTemplate == null ? Codegen.empty() : this.inviteMessageTemplate;
    }

    public UserPoolAdminCreateUserConfigArgs(
        @Nullable Output<Boolean> allowAdminCreateUserOnly,
        @Nullable Output<UserPoolAdminCreateUserConfigInviteMessageTemplateArgs> inviteMessageTemplate) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    private UserPoolAdminCreateUserConfigArgs() {
        this.allowAdminCreateUserOnly = Codegen.empty();
        this.inviteMessageTemplate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAdminCreateUserConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowAdminCreateUserOnly;
        private @Nullable Output<UserPoolAdminCreateUserConfigInviteMessageTemplateArgs> inviteMessageTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAdminCreateUserConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAdminCreateUserOnly = defaults.allowAdminCreateUserOnly;
    	      this.inviteMessageTemplate = defaults.inviteMessageTemplate;
        }

        public Builder allowAdminCreateUserOnly(@Nullable Output<Boolean> allowAdminCreateUserOnly) {
            this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
            return this;
        }
        public Builder allowAdminCreateUserOnly(@Nullable Boolean allowAdminCreateUserOnly) {
            this.allowAdminCreateUserOnly = Codegen.ofNullable(allowAdminCreateUserOnly);
            return this;
        }
        public Builder inviteMessageTemplate(@Nullable Output<UserPoolAdminCreateUserConfigInviteMessageTemplateArgs> inviteMessageTemplate) {
            this.inviteMessageTemplate = inviteMessageTemplate;
            return this;
        }
        public Builder inviteMessageTemplate(@Nullable UserPoolAdminCreateUserConfigInviteMessageTemplateArgs inviteMessageTemplate) {
            this.inviteMessageTemplate = Codegen.ofNullable(inviteMessageTemplate);
            return this;
        }        public UserPoolAdminCreateUserConfigArgs build() {
            return new UserPoolAdminCreateUserConfigArgs(allowAdminCreateUserOnly, inviteMessageTemplate);
        }
    }
}
