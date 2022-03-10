// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.inputs;

import io.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateCognitoArgs;
import io.pulumi.aws.lb.inputs.ListenerDefaultActionAuthenticateOidcArgs;
import io.pulumi.aws.lb.inputs.ListenerDefaultActionFixedResponseArgs;
import io.pulumi.aws.lb.inputs.ListenerDefaultActionForwardArgs;
import io.pulumi.aws.lb.inputs.ListenerDefaultActionRedirectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionArgs Empty = new ListenerDefaultActionArgs();

    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    @InputImport(name="authenticateCognito")
      private final @Nullable Input<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito;

    public Input<ListenerDefaultActionAuthenticateCognitoArgs> getAuthenticateCognito() {
        return this.authenticateCognito == null ? Input.empty() : this.authenticateCognito;
    }

    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    @InputImport(name="authenticateOidc")
      private final @Nullable Input<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc;

    public Input<ListenerDefaultActionAuthenticateOidcArgs> getAuthenticateOidc() {
        return this.authenticateOidc == null ? Input.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @InputImport(name="fixedResponse")
      private final @Nullable Input<ListenerDefaultActionFixedResponseArgs> fixedResponse;

    public Input<ListenerDefaultActionFixedResponseArgs> getFixedResponse() {
        return this.fixedResponse == null ? Input.empty() : this.fixedResponse;
    }

    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    @InputImport(name="forward")
      private final @Nullable Input<ListenerDefaultActionForwardArgs> forward;

    public Input<ListenerDefaultActionForwardArgs> getForward() {
        return this.forward == null ? Input.empty() : this.forward;
    }

    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    @InputImport(name="order")
      private final @Nullable Input<Integer> order;

    public Input<Integer> getOrder() {
        return this.order == null ? Input.empty() : this.order;
    }

    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    @InputImport(name="redirect")
      private final @Nullable Input<ListenerDefaultActionRedirectArgs> redirect;

    public Input<ListenerDefaultActionRedirectArgs> getRedirect() {
        return this.redirect == null ? Input.empty() : this.redirect;
    }

    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @InputImport(name="targetGroupArn")
      private final @Nullable Input<String> targetGroupArn;

    public Input<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Input.empty() : this.targetGroupArn;
    }

    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ListenerDefaultActionArgs(
        @Nullable Input<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito,
        @Nullable Input<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc,
        @Nullable Input<ListenerDefaultActionFixedResponseArgs> fixedResponse,
        @Nullable Input<ListenerDefaultActionForwardArgs> forward,
        @Nullable Input<Integer> order,
        @Nullable Input<ListenerDefaultActionRedirectArgs> redirect,
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

    private ListenerDefaultActionArgs() {
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

    public static Builder builder(ListenerDefaultActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito;
        private @Nullable Input<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc;
        private @Nullable Input<ListenerDefaultActionFixedResponseArgs> fixedResponse;
        private @Nullable Input<ListenerDefaultActionForwardArgs> forward;
        private @Nullable Input<Integer> order;
        private @Nullable Input<ListenerDefaultActionRedirectArgs> redirect;
        private @Nullable Input<String> targetGroupArn;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionArgs defaults) {
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

        public Builder authenticateCognito(@Nullable Input<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder authenticateCognito(@Nullable ListenerDefaultActionAuthenticateCognitoArgs authenticateCognito) {
            this.authenticateCognito = Input.ofNullable(authenticateCognito);
            return this;
        }

        public Builder authenticateOidc(@Nullable Input<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder authenticateOidc(@Nullable ListenerDefaultActionAuthenticateOidcArgs authenticateOidc) {
            this.authenticateOidc = Input.ofNullable(authenticateOidc);
            return this;
        }

        public Builder fixedResponse(@Nullable Input<ListenerDefaultActionFixedResponseArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }

        public Builder fixedResponse(@Nullable ListenerDefaultActionFixedResponseArgs fixedResponse) {
            this.fixedResponse = Input.ofNullable(fixedResponse);
            return this;
        }

        public Builder forward(@Nullable Input<ListenerDefaultActionForwardArgs> forward) {
            this.forward = forward;
            return this;
        }

        public Builder forward(@Nullable ListenerDefaultActionForwardArgs forward) {
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

        public Builder redirect(@Nullable Input<ListenerDefaultActionRedirectArgs> redirect) {
            this.redirect = redirect;
            return this;
        }

        public Builder redirect(@Nullable ListenerDefaultActionRedirectArgs redirect) {
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
        public ListenerDefaultActionArgs build() {
            return new ListenerDefaultActionArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
