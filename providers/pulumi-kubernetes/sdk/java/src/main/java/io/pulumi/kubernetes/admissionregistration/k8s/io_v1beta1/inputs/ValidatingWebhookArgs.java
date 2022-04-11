// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.inputs.RuleWithOperationsArgs;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.inputs.WebhookClientConfigArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ValidatingWebhook describes an admission webhook and the resources and operations it applies to.
 * 
 */
public final class ValidatingWebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidatingWebhookArgs Empty = new ValidatingWebhookArgs();

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects. API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to `['v1beta1']`.
     * 
     */
    @Import(name="admissionReviewVersions")
      private final @Nullable Output<List<String>> admissionReviewVersions;

    public Output<List<String>> getAdmissionReviewVersions() {
        return this.admissionReviewVersions == null ? Codegen.empty() : this.admissionReviewVersions;
    }

    /**
     * ClientConfig defines how to communicate with the hook. Required
     * 
     */
    @Import(name="clientConfig", required=true)
      private final Output<WebhookClientConfigArgs> clientConfig;

    public Output<WebhookClientConfigArgs> getClientConfig() {
        return this.clientConfig;
    }

    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail. Defaults to Ignore.
     * 
     */
    @Import(name="failurePolicy")
      private final @Nullable Output<String> failurePolicy;

    public Output<String> getFailurePolicy() {
        return this.failurePolicy == null ? Codegen.empty() : this.failurePolicy;
    }

    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * 
     * - Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.
     * 
     * - Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included `apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]`, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.
     * 
     * Defaults to "Exact"
     * 
     */
    @Import(name="matchPolicy")
      private final @Nullable Output<String> matchPolicy;

    public Output<String> getMatchPolicy() {
        return this.matchPolicy == null ? Codegen.empty() : this.matchPolicy;
    }

    /**
     * The name of the admission webhook. Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector. If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
     * 
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "runlevel",
     *       "operator": "NotIn",
     *       "values": [
     *         "0",
     *         "1"
     *       ]
     *     }
     *   ]
     * }
     * 
     * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     *   "matchExpressions": [
     *     {
     *       "key": "environment",
     *       "operator": "In",
     *       "values": [
     *         "prod",
     *         "staging"
     *       ]
     *     }
     *   ]
     * }
     * 
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels for more examples of label selectors.
     * 
     * Default to the empty LabelSelector, which matches everything.
     * 
     */
    @Import(name="namespaceSelector")
      private final @Nullable Output<LabelSelectorArgs> namespaceSelector;

    public Output<LabelSelectorArgs> getNamespaceSelector() {
        return this.namespaceSelector == null ? Codegen.empty() : this.namespaceSelector;
    }

    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels. objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * 
     */
    @Import(name="objectSelector")
      private final @Nullable Output<LabelSelectorArgs> objectSelector;

    public Output<LabelSelectorArgs> getObjectSelector() {
        return this.objectSelector == null ? Codegen.empty() : this.objectSelector;
    }

    /**
     * Rules describes what operations on what resources/subresources the webhook cares about. The webhook cares about an operation if it matches _any_ Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RuleWithOperationsArgs>> rules;

    public Output<List<RuleWithOperationsArgs>> getRules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * SideEffects states whether this webhook has side effects. Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * 
     */
    @Import(name="sideEffects")
      private final @Nullable Output<String> sideEffects;

    public Output<String> getSideEffects() {
        return this.sideEffects == null ? Codegen.empty() : this.sideEffects;
    }

    /**
     * TimeoutSeconds specifies the timeout for this webhook. After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * 
     */
    @Import(name="timeoutSeconds")
      private final @Nullable Output<Integer> timeoutSeconds;

    public Output<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Codegen.empty() : this.timeoutSeconds;
    }

    public ValidatingWebhookArgs(
        @Nullable Output<List<String>> admissionReviewVersions,
        Output<WebhookClientConfigArgs> clientConfig,
        @Nullable Output<String> failurePolicy,
        @Nullable Output<String> matchPolicy,
        Output<String> name,
        @Nullable Output<LabelSelectorArgs> namespaceSelector,
        @Nullable Output<LabelSelectorArgs> objectSelector,
        @Nullable Output<List<RuleWithOperationsArgs>> rules,
        @Nullable Output<String> sideEffects,
        @Nullable Output<Integer> timeoutSeconds) {
        this.admissionReviewVersions = admissionReviewVersions;
        this.clientConfig = Objects.requireNonNull(clientConfig, "expected parameter 'clientConfig' to be non-null");
        this.failurePolicy = failurePolicy;
        this.matchPolicy = matchPolicy;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespaceSelector = namespaceSelector;
        this.objectSelector = objectSelector;
        this.rules = rules;
        this.sideEffects = sideEffects;
        this.timeoutSeconds = timeoutSeconds;
    }

    private ValidatingWebhookArgs() {
        this.admissionReviewVersions = Codegen.empty();
        this.clientConfig = Codegen.empty();
        this.failurePolicy = Codegen.empty();
        this.matchPolicy = Codegen.empty();
        this.name = Codegen.empty();
        this.namespaceSelector = Codegen.empty();
        this.objectSelector = Codegen.empty();
        this.rules = Codegen.empty();
        this.sideEffects = Codegen.empty();
        this.timeoutSeconds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidatingWebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> admissionReviewVersions;
        private Output<WebhookClientConfigArgs> clientConfig;
        private @Nullable Output<String> failurePolicy;
        private @Nullable Output<String> matchPolicy;
        private Output<String> name;
        private @Nullable Output<LabelSelectorArgs> namespaceSelector;
        private @Nullable Output<LabelSelectorArgs> objectSelector;
        private @Nullable Output<List<RuleWithOperationsArgs>> rules;
        private @Nullable Output<String> sideEffects;
        private @Nullable Output<Integer> timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidatingWebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionReviewVersions = defaults.admissionReviewVersions;
    	      this.clientConfig = defaults.clientConfig;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.matchPolicy = defaults.matchPolicy;
    	      this.name = defaults.name;
    	      this.namespaceSelector = defaults.namespaceSelector;
    	      this.objectSelector = defaults.objectSelector;
    	      this.rules = defaults.rules;
    	      this.sideEffects = defaults.sideEffects;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder admissionReviewVersions(@Nullable Output<List<String>> admissionReviewVersions) {
            this.admissionReviewVersions = admissionReviewVersions;
            return this;
        }
        public Builder admissionReviewVersions(@Nullable List<String> admissionReviewVersions) {
            this.admissionReviewVersions = Codegen.ofNullable(admissionReviewVersions);
            return this;
        }
        public Builder admissionReviewVersions(String... admissionReviewVersions) {
            return admissionReviewVersions(List.of(admissionReviewVersions));
        }
        public Builder clientConfig(Output<WebhookClientConfigArgs> clientConfig) {
            this.clientConfig = Objects.requireNonNull(clientConfig);
            return this;
        }
        public Builder clientConfig(WebhookClientConfigArgs clientConfig) {
            this.clientConfig = Output.of(Objects.requireNonNull(clientConfig));
            return this;
        }
        public Builder failurePolicy(@Nullable Output<String> failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }
        public Builder failurePolicy(@Nullable String failurePolicy) {
            this.failurePolicy = Codegen.ofNullable(failurePolicy);
            return this;
        }
        public Builder matchPolicy(@Nullable Output<String> matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }
        public Builder matchPolicy(@Nullable String matchPolicy) {
            this.matchPolicy = Codegen.ofNullable(matchPolicy);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespaceSelector(@Nullable Output<LabelSelectorArgs> namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }
        public Builder namespaceSelector(@Nullable LabelSelectorArgs namespaceSelector) {
            this.namespaceSelector = Codegen.ofNullable(namespaceSelector);
            return this;
        }
        public Builder objectSelector(@Nullable Output<LabelSelectorArgs> objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }
        public Builder objectSelector(@Nullable LabelSelectorArgs objectSelector) {
            this.objectSelector = Codegen.ofNullable(objectSelector);
            return this;
        }
        public Builder rules(@Nullable Output<List<RuleWithOperationsArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<RuleWithOperationsArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(RuleWithOperationsArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder sideEffects(@Nullable Output<String> sideEffects) {
            this.sideEffects = sideEffects;
            return this;
        }
        public Builder sideEffects(@Nullable String sideEffects) {
            this.sideEffects = Codegen.ofNullable(sideEffects);
            return this;
        }
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = Codegen.ofNullable(timeoutSeconds);
            return this;
        }        public ValidatingWebhookArgs build() {
            return new ValidatingWebhookArgs(admissionReviewVersions, clientConfig, failurePolicy, matchPolicy, name, namespaceSelector, objectSelector, rules, sideEffects, timeoutSeconds);
        }
    }
}
