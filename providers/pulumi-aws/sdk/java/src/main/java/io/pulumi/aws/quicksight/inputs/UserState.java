// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserState extends io.pulumi.resources.ResourceArgs {

    public static final UserState Empty = new UserState();

    /**
     * Amazon Resource Name (ARN) of the user
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @Import(name="awsAccountId")
      private final @Nullable Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId == null ? Codegen.empty() : this.awsAccountId;
    }

    /**
     * The email address of the user that you want to register.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
     * 
     */
    @Import(name="iamArn")
      private final @Nullable Output<String> iamArn;

    public Output<String> getIamArn() {
        return this.iamArn == null ? Codegen.empty() : this.iamArn;
    }

    /**
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`. If `IAM` is specified, the `iam_arn` must also be specified.
     * 
     */
    @Import(name="identityType")
      private final @Nullable Output<String> identityType;

    public Output<String> getIdentityType() {
        return this.identityType == null ? Codegen.empty() : this.identityType;
    }

    /**
     * The namespace. Currently, you should set this to `default`.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    /**
     * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards. Only valid for registering users using an assumed IAM role. Additionally, if registering multiple users using the same IAM role, each user needs to have a unique session name.
     * 
     */
    @Import(name="sessionName")
      private final @Nullable Output<String> sessionName;

    public Output<String> getSessionName() {
        return this.sessionName == null ? Codegen.empty() : this.sessionName;
    }

    /**
     * The Amazon QuickSight user name that you want to create for the user you are registering. Only valid for registering a user with `identity_type` set to `QUICKSIGHT`.
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    /**
     * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
     * 
     */
    @Import(name="userRole")
      private final @Nullable Output<String> userRole;

    public Output<String> getUserRole() {
        return this.userRole == null ? Codegen.empty() : this.userRole;
    }

    public UserState(
        @Nullable Output<String> arn,
        @Nullable Output<String> awsAccountId,
        @Nullable Output<String> email,
        @Nullable Output<String> iamArn,
        @Nullable Output<String> identityType,
        @Nullable Output<String> namespace,
        @Nullable Output<String> sessionName,
        @Nullable Output<String> userName,
        @Nullable Output<String> userRole) {
        this.arn = arn;
        this.awsAccountId = awsAccountId;
        this.email = email;
        this.iamArn = iamArn;
        this.identityType = identityType;
        this.namespace = namespace;
        this.sessionName = sessionName;
        this.userName = userName;
        this.userRole = userRole;
    }

    private UserState() {
        this.arn = Codegen.empty();
        this.awsAccountId = Codegen.empty();
        this.email = Codegen.empty();
        this.iamArn = Codegen.empty();
        this.identityType = Codegen.empty();
        this.namespace = Codegen.empty();
        this.sessionName = Codegen.empty();
        this.userName = Codegen.empty();
        this.userRole = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> awsAccountId;
        private @Nullable Output<String> email;
        private @Nullable Output<String> iamArn;
        private @Nullable Output<String> identityType;
        private @Nullable Output<String> namespace;
        private @Nullable Output<String> sessionName;
        private @Nullable Output<String> userName;
        private @Nullable Output<String> userRole;

        public Builder() {
    	      // Empty
        }

        public Builder(UserState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.email = defaults.email;
    	      this.iamArn = defaults.iamArn;
    	      this.identityType = defaults.identityType;
    	      this.namespace = defaults.namespace;
    	      this.sessionName = defaults.sessionName;
    	      this.userName = defaults.userName;
    	      this.userRole = defaults.userRole;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Codegen.ofNullable(awsAccountId);
            return this;
        }
        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder iamArn(@Nullable Output<String> iamArn) {
            this.iamArn = iamArn;
            return this;
        }
        public Builder iamArn(@Nullable String iamArn) {
            this.iamArn = Codegen.ofNullable(iamArn);
            return this;
        }
        public Builder identityType(@Nullable Output<String> identityType) {
            this.identityType = identityType;
            return this;
        }
        public Builder identityType(@Nullable String identityType) {
            this.identityType = Codegen.ofNullable(identityType);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder sessionName(@Nullable Output<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public Builder sessionName(@Nullable String sessionName) {
            this.sessionName = Codegen.ofNullable(sessionName);
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }
        public Builder userRole(@Nullable Output<String> userRole) {
            this.userRole = userRole;
            return this;
        }
        public Builder userRole(@Nullable String userRole) {
            this.userRole = Codegen.ofNullable(userRole);
            return this;
        }        public UserState build() {
            return new UserState(arn, awsAccountId, email, iamArn, identityType, namespace, sessionName, userName, userRole);
        }
    }
}
