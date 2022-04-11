// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionState extends io.pulumi.resources.ResourceArgs {

    public static final PermissionState Empty = new PermissionState();

    /**
     * The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
     * 
     */
    @Import(name="eventSourceToken")
      private final @Nullable Output<String> eventSourceToken;

    public Output<String> getEventSourceToken() {
        return this.eventSourceToken == null ? Codegen.empty() : this.eventSourceToken;
    }

    /**
     * Name of the Lambda function whose resource policy you are updating
     * 
     */
    @Import(name="function")
      private final @Nullable Output<String> function;

    public Output<String> getFunction() {
        return this.function == null ? Codegen.empty() : this.function;
    }

    /**
     * The principal who is getting this permissionE.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
     * 
     */
    @Import(name="principal")
      private final @Nullable Output<String> principal;

    public Output<String> getPrincipal() {
        return this.principal == null ? Codegen.empty() : this.principal;
    }

    /**
     * Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARNE.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
     * 
     */
    @Import(name="qualifier")
      private final @Nullable Output<String> qualifier;

    public Output<String> getQualifier() {
        return this.qualifier == null ? Codegen.empty() : this.qualifier;
    }

    /**
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
     * 
     */
    @Import(name="sourceAccount")
      private final @Nullable Output<String> sourceAccount;

    public Output<String> getSourceAccount() {
        return this.sourceAccount == null ? Codegen.empty() : this.sourceAccount;
    }

    /**
     * When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
     * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
     * For S3, this should be the ARN of the S3 Bucket.
     * For EventBridge events, this should be the ARN of the EventBridge Rule.
     * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
     * 
     */
    @Import(name="sourceArn")
      private final @Nullable Output<String> sourceArn;

    public Output<String> getSourceArn() {
        return this.sourceArn == null ? Codegen.empty() : this.sourceArn;
    }

    /**
     * A unique statement identifier. By default generated by this provider.
     * 
     */
    @Import(name="statementId")
      private final @Nullable Output<String> statementId;

    public Output<String> getStatementId() {
        return this.statementId == null ? Codegen.empty() : this.statementId;
    }

    /**
     * A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @Import(name="statementIdPrefix")
      private final @Nullable Output<String> statementIdPrefix;

    public Output<String> getStatementIdPrefix() {
        return this.statementIdPrefix == null ? Codegen.empty() : this.statementIdPrefix;
    }

    public PermissionState(
        @Nullable Output<String> action,
        @Nullable Output<String> eventSourceToken,
        @Nullable Output<String> function,
        @Nullable Output<String> principal,
        @Nullable Output<String> qualifier,
        @Nullable Output<String> sourceAccount,
        @Nullable Output<String> sourceArn,
        @Nullable Output<String> statementId,
        @Nullable Output<String> statementIdPrefix) {
        this.action = action;
        this.eventSourceToken = eventSourceToken;
        this.function = function;
        this.principal = principal;
        this.qualifier = qualifier;
        this.sourceAccount = sourceAccount;
        this.sourceArn = sourceArn;
        this.statementId = statementId;
        this.statementIdPrefix = statementIdPrefix;
    }

    private PermissionState() {
        this.action = Codegen.empty();
        this.eventSourceToken = Codegen.empty();
        this.function = Codegen.empty();
        this.principal = Codegen.empty();
        this.qualifier = Codegen.empty();
        this.sourceAccount = Codegen.empty();
        this.sourceArn = Codegen.empty();
        this.statementId = Codegen.empty();
        this.statementIdPrefix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> eventSourceToken;
        private @Nullable Output<String> function;
        private @Nullable Output<String> principal;
        private @Nullable Output<String> qualifier;
        private @Nullable Output<String> sourceAccount;
        private @Nullable Output<String> sourceArn;
        private @Nullable Output<String> statementId;
        private @Nullable Output<String> statementIdPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.eventSourceToken = defaults.eventSourceToken;
    	      this.function = defaults.function;
    	      this.principal = defaults.principal;
    	      this.qualifier = defaults.qualifier;
    	      this.sourceAccount = defaults.sourceAccount;
    	      this.sourceArn = defaults.sourceArn;
    	      this.statementId = defaults.statementId;
    	      this.statementIdPrefix = defaults.statementIdPrefix;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder eventSourceToken(@Nullable Output<String> eventSourceToken) {
            this.eventSourceToken = eventSourceToken;
            return this;
        }
        public Builder eventSourceToken(@Nullable String eventSourceToken) {
            this.eventSourceToken = Codegen.ofNullable(eventSourceToken);
            return this;
        }
        public Builder function(@Nullable Output<String> function) {
            this.function = function;
            return this;
        }
        public Builder principal(@Nullable Output<String> principal) {
            this.principal = principal;
            return this;
        }
        public Builder principal(@Nullable String principal) {
            this.principal = Codegen.ofNullable(principal);
            return this;
        }
        public Builder qualifier(@Nullable Output<String> qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public Builder qualifier(@Nullable String qualifier) {
            this.qualifier = Codegen.ofNullable(qualifier);
            return this;
        }
        public Builder sourceAccount(@Nullable Output<String> sourceAccount) {
            this.sourceAccount = sourceAccount;
            return this;
        }
        public Builder sourceAccount(@Nullable String sourceAccount) {
            this.sourceAccount = Codegen.ofNullable(sourceAccount);
            return this;
        }
        public Builder sourceArn(@Nullable Output<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public Builder sourceArn(@Nullable String sourceArn) {
            this.sourceArn = Codegen.ofNullable(sourceArn);
            return this;
        }
        public Builder statementId(@Nullable Output<String> statementId) {
            this.statementId = statementId;
            return this;
        }
        public Builder statementId(@Nullable String statementId) {
            this.statementId = Codegen.ofNullable(statementId);
            return this;
        }
        public Builder statementIdPrefix(@Nullable Output<String> statementIdPrefix) {
            this.statementIdPrefix = statementIdPrefix;
            return this;
        }
        public Builder statementIdPrefix(@Nullable String statementIdPrefix) {
            this.statementIdPrefix = Codegen.ofNullable(statementIdPrefix);
            return this;
        }        public PermissionState build() {
            return new PermissionState(action, eventSourceToken, function, principal, qualifier, sourceAccount, sourceArn, statementId, statementIdPrefix);
        }
    }
}
