// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb.outputs;

import io.pulumi.aws.lb.outputs.ListenerDefaultActionAuthenticateCognito;
import io.pulumi.aws.lb.outputs.ListenerDefaultActionAuthenticateOidc;
import io.pulumi.aws.lb.outputs.ListenerDefaultActionFixedResponse;
import io.pulumi.aws.lb.outputs.ListenerDefaultActionForward;
import io.pulumi.aws.lb.outputs.ListenerDefaultActionRedirect;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerDefaultAction {
    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    private final @Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito;
    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    private final @Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc;
    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    private final @Nullable ListenerDefaultActionFixedResponse fixedResponse;
    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    private final @Nullable ListenerDefaultActionForward forward;
    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    private final @Nullable Integer order;
    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    private final @Nullable ListenerDefaultActionRedirect redirect;
    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    private final @Nullable String targetGroupArn;
    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ListenerDefaultAction(
        @OutputCustomType.Parameter("authenticateCognito") @Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito,
        @OutputCustomType.Parameter("authenticateOidc") @Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc,
        @OutputCustomType.Parameter("fixedResponse") @Nullable ListenerDefaultActionFixedResponse fixedResponse,
        @OutputCustomType.Parameter("forward") @Nullable ListenerDefaultActionForward forward,
        @OutputCustomType.Parameter("order") @Nullable Integer order,
        @OutputCustomType.Parameter("redirect") @Nullable ListenerDefaultActionRedirect redirect,
        @OutputCustomType.Parameter("targetGroupArn") @Nullable String targetGroupArn,
        @OutputCustomType.Parameter("type") String type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = type;
    }

    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
    */
    public Optional<ListenerDefaultActionAuthenticateCognito> getAuthenticateCognito() {
        return Optional.ofNullable(this.authenticateCognito);
    }
    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
    */
    public Optional<ListenerDefaultActionAuthenticateOidc> getAuthenticateOidc() {
        return Optional.ofNullable(this.authenticateOidc);
    }
    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
    */
    public Optional<ListenerDefaultActionFixedResponse> getFixedResponse() {
        return Optional.ofNullable(this.fixedResponse);
    }
    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
    */
    public Optional<ListenerDefaultActionForward> getForward() {
        return Optional.ofNullable(this.forward);
    }
    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
    */
    public Optional<Integer> getOrder() {
        return Optional.ofNullable(this.order);
    }
    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
    */
    public Optional<ListenerDefaultActionRedirect> getRedirect() {
        return Optional.ofNullable(this.redirect);
    }
    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
    */
    public Optional<String> getTargetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito;
        private @Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc;
        private @Nullable ListenerDefaultActionFixedResponse fixedResponse;
        private @Nullable ListenerDefaultActionForward forward;
        private @Nullable Integer order;
        private @Nullable ListenerDefaultActionRedirect redirect;
        private @Nullable String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultAction defaults) {
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

        public Builder authenticateCognito(@Nullable ListenerDefaultActionAuthenticateCognito authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder authenticateOidc(@Nullable ListenerDefaultActionAuthenticateOidc authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder fixedResponse(@Nullable ListenerDefaultActionFixedResponse fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }

        public Builder forward(@Nullable ListenerDefaultActionForward forward) {
            this.forward = forward;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder redirect(@Nullable ListenerDefaultActionRedirect redirect) {
            this.redirect = redirect;
            return this;
        }

        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListenerDefaultAction build() {
            return new ListenerDefaultAction(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
