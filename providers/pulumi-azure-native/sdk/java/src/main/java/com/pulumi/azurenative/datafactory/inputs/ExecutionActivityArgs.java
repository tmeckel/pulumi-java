// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for all execution activities.
 * 
 */
public final class ExecutionActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecutionActivityArgs Empty = new ExecutionActivityArgs();

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    /**
     * @return Activity depends on condition.
     * 
     */
    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Activity description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    /**
     * @return Linked service reference.
     * 
     */
    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Activity name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    /**
     * @return Activity policy.
     * 
     */
    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Type of activity.
     * Expected value is &#39;Execution&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of activity.
     * Expected value is &#39;Execution&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    /**
     * @return Activity user properties.
     * 
     */
    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private ExecutionActivityArgs() {}

    private ExecutionActivityArgs(ExecutionActivityArgs $) {
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.policy = $.policy;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecutionActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecutionActivityArgs $;

        public Builder() {
            $ = new ExecutionActivityArgs();
        }

        public Builder(ExecutionActivityArgs defaults) {
            $ = new ExecutionActivityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        /**
         * @param dependsOn Activity depends on condition.
         * 
         * @return builder
         * 
         */
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Activity description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName Linked service reference.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Activity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy Activity policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;Execution&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of activity.
         * Expected value is &#39;Execution&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        /**
         * @param userProperties Activity user properties.
         * 
         * @return builder
         * 
         */
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public ExecutionActivityArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
