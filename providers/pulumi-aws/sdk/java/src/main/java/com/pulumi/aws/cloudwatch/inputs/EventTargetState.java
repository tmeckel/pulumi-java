// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.aws.cloudwatch.inputs.EventTargetBatchTargetGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetDeadLetterConfigGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetEcsTargetGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetHttpTargetGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetInputTransformerGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetKinesisTargetGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetRedshiftTargetGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetRetryPolicyGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetRunCommandTargetGetArgs;
import com.pulumi.aws.cloudwatch.inputs.EventTargetSqsTargetGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventTargetState extends com.pulumi.resources.ResourceArgs {

    public static final EventTargetState Empty = new EventTargetState();

    /**
     * - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return - ARN of the SQS queue specified as the target for the dead-letter queue.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="batchTarget")
    private @Nullable Output<EventTargetBatchTargetGetArgs> batchTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetBatchTargetGetArgs>> batchTarget() {
        return Optional.ofNullable(this.batchTarget);
    }

    /**
     * Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="deadLetterConfig")
    private @Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig;

    /**
     * @return Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetDeadLetterConfigGetArgs>> deadLetterConfig() {
        return Optional.ofNullable(this.deadLetterConfig);
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="ecsTarget")
    private @Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget;

    /**
     * @return Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetEcsTargetGetArgs>> ecsTarget() {
        return Optional.ofNullable(this.ecsTarget);
    }

    /**
     * The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    @Import(name="eventBusName")
    private @Nullable Output<String> eventBusName;

    /**
     * @return The event bus to associate with the rule. If you omit this, the `default` event bus is used.
     * 
     */
    public Optional<Output<String>> eventBusName() {
        return Optional.ofNullable(this.eventBusName);
    }

    /**
     * Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    @Import(name="httpTarget")
    private @Nullable Output<EventTargetHttpTargetGetArgs> httpTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
     * 
     */
    public Optional<Output<EventTargetHttpTargetGetArgs>> httpTarget() {
        return Optional.ofNullable(this.httpTarget);
    }

    /**
     * Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    @Import(name="input")
    private @Nullable Output<String> input;

    /**
     * @return Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
     * 
     */
    public Optional<Output<String>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    @Import(name="inputPath")
    private @Nullable Output<String> inputPath;

    /**
     * @return The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
     * 
     */
    public Optional<Output<String>> inputPath() {
        return Optional.ofNullable(this.inputPath);
    }

    /**
     * Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    @Import(name="inputTransformer")
    private @Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer;

    /**
     * @return Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
     * 
     */
    public Optional<Output<EventTargetInputTransformerGetArgs>> inputTransformer() {
        return Optional.ofNullable(this.inputTransformer);
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="kinesisTarget")
    private @Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetKinesisTargetGetArgs>> kinesisTarget() {
        return Optional.ofNullable(this.kinesisTarget);
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="redshiftTarget")
    private @Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetRedshiftTargetGetArgs>> redshiftTarget() {
        return Optional.ofNullable(this.redshiftTarget);
    }

    /**
     * Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy;

    /**
     * @return Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetRetryPolicyGetArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * The name of the rule you want to add targets to.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<String> rule;

    /**
     * @return The name of the rule you want to add targets to.
     * 
     */
    public Optional<Output<String>> rule() {
        return Optional.ofNullable(this.rule);
    }

    /**
     * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    @Import(name="runCommandTargets")
    private @Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets;

    /**
     * @return Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
     * 
     */
    public Optional<Output<List<EventTargetRunCommandTargetGetArgs>>> runCommandTargets() {
        return Optional.ofNullable(this.runCommandTargets);
    }

    /**
     * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    @Import(name="sqsTarget")
    private @Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget;

    /**
     * @return Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
     * 
     */
    public Optional<Output<EventTargetSqsTargetGetArgs>> sqsTarget() {
        return Optional.ofNullable(this.sqsTarget);
    }

    /**
     * The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    @Import(name="targetId")
    private @Nullable Output<String> targetId;

    /**
     * @return The unique target assignment ID.  If missing, will generate a random, unique id.
     * 
     */
    public Optional<Output<String>> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    private EventTargetState() {}

    private EventTargetState(EventTargetState $) {
        this.arn = $.arn;
        this.batchTarget = $.batchTarget;
        this.deadLetterConfig = $.deadLetterConfig;
        this.ecsTarget = $.ecsTarget;
        this.eventBusName = $.eventBusName;
        this.httpTarget = $.httpTarget;
        this.input = $.input;
        this.inputPath = $.inputPath;
        this.inputTransformer = $.inputTransformer;
        this.kinesisTarget = $.kinesisTarget;
        this.redshiftTarget = $.redshiftTarget;
        this.retryPolicy = $.retryPolicy;
        this.roleArn = $.roleArn;
        this.rule = $.rule;
        this.runCommandTargets = $.runCommandTargets;
        this.sqsTarget = $.sqsTarget;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventTargetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventTargetState $;

        public Builder() {
            $ = new EventTargetState();
        }

        public Builder(EventTargetState defaults) {
            $ = new EventTargetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn - ARN of the SQS queue specified as the target for the dead-letter queue.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn - ARN of the SQS queue specified as the target for the dead-letter queue.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param batchTarget Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder batchTarget(@Nullable Output<EventTargetBatchTargetGetArgs> batchTarget) {
            $.batchTarget = batchTarget;
            return this;
        }

        /**
         * @param batchTarget Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder batchTarget(EventTargetBatchTargetGetArgs batchTarget) {
            return batchTarget(Output.of(batchTarget));
        }

        /**
         * @param deadLetterConfig Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterConfig(@Nullable Output<EventTargetDeadLetterConfigGetArgs> deadLetterConfig) {
            $.deadLetterConfig = deadLetterConfig;
            return this;
        }

        /**
         * @param deadLetterConfig Parameters used when you are providing a dead letter config. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterConfig(EventTargetDeadLetterConfigGetArgs deadLetterConfig) {
            return deadLetterConfig(Output.of(deadLetterConfig));
        }

        /**
         * @param ecsTarget Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder ecsTarget(@Nullable Output<EventTargetEcsTargetGetArgs> ecsTarget) {
            $.ecsTarget = ecsTarget;
            return this;
        }

        /**
         * @param ecsTarget Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder ecsTarget(EventTargetEcsTargetGetArgs ecsTarget) {
            return ecsTarget(Output.of(ecsTarget));
        }

        /**
         * @param eventBusName The event bus to associate with the rule. If you omit this, the `default` event bus is used.
         * 
         * @return builder
         * 
         */
        public Builder eventBusName(@Nullable Output<String> eventBusName) {
            $.eventBusName = eventBusName;
            return this;
        }

        /**
         * @param eventBusName The event bus to associate with the rule. If you omit this, the `default` event bus is used.
         * 
         * @return builder
         * 
         */
        public Builder eventBusName(String eventBusName) {
            return eventBusName(Output.of(eventBusName));
        }

        /**
         * @param httpTarget Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
         * 
         * @return builder
         * 
         */
        public Builder httpTarget(@Nullable Output<EventTargetHttpTargetGetArgs> httpTarget) {
            $.httpTarget = httpTarget;
            return this;
        }

        /**
         * @param httpTarget Parameters used when you are using the rule to invoke an API Gateway REST endpoint. Documented below. A maximum of 1 is allowed.
         * 
         * @return builder
         * 
         */
        public Builder httpTarget(EventTargetHttpTargetGetArgs httpTarget) {
            return httpTarget(Output.of(httpTarget));
        }

        /**
         * @param input Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<String> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input Valid JSON text passed to the target. Conflicts with `input_path` and `input_transformer`.
         * 
         * @return builder
         * 
         */
        public Builder input(String input) {
            return input(Output.of(input));
        }

        /**
         * @param inputPath The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
         * 
         * @return builder
         * 
         */
        public Builder inputPath(@Nullable Output<String> inputPath) {
            $.inputPath = inputPath;
            return this;
        }

        /**
         * @param inputPath The value of the [JSONPath](http://goessner.net/articles/JsonPath/) that is used for extracting part of the matched event when passing it to the target. Conflicts with `input` and `input_transformer`.
         * 
         * @return builder
         * 
         */
        public Builder inputPath(String inputPath) {
            return inputPath(Output.of(inputPath));
        }

        /**
         * @param inputTransformer Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
         * 
         * @return builder
         * 
         */
        public Builder inputTransformer(@Nullable Output<EventTargetInputTransformerGetArgs> inputTransformer) {
            $.inputTransformer = inputTransformer;
            return this;
        }

        /**
         * @param inputTransformer Parameters used when you are providing a custom input to a target based on certain event data. Conflicts with `input` and `input_path`.
         * 
         * @return builder
         * 
         */
        public Builder inputTransformer(EventTargetInputTransformerGetArgs inputTransformer) {
            return inputTransformer(Output.of(inputTransformer));
        }

        /**
         * @param kinesisTarget Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder kinesisTarget(@Nullable Output<EventTargetKinesisTargetGetArgs> kinesisTarget) {
            $.kinesisTarget = kinesisTarget;
            return this;
        }

        /**
         * @param kinesisTarget Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder kinesisTarget(EventTargetKinesisTargetGetArgs kinesisTarget) {
            return kinesisTarget(Output.of(kinesisTarget));
        }

        /**
         * @param redshiftTarget Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder redshiftTarget(@Nullable Output<EventTargetRedshiftTargetGetArgs> redshiftTarget) {
            $.redshiftTarget = redshiftTarget;
            return this;
        }

        /**
         * @param redshiftTarget Parameters used when you are using the rule to invoke an Amazon Redshift Statement. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder redshiftTarget(EventTargetRedshiftTargetGetArgs redshiftTarget) {
            return redshiftTarget(Output.of(redshiftTarget));
        }

        /**
         * @param retryPolicy Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(@Nullable Output<EventTargetRetryPolicyGetArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param retryPolicy Parameters used when you are providing retry policies. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(EventTargetRetryPolicyGetArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used or target in `arn` is EC2 instance, Kinesis data stream, Step Functions state machine, or Event Bus in different account or region.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param rule The name of the rule you want to add targets to.
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule The name of the rule you want to add targets to.
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder runCommandTargets(@Nullable Output<List<EventTargetRunCommandTargetGetArgs>> runCommandTargets) {
            $.runCommandTargets = runCommandTargets;
            return this;
        }

        /**
         * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder runCommandTargets(List<EventTargetRunCommandTargetGetArgs> runCommandTargets) {
            return runCommandTargets(Output.of(runCommandTargets));
        }

        /**
         * @param runCommandTargets Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder runCommandTargets(EventTargetRunCommandTargetGetArgs... runCommandTargets) {
            return runCommandTargets(List.of(runCommandTargets));
        }

        /**
         * @param sqsTarget Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder sqsTarget(@Nullable Output<EventTargetSqsTargetGetArgs> sqsTarget) {
            $.sqsTarget = sqsTarget;
            return this;
        }

        /**
         * @param sqsTarget Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
         * 
         * @return builder
         * 
         */
        public Builder sqsTarget(EventTargetSqsTargetGetArgs sqsTarget) {
            return sqsTarget(Output.of(sqsTarget));
        }

        /**
         * @param targetId The unique target assignment ID.  If missing, will generate a random, unique id.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The unique target assignment ID.  If missing, will generate a random, unique id.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public EventTargetState build() {
            return $;
        }
    }

}
