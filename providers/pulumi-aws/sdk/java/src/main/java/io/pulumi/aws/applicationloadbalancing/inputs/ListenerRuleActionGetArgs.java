// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionAuthenticateCognitoGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionAuthenticateOidcGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionFixedResponseGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionForwardGetArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerRuleActionRedirectGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionGetArgs Empty = new ListenerRuleActionGetArgs();

    /**
     * Information for creating an authenticate action using Cognito. Required if `type` is `authenticate-cognito`.
     * 
     */
    @InputImport(name="authenticateCognito")
      private final @Nullable Input<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito;

    public Input<ListenerRuleActionAuthenticateCognitoGetArgs> getAuthenticateCognito() {
        return this.authenticateCognito == null ? Input.empty() : this.authenticateCognito;
    }

    /**
     * Information for creating an authenticate action using OIDC. Required if `type` is `authenticate-oidc`.
     * 
     */
    @InputImport(name="authenticateOidc")
      private final @Nullable Input<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc;

    public Input<ListenerRuleActionAuthenticateOidcGetArgs> getAuthenticateOidc() {
        return this.authenticateOidc == null ? Input.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @InputImport(name="fixedResponse")
      private final @Nullable Input<ListenerRuleActionFixedResponseGetArgs> fixedResponse;

    public Input<ListenerRuleActionFixedResponseGetArgs> getFixedResponse() {
        return this.fixedResponse == null ? Input.empty() : this.fixedResponse;
    }

    /**
     * Information for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`.
     * 
     */
    @InputImport(name="forward")
      private final @Nullable Input<ListenerRuleActionForwardGetArgs> forward;

    public Input<ListenerRuleActionForwardGetArgs> getForward() {
        return this.forward == null ? Input.empty() : this.forward;
    }

    @InputImport(name="order")
      private final @Nullable Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    /**
     * Information for creating a redirect action. Required if `type` is `redirect`.
     * 
     */
    @InputImport(name="redirect")
      private final @Nullable Input<ListenerRuleActionRedirectGetArgs> redirect;

    public Input<ListenerRuleActionRedirectGetArgs> getRedirect() {
        return this.redirect == null ? Input.empty() : this.redirect;
    }

    /**
     * The ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @InputImport(name="targetGroupArn")
      private final @Nullable Input<String> targetGroupArn;

    public Input<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Input.empty() : this.targetGroupArn;
    }

    /**
     * The type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ListenerRuleActionGetArgs(
        @Nullable Input<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito,
        @Nullable Input<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc,
        @Nullable Input<ListenerRuleActionFixedResponseGetArgs> fixedResponse,
        @Nullable Input<ListenerRuleActionForwardGetArgs> forward,
        @Nullable Input<Integer> order,
        @Nullable Input<ListenerRuleActionRedirectGetArgs> redirect,
        @Nullable Input<String> targetGroupArn,
        Input<String> type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerRuleActionGetArgs() {
        this.authenticateCognito = Input.empty();
        this.authenticateOidc = Input.empty();
        this.fixedResponse = Input.empty();
        this.forward = Input.empty();
        this.order = Input.empty();
        this.redirect = Input.empty();
        this.targetGroupArn = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito;
        private @Nullable Input<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc;
        private @Nullable Input<ListenerRuleActionFixedResponseGetArgs> fixedResponse;
        private @Nullable Input<ListenerRuleActionForwardGetArgs> forward;
        private @Nullable Input<Integer> order;
        private @Nullable Input<ListenerRuleActionRedirectGetArgs> redirect;
        private @Nullable Input<String> targetGroupArn;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognito(@Nullable Input<ListenerRuleActionAuthenticateCognitoGetArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder authenticateCognito(@Nullable ListenerRuleActionAuthenticateCognitoGetArgs authenticateCognito) {
            this.authenticateCognito = Input.ofNullable(authenticateCognito);
            return this;
        }

        public Builder authenticateOidc(@Nullable Input<ListenerRuleActionAuthenticateOidcGetArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder authenticateOidc(@Nullable ListenerRuleActionAuthenticateOidcGetArgs authenticateOidc) {
            this.authenticateOidc = Input.ofNullable(authenticateOidc);
            return this;
        }

        public Builder fixedResponse(@Nullable Input<ListenerRuleActionFixedResponseGetArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }

        public Builder fixedResponse(@Nullable ListenerRuleActionFixedResponseGetArgs fixedResponse) {
            this.fixedResponse = Input.ofNullable(fixedResponse);
            return this;
        }

        public Builder forward(@Nullable Input<ListenerRuleActionForwardGetArgs> forward) {
            this.forward = forward;
            return this;
        }

        public Builder forward(@Nullable ListenerRuleActionForwardGetArgs forward) {
            this.forward = Input.ofNullable(forward);
            return this;
        }

        public Builder order(@Nullable Input<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = Input.ofNullable(order);
            return this;
        }

        public Builder redirect(@Nullable Input<ListenerRuleActionRedirectGetArgs> redirect) {
            this.redirect = redirect;
            return this;
        }

        public Builder redirect(@Nullable ListenerRuleActionRedirectGetArgs redirect) {
            this.redirect = Input.ofNullable(redirect);
            return this;
        }

        public Builder targetGroupArn(@Nullable Input<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Input.ofNullable(targetGroupArn);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ListenerRuleActionGetArgs build() {
            return new ListenerRuleActionGetArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
