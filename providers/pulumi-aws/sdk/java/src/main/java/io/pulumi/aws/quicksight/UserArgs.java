// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @InputImport(name="awsAccountId")
      private final @Nullable Input<String> awsAccountId;

    public Input<String> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    /**
     * The email address of the user that you want to register.
     * 
     */
    @InputImport(name="email", required=true)
      private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
     * 
     */
    @InputImport(name="iamArn")
      private final @Nullable Input<String> iamArn;

    public Input<String> getIamArn() {
        return this.iamArn == null ? Input.empty() : this.iamArn;
    }

    /**
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`. If `IAM` is specified, the `iam_arn` must also be specified.
     * 
     */
    @InputImport(name="identityType", required=true)
      private final Input<String> identityType;

    public Input<String> getIdentityType() {
        return this.identityType;
    }

    /**
     * The namespace. Currently, you should set this to `default`.
     * 
     */
    @InputImport(name="namespace")
      private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    /**
     * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards. Only valid for registering users using an assumed IAM role. Additionally, if registering multiple users using the same IAM role, each user needs to have a unique session name.
     * 
     */
    @InputImport(name="sessionName")
      private final @Nullable Input<String> sessionName;

    public Input<String> getSessionName() {
        return this.sessionName == null ? Input.empty() : this.sessionName;
    }

    /**
     * The Amazon QuickSight user name that you want to create for the user you are registering. Only valid for registering a user with `identity_type` set to `QUICKSIGHT`.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    /**
     * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
     * 
     */
    @InputImport(name="userRole", required=true)
      private final Input<String> userRole;

    public Input<String> getUserRole() {
        return this.userRole;
    }

    public UserArgs(
        @Nullable Input<String> awsAccountId,
        Input<String> email,
        @Nullable Input<String> iamArn,
        Input<String> identityType,
        @Nullable Input<String> namespace,
        @Nullable Input<String> sessionName,
        @Nullable Input<String> userName,
        Input<String> userRole) {
        this.awsAccountId = awsAccountId;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.iamArn = iamArn;
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.namespace = namespace;
        this.sessionName = sessionName;
        this.userName = userName;
        this.userRole = Objects.requireNonNull(userRole, "expected parameter 'userRole' to be non-null");
    }

    private UserArgs() {
        this.awsAccountId = Input.empty();
        this.email = Input.empty();
        this.iamArn = Input.empty();
        this.identityType = Input.empty();
        this.namespace = Input.empty();
        this.sessionName = Input.empty();
        this.userName = Input.empty();
        this.userRole = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> awsAccountId;
        private Input<String> email;
        private @Nullable Input<String> iamArn;
        private Input<String> identityType;
        private @Nullable Input<String> namespace;
        private @Nullable Input<String> sessionName;
        private @Nullable Input<String> userName;
        private Input<String> userRole;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.email = defaults.email;
    	      this.iamArn = defaults.iamArn;
    	      this.identityType = defaults.identityType;
    	      this.namespace = defaults.namespace;
    	      this.sessionName = defaults.sessionName;
    	      this.userName = defaults.userName;
    	      this.userRole = defaults.userRole;
        }

        public Builder awsAccountId(@Nullable Input<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder email(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder email(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder iamArn(@Nullable Input<String> iamArn) {
            this.iamArn = iamArn;
            return this;
        }

        public Builder iamArn(@Nullable String iamArn) {
            this.iamArn = Input.ofNullable(iamArn);
            return this;
        }

        public Builder identityType(Input<String> identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }

        public Builder identityType(String identityType) {
            this.identityType = Input.of(Objects.requireNonNull(identityType));
            return this;
        }

        public Builder namespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder namespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder sessionName(@Nullable Input<String> sessionName) {
            this.sessionName = sessionName;
            return this;
        }

        public Builder sessionName(@Nullable String sessionName) {
            this.sessionName = Input.ofNullable(sessionName);
            return this;
        }

        public Builder userName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public Builder userRole(Input<String> userRole) {
            this.userRole = Objects.requireNonNull(userRole);
            return this;
        }

        public Builder userRole(String userRole) {
            this.userRole = Input.of(Objects.requireNonNull(userRole));
            return this;
        }
        public UserArgs build() {
            return new UserArgs(awsAccountId, email, iamArn, identityType, namespace, sessionName, userName, userRole);
        }
    }
}
