// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserPoolSmsConfiguration {
    /**
     * External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
     * 
     */
    private final String externalId;
    /**
     * ARN of the Amazon SNS caller. This is usually the IAM role that you've given Cognito permission to assume.
     * 
     */
    private final String snsCallerArn;

    @OutputCustomType.Constructor
    private UserPoolSmsConfiguration(
        @OutputCustomType.Parameter("externalId") String externalId,
        @OutputCustomType.Parameter("snsCallerArn") String snsCallerArn) {
        this.externalId = externalId;
        this.snsCallerArn = snsCallerArn;
    }

    /**
     * External ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
     * 
    */
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * ARN of the Amazon SNS caller. This is usually the IAM role that you've given Cognito permission to assume.
     * 
    */
    public String getSnsCallerArn() {
        return this.snsCallerArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolSmsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalId;
        private String snsCallerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolSmsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.snsCallerArn = defaults.snsCallerArn;
        }

        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }

        public Builder snsCallerArn(String snsCallerArn) {
            this.snsCallerArn = Objects.requireNonNull(snsCallerArn);
            return this;
        }
        public UserPoolSmsConfiguration build() {
            return new UserPoolSmsConfiguration(externalId, snsCallerArn);
        }
    }
}
